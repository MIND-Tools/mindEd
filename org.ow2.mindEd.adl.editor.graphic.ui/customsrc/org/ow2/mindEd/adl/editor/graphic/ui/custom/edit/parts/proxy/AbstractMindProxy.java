package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

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

import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.MindBaseItemSemanticEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public abstract class AbstractMindProxy implements IMindTypes {
	
	public static String EDIT_POLICY_PACKAGE = "org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.";
	
	protected int creationMode = CREATION_MODE_NORMAL;
	protected boolean isMerged = false;
	
	protected GraphicalEditPart editPart;
	protected int visualID;
	public int mindType = TYPE_UNDEFINED;
	
	
	public static int getMindType(int visualID) {
		return MindProxyFactory.getMindType(visualID);
	}
	
	
	public static int getMindType(EditPart editPart) {
		MindProxy mindEP = getMindProxyFor(editPart);
		if (mindEP == null) return TYPE_UNDEFINED;
		return mindEP.mindType;
	}
	
	
	public static MindProxy getMindProxyFor(EditPart editPart) {
		return MindProxyFactory.INSTANCE.getMindProxyFor(editPart);
	}
	
	
	public int getMindType() {
		return mindType;
	}
	
	
	public GraphicalEditPart getEditPart() {
		return editPart;
	}
	
	
	public int getVisualID() {
		return visualID;
	}
	
	
	public void createDefaultEditPolicies() {
		
		if (getCustomItemSemanticEditPolicy() != null)
			editPart.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
					getCustomItemSemanticEditPolicy());
		
		if (getCustomCanonicalEditPolicy() != null)
			editPart.installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
					getCustomCanonicalEditPolicy());
	}
	
	
	/**
	 * Fetch the custom CanonicalEditPolicy for this edit part
	 * @return a new instance of this edit policy or null if it does not exist
	 */
	protected CanonicalEditPolicy getCustomCanonicalEditPolicy() {
		String simpleName = 
			editPart.getClass().getSimpleName().replace("EditPart", "CanonicalEditPolicy");
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
			editPart.getClass().getSimpleName().replace("EditPart", "ItemSemanticEditPolicy");
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
	
	public int getCreationMode() {
		return creationMode;
	}
	
	public void setCreationMode(int mode) {
		creationMode = mode;
	}
	
	public boolean isMerged() {
		return isMerged;
	}
	
	public void setMerged(boolean merged) {
		isMerged = merged;
	}
	
	public abstract void activate();
	public abstract GraphicalEditPart getCompartment();
	public abstract LayoutManager getLayoutManager();
	public abstract IFigure setupContentPane(IFigure nodeShape);
	public abstract boolean addChildVisual(EditPart childEditPart, int index);
	public abstract boolean addFixedChild(EditPart childEditPart);
	public abstract DragTracker getDragTracker(Request request);
	public abstract boolean refreshBounds();
	public abstract void setLayoutManager(IFigure figure);
	public abstract void refresh();
	public abstract LayoutEditPolicy createLayoutEditPolicy();
	public abstract NodeFigure createNodePlate();
	public abstract boolean setLayoutConstraint(EditPart child, IFigure childFigure,
			Object constraint);

}
