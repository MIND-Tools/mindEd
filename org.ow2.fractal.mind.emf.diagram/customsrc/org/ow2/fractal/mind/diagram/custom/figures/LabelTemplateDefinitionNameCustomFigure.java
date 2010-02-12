package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

public class LabelTemplateDefinitionNameCustomFigure extends
AbstractComponentNameWrappingLabel implements IFractalShape {
	
	protected static Dimension PREFERRED_SIZE = new Dimension(500,20);
	protected static Dimension MAXIMUM_SIZE = new Dimension(500,20);
	protected static Color BACKGROUND_COLOR = LIGHT_YELLOW;
	protected static Color BORDER_COLOR = YELLOW;
	protected static Color FOREGROUND_COLOR = LIGHT_YELLOW;
	
	public LabelTemplateDefinitionNameCustomFigure() {
		super();
		//set size
		setPreferredSize(PREFERRED_SIZE);
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		setForegroundColor(FOREGROUND_COLOR);		
	}
}
