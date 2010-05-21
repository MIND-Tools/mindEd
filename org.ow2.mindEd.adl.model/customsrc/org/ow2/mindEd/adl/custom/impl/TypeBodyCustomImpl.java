package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.impl.TypeBodyImpl;

public class TypeBodyCustomImpl extends TypeBodyImpl {
	@Override
	public boolean isMerged() {
		if(hasUnMergedElements())
		{
			setMerged(false);
		}
		else
		{
			setMerged(true);
		}
		return super.isMerged();
	}

	private boolean hasUnMergedElements() {
		for(Element element : this.getElements())
		{
			if(!element.isMerged())
				return true;
		}
		return false;
	}
}
