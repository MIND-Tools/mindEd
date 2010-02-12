package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentDataDefinitionBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;

import adl.diagram.edit.parts.DataDefinitionCompartmentDataDefinitionBodyAreaEditPart;

/**
 * Body compartment of a {@link DataDefinitionCustomEditPart}
 * @children FileCEditPart, InlineCCodeEditPart
 * @author maroto
 *
 */
public class CompartmentDataDefinitionBodyCustomEditPart extends
		DataDefinitionCompartmentDataDefinitionBodyAreaEditPart {

	public CompartmentDataDefinitionBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Custom canonical edit policy
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentDataDefinitionBodyCustomCanonicalEditPolicy());
		// Extended drag and drop features
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}

}
