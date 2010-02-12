/**
 * Not used yet - annotations disabled
 */

//package org.ow2.fractal.mind.diagram.custom.edit.parts;
//
//import org.eclipse.draw2d.IFigure;
//import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
//import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
//import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
//import org.eclipse.gmf.runtime.notation.View;
//
//import adl.diagram.edit.parts.AnnotationEditPart;
//
///**
// * Old code - needs to be updated, but will do for now
// * Check other list-type EditParts
// * @author maroto
// *
// */
//public class AnnotationCustomEditPart extends AnnotationEditPart {
//
//	public AnnotationCustomEditPart(View view) {
//		super(view);
//	}
//	
//	@Override
//	protected NodeFigure createNodePlate() {
//		//Set default size
//		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 15);
//		return result;
//	}
//	
//	@Override
//	protected IFigure setupContentPane(IFigure nodeShape) {
//		if (nodeShape.getLayoutManager() == null) {
//			//No spacing anymore
//			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
//			nodeShape.setLayoutManager(layout);
//		}
//		return nodeShape; // use nodeShape itself as contentPane
//	}
//
//	
//	
//}
