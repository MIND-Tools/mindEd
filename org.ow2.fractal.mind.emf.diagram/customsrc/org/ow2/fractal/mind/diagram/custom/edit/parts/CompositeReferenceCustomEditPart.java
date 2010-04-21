package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import adl.diagram.edit.parts.CompositeReferenceEditPart;

/**
 * Extends CompositeReferenceDefinitionEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * - Grid layout data<p>
 * This is a reference contained in a CompositeReferencesList
 * @author maroto
 *
 */
public class CompositeReferenceCustomEditPart extends
		CompositeReferenceEditPart {

	public CompositeReferenceCustomEditPart(View view) {
		super(view);
	}
	
	
	

}
