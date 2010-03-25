package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.ArgumentDefinitionEditPart;

/**
 * These are the arguments defined in references
 * @children ArgumentDefinitionName
 * @author maroto
 *
 */
public class ArgumentDefinitionCustomEditPart extends
		ArgumentDefinitionEditPart {

	public ArgumentDefinitionCustomEditPart(View view) {
		super(view);
	}
	
//	/**
//	 * Height of 15 means one line. Generated size was 40,40
//	 */
//	@Override
//	protected NodeFigure createNodePlate() {
//		//set default size
//		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 15);
//		return result;
//	}
	
	
	/**
	 * Custom constraint for the custom layout
	 */
	public void refreshBounds() {
		if (genericEditPart.refreshBounds() == false)
			super.refreshBounds();
	}

	/**
	 * Implements custom policies
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		return genericEditPart.setupContentPane(nodeShape);
	}

	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy glep = genericEditPart.createLayoutEditPolicy();
		if (glep == null)
			glep = super.createLayoutEditPolicy();
		return glep;
	}
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}

}
