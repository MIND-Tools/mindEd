package org.ow2.fractal.mind.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import adl.AdlFactory;
import adl.BindingDefinition;
import adl.Body;
import adl.InterfaceDefinition;
import adl.diagram.edit.commands.BindingDefinitionCreateCommand;
import adl.diagram.edit.commands.InterfaceDefinitionCreateCommand;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;
import adl.diagram.part.MindDiagramEditorPlugin;
import adl.diagram.providers.MindElementTypes;

/**
 * This create command defines source, target and container for our custom bindings.
 * Furthermore, it prevents user from creating a non valid binding (see canExecute)
 * @author rproust / omarot
 *
 */
public class BindingDefinitionCustomCreateCommand extends
		BindingDefinitionCreateCommand {

	
	private final EObject customSource;

	private final EObject customTarget;
	
	private final Body customContainer;

	
	public BindingDefinitionCustomCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request, source, target);
		customSource = source;
		customTarget = target;
		customContainer = deduceContainer(customSource,customTarget);
	}
	
//	public BindingDefinitionCustomCreateCommand(CreateRelationshipRequest req) {
//		
//		// Trying to create on a component without interfaces
//		// Create one
//		EObject container = req.getContainer();
//		IElementType type = MindElementTypes.getElementType(InterfaceDefinitionEditPart.VISUAL_ID);
//		CreateElementRequest createInterfaceRequest = new CreateElementRequest(container, type);
//		Command createInterface = new ICommandProxy(new InterfaceDefinitionCreateCommand(createInterfaceRequest));
//		try {
//			createInterface.execute();
//		}
//		catch(Exception e) {
//			MindDiagramEditorPlugin.getInstance().logError("Could not create interface", e);
//		}
//		
//		container.
//		
//		super(req,)
//		
//	}

	/**
	 * Check constraints 
	 */
	public boolean canExecute() {
		if (customSource == null && customTarget == null) {
			return false;
		}
		EObject sourceParent = null;
		EObject targetParent = null;
		adl.Role sourceRole = null;
		adl.Role targetRole = null;
		
		if (customSource != null) {
			if (false == customSource instanceof InterfaceDefinition) {
				// Source is not an interface, return false
				return false;
			}
			// Else configure source
			sourceParent = customSource.eContainer();
			sourceRole = ((InterfaceDefinition) customSource).getRole();
		}
		
		if (customTarget != null) {
			
			if (false == customTarget instanceof InterfaceDefinition) {
				// Target is not an interface, return false
				return false;
			}
			// Else configure target
			targetParent = customTarget.eContainer();
			targetRole = ((InterfaceDefinition) customTarget).getRole();
		}
		
		if (customTarget != null && customSource != null) {
			if (customSource == customTarget) {
				// User is trying to bind an interface with itself - return false
				return false;
			}
			if (sourceParent == targetParent) {
				// User is trying to bind two interfaces of the same component - return false
				return false;
			}
			if (sourceParent.eContainer() != targetParent &&
					sourceParent.eContainer() != targetParent.eContainer() &&
					sourceParent != targetParent.eContainer()) {
				// User is trying to bind from more than one rank of components - return false
				return false;
			}
			if (sourceParent.eContainer() == targetParent ||
					sourceParent == targetParent.eContainer()) {
				if (sourceRole != targetRole) {
					// User is trying to bind a component with its parent
					// Roles must be the same - return false
					return false;
				}
			}
			else {
				if (sourceRole == targetRole) {
					// User is trying to bind two components of the same rank
					// Roles must not be the same - return false
					return false;
				}
			}
		}
		
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return MindBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateBindingDefinition_4003(getContainer(), getSource(),
						getTarget());
	}

	@Override
	public CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		BindingDefinition newElement = AdlFactory.eINSTANCE
				.createBindingDefinition();
		getContainer().getElements().add(newElement);
		newElement.setInterfaceSource(getSource());
		newElement.setInterfaceTarget(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	@Override
	public Body getContainer() {
		return customContainer;
	}

	public static Body deduceContainer(EObject source,
			EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		if (target!=null && getRank(source)>getRank(target))
		{
			EObject tmpSource = source;
			source=target;
			target = tmpSource;
		}
		for (EObject sourceElement = source; sourceElement != null; sourceElement = sourceElement.eContainer()) {
			if (sourceElement instanceof Body) {
				if(target!=null && target!=source)
				{
					for (EObject targetElement = target; targetElement != null; targetElement = targetElement.eContainer()) 
					{
						if (targetElement instanceof Body) 
						{
							if(targetElement==sourceElement)
							{
								return (Body) targetElement;
							}
						}
					}
				}
				else
						return (Body) sourceElement;
			}
		}
		return null;
	}
	
	public static int getRank(EObject object)
	{
		int rank=0;
		for (EObject element = object; element != null; element = element.eContainer()) {
			rank++;
		}
		return rank;
	}
	
	@Override
	public InterfaceDefinition getSource() {
		return (InterfaceDefinition) customSource;
	}

	@Override
	public InterfaceDefinition getTarget() {
		return (InterfaceDefinition) customTarget;
	}

}