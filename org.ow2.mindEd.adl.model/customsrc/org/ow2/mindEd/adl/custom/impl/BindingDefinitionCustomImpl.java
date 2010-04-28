package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.impl.BindingDefinitionImpl;

/**
 * <b>Class</b> <i>BindingDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class BindingDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.ow2.mindEd.adl.custom.impl.AttributeDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>
 * {@link org.ow2.mindEd.adl.custom.impl.AttributeDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends BindingDefinitionImpl
 */
public class BindingDefinitionCustomImpl extends BindingDefinitionImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSource()
	 */
	@Override
	public InterfaceDefinition getInterfaceSource() {
		if (interfaceSourceName != null
				&& !interfaceSourceName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceName()
						.getDefaultValueLiteral())) {
			InterfaceDefinition tmpinterface = getHelper().getInterfaceByName(interfaceSourceName, interfaceSourceParentName); 
			if(tmpinterface!=null)
			{
				interfaceSource = tmpinterface;
			}
		}
		return super.getInterfaceSource();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTarget()
	 */
	@Override
	public InterfaceDefinition getInterfaceTarget() {
		if (interfaceTargetName != null
				&& !interfaceTargetName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetName()
						.getDefaultValueLiteral())) {
			InterfaceDefinition tmpinterface = getHelper().getInterfaceByName(interfaceTargetName, interfaceTargetParentName); 
			if(tmpinterface!=null)
			{
				interfaceTarget = tmpinterface;
			}
		}
		return super.getInterfaceTarget();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSourceName()
	 */
	@Override
	public String getInterfaceSourceName() {
		if (interfaceSource != null) {
			interfaceSourceName = interfaceSource.getName();
		}
		InterfaceDefinition tmpInterfaceDefinition = getHelper().getInterfaceByName(interfaceSourceName,
				interfaceSourceParentName);
		if(tmpInterfaceDefinition!=null)interfaceSource = tmpInterfaceDefinition;
		return super.getInterfaceSourceName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTargetName()
	 */
	@Override
	public String getInterfaceTargetName() {
		if (interfaceTarget != null) {
			interfaceTargetName = interfaceTarget.getName();
		}
		InterfaceDefinition tmpInterfaceDefinition = getHelper().getInterfaceByName(interfaceTargetName,
				interfaceTargetParentName);
		interfaceTarget = tmpInterfaceDefinition;
		return super.getInterfaceTargetName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSourceParentName()
	 */
	@Override
	public String getInterfaceSourceParentName() {
		ArchitectureDefinition parent = getInterfaceParent(interfaceSource);
		if (interfaceSource != null && parent!= null) {
			if (getHelper().getAdlDefinition() != null) {
				if (parent == getHelper().getAdlDefinition().getHelper()
								.getMainDefinition() && !interfaceSourceParentName.equals(getHelper().getSimpleName(parent))) {
					interfaceSourceParentName = AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceParentName()
							.getDefaultValueLiteral();
				}
				else {
					interfaceSourceParentName = getHelper().getSimpleName(parent);
				}
			}
		}
		return super.getInterfaceSourceParentName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTargetParentName()
	 */
	@Override
	public String getInterfaceTargetParentName() {
		ArchitectureDefinition parent = getInterfaceParent(interfaceTarget);
		if (interfaceTarget != null && parent != null) {
			if (getHelper().getAdlDefinition() != null) {
				if (parent == getHelper().getAdlDefinition().getHelper()
								.getMainDefinition() && !interfaceTargetParentName.equals(getHelper().getSimpleName(parent))) {
					interfaceTargetParentName = AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetParentName()
							.getDefaultValueLiteral();
				}
				else {
					interfaceTargetParentName = getHelper().getSimpleName(parent);
				}
			}
		}
		return super.getInterfaceTargetParentName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSource(adl.InterfaceDefinition )
	 */
	@Override
	public void setInterfaceSource(InterfaceDefinition newInterfaceSource) {
		ArchitectureDefinition parent = getInterfaceParent(newInterfaceSource);
		if (interfaceSource != newInterfaceSource && newInterfaceSource!=null) {
			super.setInterfaceSource(newInterfaceSource);
			if (newInterfaceSource != null) {
				interfaceSourceName = newInterfaceSource.getName();
				if (parent != null) interfaceSourceParentName = getHelper().getSimpleName(parent);
			}
			super.setInterfaceSource(newInterfaceSource);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceTarget(adl.InterfaceDefinition )
	 */
	@Override
	public void setInterfaceTarget(InterfaceDefinition newInterfaceTarget) {
		ArchitectureDefinition parent = getInterfaceParent(newInterfaceTarget);
		if (interfaceTarget != newInterfaceTarget && newInterfaceTarget!=null) {
			super.setInterfaceTarget(newInterfaceTarget);
			if (newInterfaceTarget != null) {
				interfaceTargetName = newInterfaceTarget.getName();
				if (parent != null) interfaceTargetParentName = getHelper().getSimpleName(parent);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSourceName(java.lang.String)
	 */
	@Override
	public void setInterfaceSourceName(String newInterfaceSourceName) {
		if (newInterfaceSourceName != interfaceSourceName) {
			super.setInterfaceSourceName(newInterfaceSourceName);
			if (newInterfaceSourceName != null
					&& !newInterfaceSourceName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceName())) {
				InterfaceDefinition tmpInterface = getHelper().getInterfaceByName(newInterfaceSourceName,
						interfaceSourceParentName);
				if(tmpInterface!=null)interfaceSource = tmpInterface;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceTargetName(java.lang.String)
	 */
	@Override
	public void setInterfaceTargetName(String newInterfaceTargetName) {
		if (newInterfaceTargetName != interfaceTargetName) {
			super.setInterfaceTargetName(newInterfaceTargetName);
			if (newInterfaceTargetName != null
					&& !newInterfaceTargetName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetName())) {
				InterfaceDefinition tmpInterface = getHelper().getInterfaceByName(newInterfaceTargetName,
						interfaceTargetParentName);
				if(tmpInterface!=null)interfaceTarget = tmpInterface;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSourceParentName(java.lang .String)
	 */
	@Override
	public void setInterfaceSourceParentName(String newInterfaceSourceParentName) {
		if (newInterfaceSourceParentName == null || !newInterfaceSourceParentName.equals(interfaceSourceParentName)) super
				.setInterfaceSourceParentName(newInterfaceSourceParentName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceTargetParentName(java.lang .String)
	 */
	@Override
	public void setInterfaceTargetParentName(String newInterfaceTargetParentName) {
		if (newInterfaceTargetParentName == null || !newInterfaceTargetParentName.equals(interfaceTargetParentName)) super
				.setInterfaceTargetParentName(newInterfaceTargetParentName);
	}

	
	/**
	 * <b>Method</b> <i>getInterfaceParent</i>
	 * <p>
	 * This methods the component that contains given interface.
	 * 
	 * @return ArchitectureDefinition
	 * 
	 * @author proustr
	 */	
	private ArchitectureDefinition getInterfaceParent(InterfaceDefinition interfaceDefinition)
	{
		if(interfaceDefinition==null)return null;
		Body body = interfaceDefinition.getParentBody();
		if(body!=null)
		{
			return body.getParentComponent();
		}
		return null;
	}
	
}
