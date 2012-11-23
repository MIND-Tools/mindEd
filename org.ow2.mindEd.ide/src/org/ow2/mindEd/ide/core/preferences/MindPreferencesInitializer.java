package org.ow2.mindEd.ide.core.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.ow2.mindEd.ide.core.MindActivator;

public class MindPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = MindActivator.getPref().getPreferenceStore();
		if (System.getProperty("os.name").startsWith("Windows"))
			store.setDefault(PreferenceConstants.P_MAKEFILE_MSYS_COMPATIBILITY, true);
	}

}
