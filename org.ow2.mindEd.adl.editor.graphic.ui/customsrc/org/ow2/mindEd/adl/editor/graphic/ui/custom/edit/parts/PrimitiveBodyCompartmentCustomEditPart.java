package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyCompartmentEditPart;

public class PrimitiveBodyCompartmentCustomEditPart extends
		PrimitiveBodyCompartmentEditPart {

	public PrimitiveBodyCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	
	@Override
	protected LayoutManager getLayoutManager() {
		LayoutManager lm = genericEditPart.getLayoutManager();
		if (lm == null)
			lm = super.getLayoutManager();
		return lm;
	}
	
	
	@Override
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = genericEditPart.getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}

}
