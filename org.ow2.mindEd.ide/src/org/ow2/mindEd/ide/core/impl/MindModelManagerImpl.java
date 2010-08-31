package org.ow2.mindEd.ide.core.impl;

import org.eclipse.core.resources.IProject;
import org.ow2.mindEd.ide.core.MindModel;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.model.MindProject;

public class MindModelManagerImpl extends MindModelManager {
	MindModelImpl _model;
	
	/**
	 * Initialize the manager.
	 */
	public void init() {
		_model = new MindModelImpl();
		_model.init();
	}
	
	
	@Override
	public MindModel getMindModel() {
		return _model;
	}
	
	
	@Override
	public MindProject getMindProject(IProject project) {
		if (project == null) return null;
		return _model.getMindProject(project);
	}

}
