package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.wizard.Wizard;
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
import org.eclipse.ui.PlatformUI;

public class PrimitiveSecondPage extends WizardPage{

	Composite topLevel;
	Composite listComposite;
	
	
	Button addButton = null;
	Button modifyButton = null;
	Button removeButton = null;
	
	List listBox = null;
	
	
	protected PrimitiveSecondPage(String pageName) {
		super(pageName);
		setTitle(ResourcesWizard.PRIMITIVE_PAGE_TITLE);
		setDescription(ResourcesWizard.PRIMITIVE_PAGE_DESCRIPTION);
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
		
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.PRIMITIVE_SOURCE);
        new Label(topLevel,SWT.NONE);
        new Label(topLevel,SWT.NONE);
        
        addButton = new Button(topLevel, SWT.NONE);
        addButton.setText(ResourcesWizard.PRIMITIVE_ADD);
        
        modifyButton = new Button(topLevel, SWT.NONE);
        modifyButton.setText(ResourcesWizard.PRIMITIVE_MODIFY);
        
        removeButton = new Button(topLevel, SWT.NONE);
        removeButton.setText(ResourcesWizard.PRIMITIVE_REMOVE);
        
        listComposite = new Composite(topLevel, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			listComposite.setLayout(layout);
			listComposite.setVisible(true);
			listComposite.setFont(parent.getFont());

        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, true);
        	constraint.horizontalSpan = 3;
        	listComposite.setLayoutData(constraint);
		}
        listBox = new List(listComposite, SWT.BORDER);
        listBox.setLayoutData(listComposite.getLayoutData());
        
        createButtonListener();
	}

	private void createButtonListener() {

		addButton.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				listBox.add("test");
				AddElementWizard elementWizard = new AddElementWizard();
				WizardDialog wizDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), elementWizard);
				wizDialog.setBlockOnOpen(true);
				if(wizDialog.open() == WizardDialog.OK)
				{
					
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
				int a = 1;
				a = a * 1;
			}
			@Override
			public void mouseUp(MouseEvent e) {
			}
		});

		
	}

}
