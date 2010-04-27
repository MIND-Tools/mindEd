package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.BindingCustomFigure;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorSource;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorTarget;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public class MindBindingEditPart {
	
	protected ConnectionEditPart realEditPart;
	protected int visualID;

	public MindBindingEditPart(ConnectionEditPart editPart, int vID) {
		if (editPart == null) throw new NullPointerException();
		realEditPart = editPart;
		visualID = vID;
	}

	/**
	 * On activation, send commands to modify the routing style :
	 * set the router to rectilinear, and the rounding to the valor set in the figure
	 */
	public void activateFigure() {
		// Originally in activateFigure()
		RoutingStyle style = (RoutingStyle) ((View) realEditPart.getModel())
	     .getStyle(NotationPackage.Literals.ROUTING_STYLE);
		
		// Transaction
		try {
			TransactionImpl trans = new TransactionImpl(realEditPart.getEditingDomain(), false);
			trans.start();
			// Set the routing style to rectilinear
			style.setRouting(Routing.RECTILINEAR_LITERAL);
			// Set the rounded radius
			style.setRoundedBendpointsRadius(((BindingCustomFigure)realEditPart.getFigure()).getRoundedBendpointsRadius());
			trans.commit();
		}
		catch (IllegalStateException e) {
			// It's okay, do nothing.
			// Anyway this bit of code should be placed elsewhere
		}
		catch (Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Unable to set binding's routing style", e);
		}
		
		// The width of the connection's line
		setLineWidth(2);
	}
	
	/**
	 * Implementation to set the line width of the connection
	 */
	public void setLineWidth (int width) {
		IFigure figure = realEditPart.getFigure();
		if (figure instanceof Polyline)
			((Polyline)figure).setLineWidth(width);
	}

	
	/**
	 * Custom anchor source to bind the binding on the image instead of the label
	 */
	public ConnectionAnchor getSourceConnectionAnchor() {
		return new BindingConnectionCustomAnchorSource(realEditPart);
	}

	/**
	 * Custom anchor target to bind the binding on the image instead of the label
	 */
	public ConnectionAnchor getTargetConnectionAnchor() {
		return new BindingConnectionCustomAnchorTarget(realEditPart);
	}
	

}
