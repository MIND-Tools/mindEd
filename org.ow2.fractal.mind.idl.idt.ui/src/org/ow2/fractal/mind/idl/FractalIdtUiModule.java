package org.ow2.fractal.mind.idl;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;
import org.ow2.fractal.mind.idl.ui.AntlrIDTTokenToAttributeIdMapper;
import org.ow2.fractal.mind.idl.ui.LexicalHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 * 
 * @author Rémi Mélisson
 * @contributor Damien Fournier
 */

public class FractalIdtUiModule extends
		org.ow2.fractal.mind.idl.ui.AbstractFractalIdtUiModule {

	/**
	 * Using ITF lexical highlighting
	 * 
	 */
	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return LexicalHighlightingConfiguration.class;
	}

	/**
	 * Using IDT token
	 * 
	 */
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
		return AntlrIDTTokenToAttributeIdMapper.class;
	}
}
