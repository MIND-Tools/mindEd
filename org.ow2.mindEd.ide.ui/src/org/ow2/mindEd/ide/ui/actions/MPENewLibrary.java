/**
 * 
 */
package org.ow2.mindEd.ide.ui.actions;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ide.dialogs.PathVariableSelectionDialog;
import org.ow2.mindEd.ide.core.impl.MindPathEntryCustomImpl;
import org.ow2.mindEd.ide.edit.provider.MindIDEEditPlugin;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindideFactory;
import org.ow2.mindEd.ide.ui.properties.MindMPETreeViewer;
import org.ow2.mindEd.ide.ui.properties.MpeMindPathModel;

/**
 * It's an action which create a mind path entry of kind project reference.
 */
public final class MPENewLibrary extends MPEAction {
	public MPENewLibrary(Shell shell, MindProject p, MpeMindPathModel model) {
		super("New library entry", ExtendedImageRegistry.getInstance().getImageDescriptor(
				MindIDEEditPlugin.INSTANCE.getImage("full/obj16/MindProject-mpe")), shell, p, model);
	}

	@Override
	public void run() {
		PathVariableSelectionDialog dialog 
		     = new PathVariableSelectionDialog(getShell(), IResource.FOLDER|IResource.FILE);
		dialog.setTitle("Library entry");
		dialog.setMessage("Library entry");
		int responce = dialog.open();
		if (responce == Window.OK) {
			String[] result = (String[]) dialog.getResult();
			MindPathEntry mpe = null;
			if (mpe == null) {
				mpe = MindideFactory.eINSTANCE
						.createMindPathEntry();
				mpe.setEntryKind(MindPathKind.LIBRARY);
				mpe.setName(result[0]);
				_model.mpeAdded(mpe);
			} else {
				mpe.setName(result[0]);
				_model.mpeChanged(mpe);
			}
		}
	}
}