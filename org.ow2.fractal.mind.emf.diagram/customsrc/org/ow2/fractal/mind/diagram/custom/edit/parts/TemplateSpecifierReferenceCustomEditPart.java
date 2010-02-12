package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;

import adl.diagram.edit.parts.TypeReferenceDefinition2EditPart;

public class TemplateSpecifierReferenceCustomEditPart extends
		TypeReferenceDefinition2EditPart {

	public TemplateSpecifierReferenceCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected NodeFigure createNodePlate() {
		//set default size
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 20);
		return result;
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			//no spacing anymore
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NoDragDropEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}

}
