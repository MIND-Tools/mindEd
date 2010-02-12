package org.ow2.fractal.mind.diagram.custom.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;

public class NoDragTracker extends DragEditPartsTrackerEx {

	public NoDragTracker(EditPart sourceEditPart) {
		super(sourceEditPart);
	}
	
	@Override
	/**
	 * Does not allow drag
	 */
	public void performDrag() {
		return;
	}

	@Override
	protected void showSourceFeedback() {
//		super.showSourceFeedback();
	}

}
