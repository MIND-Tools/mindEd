package org.ow2.fractal.mind.diagram.custom.edit.parts;


import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;

import adl.diagram.edit.parts.CompositeReferencesListEditPart;

/**
 * Extends CompositeReferencesListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class CompositeReferencesListCustomEditPart extends
		CompositeReferencesListEditPart {
	
	protected MindEditPart genericEditPart = MindEditPart.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public CompositeReferencesListCustomEditPart(View view) {
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
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return genericEditPart.createLayoutEditPolicy();
	}
	
	public DragTracker getDragTracker(Request request) {
		// Do not allow drag and drop
		return new NoDragTracker(this);
	}
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}

}
