package org.ow2.fractal.mind.idl.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 * 
 * 
 * @author Damien Fournier
 */

public class FractalItfFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {

		FractalItfGrammarAccess f = (org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess) getGrammarAccess();

		c.setIndentationSpace("    ");
		formatInclude(f, c);
		formatDefine(f, c);
		formatInterfaces(f, c);
		formatTypeDefinition(f, c);
		formatMethod(f, c);
		formatAnnotations(f, c);
		formatComment(f, c);
		
		c.setLinewrap().after(f.getANY_OTHERRule());

	}

	/**
	 * 
	 * Format a bloc limited by parenthesis or curly bracket.
	 * 
	 * @param left
	 *            left delimiter
	 * 
	 * @param right
	 *            right delimiter
	 * 
	 */
	protected void formatBloc(Keyword left, Keyword right, FormattingConfig c) {
		// line after first bracket
		c.setLinewrap().after(left);
		// inside indentation
		c.setIndentation(left, right);
		// line after bloc
		c.setLinewrap().before(right);
	}

	/**
	 * Format Interface Bloc
	 */

	protected void formatInterfaces(FractalItfGrammarAccess f,
			FormattingConfig c) {
		c.setLinewrap(1).before(
				f.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
		formatBloc(f.getInterfaceDefinitionAccess()
				.getLeftCurlyBracketKeyword_5(),
				f.getInterfaceDefinitionAccess()
						.getRightCurlyBracketKeyword_7(), c);
	}

	/**
	 * Format Define Definition
	 */

	protected void formatDefine(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().after(
				f.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0());
		c.setNoSpace().around(f.getAdditiveOperationRule());
		c.setNoSpace().around(f.getMulOperationRule());
		c.setNoSpace().around(f.getShiftOperationRule());
		c.setNoSpace().around(f.getUnaryOperationRule());
	}

	/**
	 * Format Type definitions
	 */
	protected void formatTypeDefinition(FractalItfGrammarAccess f,
			FormattingConfig c) {

		c.setLinewrap().before(
				f.getTypedefSpecificationAccess().getTypedefKeyword_0());
		c.setLinewrap().after(
				f.getTypeDefinitionAccess().getSemicolonKeyword_1());
		c.setLinewrap()
				.after(f.getStructMemberAccess().getSemicolonKeyword_4());
		formatBloc(f.getStructOrUnionDefinitionAccess()
				.getLeftCurlyBracketKeyword_2(), f
				.getStructOrUnionDefinitionAccess()
				.getRightCurlyBracketKeyword_4(), c);
	}

	/**
	 * Format Method definitions
	 */
	protected void formatMethod(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().after(
				f.getMethodDefinitionAccess().getSemicolonKeyword_5());
	}

	/**
	 * Format Include declarations
	 */
	protected void formatInclude(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().after(
				f.getIncludeDirectiveAccess().getImportedURIAssignment_1_0());
		c.setLinewrap().after(
				f.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1());
	}

	/**
	 * Format Annotations
	 */
	protected void formatAnnotations(FractalItfGrammarAccess f,
			FormattingConfig c) {
		c.setLinewrap().before(
				f.getAnnotationAccess().getCommercialAtKeyword_0());
		c.setNoSpace()
				.after(f.getAnnotationAccess().getCommercialAtKeyword_0());
		c.setNoSpace()
				.around(
						f.getAnnotationParametersAccess()
								.getLeftParenthesisKeyword_1());
		c.setNoSpace().around(
				f.getAnnotationParametersAccess()
						.getRightParenthesisKeyword_3());
		c.setNoSpace().around(
				f.getAnnotationValuePairAccess().getEqualsSignKeyword_1());
	}

	protected void formatComment(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().after(f.getML_COMMENTRule());
		c.setLinewrap().after(f.getSL_COMMENTRule());
	}

}
