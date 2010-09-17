package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class AddElementPage extends WizardPage{

	AddElementWizard addElementWizard;
	
	Composite topLevel;
	Composite treeComposite;
	Composite textBoxComposite;
	
	TreeViewer treeViewer;
	Text filePath;
	private int style = SWT.BORDER | SWT.SINGLE;
	
	Text inlineTextBox;
	
	Button fileButton;
	Button inlineButton;
	
	protected final int HEIGHT_DATA = 200;
	protected final int WIDTH_DATA = 200;
	
	
	protected AddElementPage(String pageName) {
		super(pageName);
		setTitle(ResourcesWizard.ADD_ELEMENT_PAGE_TITLE);
		setDescription(ResourcesWizard.ADD_ELEMENT_PAGE_DESCRIPTION);
	}

	@Override
	public void createControl(Composite parent) {
		
		topLevel = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 3;
			topLevel.setLayout(layout);
			topLevel.setFont(parent.getFont());
			setControl(topLevel);
			addElementWizard = (AddElementWizard) this.getWizard();

		}
        new Label(topLevel, SWT.NONE).setText(ResourcesWizard.ADD_ELEMENT_TYPE);
        
        fileButton = new Button(topLevel, SWT.RADIO);
        new Label(topLevel, SWT.NONE).setText(ResourcesWizard.ADD_ELEMENT_FILE_BUTTON);
        
        new Label(topLevel, SWT.NONE);
        inlineButton = new Button(topLevel, SWT.RADIO);
        new Label(topLevel, SWT.NONE).setText(ResourcesWizard.ADD_ELEMENT_INLINE_BUTTON);
        
        fileButton.setSelection(true);
        inlineButton.setSelection(false);
        
        createTreeComposite(topLevel);
        createTextBoxComposite(topLevel);
        createRadioListener();
        
        setControl(topLevel);
	}
	
	private void createTextBoxComposite(Composite parent) {
		
		if(inlineButton.getSelection())
		{
			textBoxComposite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout ();
				layout.numColumns = 1;
				textBoxComposite.setLayout(layout);
				textBoxComposite.setFont(parent.getFont());
	
	        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
	        	constraint.horizontalSpan = 3;
	        	textBoxComposite.setLayoutData(constraint);
	        	textBoxComposite.setVisible(true);
			}
			inlineTextBox = new Text(textBoxComposite, SWT.BORDER);
			inlineTextBox.setLayoutData(textBoxComposite.getLayoutData());
		}
	}


	private void createTreeComposite(Composite parent) {
		if(fileButton.getSelection())
		{
			treeComposite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout ();
				layout.numColumns = 1;
				treeComposite.setLayout(layout);
	        	treeComposite.setFont(parent.getFont());
	
	        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, false);
	        	constraint.horizontalSpan = 3;
	        	treeComposite.setLayoutData(constraint);
	        	treeComposite.setVisible(true);
	        	
			}
			treeViewer = new TreeViewer (new Tree (treeComposite, style));
	        treeViewer.setContentProvider(new WorkbenchContentProvider());
	        treeViewer.setLabelProvider(new WorkbenchLabelProvider());
	
	        Tree treeWidget = treeViewer.getTree();
	        treeWidget.setFont(treeComposite.getFont());
	        {
			    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			    data.heightHint = HEIGHT_DATA;
			    treeWidget.setLayoutData(data);
			}
	        
	        treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
	        filePath = new Text(treeComposite, SWT.BORDER);
	        filePath.setFont(treeComposite.getFont());
	        {
				GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
	        	filePath.setLayoutData(data);
	        }
	        
	        createTreeListener();
	        
	        TreeFilterExtension treeFilter = new TreeFilterExtension(".c"); 
	        treeViewer.addFilter(treeFilter);
		}
	}

	private void createTreeListener() {
        treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			@SuppressWarnings("restriction")
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				TreeSelection treeSelection= (TreeSelection) event.getSelection();
				TreePath treePath = treeSelection.getPaths()[0];
				if(treePath.getLastSegment() instanceof Project)
				{
					Project selectedItem = (Project)treePath.getLastSegment();
					filePath.setText(selectedItem.getFullPath().toString());
				}
				else if(treePath.getLastSegment() instanceof Folder)
				{
					Folder selectedItem = (Folder)treePath.getLastSegment();
					filePath.setText(selectedItem.getFullPath().toString());
				}
				else if (treePath.getLastSegment() instanceof File)
				{
					File selectedItem = (File)treePath.getLastSegment();
					
					filePath.setText(selectedItem.getFullPath().toString());
				}
			}
		});
        
        treeViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {

	            ISelection selection = event.getSelection();
	            if (selection instanceof IStructuredSelection) {
	                Object item = ((IStructuredSelection) selection)
	                        .getFirstElement();
	                if (treeViewer.getExpandedState(item)) {
	                	treeViewer.collapseToLevel(item, 1);
					} else {
						treeViewer.expandToLevel(item, 1);
					}
	            }

            }
        });
	}
	
	private void createRadioListener() {
		
		fileButton.addSelectionListener(new SelectionListener()		
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(fileButton.getSelection())
				{
					topLevel.pack(true);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		inlineButton.addSelectionListener(new SelectionListener(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(inlineButton.getSelection())
				{
					
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
	}

	public boolean isInline(){
		return inlineButton.getSelection();
	}
	
	public String getFilePath(){
		return filePath.getText();
	}

}
