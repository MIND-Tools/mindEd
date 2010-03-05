package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.parts.CompositeComponentDefinitionCustomEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeComponentDefinitionCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;
import adl.diagram.part.MindDiagramEditorPlugin;


public class MindEditPart {
	
	public static MindEditPart INSTANCE = new MindEditPart();
	
	protected static final int UNDEFINED = 0;
	protected static final int COMPONENT = 1;
	protected static final int LIST = 2;
	protected static final int BODY = 3;
	protected static final int INTERFACE = 4;
	protected static final int REFERENCE = 5;
	protected static final int ITEM = 6;
	protected static final int COMPARTMENT = 8;
	
	public static String EDIT_POLICY_PACKAGE = "org.ow2.fractal.mind.diagram.custom.edit.policies.";
	
	protected GraphicalEditPart realEditPart;
	protected int visualID;

	private HashMap<GraphicalEditPart,MindEditPart> editPartsMap = new HashMap<GraphicalEditPart,MindEditPart>();
	
	public MindEditPart createGenericEditPart(GraphicalEditPart editPart,int visualID) {
		
		int type = getType(visualID);
		switch (type){
		case UNDEFINED:
			return null;
		case COMPONENT:
			MindEditPart mindPart = new MindComponentEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
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
	
	
	public MindEditPart getMindEditPartFor(EditPart editPart) {
		return editPartsMap.get(editPart);
	}
	
	
	public EditPart getCompartment() {
		List<EditPart> children = realEditPart.getChildren();
		
		for (EditPart child : children) {
			if (getMindEditPartFor(child) instanceof MindCompartmentEditPart)
				return child;
		}
		return null;
	}

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

	public void refreshBounds() {};
	
	public void createDefaultEditPolicies() {};
	
	

}
