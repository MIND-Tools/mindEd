package org.ow2.mindEd.adl.textual.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.Annotation;
import org.ow2.mindEd.adl.textual.fractal.AnnotationElement;
import org.ow2.mindEd.adl.textual.fractal.AnnotationsList;
import org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition;
import org.ow2.mindEd.adl.textual.fractal.AttributeDefinition;
import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperType;
import org.ow2.mindEd.adl.textual.fractal.ConstantValue;
import org.ow2.mindEd.adl.textual.fractal.DataDefinition;
import org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.FormalArgument;
import org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition;
import org.ow2.mindEd.adl.textual.fractal.ImportDefinition;
import org.ow2.mindEd.adl.textual.fractal.InlineCodeC;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType;
import org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TemplateReference;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;

@SuppressWarnings("all")
public class FractalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FractalGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FractalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FractalPackage.ADL_DEFINITION:
				if(context == grammarAccess.getAdlDefinitionRule()) {
					sequence_AdlDefinition(context, (AdlDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getElementValueRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.ANNOTATION_ELEMENT:
				if(context == grammarAccess.getAnnotationElementRule()) {
					sequence_AnnotationElement(context, (AnnotationElement) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.ANNOTATIONS_LIST:
				if(context == grammarAccess.getAnnotationsListRule()) {
					sequence_AnnotationsList(context, (AnnotationsList) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.ARGUMENT_DEFINITION:
				if(context == grammarAccess.getArgumentDefinitionRule()) {
					sequence_ArgumentDefinition(context, (ArgumentDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.ATTRIBUTE_DEFINITION:
				if(context == grammarAccess.getAttributeDefinitionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPrimitiveElementRule()) {
					sequence_AttributeDefinition(context, (AttributeDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.BINDING_DEFINITION:
				if(context == grammarAccess.getBindingDefinitionRule() ||
				   context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_BindingDefinition(context, (BindingDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.COMPOSITE_DEFINITION:
				if(context == grammarAccess.getArchitectureDefinitionRule() ||
				   context == grammarAccess.getCompositeDefinitionRule() ||
				   context == grammarAccess.getCompositeSuperTypeDefinitionRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_CompositeDefinition(context, (CompositeDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.COMPOSITE_SUPER_TYPE:
				if(context == grammarAccess.getCompositeSuperTypeRule()) {
					sequence_CompositeSuperType(context, (CompositeSuperType) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.CONSTANT_VALUE:
				if(context == grammarAccess.getConstantValueRule() ||
				   context == grammarAccess.getElementValueRule()) {
					sequence_ConstantValue(context, (ConstantValue) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.DATA_DEFINITION:
				if(context == grammarAccess.getDataDefinitionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPrimitiveElementRule()) {
					sequence_DataDefinition(context, (DataDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.ELEMENT_VALUE_ARRAY_INITIALIZER:
				if(context == grammarAccess.getElementValueRule() ||
				   context == grammarAccess.getElementValueArrayInitializerRule()) {
					sequence_ElementValueArrayInitializer(context, (ElementValueArrayInitializer) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.FILE_C:
				if(context == grammarAccess.getFileCRule()) {
					sequence_FileC(context, (FileC) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.FORMAL_ARGUMENT:
				if(context == grammarAccess.getFormalArgumentRule()) {
					sequence_FormalArgument(context, (FormalArgument) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.FORMAL_ARGUMENTS_LIST:
				if(context == grammarAccess.getFormalArgumentsListRule()) {
					sequence_FormalArgumentsList(context, (FormalArgumentsList) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.IMPLEMENTATION_DEFINITION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getImplementationDefinitionRule() ||
				   context == grammarAccess.getPrimitiveElementRule()) {
					sequence_ImplementationDefinition(context, (ImplementationDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.IMPORT_DEFINITION:
				if(context == grammarAccess.getImportDefinitionRule()) {
					sequence_ImportDefinition(context, (ImportDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.INLINE_CODE_C:
				if(context == grammarAccess.getInlineCodeCRule()) {
					sequence_InlineCodeC(context, (InlineCodeC) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.PRIMITIVE_DEFINITION:
				if(context == grammarAccess.getArchitectureDefinitionRule() ||
				   context == grammarAccess.getPrimitiveDefinitionRule() ||
				   context == grammarAccess.getPrimitiveSuperTypeDefinitionRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_PrimitiveDefinition(context, (PrimitiveDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.PRIMITIVE_SUPER_TYPE:
				if(context == grammarAccess.getPrimitiveSuperTypeRule()) {
					sequence_PrimitiveSuperType(context, (PrimitiveSuperType) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.PROVIDED_INTERFACE_DEFINITION:
				if(context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getHostedInterfaceDefinitionRule() ||
				   context == grammarAccess.getPrimitiveElementRule() ||
				   context == grammarAccess.getProvidedInterfaceDefinitionRule()) {
					sequence_ProvidedInterfaceDefinition(context, (ProvidedInterfaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.REQUIRED_INTERFACE_DEFINITION:
				if(context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getHostedInterfaceDefinitionRule() ||
				   context == grammarAccess.getPrimitiveElementRule() ||
				   context == grammarAccess.getRequiredInterfaceDefinitionRule()) {
					sequence_RequiredInterfaceDefinition(context, (RequiredInterfaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.SUB_COMPONENT_DEFINITION:
				if(context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getSubComponentDefinitionRule()) {
					sequence_SubComponentDefinition(context, (SubComponentDefinition) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.TEMPLATE_REFERENCE:
				if(context == grammarAccess.getTemplateReferenceRule()) {
					sequence_TemplateReference(context, (TemplateReference) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.TEMPLATE_SPECIFIER:
				if(context == grammarAccess.getTemplateSpecifierRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_TemplateSpecifier(context, (TemplateSpecifier) semanticObject); 
					return; 
				}
				else break;
			case FractalPackage.TYPE_DEFINITION:
				if(context == grammarAccess.getArchitectureDefinitionRule() ||
				   context == grammarAccess.getCompositeSuperTypeDefinitionRule() ||
				   context == grammarAccess.getPrimitiveSuperTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_TypeDefinition(context, (TypeDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (imports+=ImportDefinition* annotationsList=AnnotationsList? architectureDefinition=ArchitectureDefinition)
	 */
	protected void sequence_AdlDefinition(EObject context, AdlDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? elementValue=ElementValue)
	 */
	protected void sequence_AnnotationElement(EObject context, AnnotationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='Override' | name='Singleton' | name='LDFlags' | name='CFlags' | name=QualifiedName) 
	 *         (annotationElements+=AnnotationElement annotationElements+=AnnotationElement*)?
	 *     )
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation annotations+=Annotation*)
	 */
	protected void sequence_AnnotationsList(EObject context, AnnotationsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? argumentValue=Value)
	 */
	protected void sequence_ArgumentDefinition(EObject context, ArgumentDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? type=AttributeType? attributeName=ID value=Value?)
	 */
	protected void sequence_AttributeDefinition(EObject context, AttributeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         (sourceParent=[SubComponentDefinition|ID] | isSrcParentThis?='this') 
	 *         sourceInterface=[HostedInterfaceDefinition|ID] 
	 *         sourceIndex=INT? 
	 *         (targetParent=[SubComponentDefinition|ID] | isTgtParentThis?='this') 
	 *         targetInterface=[HostedInterfaceDefinition|ID] 
	 *         targetIndex=INT?
	 *     )
	 */
	protected void sequence_BindingDefinition(EObject context, BindingDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName? 
	 *         (templateSpecifiers+=TemplateSpecifier templateSpecifiers+=TemplateSpecifier*)? 
	 *         compositeFormalArgumentsList=FormalArgumentsList? 
	 *         (superTypes+=CompositeSuperType superTypes+=CompositeSuperType*)? 
	 *         (elements+=ProvidedInterfaceDefinition | elements+=RequiredInterfaceDefinition | elements+=SubComponentDefinition | elements+=BindingDefinition)*
	 *     )
	 */
	protected void sequence_CompositeDefinition(EObject context, CompositeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         targetArchDef=[CompositeSuperTypeDefinition|QualifiedName] 
	 *         (templatesList+=TemplateReference templatesList+=TemplateReference*)? 
	 *         (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)?
	 *     )
	 */
	protected void sequence_CompositeSuperType(EObject context, CompositeSuperType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ConstantFormat
	 */
	protected void sequence_ConstantValue(EObject context, ConstantValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FractalPackage.Literals.CONSTANT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FractalPackage.Literals.CONSTANT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? (fileC=FileC | inlineCcode=InlineCodeC))
	 */
	protected void sequence_DataDefinition(EObject context, DataDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=ElementValue values+=ElementValue*)
	 */
	protected void sequence_ElementValueArrayInitializer(EObject context, ElementValueArrayInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (directory=Path? name=FileName)
	 */
	protected void sequence_FileC(EObject context, FileC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FormalArgument(EObject context, FormalArgument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FractalPackage.Literals.FORMAL_ARGUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FractalPackage.Literals.FORMAL_ARGUMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (formalArguments+=FormalArgument formalArguments+=FormalArgument*)
	 */
	protected void sequence_FormalArgumentsList(EObject context, FormalArgumentsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? (fileC=FileC | inlineCcode=InlineCodeC))
	 */
	protected void sequence_ImplementationDefinition(EObject context, ImplementationDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? importedNamespace=QualifiedNameWithWildcard)
	 */
	protected void sequence_ImportDefinition(EObject context, ImportDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     codeC=CODE_C
	 */
	protected void sequence_InlineCodeC(EObject context, InlineCodeC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FractalPackage.Literals.INLINE_CODE_C__CODE_C) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FractalPackage.Literals.INLINE_CODE_C__CODE_C));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInlineCodeCAccess().getCodeCCODE_CTerminalRuleCall_0(), semanticObject.getCodeC());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=QualifiedName? 
	 *         compositeFormalArgumentsList=FormalArgumentsList? 
	 *         (superTypes+=PrimitiveSuperType superTypes+=PrimitiveSuperType*)? 
	 *         (
	 *             elements+=ProvidedInterfaceDefinition | 
	 *             elements+=RequiredInterfaceDefinition | 
	 *             elements+=ImplementationDefinition | 
	 *             elements+=AttributeDefinition | 
	 *             elements+=DataDefinition
	 *         )*
	 *     )
	 */
	protected void sequence_PrimitiveDefinition(EObject context, PrimitiveDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (targetArchDef=[PrimitiveSuperTypeDefinition|QualifiedName] (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)?)
	 */
	protected void sequence_PrimitiveSuperType(EObject context, PrimitiveSuperType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? role='provides' signature=[InterfaceDefinition|QualifiedName] name=ID (collection?='[' collectionsize=INT?)?)
	 */
	protected void sequence_ProvidedInterfaceDefinition(EObject context, ProvidedInterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         role='requires' 
	 *         optional?='optional'? 
	 *         signature=[InterfaceDefinition|QualifiedName] 
	 *         name=ID 
	 *         (collection?='[' collectionsize=INT?)?
	 *     )
	 */
	protected void sequence_RequiredInterfaceDefinition(EObject context, RequiredInterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         type=[TypeReference|QualifiedName]? 
	 *         (templatesList+=TemplateReference templatesList+=TemplateReference*)? 
	 *         (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)? 
	 *         name=ID 
	 *         bodyAnnotationsList=AnnotationsList? 
	 *         (body=CompositeDefinition | body=PrimitiveDefinition)?
	 *     )
	 */
	protected void sequence_SubComponentDefinition(EObject context, SubComponentDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=TemplateSpecifier? 
	 *         (typeReference=[TypeReference|QualifiedName] | anyTypeReference?='?') 
	 *         (templatesList+=TemplateReference templatesList+=TemplateReference*)? 
	 *         (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)?
	 *     )
	 */
	protected void sequence_TemplateReference(EObject context, TemplateReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typeReference=[TypeDefinition|QualifiedName])
	 */
	protected void sequence_TemplateSpecifier(EObject context, TemplateSpecifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FractalPackage.Literals.TYPE_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FractalPackage.Literals.TYPE_REFERENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, FractalPackage.Literals.TEMPLATE_SPECIFIER__TYPE_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FractalPackage.Literals.TEMPLATE_SPECIFIER__TYPE_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTemplateSpecifierAccess().getTypeReferenceTypeDefinitionQualifiedNameParserRuleCall_2_0_1(), semanticObject.getTypeReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         (superTypes+=[TypeDefinition|QualifiedName] superTypes+=[TypeDefinition|QualifiedName]*)? 
	 *         (elements+=ProvidedInterfaceDefinition | elements+=RequiredInterfaceDefinition)*
	 *     )
	 */
	protected void sequence_TypeDefinition(EObject context, TypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
