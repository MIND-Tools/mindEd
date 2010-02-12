package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentCompositeComponentDefinitionBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentCompositeComponentDefinitionBodyCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomXYLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.CustomFreeFormLayoutEx;

import adl.diagram.edit.parts.CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart;

/**
 * Body compartment of a {@link CompositeComponentDefinitionCustomEditPart}
 * @children components
 * @author maroto
 *
 */
public class CompartmentCompositeComponentDefinitionBodyCustomEditPart extends
		CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart {

	public CompartmentCompositeComponentDefinitionBodyCustomEditPart(View view) {
		super(view);
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentCompositeComponentDefinitionBodyCustomItemSemanticEditPolicy());
		// Custom canonical edit policy
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentCompositeComponentDefinitionBodyCustomCanonicalEditPolicy());
		// Extended drag and drop features
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// Extended layout features
		installEditPolicy(EditPolicy.LAYOUT_ROLE, 
				new CustomXYLayoutEditPolicy());
	}
	
	
	/**
	 * Returns the layout manager to be used by this shape compartment. This
	 * implementation returns a {@link CustomFreeformLayoutEx} instance.
	 * 
	 * @return a layout manager.
	 */
	protected LayoutManager getLayoutManager() {
		// Extended layout features
		return new CustomFreeFormLayoutEx();
	}
	
	
}
