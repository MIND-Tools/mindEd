package org.ow2.mindEd.ide.core.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.envvar.IEnvironmentVariable;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.COutputEntry;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICOutputEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.cdt.core.settings.model.WriteAccessException;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.internal.core.envvar.EnvironmentVariableManager;
import org.eclipse.cdt.internal.core.envvar.UserDefinedEnvironmentSupplier;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.utils.envvar.StorableEnvironment;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.ow2.mindEd.ide.core.FamilyJobCST;
import org.ow2.mindEd.ide.core.MindActivator;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.core.MindNature;
import org.ow2.mindEd.ide.core.mindc.MindcErrorParser;
import org.ow2.mindEd.ide.core.template.TemplateMake;
import org.ow2.mindEd.ide.model.MindProject;

public class CDTUtil {


	private static final class RemoveCSourceFolderJob extends Job {
		private final IFolder f;

		private RemoveCSourceFolderJob(IFolder f) {
			super("remove CSource folder "+f.getFullPath());
			this.f = f;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("REMOVE? CSOURCE FOLDER " + f);
				final ICProjectDescriptionManager mgr = CoreModel
						.getDefault().getProjectDescriptionManager();
				final ICProjectDescription des = mgr.getProjectDescription(
						f.getProject(), true);
				if (des == null)
					return Status.OK_STATUS; // Not C project pas encore ou enlever

				ICConfigurationDescription config = des
						.getConfigurationByName("Default");
				ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(
						Arrays.asList(config.getSourceEntries()));
				for (ICSourceEntry icSourceEntry : srcs) {
					if (!f.getProject().isOpen()
							|| !f.getProject().exists())
						return Status.OK_STATUS;
					if (icSourceEntry.getFullPath().equals(f.getFullPath())) {
						if (MindModelImpl.TRACING)
							System.out.println("REMOVING CSOURCE FOLDER "
									+ f);
						srcs.remove(icSourceEntry);
						config.setSourceEntries((ICSourceEntry[]) srcs
								.toArray(new ICSourceEntry[srcs.size()]));
						if (!f.getProject().exists())
							return Status.OK_STATUS;
						mgr.setProjectDescription(f.getProject(), des);
						if (MindModelImpl.TRACING)
							System.out
							.println("DONE REMOVE CSOURCE FOLDER "
									+ f);
						return Status.OK_STATUS;
					}
				}
			} catch (CoreException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}

		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_REMOVE_CSOURCE_FOLDER == family;
		}
	}

	private static final class CreateCSourceFolderJob extends Job {
		private final IFolder f;

		private CreateCSourceFolderJob(IFolder f) {
			super("Create CSource folder for "+f.getFullPath());
			this.f = f;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("CREATE? CSOURCE FOLDER " + f);
				ICProjectDescriptionManager mgr = CoreModel.getDefault()
						.getProjectDescriptionManager();
				ICProjectDescription des = mgr.getProjectDescription(f
						.getProject(), true);
				if (des == null)
					return Status.OK_STATUS; // Not C project pas encore ou enlever
				ICSourceEntry srcEntry = new CSourceEntry(f, null,
						ICSettingEntry.VALUE_WORKSPACE_PATH);
				ICConfigurationDescription config = des
						.getConfigurationByName("Default");
				ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(
						Arrays.asList(config.getSourceEntries()));
				for (ICSourceEntry icSourceEntry : srcs) {
					if (icSourceEntry.getFullPath().equals(f.getFullPath()))
						return Status.OK_STATUS;
				}
				if (MindModelImpl.TRACING)
					System.out.println("CREATING CSOURCE FOLDER " + f);
				srcs.add(srcEntry);
				config.setSourceEntries((ICSourceEntry[]) srcs
						.toArray(new ICSourceEntry[srcs.size()]));
				mgr.setProjectDescription(f.getProject(), des);
				if (MindModelImpl.TRACING)
					System.out.println("DONE CREATE CSOURCE FOLDER " + f);
			} catch (WriteAccessException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			} catch (CoreException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}

		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CREATE_CSOURCE_FOLDER == family;
		}
	}

	private static final class ChangeMindcLocation extends Job {
		private final String mindcLocation;

		private ChangeMindcLocation(String mindcLocation) {
			super("Change the MINDC Location: create variable MIND_ROOT in CDT");
			this.mindcLocation = mindcLocation;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("CHANGE MIND_ROOT to "
							+ mindcLocation);
				UserDefinedEnvironmentSupplier usersupplier = EnvironmentVariableManager.fUserSupplier;
				StorableEnvironment wsEnv = usersupplier
						.getWorkspaceEnvironmentCopy();
				IEnvironmentVariable var = wsEnv.getVariable(MIND_ROOT);
				if (var != null) {
					wsEnv.deleteVariable(MIND_ROOT);
				}
				wsEnv.createVariable(MIND_ROOT, mindcLocation);
				usersupplier.setWorkspaceEnvironment(wsEnv);
				MindIdeCore.rebuidAll();
				if (MindModelImpl.TRACING)
					System.out.println("DONE CHANGING MIND_ROOT to "
							+ mindcLocation);

			} catch (WriteAccessException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}


		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CHANGE_MINDC_LOCATION == family;
		}
	}

	private static final class ChangeMindcRuntimeLocation extends Job {
		private final String mindcRuntimeLocation;

		private ChangeMindcRuntimeLocation(String mindcRuntimeLocation) {
			super("Change the runtime folders location in every concerned project");
			this.mindcRuntimeLocation = mindcRuntimeLocation;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("CHANGE RUNTIME FOLDERS LINK DESTINATION to "
							+ mindcRuntimeLocation);

				List<MindProject> allMindProjects = MindIdeCore.getModel().getAllProject();
				for (MindProject currProject : allMindProjects) {
					if (mindcRuntimeLocation == null) {
						MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "\"Runtime\" linked folder could not be created, set mindc location in preference"));
					} else {
						// is a "folder" but File is the Java way :)
						File mindRuntimeFile = new File(mindcRuntimeLocation);
						if (!mindRuntimeFile.exists()) {
							MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Mindc location subfolder \"Runtime\" doesn't exist !"));
							continue;
						}

						// get the IProject runtime
						IFolder eclipseRuntimeFolder = currProject.getProject().getFolder("runtime");

						// Only redefine the folder link destination if it's a link
						// otherwise we would crush possibly hand-made local (not linked) runtimes.
						if (eclipseRuntimeFolder.exists() && eclipseRuntimeFolder.isLinked())
							eclipseRuntimeFolder.createLink(new Path(mindRuntimeFile.getAbsolutePath()), IResource.REPLACE, monitor);
					}
				}

				// Why not
				MindIdeCore.rebuidAll();
				if (MindModelImpl.TRACING)
					System.out.println("DONE CHANGING RUNTIME FOLDERS LINK DESTINATION to "
							+ mindcRuntimeLocation);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Status.OK_STATUS;
		}


		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CHANGE_MINDC_RUNTIME_LOCATION == family;
		}
	}

	private static final String MIND_ROOT = "MIND_ROOT";

	public static void createCSourceFolder(final IFolder f)
			throws CoreException {
		Job r = new CreateCSourceFolderJob(f);
		r.setRule(f.getWorkspace().getRoot());
		r.schedule();
	}

	public static void removeCSourceFolder(final IFolder f)
			throws CoreException {
		if (!f.getProject().isOpen() || !f.getProject().exists())
			return;

		Job r = new RemoveCSourceFolderJob(f);
		r.setRule(f.getWorkspace().getRoot());
		r.schedule();
	}

	public static void changeMINDCLocation(final String mindcLocation) {
		// Changing MIND_ROOT in the environment
		Job rMindc = new ChangeMindcLocation(mindcLocation);
		rMindc.setRule(ResourcesPlugin.getWorkspace().getRoot());
		rMindc.schedule();

		// Changing runtime linked folders destination
		Job rRuntime = new ChangeMindcRuntimeLocation(mindcLocation + File.separator + "runtime");
		rRuntime.setRule(ResourcesPlugin.getWorkspace().getRoot());
		rRuntime.schedule();
	}

	public static String getMINDCLocation() {
		UserDefinedEnvironmentSupplier usersupplier = EnvironmentVariableManager.fUserSupplier;
		StorableEnvironment wsEnv = usersupplier.getWorkspaceEnvironmentCopy();
		IEnvironmentVariable var = wsEnv.getVariable(MIND_ROOT);
		if (var != null) {
			return var.getValue();
		}
		return null;
	}

	/**
	 * Initialize a mind project. Do not call this method.
	 * 
	 * @param newProject
	 *            create project
	 * @param monitor
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	public static void initMindProject(IProject newProject,
			IProgressMonitor monitor) throws CoreException,
			UnsupportedEncodingException {

		// create first
		IFile makefile = newProject.getFile("Makefile");
		if (!makefile.exists())
			makefile.create(
					new ByteArrayInputStream(createMakeTemplate(newProject)), true,
					monitor);

		// add nature
		CProjectNature.addNature(newProject, CProjectNature.C_NATURE_ID,
				monitor);
		CProjectNature.addNature(newProject, "org.eclipse.xtext.ui.shared.xtextNature",
				monitor);

		CProjectNature.addNature(newProject, MindNature.NATURE_ID, monitor);



		// Create the default structure
		IFolder buildFolder = newProject.getFolder("build");
		if (!buildFolder.exists())
			buildFolder.create(true, true, monitor);
		IFolder srcFolder = newProject.getFolder("src");
		if (!srcFolder.exists())
			srcFolder.create(true, true, monitor);

		// Link the runtime folder to the compiler runtime from the Mindc location variable (in preference store)
		String mindLocation = MindActivator.getPref().getMindCLocation();
		if (mindLocation == null) {
			MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "\"Runtime\" linked folder could not be created, set mindc location in preference"));
		} else {
			// is a "folder" but File is the Java way :)
			File mindRuntimeFile = new File(mindLocation + "/runtime");

			IFolder runtimeFolder = newProject.getFolder("runtime");
			if (mindRuntimeFile.exists() && !runtimeFolder.exists())
				runtimeFolder.createLink(new Path(mindRuntimeFile.getAbsolutePath()), IResource.ALLOW_MISSING_LOCAL, monitor);
		}
		// end runtime folder

		// Set CDT information
		ICProjectDescriptionManager mgr = CoreModel.getDefault()
				.getProjectDescriptionManager();
		ICProjectDescription des = mgr.getProjectDescription(newProject, true);

		// get default path and set it's
		try {
			MindModelManager.getMindModelManager().getMindModel().init(
					newProject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (des != null)
			return; // C project description already exists

		des = mgr.createProjectDescription(newProject, true);

		IManagedBuildInfo info = ManagedBuildManager.createBuildInfo(newProject);

		ManagedProject mProj = new ManagedProject(des);
		info.setManagedProject(mProj);

		String id = ManagedBuildManager.calculateChildId(
				"org.ow2.mindEd.ide.core.build", null);
		Configuration config = new Configuration(mProj, null, id, "Default");

		IBuilder bld = config.getEditableBuilder();
		if (bld != null) {
			// It's make (not eclipse)
			bld.setManagedBuildOn(false);
			// The makefile is in the project root
			bld.setBuildPath("${workspace_loc:/" + newProject.getName() + "}");

			// the build directory ('build')
			ICOutputEntry buildEntry = new COutputEntry(buildFolder, null,
					ICSettingEntry.VALUE_WORKSPACE_PATH);
			bld.getBuildData().setOutputDirectories(
					new ICOutputEntry[] { buildEntry });
			bld.getBuildData();
		}
		// the name of this configuration is Default

		config.setName("Default");
		config.setArtifactName(newProject.getName());

		// Create a source entries ArrayList
		List<ICSourceEntry> sourceEntries = new ArrayList<ICSourceEntry>();

		// ADD the source entry 'src'
		ICSourceEntry srcEntry = new CSourceEntry(newProject.getFolder("src"),
				null, ICSettingEntry.VALUE_WORKSPACE_PATH);
		sourceEntries.add(srcEntry);

		// ADD the source entry 'runtime'
		if (mindLocation != null) {
			ICSourceEntry runtimeEntry = new CSourceEntry(newProject.getFolder("runtime"),
					null, ICSettingEntry.VALUE_WORKSPACE_PATH);
			sourceEntries.add(runtimeEntry);
		}

		// convert the List to good-sized typed array
		config.setSourceEntries(sourceEntries.toArray(new ICSourceEntry[sourceEntries.size()]));
		config.exportArtifactInfo();

		CConfigurationData data = config.getConfigurationData();
		data.getBuildData();

		des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);

		// add the Mindc error parser to the project defaults
		String[] defaultErrorParserListArray = config.getErrorParserList();
		List<String> defaultErrorParserList = new ArrayList<String>(Arrays.asList(defaultErrorParserListArray));
		// See plugin.xml extension MindcErrorParser (we're in project org.ow2.mindEd.ide)
		defaultErrorParserList.add("org.ow2.mindEd.ide.MindcErrorParser");
		config.setErrorParserList(defaultErrorParserList.toArray(new String[defaultErrorParserList.size()]));

		// ADD CPL Macro settings
		ICConfigurationDescription cfgDes = des.getConfigurationById(id);
		Set<String> settingProviders = new HashSet<String>(Arrays.asList(cfgDes.getExternalSettingsProviderIds())); 

		settingProviders.add(CPLMacroSettings.ID);
		cfgDes.setExternalSettingsProviderIds(settingProviders.toArray(new String[settingProviders.size()]));

		mgr.setProjectDescription(newProject, des);


	}

	/**
	 * The default template for makefile
	 * 
	 * @param newProject2
	 *            the project where put the make file
	 * @return The make file.
	 * @throws UnsupportedEncodingException
	 *             (Cannot find the default charset)
	 * @throws CoreException
	 *             (Cannot find the default charset)
	 */
	protected static byte[] createMakeTemplate(IProject newProject2)
			throws UnsupportedEncodingException, CoreException {
		return (new TemplateMake().generate(newProject2)).getBytes(newProject2
				.getDefaultCharset());
	}
}
