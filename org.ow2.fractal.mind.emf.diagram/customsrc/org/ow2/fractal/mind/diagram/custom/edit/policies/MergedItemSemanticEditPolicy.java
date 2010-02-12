package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.helpers.MindBaseEditHelper;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;

public class MergedItemSemanticEditPolicy extends
		MindBaseItemSemanticEditPolicy {

	public MergedItemSemanticEditPolicy(IElementType elementType) {
		super(elementType);
	}
	
	// Override is not allowed
	// Return null to prevent user from creating element manually
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}
	
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
	return null;
	}
	
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		return null;
	}

	
	
	
}
