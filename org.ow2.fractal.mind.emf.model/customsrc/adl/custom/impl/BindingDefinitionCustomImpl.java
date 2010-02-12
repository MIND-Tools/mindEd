package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.AdlPackage;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.Element;
import adl.InterfaceDefinition;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.BindingDefinitionHelper;
import adl.impl.BindingDefinitionImpl;

public class BindingDefinitionCustomImpl extends BindingDefinitionImpl {


	@Override
	public InterfaceDefinition getInterfaceSource() {
		if(interfaceSourceName!=null && !interfaceSourceName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceName().getDefaultValueLiteral()))
			{
			interfaceSource = getHelper().getInterfaceByName(interfaceSourceName, interfaceSourceParentName);
			}
		return super.getInterfaceSource();
	}


	@Override
	public InterfaceDefinition getInterfaceTarget() {
		if(interfaceTargetName!=null && !interfaceTargetName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetName().getDefaultValueLiteral()))
		{
			interfaceTarget = getHelper().getInterfaceByName(interfaceTargetName, interfaceTargetParentName);
		}
		return super.getInterfaceTarget();
	}
	
	@Override
	public String getInterfaceSourceName() {
		if(interfaceSource!=null)
		{
			interfaceSourceName = interfaceSource.getName();
		}
		InterfaceDefinition tmpInterfaceDefinition = getHelper().getInterfaceByName(interfaceSourceName, interfaceSourceParentName);
		interfaceSource=tmpInterfaceDefinition;
		return super.getInterfaceSourceName();
	}

	@Override
	public String getInterfaceTargetName() {
		if(interfaceTarget!=null)
		{
			interfaceTargetName = interfaceTarget.getName();
		}
		InterfaceDefinition tmpInterfaceDefinition = getHelper().getInterfaceByName(interfaceTargetName, interfaceTargetParentName);
		interfaceTarget=tmpInterfaceDefinition;
		return super.getInterfaceTargetName();
	}

	@Override
	public String getInterfaceSourceParentName() {
		if(interfaceSource!=null && interfaceSource.getParentComponent()!=null)
		{
			if(getHelper().getAdlDefinition()!=null)
			{
				if(interfaceSource.getParentComponent()!=null && interfaceSource.getParentComponent()==getHelper().getAdlDefinition().getHelper().getMainDefinition())
					{
						interfaceSourceParentName=AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceParentName().getDefaultValueLiteral();
					}
				else 
				{
					interfaceSourceParentName = interfaceSource.getParentComponent().getName();
				}
			}
		}
		return super.getInterfaceSourceParentName();
	}

	@Override
	public String getInterfaceTargetParentName() {
		if(interfaceTarget!=null && interfaceTarget.getParentComponent()!=null)
		{
			if(getHelper().getAdlDefinition()!=null)
			{
				if(interfaceTarget.getParentComponent()!=null && interfaceTarget.getParentComponent()==getHelper().getAdlDefinition().getHelper().getMainDefinition())
					{
						interfaceTargetParentName=AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetParentName().getDefaultValueLiteral();
					}
				else
				{
					interfaceTargetParentName = interfaceTarget.getParentComponent().getName();
				}
			}
		}
		return super.getInterfaceTargetParentName();
	}
	
	@Override
	public void setInterfaceSource(InterfaceDefinition newInterfaceSource) {
		if(interfaceSource!=newInterfaceSource)
		{
			super.setInterfaceSource(newInterfaceSource);
			if(newInterfaceSource!=null)
			{
				interfaceSourceName=newInterfaceSource.getName();
				if(newInterfaceSource.getParentComponent()!=null)
					interfaceSourceParentName=newInterfaceSource.getParentComponent().getName();
			}
			super.setInterfaceSource(newInterfaceSource);
		}
	}

	@Override
	public void setInterfaceTarget(InterfaceDefinition newInterfaceTarget) {
		if(interfaceTarget!=newInterfaceTarget)
		{
			super.setInterfaceTarget(newInterfaceTarget);
			if(newInterfaceTarget!=null)
			{
				interfaceTargetName=newInterfaceTarget.getName();
				if(newInterfaceTarget.getParentComponent()!=null)
					interfaceTargetParentName=newInterfaceTarget.getParentComponent().getName();
			}
		}
	}

	@Override
	public void setInterfaceSourceName(String newInterfaceSourceName) {
		if(newInterfaceSourceName!=interfaceSourceName)
		{
			super.setInterfaceSourceName(newInterfaceSourceName);
			if(newInterfaceSourceName!=null && !newInterfaceSourceName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceName()))
			{
				InterfaceDefinition tmpInterface = getHelper().getInterfaceByName(newInterfaceSourceName, interfaceSourceParentName);
				interfaceSource=tmpInterface;
			}
		}
	}

	@Override
	public void setInterfaceTargetName(String newInterfaceTargetName) {
		if(newInterfaceTargetName!=interfaceTargetName)
		{
			super.setInterfaceTargetName(newInterfaceTargetName);
			if(newInterfaceTargetName!=null && !newInterfaceTargetName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetName()))
			{
				InterfaceDefinition tmpInterface = getHelper().getInterfaceByName(newInterfaceTargetName, interfaceTargetParentName);
				interfaceTarget=tmpInterface;
			}
		}
	}

	@Override
	public void setInterfaceSourceParentName(String newInterfaceSourceParentName) {
		if(newInterfaceSourceParentName==null || !newInterfaceSourceParentName.equals(interfaceSourceParentName))
			super.setInterfaceSourceParentName(newInterfaceSourceParentName);
	}

	@Override
	public void setInterfaceTargetParentName(String newInterfaceTargetParentName) {
		if(newInterfaceTargetParentName==null || !newInterfaceTargetParentName.equals(interfaceTargetParentName))
			super.setInterfaceTargetParentName(newInterfaceTargetParentName);
	}

	@Override
	public AnnotationsList getLinkedAnnotationsList() {
		ArchitectureDefinition parent = this.getParentComponent();
		if(parent!=null)
		{		
			EList<Element> elements = this.getParentComponent().getElements();
			int index = elements.indexOf(this);
			if(index>0 && elements.get(index-1) instanceof AnnotationsList)
				linkedAnnotationsList = (AnnotationsList) elements.get(index-1);
		}
		return linkedAnnotationsList;
	}

	@Override
	public void setLinkedAnnotationsList(
			AnnotationsList newLinkedAnnotationsList) {
		ArchitectureDefinition parent = this.getParentComponent();
		if(parent!=null)
		{
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if(index>0 && elements.get(index-1) instanceof AnnotationsList)
				linkedAnnotationsList = (AnnotationsList) elements.get(index-1);
		}
	}
	

	public BindingDefinitionHelper getHelper(){
		BindingDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this,BindingDefinitionHelper.class);
		if(helper != null){
			result = (BindingDefinitionHelper)helper;
		}
		return result;
	}
}
