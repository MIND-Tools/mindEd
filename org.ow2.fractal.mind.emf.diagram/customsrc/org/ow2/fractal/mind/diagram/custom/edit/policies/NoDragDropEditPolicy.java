package org.ow2.fractal.mind.diagram.custom.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.handles.NonResizableHandleKit;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

public class NoDragDropEditPolicy extends NonResizableEditPolicy {

	protected List createSelectionHandles() {
		List handles = new ArrayList();
		NonResizableHandleKit.addMoveHandle(
				(GraphicalEditPart) getHost(), handles);
		((MoveHandle) handles.get(0)).setBorder(null);
		return handles;
	}

	public Command getCommand(Request request) {
		return null;
	}

	public boolean understandsRequest(Request request) {
		return false;
	}
	
}