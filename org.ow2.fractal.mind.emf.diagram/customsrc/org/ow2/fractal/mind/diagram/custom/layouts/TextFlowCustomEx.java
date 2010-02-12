package org.ow2.fractal.mind.diagram.custom.layouts;

import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.draw2d.ui.text.TextFlowEx;

/**
 * Needed to implement a {@linkplain FlowUtilitiesCustomEx}
 * @author maroto
 *
 */
public class TextFlowCustomEx extends TextFlowEx {

	private FlowUtilitiesCustomEx flowUtilities;
	
	
	public FlowUtilitiesCustomEx getFlowUtilities() {
        if (flowUtilities == null) {
            flowUtilities = new FlowUtilitiesCustomEx(MapModeUtil.getMapMode(this));
        }
        return flowUtilities;
    }
}
