package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.impl.PrimitiveReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>PrimitiveReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class PrimitiveReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends PrimitiveReferenceDefinitionImpl
 */
public class PrimitiveReferenceDefinitionCustomImpl extends PrimitiveReferenceDefinitionImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#getNameFQN()
	 */
	@Override
	public String getNameFQN() {
		if (nameFQN == null || !nameFQN.contains(".")) {
			nameFQN = getHelper().getNameFQN();
		}
		return super.getNameFQN();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#setReferenceName(java.lang.String)
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		if (newReferenceName != null && !newReferenceName.equals(referenceName)) {
			nameFQN = getHelper().getNameFQN();
		}
		super.setReferenceName(newReferenceName);
	}

}
