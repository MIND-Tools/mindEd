package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.PrimitiveFormalArgumentsListEditPart;

/**
 * This is a list of formal arguments, defined in a CompositeComponentDefinition 
 * or in a PrimitiveComponentDefinition
 * @author maroto
 *
 */
public class PrimitiveFormalArgumentsListCustomEditPart extends
		PrimitiveFormalArgumentsListEditPart {

	public PrimitiveFormalArgumentsListCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
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
	
//	@Override
//	protected boolean addFixedChild(EditPart childEditPart) {
//		if (childEditPart instanceof FormalArgumentsListCompartmentFormalArgumentsList2EditPart) {
//			IFigure pane = getPrimaryShape().getFigureFormalArgumentsArea();
//			setupContentPane(pane); 
//			pane.add(((FormalArgumentsListCompartmentFormalArgumentsListEditPart) childEditPart)
//							.getFigure());
//			return true;
//		}
//		return super.addFixedChild(childEditPart);
//	}
//	
//	@Override
//	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
//		if (editPart instanceof FormalArgumentsListCompartmentFormalArgumentsList2EditPart) {
//			return getPrimaryShape().getFigureFormalArgumentsArea();
//		}
//		return super.getContentPane();
//	}
//	
//	public EditPolicy getPrimaryDragEditPolicy() {
//		// No drag and drop allowed
//		return new NoDragDropEditPolicy();
//	}

}
