package org.ow2.fractal.mind.emf.diagram.custom.tools;

import adl.diagram.part.MindPaletteFactory;

/**
 * @deprecated
 * Use plugin.xml to add or override a tool
 * @author maroto
 *
 */
public class MindCustomPaletteFactory extends MindPaletteFactory {

//	@Override
//	protected ToolEntry createBindingCreationTool() {
//		BindingToolEntry entry = new BindingToolEntry(
//				Messages.BindingCreationTool_title,
//				Messages.BindingCreationTool_desc, Collections
//						.singletonList(MindElementTypes.BindingDefinition_4003));
//		entry.setId("createBindingCreationTool"); //$NON-NLS-1$
//		entry.setSmallIcon(MindElementTypes
//				.getImageDescriptor(MindElementTypes.BindingDefinition_4003));
//		entry.setLargeIcon(entry.getSmallIcon());
//		entry.setToolClass(BindingCreationTool.class);
//		return entry;
//	}
//	
//	
//	protected static class BindingToolEntry extends ToolEntry {
//
//		private final List<IElementType> relationshipTypes;
//
//		private BindingToolEntry(String title, String description,
//				List<IElementType> relationshipTypes) {
//			super(title, description, null, null);
//			this.relationshipTypes = relationshipTypes;
//		}
//
//		public Tool createTool() {
//			Tool tool = new BindingCreationTool(relationshipTypes);
//			tool.setProperties(getToolProperties());
//			return tool;
//		}
//	}
	
}
