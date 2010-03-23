package org.ow2.fractal.mind.idl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * 
 * @author Nicolas LINGOIS
 * @contributor Rémi MELISSON
 * @contributor Damien Fournier
 */

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {

		if (resource == null || acceptor == null
				|| resource.getParseResult() == null)
			return;
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource
				.getParseResult().getRootNode());

		for (Iterator<AbstractNode> it = allNodes.iterator(); it.hasNext();) {

			AbstractNode abstractNode = (AbstractNode) it.next();
			if (abstractNode instanceof LeafNode) {

				LeafNode leafNode = (LeafNode) abstractNode;

				// coloring Annotations tokens
				colorAnnotations(it, leafNode, acceptor);
			}
		}
	}

	/**
	 * color annotations
	 * 
	 * @param it
	 *            iterator on all nodes of the tree
	 * @param leafNode
	 *            the current leaf node to test
	 * @param acceptor
	 *            the acceptor to color the token
	 */
	private void colorAnnotations(Iterator<AbstractNode> it, LeafNode leafNode,
			IHighlightedPositionAcceptor acceptor) {
		if (leafNode.getText().equals("@")) {

			if (it.hasNext()) {

				AbstractNode abstractNode = it.next();

				if (abstractNode instanceof CompositeNode) {
					CompositeNode compositeNode = (CompositeNode) abstractNode;


					acceptor.addPosition(leafNode.getOffset(), compositeNode
							.getTotalLength()+1,
							SemanticHighlightingConfiguration.ANNOTATIONS_ID);
				}

				// List<LeafNode> AnnotationNodes = leafNode.getParent()
				// .getLeafNodes();
				// for (LeafNode annotNode : AnnotationNodes) {
				// acceptor.addPosition(annotNode.getOffset(), annotNode
				// .getLength(),
				// SemanticHighlightingConfiguration.ANNOTATIONS_ID);
				// }
			}
		}
	}

}
