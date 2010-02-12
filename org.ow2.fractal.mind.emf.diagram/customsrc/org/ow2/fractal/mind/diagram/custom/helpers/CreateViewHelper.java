package org.ow2.fractal.mind.diagram.custom.helpers;

import java.util.HashMap;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

public class CreateViewHelper {
	
	public static CreateViewHelper INSTANCE = new CreateViewHelper();
	
	protected HashMap<Object, Rectangle> createdViewBounds = new HashMap<Object, Rectangle>();
	
	protected CreateViewHelper() {}
	
	public void setCreatedViewBounds(Object host, Rectangle bounds) {
		createdViewBounds.put(host, bounds);
	}
	
	public Rectangle getCreatedViewBounds(Object host) {
		return createdViewBounds.get(host);
	}
	
}
