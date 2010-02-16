package org.ow2.fractal.mind.idl.formatting;

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

public class FractalIdtFormatter extends FractalItfFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {

		FractalItfGrammarAccess f = ((org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess) getGrammarAccess())
				.getFractalItfGrammarAccess();

		c.setIndentationSpace("    ");
		formatDefine(f, c);
		formatTypeDefinition(f, c);

	}

}
