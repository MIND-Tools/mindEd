package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

public class CompositeCreationWizard extends CustomWizard{

	CompositeMainPage compositeMainPage; 
	
	public CompositeCreationWizard()
	{
		super();
	}
	
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void addPages() {
		compositeMainPage = new CompositeMainPage("Main Page");
		this.addPage(compositeMainPage);
	}

}
