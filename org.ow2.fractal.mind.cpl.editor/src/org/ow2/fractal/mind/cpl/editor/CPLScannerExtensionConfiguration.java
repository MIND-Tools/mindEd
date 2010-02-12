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
		addMacro("COMP_DATA", "");
		addMacro("COMP_TYPE", "");
		addMacro("METHOD(adl_itf, idl_itf)", "(idl_itf)");
		addMacro("METH(itf)", "(itf)");
	}

}
