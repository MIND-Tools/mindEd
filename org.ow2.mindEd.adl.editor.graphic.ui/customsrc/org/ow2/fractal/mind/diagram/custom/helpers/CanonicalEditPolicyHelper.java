package org.ow2.fractal.mind.diagram.custom.helpers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.part.MindVisualIDRegistry;

/**
 * Helper providing static methods for canonical edit policies
 * @author maroto
 *
 */
public class CanonicalEditPolicyHelper {
	
	public static String getDefaultFactoryHint(CanonicalEditPolicy policy) {
		// For future use
		return null;
	}
	
	/**
	 * Not used
	 * @param view
	 * @param host
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<View> getViewChildren(View view, EditPart host) {
        ArrayList<View> list = new ArrayList<View>();
        
        for(View child : (EList<View>)view.getChildren()) {
            if (child instanceof Node
                    && ViewType.GROUP.equals(((Node) child).getType())) {
                list.addAll(getViewChildren(child,host));
            } else {
        		EObject element = child.getElement();
        		int modelVID = MindVisualIDRegistry.getNodeVisualID((View)host.getModel(), element);
        		int diagramVID = MindVisualIDRegistry.getVisualID(child);
        		if (modelVID == -1 || modelVID == diagramVID) {
        			list.add(child);
        		}
        		else {
        			// Delete view !!
        		}
            }
        }
        return list;
    }

}
