package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.dnd.TransferDropTargetListener;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.PluginTransfer;
import org.eclipse.ui.part.PluginTransferData;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.navigator.LocalSelectionTransfer;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.CustomConnectionLayerEx;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.providers.MindCustomDocumentProvider;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditor;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindPackage;

public class CustomMindDiagramEditor extends MindDiagramEditor {

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		getDiagramGraphicalViewer().addDropTargetListener(
				(TransferDropTargetListener) new DiagramDropTargetListener(
						getDiagramGraphicalViewer(), CustomPluginTransfer
								.getInstance()) {
					
					protected List getObjectsBeingDropped() {
						System.out.println("MdaDiagramEditor.getObjectsBeingDropped");
						TransferData[] data = getCurrentEvent().dataTypes;
						List ret = new ArrayList();
						
//						for(TransferData obj : data){
//							System.out.println("MdaDiagramEditor.getObjectsBeingDropped data : "+obj);
//						}
						for (int i = 0; i < data.length; i++) {
							boolean cond = CustomPluginTransfer.getInstance().isSupportedType(data[i]);
//							System.out.println("LocalTransfer.getInstance().isSupportedType(data[i]) : "+cond);
//							
							if (cond) {
								Object source = CustomPluginTransfer.getInstance().nativeToJava(data[i]);
								
								IStructuredSelection selection = (IStructuredSelection) LocalSelectionTransfer.getTransfer().getSelection();
								
								int a = 1;
								a =a *1;

								
								
//								IStructuredSelection selection = (IStructuredSelection) PluginTransfer
//										.getInstance()
//								System.out.println("selection : "+selection);
//								System.out.println("selection.toList() : "+selection.toList());
//									for(Object obj : selection.toList()){
//										if( obj instanceof AbstractCategory){
//											AbstractCategory cat = (AbstractCategory) obj;
//											ret.addAll(fetchSelectedMDAProject(cat));
//										}
//									}
							}
						}
//						System.out.println("MdaDiagramEditor.getObjectsBeingDropped eObjects.size() : "+ret.size());
//						for(Object obj : ret){
//							System.out.println("MdaDiagramEditor.getObjectsBeingDropped eObjects : "+obj);
//						}
						return ret;
					}

//					private Collection<MDAProject> fetchSelectedMDAProject(
//							AbstractCategory cat) {
//						Collection<MDAProject> ret = new ArrayList<MDAProject>();
//						if(cat instanceof MDAProject){
//							MDAProject project = (MDAProject) cat;
//							ret.add(project);
//						}else{
//							MDACategory category = (MDACategory) cat;
//							for(AbstractCategory abstractCategory : category.getChilds()){
//								ret.addAll(fetchSelectedMDAProject(abstractCategory));
//							}
//						}
//						return ret;
//					}

					public boolean isEnabled(DropTargetEvent event) {
						System.out.println("MindDiagramEditor.isEnabled");
						boolean ret = true;
//						if (super.isEnabled(event)) {
//							Object modelObj = getViewer().getContents()
//									.getModel();
//							if (modelObj instanceof EObject) {
//								List eObjects = getDropObjectsRequest()
//										.getObjects();
//
//								if (eObjects == null)
//									ret = false;
//
//								for (Iterator i = eObjects.iterator(); i
//										.hasNext();) {
//									Object o = i.next();
//
//									if (!(o instanceof EObject))
//										ret = false;
//
//									if (!SUPPORTED_DRAG_DROP_ECLASSES
//											.contains(((EObject) o).eClass()))
//										ret = false;
//								}
//
//								ret = true;
//							}
//						}
//
//						ret = false;
						System.out.println("MdaDiagramEditor.isEnabled ret : "+ret);
						return ret;
					}
					
					@Override
					protected void handleDrop() {
						super.handleDrop();
						List<Object> droppedProjects = getObjectsBeingDropped();
						List projects = new ArrayList();
						TransactionalEditingDomain domain = getEditingDomain();
//						for(Object obj : droppedProjects){
//							if(obj instanceof MDAProject){
//								MDAProject project = (MDAProject) obj;
//								System.out.println("obj is instance of MDAProject");
//								projects.add(project);
//								System.out.println("project.eContainer() : "+project.eContainer());
//								System.out.println("project.eContainingFeature() : "+project.eContainingFeature());
//							}
//							System.out.println("dropped obj : "+obj);
//						}
						
//						EList<EObject> objs = domain.getResourceSet().getResources().iterator().next().getContents();
//						System.err.println("objs : "+objs);
//						SELECT query = new SELECT(
//														new FROM(objs),
//														new WHERE(new EObjectInstanceCondition(MdaPackage.eINSTANCE.getRootProject()))
//													);
//						Collection resultObjs = query.execute();
//						for(Object obj : resultObjs){
//							System.err.println("query.execute(); obj : "+obj);
//						}
						
//						System.out.println("MdaPackage.eINSTANCE.getRootProject() : "+MdaPackage.eINSTANCE.getRootProject());
//						System.out.println("MdaPackage.eINSTANCE.getRootProject_MdaProjects() : "+MdaPackage.eINSTANCE.getRootProject_MdaProjects());
						
//						AddCommand cmd = new AddCommand(domain, (EObject) resultObjs.iterator().next(), MdaPackage.eINSTANCE.getRootProject_MdaProjects(), projects);
						
//						CommandParameter param = new CommandParameter(AdlPackage.eINSTANCE.getRootProject(), MdaPackage.eINSTANCE.getRootProject_MdaProjects(), projects); 
//						Command addCommand = domain.createCommand(AddCommand.class, param);
//						
//						domain.getCommandStack().execute(addCommand);
//						boolean canExecute = addCommand.canExecute();
//						System.out.println("canExecute : "+canExecute);
//
//						
//						
//						
//						try {
//							domain.getResourceSet().getResources().iterator().next().save(null);
//							for(Resource resource : domain.getResourceSet().getResources()){
//								resource.save(null);
//							}
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
					}
					
				});
	}
	
	
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		super.createPartControl(parent);
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
//		getDiagramGraphicalViewer().addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
	}


	@Override
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		return super.createPaletteRoot(existingPaletteRoot);
	}

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
		if (input instanceof FileEditorInput) {
			FileEditorInput fei = (FileEditorInput) input;
			if (fei.getFile().getFileExtension().equals("adl")) {
				input = new FileEditorInput(fei.getFile().getParent().getFile(new org.eclipse.core.runtime.Path(fei.getName()+"_diagram")));
			}
		}
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		super.setInput(input);
	}
	
	@Override
	public void dispose() {
		try {
			super.dispose();
		} catch (Exception e) {
			// Workaround for a bug in DiagramDocumentEditor
		}
	}

	@SuppressWarnings("rawtypes")
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
