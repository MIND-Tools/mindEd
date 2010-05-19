package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.impl.SubComponentCompositeBodyImpl;

public class SubComponentCompositeBodyCustomImpl extends
		SubComponentCompositeBodyImpl {

	/**
	 * Anonymous should not be set manually
	 * It is true if component is not merged and it has elements
	 */
	public boolean isAnonymous() {
		if (!isMerged() && getElements().size() > 0) {
			anonymous = true;
		}
		else {
			anonymous = false;
		}
		return anonymous;
	}
}