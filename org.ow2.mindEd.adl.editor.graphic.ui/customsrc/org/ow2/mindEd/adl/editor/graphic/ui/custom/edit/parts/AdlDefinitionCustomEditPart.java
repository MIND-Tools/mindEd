package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AdlDefinitionEditPart;

/**
 * AdlDefinitionEditPart is the canvas, the background.
 * @extends AdlDefinitionEditPart
 * @author maroto
 *
 */
public class AdlDefinitionCustomEditPart extends AdlDefinitionEditPart {

	protected MindProxy genericEditPart = MindProxyFactory.INSTANCE.createMindProxy (this, VISUAL_ID);
	
	public AdlDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
//		updateAll(this);
	}
	
	@SuppressWarnings("unchecked")
	public void updateAll (EditPart editPart){
		// Update the element
		EObject rootElement = ((View) editPart.getModel()).getElement();
		updateElement(rootElement);
		
		// Refresh the edit part
		editPart.refresh();
		
		// Now update all children
		List<EditPart> children = editPart.getChildren();
		for (EditPart child : children) {
			updateAll(child);
		}
	}
	
	
	/**
	 * Calls the refresh() method of all CanonicalEditPolicy registered on this element
	 * @param modelElement
	 */
	@SuppressWarnings("rawtypes")
	public void updateElement(EObject modelElement) {
		List editPolicies = CanonicalEditPolicy
			.getRegisteredEditPolicies(modelElement);
		for (Iterator it = editPolicies.iterator(); it.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it
					.next();
			nextEditPolicy.refresh();
		}
	}

}
