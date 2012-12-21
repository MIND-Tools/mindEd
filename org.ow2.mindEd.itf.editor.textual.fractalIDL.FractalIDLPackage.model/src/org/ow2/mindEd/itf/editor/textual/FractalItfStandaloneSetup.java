
package org.ow2.mindEd.itf.editor.textual;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FractalItfStandaloneSetup extends FractalItfStandaloneSetupGenerated{

	public static void doSetup() {
		new FractalItfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

