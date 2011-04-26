package org.ow2.mindEd.adl.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

public class TestConstraint extends AbstractModelConstraint {

	public TestConstraint() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	@Override
	public IStatus validate(IValidationContext ctx) {
		// TODO Auto-generated method stub
		return ctx.createFailureStatus("Error");
	}
	

}
