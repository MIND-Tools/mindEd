package org.ow2.fractal.mind.diagram.custom.edit.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.ow2.fractal.mind.diagram.custom.preferences.CustomGeneralPreferencePage;

import adl.custom.impl.AdlDefinitionCustomImpl;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.part.MindDiagramEditorPlugin;
import adl.diagram.part.MindDiagramUpdateCommand;
import adl.diagram.preferences.DiagramGeneralPreferencePage;

/**
 * Extends generated UpdateCommand to update every elements in the diagram
 * instead of only selected elements. This command refresh the merge too.<p>
 * Called by pressing F5 or programatically.
 * @author maroto
 *
 */
public class MindDiagramUpdateAllCommand extends MindDiagramUpdateCommand {
	
	/**
	 * This is the "depth level of display" property.<p>
	 * Beyond this depth level, figures will not be displayed.
	 */
	private int maxRank;
	
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() != 1) {
				return null;
			}
			if (structuredSelection.getFirstElement() instanceof EditPart
					&& ((EditPart) structuredSelection.getFirstElement())
							.getModel() instanceof View) {
				
				// rootEditPart is the AdlDefinitionEditPart
				EditPart rootEditPart = (EditPart) structuredSelection.getFirstElement();
				while (!(rootEditPart instanceof AdlDefinitionEditPart)) {
					rootEditPart = rootEditPart.getParent();
					if (rootEditPart == null) return null;
				}
				
				// Transaction to refresh the merge
				TransactionalEditingDomain domain = ((AdlDefinitionEditPart)rootEditPart).getEditingDomain();
				TransactionImpl transaction = new TransactionImpl(domain, false);
				try {
					transaction.start();
					EObject root = ((View)rootEditPart.getModel()).getElement();
					if (root != null && root instanceof AdlDefinitionCustomImpl)
						refreshMerge((AdlDefinitionCustomImpl)root);
					transaction.commit();
				}
				catch (Exception e){
					e.printStackTrace();
					MindDiagramEditorPlugin.getInstance().logError("Refresh of merge elements failed");
					transaction.rollback();
				}
				finally{}
				
				try {
					// Just refresh and then keep the same value for this update
					// Else it could become a bit messy
					refreshMaxRank();
					// Update all elements in the diagram by calling with te rootEditPart
					updateAll(rootEditPart, 0);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					// This will hide elements beyond maxRank
					for (EditPart editPart : getMarkedForHiding()) {
						hideElement(editPart);
					}
					hidingDone();
					
					// This will display elements which had been hidden in a previous update
					// And which are no longer beyond maxRank
					for (EditPart editPart : getMarkedForDisplay()) {
						displayElement(editPart);
					}
					displayDone();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		}
		return null;
	}
	
	/**
	 * Get the "depth level of display" property to refresh maxRank
	 */
	protected void refreshMaxRank() {
		// Get the preference stored
		IPreferenceStore store = MindDiagramEditorPlugin.getInstance().getPreferenceStore();
		maxRank = store.getInt(CustomGeneralPreferencePage.PREF_DISPLAY_DEPTH_LEVEL);
	}
	
	/**
	 * Meaned to be called with and AdlDefinitionEditPart and rank 0.
	 * This updates all elements in the diagram and hides the ones beyond maxRank.<p>
	 * Could be called with any EditPart, though maxRank should be disabled in this case
	 * @param rootEditPart
	 * @param rank
	 */
	@SuppressWarnings("unchecked")
	public void updateAll (EditPart rootEditPart, int rank){
		if (rootEditPart instanceof AbstractBorderedShapeEditPart)
			// Increase rank if a component is encountered
			rank++;
		if (rank > maxRank) {
			// If his rank is too high, the element will be hidden
			markForHiding(rootEditPart);			
		}
		else {
			// Else it will be displayed
			markForDisplay(rootEditPart);
		}
		// Update the element
		EObject rootElement = ((View) rootEditPart.getModel()).getElement();
		updateElement(rootElement);
		
		// Now update all children
		List<EditPart> children = rootEditPart.getChildren();
		for (EditPart child : children) {
			updateAll(child, rank);
		}
	}
	
	/**
	 * Calls the refresh() method of all CanonicalEditPolicy registered on this element
	 * @param modelElement
	 */
	@SuppressWarnings("unchecked")
	public void updateElement(EObject modelElement) {
		List editPolicies = CanonicalEditPolicy
			.getRegisteredEditPolicies(modelElement);
		for (Iterator it = editPolicies.iterator(); it.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it
					.next();
			nextEditPolicy.refresh();
		}
	}

	/**
	 * Redo the merge of the model elements
	 * @see AdlMergeUtil
	 * @param root
	 */
	public void refreshMerge(AdlDefinitionCustomImpl root) {
		if (root != null)
		{
			// Delete all merged elements
			root.getHelper().cleanMainDefinition();
			// Redo the merge
			root.getHelper().restoreMainDefinition();
		}
	}
	/**
	 * This list is used to store all elements that should be hidden but are set to visible.
	 */
	protected ArrayList<EditPart> markedForHiding = new ArrayList<EditPart>();
	
	/**
	 * This marks the element if it is not already hidden
	 * @param editPart
	 */
	public void markForHiding(EditPart editPart) {
		if (!(editPart instanceof GraphicalEditPart)) return;
		if (((GraphicalEditPart)editPart).getFigure() == null) return;
		if (!(((GraphicalEditPart)editPart).getFigure().isVisible())) return;
		markedForHiding.add(editPart);
	}
	
	public void hidingDone() {
		markedForHiding.clear();
	}
	
	public ArrayList<EditPart> getMarkedForHiding() {
		return markedForHiding;
	}
	
	/**
	 * This list is used to store all elements that should be displayed but are set to hidden.
	 */
	protected ArrayList<EditPart> markedForDisplay = new ArrayList<EditPart>();
	
	/**
	 * This marks the element if it is not already visible
	 * @param editPart
	 */
	public void markForDisplay(EditPart editPart) {
		if (!(editPart instanceof GraphicalEditPart)) return;
		if (((GraphicalEditPart)editPart).getFigure() == null) return;
		if (((GraphicalEditPart)editPart).getFigure().isVisible()) return;
		markedForDisplay.add(editPart);
	}
	
	public void displayDone() {
		markedForDisplay.clear();
	}
	
	public ArrayList<EditPart> getMarkedForDisplay() {
		return markedForDisplay;
	}
	
	/**
	 * Given EditPart will not be displayed in the diagram
	 * @param editPart
	 */
	public void hideElement(EditPart editPart) {
		// Do not display the element
		// Hide the figure
		GraphicalEditPart graphEP = (GraphicalEditPart) editPart;
		graphEP.getFigure().setVisible(false);
		// For components, primary shape must be hidden too
		// I did not find a better way to do this, but I hope to hide the view
		// instead of the figure
		if (graphEP instanceof CompositeComponentDefinitionEditPart)
			((CompositeComponentDefinitionEditPart)graphEP).getPrimaryShape().setVisible(false);
		if (graphEP instanceof CompositeAnonymousSubComponentEditPart)
			((CompositeAnonymousSubComponentEditPart)graphEP).getPrimaryShape().setVisible(false);
		if (graphEP instanceof CompositeSubComponentEditPart)
			((CompositeSubComponentEditPart)graphEP).getPrimaryShape().setVisible(false);
		
		// Hiding the view seems a better way but it causes trouble
		// The transaction sets "parent" attribute to null so it is never displayed again
		// I will try to debug this later on
//		TransactionImpl transaction = new TransactionImpl(graphEP.getEditingDomain(),false);
//		try {
//			transaction.start();
//			graphEP.getPrimaryView().setVisible(false);
//			transaction.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{}
	}
	
	/**
	 * Given EditPart will be displayed in the diagram
	 * @param editPart
	 */
	public void displayElement(EditPart editPart) {
		// Do not display the element
		GraphicalEditPart graphEP = (GraphicalEditPart) editPart;
		graphEP.getFigure().setVisible(true);
		if (graphEP instanceof CompositeComponentDefinitionEditPart)
			((CompositeComponentDefinitionEditPart)graphEP).getPrimaryShape().setVisible(true);
		if (graphEP instanceof CompositeAnonymousSubComponentEditPart)
			((CompositeAnonymousSubComponentEditPart)graphEP).getPrimaryShape().setVisible(true);
		if (graphEP instanceof CompositeSubComponentEditPart)
			((CompositeSubComponentEditPart)graphEP).getPrimaryShape().setVisible(true);
		
		// see hideElement(EditPart editPart)
//		TransactionImpl transaction = new TransactionImpl(graphEP.getEditingDomain(),false);
//		try {
//			transaction.start();
//			graphEP.getPrimaryView().setVisible(true);
//			transaction.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{}
	}
	
}
