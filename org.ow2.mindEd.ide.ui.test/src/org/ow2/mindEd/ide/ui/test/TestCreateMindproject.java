package org.ow2.mindEd.ide.ui.test;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withMnemonic;
import static org.hamcrest.Matchers.instanceOf;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.MenuFinder;
import org.eclipse.swtbot.swt.finder.results.WidgetResult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.activities.WorkbenchActivityHelper;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.ReferencesList;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.test.TestMindProject;
import org.ow2.mindEd.ide.ui.wizards.Messages;

import fr.imag.adele.graphictests.gef.gtgefeditor.GTGefEditor;
import fr.imag.adele.graphictests.gtmenu.GTMenu;
import fr.imag.adele.graphictests.gttree.GTTreePath;
import fr.imag.adele.graphictests.gtworkbench_part.GTEditor;
import fr.imag.adele.graphictests.gtworkbench_part.GTShell;
import fr.imag.adele.graphictests.gtworkbench_part.GTTextEditor;
import fr.imag.adele.graphictests.gtworkbench_part.GTView;
import fr.imag.adele.graphictests.test.GTTestCase;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import org.eclipse.ui.editors.text.TextEditor;

/**
 * Test Fractal Mind Wizard
 */
public class TestCreateMindproject extends GTTestCase {
	
	
	private static final String MIND_ADL_COMPONENT_MENU = "Mind ADL Component";
	public static final String MIND_PROJECT_NODE = "Mind Project ";
	public static final String FRACTAL_MIND_PROJECT = "MindEd Project";
	public static final String MIND_NAVIGATOR = "Mind Navigator";
	public static final String MIND_REPO_WS = "Mind Repo ws";
	static private String projectName;

	
	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		SWTBotPreferences.TIMEOUT = 6000;
	}
	/**
	 * Test Fractal Mind Wizard in the default location.
	 * @throws Exception
	 */
	
	@Test
	public void testCreateMindProject() throws Exception {
		String name = "Test" ; //call a generator which compute a new name
		GTMenu.clickItem("File", "New", FRACTAL_MIND_PROJECT);
		GTShell shell = new GTShell(Messages.MindProjectWizard_window_title);
		//shell.findTree().selectNode("Mind",FRACTAL_MIND_PROJECT);
		//shell.findButton("Next >").click();
		shell.findTextWithLabel("Project name:").typeText(name);
		shell.close();
		
		TestMindProject.assertMindProject(name);		
	}

	
	
	/**
	 * Select mind navigator.
	 * @throws Exception
	 */
	
	@Test
	public void testSelectMindNavigatorAndCreateProject() throws Exception {
		GTView mindView = new GTView(MIND_NAVIGATOR);
		mindView.show();
		
		projectName = "Test2_"+System.currentTimeMillis() ; //call a generator which compute a new name
		mindView.contextMenu(new GTTreePath(MIND_REPO_WS), FRACTAL_MIND_PROJECT).click();
		GTShell shell = new GTShell(Messages.MindProjectWizard_window_title);
		shell.findTextWithLabel("Project name:").typeText(projectName);
		shell.close();
		
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName);
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "Mind path");
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertTrue(p.exists());
		IFolder srcFolder = p.getFolder("src");
		assertTrue(srcFolder.exists());
		
		// create a package
		GTTreePath node = new GTTreePath(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.contextMenu(node, "Mind package").click();
		shell = new GTShell(Messages.MindPackageWizard_window_title);
		final String packageName = "toto";
		shell.findTextWithLabel("Package:").typeText(packageName);
		shell.close();
		
		IFolder totoPackageFolder = srcFolder.getFolder(packageName);
		assertTrue(totoPackageFolder.exists());
		
		node = node.concat(packageName);
		mindView.contextMenu(node, MIND_ADL_COMPONENT_MENU).click();
		
		
		// create a component
		shell = new GTShell(Messages.ComponentNewWizard_window_title);
	//	shell.findComboBoxWithLabel("Component kind:").setText("COMPOSITE");
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("COMPOSITE");
		shell.findTextWithLabel("Component name:").typeText("CompA");
		shell.close();
		
		IFile compAFile = totoPackageFolder.getFile("CompA.adl");
		assertTrue(compAFile.exists());
		IFile compAFile_Diagram = totoPackageFolder.getFile("CompA.adl"+MindIdeCore.DIAGRAM_EXT);
		assertTrue(compAFile_Diagram.exists());
		
		
		
	}
	
	/**
	 * Select mind navigator.
	 * @throws Exception
	 */
	
	@Test
	public void testSelectMindNavigatorAndCreateProject2() throws Exception {
		GTView mindView = new GTView(MIND_NAVIGATOR);
		mindView.show();
		
		GTTreePath rootNode = new GTTreePath(MIND_REPO_WS);
		
		projectName = "Test2_"+System.currentTimeMillis() ; //call a generator which compute a new name
		mindView.contextMenu(rootNode, FRACTAL_MIND_PROJECT).click();
		GTShell shell = new GTShell(Messages.MindProjectWizard_window_title);
		shell.findTextWithLabel("Project name:").typeText(projectName);
		shell.close();
		
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName);
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "Mind path");
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertTrue(p.exists());
		IFolder srcFolder = p.getFolder("src");
		assertTrue(srcFolder.exists());
		
		// create a package 
		GTTreePath rootSrcNode = rootNode.concat(MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.contextMenu(rootSrcNode, "Mind package").click();
		shell = new GTShell(Messages.MindPackageWizard_window_title);
		final String packageName = "toto";
		shell.findTextWithLabel("Package:").typeText(packageName);
		shell.close();
		
		IFolder totoPackageFolder = srcFolder.getFolder(packageName);
		assertTrue(totoPackageFolder.exists());
		
		GTTreePath packageNode = rootSrcNode.concat(packageName);
		mindView.contextMenu(packageNode, MIND_ADL_COMPONENT_MENU).click();
		
		
		// create a component
		shell = new GTShell(Messages.ComponentNewWizard_window_title);
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("PRIMITIVE");
		shell.findTextWithLabel("Component name:").typeText("CompA");
		shell.close();
		
		IFile compAFile = totoPackageFolder.getFile("CompA.adl");
		assertTrue(compAFile.exists());
		IFile compAFile_Diagram = totoPackageFolder.getFile("CompA.adl"+MindIdeCore.DIAGRAM_EXT);
		assertTrue(compAFile_Diagram.exists());
	}
	
	
	/**
	 * Select mind navigator.
	 * @throws Exception
	 */
	
	@Test
	public void testOpenWith() throws Exception {
		GTView mindView = new GTView(MIND_NAVIGATOR);
		mindView.show();
		
		GTTreePath rootNode = new GTTreePath(MIND_REPO_WS);
		
		projectName = "Test2_"+System.currentTimeMillis() ; //call a generator which compute a new name
		String compA = "compA_OpenW";
		
		mindView.contextMenu(rootNode, FRACTAL_MIND_PROJECT).click();
		GTShell shell = new GTShell(Messages.MindProjectWizard_window_title);
		shell.findTextWithLabel("Project name:").typeText(projectName);
		shell.close();
		
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName);
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "Mind path");
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertTrue(p.exists());
		IFolder srcFolder = p.getFolder("src");
		assertTrue(srcFolder.exists());
		
		// create a package 
		GTTreePath rootSrcNode = rootNode.concat(MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.contextMenu(rootSrcNode, "Mind package").click();
		shell = new GTShell(Messages.MindPackageWizard_window_title);
		final String packageName = "toto";
		shell.findTextWithLabel("Package:").typeText(packageName);
		shell.close();
		
		IFolder totoPackageFolder = srcFolder.getFolder(packageName);
		assertTrue(totoPackageFolder.exists());
		
		GTTreePath packageNode = rootSrcNode.concat(packageName);
		mindView.contextMenu(packageNode, MIND_ADL_COMPONENT_MENU).click();
		
		
		// create a component
		shell = new GTShell(Messages.ComponentNewWizard_window_title);
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("PRIMITIVE");
		shell.findTextWithLabel("Component name:").typeText(compA);
		shell.close();
		
		GTTextEditor text = new GTTextEditor(compA+".adl");
		text.close();
		
		GTTreePath compANode = packageNode.concat("Mind Adl "+compA.substring(0,1).toLowerCase()+compA.substring(1));
		mindView.selectNode(compANode);
		
//		final SWTBotMenu openWMenu = mindView.contextMenu(compANode, "Open With");
//		
//		fr.imag.adele.graphictests.test.GTMenu gtOpenWMenu = new fr.imag.adele.graphictests.test.GTMenu(openWMenu);
//		
//		mindView.bot().getDisplay().syncExec(new Runnable() {
//			
//			@Override
//			public void run() {
//				MenuItem[] items = openWMenu.widget.getMenu().getItems();
//				for (MenuItem menuItem : items) {
//					System.out.println(" - "+menuItem.getText());
//				}
//				
//			}
//		});
		mindView.click(compANode, "Open With","MindEd ADL Editor");
		text = new GTTextEditor(compA+".adl");
		text.close();
		
		mindView.click(compANode, "Open With","Mind Graphical Editor");
		GTGefEditor gef = new GTGefEditor(compA+".adl_diagram");
		checkError(gef);
		gef.close();
		
		IFile diagFile = totoPackageFolder.getFile(compA+".adl_diagram");
		IFile adlFile = totoPackageFolder.getFile(compA+".adl");
		assertTrue(diagFile.exists());
		diagFile.delete(true, null);
		assertTrue(!diagFile.exists());
		
		assertTrue(adlFile.exists());
		mindView.click(compANode, "Open With","Mind Graphical Editor");
		gef = new GTGefEditor(compA+".adl_diagram");
		checkError(gef);
		gef.close();
		
		assertTrue(diagFile.exists());
		
		GTTreePath compAPahtInPackage= new GTTreePath(projectName, "src", packageName, compA+".adl" );
		GTView.packageExplorerView.selectNode(compAPahtInPackage);
		GTView.packageExplorerView.findTree().doubleClick(compAPahtInPackage);
		
		gef = new GTGefEditor(compA+".adl_diagram");
		checkError(gef);
		gef.close();
		
		mindView.click(compANode, "Open With","MindEd ADL Editor");
		text = new GTTextEditor(compA+".adl");
		text.close();
		
		GTView.packageExplorerView.findTree().doubleClick(compAPahtInPackage);
		text = new GTTextEditor(compA+".adl");
		text.close();
	}
	
	private void checkError(final GTGefEditor gef) {
		Matcher matcher = instanceOf(FigureCanvas.class);
		List widgets = gef.bot().widgets(matcher);
		assertTrue(widgets.size() == 2);		
	}



	public MenuItem click(final GTView mindView, final GTTreePath node , final String... menuName) throws WidgetNotFoundException {
		final MenuItem[] menuItem = new MenuItem[1]; 
		final String[] error = new String[1];
		
		mindView.bot().getDisplay().syncExec(new Runnable() {
			public void run() {
				try {
					SWTBotTreeItem node2 = mindView.bot().tree().expandNode(node.getPath());
					node2.contextMenu(menuName[0]);
					Menu bar = mindView.bot().tree().widget.getMenu();
					String errorMsg = "Cannot found menu ";
					ONE : for (int i = 0; i < menuName.length ; i++) {
						String n = menuName[i];
						if (i == 0)
							errorMsg = errorMsg+n;
						else
							errorMsg = errorMsg+":"+n;
						if (bar == null) {
							error[0] = errorMsg;
							menuItem[0] = null;
							return;
						}
						bar.notifyListeners(SWT.Show, new Event());
						Matcher<MenuItem> withMnemonic = withMnemonic(n);
						MenuItem[] items = bar.getItems();
						for (MenuItem m : items) {
							if (withMnemonic.matches(m)) {
								if (i+1 == menuName.length) {
									bar.notifyListeners(SWT.Hide, new Event());
									error[0] = null;
									menuItem[0] = m;
									new SWTBotMenu(m).click();
									return;
								}
								bar.notifyListeners(SWT.Hide, new Event());
								bar = m.getMenu();
								continue ONE;
							}
						}
						error[0] = errorMsg;
						menuItem[0] = null;
						return;
					}
					error[0] = errorMsg;
					menuItem[0] = null;
					return;
				} catch (WidgetNotFoundException e) {
					error[0] = e.getMessage();
					menuItem[0] = null;
					return;
				}
			}
		});

		if (error[0] != null)
			throw new WidgetNotFoundException(error[0]);
		return menuItem[0];
	}
	
	
	/**
	 * Select mind navigator.
	 * @throws Exception
	 */
	
	@Test
	public void testBugFQN() throws Exception {
		GTView mindView = new GTView(MIND_NAVIGATOR);
		mindView.show();
		
		GTTreePath rootNode = new GTTreePath(MIND_REPO_WS);
		
		//Create project
		
		projectName = "Test2_"+System.currentTimeMillis() ; //call a generator which compute a new name
		mindView.contextMenu(rootNode, FRACTAL_MIND_PROJECT).click();
		GTShell shell = new GTShell(Messages.MindProjectWizard_window_title);
		shell.findTextWithLabel("Project name:").typeText(projectName);
		shell.close();
		
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName);
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "Mind path");
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertTrue(p.exists());
		IFolder srcFolder = p.getFolder("src");
		assertTrue(srcFolder.exists());
		
		// create a package 
		GTTreePath rootSrcNode = rootNode.concat(MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.contextMenu(rootSrcNode, "Mind package").click();
		shell = new GTShell(Messages.MindPackageWizard_window_title);
		final String packageName = "a.b";
		shell.findTextWithLabel("Package:").typeText(packageName);
		shell.close();
		
		IFolder totoPackageFolder = srcFolder.getFolder(packageName.replace('.', '/'));
		assertTrue(totoPackageFolder.exists());
		
		GTTreePath packageNode = rootSrcNode.concat(packageName);
		
		
		// create a component T1
		mindView.contextMenu(packageNode, MIND_ADL_COMPONENT_MENU).click();
		shell = new GTShell(Messages.ComponentNewWizard_window_title);
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("TYPE");
		shell.findTextWithLabel("Component name:").typeText("T1");
		shell.close();
		
		IFile compT1File = totoPackageFolder.getFile("T1.adl");
		assertTrue(compT1File.exists());
		
		
		// create a component T2
		mindView.contextMenu(packageNode, MIND_ADL_COMPONENT_MENU).click();
		shell = new GTShell(Messages.ComponentNewWizard_window_title);
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("TYPE");
		shell.findTextWithLabel("Component name:").typeText("T2");
		shell.close();
		
		IFile compT2File = totoPackageFolder.getFile("T2.adl");
		assertTrue(compT2File.exists());
		
		
		// This is the current project
		MindProject mp = MindIdeCore.get(p);

		// This is the current package
		String defaultPackage = "a.b";
		// Resolve and return the URI
		MindAdl t1MindAdl = mp.resolveAdl("T1", defaultPackage, null);
		assertNotNull(t1MindAdl);
		assertEquals("a.b.T1", t1MindAdl.getQualifiedName());
		
		GTTextEditor t1Editor = new GTTextEditor("T1.adl");
		GTTextEditor t2Editor = new GTTextEditor("T2.adl");
		t2Editor.show();
		t2Editor.typeText("type a.b.T2 extends T1 {}");
		
		System.out.println(t2Editor.getSWTBotTextEditor().getText());
		final XtextEditor[] xtextEdiror_ = new XtextEditor[1];
		
		final IWorkbench workbench = PlatformUI.getWorkbench();
		workbench.getDisplay().syncExec(new Runnable() {
			
			@Override
			public void run() {
				IWorkbenchWindow activeWorkbenchWindow = workbench.getActiveWorkbenchWindow();
				IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
				IEditorPart currentEditor = activePage.getActiveEditor();
				xtextEdiror_[0] = (XtextEditor) currentEditor;
			}
		});
		
		XtextEditor xtextEdiror = xtextEdiror_[0];
		XtextDocument document = (XtextDocument) xtextEdiror.getDocument();
		xtextEdiror.getEditorInput();
		IUnitOfWork<String, XtextResource> work =  new IUnitOfWork<String, XtextResource>() {
			
			@Override
			public String exec(XtextResource state) throws Exception {
				
				AdlDefinition adl = (AdlDefinition) state.getEObject("/");
				if (adl == null) return null;
				ArchitectureDefinition architecturedefinition = adl.getArchitecturedefinition();
				if (architecturedefinition == null) return null;
				ReferencesList referencesList = architecturedefinition.getReferencesList();
				if (referencesList == null) return null;
				EList<ComponentReference> references = referencesList.getReferences();
				if (references == null) return null;
				if (references.size() == 0)
					return null;
				ComponentReference ref = references.get(0);
				if (ref == null) return null;
				return ref.getNameFQN();
			}
		};
		String extendsFQN = document.readOnly(work );
		assertEquals(t1MindAdl.getQualifiedName(), extendsFQN);
	}
}
