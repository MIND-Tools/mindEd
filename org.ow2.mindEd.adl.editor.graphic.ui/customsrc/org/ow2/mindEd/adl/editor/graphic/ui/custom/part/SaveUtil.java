package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.custom.MindObject;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindComponentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindInterfaceEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public class SaveUtil {

	protected static EAttribute attr_x = NotationPackage.eINSTANCE.getLocation_X();
	protected static EAttribute attr_y = NotationPackage.eINSTANCE.getLocation_Y();
	protected static EAttribute attr_width = NotationPackage.eINSTANCE.getSize_Width();
	protected static EAttribute attr_height = NotationPackage.eINSTANCE.getSize_Height();
	
	
	/**
	 * Save bounds of merged elements in the HashMap boundsMemory, so that we
	 * will be able to restore their positions after cleanMerge (merged elements
	 * are deleted and recreated).
	 * @param rootEditPart the first editpart to be saved, all its children will be saved too.
	 */
	@SuppressWarnings("unchecked")
	public static void saveBounds(EditPart rootEditPart, HashMap<String,Rectangle> boundsMemory) {
		
		MindEditPart mep = MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(rootEditPart);
		if (mep	instanceof MindComponentEditPart)
		{
			EObject model = ((View)rootEditPart.getModel()).getElement();
			boundsMemory.put(((MindObject)model).getID(), ((GraphicalEditPart)rootEditPart).getFigure().getBounds());
		}
		else if (mep instanceof MindInterfaceEditPart)
		{
			GraphicalEditPart gep = (GraphicalEditPart)rootEditPart;
			int x = ((Integer) gep.getStructuralFeatureValue(attr_x)).intValue();
			int y = ((Integer) gep.getStructuralFeatureValue(attr_y)).intValue();
			int width = ((Integer) gep.getStructuralFeatureValue(attr_width)).intValue();
			int height = ((Integer)  gep.getStructuralFeatureValue(attr_height)).intValue();
			
			EObject model = ((View)rootEditPart.getModel()).getElement();
			Rectangle bounds = new Rectangle(x,y,width,height);
			
			boundsMemory.put(((MindObject)model).getID(), bounds);
		}
		
		List<EditPart> editPartList = rootEditPart.getChildren();
		for (EditPart child : editPartList) {
			saveBounds(child, boundsMemory);
		}
	}
	
	
	/**
	 * This method restore bounds of previously deleted merged elements
	 * (due to cleanMerge), based on their Mind ID.<br>
	 * In order to set bounds we need to set the structural feature directly,
	 * or it would be overridden by a later refreshBounds().
	 * @param rootEditPart the first editpart to be restored, all its children will be restored too.
	 */
	@SuppressWarnings("unchecked")
	public static void restoreBounds(EditPart rootEditPart, HashMap<String,Rectangle> boundsMemory) {
		
		MindEditPart mep = MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(rootEditPart);
		if (mep	instanceof MindComponentEditPart ||
				mep instanceof MindInterfaceEditPart)
		{
			EObject model = ((View)rootEditPart.getModel()).getElement();
			Rectangle bounds = boundsMemory.get(((MindObject) model).getID());
			
			if (bounds != null)
			{
				GraphicalEditPart gep = (GraphicalEditPart)rootEditPart;
				TransactionImpl trans = new TransactionImpl(gep.getEditingDomain(),false);
				try {
					trans.start();
					gep.setStructuralFeatureValue(attr_x, bounds.x);
					gep.setStructuralFeatureValue(attr_y, bounds.y);
					gep.setStructuralFeatureValue(attr_width, bounds.width);
					gep.setStructuralFeatureValue(attr_height, bounds.height);
					trans.commit();
				}
				catch(Exception e) {
					MindDiagramEditorPlugin.getInstance().logError("Failed to restore bounds of merged element", e);
				}
			}
		}
		
		
		List<EditPart> editPartList = rootEditPart.getChildren();
		for (EditPart child : editPartList) {
			restoreBounds(child, boundsMemory);
		}
	}
}
