package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.DiagramUIPlugin;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.osgi.util.NLS;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.PrimitiveSubComponentCanonicalEditPolicy;

public class PrimitiveSubComponentCustomCanonicalEditPolicy extends
		PrimitiveSubComponentCanonicalEditPolicy {

	/**
	 * Deletes a list of views.  The views will be deleted <tt>iff</tt> their semantic
	 * element has also been deleted.
	 * @param views an iterator on a list of views.
	 * @return <tt>true</tt> if the host editpart should be refreshed; either one one of the supplied
	 * views was deleted or has been reparented.
	 */
	protected boolean customDeleteViews( Iterator<View> views ) {
		if ( !isEnabled() ) {
			return false;
		}
		final CompoundCommand cc = new CompoundCommand(DiagramUIMessages.DeleteCommand_Label);
		while (views.hasNext()) {
			View view = (View)views.next();
			if ( shouldDeleteView(view) ) {
				cc.add(getDeleteViewCommand(view));
			}
			if (view.getElement() instanceof Body) {
				Command cmd = new Command("Delete interfaces figures") {
					@Override
					public void execute() {
				        	IFigure borderItemContainer = ((AbstractBorderedShapeEditPart)getHost()).getBorderedFigure().getBorderItemContainer();
				        	List<IFigure> borderItems = borderItemContainer.getChildren();
				        	Iterator<IFigure> iter = borderItems.listIterator();
				        	while (iter.hasNext()) {
				        		iter.next();
				        		iter.remove();
				        	}
					}
		        };
		        cc.add(cmd);
			}
		} 
		
		boolean doDelete = !cc.isEmpty() && cc.canExecute();
		if ( doDelete ) {
			executeCommand(cc);
		}
		return doDelete;
	}
	
	
	
	
	
	/**
	 * Redirects the call to {@link #customRefreshSemanticChildren()}.
	 */
	protected void refreshSemantic() {
		// Must override because of final method
		List<IAdaptable> createdViews = customRefreshSemanticChildren();
		makeViewsImmutable(createdViews);
	}
	
	
	/**
	 * Updates the set of children views so that it
	 * is in sync with the semantic children. This method is called 
	 * in response to notification from the model.
	 * <P>
	 * The update is performed by comparing the exising views with the set of
	 * semantic children returned from {@link #getViewChildren()}. Views whose
	 * semantic element no longer exists are {@link #deleteViews(Iterator) removed}. 
	 * New semantic children have their View {@link  #createViews(List)
	 * created}.  Subclasses must override <code>getSemanticChildren()</code>.
	 * <P>
	 * Unlike <code>AbstractEditPart#refreshChildren()</code>, this refresh will not
	 * reorder the view list to ensure both it and the semantic children are
	 * in the same order since it is possible that this edit policy will handle
	 * a specifc subset of the host's views.  
	 * <P>
	 * The host is refreshed if a view has created or deleted as a result of this
	 * refresh.
	 * 
	 * @return <code>List</code> of new <code>View</code> objects that were created as a result of 
	 * the synchronization
	 */
	protected List<IAdaptable> customRefreshSemanticChildren() {
		
		// Don't try to refresh children if the semantic element
		// cannot be resolved.
		if (resolveSemanticElement() == null) {
			return Collections.emptyList();		
		}
		
		// current views
		List<View> viewChildren = getViewChildren();
		List<EObject> semanticChildren = new ArrayList<EObject>(getSemanticChildrenList());

		List<View> orphaned = cleanCanonicalSemanticChildren(viewChildren, semanticChildren);
		boolean changed = false;
		//
		// delete all the remaining orphaned views
		if ( !orphaned.isEmpty() ) {
			changed = customDeleteViews(orphaned.iterator());
		}
		
		//
		// create a view for each remaining semantic element.
		List<IAdaptable> createdViews = Collections.emptyList();
		if ( !semanticChildren.isEmpty() ) {
			createdViews = createViews( semanticChildren );
			
			for ( int i = 0; i < createdViews.size(); i++ ) {
				View createdView = (View)((IAdaptable)createdViews.get(i)).getAdapter(View.class);
				if (createdView == null) {
					String eMsg =
						NLS
						.bind(
							DiagramUIMessages.CanonicalEditPolicy_create_view_failed_ERROR_,
							semanticChildren.get(i));
					IllegalStateException ise =
						new IllegalStateException(eMsg);
					Log.error(
						DiagramUIPlugin.getInstance(),
						IStatus.ERROR,
						eMsg,
						ise);
					throw ise;
				}
			}
		}
		
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		
		// Remove views that have been deleted by postProcessRefreshSemantic
		// This happens if the subcomponent has been given another kind
		// by a change of its reference
		Iterator it = createdViews.iterator();
		while ( it.hasNext()) {
			View createdView = (View)((IAdaptable)it.next()).getAdapter(View.class);
			if (createdView.getElement() == null)
				it.remove();
		}

		return createdViews;
	}
	
}
