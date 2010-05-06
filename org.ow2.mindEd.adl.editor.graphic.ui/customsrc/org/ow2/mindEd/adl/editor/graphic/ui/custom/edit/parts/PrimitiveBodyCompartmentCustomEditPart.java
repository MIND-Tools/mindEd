package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyCompartmentEditPart;

public class PrimitiveBodyCompartmentCustomEditPart extends
		PrimitiveBodyCompartmentEditPart {

	public PrimitiveBodyCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	
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
	
//	public boolean isSelectable() {
//		return false;
//	}
//	
//	
//	public IFigure createFigure() {
//		ShapeCompartmentFigure scf = new ShapeCompartmentFigure(getCompartmentName(), getMapMode());
//		scf.setLayoutManager(getLayoutManager());
//		scf.getContentPane().setLayoutManager(getLayoutManager());
//        scf.getContentPane().addLayoutListener(LayoutAnimator.getDefault());
//        scf.setTitleVisibility(false);
//		return scf;
//	}

}
