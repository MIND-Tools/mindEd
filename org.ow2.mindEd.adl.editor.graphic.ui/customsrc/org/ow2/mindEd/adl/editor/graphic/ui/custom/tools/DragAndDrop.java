package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
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
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveComponentDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveSubComponentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.ImplementationDefinitionCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.InterfaceDefinitionCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.PrimitiveComponentDefinitionCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.PrimitiveReferencesListCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.PrimitiveSubComponentCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.PrimitiveSubReferenceCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.UndefinedSubComponentCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.SubComponentCompositeBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.SubComponentPrimitiveBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;
import org.ow2.mindEd.adl.impl.CompositeReferenceDefinitionImpl;
import org.ow2.mindEd.adl.impl.PrimitiveReferencesListImpl;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindC;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;

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
	
	
	public static List getListCommand(List listDropObject, EditPart targetEditPart)
	{
		List<EditElementCommand> commadList = new ArrayList<EditElementCommand>();
		if ((listDropObject != null) && (targetEditPart != null))
		{
			for (Object object : listDropObject)
			{
				MindFile mindFile = null;
				if(object instanceof MindFile)
				{
					mindFile = (MindFile)object;
					EditElementCommand command = null;
					CreateElementRequest request = null;
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
							request = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.SubComponentDefinition_3153);
							command = new UndefinedSubComponentCreateCommand(request);
							command.setLabel(mindFile.getFullpath());
						}
						else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
						{
							// If Drop on ADL Definition
							// Create new Primitive Component
							request = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.PrimitiveComponentDefinition_2008);
							command = new PrimitiveComponentDefinitionCreateCommand(request);
							command.setLabel(mindFile.getFullpath());

							
							
						}
						else if(targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
						{
							// If Drop on Primitive Sub Component
							
							PrimitiveSubComponentCustomEditPart primitiveSubCompo = (PrimitiveSubComponentCustomEditPart) EP.getParent().getParent();
							
							request = new CreateElementRequest(
									primitiveSubCompo.getEditingDomain(), 
									primitiveSubCompo.resolveSemanticElement() , 
									MindElementTypes.CompositeComponentDefinition_2007);
			
							command = new PrimitiveSubReferenceCreateCommand(request);
							command.setLabel(mindFile.getFullpath());
						}
						else if(targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart)
						{
							// If Drop on Primitive Component
							PrimitiveComponentDefinitionCustomEditPart primitiveCompo = (PrimitiveComponentDefinitionCustomEditPart) EP.getParent().getParent();
							
							request = new CreateElementRequest(
									primitiveCompo.getEditingDomain(), 
									primitiveCompo.resolveSemanticElement() , 
									MindElementTypes.PrimitiveReferencesList_3124);
			
							command = new PrimitiveReferencesListCreateCommand(request);
							command.setLabel(mindFile.getFullpath());
							
						}
					}
					if(mindFile instanceof MindC)
					{
						// Type of Mind File is MindC					
						if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
								|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
						{
							// If Drop on Composite Body or Sub-Component Composite Body
							request = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.SubComponentDefinition_3135);
							command = new PrimitiveSubComponentCreateCommand(request);
							command.setLabel(mindFile.getFullpath());
						}
						else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
						{
							// If Drop on ADL Definition
							// Create new Primitive Component
							request = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.PrimitiveComponentDefinition_2008);
							command = new PrimitiveComponentDefinitionCreateCommand(request);
							command.setLabel(mindFile.getFullpath());
						}
						else if((targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
								|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
						{
							// If Drop on Primitive Sub Component or Primitive Component								
							request = new CreateElementRequest(
									EP.getEditingDomain(), 
									EP.resolveSemanticElement() , 
									MindElementTypes.ImplementationDefinition_3140);
							command = new ImplementationDefinitionCreateCommand(request);
							command.setLabel(mindFile.getFullpath());
						}
					}
					if(mindFile instanceof MindItf)
					{
						Command newInterfaceCommand = null;
						request = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.InterfaceDefinition_3130);
						EditCommandRequestWrapper wrapper = new EditCommandRequestWrapper(request);
						newInterfaceCommand = targetEditPart.getCommand(wrapper);
						if(newInterfaceCommand == null)
						{
							command = new InterfaceDefinitionCreateCommand(request){
								@Override
								public boolean canExecute() {
									return false;
								}
							};
						}
						else
						{
							command = new InterfaceDefinitionCreateCommand(request);
						}
						command.setLabel(mindFile.getFullpath());
					}
					if(command != null)
					{
						commadList.add(command);
					}
					
					CreateElementRequestAdapter adapter = new CreateElementRequestAdapter(request);

					
					
					Dimension size = new Dimension(20, 20);
					Rectangle bounds = new Rectangle(20,20,20,20);
					
					SetBoundsCommand test = new SetBoundsCommand(
							command.getEditingDomain(), 
							command.getLabel(), 
							(IAdaptable) adapter, 
							bounds);
				
					
					if (test != null)
						testBounds = test;
					else
						testBounds = null;

				}
			}
		}
		
		
		return commadList;
	}


	public static void executeDrop(List listDropObject, EditPart targetEditPart) {
		// TODO Auto-generated method stub
		
		GraphicalEditPart EP = null;
		if (targetEditPart instanceof GraphicalEditPart)
			EP = (GraphicalEditPart)targetEditPart;
		
		List<EditElementCommand> commadList = getListCommand(listDropObject, targetEditPart);
		for (EditElementCommand command : commadList)
		{
			for(Object object : listDropObject)
			{
				MindFile mindFile = null;
				if(object instanceof MindFile)
				{
					mindFile = (MindFile)object;
					String commandLabel = command.getLabel();
					if((commandLabel.equals(mindFile.getFullpath()))
							&&(command.canExecute())){	
						
						TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
						try {
							command.execute(null, null);
							CommandResult commandResult = command.getCommandResult();
							
							transaction.start();
							
							if(mindFile instanceof MindAdl)
							{
								if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
										|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
								{
									// If Drop on Composite Body or Sub-Component Composite Body
									CompositeReferenceDefinitionImpl newReferenceDefinition = new CompositeReferenceDefinitionImpl();
									newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
									SubComponentDefinitionCustomImpl subComponentDefinition = (SubComponentDefinitionCustomImpl) commandResult.getReturnValue();
									//subComponentDefinition.setName(mindFile.getName() + "_adl");
									
									subComponentDefinition.setReferenceDefinition(newReferenceDefinition);
									
								}
								else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
								{
									// If Drop on ADL Definition
									PrimitiveComponentDefinitionCustomImpl primitiveComponentDefinition = (PrimitiveComponentDefinitionCustomImpl) commandResult.getReturnValue();
									PrimitiveReferencesListImpl referenceList = new PrimitiveReferencesListImpl();
									PrimitiveReferenceDefinitionCustomImpl newReferenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
									
									newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
									primitiveComponentDefinition.setReferencesList(referenceList);
									newReferenceDefinition.setParentReferencesList(referenceList);
									
									//primitiveComponentDefinition.setName(mindFile.getName() + "_adl");
									
								}
								else if(targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
								{
									// If Drop on Primitive Sub-Component
									CompositeReferenceDefinitionCustomImpl referenceDefinition = (CompositeReferenceDefinitionCustomImpl) commandResult.getReturnValue();
								
									referenceDefinition.setReferenceName(mindFile.getQualifiedName());
								}
								else if(targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart)
								{
									// If Drop on Primitive Component
									PrimitiveReferencesListImpl referenceList = (PrimitiveReferencesListImpl) commandResult.getReturnValue();
									
									referenceList.getReferences().get(0).setReferenceName(mindFile.getQualifiedName());
								}
							}
							if(mindFile instanceof MindC)
							{
								if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
										|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
								{
									// If Drop on Composite Component or Sub-Component Composite Body
									SubComponentDefinitionCustomImpl primitiveSubComponent = (SubComponentDefinitionCustomImpl)commandResult.getReturnValue();
									primitiveSubComponent.setName(mindFile.getName());
								
									ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
									FileCCustomImpl fileC = new FileCCustomImpl();
									fileC.setFileName(mindFile.getQualifiedName());
									
									implementationDefinition.setFileC(fileC);
									primitiveSubComponent.getBody().getElements().add(implementationDefinition);
								}
								else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
								{
									// If Drop on ADL Definition
									PrimitiveComponentDefinitionCustomImpl primitiveComponentDefinition = (PrimitiveComponentDefinitionCustomImpl) commandResult.getReturnValue();
									primitiveComponentDefinition.setName(mindFile.getName());
									
									ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
									FileCCustomImpl fileC = new FileCCustomImpl();
									fileC.setFileName(mindFile.getQualifiedName());
									
									implementationDefinition.setFileC(fileC);
									primitiveComponentDefinition.getBody().getElements().add(implementationDefinition);
								}
								else if((targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
										|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
								{
									// If Drop on Primitive Sub Component or Primitive Component
									ImplementationDefinitionCustomImpl implementationDefinition = (ImplementationDefinitionCustomImpl) commandResult.getReturnValue();
									FileCCustomImpl fileC = new FileCCustomImpl();
									fileC.setFileName(mindFile.getQualifiedName());
									
									implementationDefinition.setFileC(fileC);
								}
							}
								
							if(mindFile instanceof MindItf)
							{
								InterfaceDefinitionCustomImpl newInterfaceDefinition = (InterfaceDefinitionCustomImpl) commandResult.getReturnValue();
								newInterfaceDefinition.setSignature(mindFile.getQualifiedName());
								newInterfaceDefinition.setName(mindFile.getName());
								
							}

							transaction.commit();
							
							
							
							List<CanonicalEditPolicy> ListEditPolicy = CanonicalEditPolicy.getRegisteredEditPolicies(EP.getNotationView().getElement());
							for(CanonicalEditPolicy EPItem : ListEditPolicy)
							{
								EPItem.refresh();				        
							}
							
							SetBoundsCommand temp = testBounds;
							if(testBounds != null)
							{
								if (testBounds.canExecute())
								{
									int a = 1;
									testBounds.execute(null, null);
									a = a * 1;
								}
							}
							
						}catch (Exception e){
							e.printStackTrace();
							transaction.rollback();
						}
					}
				}
			}
		}
			
	}
	
}
