package org.ow2.fractal.mind.diagram.custom.editor;

import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.ruler.DiagramRulerProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.ow2.fractal.mind.diagram.custom.providers.MindCustomDocumentProvider;
import org.ow2.fractal.mind.emf.diagram.custom.router.CustomConnectionLayerEx;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;

import adl.diagram.part.MindDiagramEditor;

public class CustomMindDiagramEditor extends MindDiagramEditor {

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		// Get a custom connection layer to install a custom connection router
		setupCustomConnectionLayerEx();
	}

	/**
     * @see org.eclipse.gef.ui.parts.GraphicalEditor#initializeGraphicalViewer()
     */
	protected void initializeGraphicalViewerContents() {
        super.initializeGraphicalViewerContents();
        // Now that things are initialized, we should refresh
        refreshAll(getDiagramEditPart());
    }
	
	/**
	 * Refresh all edit parts
	 * @param editPart
	 */
	public void refreshAll(EditPart editPart) {
		 editPart.refresh();
		 for (Object child : editPart.getChildren()) {
			 if (child instanceof EditPart)
				 refreshAll((EditPart)child);
		 }
	}
	

	protected IDocumentProvider provider;
	
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (provider == null) setDocumentProvider(input);
		return provider;
	}
	
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			provider = new MindCustomDocumentProvider();
			setDocumentProvider(provider);
		} else {
			super.setDocumentProvider(input);
		}
	}
	
	@Override
	public void setInput(IEditorInput input) {
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		super.setInput(input);
	}
	
	@Override
	public void dispose() {
		try {
			super.dispose();
		} catch (IllegalArgumentException e) {
			// Workaround for bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=295660
		}
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class type) {
		if (type == IContentOutlinePage.class) {
			return null;
		}
		return super.getAdapter(type);
	}
	
	
	
	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels";
	
	/**
	 * @author Yann Davin
	 */
	public void setupCustomConnectionLayerEx() {
		DiagramRootEditPart root = (DiagramRootEditPart)getDiagramGraphicalViewer().getRootEditPart();
		LayeredPane printableLayers = (LayeredPane) root
				.getLayer(LayerConstants.PRINTABLE_LAYERS);
		Layer connlayer = printableLayers
				.getLayer(LayerConstants.CONNECTION_LAYER);
		if (connlayer == null || connlayer instanceof CustomConnectionLayerEx) {
			return;
		}
		
		printableLayers.removeLayer(LayerConstants.CONNECTION_LAYER);
		Layer decorationLayer = printableLayers
				.getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
		printableLayers
				.removeLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
		printableLayers.addLayerBefore(new CustomConnectionLayerEx(),
				LayerConstants.CONNECTION_LAYER, printableLayers
						.getLayer(LayerConstants.PRIMARY_LAYER));
		printableLayers.addLayerBefore(decorationLayer,
				DiagramRootEditPart.DECORATION_PRINTABLE_LAYER, printableLayers
						.getLayer(LayerConstants.CONNECTION_LAYER));

		FreeformLayer extLabelsLayer = new FreeformLayer();
		extLabelsLayer.setLayoutManager(new DelegatingLayout());
		printableLayers.addLayerAfter(extLabelsLayer,
				EXTERNAL_NODE_LABELS_LAYER,
				LayerConstants.PRIMARY_LAYER);
		LayeredPane scalableLayers = (LayeredPane) root
				.getLayer(LayerConstants.SCALABLE_LAYERS);
		FreeformLayer scaledFeedbackLayer = new FreeformLayer();
		scaledFeedbackLayer.setEnabled(false);
		scalableLayers.addLayerAfter(scaledFeedbackLayer,
				LayerConstants.SCALED_FEEDBACK_LAYER,
				DiagramRootEditPart.DECORATION_UNPRINTABLE_LAYER);
	}
	
}
