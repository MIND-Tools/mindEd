package org.ow2.fractal.mind.diagram.custom.edit.parts;

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
	
	
//	@Override
//	protected NodeFigure createNodePlate() {
//		//Set fixed size
//		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 15);
//		return result;
//	}
	
//	@Override
//	protected IFigure setupContentPane(IFigure nodeShape) {
//		if (nodeShape.getLayoutManager() == null) {
//			//No spacing anymore
//			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
//			nodeShape.setLayoutManager(layout);
//		}
//		return nodeShape; // use nodeShape itself as contentPane
//	}
	
	

}
