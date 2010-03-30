lexer grammar InternalFractalItf;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : ';' ;
T14 : 'typedef' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'struct' ;
T18 : 'union' ;
T19 : ':' ;
T20 : 'enum' ;
T21 : ',' ;
T22 : '=' ;
T23 : '*' ;
T24 : '(' ;
T25 : ')' ;
T26 : '[' ;
T27 : ']' ;
T28 : '.' ;
T29 : '#define' ;
T30 : 'interface' ;
T31 : 'unmanaged' ;
T32 : 'void' ;
T33 : '...' ;
T34 : '#include' ;
T35 : '@' ;
T36 : 'null' ;
T37 : '+' ;
T38 : '-' ;
T39 : 'const' ;
T40 : 'volatile' ;
T41 : 'char' ;
T42 : 'short' ;
T43 : 'int' ;
T44 : 'long' ;
T45 : 'float' ;
T46 : 'double' ;
T47 : 'signed' ;
T48 : 'unsigned' ;
T49 : 'string' ;
T50 : 'int8_t' ;
T51 : 'uint8_t' ;
T52 : 'int16_t' ;
T53 : 'uint16_t' ;
T54 : 'int32_t' ;
T55 : 'uint32_t' ;
T56 : 'int64_t' ;
T57 : 'uint64_t' ;
T58 : 'intptr_t' ;
T59 : 'uintptr_t' ;
T60 : 'in' ;
T61 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3061
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3063
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3065
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3067
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3069
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3071
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3073
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3075
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 3077
RULE_ANY_OTHER : .;


