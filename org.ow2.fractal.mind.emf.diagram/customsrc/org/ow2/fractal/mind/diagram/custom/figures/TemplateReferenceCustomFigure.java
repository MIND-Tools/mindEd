package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

public class TemplateReferenceCustomFigure extends AbstractComponentShape {

	public TemplateReferenceCustomFigure() {
		super();
	}
	
	protected static Color BACKGROUND_COLOR = LIGHT_YELLOW;
	protected static Color BORDER_COLOR = YELLOW;
	
	protected static Dimension PREFERRED_SIZE = new Dimension (200,20);

	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		/*  746 */     if (this.prefSize != null)
		/*  747 */       return this.prefSize;
		/*  748 */     if (getLayoutManager() != null) {
		/*  749 */       Dimension d = getLayoutManager().getPreferredSize(this, wHint, hHint);
		/*  750 */       if (d != null)
		/*  751 */         return d;
		/*      */     }
		/*  753 */     return getSize();
		/*      */   }
	
	
	
	
}
