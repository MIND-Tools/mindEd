package org.ow2.mindEd.adl.textual.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;

@SuppressWarnings("all")
public class FractalSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FractalGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Value_HexadecimalTypeParserRuleCall_2_or_IDTerminalRuleCall_0_or_NullKeyword_5_or_STRINGTerminalRuleCall_3_or_SignedINTParserRuleCall_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FractalGrammarAccess) access;
		match_Value_HexadecimalTypeParserRuleCall_2_or_IDTerminalRuleCall_0_or_NullKeyword_5_or_STRINGTerminalRuleCall_3_or_SignedINTParserRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2()), new TokenAlias(false, false, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getValueAccess().getNullKeyword_5()), new TokenAlias(false, false, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()), new TokenAlias(false, false, grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getHexadecimalTypeRule())
			return getHexadecimalTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSignedINTRule())
			return getsignedINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * HexadecimalType :
	 * 	'0x'INT;
	 */
	protected String getHexadecimalTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0x";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
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
	
	/**
	 * signedINT :
	 * 	('+'|'-')?INT;
	 */
	protected String getsignedINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Value_HexadecimalTypeParserRuleCall_2_or_IDTerminalRuleCall_0_or_NullKeyword_5_or_STRINGTerminalRuleCall_3_or_SignedINTParserRuleCall_1.equals(syntax))
				emit_Value_HexadecimalTypeParserRuleCall_2_or_IDTerminalRuleCall_0_or_NullKeyword_5_or_STRINGTerminalRuleCall_3_or_SignedINTParserRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ID | HexadecimalType | 'null' | STRING | signedINT
	 */
	protected void emit_Value_HexadecimalTypeParserRuleCall_2_or_IDTerminalRuleCall_0_or_NullKeyword_5_or_STRINGTerminalRuleCall_3_or_SignedINTParserRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
