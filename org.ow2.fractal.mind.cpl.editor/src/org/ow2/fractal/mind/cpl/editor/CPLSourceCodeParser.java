/**
 * 
 */
package org.ow2.fractal.mind.cpl.editor;

import org.eclipse.cdt.core.dom.parser.cpp.GPPParserExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.ICPPParserExtensionConfiguration;
import org.eclipse.cdt.core.index.IIndex;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.IScanner;
import org.eclipse.cdt.core.parser.ParserMode;
import org.eclipse.cdt.internal.core.dom.parser.cpp.GNUCPPSourceParser;

/**
 * @author dfournie
 *
 */
@SuppressWarnings("restriction")
public class CPLSourceCodeParser extends GNUCPPSourceParser {

	@SuppressWarnings("restriction")
	public CPLSourceCodeParser(IScanner scanner, ParserMode mode,
			IParserLogService log, ICPPParserExtensionConfiguration config) {
		super(scanner, mode, log, config);
		// TODO Auto-generated constructor stub
	}

	public CPLSourceCodeParser(IScanner scanner, ParserMode parserMode,
			IParserLogService logService,
			ICPPParserExtensionConfiguration parserExtensionConfiguration,
			IIndex index) {
		this(scanner, parserMode, logService, null);
	}


}