package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;


import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.CreateNewFile;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.ExistingFolder;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.ExistingProject;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyEditPart;
import org.ow2.mindEd.ide.core.MindException;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;

@SuppressWarnings("restriction")
public class InterfaceCreationWizard extends Wizard{

	InterfaceMainPage mainPage;
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
					, ResourcesWizard.ERROR_WARNING
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
					, ResourcesWizard.ERROR_WARNING
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
						, ResourcesWizard.ERROR_WARNING
						, String.format(ResourcesWizard.ERROR_EXTENSION, "'itf'")
						, SWT.ICON_WARNING | SWT.OK)
				.open();
				return false;
			}
		}
		newInterfaceInformation.setOptional(mainPage.getOptional());
		newInterfaceInformation.setCollection(mainPage.getCollection());
		newInterfaceInformation.setCollectionSize(mainPage.getCollectionSize());
		
		
		URI uri = URI.createPlatformResourceURI(newInterfaceInformation.getPath(), true);
		IFile file = ModelToProjectUtil.INSTANCE.getIFile(uri);
		if(file == null)
		{
			MessageBoxWizard msgCreation = new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
						, ResourcesWizard.ERROR_WARNING
						, String.format(ResourcesWizard.ERROR_UNEXISTING_FILE, "'itf'")
						, SWT.ICON_WARNING | SWT.YES | SWT.NO | SWT.CANCEL);
			int messageBoxResult = msgCreation.open();
			if(messageBoxResult == SWT.YES)
			{
				String path[] = uri.toPlatformString(false).split("/");
				for(int i = 1 ; i<path.length ; i++)
				{
					String partielPath = "";
					String containerPath = "";
					for(int j=1;j<=i;j++)
					{
						partielPath +="/"+path[j];
						if(i!=j)
							containerPath+="/"+path[j];
					}
					
					Path folderPath = new Path(partielPath);

					if(!partielPath.endsWith(".itf"))
					{
						if(i==1)
						{
							Project project = new ExistingProject(folderPath, (Workspace) ResourcesPlugin.getWorkspace());
							MindObject mindProject = MindIdeCore.get(project);
							if(mindProject == null)
							{
								new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
										, "Error"
										, "You must use an existing project."
										, SWT.ICON_ERROR |SWT.CANCEL).open();
								return false;
							}
						}
						else
						{
							Folder folder = new ExistingFolder(folderPath, (Workspace) ResourcesPlugin.getWorkspace());
							MindObject mindFolder = MindIdeCore.get(folder);
							if(mindFolder == null)
							{
								try {
									MindIdeCore.createMindPackage(containerPath, path[i], null);
								} catch (CoreException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}	
						}
					}
					int a = 1;
					a = a * 1;
				}
				
				Path newItfPath = new Path(uri.toPlatformString(false)); 
				
				File newItfFile = new CreateNewFile(newItfPath, (Workspace) ResourcesPlugin.getWorkspace());
				try {
					MindIdeCore.createITFTemplate(newItfFile,null);
				} catch (MindException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return true;
			}
			else if(messageBoxResult == SWT.NO)
				return true;
			else
				return false;
		}
		
		
				
		return true;
	}

	
	
}
