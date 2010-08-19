package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.PluginAction;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.adl.custom.impl.FileCCustomImpl;
import org.ow2.mindEd.adl.custom.impl.ImplementationDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.InterfaceDefinitionCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.PrimitiveSubComponentCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.UndefinedSubComponentCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;
import org.ow2.mindEd.adl.impl.CompositeReferenceDefinitionImpl;
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
					MindFile mindFile = mindProject.findMindFile("mindpkg.new");
					if(mindFile != null)
					{
						if(mindFile instanceof MindAdl)
						{
							CreateElementRequest createNewUndefinedSubComponent = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.SubComponentDefinition_3153);
							UndefinedSubComponentCreateCommand createUndefinedSubComponent = new UndefinedSubComponentCreateCommand(createNewUndefinedSubComponent);
							if(createUndefinedSubComponent != null)
							{
								if(createUndefinedSubComponent.canExecute())
								{
									createUndefinedSubComponent.execute(null, null);
									CommandResult commandResult = createUndefinedSubComponent.getCommandResult();
									SubComponentDefinitionCustomImpl subComponentDefinition = (SubComponentDefinitionCustomImpl) commandResult.getReturnValue();
	
									TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
									
									try {
										transaction.start();
										CompositeReferenceDefinitionImpl newReferenceDefinition = new CompositeReferenceDefinitionImpl();
										newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
										subComponentDefinition.setReferenceDefinition(newReferenceDefinition);
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
								CreateElementRequest createNewPrimitiveSubComponent = new CreateElementRequest(EP.getEditingDomain(), EP.resolveSemanticElement() , MindElementTypes.SubComponentDefinition_3135);
								PrimitiveSubComponentCreateCommand createCommandPrimitiveSubComponent = new PrimitiveSubComponentCreateCommand(createNewPrimitiveSubComponent);
								if(createCommandPrimitiveSubComponent != null){
									if(createCommandPrimitiveSubComponent.canExecute()){	
										createCommandPrimitiveSubComponent.execute(null, null);
										
										CommandResult commandResult = createCommandPrimitiveSubComponent.getCommandResult();
										SubComponentDefinitionCustomImpl temp = (SubComponentDefinitionCustomImpl)commandResult.getReturnValue();
										
										TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
										
										try {
											transaction.start();
											ImplementationDefinitionCustomImpl e = new ImplementationDefinitionCustomImpl();
											FileCCustomImpl fileC = new FileCCustomImpl();
											fileC.setFileName(mindFile.getQualifiedName());
											
											e.setFileC(fileC);
											temp.getBody().getElements().add(e);
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
