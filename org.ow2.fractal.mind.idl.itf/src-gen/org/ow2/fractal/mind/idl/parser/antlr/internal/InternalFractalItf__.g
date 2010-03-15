lexer grammar InternalFractalItf;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : ';' ;
T13 : 'typedef' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'struct' ;
T17 : 'union' ;
T18 : ':' ;
T19 : 'enum' ;
T20 : ',' ;
T21 : '=' ;
T22 : '*' ;
T23 : '(' ;
T24 : ')' ;
T25 : '[' ;
T26 : ']' ;
T27 : '.' ;
T28 : '#define' ;
T29 : 'interface' ;
T30 : 'unmanaged' ;
T31 : 'void' ;
T32 : '...' ;
T33 : '#include' ;
T34 : 'const' ;
T35 : 'volatile' ;
T36 : 'char' ;
T37 : 'short' ;
T38 : 'int' ;
T39 : 'long' ;
T40 : 'float' ;
T41 : 'double' ;
T42 : 'signed' ;
T43 : 'unsigned' ;
T44 : 'string' ;
T45 : 'int8_t' ;
T46 : 'uint8_t' ;
T47 : 'int16_t' ;
T48 : 'uint16_t' ;
T49 : 'int32_t' ;
T50 : 'uint32_t' ;
T51 : 'int64_t' ;
T52 : 'uint64_t' ;
T53 : 'intptr_t' ;
T54 : 'uintptr_t' ;
T55 : 'in' ;
T56 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2513
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2515
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2517
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2519
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2521
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2523
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2525
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 2527
RULE_ANY_OTHER : .;


