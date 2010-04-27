package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.FileCEditPart;


/** 
 * This is a reference to a .c file, contained in a DataDefinition or an ImplementationDefinition
 * @author maroto
 *
 */

public class FileCCustomEditPart extends
		FileCEditPart {
	
	public FileCCustomEditPart(View view) {
		super(view);
	}
	
	

}
