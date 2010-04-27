package org.ow2.mindEd.adl.editor.graphic.ui.custom.constraints;

import adl.SubComponentDefinition;

public class JavaConstraints {

	public static boolean isCompositeSubComponent(SubComponentDefinition domainElement) {
		return domainElement.getComponentKind().getValue() == adl.ComponentKind.COMPOSITE_VALUE;
	}

	public static boolean isPrimitiveSubComponent(SubComponentDefinition domainElement) {
		return domainElement.getComponentKind().getValue() == adl.ComponentKind.PRIMITIVE_VALUE;
	}
}
