lexer grammar InternalFractalItf;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

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
T41 : '||' ;
T42 : '&&' ;
T43 : '|' ;
T44 : '^' ;
T45 : '&' ;
T46 : '<<' ;
T47 : '>>' ;
T48 : '/' ;
T49 : '%' ;
T50 : '~' ;
T51 : '!' ;
T52 : 'const' ;
T53 : 'volatile' ;
T54 : 'char' ;
T55 : 'short' ;
T56 : 'int' ;
T57 : 'long' ;
T58 : 'float' ;
T59 : 'double' ;
T60 : 'signed' ;
T61 : 'unsigned' ;
T62 : 'string' ;
T63 : 'int8_t' ;
T64 : 'uint8_t' ;
T65 : 'int16_t' ;
T66 : 'uint16_t' ;
T67 : 'int32_t' ;
T68 : 'uint32_t' ;
T69 : 'int64_t' ;
T70 : 'uint64_t' ;
T71 : 'intptr_t' ;
T72 : 'uintptr_t' ;
T73 : 'in' ;
T74 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4432
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4434
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4436
RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4438
RULE_FDSYMBOL : ('f'|'F'|'d'|'D');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4440
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4442
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4444
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4446
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4448
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4450
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4452
RULE_ANY_OTHER : .;


