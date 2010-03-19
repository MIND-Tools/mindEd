package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindBindingEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.BindingDefinitionEditPart;

/**
 * Bindings between interfaces
 * @author maroto
 *
 */
public class BindingDefinitionCustomEditPart extends BindingDefinitionEditPart {

	protected MindBindingEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public BindingDefinitionCustomEditPart(View view) {
		super(view);
	}
		
	
	@Override
	public void activateFigure() {
		
		super.activateFigure();
		
		genericEditPart.activateFigure();
	}
	
	
	@Override
	protected ConnectionAnchor getSourceConnectionAnchor() {
		return genericEditPart.getSourceConnectionAnchor();
	}

	
	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		return genericEditPart.getTargetConnectionAnchor();
	}
	
}
