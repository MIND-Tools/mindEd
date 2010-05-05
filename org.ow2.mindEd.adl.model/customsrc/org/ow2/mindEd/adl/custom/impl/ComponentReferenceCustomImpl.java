package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.impl.ComponentReferenceImpl;

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
		boolean changed = false;
		if (newReferenceName != null && !newReferenceName.equals(referenceName)) {
			changed = true;
		}
		super.setReferenceName(newReferenceName);
		if (changed) {
			nameFQN = getHelper().getNameFQN();
		}
	}

}
