/*
 * generated by Xtext
 */
package org.ow2.mindEd.adl.textual.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class FractalFormatter extends AbstractDeclarativeFormatter {

	private FormattingConfig c;
	private FractalGrammarAccess f;

	/**
	 * 
	 * Format a bloc limited by parenthesis or curly bracket.
	 * 
	 * @param left
	 *            left delimiter
	 * 
	 * @param right
	 *            right delimiter
	 * 
	 */
	private void formatBloc(Keyword left, Keyword right) {
		// line before inside
		this.c.setLinewrap().before(left);
		// line after first bracket
		this.c.setLinewrap().after(left);
		// inside indentation
		this.c.setIndentation(left, right);
		// line after bloc
		this.c.setLinewrap(2).after(right);
	}

	/**
	 * Format curly bracket blocs (like PrimitiveComponent,
	 * CompositeComponent...)
	 */
	private void formatBlocs() {
		// PrimitiveComponent
		this.formatBloc(this.f.getPrimitiveComponentDefinitionAccess()
				.getLeftCurlyBracketKeyword_6_0_0(), this.f
				.getPrimitiveComponentDefinitionAccess()
				.getRightCurlyBracketKeyword_6_0_2());
		// CompositeComponent
		this.formatBloc(this.f.getCompositeComponentDefinitionAccess()
				.getLeftCurlyBracketKeyword_6_0_0(), this.f
				.getCompositeComponentDefinitionAccess()
				.getRightCurlyBracketKeyword_6_0_2());
		// TypeDefinition
		this.formatBloc(this.f.getComponentTypeDefinitionAccess()
				.getLeftCurlyBracketKeyword_4_0_0(), this.f
				.getComponentTypeDefinitionAccess()
				.getRightCurlyBracketKeyword_4_0_2());
		// SubComponentDefinition
		this.formatBloc(this.f.getSubComponentCompositeBodyAccess()
				.getLeftCurlyBracketKeyword_2(), this.f
				.getSubComponentCompositeBodyAccess()
				.getRightCurlyBracketKeyword_4());

		this.formatBloc(this.f.getSubComponentPrimitiveBodyAccess()
				.getLeftCurlyBracketKeyword_2(), this.f
				.getSubComponentPrimitiveBodyAccess()
				.getRightCurlyBracketKeyword_4());
	}

	/**
	 * Format annotations (annotations list, annotations arguments...)
	 */
	private void formatAnnotation() {
		// avoid space after '@'
		this.c.setNoSpace().after(
				this.f.getAnnotationAccess().getCommercialAtKeyword_0());
		// line after
		this.c.setLinewrap().after(
				this.f.getAnnotationAccess().getRightParenthesisKeyword_2_3());
		// no space between '='
		this.c.setNoSpace().around(
				this.f.getAnnotationElementAccess().getEqualsSignKeyword_1_1());
		// ElementValueArrayInitializer, no space inside {}, and after ','
		this.formatList(this.f.getElementValueArrayInitializerAccess()
				.getLeftCurlyBracketKeyword_0(), this.f
				.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(),
				this.f.getElementValueArrayInitializerAccess()
						.getRightCurlyBracketKeyword_3());
		// Line warp
		this.c.setLinewrap().after(
				this.f.getAnnotationAccess().getNameAssignment_1());
		this.c.setNoSpace().before(
				this.f.getAnnotationAccess().getCommaKeyword_2_2_0());
		this.c.setLinewrap().after(
				this.f.getAnnotationAccess().getRightParenthesisKeyword_2_3());
	}

	/**
	 * Format imports
	 */
	private void formatImport() {
		this.formatSemicolon(this.f.getImportDefinitionAccess()
				.getSemicolonKeyword_2());
		// Another line after import
		this.c.setLinewrap(2).after(
				this.f.getImportDefinitionAccess().getGroup());
	}

	/**
	 * Format a line ended by a semicolon.
	 * 
	 * @param s
	 *            semicolon
	 */
	private void formatSemicolon(Keyword s) {
		// Line after semicolon
		this.c.setLinewrap().after(s);
		// and no space before
		this.c.setNoSpace().before(s);
	}

	/**
	 * Format rules expressed in one line.
	 */
	private void formatInLine() {
		// Imports
		this.formatImport();

		// Annotations
		this.formatAnnotation();

		// Semicolon rules
		Keyword[] keys = new Keyword[] {
				this.f.getCompositeBodyAccess().getSemicolonKeyword_1(),
				this.f.getPrimitiveBodyAccess().getSemicolonKeyword_1(),
				this.f.getTypeBodyAccess().getSemicolonKeyword_1() };
		for (Keyword k : keys)
			this.formatSemicolon(k);

		// Avoid spaces around "." into binding definition
		this.c.setNoSpace().around(
				this.f.getBindingDefinitionAccess().getFullStopKeyword_1_2());
		this.c.setNoSpace().around(
				this.f.getBindingDefinitionAccess().getFullStopKeyword_1_7());
	}

	/**
	 * Format expressions like argument list to(x, y) style
	 * 
	 * @param l
	 *            left delimiter
	 * @param c
	 *            comma keyword
	 * @param r
	 *            right delimiter
	 */
	private void formatList(Keyword l, Keyword c, Keyword r) {
		this.c.setNoSpace().around(l);
		this.c.setNoSpace().before(c);
		this.c.setNoSpace().before(r);
	}

	/**
	 * Format headers of component declarations
	 */
	private void formatHeaders() {
		// Composite
		this.c.setNoSpace().around(
				this.f.getCompositeReferenceDefinitionAccess()
						.getGreaterThanSignKeyword_1_3());
		this.c.setNoSpace().around(
				this.f.getCompositeReferenceDefinitionAccess()
						.getLessThanSignKeyword_1_0());
		this.c.setNoSpace().around(
				this.f.getCompositeReferenceDefinitionAccess()
						.getLeftParenthesisKeyword_2_0());
		this.c.setNoSpace().before(
				this.f.getCompositeReferenceDefinitionAccess()
						.getRightParenthesisKeyword_2_3());

		// format argument lists
		this.formatList(this.f.getFormalArgumentsListAccess()
				.getLeftParenthesisKeyword_0(), this.f
				.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), this.f
				.getFormalArgumentsListAccess().getRightParenthesisKeyword_2());

		// format template specifiers list
		this.formatList(this.f.getTemplateSpecifiersListAccess()
				.getLessThanSignKeyword_0(), this.f
				.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(),
				this.f.getTemplateSpecifiersListAccess()
						.getGreaterThanSignKeyword_2());

		// Primitive
		this.formatList(this.f.getPrimitiveReferenceDefinitionAccess()
				.getLeftParenthesisKeyword_1_0(), this.f
				.getPrimitiveReferenceDefinitionAccess()
				.getCommaKeyword_1_2_0(), this.f
				.getPrimitiveReferenceDefinitionAccess()
				.getRightParenthesisKeyword_1_3());
	}

	/**
	 * Format extends declarations
	 */
	private void FormatExtends() {
		Keyword[] keys = new Keyword[] {
				this.f.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(),
				this.f.getCompositeReferencesListAccess().getCommaKeyword_2_0(),
				this.f.getTypeReferencesListAccess().getCommaKeyword_2_0() };

		for (Keyword k : keys)
			this.c.setNoSpace().before(k);
	}

	@Override
	protected void configureFormatting(FormattingConfig fc) {
		this.c = fc;
		this.f = (org.ow2.mindEd.adl.textual.services.FractalGrammarAccess) getGrammarAccess();

		this.c.setIndentationSpace("    ");

		this.formatBlocs();

		this.formatInLine();

		this.formatHeaders();
		this.FormatExtends();
	}
}