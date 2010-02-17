package org.ow2.fractal.mind.idl.labeling;

import org.eclipse.xtext.ui.core.DefaultLabelProvider;
import org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.EnumReference;
import org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective;
import org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.ItfFile;
import org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 * 
 * @author Damien Fournier
 * 
 */

public class FractalItfLabelProvider extends DefaultLabelProvider {

	public String image(MethodDefinition obj) {
		// Reuse Image from jdt
		// return org.eclipse.jdt.ui.ISharedImages.IMG_OBJS_PUBLIC;
		return "methpub_obj.gif";

	};

	public String image(EnumReference obj) {
		return "enum_obj.gif";
	};

	public String image(EnumDefinition obj) {
		return "enum_obj.gif";
	};

	public String text(MethodDefinition obj) {
		return "Method " + obj.getId();
	};

	public String image(ItfFile obj) {
		return "InterfaceDefinition.gif";
	}

	public String image(InterfaceDefinition obj) {
		return "int_obj.gif";
	}

	public String image(StructOrUnionDefinition obj) {
		if (obj.getStruct().equals("union"))
			return "union_obj.gif";
		else
			return "struct_obj.gif";
	}

	public String image(TypeDefinition obj) {
		return "typedef_obj.gif";
	}
	
	public String image(ConstantDefinition obj) {
		return "define_obj.gif";

	}
	
	public String image(IncludeDirective obj) {
		return "imp_obj.gif";

	}
	
}
