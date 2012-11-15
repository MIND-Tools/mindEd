package org.ow2.mindEd.adl.textual.ui.navigation;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.util.ITextRegion;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.impl.FileCImpl;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.eclipse.xtext.resource.ILocationInFileProvider;

import com.google.inject.Inject;

public class FractalHyperlink extends HyperlinkHelper {

	// Reference on the project model
	//private MindModelManager mindModel = MindModelManager.getMindModelManager();

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private ILocationInFileProvider ILocationInFileProvider;

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,
			IHyperlinkAcceptor acceptor) {

		super.createHyperlinksByOffset(resource, offset, acceptor);

		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		ITextRegion loc = ILocationInFileProvider.getSignificantTextRegion(eObject);

		URI uri = null;

		if (eObject instanceof FileCImpl) {
			// SSZ
			// Inspired from the OpenDefinitionEditPolicy class, getOpenCommand method in the
			// org.ow2.mindEd.adl.editor.graphic.ui subproject, custom sources

			FileCImpl fileC = (FileCImpl) eObject;
			String fileName = fileC.getName();
			String directory = fileC.getDirectory();
			IFile file = null;

			// No directory
			if (directory == null || directory.equals("")){
				// Find the file according to the host component package
				// Here the resource is the ADL from where the link was called
				MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(resource.getURI());
				if (pack != null) {
					IFolder f = MindIdeCore.getResource(pack);
					file = f.getFile(fileName);
				}
			} else {
				// Absolute: we need to search from the root of the source-path for every source-path entry
				if (directory.startsWith("/")) {
					//					uri = URI.createPlatformResourceURI(f.getPath(), true);
					//					MindFile mf = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);

					ArchitectureDefinition parentAdl = null;
					// parent adl is...?
					while (!(eObject instanceof ArchitectureDefinition))
						eObject = eObject.eContainer();
					parentAdl = (ArchitectureDefinition) eObject;

					MindProject adlHostProject = ModelToProjectUtil.INSTANCE.getMindProject(parentAdl.eResource().getURI());

					String projectPath = adlHostProject.getProject().getFullPath().toString();
					
					// for all path entries, try to locate the C file
					EList<MindPathEntry> path = adlHostProject.getMindpathentries();
					URI cFileURI = null;
					for (MindPathEntry currentPath : path)
						if (currentPath.getEntryKind() == MindPathKind.SOURCE) {
							
							// let's use some defensive programming: it should always be false anyway, BUT... better check.
							if (!currentPath.getName().startsWith("/" + adlHostProject.getName() + "/"))
								continue;
							
							// path entries names are in such format: /project_name/currentPath, so we remove the first substring "/project_name", and keep "/currPath"
							String shortCurrPath = currentPath.getName().substring(adlHostProject.getName().length() + 1);
							cFileURI = URI.createPlatformResourceURI(projectPath + shortCurrPath + directory + fileName, true);
							
							// check file existence
							file = ModelToProjectUtil.INSTANCE.getIFile(cFileURI);
							if ((file != null) && file.exists()) // found !
								break;
						}
				} else {
					// Relative

					// handle host definition path for resource resolution
					File f = new File(directory, fileName);

					// SSZ
					// Find the file according to the host component package  
					// Here the resource is the ADL from where the link was called
					MindPackage hostComponentPackage = ModelToProjectUtil.INSTANCE.getCurrentPackage(resource.getURI());
					if (hostComponentPackage != null) {
						IFolder compFolder = MindIdeCore.getResource(hostComponentPackage);

						// Don't forget we want to locate the complete folder "container" : add the "/"
						URI compFolderURI = URI.createPlatformResourceURI(compFolder.getFullPath().toString() + "/", true);

						URI currentRelativeURI = URI.createFileURI(f.getPath());
						URI resolvedFinalURI = currentRelativeURI.resolve(compFolderURI);

						file = ModelToProjectUtil.INSTANCE.getIFile(resolvedFinalURI);
					}
				}
			}

			try {
				// Get the file URI
				// Create the editor input

				if (file == null || !(file.exists())) {
					// SSZ: TODO: handle errors
					return; // warn/error ?
				}

				IEditorInput cdtEditorInput = new FileEditorInput(file);

				// Now try to open the editors
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();
				page.openEditor(cdtEditorInput, "org.eclipse.cdt.ui.editor.CEditor");

			} catch (PartInitException e) {
				// SSZ: TODO: handle errors
				return;
				//MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			} catch (NullPointerException e) {
				// SSZ: TODO: handle errors
				return;
				//MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			} catch (Exception e) {
				// SSZ: TODO: handle errors
				return;
				//MindDiagramEditorPlugin.getInstance().logError("Failed to open the editor", e);
			}

		}            

		if (uri != null ){
			// here we create the link

			XtextHyperlink hyperlink = getHyperlinkProvider().get();
			hyperlink.setURI(uri);
			hyperlink.setHyperlinkRegion(new Region(loc.getOffset(), loc.getLength()));

			acceptor.accept(hyperlink);
		}        

	}

}
