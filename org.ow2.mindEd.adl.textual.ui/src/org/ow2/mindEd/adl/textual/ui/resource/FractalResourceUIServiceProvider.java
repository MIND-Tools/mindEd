/**
 * 
 */
package org.ow2.mindEd.adl.textual.ui.resource;

import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.DefaultResourceUIServiceProvider;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import com.google.inject.Inject;

/**
 * @author Stephane Seyvoz
 * This class is used to enforce ADL-specific behavior:
 * We wish to filter files to make Xtext handle only
 * those that belong to our MindEd source-paths.
 */
public class FractalResourceUIServiceProvider extends
		DefaultResourceUIServiceProvider {
	
	@Inject
	public FractalResourceUIServiceProvider(IResourceServiceProvider delegate) {
		super(delegate);
	}
	
	/**
	 * Tells whether the given URI together with the underlying {@link IStorage} can be handled by this {@link IResourceServiceProvider}
	 * ADL-specific behavior: We wish to filter files to make Xtext handle only
	 * those that belong to our MindEd source-paths.
	 * 
	 * Inspired from http://www.eclipse.org/forums/index.php/m/961828/
	 * 
	 * @param uri - might be null
	 * @param storage - might be null
	 * @return true if the URI and {@link IStorage} can be handled
	 */
	public boolean canHandle(URI uri, IStorage storage) {
		return belongsToMindPath(uri);
	}

	private boolean belongsToMindPath(URI uri) {
		// The file should be a MindFile if it's in the Mind source-path
		// One of the internal calls can raise an exception if the element is not in the path
		// TODO: fix this IllegalArgumentException throwing in the Core plug-in
		boolean result = false;
		try {
			result = (ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri) != null) ? true : null;
		} catch (IllegalArgumentException e) {
			result = false;
		}
		//System.out.println("[SSZ Dirty Debug] FractalResourceUIServiceProvider#belongsToMindPath - URI: " + uri.toPlatformString(true) + " is in path: " + result);
		return result;
	}
	
}
