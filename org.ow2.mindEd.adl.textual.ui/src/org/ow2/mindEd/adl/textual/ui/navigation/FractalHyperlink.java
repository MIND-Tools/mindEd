package org.ow2.mindEd.adl.textual.ui.navigation;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink;
import org.eclipse.xtext.util.TextLocation;
import org.ow2.mindEd.adl.CompositeComponentDefinition;
import org.ow2.mindEd.adl.CompositeReferenceDefinition;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.model.MindAdl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Region;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class FractalHyperlink extends HyperlinkHelper {

    // Reference on the project model
    private MindModelManager mindModel = MindModelManager.getMindModelManager();

    @Override
    public void createHyperlinksByOffset(XtextResource resource, int offset,
            IHyperlinkAcceptor acceptor) {

        super.createHyperlinksByOffset(resource, offset, acceptor);

        TextLocation loc = new TextLocation();

        EObject eObject = EObjectAtOffsetHelper.resolveElementAt(resource, offset, loc);

        if (eObject instanceof CompositeComponentDefinition) {
            CompositeComponentDefinition ref = (CompositeComponentDefinition) eObject;

            Collection<? extends MindAdl> components = mindModel.getMindModel().getAllComponents();

            //for (MindAdl component : components) {
                System.err.println("create hyperlink");
            
                XtextHyperlink hyperlink = getHyperlinkProvider().get();
                hyperlink.setHyperlinkRegion(new Region(offset, 5));
                acceptor.accept(hyperlink);
               
            //}

        }

    }
}
