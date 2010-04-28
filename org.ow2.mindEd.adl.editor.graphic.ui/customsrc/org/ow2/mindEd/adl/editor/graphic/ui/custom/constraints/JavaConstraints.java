package org.ow2.mindEd.adl.editor.graphic.ui.custom.constraints;

import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.ComponentKind;

public class JavaConstraints {

	public static boolean isCompositeSubComponent(SubComponentDefinition domainElement) {
		return domainElement.getComponentKind().getValue() == ComponentKind.COMPOSITE_VALUE;
	}

	public static boolean isPrimitiveSubComponent(SubComponentDefinition domainElement) {
		return domainElement.getComponentKind().getValue() == ComponentKind.PRIMITIVE_VALUE;
	}
}
