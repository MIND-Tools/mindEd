package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.util.HashMap;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.AdlDefinitionCustomEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.CompositeComponentDefinitionCustomEditPart;
import adl.diagram.edit.parts.*;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * The factory to create generic edit parts<p>
 * This class needs to be maintained in case of a new custom class creation<p>
 * @author maroto
 *
 */
public class MindEditPartCustomFactory {

	/**
	 * The singleton to hold the instance
	 */
	public static MindEditPartFactory INSTANCE = new MindEditPartFactory();

	/**
	 * This hashmap remembers created MindEditParts and their associated EditParts
	 */
	private HashMap<GraphicalEditPart,MindEditPart> editPartsMap = new HashMap<GraphicalEditPart,MindEditPart>();
	
	
public MindEditPart createGenericEditPart(GraphicalEditPart editPart,int visualID) {
		
		MindEditPart mindPart;
		
		int type = MindEditPart.getType(visualID);
		switch (type){
		case MindEditPart.TYPE_UNDEFINED:
			return null;
		case TYPE_COMPONENT:
			mindPart = new MindComponentEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		case TYPE_LIST:
			mindPart = new MindListEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		case TYPE_BODY:
			mindPart = new MindBodyEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		case TYPE_INTERFACE:
			mindPart = new MindInterfaceEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		case TYPE_REFERENCE:
			mindPart = new MindReferenceEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		case TYPE_ITEM:
			mindPart = new MindItemEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		case TYPE_COMPARTMENT:
			mindPart = new MindCompartmentEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		}
		return null;
	}

	public MindEditPart getMindEditPartFor(EditPart editPart) {
		return editPartsMap.get(editPart);
	}
	
	
	
}
