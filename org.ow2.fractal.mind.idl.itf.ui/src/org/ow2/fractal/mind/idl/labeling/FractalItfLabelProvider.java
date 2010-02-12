package org.ow2.fractal.mind.idl.labeling;

import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.xtext.ui.core.DefaultLabelProvider;
import org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 * 
 * @author Damien Fournier
 * 
 */

public class FractalItfLabelProvider extends DefaultLabelProvider {

	public String image(MethodDefinition obj) {
		// Reuse Image from jdt
		return ISharedImages.IMG_OBJS_PUBLIC;
	};
	
	public String text(MethodDefinition obj) {
		return "Method " + obj.getId().getId();
	};

	
}
