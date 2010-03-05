package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.parts.CompositeComponentDefinitionCustomEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeComponentDefinitionCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;
import adl.diagram.part.MindDiagramEditorPlugin;


public class MindEditPart {
	
	public static final int UNDEFINED = 0;
	public static final int COMPONENT = 1;
	public static final int LIST = 2;
	public static final int BODY = 3;
	public static final int INTERFACE = 4;
	public static final int REFERENCE = 5;
	public static final int ITEM = 6;
	
	public static String EDIT_POLICY_PACKAGE = "org.ow2.fractal.mind.diagram.custom.edit.policies.";
	
	protected GraphicalEditPart realEditPart;
	protected int visualID;

	public static MindEditPart createGenericEditPart(GraphicalEditPart editPart,int visualID) {
		
		int type = getType(visualID);
		switch (type){
		case UNDEFINED:
			return null;
		case COMPONENT:
			return new MindComponentEditPart(editPart, visualID);
		}
		return null;
	}
	
	
	public static int getType(int visualID) {
		int type = UNDEFINED;
		switch (visualID) {
		
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return COMPONENT;
			
		}
		
		return type;
	}
	
	
	public void createDefaultEditPolicies(){
		
	};
	

	/**
	 * Fetch the custom CanonicalEditPolicy for this edit part
	 * @return a new instance of this edit policy
	 */
	protected CanonicalEditPolicy getCanonicalEditPolicy() {
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
	 * @return a new instance of this edit policy
	 */
	protected MindBaseItemSemanticEditPolicy getItemSemanticEditPolicy() {
		String simpleName = 
			realEditPart.getClass().getSimpleName().replace("EditPart", "ItemSemanticEditPolicy");
		String packageName = EDIT_POLICY_PACKAGE;
		String editPolicyName = packageName.concat(simpleName);
		
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
	protected EditPolicy getEditPolicyFromName (String editPolicyName) {
		Class editPolicyClass = null;
		try {
			editPolicyClass = Class.forName(editPolicyName);
			EditPolicy editPolicy = (EditPolicy) editPolicyClass.newInstance();
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


	public IFigure setupContentPane(IFigure nodeShape) {
		return null;
	}


	public boolean addChildVisual(EditPart childEditPart, int index) {
		return false;
	}


	public boolean addFixedChild(EditPart childEditPart) {
		return false;
	}


	public DragTracker getDragTracker(EditPart ep) {
		return null;
	}

}
