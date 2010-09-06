package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IDiagramPreferenceSupport;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.CompositeReferenceDefinition;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.PrimitiveComponentDefinition;
import org.ow2.mindEd.adl.PrimitiveReferencesList;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.FileCCustomImpl;
import org.ow2.mindEd.adl.custom.impl.ImplementationDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.AdlDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeBodyCompartmentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveBodyCompartmentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.SubComponentCompositeBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.SubComponentPrimitiveBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;
import org.ow2.mindEd.adl.impl.CompositeReferenceDefinitionImpl;
import org.ow2.mindEd.adl.impl.PrimitiveReferencesListImpl;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindC;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;

public class DragAndDrop {

	protected static SetBoundsCommand testBounds = null;
	
	public static boolean isValid(List listDropObject, EditPart targetEditPart)
	{
		boolean valid = true;
		if (listDropObject != null)
		{
			for (Object element : listDropObject)
			{
				if(element instanceof MindAdl)
				{
					if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
							|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart)
							|| (targetEditPart instanceof AdlDefinitionCustomEditPart)
							|| (targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
							|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
						valid = valid & true;
					else
						valid = valid & false;
				}
				else if(element instanceof MindC)
				{
					if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
							|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart)
							|| (targetEditPart instanceof AdlDefinitionCustomEditPart)
							|| (targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
							|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
						valid = valid & true;
					else
						valid = valid & false;
				}
				else if(element instanceof MindItf)
				{
					if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
							|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart)
							|| (targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
							|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
						valid = valid & true;
					else
						valid = valid & false;
				}
			}
		}
		return valid;
	}
	
	
	public static List getListCommand(List listDropObject, EditPart targetEditPart, Point location)
	{
		List<Command> commadList = new ArrayList<Command>();
		IElementType type = null;
		if ((listDropObject != null) && (targetEditPart != null))
		{
			for (Object object : listDropObject)
			{
				MindFile mindFile = null;
				if(object instanceof MindFile)
				{
					mindFile = (MindFile)object;
					GraphicalEditPart EP = null;
					if (targetEditPart instanceof GraphicalEditPart)
						EP = (GraphicalEditPart)targetEditPart;
					
					if(mindFile instanceof MindAdl)
					{
						// Type of Mind File is ADL
						if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
								|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
						{
							// If Drop on Composite Body or Sub-Component Composite Body
							// Create new Undefined Primitive Sub-Component
							type = MindElementTypes.SubComponentDefinition_3135;
						}
						else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
						{
							// If Drop on ADL Definition
							// Create new Primitive Component
							type = MindElementTypes.PrimitiveComponentDefinition_2008;
						}
						else if(targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
						{
							// If Drop on Primitive Sub Component
							type = MindElementTypes.CompositeReferenceDefinition_3157;
						}
						else if(targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart)
						{
							// If Drop on Primitive Component
							type = MindElementTypes.PrimitiveReferencesList_3124;
						}
					}
					if(mindFile instanceof MindC)
					{
						// Type of Mind File is MindC					
						if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
								|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
						{
							// If Drop on Composite Body or Sub-Component Composite Body
							type = MindElementTypes.SubComponentDefinition_3135;
						}
						else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
						{
							// If Drop on ADL Definition
							// Create new Primitive Component
							type = MindElementTypes.PrimitiveComponentDefinition_2008;
						}
						else if((targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
								|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
						{
							// If Drop on Primitive Sub Component or Primitive Component
							type = MindElementTypes.ImplementationDefinition_3140;
						}
					}
					if(mindFile instanceof MindItf)
					{
						type = MindElementTypes.InterfaceDefinition_3130;
					}				
					if(type != null)
					{
						Request request = createRequest(type,EP.getViewer());
					
						
						
						if (request instanceof CreateViewRequest) {
							((CreateRequest) request).setLocation(location);
						}
						
						Command com = EP.getCommand(request);
						if(com != null)
						{
							com.setLabel(mindFile.getFullpath());
							commadList.add(com);
						}
					}
				}
			}
		}
		
		
		return commadList;
	}


	public static void executeDrop(List listDropObject, EditPart targetEditPart, Point location) {
		// TODO Auto-generated method stub
		
		
		List<Command> listCommand = getListCommand(listDropObject, targetEditPart, location);
		MindFile mindFile = null;
		GraphicalEditPart EP = null;
		if (targetEditPart instanceof GraphicalEditPart)
			EP = (GraphicalEditPart)targetEditPart;
		
		IElementType type = null;
		for(Object object : listDropObject)
		{
			if((object instanceof MindAdl) 
					|| (object instanceof MindC)
					|| (object instanceof MindItf))
			{
				mindFile = (MindFile) object;
				for (Command command : listCommand)
				{
					if(mindFile.getFullpath().equals((String)command.getLabel()))
					{
						if(command.canExecute())
						{
							command.execute();
							List<View> addedViews = getAddedViews(EP.getViewer(), DiagramCommandStack.getReturnValues(command));
							
							for(View view : addedViews) {
								final EObject element = view.getElement();
								final MindFile mindFileInsert = mindFile;
								AbstractTransactionalCommand semanticChange = new AbstractTransactionalCommand(EP.getEditingDomain(),"label",null) {	
									@Override
									protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
											IAdaptable info) throws ExecutionException {
										// Set name, body and all here
										if(mindFileInsert instanceof MindAdl)
										{
											if (element instanceof SubComponentDefinition)
											{
												CompositeReferenceDefinitionImpl newReferenceDefinition = new CompositeReferenceDefinitionImpl();
												newReferenceDefinition.setReferenceName(mindFileInsert.getQualifiedName());
												((SubComponentDefinitionCustomImpl) element).setReferenceDefinition(newReferenceDefinition);
												((SubComponentDefinitionCustomImpl) element).setName(mindFileInsert.getName() + "_adl");
											}
											else if(element instanceof PrimitiveComponentDefinition)
											{
												PrimitiveReferencesListImpl referenceList = new PrimitiveReferencesListImpl();
												PrimitiveReferenceDefinitionCustomImpl newReferenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
												newReferenceDefinition.setReferenceName(mindFileInsert.getQualifiedName());
												((PrimitiveComponentDefinitionCustomImpl)element).setReferencesList(referenceList);
												newReferenceDefinition.setParentReferencesList(referenceList);
												((PrimitiveComponentDefinitionCustomImpl)element).setName(mindFileInsert.getName());
											}
											else if (element instanceof CompositeReferenceDefinition)
											{
												((CompositeReferenceDefinitionCustomImpl)element).setReferenceName(mindFileInsert.getQualifiedName());
											}
											else if (element instanceof PrimitiveReferencesList)
											{
												((PrimitiveReferencesListImpl)element).getReferences().get(0).setReferenceName(mindFileInsert.getQualifiedName());
											}
										}
										else if(mindFileInsert instanceof MindC)
										{
											if (element instanceof SubComponentDefinition) {
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFileInsert.getQualifiedName());//												
												implementationDefinition.setFileC(fileC);
												((SubComponentDefinitionCustomImpl) element).getBody().getElements().add(implementationDefinition);
												((SubComponentDefinitionCustomImpl) element).setName(mindFileInsert.getName());
											}
											else if(element instanceof PrimitiveComponentDefinition)
											{
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFileInsert.getQualifiedName());												
												implementationDefinition.setFileC(fileC);
												((PrimitiveComponentDefinitionCustomImpl) element).getBody().getElements().add(implementationDefinition);
												((PrimitiveComponentDefinitionCustomImpl) element).setName(mindFileInsert.getName());
											}
											else if (element instanceof ImplementationDefinition)
											{
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFileInsert.getQualifiedName());
												((ImplementationDefinitionCustomImpl)element).setFileC(fileC);
											}
										}
										else if(mindFileInsert instanceof MindItf)
										{
											if (element instanceof InterfaceDefinition)
											{
												((InterfaceDefinitionCustomImpl)element).setSignature(mindFileInsert.getQualifiedName());
												((InterfaceDefinitionCustomImpl)element).setName(mindFileInsert.getName());
											}
										}									
										return CommandResult.newOKCommandResult();
									}
								};
								
								try {
									semanticChange.execute(new NullProgressMonitor(), null);
								} catch (ExecutionException e) {
									e.printStackTrace();
								}
								
								//Refresh
								List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(element);
								for (CanonicalEditPolicy editPolicy : editPolicies) {
									editPolicy.refresh();
								}
								
							}
						}
					}
				}
			}
		}	
	}
	
	protected static Request createRequest(IElementType elementType, EditPartViewer viewer) {
		return CreateViewRequestFactory.getCreateShapeRequest(elementType,
			getPreferencesHint(viewer));
	}
	
	/**
	 * Gets the preferences hint that is to be used to find the appropriate
	 * preference store from which to retrieve diagram preference values. The
	 * preference hint is mapped to a preference store in the preference
	 * registry <@link DiagramPreferencesRegistry>.
	 * 
	 * @return the preferences hint
	 */
	protected static PreferencesHint getPreferencesHint(EditPartViewer viewer) {
		if (viewer != null) {
			RootEditPart rootEP = viewer.getRootEditPart();
			if (rootEP instanceof IDiagramPreferenceSupport) {
				return ((IDiagramPreferenceSupport) rootEP)
					.getPreferencesHint();
			}
		}
		return PreferencesHint.USE_DEFAULTS;
	}
	
	
	/**
	 * Select the newly added shape view by default
	 * @param viewer
	 * @param objects
	 */
	protected static List<View> getAddedViews(EditPartViewer viewer, Collection objects) {
		final List<View> views = new ArrayList<View>();
		for (Iterator i = objects.iterator(); i.hasNext();) {
			Object object = i.next();
			if (object instanceof IAdaptable) {
				Object view =
					((IAdaptable)object).getAdapter(View.class);
						
				if (view != null)
					views.add((View) view);
			}
		}
		return views;
	}
	
}
