lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : ';' ;
T13 : 'abstract' ;
T14 : 'primitive' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'type' ;
T18 : 'composite' ;
T19 : '<' ;
T20 : ',' ;
T21 : '>' ;
T22 : '(' ;
T23 : ')' ;
T24 : 'extends' ;
T25 : 'contains' ;
T26 : 'as' ;
T27 : '=' ;
T28 : '?' ;
T29 : 'attribute' ;
T30 : '[' ;
T31 : ']' ;
T32 : 'binds' ;
T33 : 'this' ;
T34 : '.' ;
T35 : 'to' ;
T36 : 'data' ;
T37 : '{{' ;
T38 : '}}' ;
T39 : 'nodata' ;
T40 : 'source' ;
T41 : 'conformsto' ;
T42 : '@' ;
T43 : ':' ;
T44 : '/' ;
T45 : '\\' ;
T46 : '!' ;
T47 : '"' ;
T48 : '\'' ;
T49 : '*' ;
T50 : '\\\\' ;
T51 : 'override' ;
T52 : 'singleton' ;
T53 : 'LDFlags' ;
T54 : 'CFlags' ;
T55 : 'STRUCT' ;
T56 : 'UNION' ;
T57 : 'ENUM' ;
T58 : '+' ;
T59 : '-' ;
T60 : 'optional' ;
T61 : 'mandatory' ;
T62 : 'provides' ;
T63 : 'requires' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4061
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4063
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4065
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4067
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4069
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4071
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g" 4073
RULE_ANY_OTHER : .;


