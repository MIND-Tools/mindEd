package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Polyline;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorSource;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorTarget;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public class MindBindingProxy extends AbstractMindProxy {
		
	public MindBindingProxy(ConnectionEditPart realEditPart, int vID) {
		super(realEditPart, vID);
	}
	
	public ConnectionEditPart getConnectionEditPart() {
		if (editPart instanceof ConnectionEditPart)
			return (ConnectionEditPart) editPart;
		else
			throw new IllegalArgumentException();
	}
	
	public Connection createConnectionFigure(Connection figure) {
		
		AbstractEMFOperation emfOp = new AbstractEMFOperation(getConnectionEditPart().getEditingDomain(), "line routing setting") {
	        @Override
	        protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	        
	        	RoutingStyle routingStyle = (RoutingStyle) ((View) editPart.getModel())
	    		.getStyle(NotationPackage.Literals.ROUTING_STYLE);
	        	// Set the routing style to rectilinear
				routingStyle.setRouting(Routing.RECTILINEAR_LITERAL);
				
	    		// Get the annotation extension point to see if a custom color must be set
	    		LineStyle lineStyle = (LineStyle)((View) editPart.getModel())
	    				.getStyle(NotationPackage.eINSTANCE.getLineStyle());
	    		Color color = getColorFromString(getExtensionColor());	
	        	// Set the color from the extension
				if (color != null)
					lineStyle.setLineColor(color.getRGB().hashCode());
					
		        return Status.OK_STATUS;
	        }
	    };

	    try {
			OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
		} catch (ExecutionException e) {
			MindDiagramEditorPlugin.getInstance().logError("Unable to set binding's style", e);
		}

		// The width of the connection's line
		if (figure instanceof Polyline)
			((Polyline) figure).setLineWidth(2);
		
		return figure;
	}
	

	
	/**
	 * Custom anchor source to bind the binding on the image instead of the label
	 */
	public ConnectionAnchor getSourceConnectionAnchor() {
		return new BindingConnectionCustomAnchorSource(getConnectionEditPart());
	}

	/**
	 * Custom anchor target to bind the binding on the image instead of the label
	 */
	public ConnectionAnchor getTargetConnectionAnchor() {
		return new BindingConnectionCustomAnchorTarget(getConnectionEditPart());
	}

	public void activateFigure() {
		
	}

	
	

}
