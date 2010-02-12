package org.ow2.fractal.mind.diagram.custom.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.helpers.CanonicalEditPolicyHelper;

import adl.diagram.edit.policies.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyCanonicalEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;

public class CompartmentPrimitiveAnonymousSubComponentBodyCustomCanonicalEditPolicy
		extends
		PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyCanonicalEditPolicy {

	@Override
	protected String getDefaultFactoryHint() {
		return CanonicalEditPolicyHelper.getDefaultFactoryHint(this);
	}
	
	@Override
	protected String getFactoryHint(IAdaptable elementAdapter) {
		CanonicalElementAdapter element = (CanonicalElementAdapter) elementAdapter;
		int VID = MindVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), (EObject)element.getRealObject());
		return MindVisualIDRegistry.getType(VID);
	}

	protected List<View> getViewChildren() {
        return getViewChildren((View)host().getModel(), host());
    }
	
	public List<View> getViewChildren(View view, EditPart host) {
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
        			ArrayList<View> views = new ArrayList<View>();
        			views.add(child);
        			deleteViews(views.iterator());
        		}
            }
        }
        return list;
    }
}
