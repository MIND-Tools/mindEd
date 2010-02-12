package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ImportDefinition;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.AdlDefinitionHelper;
import adl.helpers.BindingDefinitionHelper;
import adl.impl.AdlDefinitionImpl;

public class AdlDefinitionCustomImpl extends AdlDefinitionImpl {
	public AdlDefinitionCustomImpl() {
            super();
            // set the containment to true, for the properties view
            // to properly show imports
            EReference imports = (EReference)eClass().getEStructuralFeature("imports");
            imports.setContainment(true);
            imports.setResolveProxies(false);
      }
 
      @Override
      public EList<ImportDefinition> getImports() {
            if (imports == null) {
                  imports = new EObjectContainmentEList<ImportDefinition>(ImportDefinition.class, this, AdlPackage.ADL_DEFINITION__IMPORTS);
            }
            return imports;
      }

  	public AdlDefinitionHelper getHelper(){
  		AdlDefinitionHelper result = null;
  		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this,AdlDefinitionHelper.class);
  		if(helper != null){
  			result = (AdlDefinitionHelper)helper;
  		}
  		return result;
  	}
  	
}
