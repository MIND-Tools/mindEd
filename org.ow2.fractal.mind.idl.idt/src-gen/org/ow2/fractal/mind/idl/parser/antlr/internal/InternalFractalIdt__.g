lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '#ifndef' ;
T14 : '#endif' ;
T15 : ';' ;
T16 : 'typedef' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'struct' ;
T20 : 'union' ;
T21 : ':' ;
T22 : 'enum' ;
T23 : ',' ;
T24 : '=' ;
T25 : '*' ;
T26 : '(' ;
T27 : ')' ;
T28 : '[' ;
T29 : ']' ;
T30 : '.' ;
T31 : '#define' ;
T32 : 'interface' ;
T33 : 'unmanaged' ;
T34 : 'void' ;
T35 : '...' ;
T36 : '#include' ;
T37 : '@' ;
T38 : 'null' ;
T39 : '+' ;
T40 : '-' ;
T41 : 'const' ;
T42 : 'volatile' ;
T43 : 'char' ;
T44 : 'short' ;
T45 : 'int' ;
T46 : 'long' ;
T47 : 'float' ;
T48 : 'double' ;
T49 : 'signed' ;
T50 : 'unsigned' ;
T51 : 'string' ;
T52 : 'int8_t' ;
T53 : 'uint8_t' ;
T54 : 'int16_t' ;
T55 : 'uint16_t' ;
T56 : 'int32_t' ;
T57 : 'uint32_t' ;
T58 : 'int64_t' ;
T59 : 'uint64_t' ;
T60 : 'intptr_t' ;
T61 : 'uintptr_t' ;
T62 : 'in' ;
T63 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3209
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3211
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3213
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3215
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3217
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3219
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3221
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3223
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 3225
RULE_ANY_OTHER : .;


