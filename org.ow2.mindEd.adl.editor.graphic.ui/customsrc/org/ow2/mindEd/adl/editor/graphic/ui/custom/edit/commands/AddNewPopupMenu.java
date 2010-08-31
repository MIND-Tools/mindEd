package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands;

import java.util.List;


import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.PluginAction;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.WizardAddNewInterface;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;

@SuppressWarnings({ "restriction", "unused" })
public class AddNewPopupMenu extends AbstractPopupMenu implements IObjectActionDelegate{

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings({ "static-access" })
	@Override
	public void run(IAction action) {

		try {
        	
			ISelection selection = ((PluginAction)action).getSelection();
			List<?> elements =((StructuredSelection)selection).toList();
			for (Object element : elements)
			{
				PrimitiveBodyCompartmentEditPart bodyCompartementEditPart = (PrimitiveBodyCompartmentEditPart)element;
				PrimitiveBodyEditPart bodyEditPart = (PrimitiveBodyEditPart)bodyCompartementEditPart.getParent();
/*				
				CreateElementRequest req = new CreateElementRequest(bodyEditPart.getEditingDomain(), bodyEditPart.getNotationView().getElement() , MindElementTypes.InterfaceDefinition_3130);
				EditCommandRequestWrapper request = new EditCommandRequestWrapper(req);
				org.eclipse.gef.commands.Command command = bodyEditPart.getCommand(request);
				if(command.canExecute())
				{
					command.execute();
					List<CanonicalEditPolicy> ListEditPolicy = CanonicalEditPolicy.getRegisteredEditPolicies(bodyEditPart.getNotationView().getElement());
					for(CanonicalEditPolicy EPItem : ListEditPolicy)
					{
						EPItem.refresh();				        
					}	
				}
*/				
				WizardAddNewInterface wizWizard = new WizardAddNewInterface(bodyEditPart); 
		        
		        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
		        wizDialog.setBlockOnOpen(true);
		        if(wizDialog.open() == wizDialog.OK)
		        {
		        	
		        	
		        }
		        
			}
			
        } catch (Exception e) {
            WorkbenchPlugin.log(e);
        }
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	

}
