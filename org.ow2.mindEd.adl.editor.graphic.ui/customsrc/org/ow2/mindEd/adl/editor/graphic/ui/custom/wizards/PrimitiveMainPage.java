package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.viewers.TreeViewer;
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

public class PrimitiveMainPage extends WizardPage{

	public String getPrimitiveName() {
		return primitiveName.getText();
	}

	public boolean isExtend() {
		return extendsButton.getSelection();
	}

	public boolean isOverride() {
		return overrideButton.getSelection();
	}

	public boolean isAnonymous() {
		return anonymousButton.getSelection();
	}
	
	public String getExtendPath(){
		return uriField.getText();
	}

	Composite topLevel;
	Composite treeComposite;
	
	Text primitiveName;
	
	Button extendsButton;
	Button overrideButton;
	Button anonymousButton;
	
	TreeViewer treeViewer;
	private int style = SWT.BORDER | SWT.SINGLE;
	protected Text uriField;
	
	protected final int HEIGHT_DATA = 200;
	protected final int WIDTH_DATA = 200;
	
	PrimitiveCreationWizard wizParent;
	
	protected PrimitiveMainPage(String pageName, PrimitiveCreationWizard parent) {
		super(pageName);
		setTitle(ResourcesWizard.PRIMITIVE_PAGE_TITLE);
		setDescription(ResourcesWizard.PRIMITIVE_PAGE_DESCRIPTION);
		wizParent = parent;
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
		
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.PRIMITIVE_NAME);
        primitiveName = new Text(topLevel,SWT.BORDER);
        {
        	primitiveName.setFont(parent.getFont());
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 2;
        	primitiveName.setLayoutData(constraint);
        	primitiveName.setFont(parent.getFont());
        }
        
        new Label(topLevel,SWT.NONE).setText(ResourcesWizard.PRIMITIVE_TYPE);
        
        
        extendsButton = new Button(topLevel, SWT.RADIO);
        {
        	GridData Constraint = new GridData();
            Constraint.horizontalAlignment = SWT.END;
            extendsButton.setLayoutData(Constraint);
        }
        Label extendsLabel = new Label(topLevel,SWT.NONE);
        extendsLabel.setText(ResourcesWizard.PRIMITIVE_EXTENDS);
        extendsLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				extendsButton.setSelection(true);
				overrideButton.setSelection(false);
				anonymousButton.setSelection(false);
				treeComposite.setVisible(true);
				wizParent.disableSecondPage();
			}
			@Override
			public void mouseUp(MouseEvent e) {}
        });
        
        
        overrideButton = new Button(topLevel, SWT.RADIO);
        Label overrideLabel = new Label(topLevel,SWT.NONE);
        overrideLabel.setText(ResourcesWizard.PRIMITIVE_OVERRIDE);
        overrideLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				overrideButton.setSelection(true);
				anonymousButton.setSelection(false);
				extendsButton.setSelection(false);
				treeComposite.setVisible(true);
				wizParent.enableSecondPage();
			}
			@Override
			public void mouseUp(MouseEvent e) {}
        });
        
        anonymousButton = new Button(topLevel, SWT.RADIO);
        Label anonymousLabel = new Label(topLevel,SWT.NONE);
        anonymousLabel.setText(ResourcesWizard.PRIMITIVE_ANONYMUS);
        anonymousLabel.addMouseListener(new MouseListener(){
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {
				anonymousButton.setSelection(true);
				overrideButton.setSelection(false);
				extendsButton.setSelection(false);
				treeComposite.setVisible(false);
				wizParent.enableSecondPage();
			}
			@Override
			public void mouseUp(MouseEvent e) {}
        });
        
        {
        	GridData constraint = new GridData();
            constraint.horizontalAlignment = SWT.END;
            constraint.horizontalSpan = 2;
            overrideButton.setLayoutData(constraint);
            anonymousButton.setLayoutData(constraint);
        }
        createRadioListener();
        
        createTreeComposite(topLevel);
		
	}

	private void createTreeComposite(Composite parent) {
		treeComposite = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			treeComposite.setLayout(layout);
        	treeComposite.setVisible(true);
        	treeComposite.setFont(parent.getFont());

        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, false);
        	constraint.horizontalSpan = 3;
        	treeComposite.setLayoutData(constraint);
        	
		}
		uriField = CreationTreeViewer.createTreeComposite(treeComposite, style, HEIGHT_DATA, ".adl");
	}

	private void createRadioListener() {
		
		extendsButton.addSelectionListener(new SelectionListener()		
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(extendsButton.getSelection())
				{
					treeComposite.setVisible(true);
					wizParent.disableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		overrideButton.addSelectionListener(new SelectionListener()		
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(overrideButton.getSelection())
				{
					treeComposite.setVisible(true);
					wizParent.enableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		anonymousButton.addSelectionListener(new SelectionListener()		
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(anonymousButton.getSelection())
				{
					treeComposite.setVisible(false);
					wizParent.enableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
	}

}
