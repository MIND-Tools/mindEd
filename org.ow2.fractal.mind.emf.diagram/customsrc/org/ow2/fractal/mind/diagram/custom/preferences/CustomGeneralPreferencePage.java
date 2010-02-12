package org.ow2.fractal.mind.diagram.custom.preferences;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.ow2.fractal.mind.diagram.custom.edit.commands.MindDiagramUpdateAllCommand;

import adl.diagram.preferences.DiagramGeneralPreferencePage;

public class CustomGeneralPreferencePage extends DiagramGeneralPreferencePage {
	
	private static String CUSTOM_SETTINGS_GROUP_LABEL = "Custom";
	public static String PREF_DISPLAY_DEPTH_LEVEL = "Global.displayDepthLevel";
	private static String DISPLAY_DEPTH_LEVEL_LABEL = "Max depth level to display : ";
	
	private IntegerFieldEditor displayDepthLevel = null;
	
	
	protected void addFields(Composite parent) {

		super.addFields(parent);
		
		Group generalGlobalGroup = new Group(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		generalGlobalGroup.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;
		generalGlobalGroup.setLayoutData(gridData);
		generalGlobalGroup.setText(CUSTOM_SETTINGS_GROUP_LABEL);

		Composite composite = new Composite(generalGlobalGroup, SWT.NONE);	
		
		displayDepthLevel = new IntegerFieldEditor(
				PREF_DISPLAY_DEPTH_LEVEL,
				DISPLAY_DEPTH_LEVEL_LABEL,
				composite,
				2);
		displayDepthLevel.getTextControl(composite).setLayoutData(new GridData(15,-1));
		displayDepthLevel.setValidRange(1, 99);
		addField(displayDepthLevel);
	}
	
	/**
	 * Initializes the default preference values for this preference store.
	 * 
	 * @param IPreferenceStore preferenceStore
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {

		preferenceStore.setDefault(IPreferenceConstants.PREF_SHOW_CONNECTION_HANDLES, true);

		preferenceStore.setDefault(IPreferenceConstants.PREF_SHOW_POPUP_BARS, true);
	
		preferenceStore.setDefault(IPreferenceConstants.PREF_ENABLE_ANIMATED_LAYOUT, true);

		preferenceStore.setDefault(IPreferenceConstants.PREF_ENABLE_ANIMATED_ZOOM, true);
		
		preferenceStore.setDefault(IPreferenceConstants.PREF_ENABLE_ANTIALIAS, true);	

		preferenceStore.setDefault(IPreferenceConstants.PREF_SHOW_STATUS_LINE, true);	
		
		preferenceStore.setDefault(PREF_DISPLAY_DEPTH_LEVEL, 5);
	}
	
	/**
     * The field editor preference page implementation of this <code>IPreferencePage</code>
     * (and <code>IPropertyChangeListener</code>) method intercepts <code>IS_VALID</code> 
     * events but passes other events on to its superclass.
     */
    public void propertyChange(PropertyChangeEvent event) {
    	super.propertyChange(event);
    	if (event.getSource() instanceof FieldEditor &&
    			((FieldEditor)event.getSource()).getPreferenceName().equals(PREF_DISPLAY_DEPTH_LEVEL)) {
    		MindDiagramUpdateAllCommand cmd = new MindDiagramUpdateAllCommand();
    		try {
				cmd.execute(new ExecutionEvent());
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    }

}
