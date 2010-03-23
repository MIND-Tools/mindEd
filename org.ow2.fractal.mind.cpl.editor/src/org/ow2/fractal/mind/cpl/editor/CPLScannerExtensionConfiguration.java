/**
 * 
 */

package org.ow2.fractal.mind.cpl.editor;

import org.eclipse.cdt.core.dom.parser.AbstractScannerExtensionConfiguration;

/**
 * @author Damien Fournier
 */

public class CPLScannerExtensionConfiguration extends
		AbstractScannerExtensionConfiguration {

	private static CPLScannerExtensionConfiguration sInstance = new CPLScannerExtensionConfiguration();

	public static CPLScannerExtensionConfiguration getInstance() {
		return sInstance;
	}

	public CPLScannerExtensionConfiguration() {
		addMacro("METH(adl_itf, idl_itf)", "(adl_itf, idl_itf)");
		addMacro("METH(itf)", "(itf)");
		addMacro("METH_PTR(itf)", "(itf)");
		addMacro("PRIVATE", "");
		addMacro("PRIVATE.parameter", ".parameter");
		addMacro("ATTR(attr)", "(attr)");
		addMacro("CALL(itfName,methName)", "(methName)");
		addMacro("CALL(methName)", "(methName)");
		addMacro("CALL_PTR(methName)", "(methName)");
	}

}
