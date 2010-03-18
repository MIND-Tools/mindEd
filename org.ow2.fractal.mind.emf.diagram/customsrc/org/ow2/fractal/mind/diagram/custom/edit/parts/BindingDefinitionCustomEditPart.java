package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindBindingEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPartFactory;
import org.ow2.fractal.mind.diagram.custom.figures.BindingCustomFigure;
import org.ow2.fractal.mind.diagram.custom.layouts.BindingConnectionCustomAnchorSource;
import org.ow2.fractal.mind.diagram.custom.layouts.BindingConnectionCustomAnchorTarget;

import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.part.MindDiagramEditorPlugin;

/**
 * Bindings between interfaces
 * @author maroto
 *
 */
public class BindingDefinitionCustomEditPart extends BindingDefinitionEditPart {

	protected MindBindingEditPart genericEditPart = MindEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
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
