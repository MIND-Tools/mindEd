lexer grammar InternalFractalItf;
@header {
package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'struct' ;
T14 : 'union' ;
T15 : 'null' ;
T16 : '+' ;
T17 : '-' ;
T18 : 'const' ;
T19 : 'volatile' ;
T20 : 'void' ;
T21 : 'char' ;
T22 : 'short' ;
T23 : 'int' ;
T24 : 'long' ;
T25 : 'float' ;
T26 : 'double' ;
T27 : 'signed' ;
T28 : 'unsigned' ;
T29 : 'string' ;
T30 : 'int8_t' ;
T31 : 'uint8_t' ;
T32 : 'int16_t' ;
T33 : 'uint16_t' ;
T34 : 'int32_t' ;
T35 : 'uint32_t' ;
T36 : 'int64_t' ;
T37 : 'uint64_t' ;
T38 : 'intptr_t' ;
T39 : 'uintptr_t' ;
T40 : 'in' ;
T41 : 'out' ;
T42 : ';' ;
T43 : 'typedef' ;
T44 : '{' ;
T45 : '}' ;
T46 : ':' ;
T47 : 'enum' ;
T48 : ',' ;
T49 : '=' ;
T50 : '*' ;
T51 : '(' ;
T52 : ')' ;
T53 : '[' ;
T54 : ']' ;
T55 : '.' ;
T56 : '#define' ;
T57 : 'interface' ;
T58 : 'unmanaged' ;
T59 : '...' ;
T60 : '#include' ;
T61 : '@' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5172
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5174
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5176
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5178
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5180
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5182
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5184
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5186
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 5188
RULE_ANY_OTHER : .;


