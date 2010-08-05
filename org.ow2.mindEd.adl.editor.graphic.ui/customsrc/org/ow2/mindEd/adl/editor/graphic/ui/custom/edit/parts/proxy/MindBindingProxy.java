package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorSource;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.BindingConnectionCustomAnchorTarget;

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

	public boolean installRouter() {
//        RoutingStyle style = (RoutingStyle) ((View) getConnectionEditPart().getModel()).
//        			getStyle(NotationPackage.Literals.ROUTING_STYLE);
//        
//        style.setRouting(Routing.RECTILINEAR_LITERAL);
        
		return false;
	}

	
	

}
