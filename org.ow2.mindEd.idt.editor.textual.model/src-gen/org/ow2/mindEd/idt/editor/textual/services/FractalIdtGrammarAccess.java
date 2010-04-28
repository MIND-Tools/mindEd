/*
* generated by Xtext
*/

package org.ow2.mindEd.idt.editor.textual.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.ow2.mindEd.itf.editor.textual.services.FractalItfGrammarAccess;

@Singleton
public class FractalIdtGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class IdtFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IdtFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBegindefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBegindefConstantDefinitionBeginParserRuleCall_0_0 = (RuleCall)cBegindefAssignment_0.eContents().get(0);
		private final Assignment cDefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDefConstantDefinitionParserRuleCall_1_0 = (RuleCall)cDefAssignment_1.eContents().get(0);
		private final Assignment cIncludesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIncludesIncludeDirectiveParserRuleCall_2_0 = (RuleCall)cIncludesAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cConstantAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cConstantConstantDefinitionParserRuleCall_3_0_0 = (RuleCall)cConstantAssignment_3_0.eContents().get(0);
		private final Assignment cTypeAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cTypeTypeDefinitionParserRuleCall_3_1_0 = (RuleCall)cTypeAssignment_3_1.eContents().get(0);
		private final Assignment cEnddefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEnddefConstantDefinitionEndParserRuleCall_4_0 = (RuleCall)cEnddefAssignment_4.eContents().get(0);
		
		//IdtFile:
		//  begindef=ConstantDefinitionBegin def=ConstantDefinition includes+=IncludeDirective
		//  * (constant+=ConstantDefinition|type+=TypeDefinition)* enddef=
		//  ConstantDefinitionEnd;
		public ParserRule getRule() { return rule; }

		//begindef=ConstantDefinitionBegin def=ConstantDefinition includes+=IncludeDirective
		// * (constant+=ConstantDefinition|type+=TypeDefinition)* enddef=
		//ConstantDefinitionEnd
		public Group getGroup() { return cGroup; }

		//begindef=ConstantDefinitionBegin
		public Assignment getBegindefAssignment_0() { return cBegindefAssignment_0; }

		//ConstantDefinitionBegin
		public RuleCall getBegindefConstantDefinitionBeginParserRuleCall_0_0() { return cBegindefConstantDefinitionBeginParserRuleCall_0_0; }

		//def=ConstantDefinition
		public Assignment getDefAssignment_1() { return cDefAssignment_1; }

		//ConstantDefinition
		public RuleCall getDefConstantDefinitionParserRuleCall_1_0() { return cDefConstantDefinitionParserRuleCall_1_0; }

		//includes+=IncludeDirective*
		public Assignment getIncludesAssignment_2() { return cIncludesAssignment_2; }

		//IncludeDirective
		public RuleCall getIncludesIncludeDirectiveParserRuleCall_2_0() { return cIncludesIncludeDirectiveParserRuleCall_2_0; }

		//(constant+=ConstantDefinition|type+=TypeDefinition)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//constant+=ConstantDefinition
		public Assignment getConstantAssignment_3_0() { return cConstantAssignment_3_0; }

		//ConstantDefinition
		public RuleCall getConstantConstantDefinitionParserRuleCall_3_0_0() { return cConstantConstantDefinitionParserRuleCall_3_0_0; }

		//type+=TypeDefinition
		public Assignment getTypeAssignment_3_1() { return cTypeAssignment_3_1; }

		//TypeDefinition
		public RuleCall getTypeTypeDefinitionParserRuleCall_3_1_0() { return cTypeTypeDefinitionParserRuleCall_3_1_0; }

		//enddef=ConstantDefinitionEnd
		public Assignment getEnddefAssignment_4() { return cEnddefAssignment_4; }

		//ConstantDefinitionEnd
		public RuleCall getEnddefConstantDefinitionEndParserRuleCall_4_0() { return cEnddefConstantDefinitionEndParserRuleCall_4_0; }
	}

	public class ConstantDefinitionBeginElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConstantDefinitionBegin");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfndefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//ConstantDefinitionBegin:
		//  "#ifndef" id=ID;
		public ParserRule getRule() { return rule; }

		//"#ifndef" id=ID
		public Group getGroup() { return cGroup; }

		//"#ifndef"
		public Keyword getIfndefKeyword_0() { return cIfndefKeyword_0; }

		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
	}

	public class ConstantDefinitionEndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConstantDefinitionEnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndifKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//ConstantDefinitionEnd:
		//  "#endif" id=ID;
		public ParserRule getRule() { return rule; }

		//"#endif" id=ID
		public Group getGroup() { return cGroup; }

		//"#endif"
		public Keyword getEndifKeyword_0() { return cEndifKeyword_0; }

		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
	}
	
	
	private IdtFileElements pIdtFile;
	private ConstantDefinitionBeginElements pConstantDefinitionBegin;
	private ConstantDefinitionEndElements pConstantDefinitionEnd;
	
	private final GrammarProvider grammarProvider;

	private FractalItfGrammarAccess gaFractalItf;

	@Inject
	public FractalIdtGrammarAccess(GrammarProvider grammarProvider,
		FractalItfGrammarAccess gaFractalItf) {
		this.grammarProvider = grammarProvider;
		this.gaFractalItf = gaFractalItf;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public FractalItfGrammarAccess getFractalItfGrammarAccess() {
		return gaFractalItf;
	}

	
	//IdtFile:
	//  begindef=ConstantDefinitionBegin def=ConstantDefinition includes+=IncludeDirective
	//  * (constant+=ConstantDefinition|type+=TypeDefinition)* enddef=
	//  ConstantDefinitionEnd;
	public IdtFileElements getIdtFileAccess() {
		return (pIdtFile != null) ? pIdtFile : (pIdtFile = new IdtFileElements());
	}
	
	public ParserRule getIdtFileRule() {
		return getIdtFileAccess().getRule();
	}

	//ConstantDefinitionBegin:
	//  "#ifndef" id=ID;
	public ConstantDefinitionBeginElements getConstantDefinitionBeginAccess() {
		return (pConstantDefinitionBegin != null) ? pConstantDefinitionBegin : (pConstantDefinitionBegin = new ConstantDefinitionBeginElements());
	}
	
	public ParserRule getConstantDefinitionBeginRule() {
		return getConstantDefinitionBeginAccess().getRule();
	}

	//ConstantDefinitionEnd:
	//  "#endif" id=ID;
	public ConstantDefinitionEndElements getConstantDefinitionEndAccess() {
		return (pConstantDefinitionEnd != null) ? pConstantDefinitionEnd : (pConstantDefinitionEnd = new ConstantDefinitionEndElements());
	}
	
	public ParserRule getConstantDefinitionEndRule() {
		return getConstantDefinitionEndAccess().getRule();
	}

	//ItfFile:
	//  includes+=IncludeDirective* (constant+=ConstantDefinition|type+=TypeDefinition)*
	//  interface=InterfaceDefinition ";"?;   // itf definition
	//
	//
	//
	//    
	//        // Type definition part
	public FractalItfGrammarAccess.ItfFileElements getItfFileAccess() {
		return gaFractalItf.getItfFileAccess();
	}
	
	public ParserRule getItfFileRule() {
		return getItfFileAccess().getRule();
	}

	//TypeDefinition:
	//  (TypedefSpecification|StructOrUnionSpecification|EnumSpecification) ";";   // Type definition part
	public FractalItfGrammarAccess.TypeDefinitionElements getTypeDefinitionAccess() {
		return gaFractalItf.getTypeDefinitionAccess();
	}
	
	public ParserRule getTypeDefinitionRule() {
		return getTypeDefinitionAccess().getRule();
	}

	//TypedefSpecification:
	//  "typedef" qualifedType=QualifiedTypeSpecification dec=Declarators;
	public FractalItfGrammarAccess.TypedefSpecificationElements getTypedefSpecificationAccess() {
		return gaFractalItf.getTypedefSpecificationAccess();
	}
	
	public ParserRule getTypedefSpecificationRule() {
		return getTypedefSpecificationAccess().getRule();
	}

	//QualifiedTypeSpecification:
	//  typeQualifier+=TypeQualifier* typeSpec=TypeSpecification;
	public FractalItfGrammarAccess.QualifiedTypeSpecificationElements getQualifiedTypeSpecificationAccess() {
		return gaFractalItf.getQualifiedTypeSpecificationAccess();
	}
	
	public ParserRule getQualifiedTypeSpecificationRule() {
		return getQualifiedTypeSpecificationAccess().getRule();
	}

	//enum TypeQualifier:
	//  const | volatile;
	public FractalItfGrammarAccess.TypeQualifierElements getTypeQualifierAccess() {
		return gaFractalItf.getTypeQualifierAccess();
	}
	
	public EnumRule getTypeQualifierRule() {
		return getTypeQualifierAccess().getRule();
	}

	//TypeSpecification:
	//  typeDefName=TypedefName|StructOrUnionSpecification|EnumSpecification|
	//  typeSpecifier+=TypeSpecifier+;
	public FractalItfGrammarAccess.TypeSpecificationElements getTypeSpecificationAccess() {
		return gaFractalItf.getTypeSpecificationAccess();
	}
	
	public ParserRule getTypeSpecificationRule() {
		return getTypeSpecificationAccess().getRule();
	}

	//TypedefName returns ecore::EString:
	//  FullyQualifiedName;
	public FractalItfGrammarAccess.TypedefNameElements getTypedefNameAccess() {
		return gaFractalItf.getTypedefNameAccess();
	}
	
	public ParserRule getTypedefNameRule() {
		return getTypedefNameAccess().getRule();
	}

	//enum TypeSpecifier:
	//  void | char | short | int | long | float | double | signed | unsigned | string | int8_t | uint8_t |
	//  int16_t | uint16_t | int32_t | uint32_t | int64_t | uint64_t | intptr_t | uintptr_t;
	public FractalItfGrammarAccess.TypeSpecifierElements getTypeSpecifierAccess() {
		return gaFractalItf.getTypeSpecifierAccess();
	}
	
	public EnumRule getTypeSpecifierRule() {
		return getTypeSpecifierAccess().getRule();
	}

	//StructOrUnionSpecification:
	//  StructOrUnionDefinition|StructorUnionReference;
	public FractalItfGrammarAccess.StructOrUnionSpecificationElements getStructOrUnionSpecificationAccess() {
		return gaFractalItf.getStructOrUnionSpecificationAccess();
	}
	
	public ParserRule getStructOrUnionSpecificationRule() {
		return getStructOrUnionSpecificationAccess().getRule();
	}

	//StructOrUnionDefinition:
	//  struct=StructOrUnion id=ID? "{" structMember+=StructMember* "}";
	public FractalItfGrammarAccess.StructOrUnionDefinitionElements getStructOrUnionDefinitionAccess() {
		return gaFractalItf.getStructOrUnionDefinitionAccess();
	}
	
	public ParserRule getStructOrUnionDefinitionRule() {
		return getStructOrUnionDefinitionAccess().getRule();
	}

	//StructorUnionReference:
	//  struct=StructOrUnion id=ID;
	public FractalItfGrammarAccess.StructorUnionReferenceElements getStructorUnionReferenceAccess() {
		return gaFractalItf.getStructorUnionReferenceAccess();
	}
	
	public ParserRule getStructorUnionReferenceRule() {
		return getStructorUnionReferenceAccess().getRule();
	}

	//StructOrUnion returns ecore::EString:
	//  "struct"|"union";
	public FractalItfGrammarAccess.StructOrUnionElements getStructOrUnionAccess() {
		return gaFractalItf.getStructOrUnionAccess();
	}
	
	public ParserRule getStructOrUnionRule() {
		return getStructOrUnionAccess().getRule();
	}

	//StructMember:
	//  annotations=Annotations qualType=QualifiedTypeSpecification dec=Declarators (":"
	//  constExpr=ConstantExpression)? ";";
	public FractalItfGrammarAccess.StructMemberElements getStructMemberAccess() {
		return gaFractalItf.getStructMemberAccess();
	}
	
	public ParserRule getStructMemberRule() {
		return getStructMemberAccess().getRule();
	}

	//EnumSpecification:
	//  EnumDefinition|EnumReference;
	public FractalItfGrammarAccess.EnumSpecificationElements getEnumSpecificationAccess() {
		return gaFractalItf.getEnumSpecificationAccess();
	}
	
	public ParserRule getEnumSpecificationRule() {
		return getEnumSpecificationAccess().getRule();
	}

	//EnumDefinition:
	//  "enum" id=ID? "{" enumMemberList=EnumMemberList "}";
	public FractalItfGrammarAccess.EnumDefinitionElements getEnumDefinitionAccess() {
		return gaFractalItf.getEnumDefinitionAccess();
	}
	
	public ParserRule getEnumDefinitionRule() {
		return getEnumDefinitionAccess().getRule();
	}

	//EnumReference:
	//  "enum" id=ID;
	public FractalItfGrammarAccess.EnumReferenceElements getEnumReferenceAccess() {
		return gaFractalItf.getEnumReferenceAccess();
	}
	
	public ParserRule getEnumReferenceRule() {
		return getEnumReferenceAccess().getRule();
	}

	//EnumMemberList:
	//  EnumMember ("," enumMember+=EnumMember)*;
	public FractalItfGrammarAccess.EnumMemberListElements getEnumMemberListAccess() {
		return gaFractalItf.getEnumMemberListAccess();
	}
	
	public ParserRule getEnumMemberListRule() {
		return getEnumMemberListAccess().getRule();
	}

	//EnumMember:
	//  annotations=Annotations id=ID ("=" constExpr=ConstantExpression)?;
	public FractalItfGrammarAccess.EnumMemberElements getEnumMemberAccess() {
		return gaFractalItf.getEnumMemberAccess();
	}
	
	public ParserRule getEnumMemberRule() {
		return getEnumMemberAccess().getRule();
	}

	//Declarators:
	//  dec=Declarator ("," declaratorList+=Declarator)*;
	public FractalItfGrammarAccess.DeclaratorsElements getDeclaratorsAccess() {
		return gaFractalItf.getDeclaratorsAccess();
	}
	
	public ParserRule getDeclaratorsRule() {
		return getDeclaratorsAccess().getRule();
	}

	//Declarator:
	//  pointer=PointerSpecification dc=DirectDeclarator;
	public FractalItfGrammarAccess.DeclaratorElements getDeclaratorAccess() {
		return gaFractalItf.getDeclaratorAccess();
	}
	
	public ParserRule getDeclaratorRule() {
		return getDeclaratorAccess().getRule();
	}

	//AbstractDeclarator:
	//  pointer=PointerSpecification dc=AbstractDirectDeclarator?;
	public FractalItfGrammarAccess.AbstractDeclaratorElements getAbstractDeclaratorAccess() {
		return gaFractalItf.getAbstractDeclaratorAccess();
	}
	
	public ParserRule getAbstractDeclaratorRule() {
		return getAbstractDeclaratorAccess().getRule();
	}

	//PointerSpecification:
	//  {PointerSpecification} qualifiedPointer+=Qualified_PointerSpecification*;
	public FractalItfGrammarAccess.PointerSpecificationElements getPointerSpecificationAccess() {
		return gaFractalItf.getPointerSpecificationAccess();
	}
	
	public ParserRule getPointerSpecificationRule() {
		return getPointerSpecificationAccess().getRule();
	}

	//Qualified_PointerSpecification:
	//  {Qualified_PointerSpecification} "*" typeQualifier+=TypeQualifier*;
	public FractalItfGrammarAccess.Qualified_PointerSpecificationElements getQualified_PointerSpecificationAccess() {
		return gaFractalItf.getQualified_PointerSpecificationAccess();
	}
	
	public ParserRule getQualified_PointerSpecificationRule() {
		return getQualified_PointerSpecificationAccess().getRule();
	}

	//DirectDeclarator:
	//  (id=ID|"(" dec=Declarator ")") array+=ArraySpecification*;
	public FractalItfGrammarAccess.DirectDeclaratorElements getDirectDeclaratorAccess() {
		return gaFractalItf.getDirectDeclaratorAccess();
	}
	
	public ParserRule getDirectDeclaratorRule() {
		return getDirectDeclaratorAccess().getRule();
	}

	//AbstractDirectDeclarator:
	//  "(" dec=AbstractDeclarator ")" arrays+=ArraySpecification*|array+=
	//  ArraySpecification+;
	public FractalItfGrammarAccess.AbstractDirectDeclaratorElements getAbstractDirectDeclaratorAccess() {
		return gaFractalItf.getAbstractDirectDeclaratorAccess();
	}
	
	public ParserRule getAbstractDirectDeclaratorRule() {
		return getAbstractDirectDeclaratorAccess().getRule();
	}

	//ArraySpecification:
	//  "[" constExpr=ConstantExpression? "]";
	public FractalItfGrammarAccess.ArraySpecificationElements getArraySpecificationAccess() {
		return gaFractalItf.getArraySpecificationAccess();
	}
	
	public ParserRule getArraySpecificationRule() {
		return getArraySpecificationAccess().getRule();
	}

	//FullyQualifiedName returns ecore::EString:
	//  ID ("." ID)*; 
	//
	//
	//        // Interface definition part
	public FractalItfGrammarAccess.FullyQualifiedNameElements getFullyQualifiedNameAccess() {
		return gaFractalItf.getFullyQualifiedNameAccess();
	}
	
	public ParserRule getFullyQualifiedNameRule() {
		return getFullyQualifiedNameAccess().getRule();
	}

	//ConstantDefinition:
	//  "#define" id=ID expr=ConstantExpression?;   // Interface definition part
	public FractalItfGrammarAccess.ConstantDefinitionElements getConstantDefinitionAccess() {
		return gaFractalItf.getConstantDefinitionAccess();
	}
	
	public ParserRule getConstantDefinitionRule() {
		return getConstantDefinitionAccess().getRule();
	}

	//InterfaceDefinition:
	//  annotations=Annotations "interface" "unmanaged"? fqn=FullyQualifiedName (":" fqn2=
	//  FullyQualifiedName)? "{" methodDef+=MethodDefinition* "}";
	public FractalItfGrammarAccess.InterfaceDefinitionElements getInterfaceDefinitionAccess() {
		return gaFractalItf.getInterfaceDefinitionAccess();
	}
	
	public ParserRule getInterfaceDefinitionRule() {
		return getInterfaceDefinitionAccess().getRule();
	}

	//MethodDefinition:
	//  annotations=Annotations qualifiedTypeSpec=QualifiedTypeSpecification
	//  pointerSpecification=PointerSpecification id=ID ("(" "void"? ")"|"(" ParameterList=
	//  ParameterList ")") ";";
	public FractalItfGrammarAccess.MethodDefinitionElements getMethodDefinitionAccess() {
		return gaFractalItf.getMethodDefinitionAccess();
	}
	
	public ParserRule getMethodDefinitionRule() {
		return getMethodDefinitionAccess().getRule();
	}

	//ParameterList:
	//  param=Parameter ("," params+=Parameter)* ("," "...")?;
	public FractalItfGrammarAccess.ParameterListElements getParameterListAccess() {
		return gaFractalItf.getParameterListAccess();
	}
	
	public ParserRule getParameterListRule() {
		return getParameterListAccess().getRule();
	}

	//Parameter:
	//  annotations=Annotations ParameterQualifier+=ParameterQualifier* qualifiedTypeSpec=
	//  QualifiedTypeSpecification (dec=Declarator|absDec=AbstractDeclarator);
	public FractalItfGrammarAccess.ParameterElements getParameterAccess() {
		return gaFractalItf.getParameterAccess();
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//enum ParameterQualifier:
	//  in | out; 
	//
	//  
	//        // include directive
	public FractalItfGrammarAccess.ParameterQualifierElements getParameterQualifierAccess() {
		return gaFractalItf.getParameterQualifierAccess();
	}
	
	public EnumRule getParameterQualifierRule() {
		return getParameterQualifierAccess().getRule();
	}

	//IncludeDirective:
	//  "#include" (importedURI=STRING|includeID=IncludeLib);   // include directive
	public FractalItfGrammarAccess.IncludeDirectiveElements getIncludeDirectiveAccess() {
		return gaFractalItf.getIncludeDirectiveAccess();
	}
	
	public ParserRule getIncludeDirectiveRule() {
		return getIncludeDirectiveAccess().getRule();
	}

	//terminal IncludeLib:
	//  "<" ID "." ID ">";
	public TerminalRule getIncludeLibRule() {
		return gaFractalItf.getIncludeLibRule();
	} 

	//Annotations:
	//  {Annotations} annotations+=Annotation*;
	public FractalItfGrammarAccess.AnnotationsElements getAnnotationsAccess() {
		return gaFractalItf.getAnnotationsAccess();
	}
	
	public ParserRule getAnnotationsRule() {
		return getAnnotationsAccess().getRule();
	}

	//Annotation:
	//  "@" fqn=FullyQualifiedName annotationParamaters=AnnotationParameters?;
	public FractalItfGrammarAccess.AnnotationElements getAnnotationAccess() {
		return gaFractalItf.getAnnotationAccess();
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//AnnotationParameters:
	//  {AnnotationParameters} "(" (valuePair=AnnotationValuePairs|value=AnnotationValue)?
	//  ")";
	public FractalItfGrammarAccess.AnnotationParametersElements getAnnotationParametersAccess() {
		return gaFractalItf.getAnnotationParametersAccess();
	}
	
	public ParserRule getAnnotationParametersRule() {
		return getAnnotationParametersAccess().getRule();
	}

	//AnnotationValuePairs:
	//  first=AnnotationValuePair ("," listValue+=AnnotationValuePair)*;
	public FractalItfGrammarAccess.AnnotationValuePairsElements getAnnotationValuePairsAccess() {
		return gaFractalItf.getAnnotationValuePairsAccess();
	}
	
	public ParserRule getAnnotationValuePairsRule() {
		return getAnnotationValuePairsAccess().getRule();
	}

	//AnnotationValuePair:
	//  id=ID "=" value=AnnotationValue;
	public FractalItfGrammarAccess.AnnotationValuePairElements getAnnotationValuePairAccess() {
		return gaFractalItf.getAnnotationValuePairAccess();
	}
	
	public ParserRule getAnnotationValuePairRule() {
		return getAnnotationValuePairAccess().getRule();
	}

	//AnnotationValue:
	//  signedINT|"null"|Boolean|ID|Annotation|ArrayAnnotationValue|STRING;
	public FractalItfGrammarAccess.AnnotationValueElements getAnnotationValueAccess() {
		return gaFractalItf.getAnnotationValueAccess();
	}
	
	public ParserRule getAnnotationValueRule() {
		return getAnnotationValueAccess().getRule();
	}

	//ArrayAnnotationValue:
	//  "{" (firstValue=AnnotationValue ("," values+=AnnotationValue)*)? "}";
	public FractalItfGrammarAccess.ArrayAnnotationValueElements getArrayAnnotationValueAccess() {
		return gaFractalItf.getArrayAnnotationValueAccess();
	}
	
	public ParserRule getArrayAnnotationValueRule() {
		return getArrayAnnotationValueAccess().getRule();
	}

	//terminal Boolean:
	//  "true" | "false";
	public TerminalRule getBooleanRule() {
		return gaFractalItf.getBooleanRule();
	} 

	//signedINT returns ecore::EString:
	//  AdditiveOperation? INT;
	public FractalItfGrammarAccess.SignedINTElements getSignedINTAccess() {
		return gaFractalItf.getSignedINTAccess();
	}
	
	public ParserRule getSignedINTRule() {
		return getSignedINTAccess().getRule();
	}

	//ConstantExpression:
	//  LogicalOrExpression;
	public FractalItfGrammarAccess.ConstantExpressionElements getConstantExpressionAccess() {
		return gaFractalItf.getConstantExpressionAccess();
	}
	
	public ParserRule getConstantExpressionRule() {
		return getConstantExpressionAccess().getRule();
	}

	//LogicalOrExpression:
	//  leftExpr=LogicalAndExpression ("||" rightExpr=LogicalOrExpression)?;
	public FractalItfGrammarAccess.LogicalOrExpressionElements getLogicalOrExpressionAccess() {
		return gaFractalItf.getLogicalOrExpressionAccess();
	}
	
	public ParserRule getLogicalOrExpressionRule() {
		return getLogicalOrExpressionAccess().getRule();
	}

	//LogicalAndExpression:
	//  leftExpr=OrExpression ("&&" rightExpr=LogicalAndExpression)?;
	public FractalItfGrammarAccess.LogicalAndExpressionElements getLogicalAndExpressionAccess() {
		return gaFractalItf.getLogicalAndExpressionAccess();
	}
	
	public ParserRule getLogicalAndExpressionRule() {
		return getLogicalAndExpressionAccess().getRule();
	}

	//OrExpression:
	//  leftExpr=XorExpression ("|" rightExpr=OrExpression)?;
	public FractalItfGrammarAccess.OrExpressionElements getOrExpressionAccess() {
		return gaFractalItf.getOrExpressionAccess();
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}

	//XorExpression:
	//  leftExpr=AndExpression ("^" rightExpr=XorExpression)?;
	public FractalItfGrammarAccess.XorExpressionElements getXorExpressionAccess() {
		return gaFractalItf.getXorExpressionAccess();
	}
	
	public ParserRule getXorExpressionRule() {
		return getXorExpressionAccess().getRule();
	}

	//AndExpression:
	//  leftExpr=ShiftExpression ("&" rightExpr=AndExpression)?;
	public FractalItfGrammarAccess.AndExpressionElements getAndExpressionAccess() {
		return gaFractalItf.getAndExpressionAccess();
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}

	//ShiftExpression:
	//  leftExpr=AdditiveExpression (op=ShiftOperation rightExpr=ShiftExpression)?;
	public FractalItfGrammarAccess.ShiftExpressionElements getShiftExpressionAccess() {
		return gaFractalItf.getShiftExpressionAccess();
	}
	
	public ParserRule getShiftExpressionRule() {
		return getShiftExpressionAccess().getRule();
	}

	//AdditiveExpression:
	//  leftExpr=MulExpression (op=AdditiveOperation rightExpr=AdditiveExpression)?;
	public FractalItfGrammarAccess.AdditiveExpressionElements getAdditiveExpressionAccess() {
		return gaFractalItf.getAdditiveExpressionAccess();
	}
	
	public ParserRule getAdditiveExpressionRule() {
		return getAdditiveExpressionAccess().getRule();
	}

	//MulExpression:
	//  leftExpr=CastExpression (op=MulOperation rightExpr=MulExpression)?;
	public FractalItfGrammarAccess.MulExpressionElements getMulExpressionAccess() {
		return gaFractalItf.getMulExpressionAccess();
	}
	
	public ParserRule getMulExpressionRule() {
		return getMulExpressionAccess().getRule();
	}

	//CastExpression:
	//  "(" type=QualifiedTypeSpecification ")" expr=CastExpression|unaryExpr=
	//  UnaryExpression;
	public FractalItfGrammarAccess.CastExpressionElements getCastExpressionAccess() {
		return gaFractalItf.getCastExpressionAccess();
	}
	
	public ParserRule getCastExpressionRule() {
		return getCastExpressionAccess().getRule();
	}

	//UnaryExpression:
	//  unaryExpr=UnaryOperation? primaryExpr=PrimaryExpression;
	public FractalItfGrammarAccess.UnaryExpressionElements getUnaryExpressionAccess() {
		return gaFractalItf.getUnaryExpressionAccess();
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}

	//PrimaryExpression:
	//  literal=Literal|"(" ConstantExpression ")";
	public FractalItfGrammarAccess.PrimaryExpressionElements getPrimaryExpressionAccess() {
		return gaFractalItf.getPrimaryExpressionAccess();
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}

	//Literal:
	//  ID|STRING|FloatingPointLiteral|ref=[ConstantDefinition];
	public FractalItfGrammarAccess.LiteralElements getLiteralAccess() {
		return gaFractalItf.getLiteralAccess();
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}

	//terminal ShiftOperation:
	//  "<<" | ">>";
	public TerminalRule getShiftOperationRule() {
		return gaFractalItf.getShiftOperationRule();
	} 

	//terminal AdditiveOperation:
	//  "+" | "-";
	public TerminalRule getAdditiveOperationRule() {
		return gaFractalItf.getAdditiveOperationRule();
	} 

	//terminal MulOperation:
	//  "*" | "/" | "%";
	public TerminalRule getMulOperationRule() {
		return gaFractalItf.getMulOperationRule();
	} 

	//terminal UnaryOperation:
	//  "&" | "*" | "+" | "-" | "~" | "!";
	public TerminalRule getUnaryOperationRule() {
		return gaFractalItf.getUnaryOperationRule();
	} 

	//FloatingPointLiteral returns ecore::EString:
	//  signedINT+ "." signedINT* Exponent? FDsymbol?|"." signedINT+ Exponent? FDsymbol?|
	//  signedINT+ Exponent FDsymbol?|signedINT+ Exponent? FDsymbol?;
	public FractalItfGrammarAccess.FloatingPointLiteralElements getFloatingPointLiteralAccess() {
		return gaFractalItf.getFloatingPointLiteralAccess();
	}
	
	public ParserRule getFloatingPointLiteralRule() {
		return getFloatingPointLiteralAccess().getRule();
	}

	//Exponent returns ecore::EString:
	//  ("e"|"E") AdditiveOperation? INT+;
	public FractalItfGrammarAccess.ExponentElements getExponentAccess() {
		return gaFractalItf.getExponentAccess();
	}
	
	public ParserRule getExponentRule() {
		return getExponentAccess().getRule();
	}

	//terminal FDsymbol:
	//  "f" | "F" | "d" | "D";
	public TerminalRule getFDsymbolRule() {
		return gaFractalItf.getFDsymbolRule();
	} 

	//terminal ID:
	//  "^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaFractalItf.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//  "0".."9"+;
	public TerminalRule getINTRule() {
		return gaFractalItf.getINTRule();
	} 

	//terminal STRING:
	//  "\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" |
	//  "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaFractalItf.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//  "/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaFractalItf.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//  "//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaFractalItf.getSL_COMMENTRule();
	} 

	//terminal WS:
	//  (" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaFractalItf.getWSRule();
	} 

	//terminal ANY_OTHER:
	//  .;
	public TerminalRule getANY_OTHERRule() {
		return gaFractalItf.getANY_OTHERRule();
	} 
}