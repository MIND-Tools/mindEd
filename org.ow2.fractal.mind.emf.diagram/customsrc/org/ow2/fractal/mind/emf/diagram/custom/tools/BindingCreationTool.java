package org.ow2.fractal.mind.emf.diagram.custom.tools;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.requests.TargetRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindBodyEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindBodyCompartmentEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.Body;
import adl.InterfaceDefinition;
import adl.custom.util.CreationUtil;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.part.MindDiagramEditorPlugin;

public class BindingCreationTool extends UnspecifiedTypeConnectionTool {

	protected List bindingConnectionTypes;
	protected EditPart customTargetEditPart;
	
	protected InterfaceDefinition generatedSource = null;
	protected InterfaceDefinition generatedTarget = null;

	public BindingCreationTool(List connectionTypes) {
		super(connectionTypes);
		bindingConnectionTypes = connectionTypes;
	}
	
	protected TransactionalEditingDomain domain = null;
	
	protected TransactionalEditingDomain getEditingDomain() {
		if ((domain == null) && (customTargetEditPart instanceof GraphicalEditPart)) {
			domain = ((GraphicalEditPart)customTargetEditPart).getEditingDomain();
		}
		return domain;
	}
	
	
	protected void setTargetEditPart(EditPart editpart)
	{
	    if (editpart != this.customTargetEditPart) {
		    if (this.customTargetEditPart != null)
		    	 handleExitingEditPart();
		    
		    editpart = handleGenerateItfs(editpart);
		    
		    this.customTargetEditPart = editpart;
		    
		    if (getTargetRequest() instanceof TargetRequest)
		    	 ((TargetRequest)getTargetRequest()).setTargetEditPart(this.customTargetEditPart);
		    handleEnteredEditPart();
	    }
	}
	
	protected EditPart handleGenerateItfs(EditPart editpart) {

		if ((MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(editpart)
				instanceof MindBodyCompartmentEditPart)) {
			// Delegate to body
			editpart = editpart.getParent();
		}
		
		if (isDragging()) {
			// Button is down, generate target if there is none
			if ((generatedTarget == null) &&
					(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(editpart)
					instanceof MindBodyEditPart)) {
				// Create an interface to delegate the binding creation
				editpart = createTarget(editpart);
			}
		} else {
			// Button is up, generate source if there is none
			if ((generatedSource == null) &&
					(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(editpart)
					instanceof MindBodyEditPart)) {
				// Create an interface to delegate the binding creation
				editpart = createSource(editpart);
			}
		}
		return editpart;
	}
	
	/**
	 * create an InterfaceDefinitionEditPart on the given BodyEditPart,
	 * set it to be the source of the connection and returns it
	 * @param bodyEditPart
	 * @return
	 */
	protected InterfaceDefinitionEditPart createSource(EditPart bodyEditPart){
				
		if (!(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(bodyEditPart)
				instanceof MindBodyEditPart))
			return null;
		
		InterfaceDefinitionEditPart newPart = null;
		Body body = (Body)((View)bodyEditPart.getModel()).getElement();
		InterfaceDefinition newSource = createInterfaceDefinition(body,"generatedItf");

		bodyEditPart.refresh();
		
		// Find the newly created edit part
		GraphicalEditPart part = (GraphicalEditPart)bodyEditPart;
		if (newSource != null) {
			generatedSource = newSource;
			newPart = (InterfaceDefinitionEditPart) part.findEditPart(part.getParent(), newSource);
		}
		return newPart;
	}
	
	
	/**
	 * create an InterfaceDefinitionEditPart on the given BodyEditPart,
	 * set it to be the target of the connection and returns it
	 * @param bodyEditPart
	 * @return
	 */
	protected InterfaceDefinitionEditPart createTarget(EditPart bodyEditPart){
				
		if (!(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(bodyEditPart)
				instanceof MindBodyEditPart))
			return null;
		
		InterfaceDefinitionEditPart newPart = null;
		Body body = (Body)((View)bodyEditPart.getModel()).getElement();
		InterfaceDefinition newTarget = createInterfaceDefinition(body,"generatedItf");

		// Activate semantic refresh to let the canonical edit policy create the view and edit part
		bodyEditPart.refresh();
		
		// Find the newly created edit part
		GraphicalEditPart part = (GraphicalEditPart)bodyEditPart;
		if (newTarget != null) {
			generatedTarget = newTarget;
			newPart = (InterfaceDefinitionEditPart) part.findEditPart(part.getParent(), newTarget);
		}
		return newPart;
	}
	
	
	/**
	 * create and InterfaceDefinition in the given Body and returns it
	 * @param body
	 * @return
	 */
	protected InterfaceDefinition createInterfaceDefinition(Body body, String name) {
				
		InterfaceDefinition newInterface = null;
		try {
			TransactionImpl transaction = new TransactionImpl(getEditingDomain(), false);
			transaction.start();
			newInterface = CreationUtil.createInterface(body,null,name);
			transaction.commit();
		}
		catch(Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Error generating an interface to bind", e);
		}
			
		return newInterface;
	}
	
	/**
	 * delete the generated source
	 */
	protected void deleteSource() {
		deleteInterface(generatedSource);
		generatedSource = null;
	}
	
	
	/**
	 * delete the generated target
	 */
	protected void deleteTarget() {
		deleteInterface(generatedTarget);
		generatedTarget = null;
	}
	
	
	/**
	 * Delete the given itf from model
	 * @param itf the interface to be deleted
	 */
	protected void deleteInterface(InterfaceDefinition itf) {
		if (itf != null) {
			try {
				TransactionImpl transaction = new TransactionImpl(getEditingDomain(), false);
				transaction.start();
				itf.getParentBody().getElements().remove(itf);
				transaction.commit();
	    	}
	    	catch(Exception e) {
	    		MindDiagramEditorPlugin.getInstance().logError("Error deleting generated interface", e);
	    	}
		}
	}
	
	protected boolean handleExitingEditPart()
	{
		resetHover();
		eraseTargetFeedback();
		handleDeleteGeneratedItfs();
		return true;
	}
	
	protected void handleDeleteGeneratedItfs() {
		if (isDragging()) {
			// Button is down, delete target but not source
			deleteTarget();
		} else {
			// Button is up, delete source
			deleteSource();
		}
	}


	@Override
	protected EditPart getTargetEditPart() {
		return customTargetEditPart;
	}
	
	
	@Override
	protected void setConnectionSource(EditPart source) {
		if ((generatedSource != null) && (source instanceof InterfaceDefinitionEditPart)) {
			getCurrentViewer().deselectAll();
			getCurrentViewer().select(source);
			getCurrentViewer().setFocus(source);
			
			IFigure fig = ((InterfaceDefinitionEditPart)source).getFigure();
			Rectangle interfaceBounds = fig.getBounds().getCopy();
			fig.translateToAbsolute(interfaceBounds);
			
			getCurrentInput().setMouseLocation(interfaceBounds.x,interfaceBounds.y);
		}
		
		super.setConnectionSource(source);
	}
	
	
	protected boolean isDragging() {
		return (!(isInState(STATE_INITIAL) || isInState(STATE_TERMINAL)));
	}
	
}
