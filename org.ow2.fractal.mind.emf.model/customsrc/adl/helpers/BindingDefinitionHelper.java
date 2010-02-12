package adl.helpers;

import org.eclipse.emf.ecore.EObject;

import adl.AdlDefinition;
import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.InterfaceDefinition;
import adl.custom.impl.AdlDefinitionCustomImpl;
/** <b>Class</b> <i>BindingDefinitionHelper</i><p>
 * This class allows access to specific functions linked to the object's specificities.
 * This class is mapped to all BindingDefinition features in AdlAdapterHelperFactory.
 * @author proustr
 * @see AdlAdapterHelperFactory 
**/
public class BindingDefinitionHelper extends HelperAdapter<BindingDefinition>{

	public BindingDefinitionHelper(BindingDefinition t) {
		super(t);
	}
	/** <b>Function</b> <i>getAdlDefinition</i><p>
	 * This function returns the root object AdlDefinition associated to current object.	 
	 * @author proustr
	**/
	public AdlDefinitionCustomImpl getAdlDefinition()
	{
		EObject tmpObject = getObject();
		while(tmpObject!=null && !(tmpObject instanceof AdlDefinition))
		{
			tmpObject = tmpObject.eContainer();
		}
		return (AdlDefinitionCustomImpl)tmpObject;
	}
	
	/** <b>Function</b> <i>getInterfaceByName</i> <p>
	 * Finds interfaceDefinition object in the list of all current definition's interfaces by name. Also can check parent's name as constrainst in the case where two or more components can have an interface with same name.
	 * @param interfaceName The interface's name to find in string
	 * @param interfaceParentName The name of the interface's parent in case where some components have interfaces with same names.
	 * @return All InterfaceDefinition contained by current definition mapped with the String name of the interface as keys. Null if nothing found.
	 * @author proustr
	 * 	**/
	public InterfaceDefinition getInterfaceByName(String interfaceName, String interfaceParentName)
	{
		AdlDefinitionCustomImpl adlDefinition = getAdlDefinition();
		if(adlDefinition==null)return null;
		return adlDefinition.getHelper().getInterfaceByName(interfaceName,interfaceParentName);
	}

	public ArchitectureDefinition getComponentByName(String componentName)
	{
		AdlDefinitionCustomImpl adlDefinition = getAdlDefinition();
		if(adlDefinition==null)return null;
		return adlDefinition.getHelper().getComponentByName(componentName);
	}


}
