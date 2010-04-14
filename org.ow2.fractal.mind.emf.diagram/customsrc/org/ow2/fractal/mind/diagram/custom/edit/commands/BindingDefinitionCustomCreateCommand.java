package org.ow2.fractal.mind.diagram.custom.edit.commands;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import adl.AdlFactory;
import adl.BindingDefinition;
import adl.Body;
import adl.Element;
import adl.InterfaceDefinition;
import adl.Role;
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

	
	private EObject customSource;

	private EObject customTarget;
	
	private Body customContainer;

	
	public BindingDefinitionCustomCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request, source, target);
		//edg28 - automatically create an interface if creating from body
		if (source == null)
			source = request.getContainer();
		customSource = source;
		customTarget = target;
		customContainer = deduceContainer(customSource,customTarget);
	}
	
	/**
	 * Create an interface in the given container and returns it
	 * @param body 
	 * @return the created InterfaceDefinition
	 */
	protected InterfaceDefinition createInterface(Body body) {
		// Get existing interfaces to be able to find the new one
		ArrayList<InterfaceDefinition> interfaces = new ArrayList<InterfaceDefinition>();
		EList<Element> elements = body.getElements();
		for (Element element : elements) {
			if (element instanceof InterfaceDefinition)
				interfaces.add((InterfaceDefinition)element);
		}
		
		// Create a new interface for the binding
		IElementType type = MindElementTypes.getElementType(InterfaceDefinitionEditPart.VISUAL_ID);
		CreateElementRequest createInterfaceRequest = new CreateElementRequest(body, type);
		InterfaceDefinitionCreateCommand createInterface = new InterfaceDefinitionCreateCommand(createInterfaceRequest);
		Command command = new ICommandProxy(createInterface);
		
		try {
			createInterface.execute(new NullProgressMonitor(), null);
		}
		catch(Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Could not create interface", e);
		}
		
		// Find the newly created interface
		InterfaceDefinition newInterface = null;
		elements = body.getElements();
		for (Element element : elements) {
			if ((element instanceof InterfaceDefinition) &&
					(!(interfaces.contains(element))))
				newInterface = (InterfaceDefinition) element;
		}
		
		return newInterface;
	}
	

	/**
	 * Check constraints 
	 */
	public boolean canExecute() {
		if (customSource == null && customTarget == null) {
			return false;
		}
		
		EObject sourceComponent = null;
		EObject targetComponent = null;
		adl.Role sourceRole = null;
		adl.Role targetRole = null;
		
		if (customSource != null) {
			if (customSource instanceof InterfaceDefinition){
				// configure source
				sourceRole = ((InterfaceDefinition) customSource).getRole();
				sourceComponent = customSource.eContainer().eContainer();
			}
			else if (customSource instanceof Body) {
				// edg28
				// If source is a body, an interface will be created later
				sourceComponent = customSource.eContainer();
			}
			else return false;
		}
		
		if (customTarget != null) {
			
			if (customTarget instanceof InterfaceDefinition) {
				// Configure target
				targetRole = ((InterfaceDefinition) customTarget).getRole();
				targetComponent = customTarget.eContainer().eContainer();
				
			}
			else if (customTarget instanceof Body) {
				// edg28
				// If target is a body, an interface will be created later
				targetComponent = customTarget.eContainer();
			}
			else return false;
		}
		
		if (customTarget != null && customSource != null) {
			if (customSource == customTarget) {
				// User is trying to bind an interface with itself - return false
				return false;
			}
			if (sourceComponent == targetComponent) {
				// User is trying to bind two interfaces of the same component - return false
				return false;
			}
			if (sourceComponent.eContainer().eContainer() != targetComponent &&
					sourceComponent.eContainer() != targetComponent.eContainer() &&
					sourceComponent != targetComponent.eContainer().eContainer()) {
				// User is trying to bind from more than one rank of components - return false
				return false;
			}
			if (sourceComponent.eContainer().eContainer() == targetComponent ||
					sourceComponent == targetComponent.eContainer().eContainer()) {
				if ((sourceRole != targetRole) && (sourceRole != null) && (targetRole != null)) {
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
		
		if (customSource == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		
		// target may be null here but it's possible to check constraint
		if ((customSource instanceof InterfaceDefinition) &&
				(customTarget instanceof InterfaceDefinition)) {
			return MindBaseItemSemanticEditPolicy.LinkConstraints
			.canCreateBindingDefinition_4003(getContainer(), getSource(),
					getTarget());
		}
		return true;
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
		
		Boolean returnResult = false;
		
		EObject sourceComponent = null;
		EObject targetComponent = null;
		
		// edg28
		if (customSource instanceof Body) {
			// If a body is the source create the interface source
			customSource = createInterface((Body)customSource);
			sourceComponent = getSource().eContainer().eContainer();
			
			if (customTarget instanceof Body) {
				// Two new interfaces
				customTarget = createInterface((Body)customTarget);
				targetComponent = getTarget().eContainer().eContainer();
				
				if (sourceComponent.eContainer() == targetComponent.eContainer()) {
					// Components are on the same level, bind provides to requires
					getSource().setRole(Role.REQUIRES);
					getTarget().setRole(Role.PROVIDES);
				}
				if ((sourceComponent.eContainer().eContainer() == targetComponent) ||
						(targetComponent.eContainer().eContainer() == sourceComponent)) {
					// Parent to child, bind provides to provides
					getSource().setRole(Role.PROVIDES);
					getTarget().setRole(Role.PROVIDES);
				}
			}
			else {
				// Only source is created
				// Role depends on the target
				targetComponent = getTarget().eContainer().eContainer();
				if (sourceComponent.eContainer() == targetComponent.eContainer()) {
					// Components are on the same level, bind provides to requires
					if (getTarget().getRole() == Role.PROVIDES)
						getSource().setRole(Role.REQUIRES);
					else
						getSource().setRole(Role.PROVIDES);
				}
				if ((sourceComponent.eContainer().eContainer() == targetComponent) ||
						(targetComponent.eContainer().eContainer() == sourceComponent)) {
					// Parent to child, bind provides to provides and requires to requires
					getSource().setRole(getTarget().getRole());
				}
			}
		}
		else if (customTarget instanceof Body){
			// Only target is created
			// Role depends on the source
			customTarget = createInterface((Body)customTarget);
			targetComponent = getTarget().eContainer().eContainer();
			sourceComponent = getSource().eContainer().eContainer();
			
			if (sourceComponent.eContainer() == targetComponent.eContainer()) {
				// Components are on the same level, bind provides to requires
				if (getSource().getRole() == Role.PROVIDES)
					getTarget().setRole(Role.REQUIRES);
				else
					getTarget().setRole(Role.PROVIDES);
			}
			if ((sourceComponent.eContainer().eContainer() == targetComponent) ||
					(targetComponent.eContainer().eContainer() == sourceComponent)) {
				// Parent to child, bind provides to provides and requires to requires
				getTarget().setRole(getSource().getRole());
			}
		}
		else {
			// Normal behavior
			returnResult = true;
		}
		// An interface has been created
		// Reprocess container deduction
		customContainer = deduceContainer(getSource(),getTarget());

		newElement.setInterfaceSource(getSource());
		newElement.setInterfaceTarget(getTarget());
		getContainer().getElements().add(newElement);
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);

		// If an interface was created, the element must not be returned
		// Else a view is created with source = body
		if (returnResult)
			return CommandResult.newOKCommandResult(newElement);
		else 
			return CommandResult.newOKCommandResult(null);
		
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
		if (customSource instanceof InterfaceDefinition)
			return (InterfaceDefinition) customSource;
		return null;
	}

	@Override
	public InterfaceDefinition getTarget() {
		if (customTarget instanceof InterfaceDefinition)
			return (InterfaceDefinition) customTarget;
		return null;
	}

}