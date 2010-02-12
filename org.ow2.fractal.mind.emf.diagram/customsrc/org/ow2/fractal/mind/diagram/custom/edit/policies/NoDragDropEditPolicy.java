package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

/**
 * Does not allow drag and drop
 * @author maroto
 *
 */
public class NoDragDropEditPolicy extends NonResizableEditPolicy {

	public Command getCommand(Request request) {
		return null;
	}

	public boolean understandsRequest(Request request) {
		return false;
	}
	
}