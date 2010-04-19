package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
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
//			CompoundCommand cc = new CompoundCommand("create interface and binding");
//			
//			CreateElementRequest createInterfaceRequest = new CreateElementRequest(MindElementTypes.InterfaceDefinition_3130);
//			createInterfaceRequest.setContainer(((View)getHost().getModel()).getElement());
//			cc.add(getCreateCommand(createInterfaceRequest));
//			
//			cc.add(getGEFWrapper(new BindingDefinitionCustomCreateCommand(req,null,null)));
//			
//			return cc;
//			
//		}
		
		return cmd;
	}
		
//	protected Command getSemanticCommand(IEditCommandRequest request) {
//
//		if (request instanceof CreateRelationshipRequest) {
//			CreateElementRequest createInterfaceRequest = new CreateElementRequest(MindElementTypes.InterfaceDefinition_3130);
//			createInterfaceRequest.setContainer(((View)getHost().getModel()).getElement());
//			
//			return super.getSemanticCommand(createInterfaceRequest);
//		}
//		
//		return super.getSemanticCommand(request);
//	}

}
