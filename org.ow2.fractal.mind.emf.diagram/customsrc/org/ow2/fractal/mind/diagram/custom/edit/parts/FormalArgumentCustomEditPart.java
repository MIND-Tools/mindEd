package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

import adl.diagram.edit.parts.FormalArgumentEditPart;

/**
 * This is an argument contained in a FormalArgumentsList
 * @author maroto
 *
 */
public class FormalArgumentCustomEditPart extends FormalArgumentEditPart {

	public FormalArgumentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	public void refreshBounds() {
		if (genericEditPart.refreshBounds() == false)
			super.refreshBounds();
	}
	
	public void refresh() {
		super.refresh();
		genericEditPart.refresh();
	}
	
	
	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure result = genericEditPart.createNodePlate();
		if (result == null)
			result = super.createNodePlate();
		return result;
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		IFigure result = genericEditPart.setupContentPane(nodeShape);
		if (result == null)
			result = super.setupContentPane(nodeShape);
		return result;
	}
	
	

}
