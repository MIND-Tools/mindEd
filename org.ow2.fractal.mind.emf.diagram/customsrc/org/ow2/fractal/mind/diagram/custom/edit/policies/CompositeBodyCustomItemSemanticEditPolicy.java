package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomCreateCommand;

import adl.diagram.edit.policies.CompositeBodyItemSemanticEditPolicy;
import adl.diagram.providers.MindElementTypes;

public class CompositeBodyCustomItemSemanticEditPolicy extends
		CompositeBodyItemSemanticEditPolicy {
	
	

	
	public Command getCommand(Request request) {
		return super.getCommand(request);
	}
	

	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command cmd = super.getCreateRelationshipCommand(req);
		
		
		//TODO
//		if (cmd == null && req.getElementType() == MindElementTypes.BindingDefinition_4003) {
//			
//			return getGEFWrapper(new BindingDefinitionCustomCreateCommand(req,null,null));
//			
//		}
		
		return cmd;
	}
	
	

}
