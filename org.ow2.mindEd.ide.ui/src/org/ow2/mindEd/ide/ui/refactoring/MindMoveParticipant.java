package org.ow2.mindEd.ide.ui.refactoring;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.ow2.mindEd.ide.core.impl.MindModelImpl;

public class MindMoveParticipant extends MoveParticipant {

	/**
	 * This class implements the MoveParticipant specified as an extension point
	 * in the org.ow2.mindEd.ide.ui/plugin.xml file.
	 */
	
	@Override
	public RefactoringStatus checkConditions(IProgressMonitor arg0,
			CheckConditionsContext arg1) throws OperationCanceledException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor arg0) throws CoreException,
			OperationCanceledException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean initialize(Object arg0) {
		
		// Folders not yet handled
		
		// what are the different cases ? and we want to handle only ADL/ITF files and keep the standard behavior otherwise
		if (arg0 instanceof File)
			if (MindModelImpl.TRACING)
				System.out.println("ide.ui.MindMoveParticipant#initialize: A Move action had been triggered on File:" + ((File) arg0).toString());
		else if (arg0 instanceof Folder)
			if (MindModelImpl.TRACING)
				System.out.println("ide.ui.MindMoveParticipant#initialize: A Move action had been triggered on Folder: " + ((Folder) arg0).toString());
		else
			if (MindModelImpl.TRACING)
				System.out.println("ide.ui.MindMoveParticipant#initialize: Trying to Move a non-supported element: " + arg0.toString());
		
		return false;
	}

}
