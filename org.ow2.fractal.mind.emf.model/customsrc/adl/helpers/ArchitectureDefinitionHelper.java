package adl.helpers;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import adl.ArchitectureDefinition;
import adl.InterfaceDefinition;
import adl.custom.util.AdlMergeUtil;
/** <b>Class</b> <i>ArchitectureDefinitionHelper</i><p>
 * This class allows access to specific functions linked to the object's specificities.
 * In this case, this class manages a <b>Merge util</b>.
 * This class is mapped to all architectureDefinition features in AdlAdapterHelperFactory.
 * @author proustr
 * @see AdlAdapterHelperFactory 
**/
public class ArchitectureDefinitionHelper extends HelperAdapter<ArchitectureDefinition>{
	private AdlMergeUtil mergeUtil;
	public ArchitectureDefinitionHelper(ArchitectureDefinition t) {
		super(t);
		mergeUtil = new AdlMergeUtil(getObject());
	}

	/** <b>Function</b> <i>refreshMerged</i><p>
	 * This procedure clean merged items from helper's linked definition and recalculate merge from references lists.	 * @author proustr
	**/
	public void refreshMerge()
	{
		mergeUtil.merge(getObject(),getDefinitionCallsList(),true);
	}
	
	
	/** <b>Function</b> <i>refreshMerged</i><p>
	 * This procedure clean merged items from helper's linked definition 
	 * and calculate merge from given references lists.
	 * @author proustr
	 * @param referencesList An ArrayList of string containing all references to merge (fully qualified names or simple names if imports are correct) 
	**/
	public void merge(ArrayList<String> referencesList)
	{
		mergeUtil.merge(getObject(),referencesList,true);
	}

	/** <b>Function</b> <i>updateDefinitionFromBuffer</i><p>
	 * This procedure updates linked definition with buffer data. Often used after a cleanMerge procedure to recover full definition without recalculating merge. 
	 * @author proustr
	**/
	public void updateDefinitionFromBuffer()
	{
		mergeUtil.updateDefinitionFromBuffer(getObject());
	}

	@Override
	public ArchitectureDefinition getObject() {
		return (ArchitectureDefinition) super.getObject();
	}

	/** <b>Function</b> <i>getDefinitionCallsList</i><p>
	 * This procedure get all root references of current definition. 
	 * @author proustr
	 * 
	**/
	public ArrayList<String> getDefinitionCallsList()
	{
		return mergeUtil.getReferencesList(getObject());
	}
	
	/** <b>Function</b> <i>cleanMerge</i><p>
	 * This procedure removes all merged items from current definition. 
	 * @param fullClean This parameters indicates if procedure must also clean subcomponents' merged items (if yes, true).
	 * @author proustr
	**/	
	public void cleanMerge()
	{
		setMerging(true);
		mergeUtil.cleanMerge(getObject());
		setMerging(false);		
	}

	/** <b>Function</b> <i>isValidDefinitionCallForMerge</i><p>
	 * This function check if given definition is available and correct. 
	 * @param definitionCall Fully qualified name or Simple name with correct imports of the definition to check.
	 * @return return true if definition exists and can be loaded.
	 * @author proustr
	 * 	**/	
	public boolean isValidDefinitionCallForMerge(String definitionCall)
	{
		return mergeUtil.isValidDefinitionForMerge(getObject(), definitionCall);
	}

	/** <b>Function</b> <i>isMerging</i><p>
	 * This function check if MergedUtil is currently busy. 
	 * @return return true if MergedUtil is already busy. 
	 * @author proustr
	**/	
	public boolean isMerging() {
		return AdlMergeUtil.isMerging();
	}

	public void setMerging(boolean merging) {
		AdlMergeUtil.setMerging(merging);
	}
	/** <b>Function</b> <i>isMerging</i><p>
	 * This function is used to recover fastly all contained interfaces. 
	 * @return Hashmap of all interfaces <String name,Interface object> contained in elements of the current definition. 
	 * @author proustr
	 * 	**/	
	public HashMap<String,InterfaceDefinition> getAllInterfaces()
	{
		HashMap<String,InterfaceDefinition> result = new HashMap<String,InterfaceDefinition>();
		for(EObject current : getObject().getElements())
		{
			if(current instanceof InterfaceDefinition)
			{
				result.put(((InterfaceDefinition) current).getName(), (InterfaceDefinition) current);
			}
		}
		return result;
	}
	
}