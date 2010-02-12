package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.ow2.fractal.mind.diagram.custom.helpers.ItemSemanticEditPolicyHelper;

import adl.diagram.edit.policies.CompositeSubComponentCompartmentCompositeSubComponentBodyItemSemanticEditPolicy;

public class CompartmentCompositeSubComponentBodyCustomItemSemanticEditPolicy
		extends
		CompositeSubComponentCompartmentCompositeSubComponentBodyItemSemanticEditPolicy {

	// No override of a sub component, it only accepts merged elements
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}
	
}
