lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '#ifndef' ;
T13 : '#endif' ;
T14 : ';' ;
T15 : 'typedef' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'struct' ;
T19 : 'union' ;
T20 : ':' ;
T21 : 'enum' ;
T22 : ',' ;
T23 : '=' ;
T24 : '*' ;
T25 : '(' ;
T26 : ')' ;
T27 : '[' ;
T28 : ']' ;
T29 : '.' ;
T30 : '#define' ;
T31 : 'interface' ;
T32 : 'unmanaged' ;
T33 : 'void' ;
T34 : '...' ;
T35 : '#include' ;
T36 : 'const' ;
T37 : 'volatile' ;
T38 : 'char' ;
T39 : 'short' ;
T40 : 'int' ;
T41 : 'long' ;
T42 : 'float' ;
T43 : 'double' ;
T44 : 'signed' ;
T45 : 'unsigned' ;
T46 : 'string' ;
T47 : 'int8_t' ;
T48 : 'uint8_t' ;
T49 : 'int16_t' ;
T50 : 'uint16_t' ;
T51 : 'int32_t' ;
T52 : 'uint32_t' ;
T53 : 'int64_t' ;
T54 : 'uint64_t' ;
T55 : 'intptr_t' ;
T56 : 'uintptr_t' ;
T57 : 'in' ;
T58 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2317
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2319
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2321
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2323
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2325
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2327
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2329
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2331
RULE_ANY_OTHER : .;


