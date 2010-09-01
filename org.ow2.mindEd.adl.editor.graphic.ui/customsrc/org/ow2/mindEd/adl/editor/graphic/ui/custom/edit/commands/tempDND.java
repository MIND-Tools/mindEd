package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands;

import java.util.List;



import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.PluginAction;
import org.eclipse.ui.internal.WorkbenchPlugin;
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
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindC;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindProject;

@SuppressWarnings("restriction")
public class tempDND extends AbstractPopupMenu implements IObjectActionDelegate{

	@Override
	public void run(IAction action) {
		
		try {
				ISelection selection = ((PluginAction)action).getSelection();
				@SuppressWarnings("rawtypes")
				List elements =((StructuredSelection)selection).toList();
				for (Object element : elements)
				{
//					CompositeBodyCompartmentCustomEditPart EP = (CompositeBodyCompartmentCustomEditPart)element;
					GraphicalEditPart EP = (GraphicalEditPart)element;
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("test_mind");
					MindProject mindProject = ModelToProjectUtil.INSTANCE.getMindProject(project);
					
					// Get Mind File
					MindFile mindFile = mindProject.findMindFile("mindpkg.new");
					if(mindFile != null)
					{
						// Test Type of Mind File
						if(mindFile instanceof MindAdl)
						{
							// Type of Mind File is ADL
							EditElementCommand command = null;

							if((element instanceof CompositeBodyCompartmentCustomEditPart)
									|| (element instanceof SubComponentCompositeBodyCompartmentEditPart))
							{
								// If Drop on Composite Body or Sub-Component Composite Body
								// Create new Undefined Primitive Sub-Component
								CreateElementRequest createNewUndefinedSubComponent = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.SubComponentDefinition_3153);
								command = new UndefinedSubComponentCreateCommand(createNewUndefinedSubComponent);
							}
							else if(element instanceof AdlDefinitionCustomEditPart)
							{
								// If Drop on ADL Definition
								// Create new Primitive Component
								CreateElementRequest createNewPrimitiveComponent = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.PrimitiveComponentDefinition_2008);
								command = new PrimitiveComponentDefinitionCreateCommand(createNewPrimitiveComponent); 
							}
							else if(element instanceof SubComponentPrimitiveBodyCompartmentEditPart)
							{
								// If Drop on Primitive Sub Component
								
								PrimitiveSubComponentCustomEditPart primitiveSubCompo = (PrimitiveSubComponentCustomEditPart) EP.getParent().getParent();
								
								CreateElementRequest createNewExtends = new CreateElementRequest(
										primitiveSubCompo.getEditingDomain(), 
										primitiveSubCompo.resolveSemanticElement() , 
										MindElementTypes.CompositeComponentDefinition_2007);
				
								command = new PrimitiveSubReferenceCreateCommand(createNewExtends);
							}
							else if(element instanceof PrimitiveBodyCompartmentCustomEditPart)
							{
								// If Drop on Primitive Component
								PrimitiveComponentDefinitionCustomEditPart primitiveCompo = (PrimitiveComponentDefinitionCustomEditPart) EP.getParent().getParent();
								
								CreateElementRequest createNewExtends = new CreateElementRequest(
										primitiveCompo.getEditingDomain(), 
										primitiveCompo.resolveSemanticElement() , 
										MindElementTypes.PrimitiveReferencesList_3124);
				
								command = new PrimitiveReferencesListCreateCommand(createNewExtends);
							}
							

							if(command != null)
							{
								if(command.canExecute())
								{
									command.execute(null, null);
									CommandResult commandResult = command.getCommandResult();
									TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
									
									try {
										transaction.start();
										if((element instanceof CompositeBodyCompartmentCustomEditPart)
												|| (element instanceof SubComponentCompositeBodyCompartmentEditPart))
										{
											// If Drop on Composite Body or Sub-Component Composite Body
											CompositeReferenceDefinitionImpl newReferenceDefinition = new CompositeReferenceDefinitionImpl();
											newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
											SubComponentDefinitionCustomImpl subComponentDefinition = (SubComponentDefinitionCustomImpl) commandResult.getReturnValue();
											
											subComponentDefinition.setReferenceDefinition(newReferenceDefinition);
										}
										else if(element instanceof AdlDefinitionCustomEditPart)
										{
											// If Drop on ADL Definition
											PrimitiveComponentDefinitionCustomImpl primitiveComponentDefinition = (PrimitiveComponentDefinitionCustomImpl) commandResult.getReturnValue();
											PrimitiveReferencesListImpl referenceList = new PrimitiveReferencesListImpl();
											PrimitiveReferenceDefinitionCustomImpl newReferenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
											
											newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
											primitiveComponentDefinition.setReferencesList(referenceList);
											newReferenceDefinition.setParentReferencesList(referenceList);
										}
										else if(element instanceof SubComponentPrimitiveBodyCompartmentEditPart)
										{
											// If Drop on Primitive Sub-Component
											CompositeReferenceDefinitionCustomImpl referenceDefinition = (CompositeReferenceDefinitionCustomImpl) commandResult.getReturnValue();
										
											referenceDefinition.setReferenceName(mindFile.getQualifiedName());
										}
										else if(element instanceof PrimitiveBodyCompartmentCustomEditPart)
										{
											// If Drop on Primitive Component
											PrimitiveReferencesListImpl referenceList = (PrimitiveReferencesListImpl) commandResult.getReturnValue();
											
											referenceList.getReferences().get(0).setReferenceName(mindFile.getQualifiedName());
										}
										transaction.commit();
										
									}
									catch (Exception e){
										e.printStackTrace();
										transaction.rollback();
									}
									
								}
							}
						}
						else {
							if(mindFile instanceof MindC)
							{
								// Type of Mind File is MindC
								EditElementCommand command = null;
								
								if((element instanceof CompositeBodyCompartmentCustomEditPart)
										|| (element instanceof SubComponentCompositeBodyCompartmentEditPart))
								{
									// If Drop on Composite Body or Sub-Component Composite Body
									CreateElementRequest createNewPrimitiveSubComponent = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.SubComponentDefinition_3135);
									command = new PrimitiveSubComponentCreateCommand(createNewPrimitiveSubComponent);
								}
								else if(element instanceof AdlDefinitionCustomEditPart)
								{
									// If Drop on ADL Definition
									// Create new Primitive Component
									CreateElementRequest createNewPrimitiveComponent = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.PrimitiveComponentDefinition_2008);
									command = new PrimitiveComponentDefinitionCreateCommand(createNewPrimitiveComponent); 
								}
								else if((element instanceof SubComponentPrimitiveBodyCompartmentEditPart)
										|| (element instanceof PrimitiveBodyCompartmentCustomEditPart))
								{
									// If Drop on Primitive Sub Component or Primitive Component								
									CreateElementRequest createNewImplementation = new CreateElementRequest(
											EP.getEditingDomain(), 
											EP.resolveSemanticElement() , 
											MindElementTypes.ImplementationDefinition_3140);
									command = new ImplementationDefinitionCreateCommand(createNewImplementation); 
								}
								
								
								if(command != null){
									if(command.canExecute()){	
										command.execute(null, null);
										CommandResult commandResult = command.getCommandResult();
										TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
										
										try {
											transaction.start();
											if((element instanceof CompositeBodyCompartmentCustomEditPart)
												|| (element instanceof SubComponentCompositeBodyCompartmentEditPart))
											{
												// If Drop on Composite Component or Sub-Component Composite Body
												SubComponentDefinitionCustomImpl primitiveSubComponent = (SubComponentDefinitionCustomImpl)commandResult.getReturnValue();
											
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFile.getQualifiedName());
												
												implementationDefinition.setFileC(fileC);
												primitiveSubComponent.getBody().getElements().add(implementationDefinition);
											}
											else if(element instanceof AdlDefinitionCustomEditPart)
											{
												// If Drop on ADL Definition
												PrimitiveComponentDefinitionCustomImpl primitiveComponentDefinition = (PrimitiveComponentDefinitionCustomImpl) commandResult.getReturnValue();
												
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFile.getQualifiedName());
												
												implementationDefinition.setFileC(fileC);
												primitiveComponentDefinition.getBody().getElements().add(implementationDefinition);
											}
											else if((element instanceof SubComponentPrimitiveBodyCompartmentEditPart)
													|| (element instanceof PrimitiveBodyCompartmentCustomEditPart))
											{
												// If Drop on Primitive Sub Component or Primitive Component
												ImplementationDefinitionCustomImpl implementationDefinition = (ImplementationDefinitionCustomImpl) commandResult.getReturnValue();
												FileCCustomImpl fileC = new FileCCustomImpl();
												fileC.setFileName(mindFile.getQualifiedName());
												
												implementationDefinition.setFileC(fileC);
											}
											
											transaction.commit();
											
										}catch (Exception e){
											e.printStackTrace();
											transaction.rollback();
										}
									}
								}
								
							}
							else {
								if(mindFile instanceof MindItf)
								{
									CreateElementRequest createNewInterface = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.InterfaceDefinition_3130);
									InterfaceDefinitionCreateCommand createCommandInterfaceDefinition = new InterfaceDefinitionCreateCommand(createNewInterface);
									if(createCommandInterfaceDefinition != null){
										if(createCommandInterfaceDefinition.canExecute()){
											createCommandInterfaceDefinition.execute(null, null);
											CommandResult commandResult = createCommandInterfaceDefinition.getCommandResult();
											InterfaceDefinitionCustomImpl newInterfaceDefinition = (InterfaceDefinitionCustomImpl) commandResult.getReturnValue();
											
											TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
											
											try {
												transaction.start();
												newInterfaceDefinition.setSignature(mindFile.getQualifiedName());
												newInterfaceDefinition.setName(mindFile.getName() + "_itf");
												transaction.commit();
												
											}catch (Exception e){
												e.printStackTrace();
												transaction.rollback();
											}
										}
									}
								}
							}
						}
						
						List<CanonicalEditPolicy> ListEditPolicy = CanonicalEditPolicy.getRegisteredEditPolicies(EP.getNotationView().getElement());
						for(CanonicalEditPolicy EPItem : ListEditPolicy)
						{
							EPItem.refresh();				        
						}
					}
				}
		}
		catch (Exception e) {
            WorkbenchPlugin.log(e);
        }
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}
	
	
}
