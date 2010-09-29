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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
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
	Composite subLevel;

	
	TreeViewer treeViewer;
	Text filePath;
	private int style = SWT.BORDER | SWT.SINGLE;
	
	Text inlineTextBox;
	
	Button fileButton;
	Button inlineButton;
	
	Label fileLabel;
	Label inlineLabel;
	
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
        fileLabel = new Label(topLevel, SWT.NONE);
        fileLabel.setText(ResourcesWizard.ADD_ELEMENT_FILE_BUTTON);
        fileLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}

			@Override
			public void mouseDown(MouseEvent e) {
				fileButton.setSelection(true);
				inlineButton.setSelection(false);
				if ((subLevel != null) && (!subLevel.isDisposed())) {
					subLevel.dispose();
				}
				createTreeComposite(topLevel);
				topLevel.layout(true);
			}
			@Override
			public void mouseUp(MouseEvent e) {}
			});
        
        new Label(topLevel, SWT.NONE);
        inlineButton = new Button(topLevel, SWT.RADIO);
        inlineLabel = new Label(topLevel, SWT.NONE);
        inlineLabel.setText(ResourcesWizard.ADD_ELEMENT_INLINE_BUTTON);
        inlineLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}

			@Override
			public void mouseDown(MouseEvent e) {
				fileButton.setSelection(false);
				inlineButton.setSelection(true);
				if ((subLevel != null) && (!subLevel.isDisposed())) {
					subLevel.dispose();
				}
				createTextBoxComposite(topLevel);
				topLevel.layout(true);
			}
			@Override
			public void mouseUp(MouseEvent e) {}
			});
        
        fileButton.setSelection(true);
        inlineButton.setSelection(false);
 
        createTreeComposite(topLevel);
        createRadioListener();
        
        setControl(topLevel);
        
	}
	
	private void createTextBoxComposite(Composite parent) {
		
		subLevel = new Composite(parent, SWT.NONE);
		{

			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			subLevel.setLayout(layout);
			subLevel.setFont(parent.getFont());

        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	subLevel.setLayoutData(constraint);

			subLevel.setVisible(true);
		}
		inlineTextBox = new Text(subLevel, SWT.BORDER | SWT.WRAP);
		inlineTextBox.setLayoutData(subLevel.getLayoutData());
		inlineTextBox.setText("{{"+'\n'+"}}");
	}


	private void createTreeComposite(Composite parent) {
		
		subLevel = new Composite(parent, SWT.NONE);
		{

			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			subLevel.setLayout(layout);
        	subLevel.setFont(parent.getFont());

        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, false);
        	constraint.horizontalSpan = 3;
        	subLevel.setLayoutData(constraint);
        	
        	subLevel.setVisible(true);
        	
		}
		filePath = CreationTreeViewer.createTreeComposite(subLevel, style, HEIGHT_DATA, ".c");
	}		

	private void createRadioListener() {
		
		fileButton.addSelectionListener(new SelectionListener()		
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(fileButton.getSelection())
				{
					if ((subLevel != null) && (!subLevel.isDisposed())) {
						subLevel.dispose();
					}
					createTreeComposite(topLevel);
					topLevel.layout(true);
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
					if ((subLevel != null) && (!subLevel.isDisposed())) {
						subLevel.dispose();
					}
					createTextBoxComposite(topLevel);
					topLevel.layout(true);
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
	
	public boolean isFile(){
		return fileButton.getSelection();
	}
	
	public String getFilePath(){
		return filePath.getText();
	}
	
	public String getInlineText(){
		return inlineTextBox.getText();
	}

}
