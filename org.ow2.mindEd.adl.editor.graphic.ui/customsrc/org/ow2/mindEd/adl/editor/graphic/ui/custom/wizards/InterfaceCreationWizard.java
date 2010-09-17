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
import org.ow2.mindEd.adl.Role;
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

				
		return true;
	}

	
	
}
