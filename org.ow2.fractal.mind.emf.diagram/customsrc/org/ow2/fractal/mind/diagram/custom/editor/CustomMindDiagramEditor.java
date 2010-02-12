package org.ow2.fractal.mind.diagram.custom.editor;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.ow2.fractal.mind.diagram.custom.providers.MindCustomDocumentProvider;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;

import adl.diagram.part.MindDiagramEditor;

public class CustomMindDiagramEditor extends MindDiagramEditor {

	protected IDocumentProvider provider;
	
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (provider == null) setDocumentProvider(input);
		return provider;
	}
	
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			provider = new MindCustomDocumentProvider();
			setDocumentProvider(provider);
		} else {
			super.setDocumentProvider(input);
		}
	}
	
	@Override
	public void setInput(IEditorInput input) {
		ModelToProjectUtil.INSTANCE.setEditorInput(input);
		super.setInput(input);
	}
	
	public Object getAdapter(Class type) {
		if (type == IContentOutlinePage.class) {
			return null;
		}
		return super.getAdapter(type);
	}
}
