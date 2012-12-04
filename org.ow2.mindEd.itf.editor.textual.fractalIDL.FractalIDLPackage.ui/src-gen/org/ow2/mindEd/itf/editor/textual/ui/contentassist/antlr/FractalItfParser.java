/*
* generated by Xtext
*/
package org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.ow2.mindEd.itf.editor.textual.services.FractalItfGrammarAccess;

public class FractalItfParser extends AbstractContentAssistParser {
	
	@Inject
	private FractalItfGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr.internal.InternalFractalItfParser createParser() {
		org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr.internal.InternalFractalItfParser result = new org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr.internal.InternalFractalItfParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getItfFileAccess().getAlternatives_1(), "rule__ItfFile__Alternatives_1");
					put(grammarAccess.getTypeDefinitionAccess().getAlternatives_0(), "rule__TypeDefinition__Alternatives_0");
					put(grammarAccess.getTypeSpecificationAccess().getAlternatives(), "rule__TypeSpecification__Alternatives");
					put(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives(), "rule__StructOrUnionSpecification__Alternatives");
					put(grammarAccess.getStructOrUnionAccess().getAlternatives(), "rule__StructOrUnion__Alternatives");
					put(grammarAccess.getEnumSpecificationAccess().getAlternatives(), "rule__EnumSpecification__Alternatives");
					put(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0(), "rule__DirectDeclarator__Alternatives_0");
					put(grammarAccess.getAbstractDirectDeclaratorAccess().getAlternatives(), "rule__AbstractDirectDeclarator__Alternatives");
					put(grammarAccess.getMethodDefinitionAccess().getAlternatives_4(), "rule__MethodDefinition__Alternatives_4");
					put(grammarAccess.getParameterAccess().getAlternatives_3(), "rule__Parameter__Alternatives_3");
					put(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1(), "rule__IncludeDirective__Alternatives_1");
					put(grammarAccess.getAnnotationParametersAccess().getAlternatives_2(), "rule__AnnotationParameters__Alternatives_2");
					put(grammarAccess.getAnnotationValueAccess().getAlternatives(), "rule__AnnotationValue__Alternatives");
					put(grammarAccess.getCastExpressionAccess().getAlternatives(), "rule__CastExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getFloatingPointLiteralAccess().getAlternatives(), "rule__FloatingPointLiteral__Alternatives");
					put(grammarAccess.getExponentAccess().getAlternatives_0(), "rule__Exponent__Alternatives_0");
					put(grammarAccess.getTypeQualifierAccess().getAlternatives(), "rule__TypeQualifier__Alternatives");
					put(grammarAccess.getTypeSpecifierAccess().getAlternatives(), "rule__TypeSpecifier__Alternatives");
					put(grammarAccess.getParameterQualifierAccess().getAlternatives(), "rule__ParameterQualifier__Alternatives");
					put(grammarAccess.getItfFileAccess().getGroup(), "rule__ItfFile__Group__0");
					put(grammarAccess.getTypeDefinitionAccess().getGroup(), "rule__TypeDefinition__Group__0");
					put(grammarAccess.getTypedefSpecificationAccess().getGroup(), "rule__TypedefSpecification__Group__0");
					put(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup(), "rule__QualifiedTypeSpecification__Group__0");
					put(grammarAccess.getStructOrUnionDefinitionAccess().getGroup(), "rule__StructOrUnionDefinition__Group__0");
					put(grammarAccess.getStructorUnionReferenceAccess().getGroup(), "rule__StructorUnionReference__Group__0");
					put(grammarAccess.getStructMemberAccess().getGroup(), "rule__StructMember__Group__0");
					put(grammarAccess.getStructMemberAccess().getGroup_3(), "rule__StructMember__Group_3__0");
					put(grammarAccess.getEnumDefinitionAccess().getGroup(), "rule__EnumDefinition__Group__0");
					put(grammarAccess.getEnumReferenceAccess().getGroup(), "rule__EnumReference__Group__0");
					put(grammarAccess.getEnumMemberListAccess().getGroup(), "rule__EnumMemberList__Group__0");
					put(grammarAccess.getEnumMemberListAccess().getGroup_1(), "rule__EnumMemberList__Group_1__0");
					put(grammarAccess.getEnumMemberAccess().getGroup(), "rule__EnumMember__Group__0");
					put(grammarAccess.getEnumMemberAccess().getGroup_2(), "rule__EnumMember__Group_2__0");
					put(grammarAccess.getDeclaratorsAccess().getGroup(), "rule__Declarators__Group__0");
					put(grammarAccess.getDeclaratorsAccess().getGroup_1(), "rule__Declarators__Group_1__0");
					put(grammarAccess.getDeclaratorAccess().getGroup(), "rule__Declarator__Group__0");
					put(grammarAccess.getAbstractDeclaratorAccess().getGroup(), "rule__AbstractDeclarator__Group__0");
					put(grammarAccess.getPointerSpecificationAccess().getGroup(), "rule__PointerSpecification__Group__0");
					put(grammarAccess.getQualified_PointerSpecificationAccess().getGroup(), "rule__Qualified_PointerSpecification__Group__0");
					put(grammarAccess.getDirectDeclaratorAccess().getGroup(), "rule__DirectDeclarator__Group__0");
					put(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1(), "rule__DirectDeclarator__Group_0_1__0");
					put(grammarAccess.getAbstractDirectDeclaratorAccess().getGroup_0(), "rule__AbstractDirectDeclarator__Group_0__0");
					put(grammarAccess.getArraySpecificationAccess().getGroup(), "rule__ArraySpecification__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
					put(grammarAccess.getInterfaceDefinitionAccess().getGroup(), "rule__InterfaceDefinition__Group__0");
					put(grammarAccess.getInterfaceDefinitionAccess().getGroup_4(), "rule__InterfaceDefinition__Group_4__0");
					put(grammarAccess.getMethodDefinitionAccess().getGroup(), "rule__MethodDefinition__Group__0");
					put(grammarAccess.getMethodDefinitionAccess().getGroup_4_0(), "rule__MethodDefinition__Group_4_0__0");
					put(grammarAccess.getMethodDefinitionAccess().getGroup_4_1(), "rule__MethodDefinition__Group_4_1__0");
					put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
					put(grammarAccess.getParameterListAccess().getGroup_1(), "rule__ParameterList__Group_1__0");
					put(grammarAccess.getParameterListAccess().getGroup_2(), "rule__ParameterList__Group_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getIncludeDirectiveAccess().getGroup(), "rule__IncludeDirective__Group__0");
					put(grammarAccess.getAnnotationsAccess().getGroup(), "rule__Annotations__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationParametersAccess().getGroup(), "rule__AnnotationParameters__Group__0");
					put(grammarAccess.getAnnotationValuePairsAccess().getGroup(), "rule__AnnotationValuePairs__Group__0");
					put(grammarAccess.getAnnotationValuePairsAccess().getGroup_1(), "rule__AnnotationValuePairs__Group_1__0");
					put(grammarAccess.getAnnotationValuePairAccess().getGroup(), "rule__AnnotationValuePair__Group__0");
					put(grammarAccess.getArrayAnnotationValueAccess().getGroup(), "rule__ArrayAnnotationValue__Group__0");
					put(grammarAccess.getArrayAnnotationValueAccess().getGroup_1(), "rule__ArrayAnnotationValue__Group_1__0");
					put(grammarAccess.getArrayAnnotationValueAccess().getGroup_1_1(), "rule__ArrayAnnotationValue__Group_1_1__0");
					put(grammarAccess.getSignedINTAccess().getGroup(), "rule__SignedINT__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getXorExpressionAccess().getGroup(), "rule__XorExpression__Group__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1(), "rule__XorExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup(), "rule__ShiftExpression__Group__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup_1(), "rule__ShiftExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMulExpressionAccess().getGroup(), "rule__MulExpression__Group__0");
					put(grammarAccess.getMulExpressionAccess().getGroup_1(), "rule__MulExpression__Group_1__0");
					put(grammarAccess.getCastExpressionAccess().getGroup_0(), "rule__CastExpression__Group_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup(), "rule__UnaryExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getFloatingPointLiteralAccess().getGroup_0(), "rule__FloatingPointLiteral__Group_0__0");
					put(grammarAccess.getFloatingPointLiteralAccess().getGroup_1(), "rule__FloatingPointLiteral__Group_1__0");
					put(grammarAccess.getFloatingPointLiteralAccess().getGroup_2(), "rule__FloatingPointLiteral__Group_2__0");
					put(grammarAccess.getFloatingPointLiteralAccess().getGroup_3(), "rule__FloatingPointLiteral__Group_3__0");
					put(grammarAccess.getExponentAccess().getGroup(), "rule__Exponent__Group__0");
					put(grammarAccess.getItfFileAccess().getIncludesAssignment_0(), "rule__ItfFile__IncludesAssignment_0");
					put(grammarAccess.getItfFileAccess().getConstantAssignment_1_0(), "rule__ItfFile__ConstantAssignment_1_0");
					put(grammarAccess.getItfFileAccess().getTypeAssignment_1_1(), "rule__ItfFile__TypeAssignment_1_1");
					put(grammarAccess.getItfFileAccess().getInterfaceAssignment_2(), "rule__ItfFile__InterfaceAssignment_2");
					put(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1(), "rule__TypedefSpecification__QualifedTypeAssignment_1");
					put(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2(), "rule__TypedefSpecification__DecAssignment_2");
					put(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0(), "rule__QualifiedTypeSpecification__TypeQualifierAssignment_0");
					put(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1(), "rule__QualifiedTypeSpecification__TypeSpecAssignment_1");
					put(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0(), "rule__TypeSpecification__TypeDefNameAssignment_0");
					put(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3(), "rule__TypeSpecification__TypeSpecifierAssignment_3");
					put(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0(), "rule__StructOrUnionDefinition__StructAssignment_0");
					put(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1(), "rule__StructOrUnionDefinition__IdAssignment_1");
					put(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3(), "rule__StructOrUnionDefinition__StructMemberAssignment_3");
					put(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0(), "rule__StructorUnionReference__StructAssignment_0");
					put(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1(), "rule__StructorUnionReference__IdAssignment_1");
					put(grammarAccess.getStructMemberAccess().getAnnotationsAssignment_0(), "rule__StructMember__AnnotationsAssignment_0");
					put(grammarAccess.getStructMemberAccess().getQualTypeAssignment_1(), "rule__StructMember__QualTypeAssignment_1");
					put(grammarAccess.getStructMemberAccess().getDecAssignment_2(), "rule__StructMember__DecAssignment_2");
					put(grammarAccess.getStructMemberAccess().getConstExprAssignment_3_1(), "rule__StructMember__ConstExprAssignment_3_1");
					put(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1(), "rule__EnumDefinition__IdAssignment_1");
					put(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3(), "rule__EnumDefinition__EnumMemberListAssignment_3");
					put(grammarAccess.getEnumReferenceAccess().getIdAssignment_1(), "rule__EnumReference__IdAssignment_1");
					put(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1(), "rule__EnumMemberList__EnumMemberAssignment_1_1");
					put(grammarAccess.getEnumMemberAccess().getAnnotationsAssignment_0(), "rule__EnumMember__AnnotationsAssignment_0");
					put(grammarAccess.getEnumMemberAccess().getIdAssignment_1(), "rule__EnumMember__IdAssignment_1");
					put(grammarAccess.getEnumMemberAccess().getConstExprAssignment_2_1(), "rule__EnumMember__ConstExprAssignment_2_1");
					put(grammarAccess.getDeclaratorsAccess().getDecAssignment_0(), "rule__Declarators__DecAssignment_0");
					put(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1(), "rule__Declarators__DeclaratorListAssignment_1_1");
					put(grammarAccess.getDeclaratorAccess().getPointerAssignment_0(), "rule__Declarator__PointerAssignment_0");
					put(grammarAccess.getDeclaratorAccess().getDcAssignment_1(), "rule__Declarator__DcAssignment_1");
					put(grammarAccess.getAbstractDeclaratorAccess().getPointerAssignment_0(), "rule__AbstractDeclarator__PointerAssignment_0");
					put(grammarAccess.getAbstractDeclaratorAccess().getDcAssignment_1(), "rule__AbstractDeclarator__DcAssignment_1");
					put(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerAssignment_1(), "rule__PointerSpecification__QualifiedPointerAssignment_1");
					put(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierAssignment_2(), "rule__Qualified_PointerSpecification__TypeQualifierAssignment_2");
					put(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0(), "rule__DirectDeclarator__IdAssignment_0_0");
					put(grammarAccess.getDirectDeclaratorAccess().getDecAssignment_0_1_1(), "rule__DirectDeclarator__DecAssignment_0_1_1");
					put(grammarAccess.getDirectDeclaratorAccess().getArrayAssignment_1(), "rule__DirectDeclarator__ArrayAssignment_1");
					put(grammarAccess.getAbstractDirectDeclaratorAccess().getDecAssignment_0_1(), "rule__AbstractDirectDeclarator__DecAssignment_0_1");
					put(grammarAccess.getAbstractDirectDeclaratorAccess().getArraysAssignment_0_3(), "rule__AbstractDirectDeclarator__ArraysAssignment_0_3");
					put(grammarAccess.getAbstractDirectDeclaratorAccess().getArrayAssignment_1(), "rule__AbstractDirectDeclarator__ArrayAssignment_1");
					put(grammarAccess.getArraySpecificationAccess().getConstExprAssignment_1(), "rule__ArraySpecification__ConstExprAssignment_1");
					put(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1(), "rule__ConstantDefinition__IdAssignment_1");
					put(grammarAccess.getConstantDefinitionAccess().getExprAssignment_2(), "rule__ConstantDefinition__ExprAssignment_2");
					put(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAssignment_0(), "rule__InterfaceDefinition__AnnotationsAssignment_0");
					put(grammarAccess.getInterfaceDefinitionAccess().getNameAssignment_3(), "rule__InterfaceDefinition__NameAssignment_3");
					put(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_4_1(), "rule__InterfaceDefinition__Fqn2Assignment_4_1");
					put(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_6(), "rule__InterfaceDefinition__MethodDefAssignment_6");
					put(grammarAccess.getMethodDefinitionAccess().getAnnotationsAssignment_0(), "rule__MethodDefinition__AnnotationsAssignment_0");
					put(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_1(), "rule__MethodDefinition__QualifiedTypeSpecAssignment_1");
					put(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationAssignment_2(), "rule__MethodDefinition__PointerSpecificationAssignment_2");
					put(grammarAccess.getMethodDefinitionAccess().getIdAssignment_3(), "rule__MethodDefinition__IdAssignment_3");
					put(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_4_1_1(), "rule__MethodDefinition__ParameterListAssignment_4_1_1");
					put(grammarAccess.getParameterListAccess().getParamAssignment_0(), "rule__ParameterList__ParamAssignment_0");
					put(grammarAccess.getParameterListAccess().getParamsAssignment_1_1(), "rule__ParameterList__ParamsAssignment_1_1");
					put(grammarAccess.getParameterAccess().getAnnotationsAssignment_0(), "rule__Parameter__AnnotationsAssignment_0");
					put(grammarAccess.getParameterAccess().getParameterQualifierAssignment_1(), "rule__Parameter__ParameterQualifierAssignment_1");
					put(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_2(), "rule__Parameter__QualifiedTypeSpecAssignment_2");
					put(grammarAccess.getParameterAccess().getDecAssignment_3_0(), "rule__Parameter__DecAssignment_3_0");
					put(grammarAccess.getParameterAccess().getAbsDecAssignment_3_1(), "rule__Parameter__AbsDecAssignment_3_1");
					put(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0(), "rule__IncludeDirective__ImportedURIAssignment_1_0");
					put(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1(), "rule__IncludeDirective__IncludeIDAssignment_1_1");
					put(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_1(), "rule__Annotations__AnnotationsAssignment_1");
					put(grammarAccess.getAnnotationAccess().getFqnAssignment_1(), "rule__Annotation__FqnAssignment_1");
					put(grammarAccess.getAnnotationAccess().getAnnotationParamatersAssignment_2(), "rule__Annotation__AnnotationParamatersAssignment_2");
					put(grammarAccess.getAnnotationParametersAccess().getValuePairAssignment_2_0(), "rule__AnnotationParameters__ValuePairAssignment_2_0");
					put(grammarAccess.getAnnotationParametersAccess().getValueAssignment_2_1(), "rule__AnnotationParameters__ValueAssignment_2_1");
					put(grammarAccess.getAnnotationValuePairsAccess().getFirstAssignment_0(), "rule__AnnotationValuePairs__FirstAssignment_0");
					put(grammarAccess.getAnnotationValuePairsAccess().getListValueAssignment_1_1(), "rule__AnnotationValuePairs__ListValueAssignment_1_1");
					put(grammarAccess.getAnnotationValuePairAccess().getIdAssignment_0(), "rule__AnnotationValuePair__IdAssignment_0");
					put(grammarAccess.getAnnotationValuePairAccess().getValueAssignment_2(), "rule__AnnotationValuePair__ValueAssignment_2");
					put(grammarAccess.getArrayAnnotationValueAccess().getFirstValueAssignment_1_0(), "rule__ArrayAnnotationValue__FirstValueAssignment_1_0");
					put(grammarAccess.getArrayAnnotationValueAccess().getValuesAssignment_1_1_1(), "rule__ArrayAnnotationValue__ValuesAssignment_1_1_1");
					put(grammarAccess.getLogicalOrExpressionAccess().getLeftExprAssignment_0(), "rule__LogicalOrExpression__LeftExprAssignment_0");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightExprAssignment_1_1(), "rule__LogicalOrExpression__RightExprAssignment_1_1");
					put(grammarAccess.getLogicalAndExpressionAccess().getLeftExprAssignment_0(), "rule__LogicalAndExpression__LeftExprAssignment_0");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightExprAssignment_1_1(), "rule__LogicalAndExpression__RightExprAssignment_1_1");
					put(grammarAccess.getOrExpressionAccess().getLeftExprAssignment_0(), "rule__OrExpression__LeftExprAssignment_0");
					put(grammarAccess.getOrExpressionAccess().getRightExprAssignment_1_1(), "rule__OrExpression__RightExprAssignment_1_1");
					put(grammarAccess.getXorExpressionAccess().getLeftExprAssignment_0(), "rule__XorExpression__LeftExprAssignment_0");
					put(grammarAccess.getXorExpressionAccess().getRightExprAssignment_1_1(), "rule__XorExpression__RightExprAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getLeftExprAssignment_0(), "rule__AndExpression__LeftExprAssignment_0");
					put(grammarAccess.getAndExpressionAccess().getRightExprAssignment_1_1(), "rule__AndExpression__RightExprAssignment_1_1");
					put(grammarAccess.getShiftExpressionAccess().getLeftExprAssignment_0(), "rule__ShiftExpression__LeftExprAssignment_0");
					put(grammarAccess.getShiftExpressionAccess().getOpAssignment_1_0(), "rule__ShiftExpression__OpAssignment_1_0");
					put(grammarAccess.getShiftExpressionAccess().getRightExprAssignment_1_1(), "rule__ShiftExpression__RightExprAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getLeftExprAssignment_0(), "rule__AdditiveExpression__LeftExprAssignment_0");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_0(), "rule__AdditiveExpression__OpAssignment_1_0");
					put(grammarAccess.getAdditiveExpressionAccess().getRightExprAssignment_1_1(), "rule__AdditiveExpression__RightExprAssignment_1_1");
					put(grammarAccess.getMulExpressionAccess().getLeftExprAssignment_0(), "rule__MulExpression__LeftExprAssignment_0");
					put(grammarAccess.getMulExpressionAccess().getOpAssignment_1_0(), "rule__MulExpression__OpAssignment_1_0");
					put(grammarAccess.getMulExpressionAccess().getRightExprAssignment_1_1(), "rule__MulExpression__RightExprAssignment_1_1");
					put(grammarAccess.getCastExpressionAccess().getTypeAssignment_0_1(), "rule__CastExpression__TypeAssignment_0_1");
					put(grammarAccess.getCastExpressionAccess().getExprAssignment_0_3(), "rule__CastExpression__ExprAssignment_0_3");
					put(grammarAccess.getCastExpressionAccess().getUnaryExprAssignment_1(), "rule__CastExpression__UnaryExprAssignment_1");
					put(grammarAccess.getUnaryExpressionAccess().getUnaryExprAssignment_0(), "rule__UnaryExpression__UnaryExprAssignment_0");
					put(grammarAccess.getUnaryExpressionAccess().getPrimaryExprAssignment_1(), "rule__UnaryExpression__PrimaryExprAssignment_1");
					put(grammarAccess.getPrimaryExpressionAccess().getLiteralAssignment_0(), "rule__PrimaryExpression__LiteralAssignment_0");
					put(grammarAccess.getLiteralAccess().getRefAssignment_3(), "rule__Literal__RefAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr.internal.InternalFractalItfParser typedParser = (org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr.internal.InternalFractalItfParser) parser;
			typedParser.entryRuleItfFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FractalItfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FractalItfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}