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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
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
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.ow2.mindEd.adl.CompositeComponentDefinition;
import org.ow2.mindEd.adl.CompositeReferenceDefinition;
import org.ow2.mindEd.adl.Element;
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
import org.ow2.mindEd.adl.custom.impl.SubComponentPrimitiveBodyCustomImpl;
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
		
		List <String> componentName = getNameSubComponent(EP);
		
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
							Collection temp = DiagramCommandStack.getReturnValues(command);
							List<View> addedViews = getAddedViews(EP.getViewer(), DiagramCommandStack.getReturnValues(command));
							
							for(Object elementRequest : temp)
							{

								if(elementRequest instanceof CreateElementRequestAdapter)
								{
									CreateElementRequest request = (CreateElementRequest) ((CreateElementRequestAdapter)elementRequest).getAdapter(CreateElementRequest.class);
									Object element = request.getNewElement();
									
									TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
									
									try {
										transaction.start();

										if(mindFile instanceof MindAdl)
										{
											if (element instanceof SubComponentDefinition)
											{
												CompositeReferenceDefinitionImpl newReferenceDefinition = new CompositeReferenceDefinitionImpl();
												newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
												((SubComponentDefinitionCustomImpl) element).setReferenceDefinition(newReferenceDefinition);
												((SubComponentDefinitionCustomImpl) element).setName(getNameComponentWithIndice(EP,mindFile.getName(),"_adl"));
											}
											else if(element instanceof PrimitiveComponentDefinition)
											{
												PrimitiveReferencesListImpl referenceList = new PrimitiveReferencesListImpl();
												PrimitiveReferenceDefinitionCustomImpl newReferenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
												newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
												((PrimitiveComponentDefinitionCustomImpl)element).setReferencesList(referenceList);
												newReferenceDefinition.setParentReferencesList(referenceList);
												((PrimitiveComponentDefinitionCustomImpl)element).setName(getNameComponentWithIndice(EP,mindFile.getName(),"_adl"));
											}
											else if (element instanceof CompositeReferenceDefinition)
											{
												((CompositeReferenceDefinitionCustomImpl)element).setReferenceName(mindFile.getQualifiedName());
											}
											else if (element instanceof PrimitiveReferencesList)
											{
												((PrimitiveReferencesListImpl)element).getReferences().get(0).setReferenceName(mindFile.getQualifiedName());
											}
										}
										else if(mindFile instanceof MindC)
										{
											if (element instanceof SubComponentDefinition) {
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFile.getQualifiedName());//												
												implementationDefinition.setFileC(fileC);
												((SubComponentDefinitionCustomImpl) element).getBody().getElements().add(implementationDefinition);
												((SubComponentDefinitionCustomImpl) element).setName(getNameComponentWithIndice(EP,mindFile.getName(),"_c"));
											}
											else if(element instanceof PrimitiveComponentDefinition)
											{
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFile.getQualifiedName());												
												implementationDefinition.setFileC(fileC);
												((PrimitiveComponentDefinitionCustomImpl) element).getBody().getElements().add(implementationDefinition);
												((PrimitiveComponentDefinitionCustomImpl) element).setName(getNameComponentWithIndice(EP,mindFile.getName(),"_c"));
											}
											else if (element instanceof ImplementationDefinition)
											{
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFile.getQualifiedName());
												((ImplementationDefinitionCustomImpl)element).setFileC(fileC);
											}
										}
										else if(mindFile instanceof MindItf)
										{
											if (element instanceof InterfaceDefinition)
											{
												((InterfaceDefinitionCustomImpl)element).setSignature(mindFile.getQualifiedName());
												((InterfaceDefinitionCustomImpl)element).setName(getNameInterfaceWithIndice((InterfaceDefinitionCustomImpl)element, mindFile.getName(), "_itf"));
											}
										}	
										
										transaction.commit();
										
									} catch (InterruptedException e) {
										e.printStackTrace();
									} catch (RollbackException e) {
										e.printStackTrace();
									}
									//Refresh
									List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies((EObject) element);
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
	}


	protected static List getNameSubComponent(GraphicalEditPart EP)
	{
		List children = EP.getChildren();
		List <String> componentName = new ArrayList<String>();
		for (Object child : children)
		{
			if(child instanceof GraphicalEditPart)
			{
				ShapeImpl model = (ShapeImpl) ((GraphicalEditPart)child).getModel();
				Object element = model.getElement();
				if (element instanceof SubComponentDefinition)
				{
					componentName.add(((SubComponentDefinition)element).getName());
				}
				else if(element instanceof PrimitiveComponentDefinition)
				{
					componentName.add(((PrimitiveComponentDefinition)element).getName());
				}
				else if(element instanceof CompositeComponentDefinition)
				{
					componentName.add(((CompositeComponentDefinition)element).getName());
				}
				
			}
		}
		return componentName;
	}
	
	protected static String getNameComponentWithIndice(GraphicalEditPart EP, String name, String extension)
	{
		List <String> componentName = getNameSubComponent(EP);

		for(int i = 0;;i++)
		{
			if(i == 0)
			{
				if(!componentName.contains(name + extension))
				{
					return name + extension;
				}
			}
			else
			{
				if(!componentName.contains(name + extension + String.valueOf(i)))
				{
					return name + extension + String.valueOf(i);
				}
			}
		}
	}
	
	private static String getNameInterfaceWithIndice(
			InterfaceDefinitionCustomImpl interfaceDefinition, String name, String extension) {
		
		List <String> interfaceName = new ArrayList<String>();
		List <Element> elementList = null;

		Object body =interfaceDefinition.getParentBody();
		
		if (body instanceof SubComponentPrimitiveBodyCustomImpl)
		{
			elementList = ((SubComponentPrimitiveBodyCustomImpl)body).getElements();
		}
		else if(body instanceof PrimitiveComponentDefinition)
		{
			
		}
		else if(body instanceof CompositeComponentDefinition)
		{
			
		}
		for(Object element : elementList)
		{
			if(element instanceof InterfaceDefinition)
			{
				interfaceName.add(((InterfaceDefinition)element).getName());
			}
		}
		
		for(int i = 0;;i++)
		{
			if(i == 0)
			{
				if(!interfaceName.contains(name + extension))
				{
					return name + extension;
				}
			}
			else
			{
				if(!interfaceName.contains(name + extension + String.valueOf(i)))
				{
					return name + extension + String.valueOf(i);
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
