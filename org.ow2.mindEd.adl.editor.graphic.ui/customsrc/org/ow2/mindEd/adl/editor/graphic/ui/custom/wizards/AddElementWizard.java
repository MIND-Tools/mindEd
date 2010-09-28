package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;

public class AddElementWizard extends CustomWizard{

	AddElementPage elementPage = null;
	ImplementationInformation implInformation = new ImplementationInformation();
	
	public AddElementWizard(){
		super();
		
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
		IDialogSettings wizardSettings = workbenchSettings.getSection("NewWizardAction"); //$NON-NLS-1$
		
		if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction"); //$NON-NLS-1$
		}
		this.setDialogSettings(wizardSettings);
		this.setForcePreviousAndNextButtons(false);
		this.setWindowTitle(ResourcesWizard.ADD_ELEMENT_WIZARD_TITLE);
		this.setForcePreviousAndNextButtons(false);
	}
	
	public void addPages() {
		elementPage = new AddElementPage("temp");
		addPage(elementPage);
	}
	
	
	@Override
	public boolean performFinish() {
		
		implInformation.setInline(elementPage.isInline());
		if(implInformation.isInline())
			implInformation.setInlineText(elementPage.getInlineText());
		
		implInformation.setFile(elementPage.isFile());
		if(implInformation.isFile())
			implInformation.setFilePath(elementPage.getFilePath());
		
		if(implInformation.isFile())
		{
			if(!implInformation.getFilePath().endsWith(".c"))
			{
				new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
						, ResourcesWizard.ADD_ELEMENT_FILE_ERROR
						, SWT.ICON_WARNING | SWT.OK)
				.open();
				return false;
			}
			else
				return true;
		}
		else if(implInformation.isInline())
		{
			if(!implInformation.getInlineText().isEmpty())
				if(!(implInformation.getInlineText().startsWith("{{")
						&& implInformation.getInlineText().endsWith("}}")))
				{
					new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
							, ResourcesWizard.ADD_ELEMENT_INLINE_ERROR
							, SWT.ICON_WARNING | SWT.OK)
					.open();
					return false;
				}
				else
					return true;
		}
		return false;
	}
	
	public ImplementationInformation getImplementationInformation()
	{		
		return implInformation;
	}

}
