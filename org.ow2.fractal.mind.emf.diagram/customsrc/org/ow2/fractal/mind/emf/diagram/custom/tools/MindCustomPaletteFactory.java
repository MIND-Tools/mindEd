package org.ow2.fractal.mind.emf.diagram.custom.tools;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import adl.diagram.part.Messages;
import adl.diagram.part.MindPaletteFactory;
import adl.diagram.providers.MindElementTypes;


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
