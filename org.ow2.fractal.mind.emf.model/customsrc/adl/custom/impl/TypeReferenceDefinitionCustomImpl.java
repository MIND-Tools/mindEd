package adl.custom.impl;

import adl.impl.TypeReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>TypeReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class TypeReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.TypeReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link adl.custom.impl.TypeReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * <li>{@link adl.custom.impl.TypeReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends TypeReferenceDefinitionImpl
 */
public class TypeReferenceDefinitionCustomImpl extends TypeReferenceDefinitionImpl {

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
