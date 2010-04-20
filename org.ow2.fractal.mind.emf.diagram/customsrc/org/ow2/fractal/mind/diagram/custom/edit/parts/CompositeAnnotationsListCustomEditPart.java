

package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.CompositeAnnotationsListEditPart;

/**
 * This EditPart stands for the list of annotations. 
 * <p>
 * Implements the following features : disable spacing, custom edit policies,
 * size depends on the number of children
 * @children AnnotationsListAreaCustomEditPart
 * @author maroto
 *
 */
public class CompositeAnnotationsListCustomEditPart extends CompositeAnnotationsListEditPart {

	public CompositeAnnotationsListCustomEditPart(View view) {
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
	

	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (genericEditPart.addFixedChild(childEditPart)) return true;
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}

}
