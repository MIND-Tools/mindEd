package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;

import adl.diagram.edit.parts.FileCDirectoryFileNameEditPart;
import adl.diagram.edit.parts.FileCEditPart;


/** 
 * This is a reference to a .c file, contained in a DataDefinition or an ImplementationDefinition
 * @author maroto
 *
 */

public class FileCCustomEditPart extends
		FileCEditPart {
	
	public FileCCustomEditPart(View view) {
		super(view);
	}
	
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// To open the c file on double clic
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FileCDirectoryFileNameEditPart) {
			((FileCDirectoryFileNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLabelFileCFigure());
			// To open the c file on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
					new OpenDefinitionEditPolicy());
			return true;
		}
		return false;
	}

}
