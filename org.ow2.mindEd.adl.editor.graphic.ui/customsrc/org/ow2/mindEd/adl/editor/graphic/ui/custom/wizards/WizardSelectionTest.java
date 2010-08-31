package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.internal.WorkbenchMessages;
import org.eclipse.ui.internal.dialogs.DialogUtil;
import org.eclipse.ui.internal.dialogs.WizardContentProvider;
import org.eclipse.ui.internal.dialogs.WizardPatternFilter;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardSelectionPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;
import org.eclipse.ui.internal.ide.misc.ContainerContentProvider;
import org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup;
import org.eclipse.ui.internal.ide.misc.ResourceAndContainerGroup;
import org.eclipse.ui.model.AdaptableList;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditor;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

@SuppressWarnings("restriction")
public class WizardSelectionTest extends WizardPage implements Listener{

    
	private IStructuredSelection currentSelection;
//	private ResourceAndContainerGroup resourceGroup;
	private static final int SIZING_CONTAINER_GROUP_HEIGHT = 250;
	private boolean initialAllowExistingResources = false;
	
	private String initialFileName;

	private String initialFileExtension;
	
	private ResourceAndContainerGroup resourceGroup;
	
	private ContainerSelectionGroup resourceGroup2;
	
	private ResourceDialog resourceDialog;
	
	private TreeViewer treeViewer;
	
	private FileDialog fileTree;
	
	private Tree treeTest;

	protected WizardSelectionTest(String pageName,
			IStructuredSelection selection) {
		super(pageName);
		setPageComplete(false);
		this.currentSelection = selection;
		initialFileName = "test.itf";
		initialFileExtension = "itf";
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		// top level group
		Composite topLevel = new Composite(parent, SWT.MENU);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		
		
		topLevel.setFont(parent.getFont());
		PlatformUI.getWorkbench().getHelpSystem().setHelp(topLevel,
				IIDEHelpContextIds.NEW_FILE_WIZARD_PAGE);
	
/*		
		resourceDialog = new ResourceDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Test ResourceDialog", 0);
		resourceDialog.open();
*/		
		setControl(topLevel);
	}

	protected String getNewFileLabel() {
		return IDEWorkbenchMessages.WizardNewFileCreationPage_fileLabel;
	}
	
	
	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		
	}
	
	
}
