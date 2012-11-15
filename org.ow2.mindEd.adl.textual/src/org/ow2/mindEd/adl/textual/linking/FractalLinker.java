package org.ow2.mindEd.adl.textual.linking;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

public class FractalLinker extends LazyLinker {

	@Override
	protected void beforeModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
		Resource res = model.eResource().getResourceSet().getResource(URI.createURI("fractal.lib.Factory"), false);
		if (res != null) {
			try {
				res.delete(null);
			} catch (IOException e) {

			}
		}
	}

}
