package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentComponentTypeDefinitionBodyCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomXYLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;

import adl.diagram.edit.parts.ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart;

/**
 * Body compartment of a {@link ComponentTypeDefinitionCustomEditPart}
 * @children components
 * @author maroto
 *
 */
public class CompartmentComponentTypeDefinitionBodyCustomEditPart extends
		ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart {

	public CompartmentComponentTypeDefinitionBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentComponentTypeDefinitionBodyCustomItemSemanticEditPolicy());
		// Customized drag and drop features
		installEditPolicy(
				EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}

}
