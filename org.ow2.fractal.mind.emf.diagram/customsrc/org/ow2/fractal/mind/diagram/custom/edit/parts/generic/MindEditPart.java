package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
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
		String editPolicyName = 
			realEditPart.getClass().getName().replace("EditPart", "CustomCanonicalEditPolicy");
		
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
		String editPolicyName = 
			realEditPart.getClass().getName().replace("EditPart", "CustomItemSemanticEditPolicy");
		
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
		} catch (ClassNotFoundException e) {
			// Try another way
			switch(visualID) {
			case CompositeComponentDefinitionEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionCustomCanonicalEditPolicy();
			}
			return null;
		}
		
		EditPolicy editPolicy = null;
				
		try {
			editPolicy = (EditPolicy) editPolicyClass.newInstance();
		} catch (InstantiationException e) {
			MindDiagramEditorPlugin.getInstance().logError("Edit policy instantiation error", e);
			return null;
		} catch (IllegalAccessException e) {
			MindDiagramEditorPlugin.getInstance().logError("Illegal access instantiating edit policy", e);
			return null;
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not an edit policy", e);
			return null;
		}
		
		return editPolicy;
	}

}
