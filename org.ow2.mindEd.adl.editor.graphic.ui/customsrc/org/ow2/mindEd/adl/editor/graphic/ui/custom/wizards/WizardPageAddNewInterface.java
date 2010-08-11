package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;


import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


@SuppressWarnings("restriction")
public class WizardPageAddNewInterface extends WizardPage {

	Text interfaceNameText;
	
	protected static final int CONTROL_OFFSET = 10;
	protected final int HEIGHT_DATA = 200;
	protected final int WIDTH_DATA = 200;
	
	private Composite topLevel;
	private Composite compositeAdvanced;
	
	private int style = SWT.BORDER | SWT.SINGLE;
	protected Text uriField;
	TreeViewer treeViewer = null;
	
	private Button advancedButton;
	private Combo contengencyCombo;
	private final int CONTINGENCY_MANDATORY_INDEX = 0;
	private final int CONTINGENCY_OPTIONAL_INDEX = 1;
	
	
	private Combo collectionCombo;
	private final int COLLECTION_FALSE_INDEX = 0;
	private final int COLLECTION_TRUE_INDEX = 1;
	
	private Label collectionLabel;
	protected Text collectionSize;
	
	public WizardPageAddNewInterface(String pageName) {
		super(pageName);
		setTitle(ResourcesWizard.PAGE_TITLE);
		setDescription(ResourcesWizard.PAGE_DESCRIPTION);
	}

	@Override
	public void createControl(Composite parent) {
		topLevel = new Composite(parent, SWT.NONE);
		GridLayout layoutName = new GridLayout ();
		layoutName.numColumns = 1;
		topLevel.setLayout(layoutName);
		topLevel.setFont(parent.getFont());
		setControl(topLevel);
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.INTERFACE_NAME);
        interfaceNameText = new Text(topLevel,SWT.BORDER);
        interfaceNameText.setFont(parent.getFont());
        {
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.widthHint = WIDTH_DATA;
			interfaceNameText.setLayoutData(data);
        }
        
        
//        Composite signatureComposite = new Composite(topLevel, SWT.NONE);
        GridLayout layoutSignature = new GridLayout ();
        layoutSignature.numColumns = 1;
        topLevel.setLayout(layoutSignature);
        setControl(topLevel);
        
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.SIGNATURE);        

        treeViewer = new TreeViewer (new Tree (topLevel, style));
        treeViewer.setContentProvider(new WorkbenchContentProvider());
        treeViewer.setLabelProvider(new WorkbenchLabelProvider());

        Tree treeWidget = treeViewer.getTree();
        treeWidget.setFont(parent.getFont());
        {
		    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		    data.widthHint = WIDTH_DATA;
		    data.heightHint = HEIGHT_DATA;
		    treeWidget.setLayoutData(data);
		}
        
        treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
        uriField = new Text(topLevel, SWT.BORDER);
        uriField.setFont(parent.getFont());
        {
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.widthHint = WIDTH_DATA;
        	uriField.setLayoutData(data);
        }
        
        treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				TreeSelection treeSelection= (TreeSelection) event.getSelection();
				TreePath treePath = treeSelection.getPaths()[0];
				if(treePath.getLastSegment() instanceof Project)
				{
					Project selectedItem = (Project)treePath.getLastSegment();
					uriField.setText(selectedItem.getFullPath().toString());
				}
				else if(treePath.getLastSegment() instanceof Folder)
				{
					Folder selectedItem = (Folder)treePath.getLastSegment();
					uriField.setText(selectedItem.getFullPath().toString());
				}
				else if (treePath.getLastSegment() instanceof File)
				{
					File selectedItem = (File)treePath.getLastSegment();
					
					uriField.setText(selectedItem.getFullPath().toString());
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
        
        TreeFilterExtension treeFilter = new TreeFilterExtension(".itf"); 
        treeViewer.addFilter(treeFilter);

        
        createAdvancedControl(topLevel);
        
        
        
        
        
	}
        
	  /**
	   * Called to prepare the Browse File System button, this implementation adds a selection listener
	   * that creates an appropriate {@link FileDialog}.
	   */
/*
	protected void prepareBrowseFileSystemButton(Button browseFileSystemButton)
	  {
	    browseFileSystemButton.addSelectionListener
	      (new SelectionAdapter()
	       {
	         @Override
	        public void widgetSelected(SelectionEvent event)
	         {
	           FileDialog fileDialog = new FileDialog(getShell(), style);
	           fileDialog.open();

	           String filterPath = fileDialog.getFilterPath();
	           if (isMulti())
	           {
	             String[] fileNames = fileDialog.getFileNames();
	             StringBuffer uris = new StringBuffer();
	             
	             for (int i = 0, len = fileNames.length; i < len; i++)
	             {
	               uris.append(URI.createFileURI(filterPath + File.separator + fileNames[i]).toString());
	               uris.append("  ");
	             }             
	             uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
	           }
	           else
	           {
	             String fileName = fileDialog.getFileName();
	             if (fileName != null)
	             {
	               uriField.setText(URI.createFileURI(filterPath + File.separator + fileName).toString());
	             }
	           }
	         }

	         }
	       });
	  }
*/
	  /**
	   * Called to prepare the Browse Workspace button, this implementation adds a selection listener
	   * that creates an appropriate {@link WorkspaceResourceDialog}.  
	   */
/*
	  protected void prepareBrowseWorkspaceButton(Button browseWorkspaceButton)
	  {
	    browseWorkspaceButton.addSelectionListener
	      (new SelectionAdapter()
	       {
	         @Override
	        public void widgetSelected(SelectionEvent event)
	         {
	        	 
	           if (isMulti())
	           {
	             StringBuffer uris = new StringBuffer();

	             IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, true, null, null);
	             for (int i = 0, len = files.length; i < len; i++)
	             {
	               uris.append(URI.createPlatformResourceURI(files[i].getFullPath().toString(), true));
	               uris.append("  ");
	             }
	             uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
	           }
	           else

	           {
	             IFile file = null;

//	             if (isSave())
	             if(false)
	             {
	               file = WorkspaceResourceDialog.openNewFile(getShell(), null, null, null, null);
	             }
	             else
	             {
	               IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, false, null, null);
	               if (files.length != 0)
	               {
	                 file = files[0];
	               }
	             }
	             
	             if (file != null)
	             {
	               uriField.setText(URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
	             }

	           }

	         }
	       });      
	  }
*/
	protected void createAdvancedControl(Composite parent)
     {
        advancedButton = new Button(parent, SWT.PUSH);
		advancedButton.setText(IDEWorkbenchMessages.showAdvanced);
		GridData data = setButtonLayoutData(advancedButton);
		data.horizontalAlignment = GridData.BEGINNING;
		advancedButton.setLayoutData(data);
		advancedButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleAdvancedButtonSelect();
			}
		});
		createAdvancedComposite(parent);
	}
		
	protected void handleAdvancedButtonSelect() {
		if (compositeAdvanced.isVisible() != false) {
			compositeAdvanced.setVisible(false);
			advancedButton.setText(IDEWorkbenchMessages.showAdvanced);
		} else {
			compositeAdvanced.setVisible(true);
			advancedButton.setText(IDEWorkbenchMessages.hideAdvanced);
		}
	}
	
	private void createAdvancedComposite(Composite parent){
		compositeAdvanced = new Composite(parent, SWT.NONE);
		compositeAdvanced.setVisible(false);
		GridLayout advancedLayout = new GridLayout ();
		advancedLayout.numColumns = 2;
		compositeAdvanced.setLayout(advancedLayout);
		
		GridData gridData = new GridData();
		gridData.widthHint = 85;
/*			
			Button browseFileSystemButton = new Button(compositeAdvanced, SWT.PUSH);
	        browseFileSystemButton.setText(CommonUIPlugin.INSTANCE.getString("_UI_BrowseFileSystem_label"));
	        prepareBrowseFileSystemButton(browseFileSystemButton);
	        
	        Button browseWorkspaceButton = new Button(compositeAdvanced, SWT.PUSH);
	        browseWorkspaceButton.setText(CommonUIPlugin.INSTANCE.getString("_UI_BrowseWorkspace_label"));
	        prepareBrowseWorkspaceButton(browseWorkspaceButton);
*/	        
        new Label(compositeAdvanced,SWT.NONE).setText(ResourcesWizard.CONTINGENCY);
        contengencyCombo = new Combo(compositeAdvanced, SWT.DROP_DOWN);
        contengencyCombo.add(ResourcesWizard.CONTINGENCY_MANDATORY, CONTINGENCY_MANDATORY_INDEX);
        contengencyCombo.add(ResourcesWizard.CONTINGENCY_OPTIONAL, CONTINGENCY_OPTIONAL_INDEX);
        contengencyCombo.select(CONTINGENCY_MANDATORY_INDEX);
        contengencyCombo.setLayoutData(gridData);
        
        new Label(compositeAdvanced,SWT.NONE).setText(ResourcesWizard.COLLECTION);
        collectionCombo = new Combo(compositeAdvanced, SWT.DROP_DOWN);
        collectionCombo.add(ResourcesWizard.COLLECTION_FALSE, COLLECTION_FALSE_INDEX);
        collectionCombo.add(ResourcesWizard.COLLECTION_TRUE, COLLECTION_TRUE_INDEX);
        collectionCombo.select(COLLECTION_FALSE_INDEX);
        collectionCombo.setLayoutData(gridData);
        collectionCombo.addSelectionListener(new SelectionAdapter() {
        	public void widgetSelected(SelectionEvent e) {
        		handleCollectionSelect();
        	}
        });
        
		collectionLabel = new Label(compositeAdvanced, SWT.NONE);
		collectionLabel.setText(ResourcesWizard.COLLECTION_SIZE);
		collectionSize = new Text(compositeAdvanced, SWT.BORDER);
		collectionSize.setText("0");
		collectionSize.setLayoutData(gridData);
		collectionSize.addModifyListener(new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent e) {
				Text text = (Text)e.getSource();
				String collectionSizeValue = text.getText();
				for(int i = 0 ; i < collectionSizeValue.length() ; i++)
				{
					if(!((collectionSizeValue.charAt(i)>='0')
							&& (collectionSizeValue.charAt(i)<='9')))
					{
						String newString ;
						if(i==0)
							newString = (String) collectionSizeValue.subSequence(i+1, collectionSizeValue.length());
						else if(i==collectionSizeValue.length()-1)
							newString = (String) collectionSizeValue.subSequence(0, i);
						else
							newString = (String) collectionSizeValue.subSequence(0, i) + (String) collectionSizeValue.subSequence(i+1, collectionSizeValue.length());
						
						collectionSize.setText(newString);
					}
				}
			}
			
		});
		


		
		
		DisplayCollectionSizeItem(false);
	}
	
	private void handleCollectionSelect() {
		if(collectionCombo.getSelectionIndex()==COLLECTION_FALSE_INDEX)
		{
			DisplayCollectionSizeItem(false);
			collectionSize.setText("0");
		}
		else
		{
			DisplayCollectionSizeItem(true);
		}
	}
	

	private void DisplayCollectionSizeItem(boolean visible)
	{
		collectionLabel.setEnabled(visible);
		collectionSize.setEnabled(visible);
	}
	
	public String getInterfaceName()
	{
		if(interfaceNameText.getText() != null)
		{
			return interfaceNameText.getText();
		}
		else 
		{
			return null;
		}
	}
	
	public String getSignature()
	{
		if(uriField.getText() != null)
		{
			return uriField.getText();
		}
		else
		{
			return null;
		}
	}
			
	public boolean getOptional()
	{
		if(contengencyCombo.getSelectionIndex()==CONTINGENCY_OPTIONAL_INDEX)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean getCollection()
	{
		if(collectionCombo.getSelectionIndex()==COLLECTION_TRUE_INDEX)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public int getCollectionSize()
	{
		if(collectionCombo.getSelectionIndex()==COLLECTION_TRUE_INDEX)
		{
			return Integer.parseInt(collectionSize.getText());
		}
		else 
		{
			return 0;
		}
	}
	
}

	
