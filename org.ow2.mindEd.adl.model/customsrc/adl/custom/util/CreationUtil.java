package adl.custom.util;

import adl.AdlFactory;
import adl.Body;
import adl.InterfaceDefinition;
import adl.Role;

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
