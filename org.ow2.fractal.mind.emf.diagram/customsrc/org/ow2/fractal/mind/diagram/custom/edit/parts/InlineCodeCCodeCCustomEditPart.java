package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.gef.ui.internal.parts.WrapTextCellEditor;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.InlineCodeCCodeCEditPart;
import adl.diagram.edit.parts.MindEditPartFactory;

/**
 * This is the text label of an InlineCCode
 * @Author mao
 */

@SuppressWarnings("restriction")
public class InlineCodeCCodeCCustomEditPart extends InlineCodeCCodeCEditPart {

	public InlineCodeCCodeCCustomEditPart(View view) {
		super(view);
	}
	
	//We need the boolean to know if the manager must be set or get
	protected boolean managerIsSet = false;
	
	/**
	 * getManager() is overridden to get a TextDirectEditManager
	 * This should not be needed but it's a GMF bug, maybe it will get fixed later
	 * @author maroto
	 */
	@Override
	protected DirectEditManager getManager() {
		//Change the manager to add a line return with ctrl-return
		if (managerIsSet == false) {
			setManager(new TextDirectEditManager(this,
					WrapTextCellEditor.class, MindEditPartFactory
							.getTextCellEditorLocator(this)));
			managerIsSet = true;
		}
		return super.getManager();
	}

}
