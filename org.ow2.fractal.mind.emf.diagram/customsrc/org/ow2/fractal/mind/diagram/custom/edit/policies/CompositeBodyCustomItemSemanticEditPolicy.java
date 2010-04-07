package org.ow2.fractal.mind.diagram.custom.edit.policies;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomCreateCommand;

import adl.BindingDefinition;
import adl.diagram.edit.commands.BindingDefinitionCreateCommand;
import adl.diagram.edit.commands.InterfaceDefinitionCreateCommand;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.policies.CompositeBodyItemSemanticEditPolicy;
import adl.diagram.part.MindDiagramEditorPlugin;
import adl.diagram.providers.MindElementTypes;

public class CompositeBodyCustomItemSemanticEditPolicy extends
		CompositeBodyItemSemanticEditPolicy {
	
	

	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command cmd = super.getCreateRelationshipCommand(req);
		
//		if (cmd == null && req.getElementType() == MindElementTypes.BindingDefinition_4003) {
//			
//			return getGEFWrapper(new BindingDefinitionCustomCreateCommand(req));
//			
//		}
		
		return cmd;
	}

}
