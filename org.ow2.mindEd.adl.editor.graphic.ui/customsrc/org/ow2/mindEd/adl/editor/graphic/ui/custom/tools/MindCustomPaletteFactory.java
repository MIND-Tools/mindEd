package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.ow2.mindEd.adl.editor.graphic.ui.part.Messages;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindPaletteFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;


public class MindCustomPaletteFactory extends MindPaletteFactory {

	@Override
	protected ToolEntry createBinding2CreationTool() {
		BindingToolEntry entry = new BindingToolEntry(
				Messages.Binding2CreationTool_title,
				Messages.Binding2CreationTool_desc, Collections
						.singletonList(MindElementTypes.BindingDefinition_4003));
		entry.setId("createBindingCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.BindingDefinition_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		entry.setToolClass(BindingCreationTool.class);
		return entry;
	}
	
	
	protected static class BindingToolEntry extends ToolEntry {

		private final List<IElementType> relationshipTypes;

		private BindingToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		public Tool createTool() {
			Tool tool = new BindingCreationTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	
}
