package org.ow2.mindEd.ide.ui;

import org.ow2.mindEd.ide.core.MindIdeCore;

public class PropertyTester extends org.eclipse.core.expressions.PropertyTester {

	public PropertyTester() {
	}

	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if ("isWorkspaceModel".equals(property)) {
			boolean isWorkspaceModel =  (receiver == MindIdeCore.getModel().getWSRepo());
			return (isWorkspaceModel == (Boolean.TRUE.equals(expectedValue) || Boolean.parseBoolean(expectedValue.toString())));
		}
		return false;
	}

}
