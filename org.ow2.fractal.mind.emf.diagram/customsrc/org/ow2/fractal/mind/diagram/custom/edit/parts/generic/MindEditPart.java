package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;


public class MindEditPart {
	
	public static final int UNDEFINED = 0;
	public static final int COMPONENT = 1;
	public static final int LIST = 2;
	public static final int BODY = 3;
	public static final int INTERFACE = 4;
	public static final int REFERENCE = 5;
	public static final int ITEM = 6;

	public static MindEditPart createGenericEditPart(GraphicalEditPart editPart,int visualID) {
	
		int type = getType(visualID);
		switch (type){
		case UNDEFINED:
			return null;
		case COMPONENT:
			return new MindComponentEditPart(editPart);
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

}
