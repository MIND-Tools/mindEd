package org.ow2.fractal.mind.emf.diagram.custom.listeners;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.Shape;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

public class MindLayoutListener implements LayoutListener {
	
	GraphicalEditPart owner;

	public MindLayoutListener(GraphicalEditPart part) {
		owner = part;
	}
	
	@Override
	public void invalidate(IFigure container) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean layout(IFigure container) {
		return false;
	}
	
	@Override
	public void postLayout(IFigure container) {
		owner.refresh();
		owner.getParent().refresh();
		owner.getParent().getParent().refresh();
	}

	@Override
	public void remove(IFigure child) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setConstraint(IFigure child, Object constraint) {
		// TODO Auto-generated method stub

	}

}
