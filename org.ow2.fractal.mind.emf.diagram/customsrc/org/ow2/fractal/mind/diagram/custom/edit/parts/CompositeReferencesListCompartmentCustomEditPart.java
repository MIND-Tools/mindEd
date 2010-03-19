package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.CompositeReferencesListCompartmentEditPart;

/**
 * This is the area for a ReferencesList (in a CompositeComponentDefinition or a
 * PrimitiveComponentDefinition).
 * @author maroto
 *
 */
public class CompositeReferencesListCompartmentCustomEditPart extends
		CompositeReferencesListCompartmentEditPart {

	public CompositeReferencesListCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	@Override
	public void refresh() {
		super.refresh();
		genericEditPart.refresh();
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = genericEditPart.getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}
	
	@Override
	protected LayoutManager getLayoutManager() {
		LayoutManager layoutManager = genericEditPart.getLayoutManager();
		if (layoutManager == null) {
			layoutManager = super.getLayoutManager();
		}
		return layoutManager;
	}
	

//	/**
//	 * The layout manager of this edit part
//	 */
//	protected LayoutManager layoutManager;
//	
//
//	@Override
//	public void createDefaultEditPolicies() {
//		super.createDefaultEditPolicies();
//		// Extended layout role
//		installEditPolicy(EditPolicy.LAYOUT_ROLE,
//				createLayoutEditPolicy());
//		// Extended creation features
//		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
//				new MindSubCreationEditPolicy());
//		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
//				new CompositeReferencesListAreaCustomItemSemanticEditPolicy());
//		// No drag and drop
//		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
//		// Custom canonical edit policy
//		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
//				new CompositeReferencesListAreaCustomCanonicalEditPolicy());
//	}
//	
//	protected LayoutEditPolicy createLayoutEditPolicy() {
//		// Does not allow children to be moved
//		return new FixedChildrenLayoutEditPolicy();
//	}
//	
//	@Override
//	protected void handleNotificationEvent(Notification event) {
//		super.handleNotificationEvent(event);
//		// A listener should be implemented on the parent instead
//		getParent().refresh();
//	}
//	
//	@Override
//	public void refresh() {
//		super.refresh();
//		// A listener should be implemented on the parent instead
//		getParent().refresh();
//	}
	
	

}
