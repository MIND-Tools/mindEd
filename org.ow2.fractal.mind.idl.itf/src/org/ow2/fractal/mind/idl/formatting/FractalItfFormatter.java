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
		formatDefine(f, c);
		formatInterfaces(f, c);
		formatTypeDefinition(f, c);
		formatMethod(f, c);

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
		c.setLinewrap(2).before(
				f.getInterfaceDefinitionAccess().getInterfaceKeyword_0());
		formatBloc(f.getInterfaceDefinitionAccess()
				.getLeftCurlyBracketKeyword_4(),
				f.getInterfaceDefinitionAccess()
						.getRightCurlyBracketKeyword_6(), c);
	}

	/**
	 * Format Define Definition
	 */

	protected void formatDefine(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().after(
				f.getConstantDefinitionAccess().getIdAssignment_1());
	}

	/**
	 * Format Type definitions
	 */
	protected void formatTypeDefinition(FractalItfGrammarAccess f,
			FormattingConfig c) {
		c.setLinewrap().after(
				f.getTypeDefinitionAccess().getSemicolonKeyword_1());
	}
	
	/**
	 * Format Method definitions
	 */
	protected void formatMethod(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().after(f.getMethodDefinitionAccess().getSemicolonKeyword_3());
	}

}
