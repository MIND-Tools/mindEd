package org.ow2.mindEd.adl.textual.ui.navigation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.util.TextLocation;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.custom.impl.AdlDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.textual.util.FractalUtil;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindItf;

public class FractalHyperlink extends HyperlinkHelper {
	
    @Override
    public void createHyperlinksByOffset(XtextResource resource, int offset,
            IHyperlinkAcceptor acceptor) {

        super.createHyperlinksByOffset(resource, offset, acceptor);
        
        TextLocation loc = new TextLocation();
        EObject eObject = EObjectAtOffsetHelper.resolveElementAt(resource, offset, loc);
        
        URI uri = null;
        
        // case of a component reference
        if ( (eObject instanceof CompositeReferenceDefinitionCustomImpl) ||
        	 (eObject instanceof TypeReferenceDefinitionCustomImpl) ||
        	 (eObject instanceof PrimitiveReferenceDefinitionCustomImpl)
        	){
        	
        	ComponentReference ref = (ComponentReference) eObject;
            		        	
            String fQN = ref.getNameFQN();
            TreeIterator<EObject> tree = resource.getAllContents();
            EObject object = tree.next();
            
            if (object instanceof AdlDefinitionCustomImpl){
            	EList<ImportDefinition> imports = ((AdlDefinitionCustomImpl) object).getImports();
            	
            	EList<String> importsString = FractalUtil.transformImports(imports);
                                
                uri = ModelToProjectUtil.INSTANCE.resolveAdl(fQN, importsString);
            }
        }
        // case of interface definition (both required and provided)
        else if (eObject instanceof InterfaceDefinitionCustomImpl){
        	InterfaceDefinitionCustomImpl interfaceDefinition = (InterfaceDefinitionCustomImpl) eObject;
        	
        	String signature = interfaceDefinition.getSignature();        	
        	
    		// Retrieve architecture definition from interface definition
    		ArchitectureDefinition architectureDefinition = FractalUtil
    				.getArchitecureDefinitionFromChild(interfaceDefinition);

    		// Get FQN
    		signature = FractalUtil.getInterfaceFQNFromPartialName(
    				architectureDefinition, signature);
    		
    		
        	EList<ImportDefinition> imports = architectureDefinition.getParentAdlDefinition().getImports();
        	
        	EList<String> importsString = FractalUtil.transformImports(imports);
    		
    		// Find corresponding Mind Itf 
    		MindItf itf = ModelToProjectUtil.INSTANCE.getMindItf(signature, importsString);
    		if (itf != null)
    			uri = URI.createPlatformResourceURI(itf.getFullpath());
        }
        
        // Reference on the project model
        //private MindModelManager mindModel = MindModelManager.getMindModelManager();       
        
        //if (eObject instanceof PrimitiveReferenceDefinitionCustomImpl) 
        
        /*
        Collection<? extends MindAdl> components = mindModel.getMindModel().getAllComponents();

        for (MindAdl component : components) {
        	
        if (component.getQualifiedName().equals(ref.getNameFQN())) {
        	 
        EList<ImportDefinition> imports = resource.getImports();
        EList<String> importsString = new BasicEList<String>();
        
        for (ImportDefinition id : imports){
        	importsString.add(id.getImportName());
        }
        
        URI uri = ModelToProjectUtil.INSTANCE.resolveAdl(fQN, importsString);
        
        XtextHyperlink hyperlink = getHyperlinkProvider().get();
        hyperlink.setURI(uri);
        
    	//}
        */               
        
        if (uri != null ){
        	// here we create the link
        	
        	XtextHyperlink hyperlink = getHyperlinkProvider().get();
        	hyperlink.setURI(uri);
        	hyperlink.setHyperlinkRegion(new Region(loc.getOffset(), loc.getLength()));
        	
        	acceptor.accept(hyperlink);
        }        

    }
}
