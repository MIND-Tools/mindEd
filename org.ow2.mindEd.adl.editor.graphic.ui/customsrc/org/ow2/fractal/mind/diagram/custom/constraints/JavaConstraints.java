package org.ow2.fractal.mind.diagram.custom.constraints;

import adl.SubComponentDefinition;

public class JavaConstraints {

	public static boolean isSubComponentDefinition_3131(adl.SubComponentDefinition domainElement) {
		return domainElement.getComponentKind().getValue() == adl.ComponentKind.COMPOSITE_VALUE;
	}

	public static boolean isSubComponentDefinition_3135(
			SubComponentDefinition domainElement) {
		return domainElement.getComponentKind().getValue() == adl.ComponentKind.PRIMITIVE_VALUE;
	}
}
