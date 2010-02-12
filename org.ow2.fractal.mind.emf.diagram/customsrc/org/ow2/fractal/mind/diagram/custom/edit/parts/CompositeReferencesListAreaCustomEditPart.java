package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.CompositeReferencesListCompartmentReferencesListAreaEditPart;

/**
 * This is the area for a ReferencesList (in a CompositeComponentDefinition or a
 * PrimitiveComponentDefinition).
 * @author maroto
 *
 */
public class CompositeReferencesListAreaCustomEditPart extends
		CompositeReferencesListCompartmentReferencesListAreaEditPart {

	public CompositeReferencesListAreaCustomEditPart(View view) {
		super(view);
	}
	
	/**
	 * The layout manager of this edit part
	 */
	protected LayoutManager layoutManager;
	
	/**
	 * Returns the layout manager to be used by this shape compartment.
	 * This implemantion returns a ConstrainedFlowLayout instance.
	 */
	@Override
	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(true);
		}
		return layoutManager;
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended layout role
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				createLayoutEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferencesListAreaCustomItemSemanticEditPolicy());
		// No drag and drop
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		// Custom canonical edit policy
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeReferencesListAreaCustomCanonicalEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// Does not allow children to be moved
		return new FixedChildrenLayoutEditPolicy();
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		// A listener should be implemented on the parent instead
		getParent().refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		// A listener should be implemented on the parent instead
		getParent().refresh();
	}
	
	

}
