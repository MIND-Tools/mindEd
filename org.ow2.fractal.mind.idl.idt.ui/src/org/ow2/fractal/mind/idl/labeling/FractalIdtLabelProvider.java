package org.ow2.fractal.mind.idl.labeling;

import org.ow2.fractal.mind.idl.fractalIdt.ConstantDefinitionBegin;
import org.ow2.fractal.mind.idl.fractalIdt.ConstantDefinitionEnd;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 * 
 * @author Damien Fournier
 */
public class FractalIdtLabelProvider extends FractalItfLabelProvider {

	public String image(ConstantDefinitionBegin obj) {
		return "define_obj.gif";
	}
	
	public String image(ConstantDefinitionEnd obj) {
		return "define_obj.gif";
	}

}
