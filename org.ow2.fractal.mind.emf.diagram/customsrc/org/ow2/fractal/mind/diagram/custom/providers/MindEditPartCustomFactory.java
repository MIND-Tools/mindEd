package org.ow2.fractal.mind.diagram.custom.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.*;
import adl.diagram.edit.parts.*;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * The custom factory for the custom edit parts<p>
 * This class needs to be maintained in case of a new custom class creation<p>
 * To use the custom factory, you need to adress the custom provider in plugin.xml (in case you deleted it) :
 * extensions > editpartProviders > org.ow2.fractal.mind.diagram.custom.providers.MindEditPartCustomProvider
 * @author maroto
 *
 */
public class MindEditPartCustomFactory extends MindEditPartFactory {

	/**
	 * Overrides createEditPart to return custom edit parts instead of generated edit parts.
	 * Add an entry here to implement a new custom edit part.<p>
	 * Please follow alphabetical order.
	 */
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MindVisualIDRegistry.getVisualID(view)) {
			
			// -- AnnotationsList
//			case AnnotationsListEditPart.VISUAL_ID:
//				return new AnnotationsListCustomEditPart(view);
//			
//			case AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID:
//				return new AnnotationsListAreaCustomEditPart(view);
//				
//			case AnnotationEditPart.VISUAL_ID:
//				return new AnnotationCustomEditPart(view);
//				
//			case AnnotationNameEditPart.VISUAL_ID:
//				return new AnnotationNameCustomEditPart(view);
			
//			case AnnotationCompartmentAnnotationAreaEditPart.VISUAL_ID:
//				return new AnnotationCompartmentAreaCustomEditPart(view);
			
				
			
			case AdlDefinitionEditPart.VISUAL_ID:
				return new AdlDefinitionCustomEditPart(view);

			case CompositeComponentDefinitionEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionCustomEditPart(view);

			case CompositeComponentDefinitionNameEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionNameEditPart(view);

			case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
				return new PrimitiveComponentDefinitionCustomEditPart(view);

			case PrimitiveComponentDefinitionNameEditPart.VISUAL_ID:
				return new PrimitiveComponentDefinitionNameEditPart(view);

			case ComponentTypeDefinitionEditPart.VISUAL_ID:
				return new ComponentTypeDefinitionCustomEditPart(view);

			case ComponentTypeDefinitionNameEditPart.VISUAL_ID:
				return new ComponentTypeDefinitionNameEditPart(view);

			case TemplateSpecifiersListEditPart.VISUAL_ID:
				return new TemplateSpecifiersListCustomEditPart(view);

			case TemplateSpecifierEditPart.VISUAL_ID:
				return new TemplateSpecifierCustomEditPart(view);

			case TemplateSpecifierNameEditPart.VISUAL_ID:
				return new TemplateSpecifierNameCustomEditPart(view);

			case TemplateSpecifierReferenceEditPart.VISUAL_ID:
				return new TemplateSpecifierReferenceCustomEditPart(view);

			case TemplateSpecifierReferenceNameEditPart.VISUAL_ID:
				return new TemplateSpecifierReferenceNameEditPart(view);

			case CompositeFormalArgumentsListEditPart.VISUAL_ID:
				return new CompositeFormalArgumentsListCustomEditPart(view);

			case FormalArgumentEditPart.VISUAL_ID:
				return new FormalArgumentCustomEditPart(view);

			case FormalArgumentNameEditPart.VISUAL_ID:
				return new FormalArgumentNameEditPart(view);

			case CompositeReferencesListEditPart.VISUAL_ID:
				return new CompositeReferencesListCustomEditPart(view);

			case CompositeReferenceEditPart.VISUAL_ID:
				return new CompositeReferenceCustomEditPart(view);

			case CompositeReferenceNameEditPart.VISUAL_ID:
				return new CompositeReferenceNameEditPart(view);

			case ArgumentDefinitionEditPart.VISUAL_ID:
				return new ArgumentDefinitionCustomEditPart(view);

			case ArgumentDefinitionNameEditPart.VISUAL_ID:
				return new ArgumentDefinitionNameCustomEditPart(view);

			case TemplateDefinitionEditPart.VISUAL_ID:
				return new TemplateDefinitionCustomEditPart(view);

			case TemplateDefinitionNameEditPart.VISUAL_ID:
				return new TemplateDefinitionNameCustomEditPart(view);

			case TemplateDefinitionReferenceEditPart.VISUAL_ID:
				return new TemplateDefinitionReferenceCustomEditPart(view);

			case TemplateDefinitionReferenceNameEditPart.VISUAL_ID:
				return new TemplateDefinitionReferenceNameEditPart(view);

			case CompositeBodyEditPart.VISUAL_ID:
				return new CompositeBodyCustomEditPart(view);

			case InterfaceDefinitionEditPart.VISUAL_ID:
				return new InterfaceDefinitionCustomEditPart(view);

			case InterfaceDefinitionNameEditPart.VISUAL_ID:
				return new InterfaceDefinitionNameEditPart(view);

			case CompositeSubComponentEditPart.VISUAL_ID:
				return new CompositeSubComponentCustomEditPart(view);

			case CompositeSubComponentNameEditPart.VISUAL_ID:
				return new CompositeSubComponentNameEditPart(view);

			case CompositeSubReferenceEditPart.VISUAL_ID:
				return new CompositeSubReferenceCustomEditPart(view);

			case CompositeSubReferenceNameEditPart.VISUAL_ID:
				return new CompositeSubReferenceNameEditPart(view);

			case PrimitiveSubComponentEditPart.VISUAL_ID:
				return new PrimitiveSubComponentCustomEditPart(view);

			case PrimitiveSubComponentNameEditPart.VISUAL_ID:
				return new PrimitiveSubComponentNameEditPart(view);

			case PrimitiveSubReferenceEditPart.VISUAL_ID:
				return new PrimitiveSubReferenceCustomEditPart(view);

			case PrimitiveSubReferenceNameEditPart.VISUAL_ID:
				return new PrimitiveSubReferenceNameEditPart(view);

			case PrimitiveBodyEditPart.VISUAL_ID:
				return new PrimitiveBodyCustomEditPart(view);

			case ImplementationDefinitionEditPart.VISUAL_ID:
				return new ImplementationDefinitionCustomEditPart(view);

			case LabelImplementationTitleEditPart.VISUAL_ID:
				return new LabelImplementationTitleEditPart(view);

			case FileCEditPart.VISUAL_ID:
				return new FileCCustomEditPart(view);

			case FileCNameEditPart.VISUAL_ID:
				return new FileCNameCustomEditPart(view);

			case InlineCodeCEditPart.VISUAL_ID:
				return new InlineCodeCCustomEditPart(view);

			case InlineCodeCNameEditPart.VISUAL_ID:
				return new InlineCodeCNameCustomEditPart(view);

			case DataDefinitionEditPart.VISUAL_ID:
				return new DataDefinitionCustomEditPart(view);

			case LabelDataDefinitionTitleEditPart.VISUAL_ID:
				return new LabelDataDefinitionTitleEditPart(view);

			case DataFileCEditPart.VISUAL_ID:
				return new FileCCustomEditPart(view);

			case DataFileCNameEditPart.VISUAL_ID:
				return new FileCNameCustomEditPart(view);

			case DataInlineCodeCEditPart.VISUAL_ID:
				return new InlineCodeCCustomEditPart(view);

			case DataInlineCodeCNameEditPart.VISUAL_ID:
				return new InlineCodeCNameCustomEditPart(view);

			case AttributeDefinitionEditPart.VISUAL_ID:
				return new AttributeDefinitionCustomEditPart(view);

			case AttributeDefinitionNameEditPart.VISUAL_ID:
				return new AttributeDefinitionNameEditPart(view);

			case PrimitiveFormalArgumentsListEditPart.VISUAL_ID:
				return new PrimitiveFormalArgumentsListCustomEditPart(view);

			case PrimitiveReferencesListEditPart.VISUAL_ID:
				return new PrimitiveReferencesListCustomEditPart(view);

			case LabelTitleReferencesListEditPart.VISUAL_ID:
				return new LabelTitleReferencesListEditPart(view);

			case PrimitiveReferenceEditPart.VISUAL_ID:
				return new PrimitiveReferenceCustomEditPart(view);

			case PrimitiveReferenceNameEditPart.VISUAL_ID:
				return new PrimitiveReferenceNameEditPart(view);

			case TypeReferencesListEditPart.VISUAL_ID:
				return new TypeReferencesListCustomEditPart(view);

			case TypeReferenceEditPart.VISUAL_ID:
				return new TypeReferenceCustomEditPart(view);

			case TypeReferenceNameEditPart.VISUAL_ID:
				return new TypeReferenceNameEditPart(view);

			case TypeBodyEditPart.VISUAL_ID:
				return new TypeBodyCustomEditPart(view);

			case TemplateSpecifiersListCompartmentEditPart.VISUAL_ID:
				return new TemplateSpecifiersListCompartmentCustomEditPart(view);

			case CompositeFormalArgumentsListCompartmentEditPart.VISUAL_ID:
				return new CompositeFormalArgumentsListCompartmentCustomEditPart(view);

			case CompositeReferencesListCompartmentEditPart.VISUAL_ID:
				return new CompositeReferencesListCompartmentCustomEditPart(view);

			case CompositeReferenceCompartmentEditPart.VISUAL_ID:
				return new CompositeReferenceCompartmentCustomEditPart(view);

			case TemplateDefinitionCompartmentEditPart.VISUAL_ID:
				return new TemplateDefinitionCompartmentCustomEditPart(view);

			case TemplateDefinitionReferenceCompartmentEditPart.VISUAL_ID:
				return new TemplateDefinitionReferenceCompartmentCustomEditPart(view);

			case CompositeBodyCompartmentEditPart.VISUAL_ID:
				return new CompositeBodyCompartmentCustomEditPart(view);

			case CompositeSubReferenceCompartmentEditPart.VISUAL_ID:
				return new CompositeSubReferenceCompartmentCustomEditPart(view);

			case PrimitiveSubReferenceCompartmentEditPart.VISUAL_ID:
				return new PrimitiveSubReferenceCompartmentCustomEditPart(view);

			case PrimitiveBodyCompartmentEditPart.VISUAL_ID:
				return new PrimitiveBodyCompartmentCustomEditPart(view);

			case ImplementationDefinitionCompartmentEditPart.VISUAL_ID:
				return new ImplementationDefinitionCompartmentCustomEditPart(view);

			case DataDefinitionCompartmentEditPart.VISUAL_ID:
				return new DataDefinitionCompartmentCustomEditPart(view);

			case PrimitiveFormalArgumentsListCompartmentEditPart.VISUAL_ID:
				return new PrimitiveFormalArgumentsListCompartmentCustomEditPart(view);

			case PrimitiveReferencesListCompartmentEditPart.VISUAL_ID:
				return new PrimitiveReferencesListCompartmentCustomEditPart(view);

			case PrimitiveReferenceCompartmentEditPart.VISUAL_ID:
				return new PrimitiveReferenceCompartmentCustomEditPart(view);

			case TypeReferencesListCompartmentEditPart.VISUAL_ID:
				return new TypeReferencesListCompartmentCustomEditPart(view);

			case TypeBodyCompartmentEditPart.VISUAL_ID:
				return new TypeBodyCompartmentCustomEditPart(view);

			case BindingDefinitionEditPart.VISUAL_ID:
				return new BindingDefinitionCustomEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
