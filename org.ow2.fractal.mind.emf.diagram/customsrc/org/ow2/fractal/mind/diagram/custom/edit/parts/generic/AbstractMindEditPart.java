package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;
import adl.diagram.part.MindDiagramEditorPlugin;

public abstract class AbstractMindEditPart implements MindTypes {
	
	public static String EDIT_POLICY_PACKAGE = "org.ow2.fractal.mind.diagram.custom.edit.policies.";
	
	protected GraphicalEditPart realEditPart;
	protected int visualID;
	public int MIND_TYPE = TYPE_UNDEFINED;
	
	
	public static int getMindType(int visualID) {
		return MindGenericEditPartFactory.getMindType(visualID);
	}
	
	
	public static int getMindType(EditPart editPart) {
		MindEditPart mindEP = getMindEditPartFor(editPart);
		if (mindEP == null) return TYPE_UNDEFINED;
		return mindEP.MIND_TYPE;
	}
	
	
	public static MindEditPart getMindEditPartFor(EditPart editPart) {
		return MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(editPart);
	}
	
	
	public void createDefaultEditPolicies() {
		
		if (getCustomItemSemanticEditPolicy() != null)
			realEditPart.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
					getCustomItemSemanticEditPolicy());
		
		if (getCustomCanonicalEditPolicy() != null)
			realEditPart.installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
					getCustomCanonicalEditPolicy());
	}
	
	
	/**
	 * Fetch the custom CanonicalEditPolicy for this edit part
	 * @return a new instance of this edit policy or null if it does not exist
	 */
	protected CanonicalEditPolicy getCustomCanonicalEditPolicy() {
		String simpleName = 
			realEditPart.getClass().getSimpleName().replace("EditPart", "CanonicalEditPolicy");
		String packageName = EDIT_POLICY_PACKAGE;
		String editPolicyName = packageName.concat(simpleName);
		
		EditPolicy policy = getEditPolicyFromName(editPolicyName);
		CanonicalEditPolicy canonicalPolicy = null;
		try {
			canonicalPolicy = (CanonicalEditPolicy) policy;
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not a canonical edit policy", e);
			return null;
		}
		
		return canonicalPolicy;
	}
	
	
	/**
	 * Fetch the custom ItemSemanticEditPolicy for this edit part
	 * @return a new instance of this edit policy or null if it does not exist
	 */
	protected MindBaseItemSemanticEditPolicy getCustomItemSemanticEditPolicy() {
		String simpleName = 
			realEditPart.getClass().getSimpleName().replace("EditPart", "ItemSemanticEditPolicy");
		String editPolicyName = EDIT_POLICY_PACKAGE.concat(simpleName);
		
		EditPolicy policy = getEditPolicyFromName(editPolicyName);
		MindBaseItemSemanticEditPolicy semanticPolicy = null;
		try {
			semanticPolicy = (MindBaseItemSemanticEditPolicy) policy;
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not a canonical edit policy", e);
			return null;
		}
		
		return semanticPolicy;
	}
	
	
	/**
	 * Fetch the edit policy
	 * @param editPolicyName
	 * @return a new instance of the edit policy
	 */
	@SuppressWarnings("unchecked")
	protected EditPolicy getEditPolicyFromName (String editPolicyName) {
		Class<? extends EditPolicy> editPolicyClass = null;
		try {
			editPolicyClass = (Class<? extends EditPolicy>) Class.forName(editPolicyName);
			EditPolicy editPolicy = editPolicyClass.newInstance();
			return editPolicy;
			
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
			MindDiagramEditorPlugin.getInstance().logError("Edit policy instantiation error", e);
		} catch (IllegalAccessException e) {
			MindDiagramEditorPlugin.getInstance().logError("Illegal access instantiating edit policy", e);
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not an edit policy", e);
		}
				
		return null;
	}
	
	
	public abstract void activate();
	public abstract GraphicalEditPart getCompartment();
	public abstract LayoutManager getLayoutManager();
	public abstract IFigure setupContentPane(IFigure nodeShape);
	public abstract boolean addChildVisual(EditPart childEditPart, int index);
	public abstract boolean addFixedChild(EditPart childEditPart);
	public abstract DragTracker getDragTracker(Request request);
	public abstract Boolean refreshBounds();
	public abstract void setLayoutManager(IFigure figure);
	public abstract void refresh();
	public abstract LayoutEditPolicy createLayoutEditPolicy();
	public abstract NodeFigure createNodePlate();
	public abstract boolean setLayoutConstraint(EditPart child, IFigure childFigure,
			Object constraint);

}
