package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.internal.WorkbenchPlugin;

@SuppressWarnings("restriction")
public class WizardPrimitiveComponent extends CustomWizard {

	IWizardPage primitiveMainPage;
	IWizardPage primitiveSecondPage;
	
	WizardDialog wizardDialog;

	public WizardPrimitiveComponent()
	{
		super();
		
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
        
        this.setForcePreviousAndNextButtons(true);
        

	}
	
	public void addPages() {
		primitiveMainPage = new WizardPagePrimitiveMain("Main Page", this);
		addPage(primitiveMainPage);
		
		
	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void enableSecondPage()
	{
		this.setForcePreviousAndNextButtons(true);
		if(primitiveSecondPage==null)
		{
			primitiveSecondPage = new WizardPagePrimitiveSecond("Second Page");
			addPage(primitiveSecondPage);
		}
		wizardDialog.updateButtons();
	}
	
	public void disableSecondPage()
	{
		this.setForcePreviousAndNextButtons(false);
		if(primitiveSecondPage!=null)
		{
			removePage(primitiveSecondPage);
			primitiveSecondPage=null;
		}
		wizardDialog.updateButtons();
	}

	public void setWizardDialog(WizardDialog wizDialog) {
		wizardDialog = wizDialog;
		
	}
	
}
