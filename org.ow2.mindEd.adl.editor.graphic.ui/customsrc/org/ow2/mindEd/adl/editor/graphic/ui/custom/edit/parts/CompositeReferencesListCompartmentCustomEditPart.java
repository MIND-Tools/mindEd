package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeReferencesListCompartmentEditPart;

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
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
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
	
	public void refresh() {
		super.refresh();
		genericEditPart.refresh();
	}
}
