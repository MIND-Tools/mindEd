package org.ow2.fractal.mind.diagram.custom.edit.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.helpers.CanonicalEditPolicyHelper;

import adl.diagram.edit.policies.CompositeComponentDefinitionCanonicalEditPolicy;
import adl.diagram.part.MindDiagramUpdater;
import adl.diagram.part.MindNodeDescriptor;
import adl.diagram.part.MindVisualIDRegistry;

public class CompositeComponentDefinitionCustomCanonicalEditPolicy extends
		CompositeComponentDefinitionCanonicalEditPolicy {

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
	
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = MindDiagramUpdater
				.getCompositeComponentDefinition_2004SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((MindNodeDescriptor) it.next()).getModelElement());
		}
		// Don't remember why I added this
		// but it bugs the create view command so I remove it
//		for (Iterator it = MindDiagramUpdater
//				.getCompositeComponentDefinition_2004ContainedLinks(
//						viewObject).iterator(); it.hasNext();) {
//			result.add(((MindNodeDescriptor) it.next()).getModelElement());
//		}
		return result;
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
