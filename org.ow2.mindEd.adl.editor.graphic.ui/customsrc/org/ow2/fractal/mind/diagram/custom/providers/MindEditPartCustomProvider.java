package org.ow2.fractal.mind.diagram.custom.providers;


import adl.diagram.providers.MindEditPartProvider;

public class MindEditPartCustomProvider extends MindEditPartProvider {

	/**
	 * Set a custom factory to reference all custom editparts
	 */
	public MindEditPartCustomProvider() {
		setFactory(new MindEditPartCustomFactory());
		setAllowCaching(true);
	}

}
