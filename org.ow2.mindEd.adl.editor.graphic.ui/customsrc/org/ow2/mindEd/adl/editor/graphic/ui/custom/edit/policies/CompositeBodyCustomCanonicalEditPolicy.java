package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.CompositeBodyCanonicalEditPolicy;

public class CompositeBodyCustomCanonicalEditPolicy extends
		CompositeBodyCanonicalEditPolicy {

	@Override
	protected List getSemanticChildrenList() {
		// TODO Auto-generated method stub
		return super.getSemanticChildrenList();
	}
	
	/**
     * Return the host's model children.
     * @return list of <code>View</Code>s
     */
    protected List<View> getViewChildren() {
        return getViewChildren((View) host().getModel());
    }
	
	 /**
     * Return the host's model children. This is a recursive method that handles
     * groups.
     * Added transient childrens for body in order to properly delete interface's views
     * 
     * @param view
     *            the view to find the children for
     * @return list of children views with groups removed.
     */
    protected List<View> getViewChildren(View view) {
        ArrayList<View> list = new ArrayList<View>();
        
        for(View child : (EList<View>)view.getChildren()) {
            if (child instanceof Node
                    && ViewType.GROUP.equals(((Node) child).getType())) {
                list.addAll(getViewChildren(child));
            } else {
                list.add(child);
            } 
        }
//        for(View child : (EList<View>)view.getTransientChildren()) {
//            if (child instanceof Node
//                    && ViewType.GROUP.equals(((Node) child).getType())) {
//                list.addAll(getViewChildren(child));
//            } else {
//                list.add(child);
//            } 
//        }
        
        return list;
    }

}
