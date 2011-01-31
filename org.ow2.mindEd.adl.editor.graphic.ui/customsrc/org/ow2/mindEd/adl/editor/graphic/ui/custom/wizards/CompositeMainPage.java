package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import java.util.ArrayList;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class CompositeMainPage extends WizardPage{

	Composite topLevel;
	Composite listComposite;
	
	Text compositeName;
	
	Button addButton;
	Button modifyButton;
	Button removeButton;
	
	List listBox;
	
	
	protected CompositeMainPage(String pageName) {
		super(pageName);
		this.setTitle("Creation Composite Component");
		this.setDescription("Assistant to create a new Composite Component.");
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
		}
		
		new Label(topLevel,SWT.NONE).setText("Name");
        compositeName = new Text(topLevel,SWT.BORDER);
        {
        	compositeName.setFont(parent.getFont());
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 2;
        	compositeName.setLayoutData(constraint);
        	compositeName.setFont(parent.getFont());
        }
        
        Label labelExtends = new Label (topLevel,SWT.NONE);
        labelExtends.setText("Extends");
        {
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 3;
        	labelExtends.setLayoutData(constraint);
        }
        
        createExtendsButton();
        
        createButtonListener();
		
	}

	private void createButtonListener() {

		addButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				AddElementWizard elementWizard = new AddElementWizard(null, AddElementWizard.TYPES.EXTENDS);
				WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), elementWizard);
				wizDialog.setBlockOnOpen(true);
				if(wizDialog.open() == WizardDialog.OK)
				{
					ImplementationInformation implInfotmation = elementWizard.getImplementationInformation();
					
					if(implInfotmation.isFile())
					{
						String[] tabImpl = listBox.getItems();
						ArrayList<String> listImpl = new ArrayList<String>();
							
						for(String impl : tabImpl)
						{
							listImpl.add(impl);
						}
						if(!listImpl.contains(implInfotmation.getFilePath()))
							listBox.add(implInfotmation.getFilePath());
					}
					else if(implInfotmation.isInline())
					{
						listBox.add(implInfotmation.getInlineText());
					}
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {}
		});
		
		removeButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				int listIndex[] = listBox.getSelectionIndices();
				if(listIndex.length != 0)
				{
					listBox.remove(listIndex);
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {
			}
		});
		
		modifyButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				int listIndex[] = listBox.getSelectionIndices();
				if(listIndex.length != 0)
				{
					for(int i : listIndex)
					{
						AddElementWizard elementWizard = new AddElementWizard(listBox.getItem(i),AddElementWizard.TYPES.EXTENDS);
						WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), elementWizard);
						wizDialog.setBlockOnOpen(true);
						if(wizDialog.open() == WizardDialog.OK)
						{
							listBox.remove(i);
							ImplementationInformation implInfotmation = elementWizard.getImplementationInformation();
							
							if(implInfotmation.isFile())
							{
								String[] tabImpl = listBox.getItems();
								ArrayList<String> listImpl = new ArrayList<String>();
									
								for(String impl : tabImpl)
								{
									listImpl.add(impl);
								}
								if(!listImpl.contains(implInfotmation.getFilePath()))
									listBox.add(implInfotmation.getFilePath());
							}
							else if(implInfotmation.isInline())
							{
								listBox.add(implInfotmation.getInlineText());
							}
						}
					}
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {
			}
		});

		
	}

	private void createExtendsButton() {
		
		addButton = new Button(topLevel, SWT.NONE);
		addButton.setText("Add");
		
		modifyButton = new Button(topLevel, SWT.NONE);
		modifyButton.setText("Modify");
		
		removeButton = new Button(topLevel, SWT.NONE);
		removeButton.setText("Remove");
		
		listComposite = new Composite(topLevel, SWT.NONE);
		{
			GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	listComposite.setLayoutData(constraint);
			
			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			listComposite.setLayout(layout);
			listComposite.setFont(topLevel.getFont());
		}
		
		listBox = new List(listComposite, SWT.BORDER | SWT.WRAP);
        listBox.setLayoutData(listComposite.getLayoutData());
	}

}
