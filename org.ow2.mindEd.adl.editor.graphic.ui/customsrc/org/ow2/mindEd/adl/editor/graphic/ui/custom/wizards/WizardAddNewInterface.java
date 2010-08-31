package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;


import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Path;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.part.FileEditorInput;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.util.CreationUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditor;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.ide.core.MindException;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindProject;

@SuppressWarnings("restriction")
public class WizardAddNewInterface extends Wizard{

	WizardPageAddNewInterface mainPage;
	WizardSelectionTest selectionPage;
	PrimitiveBodyEditPart bodyEditPart;
	
	public InterfaceInformation newInterfaceInformation = new InterfaceInformation();
	

	public WizardAddNewInterface(PrimitiveBodyEditPart bodyEP){
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
        this.setWindowTitle(ResourcesWizard.WIZARD_TITLE);
	}
	
	
	public void addPages() {
		mainPage = new WizardPageAddNewInterface("Main Page");
		addPage(mainPage);
//		selectionPage = new WizardNewFileCreationPage("SelectionPage", (IStructuredSelection) currentSelection);
//		selectionPage = new WizardSelectionTest("Test1", (IStructuredSelection) currentSelection);
//		addPage(selectionPage);
	}
	
	@Override
	public boolean performFinish() {
		if((mainPage.getInterfaceName() == null) || (mainPage.getInterfaceName().length() == 0))
		{
			new WizardMessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_NAME
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		else 
			newInterfaceInformation.setName(mainPage.getInterfaceName());
		
		
		if((mainPage.getSignature() == null) || (mainPage.getSignature().length() == 0))
		{
			new WizardMessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
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
				new WizardMessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
						, ResourcesWizard.ERROR_EXTENSION
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
		


		@SuppressWarnings("unused")
		InterfaceDefinition newInterface = null;
        try {
              TransactionImpl transaction = new TransactionImpl(bodyEditPart.getEditingDomain(), false);
              transaction.start();
              newInterface = CreationUtil.createInterface((Body) (bodyEditPart.resolveSemanticElement())
            		  ,null
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

				
		return true;
	}

}
