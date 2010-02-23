package org.ow2.fractal.mind.idl.outline;

import org.eclipse.xtext.ui.common.editor.outline.ContentOutlineNode;
import org.ow2.fractal.mind.idl.fractalIdt.ConstantDefinitionBegin;
import org.ow2.fractal.mind.idl.fractalIdt.ConstantDefinitionEnd;
import org.ow2.fractal.mind.idl.fractalIdt.IdtFile;


/**
 * customization of the default outline structure
 *
 * @author Damien Fournier
 */

public class FractalIdtTransformer extends FractalItfTransformer {
	
	public ContentOutlineNode createNode(IdtFile obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("Type Definition");
		return node;
	}
	
	public ContentOutlineNode createNode(ConstantDefinitionBegin obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("ifndef " + obj.getId());
		return node;
	}
	
	public ContentOutlineNode createNode(ConstantDefinitionEnd obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("endif " + obj.getId());
		return node;
	}
	
}
