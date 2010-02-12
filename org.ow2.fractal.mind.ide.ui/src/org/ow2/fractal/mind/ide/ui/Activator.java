package org.ow2.fractal.mind.ide.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.ow2.fractal.mind.emf.diagram.custom.util.CustomMindDiagramEditorUtil;
import org.ow2.fractal.mind.ide.MindIdeCore;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = "org.ow2.fractal.mind.build.ui";

	/**
	 *  The shared instance
	 */
	private static Activator plugin;

	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	/** 
	 * Open the editors associated to the giving file
	 * @param jf a file
	 */
	static public void openFile(IFile jf) {
		if (jf != null) {
			try {
				IEditorDescriptor editor = IDE.getDefaultEditor(jf);
				if (editor == null) {
					editor = PlatformUI.getWorkbench().getEditorRegistry()
							.findEditor(EditorsUI.DEFAULT_TEXT_EDITOR_ID);
				}
				if (editor.getId().equals("adl.diagram.part.MindDiagramEditorID")) {
					// Save model URI, needed if diagram must be created
		        	URI modelURI = URI.createFileURI(jf.getFullPath().toPortableString());
		        	// This is the diagram URI
		        	jf = jf.getParent().getFile(new Path(jf.getName()+MindIdeCore.DIAGRAM_EXT));
		        	URI diagramURI = URI.createFileURI(jf.getFullPath().toPortableString());
		        	// If diagram file doesn't exist, create it from the model
		        	if (!(jf.exists())) {
						CustomMindDiagramEditorUtil.initDiagram(diagramURI, modelURI, new NullProgressMonitor());
		        	}
				}
				IWorkbench workbench = PlatformUI.getWorkbench();
				IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
				IDE.openEditor(activePage, jf, true);
			} catch (PartInitException e) {
				MindIdeCore.log(e, "Cannot open file "+jf);
			}
		}
	}

    
}
