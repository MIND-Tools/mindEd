package org.ow2.fractal.mind.cpl.editor;

import org.eclipse.cdt.core.parser.IToken;

public interface CPLTokens extends IToken {
	
	// Macro
	public static final int COMP_DATA = FIRST_RESERVED_IExtensionToken;
	public static final int COMP_TYPE = COMP_DATA + 1;
}
