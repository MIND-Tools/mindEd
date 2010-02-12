lexer grammar InternalFractal;
@header {
package org.ow2.fractal.mind.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'this' ;
T14 : 'nodata' ;
T15 : 'Override' ;
T16 : 'Singleton' ;
T17 : 'LDFlags' ;
T18 : 'CFlags' ;
T19 : 'STRUCT' ;
T20 : 'UNION' ;
T21 : 'ENUM' ;
T22 : '+' ;
T23 : '-' ;
T24 : 'optional' ;
T25 : 'mandatory' ;
T26 : 'provides' ;
T27 : 'requires' ;
T28 : 'import' ;
T29 : ';' ;
T30 : 'primitive' ;
T31 : '{' ;
T32 : '}' ;
T33 : 'type' ;
T34 : 'composite' ;
T35 : '<' ;
T36 : '>' ;
T37 : ',' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'extends' ;
T41 : 'contains' ;
T42 : 'as' ;
T43 : '=' ;
T44 : 'attribute' ;
T45 : 'binds' ;
T46 : '.' ;
T47 : 'to' ;
T48 : '[' ;
T49 : ']' ;
T50 : 'data' ;
T51 : 'source' ;
T52 : 'conformsto' ;
T53 : '@' ;
T54 : '0x' ;
T55 : '.*' ;
T56 : 'abstract' ;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7933
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7935
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7937
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7939
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7941
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7943
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7945
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7947
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.xtext.ui/src-gen/org/ow2/fractal/mind/xtext/contentassist/antlr/internal/InternalFractal.g" 7949
RULE_ANY_OTHER : .;


