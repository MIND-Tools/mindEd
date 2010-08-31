package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class WizardPagePrimitiveSecond extends WizardPage{

	Composite topLevel;
	
	protected WizardPagePrimitiveSecond(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		topLevel = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 3;
			topLevel.setLayout(layout);
			topLevel.setFont(parent.getFont());
			setControl(topLevel);
		}
		
        new Label(topLevel,SWT.NONE).setText("Name");
	}

}
