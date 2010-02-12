package org.ow2.fractal.mind.diagram.custom.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

import adl.diagram.preferences.DiagramAppearancePreferencePage;
import adl.diagram.preferences.DiagramConnectionsPreferencePage;
import adl.diagram.preferences.DiagramPreferenceInitializer;
import adl.diagram.preferences.DiagramPrintingPreferencePage;
import adl.diagram.preferences.DiagramRulersAndGridPreferencePage;

public class CustomDiagramPreferenceInitializer extends
		DiagramPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		CustomGeneralPreferencePage.initDefaults(store);
		DiagramAppearancePreferencePage.initDefaults(store);
		DiagramConnectionsPreferencePage.initDefaults(store);
		DiagramPrintingPreferencePage.initDefaults(store);
		DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

}
