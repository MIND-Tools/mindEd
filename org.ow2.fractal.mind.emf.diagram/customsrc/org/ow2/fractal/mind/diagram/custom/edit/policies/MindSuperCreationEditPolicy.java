package org.ow2.fractal.mind.diagram.custom.edit.policies;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.part.MindVisualIDRegistry;

/**
 * Same as MindCreationForParentsEditPolicy but allows creation by clicking on a
 * super edit part instead of a sub edit part.
 * @author maroto
 *
 */
public class MindSuperCreationEditPolicy extends
		MindSubCreationEditPolicy {
	
	/**
	 * Method to get the host even when creating by pointing on a super edit part 
	 * (such as the CompositeReferenceDefinition instead of the CompositeReferenceArea).
	 * If the given item can't be created with the base host, try with all children.
	 * Does not try with childrens' childrens.
	 * @param semanticHint the string semantic hint telling which item is to be created
	 * @return the host needed for the item
	 */
	@SuppressWarnings("unchecked")
	public EditPart getVirtualHostFor(String semanticHint) {
		EditPart virtualHost = getHost();
		
		if (semanticHint != null) {
			List<EditPart> children = virtualHost.getChildren();
			// For all children
			for (EditPart child : children) {
				// If the element can be created
				if (MindVisualIDRegistry.canCreateNode(
						(View)child.getModel(), 
						MindVisualIDRegistry.getVisualID(semanticHint)))
					{
						// Set the virtual host and exit
						virtualHost = child;
						break;
					}
			}
		}
		
		return virtualHost;
	}

}
