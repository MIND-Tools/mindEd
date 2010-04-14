package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.util.HashMap;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

import adl.diagram.edit.parts.*;

/**
 * The factory to create generic edit parts<p>
 * This class needs to be maintained in case of a new custom class creation<p>
 * @author maroto
 *
 */
public class MindGenericEditPartFactory implements MindTypes {

	/**
	 * The singleton to hold the instance
	 */
	public static MindGenericEditPartFactory INSTANCE = new MindGenericEditPartFactory();

	/**
	 * This hashmap remembers created MindEditParts and their associated EditParts
	 */
	private HashMap<EditPart,MindEditPart> editPartsMap = new HashMap<EditPart,MindEditPart>();
	
	/**
	 * This hashmap remembers created MindBindingEditParts and their associated EditParts
	 */
	private HashMap<ConnectionEditPart,MindBindingEditPart> bindingsMap = new HashMap<ConnectionEditPart,MindBindingEditPart>();
	
	/**
	 * The factory, based on the type definition (see getMindType)
	 * @param editPart
	 * @param visualID
	 * @return the generic edit part, MindItemEditPart or subclass
	 */
	public MindEditPart createGenericEditPart(GraphicalEditPart editPart,int visualID) {
		
		MindEditPart mindPart;
		int type = MindEditPart.getMindType(visualID);
		
		switch (type){
		
		case TYPE_UNDEFINED:
			mindPart = new MindEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
			
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
			
		case TYPE_MISC:
			mindPart = new MindEditPart(editPart, visualID, TYPE_MISC);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
			
		case TYPE_COMPARTMENT_BODY:
			mindPart = new MindBodyCompartmentEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
			
		case TYPE_COMPARTMENT_LIST:
			mindPart = new MindListCompartmentEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
			
		case TYPE_COMPARTMENT:
			mindPart = new MindCompartmentEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
			
		case TYPE_LABEL:
			mindPart = new MindLabelEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
			
		default :
			mindPart = new MindItemEditPart(editPart, visualID);
			editPartsMap.put(editPart, mindPart);
			return mindPart;
		}
	}
	
	/**
	 * The factory for bindings
	 * @param editPart
	 * @param visualID
	 * @return
	 */
	public MindBindingEditPart createGenericEditPart(ConnectionEditPart editPart,int visualID) {
		MindBindingEditPart mindPart = new MindBindingEditPart(editPart, visualID);
		bindingsMap.put(editPart, mindPart);
		return mindPart;
	}
	

	public MindEditPart getMindEditPartFor(EditPart editPart) {
		return editPartsMap.get(editPart);
	}
	
	public MindBindingEditPart getMindEditPartFor(ConnectionEditPart editPart) {
		return bindingsMap.get(editPart);
	}
	
	
	public static int getMindType(int visualID) {
		
		switch (visualID) {
		
			// -- Components
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
		case CompositeSubComponentEditPart.VISUAL_ID:
		case DataDefinitionEditPart.VISUAL_ID:
		case ImplementationDefinitionEditPart.VISUAL_ID:
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return TYPE_COMPONENT;
			
			// -- Body
		case CompositeBodyEditPart.VISUAL_ID:
		case PrimitiveBodyEditPart.VISUAL_ID:
		case TypeBodyEditPart.VISUAL_ID:
			return TYPE_BODY;
			
			// -- Lists
		case CompositeFormalArgumentsListEditPart.VISUAL_ID:
		case CompositeReferencesListEditPart.VISUAL_ID:
		case PrimitiveFormalArgumentsListEditPart.VISUAL_ID:
		case PrimitiveReferencesListEditPart.VISUAL_ID:
		case TemplateSpecifiersListEditPart.VISUAL_ID:
		case TypeReferencesListEditPart.VISUAL_ID:
			return TYPE_LIST;
			
			// -- Body Compartments
		case CompositeBodyCompartmentEditPart.VISUAL_ID:
		case PrimitiveBodyCompartmentEditPart.VISUAL_ID:
		case TypeBodyCompartmentEditPart.VISUAL_ID:
			return TYPE_COMPARTMENT_BODY;
			
			// -- List Compartments
		case CompositeFormalArgumentsListCompartmentEditPart.VISUAL_ID:
		case CompositeReferencesListCompartmentEditPart.VISUAL_ID:
		case PrimitiveFormalArgumentsListCompartmentEditPart.VISUAL_ID:
		case PrimitiveReferencesListCompartmentEditPart.VISUAL_ID:
		case TemplateSpecifiersListCompartmentEditPart.VISUAL_ID:
		case TypeReferencesListCompartmentEditPart.VISUAL_ID:
		case PrimitiveReferenceCompartmentEditPart.VISUAL_ID:
		case TemplateDefinitionCompartmentEditPart.VISUAL_ID:
		case TemplateDefinitionReferenceCompartmentEditPart.VISUAL_ID:
		case CompositeReferenceCompartmentEditPart.VISUAL_ID:
			return TYPE_COMPARTMENT_LIST;
			
			// -- Miscellaneous Compartments
		case DataDefinitionCompartmentEditPart.VISUAL_ID:
		case ImplementationDefinitionCompartmentEditPart.VISUAL_ID:
			return TYPE_COMPARTMENT;
			
			// -- References
		case CompositeReferenceEditPart.VISUAL_ID:
		case CompositeSubReferenceEditPart.VISUAL_ID:
		case PrimitiveReferenceEditPart.VISUAL_ID:
		case PrimitiveSubReferenceEditPart.VISUAL_ID:
		case TemplateDefinitionReferenceEditPart.VISUAL_ID:
		case TemplateSpecifierReferenceEditPart.VISUAL_ID:
		case TypeReferenceEditPart.VISUAL_ID:
		case FileCEditPart.VISUAL_ID:
		case InlineCodeCEditPart.VISUAL_ID:
		case DataFileCEditPart.VISUAL_ID:
		case DataInlineCodeCEditPart.VISUAL_ID:
		case TemplateDefinitionEditPart.VISUAL_ID:
		case TemplateSpecifierEditPart.VISUAL_ID:
			return TYPE_REFERENCE;
			
			// -- Label
		case ArgumentDefinitionNameEditPart.VISUAL_ID:
		case TemplateSpecifierNameEditPart.VISUAL_ID:
			return TYPE_LABEL;
			
			// -- Interface
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return TYPE_INTERFACE;
			
			// -- Binding
		case BindingDefinitionEditPart.VISUAL_ID:
			return TYPE_BINDING;
					
			// - Miscellaneous
		case AdlDefinitionEditPart.VISUAL_ID:
			return TYPE_MISC;
			
			// -- Items
		case ArgumentDefinitionEditPart.VISUAL_ID:
		case AttributeDefinitionEditPart.VISUAL_ID:
		case FormalArgumentEditPart.VISUAL_ID:
			return TYPE_ITEM;
			
		}
		
		return TYPE_UNDEFINED;
	}
	
}
