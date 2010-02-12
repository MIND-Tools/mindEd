package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;

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
	
	/**
	 * Height of 15 means one line. Generated size was 40,40
	 */
	@Override
	protected NodeFigure createNodePlate() {
		//set default size
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 15);
		return result;
	}
	
	/**
	 * Default layout is OK but we don't want the spacing
	 */
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			//no spacing anymore
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	/**
	 * Refresh the bounds and sets a grid constraint
	 */
	@Override
	public void refreshBounds() {
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		Dimension size = new Dimension(width, height);
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		getFigure().setBounds(new Rectangle(loc,size));
		//The layout constraint is a GridData
		((GraphicalEditPart) getParent()).setLayoutConstraint(
		this,
		getFigure(),
		new GridData(SWT.LEFT,SWT.BEGINNING,false,false,1,1));
	}

	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
				ComponentHelper.handleMergedElement(this);
	}

}
