package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;

public class CompositeCreationWizard extends CustomWizard{

	CompositeMainPage compositeMainPage; 
	boolean isSubComponent = false;
	
	CompositeComponentInformation compositeInformation;
	
	public CompositeComponentInformation getCompositeInformation() {
		return compositeInformation;
	}


	public CompositeCreationWizard(boolean subComponent)
	{
		super();
		
		isSubComponent = subComponent;
		
		compositeInformation = new CompositeComponentInformation();
		
	}
	
	
	@Override
	public boolean performFinish() {

		compositeInformation.setCompositeName(compositeMainPage.getCompositeComponentName());
		compositeInformation.setListExtends(compositeMainPage.getListExtends());
		if(isSubComponent)
			compositeInformation.setExtendPath(compositeMainPage.getExtendPath());
		
		
		if((compositeInformation.getCompositeName() == null)
				|| (compositeInformation.getCompositeName().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_WARNING
					, ResourcesWizard.ERROR_NAME
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		
		return true;
	}


	@Override
	public void addPages() {
		compositeMainPage = new CompositeMainPage("Main Page", isSubComponent);
		this.addPage(compositeMainPage);
	}

}
