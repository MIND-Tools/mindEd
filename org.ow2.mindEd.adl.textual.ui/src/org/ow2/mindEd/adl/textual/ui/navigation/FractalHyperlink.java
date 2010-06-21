package org.ow2.mindEd.adl.textual.ui.navigation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.util.TextLocation;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.custom.impl.AdlDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

public class FractalHyperlink extends HyperlinkHelper {

    // Reference on the project model
    //private MindModelManager mindModel = MindModelManager.getMindModelManager();

    
    @Override
    public void createHyperlinksByOffset(XtextResource resource, int offset,
            IHyperlinkAcceptor acceptor) {

        super.createHyperlinksByOffset(resource, offset, acceptor);

        TextLocation loc = new TextLocation();

        EObject eObject = EObjectAtOffsetHelper.resolveElementAt(resource, offset, loc);

        if (eObject instanceof CompositeReferenceDefinitionCustomImpl) {
            CompositeReferenceDefinitionCustomImpl ref = (CompositeReferenceDefinitionCustomImpl) eObject;

            //Collection<? extends MindAdl> components = mindModel.getMindModel().getAllComponents();

            //for (MindAdl component : components) {
            	
            	//if (component.getQualifiedName().equals(ref.getNameFQN())) {
            		
            String fQN = ref.getNameFQN();
            TreeIterator<EObject> tree = resource.getAllContents();
            EObject object = tree.next();
            
            if (object instanceof AdlDefinitionCustomImpl){
            	EList<ImportDefinition> imports = ((AdlDefinitionCustomImpl) object).getImports();
            	
            	EList<String> importsString = new BasicEList<String>();
                
                for (ImportDefinition id : imports){
                	importsString.add(id.getImportName());
                }
                
                URI uri = ModelToProjectUtil.INSTANCE.resolveAdl(fQN, importsString);
                
                XtextHyperlink hyperlink = getHyperlinkProvider().get();
                hyperlink.setURI(uri);
                
                acceptor.accept(hyperlink);
            }
            /*
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
            

        }

    }
}
