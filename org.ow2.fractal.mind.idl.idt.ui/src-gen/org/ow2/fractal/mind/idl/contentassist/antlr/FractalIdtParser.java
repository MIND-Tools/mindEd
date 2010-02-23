/*
* generated by Xtext
*/
package org.ow2.fractal.mind.idl.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess;

public class FractalIdtParser extends AbstractContentAssistParser {
	
	@Inject
	private FractalIdtGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtParser createParser() {
		org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtParser result = new org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getIdtFileAccess().getAlternatives_3(), "rule__IdtFile__Alternatives_3");
					put(grammarAccess.getItfFileAccess().getAlternatives_1(), "rule__ItfFile__Alternatives_1");
					put(grammarAccess.getTypeDefinitionAccess().getAlternatives_0(), "rule__TypeDefinition__Alternatives_0");
					put(grammarAccess.getTypeSpecificationAccess().getAlternatives(), "rule__TypeSpecification__Alternatives");
					put(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives(), "rule__StructOrUnionSpecification__Alternatives");
					put(grammarAccess.getStructOrUnionAccess().getAlternatives(), "rule__StructOrUnion__Alternatives");
					put(grammarAccess.getEnumSpecificationAccess().getAlternatives(), "rule__EnumSpecification__Alternatives");
					put(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0(), "rule__DirectDeclarator__Alternatives_0");
					put(grammarAccess.getArraySpecificationAccess().getAlternatives_1(), "rule__ArraySpecification__Alternatives_1");
					put(grammarAccess.getMethodDefinitionAccess().getAlternatives_2(), "rule__MethodDefinition__Alternatives_2");
					put(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1(), "rule__IncludeDirective__Alternatives_1");
					put(grammarAccess.getTypeQualifierAccess().getAlternatives(), "rule__TypeQualifier__Alternatives");
					put(grammarAccess.getTypeSpecifierAccess().getAlternatives(), "rule__TypeSpecifier__Alternatives");
					put(grammarAccess.getParameterQualifierAccess().getAlternatives(), "rule__ParameterQualifier__Alternatives");
					put(grammarAccess.getIdtFileAccess().getGroup(), "rule__IdtFile__Group__0");
					put(grammarAccess.getConstantDefinitionBeginAccess().getGroup(), "rule__ConstantDefinitionBegin__Group__0");
					put(grammarAccess.getConstantDefinitionEndAccess().getGroup(), "rule__ConstantDefinitionEnd__Group__0");
					put(grammarAccess.getItfFileAccess().getGroup(), "rule__ItfFile__Group__0");
					put(grammarAccess.getTypeDefinitionAccess().getGroup(), "rule__TypeDefinition__Group__0");
					put(grammarAccess.getTypedefSpecificationAccess().getGroup(), "rule__TypedefSpecification__Group__0");
					put(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup(), "rule__QualifiedTypeSpecification__Group__0");
					put(grammarAccess.getStructOrUnionDefinitionAccess().getGroup(), "rule__StructOrUnionDefinition__Group__0");
					put(grammarAccess.getStructorUnionReferenceAccess().getGroup(), "rule__StructorUnionReference__Group__0");
					put(grammarAccess.getStructMemberAccess().getGroup(), "rule__StructMember__Group__0");
					put(grammarAccess.getStructMemberAccess().getGroup_2(), "rule__StructMember__Group_2__0");
					put(grammarAccess.getEnumDefinitionAccess().getGroup(), "rule__EnumDefinition__Group__0");
					put(grammarAccess.getEnumReferenceAccess().getGroup(), "rule__EnumReference__Group__0");
					put(grammarAccess.getEnumMemberListAccess().getGroup(), "rule__EnumMemberList__Group__0");
					put(grammarAccess.getEnumMemberListAccess().getGroup_1(), "rule__EnumMemberList__Group_1__0");
					put(grammarAccess.getEnumMemberAccess().getGroup(), "rule__EnumMember__Group__0");
					put(grammarAccess.getEnumMemberAccess().getGroup_1(), "rule__EnumMember__Group_1__0");
					put(grammarAccess.getDeclaratorsAccess().getGroup(), "rule__Declarators__Group__0");
					put(grammarAccess.getDeclaratorsAccess().getGroup_1(), "rule__Declarators__Group_1__0");
					put(grammarAccess.getDeclaratorAccess().getGroup(), "rule__Declarator__Group__0");
					put(grammarAccess.getDeclaratorAccess().getGroup_0(), "rule__Declarator__Group_0__0");
					put(grammarAccess.getDirectDeclaratorAccess().getGroup(), "rule__DirectDeclarator__Group__0");
					put(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1(), "rule__DirectDeclarator__Group_0_1__0");
					put(grammarAccess.getArraySpecificationAccess().getGroup(), "rule__ArraySpecification__Group__0");
					put(grammarAccess.getFullyQualifiedNameAccess().getGroup(), "rule__FullyQualifiedName__Group__0");
					put(grammarAccess.getFullyQualifiedNameAccess().getGroup_1(), "rule__FullyQualifiedName__Group_1__0");
					put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
					put(grammarAccess.getInterfaceDefinitionAccess().getGroup(), "rule__InterfaceDefinition__Group__0");
					put(grammarAccess.getInterfaceDefinitionAccess().getGroup_3(), "rule__InterfaceDefinition__Group_3__0");
					put(grammarAccess.getMethodDefinitionAccess().getGroup(), "rule__MethodDefinition__Group__0");
					put(grammarAccess.getMethodDefinitionAccess().getGroup_2_0(), "rule__MethodDefinition__Group_2_0__0");
					put(grammarAccess.getMethodDefinitionAccess().getGroup_2_1(), "rule__MethodDefinition__Group_2_1__0");
					put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
					put(grammarAccess.getParameterListAccess().getGroup_1(), "rule__ParameterList__Group_1__0");
					put(grammarAccess.getParameterListAccess().getGroup_2(), "rule__ParameterList__Group_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getIncludeDirectiveAccess().getGroup(), "rule__IncludeDirective__Group__0");
					put(grammarAccess.getIdtFileAccess().getBegindefAssignment_0(), "rule__IdtFile__BegindefAssignment_0");
					put(grammarAccess.getIdtFileAccess().getDefAssignment_1(), "rule__IdtFile__DefAssignment_1");
					put(grammarAccess.getIdtFileAccess().getIncludesAssignment_2(), "rule__IdtFile__IncludesAssignment_2");
					put(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0(), "rule__IdtFile__ConstantAssignment_3_0");
					put(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1(), "rule__IdtFile__TypeAssignment_3_1");
					put(grammarAccess.getIdtFileAccess().getEnddefAssignment_4(), "rule__IdtFile__EnddefAssignment_4");
					put(grammarAccess.getConstantDefinitionBeginAccess().getIdAssignment_1(), "rule__ConstantDefinitionBegin__IdAssignment_1");
					put(grammarAccess.getConstantDefinitionEndAccess().getIdAssignment_1(), "rule__ConstantDefinitionEnd__IdAssignment_1");
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
					put(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0(), "rule__StructMember__QualTypeAssignment_0");
					put(grammarAccess.getStructMemberAccess().getDecAssignment_1(), "rule__StructMember__DecAssignment_1");
					put(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1(), "rule__EnumDefinition__IdAssignment_1");
					put(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3(), "rule__EnumDefinition__EnumMemberListAssignment_3");
					put(grammarAccess.getEnumReferenceAccess().getIdAssignment_1(), "rule__EnumReference__IdAssignment_1");
					put(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1(), "rule__EnumMemberList__EnumMemberAssignment_1_1");
					put(grammarAccess.getEnumMemberAccess().getIdAssignment_0(), "rule__EnumMember__IdAssignment_0");
					put(grammarAccess.getDeclaratorsAccess().getDecAssignment_0(), "rule__Declarators__DecAssignment_0");
					put(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1(), "rule__Declarators__DeclaratorListAssignment_1_1");
					put(grammarAccess.getDeclaratorAccess().getTypeQualifierAssignment_0_1(), "rule__Declarator__TypeQualifierAssignment_0_1");
					put(grammarAccess.getDeclaratorAccess().getDcAssignment_1(), "rule__Declarator__DcAssignment_1");
					put(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0(), "rule__DirectDeclarator__IdAssignment_0_0");
					put(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1(), "rule__ConstantDefinition__IdAssignment_1");
					put(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2(), "rule__InterfaceDefinition__FqnAssignment_2");
					put(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_3_1(), "rule__InterfaceDefinition__Fqn2Assignment_3_1");
					put(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5(), "rule__InterfaceDefinition__MethodDefAssignment_5");
					put(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0(), "rule__MethodDefinition__QualifiedTypeSpecAssignment_0");
					put(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1(), "rule__MethodDefinition__IdAssignment_1");
					put(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1(), "rule__MethodDefinition__ParameterListAssignment_2_1_1");
					put(grammarAccess.getParameterListAccess().getParamAssignment_0(), "rule__ParameterList__ParamAssignment_0");
					put(grammarAccess.getParameterListAccess().getParamsAssignment_1_1(), "rule__ParameterList__ParamsAssignment_1_1");
					put(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0(), "rule__Parameter__ParameterQualifierAssignment_0");
					put(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1(), "rule__Parameter__QualifiedTypeSpecAssignment_1");
					put(grammarAccess.getParameterAccess().getDecAssignment_2(), "rule__Parameter__DecAssignment_2");
					put(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0(), "rule__IncludeDirective__ImportedURIAssignment_1_0");
					put(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1(), "rule__IncludeDirective__IncludeIDAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtParser typedParser = (org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtParser) parser;
			typedParser.entryRuleIdtFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FractalIdtGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FractalIdtGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
