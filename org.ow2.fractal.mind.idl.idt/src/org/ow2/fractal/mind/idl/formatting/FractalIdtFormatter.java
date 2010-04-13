package org.ow2.fractal.mind.idl.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess;
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

public class FractalIdtFormatter extends FractalItfFormatter {

	protected FractalIdtGrammarAccess g = null;

	@Override
	protected void configureFormatting(FormattingConfig c) {

		FractalItfGrammarAccess f = ((org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess) getGrammarAccess())
				.getFractalItfGrammarAccess();

		FractalIdtGrammarAccess g = ((org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess) getGrammarAccess());

		c.setIndentationSpace("    ");
		formatInclude(f, c);
		formatDefine(f, c);
		formatTypeDefinition(f, c);

		// Formatting after 'ifndef' and 'endif'
		c.setLinewrap().before(
				g.getConstantDefinitionBeginAccess().getIfndefKeyword_0());
		c.setLinewrap().before(
				g.getConstantDefinitionEndAccess().getEndifKeyword_0());

	}

	/**
	 * Format Define Definition
	 */

	@Override
	protected void formatDefine(FractalItfGrammarAccess f, FormattingConfig c) {

		c.setLinewrap().before(
				f.getConstantDefinitionAccess().getDefineKeyword_0());
		c.setNoSpace().around(f.getAdditiveOperationRule());
		c.setNoSpace().around(f.getMulOperationRule());
		c.setNoSpace().around(f.getShiftOperationRule());
		c.setNoSpace().around(f.getUnaryOperationRule());
		
	}

}
