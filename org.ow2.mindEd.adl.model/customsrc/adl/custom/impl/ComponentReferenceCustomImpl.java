package adl.custom.impl;

import adl.impl.ComponentReferenceImpl;

public class ComponentReferenceCustomImpl extends ComponentReferenceImpl {

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
