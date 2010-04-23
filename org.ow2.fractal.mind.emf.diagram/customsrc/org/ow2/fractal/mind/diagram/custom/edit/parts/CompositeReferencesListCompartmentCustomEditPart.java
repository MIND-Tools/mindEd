package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.CompositeReferencesListCompartmentEditPart;

/**
 * This is the area for a {@link CompositeReferencesListCustomEditPart}
 * @author maroto
 *
 */
public class CompositeReferencesListCompartmentCustomEditPart extends
		CompositeReferencesListCompartmentEditPart {

	public CompositeReferencesListCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart(this, VISUAL_ID);
	
	protected MindEditPart getGenericEditPart() {
		return genericEditPart;
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		getGenericEditPart().createDefaultEditPolicies();
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = getGenericEditPart().getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}
	
	@Override
	public void activate() {
		super.activate();
		getGenericEditPart().activate();
	}
	
	@Override
	protected LayoutManager getLayoutManager() {
		LayoutManager layoutManager = getGenericEditPart().getLayoutManager();
		if (layoutManager == null) {
			layoutManager = super.getLayoutManager();
		}
		return layoutManager;
	}
}
