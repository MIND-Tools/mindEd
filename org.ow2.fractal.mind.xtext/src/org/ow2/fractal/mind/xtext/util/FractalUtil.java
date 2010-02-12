package org.ow2.fractal.mind.xtext.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;

import adl.ImportDefinition;

/**
 * Utility class for mind adl textual editor 
 * 
 * @author Damien Fournier
 * @contributor Rémi Mélisson
 * 
 */

public class FractalUtil {


	/**
	 * Clean import name
	 * 
	 * @param importDefinition
	 * @return
	 */

	public static String getImportPackageName(ImportDefinition importDefinition) {

		String packageName = importDefinition.getImportName();

		if (importDefinition.getImportName().endsWith(".*"))
			packageName = packageName.substring(0, packageName.length() - 2);

		return packageName;

	}
	

	/**
	 * Get the list of component simple names included into a package
	 * 
	 * @param packageName : name of the package we are looking into
	 * @param componentNames : list of all components name
	 * @return simple names of components
	 * 
	 */

	public static ArrayList<String> getComponentNamesFromPackage(
			String packageName, Collection<? extends MindAdl> components) {

		ArrayList<String> list = new ArrayList<String>();
		
		// + 1 because of the last dot before component name
		int packageLength = packageName.length() + 1;

		String componentName;
		for (MindAdl mindAdl : components) {
			componentName = mindAdl.getQualifiedName();
			if (componentName.startsWith(packageName))
				list.add(componentName.substring(packageLength, componentName
						.length()));
		}

		return list;
	}
	
	
	/**
	 * Extract the package name from a component FQN
	 * 
	 * @param fQN represent the component fully qualified name
	 * @return the name of the package
	 */
	
	public static String getPackageNameFromFQN(String fQN){		
		int index = fQN.lastIndexOf('.');		
		return fQN.substring(0, index);
	}
	
	public static String getSimpleNameFromFQN(String fQN){
		int index = fQN.lastIndexOf('.');
		return fQN.substring(index + 1);
	}
	
	/**
	 * 
	 * Convert prefixed component names to simple name according to imports
	 * 
	 * @param list of components we want to convert
	 * @param list of imports 
	 * @return list of components no more prefixed with package name
	 */
	public static HashSet<String> convertFQNToSimpleNamesAccordingToImports(Collection<? extends MindAdl> components, HashSet<String> imports){
		HashSet<String> list = new HashSet<String>();
		
		String componentName;
		String packageName;
				
		for (MindAdl mindAdl : components){
			componentName = mindAdl.getQualifiedName();
			packageName = FractalUtil.getPackageNameFromFQN(componentName);

			// if component or package has been imported 
			if (imports.contains(packageName) || imports.contains(componentName)){
				// we add the reduced proposition
				list.add(FractalUtil.getSimpleNameFromFQN(componentName));
			}
			// else we add the entire name
			else {
				list.add(componentName);
			}
		}
		
		return list;
	}

}
