package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.CompositeReferenceCompartmentEditPart;

/**
 * Area of a {@link CompositeReferenceCustomEditPart}
 * @author maroto
 *
 */
public class CompositeReferenceCompartmentCustomEditPart extends
		CompositeReferenceCompartmentEditPart {

	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public CompositeReferenceCompartmentCustomEditPart(View view) {
		super(view);
	}
		
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
