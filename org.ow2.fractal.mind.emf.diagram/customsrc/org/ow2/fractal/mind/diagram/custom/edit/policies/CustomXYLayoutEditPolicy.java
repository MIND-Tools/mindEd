package org.ow2.fractal.mind.diagram.custom.edit.policies;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.LayoutHelper;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.helpers.CreateViewHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.CustomFreeFormLayoutEx;

import adl.DataDefinition;
import adl.ImplementationDefinition;

public class CustomXYLayoutEditPolicy extends XYLayoutEditPolicy {

	/* Override to use to deal with causes where the point is UNDERFINED
	 * we will ask the layout helper to find a location for us
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#getConstraintFor(org.eclipse.gef.requests.CreateRequest)
	 */
	protected Object getConstraintFor(CreateRequest request) {
		
		Object constraint = super.getConstraintFor(request);
		
		if ( LayoutHelper.UNDEFINED.getLocation().equals(request.getLocation()) ){	
			Rectangle rect = (Rectangle)constraint;
			
			int x = 5;
			int y = 5;
			
			rect.setLocation(x,y);
			rect.setSize(200, 200);
			
			if (request instanceof CreateViewRequest) {
				CreateViewRequest req = (CreateViewRequest) request;
				if (req.getViewDescriptors() != null) {
					for (ViewDescriptor desc : req.getViewDescriptors()) {
						if (desc.getElementAdapter() instanceof EObjectAdapter) {
							EObjectAdapter adapter = (EObjectAdapter) desc.getElementAdapter();
							Object object = adapter.getRealObject();
							if (object != null && object instanceof DataDefinition)
								rect.setSize(100, 50);
							if (object != null && object instanceof ImplementationDefinition)
								rect.setSize(100, 50);
						}
					}
				}
			}
			
			IFigure figure = getLayoutContainer();
			if (figure.getLayoutManager() != null &&
					figure.getLayoutManager() instanceof CustomFreeFormLayoutEx) {
				CustomFreeFormLayoutEx manager = (CustomFreeFormLayoutEx) figure.getLayoutManager();
				manager.layout(figure);
				
//				ArrayList<Rectangle> childrenBounds = manager.getChildrenBounds();
//				if (childrenBounds != null && childrenBounds.size() > 0) {
//					for (Rectangle bound : childrenBounds) {
//						x = Math.max(x, bound.x + bound.width + 10);
////						y = bound.y + bound.height;
//					}
//					
//				}
			}
			
//			Rectangle area = figure.getParent().getBounds();
//			
//			if (area.width > 0) {
//				if (rect.width > 100)
//					rect.width = Math.min(rect.width, area.width - 10);
//				else
//					rect.width = Math.max(300, area.width - 10);
//			}
//			else {
//				// Container has just been created, it doesn't have bounds yet
//				// So try to use the constraints kept in memory instead
//				EObject parent = ((View)getHost().getModel()).getElement();
//				Rectangle parentBounds = CreateViewHelper.INSTANCE.getCreatedViewBounds(parent);
//				if (parentBounds != null && parentBounds.width > 0) {
//					if (rect.width > 100)
//						rect.width = Math.min(rect.width, parentBounds.width - 10);
//					else
//						rect.width =  Math.max(300, parentBounds.width - 10);
//				}
//			}
//			
//			if (area.height > 0) {
//				if (rect.height > 100)
//					rect.height = Math.min(rect.height, area.height - 10);
//				else
//					rect.height = Math.max(300, area.height - 10);
//			}
//			else {
//				// Container has just been created, it doesn't have bounds yet
//				// So try to use the constraints kept in memory instead
//				EObject parent = ((View)getHost().getModel()).getElement();
//				Rectangle parentBounds = CreateViewHelper.INSTANCE.getCreatedViewBounds(parent);
//				if (parentBounds != null && parentBounds.height > 0) {
//					if (rect.height > 100)
//						rect.height = Math.min(rect.height, parentBounds.height - 10);
//					else
//						rect.height =  Math.max(300, parentBounds.height - 10);
//				}
//			}
				
			// Remember the constraint
//			if (request instanceof CreateViewRequest) {
//				CreateViewRequest req = (CreateViewRequest) request;
//				if (req.getViewDescriptors() != null) {
//					for (ViewDescriptor desc : req.getViewDescriptors()) {
//						if (desc.getElementAdapter() instanceof EObjectAdapter) {
//							EObjectAdapter adapter = (EObjectAdapter) desc.getElementAdapter();
//							Object object = adapter.getRealObject();
//							if (object != null)
//								CreateViewHelper.INSTANCE.setCreatedViewBounds(object,rect);
//						}
//					}
//				}
//			}
		}
		
		return constraint;	
	}

}
