package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class WizardMessageBox {

	private MessageBox messageBox;
	
	public  WizardMessageBox(Shell shell, String message, int style)
	{
		int usedStyle = 0;
		if(style == SWT.NONE)
			usedStyle = SWT.YES | SWT.NO;
		else 
			usedStyle = style;
		
		messageBox = new MessageBox(shell, usedStyle);
		messageBox.setMessage(message);
		
	}
	
	public int open()
	{
	    return messageBox.open();
	}

}
