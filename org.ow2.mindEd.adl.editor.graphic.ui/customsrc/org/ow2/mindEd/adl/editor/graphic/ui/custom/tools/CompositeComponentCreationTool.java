package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.List;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.CompositeCreationWizard;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.PrimitiveCreationWizard;

public class CompositeComponentCreationTool extends UnspecifiedTypeCreationTool{
	
	@Override
	protected void performCreation(int button) {
		
		antiScroll = true;
		
		EditPartViewer viewer = getCurrentViewer();
		Command c = getCurrentCommand();
		if(c != null)
		{
			selectAddedObject(viewer, DiagramCommandStack.getReturnValues(c));
			CompositeCreationWizard wizWizard = new CompositeCreationWizard(); 
	        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
//	        wizWizard.setWizardDialog(wizDialog);
			wizDialog.setBlockOnOpen(true);
			if(wizDialog.open() == WizardDialog.OK)
			{
				
			}
		}
	}

	public CompositeComponentCreationTool(List<?> connectionTypes) {
		super(connectionTypes);
		// TODO Auto-generated constructor stub
	}
}
