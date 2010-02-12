package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
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

	public BindingDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected Connection createConnectionFigure() {
		// Custom figure, but not used yet
		BindingCustomFigure figure = new BindingCustomFigure();
		return figure;
	}
		
	/**
	 * On activation, send commands to modify the routing style :
	 * set the router to rectilinear, and the rounding to the valor set in the figure
	 */
	@Override
	public void activateFigure() {
		RoutingStyle style = (RoutingStyle) ((View) getModel())
	     .getStyle(NotationPackage.Literals.ROUTING_STYLE);
		
		
		// set routing command
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getEditingDomain(), "setRouting");
		
		// set router to rectilinear
		SetCommand setRoutingCmd = new SetCommand(
				getEditingDomain(), style,
				style.eClass().getEStructuralFeature(NotationPackage.CONNECTOR__ROUTING),
				Routing.RECTILINEAR_LITERAL);
		EMFCommandOperation setRoutingOperation = new EMFCommandOperation(getEditingDomain(),setRoutingCmd);
		cc.add(setRoutingOperation);
		
		// setRoundedBendpointsRadius
		SetCommand setRadiusCmd = new SetCommand(
				getEditingDomain(), style,
				style.eClass().getEStructuralFeature(NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS),
				((BindingCustomFigure) getFigure()).getRoundedBendpointsRadius());		
		EMFCommandOperation setRadiusOperation = new EMFCommandOperation(getEditingDomain(),setRadiusCmd);
		cc.add(setRadiusOperation);

		ICommandProxy finalCmd = new ICommandProxy(cc);
		
		try {
			finalCmd.execute();
		}
		catch (Exception e) {
			// TODO error handling
			MindDiagramEditorPlugin.getInstance().logError("Unable to set binding's routing style", e);
		}
		super.activateFigure();
				
		setLineWidth(2);
	}
	
	/**
	 * Implementation to set the line width of the connection
	 */
	@Override
	public void setLineWidth (int width) {
		BindingCustomFigure figure = this.getPrimaryShape();
		figure.setLineWidth(width);
	}
	
	
	/**
	 * Custom anchor source to bind the binding on the image instead of the label
	 */
	@Override
	protected ConnectionAnchor getSourceConnectionAnchor() {
		return new BindingConnectionCustomAnchorSource(this);
	}

	/**
	 * Custom anchor target to bind the binding on the image instead of the label
	 */
	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		return new BindingConnectionCustomAnchorTarget(this);
	}
	
}
