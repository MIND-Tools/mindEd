package org.ow2.fractal.mind.ide.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.ow2.fractal.mind.ide.MindIdeBuilder;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.StaticJavaGenerator.InvalidCommandLineException;

public class BuildAction implements IObjectActionDelegate {
	private ISelection selection;

	public BuildAction() {
	}

	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element)
							.getAdapter(IProject.class);
				}
				if (project != null) {
					build(project);
				}
			}
		}
	}
	
	private void computeResolvedMindPath(MindProject mp, Set<MindObject> visited, Set<MindObject> path) {
		if (visited.contains(mp)) return;
		visited.add(mp);
		for (MindPathEntry mpe : mp.getMindpathentries()) {
			if (mpe.getEntryKind() == MindPathKind.SOURCE) {
				MindRootSrc mrs = (MindRootSrc) mpe.getResolvedBy();
				if (mrs != null) {
					path.add(mrs);
				}
			} else if (mpe.getEntryKind() == MindPathKind.PROJECT) {
				MindProject mp2 = (MindProject) mpe.getResolvedBy();
				if (mp2 != null) {
					computeResolvedMindPath(mp2, visited, path);
				}
			} else if (mpe.getEntryKind() == MindPathKind.IMPORT_PACKAGE) {
				MindPackage p = (MindPackage) mpe.getResolvedBy();
				MindRootSrc rs;
				MindProject mp2;
				if (p != null && ((rs = p.getRootsrc()) != null) && ((mp2 = rs.getProject()) != null)) {
					computeResolvedMindPath(mp2, visited, path);
				}
			}
		}
	}

	private void build(IProject project) {
		MindProject mp = MindIdeCore.get(project);
		if (mp == null) return;
		ArrayList<String> args = new ArrayList<String>();
		
		Set<MindObject> visited = new HashSet<MindObject>();
		Set<MindObject> path = new HashSet<MindObject>();
		computeResolvedMindPath(mp, visited, path);
		for (MindObject mo : path) {
			if (mo instanceof MindRootSrc) {
				IFolder f = MindIdeCore.getResource((MindRootSrc)mo);
				if (f.exists())
					args.add("-S="+f.getLocation().toOSString());
			}
		}
		args.add("-o="+project.getLocation().append("build").toOSString());
		args.add("--check-adl");
		
		for (MindFile mf : mp.getAllFiles()) {
			if (mf.eClass() == MindidePackage.Literals.MIND_ADL) {
				args.add(mf.getQualifiedName());
			}
		}
		
		System.out.println("Call mindc :");
		for (String a : args) {
			System.out.println("   "+a);
		}
		
		try {
			MindIdeBuilder.mindc((String[]) args.toArray(new String[args.size()]));
		} catch (InvalidCommandLineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ADLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
