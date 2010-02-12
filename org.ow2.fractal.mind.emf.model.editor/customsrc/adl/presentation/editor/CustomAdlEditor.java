package adl.presentation.editor;

import org.eclipse.ui.IEditorInput;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;

import adl.presentation.AdlEditor;

public class CustomAdlEditor extends AdlEditor {
	
	@Override
	public void setInput(IEditorInput input) {
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		super.setInput(input);
	}

}
