lexer grammar InternalFractalItf;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

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
T36 : '@' ;
T37 : 'null' ;
T38 : '+' ;
T39 : '-' ;
T40 : '||' ;
T41 : '&&' ;
T42 : '|' ;
T43 : '^' ;
T44 : '&' ;
T45 : '<<' ;
T46 : '>>' ;
T47 : '/' ;
T48 : '%' ;
T49 : '~' ;
T50 : '!' ;
T51 : 'f' ;
T52 : 'F' ;
T53 : 'd' ;
T54 : 'D' ;
T55 : 'const' ;
T56 : 'volatile' ;
T57 : 'char' ;
T58 : 'short' ;
T59 : 'int' ;
T60 : 'long' ;
T61 : 'float' ;
T62 : 'double' ;
T63 : 'signed' ;
T64 : 'unsigned' ;
T65 : 'string' ;
T66 : 'int8_t' ;
T67 : 'uint8_t' ;
T68 : 'int16_t' ;
T69 : 'uint16_t' ;
T70 : 'int32_t' ;
T71 : 'uint32_t' ;
T72 : 'int64_t' ;
T73 : 'uint64_t' ;
T74 : 'intptr_t' ;
T75 : 'uintptr_t' ;
T76 : 'in' ;
T77 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4483
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4485
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4487
RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4489
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4491
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4493
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4495
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4497
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4499
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g" 4501
RULE_ANY_OTHER : .;


