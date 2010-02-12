package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;

public class TemplateReferenceAreaCustomEditPart extends
		CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart {

	public TemplateReferenceAreaCustomEditPart(View view) {
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
			layoutManager = new ConstrainedFlowLayout(false);
			((ConstrainedFlowLayout)layoutManager).setMinorSpacing(0);
			((ConstrainedFlowLayout)layoutManager).setMajorSpacing(0);
			((ConstrainedFlowLayout)layoutManager).setObserveVisibility(true);
			((ConstrainedFlowLayout)layoutManager).setMinorAlignment(ConstrainedFlowLayout.ALIGN_LEFTTOP);
			((ConstrainedFlowLayout)layoutManager).setMajorAlignment(ConstrainedFlowLayout.ALIGN_LEFTTOP);
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
//		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
//				new MindSuperCreationEditPolicy());
//		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
//				new TemplateReferenceAreaCustomItemSemanticEditPolicy());
		// No drag and drop
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		// Custom canonical edit policy
//		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
//				new CompositeReferencesListAreaCustomCanonicalEditPolicy());
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
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		// Should implement a listener instead
		// and use handleChildAdded
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		// Should implement a listener instead
		// and use handleChildRemoved
		getParent().refresh();
	}

}
