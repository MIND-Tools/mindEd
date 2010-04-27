package org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.*;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AdlDefinitionEditPart;

/**
 * Helper to provide static methods for item semantic edit policies.
 * @author maroto
 *
 */
public class ItemSemanticEditPolicyHelper {
	
	/**
	 * Allows the edit policy to return create commands from a parent edit part if none is found
	 * in this one. Stops if a component is reached. This custom method is needed if you want the 
	 * extended creation behaviour implemented in {@linkplain org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.MindSubCreationEditPolicy}<p>
	 * Not meaned to be called by anything else than an override of the getCreateCommand() method
	 * of an ItemSemanticEditPolicy. Before calling this method, you should try to let the 
	 * edit policy return a command, and call this only if it does not find one. 
	 * @param req
	 * @param host
	 * @return
	 */
	public static Command getParentsCreateCommand(CreateElementRequest req, EditPart host) {
					
		EditCommandRequestWrapper reqWrap;
		Command cmd = null;
		
		// Will continue to seek parents unless it finds a component
		while (
				(cmd == null)
				&&
				!(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(host) instanceof MindComponentEditPart)
				&&
				!(host instanceof AdlDefinitionEditPart)
				)
		{
			// Get the parent and set it to the request's container
			host = host.getParent();
			req.setContainer(((View) host.getModel()).getElement());
			
			// Try to get a command from the new host
			reqWrap = new EditCommandRequestWrapper(req);
			cmd = host.getCommand(reqWrap);
		}
		
		return cmd;
	}
	
	
	/**
	 * Allows the edit policy to return create commands from a child edit part if none is found
	 * in this one. Stops if a component is reached. This custom method is needed if you want the 
	 * extended creation behaviour implemented in {@linkplain org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.MindSuperCreationEditPolicy}<p>
	 * Not meaned to be called by anything else than an override of the getCreateCommand() method
	 * of an ItemSemanticEditPolicy. Before calling this method, you should try to let the 
	 * edit policy return a command, and call this only if it does not find one.<p>
	 * Be careful when using this method that none of the children call getParentsCreateCommand to avoid infinite loops.
	 * @param req
	 * @param host
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Command getChildrenCreateCommand(CreateElementRequest req, EditPart host) {
					
		EditCommandRequestWrapper reqWrap;
		Command cmd = null;
		
		List<EditPart> children = host.getChildren();
		for (EditPart child : children)
		{
			// Get the parent and set it to the request's container
			host = child;
			req.setContainer(((View) host.getModel()).getElement());
			
			// Try to get a command from the new host
			reqWrap = new EditCommandRequestWrapper(req);
			cmd = host.getCommand(reqWrap);
			
			// If a command is found, no need to seek with other children
			if (cmd != null) break;
		}
		
		return cmd;
	}

}
