package org.ow2.mindEd.adl.custom.util;

import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.Role;

public class CreationUtil {

	public static InterfaceDefinition createInterface(Body body, Role role,
			String name) {

		if (body == null)
			return null;
		
		InterfaceDefinition newInterface = AdlFactory.eINSTANCE.createInterfaceDefinition();
		
		if (role == null)
			role = Role.PROVIDES;
		newInterface.setRole(role);
		
		if (name == null)
			name = "newInterface";
		newInterface.setName(name);
		
		newInterface.setParentBody(body);
		body.getElements().add(newInterface);
		
		return newInterface;
	}
	
	

}
