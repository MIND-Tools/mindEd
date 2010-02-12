package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;


/**
 * Custom class created for convenience or future use
 * @author maroto
 *
 */
public class TemplateDefinitionCustomFigure extends
		AbstractComponentShape {
	
	public static Dimension preferredSize = new Dimension(500,20);
	public static Color BORDER_COLOR = YELLOW;
	
	public TemplateDefinitionCustomFigure() {
		setPreferredSize(preferredSize);
	}

}
