package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

import adl.diagram.edit.parts.CompositeFormalArgumentsListEditPart;

public class CompositeFormalArgumentsListCustomEditPart extends
		CompositeFormalArgumentsListEditPart {

	public CompositeFormalArgumentsListCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		IFigure shape = genericEditPart.setupContentPane(nodeShape);
		if (shape != null) return shape;
		return super.setupContentPane(nodeShape);
	}
	
	public void refresh() {
		super.refresh();
		genericEditPart.refresh();
	}
	
	@Override
	protected void refreshBounds() {
		genericEditPart.refreshBounds();
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

}