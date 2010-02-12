lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : ';' ;
T12 : 'typedef' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'struct' ;
T16 : 'union' ;
T17 : ':' ;
T18 : 'enum' ;
T19 : ',' ;
T20 : '=' ;
T21 : '*' ;
T22 : '(' ;
T23 : ')' ;
T24 : '[' ;
T25 : ']' ;
T26 : '.' ;
T27 : '#define' ;
T28 : 'interface' ;
T29 : 'unmanaged' ;
T30 : 'void' ;
T31 : '...' ;
T32 : '#include' ;
T33 : '".*"' ;
T34 : '<.*>' ;
T35 : 'const' ;
T36 : 'volatile' ;
T37 : 'char' ;
T38 : 'short' ;
T39 : 'int' ;
T40 : 'long' ;
T41 : 'float' ;
T42 : 'double' ;
T43 : 'signed' ;
T44 : 'unsigned' ;
T45 : 'string' ;
T46 : 'int8_t' ;
T47 : 'uint8_t' ;
T48 : 'int16_t' ;
T49 : 'uint16_t' ;
T50 : 'int32_t' ;
T51 : 'uint32_t' ;
T52 : 'int64_t' ;
T53 : 'uint64_t' ;
T54 : 'intptr_t' ;
T55 : 'uintptr_t' ;
T56 : 'in' ;
T57 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2193
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2195
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2197
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2199
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2201
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2203
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 2205
RULE_ANY_OTHER : .;


