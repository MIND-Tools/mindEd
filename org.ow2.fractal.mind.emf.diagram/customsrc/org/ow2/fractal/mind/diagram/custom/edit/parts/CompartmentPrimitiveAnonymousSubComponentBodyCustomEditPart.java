package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveAnonymousSubComponentBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveAnonymousSubComponentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomXYLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.CustomFreeFormLayoutEx;

import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart;

/**
 * Body of {@link PrimitiveAnonymousSubComponentCustomEditPart}
 * @children DataDefinitionEditPart, ImplementationDefinitionEditPart
 * @author maroto
 *
 */
public class CompartmentPrimitiveAnonymousSubComponentBodyCustomEditPart extends
		PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart {

	public CompartmentPrimitiveAnonymousSubComponentBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentPrimitiveAnonymousSubComponentCustomItemSemanticEditPolicy());
		// Custom canonical edit policy
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentPrimitiveAnonymousSubComponentBodyCustomCanonicalEditPolicy());
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
