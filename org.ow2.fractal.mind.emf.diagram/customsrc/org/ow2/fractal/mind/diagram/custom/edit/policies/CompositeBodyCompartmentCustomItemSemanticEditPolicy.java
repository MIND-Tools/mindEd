package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindComponentEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.policies.CompositeBodyCompartmentItemSemanticEditPolicy;
import adl.diagram.providers.MindElementTypes;

public class CompositeBodyCompartmentCustomItemSemanticEditPolicy extends
		CompositeBodyCompartmentItemSemanticEditPolicy {
	
	
	
	public Command getCommand(Request request) {
		return super.getCommand(request);
	}

	
//	@Override
//	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
//		Command cmd = super.getCreateRelationshipCommand(req);
//		
//		if (cmd == null && req.getElementType() == MindElementTypes.BindingDefinition_4003) {
//			
//			EditCommandRequestWrapper reqWrap;
//			EditPart virtualHost = getHost();
//			
//			// Will continue to seek parents unless it finds a component
//			while (
//					(cmd == null)
//					&&
//					!(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(virtualHost) instanceof MindComponentEditPart)
//					&&
//					!(virtualHost instanceof AdlDefinitionEditPart)
//					)
//			{
//				// Get the parent and set it to the request's container
//				virtualHost = virtualHost.getParent();
//				req.setContainer(((View) virtualHost.getModel()).getElement());
//				
//				// Try to get a command from the new host
//				reqWrap = new EditCommandRequestWrapper(req);
//				cmd = virtualHost.getCommand(reqWrap);
//			}
//			
//			return cmd;
//			
//		}
//		
//		return cmd;
//	}
	
}
