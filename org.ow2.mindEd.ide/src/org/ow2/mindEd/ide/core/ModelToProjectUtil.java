package org.ow2.mindEd.ide.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.common.ui.util.FileUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindidePackage;



public class ModelToProjectUtil {
	
	/**
	 * The instance singleton
	 */
	public static final ModelToProjectUtil INSTANCE = new ModelToProjectUtil();
	
	/**
	 * The editor input associated with the editor opened.
	 * Needed to get the current project / package / definition
	 */
	private IEditorInput editorInput;
	
	private ModelToProjectUtil () {
		refreshEditorInput();
	}
	
	/**
	 * Seeks a component with the given name.
	 * @param componentName the name of the component to resolve
	 * @param imports the list of imports name in the definition
	 * @return the URI of the resolved component or null
	 * @see {@link MindProject#resolveAdl(String, String, EList)}
	 */
	public URI resolveAdl(String componentName, ArrayList<String> imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		return resolveAdl(componentName, importsEList);
	}
	
	/**
	 * Seeks a component with the given name.
	 * @param componentName the name of the component to resolve
	 * @param imports the list of imports name in the definition
	 * @return the URI of the resolved component or null
	 * @see {@link MindProject#resolveAdl(String, String, EList)}
	 */
	public URI resolveAdl(String componentName, EList<String> imports) {
		// Resolve and return the URI
		MindAdl adl = resolveMindAdl(componentName, imports);
		if (adl == null) return null;
		
		return URI.createPlatformResourceURI(adl.getFullpath(), true);
	}
	
	public IFile resolveItf(String itfName, EList<String> imports) {
		// Resolve and return the URI
		MindItf itf = getMindItf(itfName, imports);
		if (itf == null) return null;
		
		return MindIdeCore.getResource(itf);
	}	

	public String getNameFQN(String componentName, ArrayList<String>  imports) {
		EList<String> importsEList = new BasicEList<String>();
		importsEList.addAll(imports);
		
		MindAdl adl = resolveMindAdl(componentName, importsEList);
		if (adl == null) return null;
		
		return adl.getQualifiedName();
	}

	public MindAdl resolveMindAdl(String componentName, EList<String> importsEList) {
		// This is the current project
		MindProject project = getMindProject();
		if (project == null) {
			return null;
		}
		
		// This is the current package
		MindPackage defaultPackageObj = getCurrentPackage();
		if (defaultPackageObj == null) {
			return null;
		}
		
		// Resolve and return the URI
		MindAdl adl = project.resolveAdl(componentName, defaultPackageObj.getName(), importsEList);
		return adl;
	}
	
	private MindItf getMindItf(String itfName, EList<String> imports) {
		// This is the current project
		MindProject project = getMindProject();
		if (project == null) {
			return null;
		}
		
		// This is the current package
		MindPackage defaultPackageObj = getCurrentPackage();
		if (defaultPackageObj == null) {
			return null;
		}
		
		// Resolve and return the URI
		MindItf itf = project.resolveIdl(itfName, defaultPackageObj.getName(), imports);
		return itf;
	}
	
	/**
	 * 
	 * @return a list of string containing all the definitions in the project, or an empty list
	 */
	public List<String> getDefinitionsInProject() {
		return getAllFQNInProject(MindidePackage.Literals.MIND_ADL);
	}
	
	public List<String> getAllFQNInProject(EClass type) {
		MindProject mindProject = getMindProject();
		if (mindProject == null) return Collections.emptyList();
		
		EList<MindFile> files = mindProject.getAllFiles();
		List<String> definitions = new ArrayList<String>();
		for (MindFile file : files) {
			if (type.isInstance(file)) {
				definitions.add(file.getQualifiedName());
			}
		}
		return definitions;
	}
	
	/**
	 * 
	 * @return a list of string containing all the .itf in the project, or an empty list
	 */
	public List<String> getInterfacesInProject() {
		return getAllFQNInProject(MindidePackage.Literals.MIND_ITF);
	}
	
	
	public void setEditorInput(IEditorInput input) {
		editorInput = input;
	}
	
	private void refreshEditorInput () {
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (window == null || window.getActivePage() == null )
				return;
			editorInput = window.getActivePage().getActiveEditor().getEditorInput();
		} catch (NullPointerException e) {
			// The editor is probably being initialized
			return;
		}
		
	}
	
	/**
	 * @return the current MindProject or null if project is not of Mind nature
	 */
	public MindProject getMindProject() {
		return getMindProject(getIProject());
	}
	
	/**
	 * @param project the IProject
	 * @return the MindProject associated with given IProject or null if the project is not of Mind nature
	 */
	public MindProject getMindProject(IProject project) {
		return MindIdeCore.get(project);
	}
	
	public String getCurrentDefinition() {
		refreshEditorInput();
		
		if(editorInput instanceof FileEditorInput){
			try{
				String relativePath = FileUtil.getRelativePath(((FileEditorInput)editorInput).getPath().toString(), Platform.getLocation().toString());
				// Convert to mind format
				String mindPath = convertToMindPath(relativePath);
				String pack = getCurrentPackage().getName();
				int start = mindPath.lastIndexOf(pack);
				int end = mindPath.lastIndexOf(".");
				String finalPath = mindPath.substring(start, end);
				return finalPath;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		return new String(" ");
	}
	
	/**
	 * Used to convert path  to a mind path<p>
	 * Converts "\\" or "/" separators to "."
	 * @param oldPath
	 * @return the converted path
	 */
	static String convertToMindPath(String oldPath){	
		String tempPath = oldPath.replace('\\', '.');
		String convertedPath = tempPath.replace('/', '.');
		return convertedPath;
	}
	
	/**
	 * 
	 * @param uri the URI of the wanted file
	 * @return the IFile or null
	 */
	public IFile getIFile(URI uri) {
		if (uri != null) {
			try {
				IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
				// Get the project associated with the first segment
				IProject project = workspace.getRoot().getProject(uri.segment(0));
				String path = FileUtil.getRelativePath(uri.path(),project.getFullPath().toString());
				return project.getFile(path);
			} catch (NullPointerException e) {
				// File could not be found
				return null;
			}
			
		}
		return null;
	}
	
	/**
	 * @return the current IProject or null
	 */
	public IProject getIProject() {
		IProject project = null;
		refreshEditorInput();

		if(editorInput instanceof FileEditorInput){
			FileEditorInput fileEditorInput = (FileEditorInput)editorInput;
			IFile file = fileEditorInput.getFile();
			if (file == null)
				return null;
			return file.getProject();
		}
		return project;
	}
	
	/**
	 * @param resourceURI : A file URI
	 * @return Fully qualified name from a given URI
	 */
	public String getFQNFromURI(URI resourceURI)
	{
		if(resourceURI==null)return null;
		String pack = getPackageFromURI(resourceURI).getName();
		if(pack==null)pack="";
		String component = resourceURI.lastSegment().substring(0, resourceURI.lastSegment().lastIndexOf("."));
		return pack+"."+component;
	}
	
	/**
	 * @param resourceURI : A file URI
	 * @return package name from a resource URI
	 */
	public MindPackage getPackageFromURI(URI resourceURI) {
		refreshEditorInput();
		if(editorInput instanceof FileEditorInput){
			try{
				String relativePath = resourceURI.devicePath();
				//Replace \ with #
				String convertedRelativePath = '/' + convertToGenericPath(relativePath);
				URI relativeURI = URI.createURI(convertedRelativePath);
				
				if (relativeURI.segmentCount() > 1) {
					EList<MindRootSrc> roots = getMindProject().getRootsrcs();
					for (MindRootSrc rootSrc : roots) {
						String rootPath = rootSrc.getFullpath();
						if (convertedRelativePath.contains(rootPath)) {
							EList<MindPackage> packages = rootSrc.getPackages();
							for (MindPackage mindPackage : packages) {
								String packagePath = mindPackage.getFullpath();
								if (convertedRelativePath.contains(packagePath)) {
									return mindPackage;
								}
							}
						}
						
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return null;	
	}
	
	/**
	 * @return the IProject associated with the editorInput
	 */
	public MindPackage getCurrentPackage() {
		MindFile mo = getCurrentMindFile();
		return mo == null ? null : mo.getPackage();
	}
	
	
	/**
	 * @return the IProject associated with the editorInput
	 */
	public MindFile getCurrentMindFile() {
		refreshEditorInput();
		
		if(editorInput instanceof FileEditorInput){
			FileEditorInput fileEditorInput = (FileEditorInput)editorInput;
			IFile file = fileEditorInput.getFile();
			MindObject mo = MindIdeCore.get(file);
			if (mo instanceof MindFile) {
				return (MindFile) mo;
			}
			
			throw new IllegalArgumentException(mo == null ? "not find":"bad type "+mo.eClass().getName());
		}
		return null;
	}
	
		
	/**
	 * Used to convert a windows path ( \\ ) to a generic path ( / )
	 * @param oldPath
	 * @return the converted path
	 */
	static String convertToGenericPath(String oldPath){	
		String convertedPath = oldPath.replace('\\', '/');
		return convertedPath;
	}

	
	
	
}
