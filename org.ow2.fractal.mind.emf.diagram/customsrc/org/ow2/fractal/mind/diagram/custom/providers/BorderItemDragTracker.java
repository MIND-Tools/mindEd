package org.ow2.fractal.mind.diagram.custom.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;

public class BorderItemDragTracker extends DragEditPartsTrackerEx {

	public BorderItemDragTracker(EditPart sourceEditPart) {
		super(sourceEditPart);
	}
	
	protected boolean isMove() {
		return true;
	}

}
