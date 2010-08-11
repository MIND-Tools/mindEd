package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.Collection;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.WizardAddNewInterface;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards.WizardPrimitiveComponent;

public class PrimitiveComponentCreationTool extends UnspecifiedTypeCreationTool{

	@Override
	protected void performCreation(int button) {
		antiScroll = true;
		
		EditPartViewer viewer = getCurrentViewer();
		Command c = getCurrentCommand();
		executeCurrentCommand();
		selectAddedObject(viewer, DiagramCommandStack.getReturnValues(c));
		Collection<Object> temp = DiagramCommandStack.getReturnValues(c);
		
		WizardPrimitiveComponent wizWizard = new WizardPrimitiveComponent(); 
        WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizWizard);
        wizWizard.setWizardDialog(wizDialog);
		wizDialog.setBlockOnOpen(true);
		wizDialog.open();
		
		antiScroll = false;
	}

	public PrimitiveComponentCreationTool(List connectionTypes) {
		super(connectionTypes);
		// TODO Auto-generated constructor stub
	}
	
}
