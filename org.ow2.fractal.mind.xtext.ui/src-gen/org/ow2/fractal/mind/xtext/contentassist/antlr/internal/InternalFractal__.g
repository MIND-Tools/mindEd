lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : '?' ;
T12 : 'this' ;
T13 : 'nodata' ;
T14 : ':' ;
T15 : ',' ;
T16 : ';' ;
T17 : '.' ;
T18 : '/' ;
T19 : '\\' ;
T20 : '!' ;
T21 : '@' ;
T22 : '"' ;
T23 : '\'' ;
T24 : '*' ;
T25 : '\\\\' ;
T26 : 'override' ;
T27 : 'singleton' ;
T28 : 'LDFlags' ;
T29 : 'CFlags' ;
T30 : 'STRUCT' ;
T31 : 'UNION' ;
T32 : 'ENUM' ;
T33 : '+' ;
T34 : '-' ;
T35 : 'optional' ;
T36 : 'mandatory' ;
T37 : 'provides' ;
T38 : 'requires' ;
T39 : 'import' ;
T40 : 'primitive' ;
T41 : '{' ;
T42 : '}' ;
T43 : 'type' ;
T44 : 'composite' ;
T45 : '<' ;
T46 : '>' ;
T47 : '(' ;
T48 : ')' ;
T49 : 'extends' ;
T50 : 'contains' ;
T51 : 'as' ;
T52 : '=' ;
T53 : 'attribute' ;
T54 : 'binds' ;
T55 : 'to' ;
T56 : '[' ;
T57 : ']' ;
T58 : 'data' ;
T59 : '{{' ;
T60 : '}}' ;
T61 : 'source' ;
T62 : 'conformsto' ;
T63 : 'abstract' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8226
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8228
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8230
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8232
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8234
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8236
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 8238
RULE_ANY_OTHER : .;


