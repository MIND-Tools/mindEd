package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;

public class MergedComponentEditPolicy extends ComponentEditPolicy {

	@Override
	protected Command createDeleteSemanticCommand(GroupRequest deleteRequest) {
		return super.createDeleteSemanticCommand(deleteRequest);
	}

	@Override
	protected Command createDeleteViewCommand(GroupRequest deleteRequest) {
		return null;
	}

	@Override
	protected boolean shouldDeleteSemantic() {
		return super.shouldDeleteSemantic();
	}

}
