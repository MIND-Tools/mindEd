package org.ow2.mindEd.adl.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.custom.impl.BindingDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.CompositeBodyCustomImpl;

public class MindEdBindingConstraints extends AbstractModelConstraint{

	@Override
	public IStatus validate(IValidationContext ctx) {
		
		if(ctx.getTarget().eClass().getClassifierID()==AdlPackage.BINDING_DEFINITION)
		{
			BindingDefinitionCustomImpl binding = (BindingDefinitionCustomImpl) ctx.getTarget();
			
			if( (binding.getInterfaceSource() == null)
					|| (binding.getInterfaceTarget() == null) )
			{
				CompositeBodyCustomImpl temp = (CompositeBodyCustomImpl) binding.eContainer();
				temp.getElements().remove(binding);
				int a = 1;
				a = a * 1;
				return ctx.createFailureStatus("test");
			}
			else
			{
				if(binding.getInterfaceSource().getSignature().equals(binding.getInterfaceTarget().getSignature()))
					return ctx.createSuccessStatus();
				else
					return ctx.createFailureStatus("Target and source signature must be the same.");
			}
		}
		return ctx.createSuccessStatus();
		
	}

}
