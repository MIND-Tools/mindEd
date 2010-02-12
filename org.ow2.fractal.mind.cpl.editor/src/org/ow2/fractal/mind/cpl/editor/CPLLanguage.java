/**
 * 
 */
package org.ow2.fractal.mind.cpl.editor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.dom.ILinkage;
import org.eclipse.cdt.core.dom.parser.AbstractCLikeLanguage;
import org.eclipse.cdt.core.dom.parser.IScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.ISourceCodeParser;
import org.eclipse.cdt.core.dom.parser.cpp.GPPParserExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.GPPScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.ICPPParserExtensionConfiguration;
import org.eclipse.cdt.core.index.IIndex;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.IScanner;
import org.eclipse.cdt.core.parser.ParserLanguage;
import org.eclipse.cdt.core.parser.ParserMode;
import org.eclipse.cdt.internal.core.dom.parser.cpp.GNUCPPSourceParser;
import org.eclipse.cdt.internal.core.pdom.dom.IPDOMLinkageFactory;
import org.eclipse.cdt.internal.core.pdom.dom.cpp.PDOMCPPLinkageFactory;

/**
 * @author dfournie
 * 
 */
@SuppressWarnings("restriction")
public class CPLLanguage extends AbstractCLikeLanguage {
	
	protected static final CPLScannerExtensionConfiguration CPL_SCANNER_EXTENSION = CPLScannerExtensionConfiguration.getInstance();
	protected static final GPPParserExtensionConfiguration CPP_GNU_PARSER_EXTENSION= GPPParserExtensionConfiguration.getInstance();

	private static final CPLLanguage DEFAULT_INSTANCE = new CPLLanguage();
	public static final String ID = CCorePlugin.PLUGIN_ID + ".cpl"; //$NON-NLS-1$

	public static CPLLanguage getDefault() {
		return DEFAULT_INSTANCE;
	}



	@Override
	protected ParserLanguage getParserLanguage() {
		return ParserLanguage.CPP;
	}

	
	@Override
	public String getId() {
		return ID;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		if (adapter == IPDOMLinkageFactory.class) {
			return new PDOMCPPLinkageFactory();
		}
		return super.getAdapter(adapter);
	}

	public CPLLanguage() {
		super();
	}

	@Override
	public int getLinkageID() {
		return ILinkage.CPP_LINKAGE_ID;
	}
	
	@Override
	protected IScannerExtensionConfiguration getScannerExtensionConfiguration() {
		return CPL_SCANNER_EXTENSION;
	}

	protected ICPPParserExtensionConfiguration getParserExtensionConfiguration() {
		return CPP_GNU_PARSER_EXTENSION;
	}

	@Override
	protected ISourceCodeParser createParser(IScanner scanner, ParserMode parserMode, IParserLogService logService, IIndex index) {
		//return new CPLSourceCodeParser(scanner, parserMode, logService, getParserExtensionConfiguration(), index);
		return new GNUCPPSourceParser(scanner, parserMode, logService, getParserExtensionConfiguration(), index);
	}

}
