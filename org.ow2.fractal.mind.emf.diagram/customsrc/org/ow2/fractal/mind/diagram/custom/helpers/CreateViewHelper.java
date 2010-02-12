package org.ow2.fractal.mind.diagram.custom.helpers;

import java.util.HashMap;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Helper to allow non-manually created view to be initialized at a convenient position.
 * Not used yet.
 * @author maroto
 *
 */
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
