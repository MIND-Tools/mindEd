package org.ow2.mindEd.itf.editor.textual.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.ow2.mindEd.itf.editor.textual.services.FractalItfGrammarAccess;

@SuppressWarnings("all")
public class FractalItfSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FractalItfGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IncludeDirective___SolidusKeyword_1_0_1_0_STRINGTerminalRuleCall_1_0_1_1__a;
	protected AbstractElementAlias match_InterfaceDefinition_UnmanagedKeyword_2_q;
	protected AbstractElementAlias match_ItfFile_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_MethodDefinition_VoidKeyword_4_0_1_q;
	protected AbstractElementAlias match_ParameterList___CommaKeyword_2_0_FullStopFullStopFullStopKeyword_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FractalItfGrammarAccess) access;
		match_IncludeDirective___SolidusKeyword_1_0_1_0_STRINGTerminalRuleCall_1_0_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getIncludeDirectiveAccess().getSolidusKeyword_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getIncludeDirectiveAccess().getSTRINGTerminalRuleCall_1_0_1_1()));
		match_InterfaceDefinition_UnmanagedKeyword_2_q = new TokenAlias(false, true, grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2());
		match_ItfFile_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getItfFileAccess().getSemicolonKeyword_3());
		match_MethodDefinition_VoidKeyword_4_0_1_q = new TokenAlias(false, true, grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1());
		match_ParameterList___CommaKeyword_2_0_FullStopFullStopFullStopKeyword_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParameterListAccess().getCommaKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_IncludeDirective___SolidusKeyword_1_0_1_0_STRINGTerminalRuleCall_1_0_1_1__a.equals(syntax))
				emit_IncludeDirective___SolidusKeyword_1_0_1_0_STRINGTerminalRuleCall_1_0_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceDefinition_UnmanagedKeyword_2_q.equals(syntax))
				emit_InterfaceDefinition_UnmanagedKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ItfFile_SemicolonKeyword_3_q.equals(syntax))
				emit_ItfFile_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MethodDefinition_VoidKeyword_4_0_1_q.equals(syntax))
				emit_MethodDefinition_VoidKeyword_4_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterList___CommaKeyword_2_0_FullStopFullStopFullStopKeyword_2_1__q.equals(syntax))
				emit_ParameterList___CommaKeyword_2_0_FullStopFullStopFullStopKeyword_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('/' STRING)*
	 */
	protected void emit_IncludeDirective___SolidusKeyword_1_0_1_0_STRINGTerminalRuleCall_1_0_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unmanaged'?
	 */
	protected void emit_InterfaceDefinition_UnmanagedKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ItfFile_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'void'?
	 */
	protected void emit_MethodDefinition_VoidKeyword_4_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '...')?
	 */
	protected void emit_ParameterList___CommaKeyword_2_0_FullStopFullStopFullStopKeyword_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
