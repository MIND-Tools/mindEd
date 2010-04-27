package adl.custom.provider;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import adl.AdlPackage;
import adl.custom.descriptor.ListPropertyDescriptor;
import adl.provider.AdlDefinitionItemProvider;


public class AdlDefinitionCustomItemProvider extends AdlDefinitionItemProvider {

	public AdlDefinitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	
	@Override
	protected void addImportsPropertyDescriptor(Object object) {
		// Add a ListPropertyDescriptor to get a combobox with a selection of ImportDefinition
		itemPropertyDescriptors.add
			(new ListPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdlDefinition_imports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdlDefinition_imports_feature", "_UI_AdlDefinition_type"),
				 AdlPackage.Literals.ADL_DEFINITION__IMPORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	

}
