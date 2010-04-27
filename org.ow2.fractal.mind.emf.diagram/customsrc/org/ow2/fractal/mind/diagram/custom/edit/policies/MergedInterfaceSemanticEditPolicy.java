package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;

public class MergedInterfaceSemanticEditPolicy extends
		InterfaceDefinitionCustomItemSemanticEditPolicy {
	
	// Override is not allowed
	// Return null to prevent user from creating element manually
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}
	
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
	return null;
	}
	
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		return null;
	}

}