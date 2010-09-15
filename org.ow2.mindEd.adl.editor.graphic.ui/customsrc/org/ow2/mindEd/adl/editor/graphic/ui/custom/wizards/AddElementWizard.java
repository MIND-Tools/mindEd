package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.internal.WorkbenchPlugin;

public class AddElementWizard extends CustomWizard{

	AddElementPage elementPage = null;
	
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
		this.setForcePreviousAndNextButtons(true);
	}
	
	public void addPages() {
		elementPage = new AddElementPage("temp");
		addPage(elementPage);
	}
	
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
