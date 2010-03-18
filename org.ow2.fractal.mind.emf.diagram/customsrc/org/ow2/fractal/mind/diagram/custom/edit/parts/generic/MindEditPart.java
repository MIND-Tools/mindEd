package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;

public class MindEditPart extends AbstractMindEditPart {

	public MindEditPart(GraphicalEditPart editPart, int vID) {
		if (editPart == null) throw new NullPointerException();
		realEditPart = editPart;
		visualID = vID;
	}
	
	public MindEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		if (editPart == null) throw new NullPointerException();
		realEditPart = editPart;
		visualID = vID;
		MIND_TYPE = mindType;
	}
	
	public GraphicalEditPart getCompartment() {
		List<EditPart> children = realEditPart.getChildren();
		
		for (EditPart child : children) {
			if (getMindEditPartFor(child) instanceof MindCompartmentEditPart)
				return (GraphicalEditPart)child;
		}
		return null;
	}
	
	
	public void activate() {
		if (ComponentHelper.isMerged(realEditPart)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(realEditPart);
	}
	
	
	public LayoutManager getLayoutManager() {
		try {
			return realEditPart.getFigure().getLayoutManager();
		}catch(NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * Default layout is OK but we don't want the spacing
	 */
	public IFigure setupContentPane(IFigure nodeShape) {
		return null;
	}


	public boolean addChildVisual(EditPart childEditPart, int index) {
		return false;
	}


	public boolean addFixedChild(EditPart childEditPart) {
		return false;
	}


	public DragTracker getDragTracker(Request request) {
		return null;
	}

	public Boolean refreshBounds() {
		return false;
	}
	
	public void setLayoutManager(IFigure figure) {}


	public void refresh() {}

	public LayoutEditPolicy createLayoutEditPolicy() {
		return null;
	}
	
}
