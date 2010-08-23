package org.ow2.mindEd.ide.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.model.MindProject;

public class ExportLibWizard extends Wizard implements IExportWizard {
	MindProject mp;
	MindExportLibWizardPage page_1;
	private MindExportLibMPEWizardPage page_2;
	public ExportLibWizard() {
		page_1 = new MindExportLibWizardPage();
		page_2 = new MindExportLibMPEWizardPage();
		addPage(page_1);
		addPage(page_2);
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		if (nextPage == page_2) {
			page_2.setMindProjects(page_1.getMindProjects());
		}
		return nextPage;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		Object elt = selection.getFirstElement();
		if (elt instanceof IResource) {
			IProject p = ((IResource)elt).getProject();
			mp = MindIdeCore.get(p);
		}
		if (elt instanceof MindProject) {
			mp = (MindProject) elt;
		}
	}

	@Override
	public boolean performFinish() {
		return mp != null;
	}

}
