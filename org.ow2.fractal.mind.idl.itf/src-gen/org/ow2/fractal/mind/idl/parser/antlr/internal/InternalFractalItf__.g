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
T37 : 'const' ;
T38 : 'volatile' ;
T39 : 'char' ;
T40 : 'short' ;
T41 : 'int' ;
T42 : 'long' ;
T43 : 'float' ;
T44 : 'double' ;
T45 : 'signed' ;
T46 : 'unsigned' ;
T47 : 'string' ;
T48 : 'int8_t' ;
T49 : 'uint8_t' ;
T50 : 'int16_t' ;
T51 : 'uint16_t' ;
T52 : 'int32_t' ;
T53 : 'uint32_t' ;
T54 : 'int64_t' ;
T55 : 'uint64_t' ;
T56 : 'intptr_t' ;
T57 : 'uintptr_t' ;
T58 : 'in' ;
T59 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2919
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2921
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2923
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2925
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2927
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2929
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2931
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2933
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2935
RULE_ANY_OTHER : .;


