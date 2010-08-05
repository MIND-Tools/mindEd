package org.ow2.mindEd.adl.editor.graphic.ui.custom.providers;

import java.net.URL;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.AbstractMindProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;
import org.ow2.mindEd.ide.ui.Activator;

public class MindDecorator implements IDecorator {

	private IDecoratorTarget target;
	private EditPart editPart;
	private IDecoration decoration = null;
	
	public MindDecorator(IDecoratorTarget decoratorTarget) {
		target = decoratorTarget;
		editPart = (EditPart) decoratorTarget.getAdapter(EditPart.class);
	}

	@Override
	public void activate() {
		AbstractMindProxy proxy = MindProxyFactory.INSTANCE.getAbstractMindProxyFor(editPart);
		URL icon = proxy.getExtensionIconURL();
		if (icon == null)
			return;

		Image image = null;
		try {
			ImageDescriptor desc = Activator.getImageDescriptorURI(icon);
			image = desc.createImage();
		}catch (Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Annotation extension icon not found", e);
		}
		if (image == null)
			return;
		
		if (editPart instanceof GraphicalEditPart) {
			if (decoration != null)
				deactivate();
			decoration = target.addShapeDecoration(image, Direction.NORTH_EAST, -5, false);
		}
		if (editPart instanceof ConnectionEditPart) {
			if (decoration != null)
				deactivate();
			decoration = target.addConnectionDecoration(image, 50, false);
		}
	}

	@Override
	public void deactivate() {
		if (decoration != null) {
			target.removeDecoration(decoration);
			decoration = null;
		}
	}

	@Override
	public void refresh() {
		deactivate();
		activate();
	}

}
