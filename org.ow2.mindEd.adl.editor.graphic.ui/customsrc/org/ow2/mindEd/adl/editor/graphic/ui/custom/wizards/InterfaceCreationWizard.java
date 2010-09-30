package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyEditPart;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindProject;

@SuppressWarnings("restriction")
public class InterfaceCreationWizard extends Wizard{

	InterfaceMainPage mainPage;
	WizardSelectionTest selectionPage;
	PrimitiveBodyEditPart bodyEditPart;
	
	protected InterfaceInformation newInterfaceInformation = new InterfaceInformation();
	

	public InterfaceInformation getNewInterfaceInformation() {
		return newInterfaceInformation;
	}
	public void setNewInterfaceInformation(
			InterfaceInformation newInterfaceInformation) {
		this.newInterfaceInformation = newInterfaceInformation;
	}

	public InterfaceCreationWizard(PrimitiveBodyEditPart bodyEP){
		super();
		
		bodyEditPart = bodyEP;
		
        IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault()
        .getDialogSettings();
        IDialogSettings wizardSettings = workbenchSettings
                .getSection("NewWizardAction"); //$NON-NLS-1$
        if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction"); //$NON-NLS-1$
		}
        this.setDialogSettings(wizardSettings);
        this.setForcePreviousAndNextButtons(false);
        this.setWindowTitle(ResourcesWizard.INTERFACE_WIZARD_TITLE);
	}
	
	
	public void addPages() {
		mainPage = new InterfaceMainPage("Main Page");
		addPage(mainPage);
	}
	
	@Override
	public boolean performFinish() {
		if((mainPage.getInterfaceName() == null) || (mainPage.getInterfaceName().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_NAME
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		else 
			newInterfaceInformation.setName(mainPage.getInterfaceName());
		
		
		if((mainPage.getSignature() == null) || (mainPage.getSignature().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_PATH
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		else 
		{
			newInterfaceInformation.setPath(mainPage.getSignature());
			if(!newInterfaceInformation.getPath().endsWith(".itf"))
			{
				new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
						, String.format(ResourcesWizard.ERROR_EXTENSION, "'itf'")
						, SWT.ICON_WARNING | SWT.OK)
				.open();
				return false;
			}
		}
		newInterfaceInformation.setOptional(mainPage.getOptional());
		newInterfaceInformation.setCollection(mainPage.getCollection());
		newInterfaceInformation.setCollectionSize(mainPage.getCollectionSize());
		
		String elements[] = newInterfaceInformation.getPath().split("/");
		IProject project ;
		if(elements[0].equals(""))
			project = ResourcesPlugin.getWorkspace().getRoot().getProject(elements[1]);
		else
			project = ResourcesPlugin.getWorkspace().getRoot().getProject(elements[0]);
		
	
		
		// TODO Currently, itf path is /project/src/pkg/name.itf". Convert this form to use ModelToProjectUtil
		
		MindProject mindProject = ModelToProjectUtil.INSTANCE.getMindProject(project);
		

/*
		@SuppressWarnings("unused")
		InterfaceDefinition newInterface = null;
        try {
              TransactionImpl transaction = new TransactionImpl(bodyEditPart.getEditingDomain(), false);
              transaction.start();
              newInterface = CreationUtil.createInterface((Body) (bodyEditPart.resolveSemanticElement())
            		  ,Role.REQUIRES
            		  ,newInterfaceInformation.getName()
            		  ,newInterfaceInformation.getPath()
            		  ,newInterfaceInformation.isOptional()
            		  ,newInterfaceInformation.isCollection()
            		  ,newInterfaceInformation.getCollectionSize());
              transaction.commit();
        }
        catch(Exception e) {
              MindDiagramEditorPlugin.getInstance().logError("Error generating an interface to bind", e);
        }
*/
				
		return true;
	}

	
	
}
