lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : '#ifndef' ;
T15 : '#endif' ;
T16 : ';' ;
T17 : 'typedef' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'struct' ;
T21 : 'union' ;
T22 : ':' ;
T23 : 'enum' ;
T24 : ',' ;
T25 : '=' ;
T26 : '*' ;
T27 : '(' ;
T28 : ')' ;
T29 : '[' ;
T30 : ']' ;
T31 : '.' ;
T32 : '#define' ;
T33 : 'interface' ;
T34 : 'unmanaged' ;
T35 : 'void' ;
T36 : '...' ;
T37 : '#include' ;
T38 : '@' ;
T39 : 'null' ;
T40 : '+' ;
T41 : '-' ;
T42 : '||' ;
T43 : '&&' ;
T44 : '|' ;
T45 : '^' ;
T46 : '&' ;
T47 : '<<' ;
T48 : '>>' ;
T49 : '/' ;
T50 : '%' ;
T51 : '~' ;
T52 : '!' ;
T53 : 'f' ;
T54 : 'F' ;
T55 : 'd' ;
T56 : 'D' ;
T57 : 'const' ;
T58 : 'volatile' ;
T59 : 'char' ;
T60 : 'short' ;
T61 : 'int' ;
T62 : 'long' ;
T63 : 'float' ;
T64 : 'double' ;
T65 : 'signed' ;
T66 : 'unsigned' ;
T67 : 'string' ;
T68 : 'int8_t' ;
T69 : 'uint8_t' ;
T70 : 'int16_t' ;
T71 : 'uint16_t' ;
T72 : 'int32_t' ;
T73 : 'uint32_t' ;
T74 : 'int64_t' ;
T75 : 'uint64_t' ;
T76 : 'intptr_t' ;
T77 : 'uintptr_t' ;
T78 : 'in' ;
T79 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4649
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4651
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4653
RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4655
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4657
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4659
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4661
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4663
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4665
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4667
RULE_ANY_OTHER : .;


