package org.ow2.mindEd.adl.editor.graphic.ui.custom.providers;


import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindEditPartProvider;

public class MindEditPartCustomProvider extends MindEditPartProvider {

	/**
	 * Set a custom factory to reference all custom editparts
	 */
	public MindEditPartCustomProvider() {
		setFactory(new MindEditPartCustomFactory());
		setAllowCaching(true);
	}

}
