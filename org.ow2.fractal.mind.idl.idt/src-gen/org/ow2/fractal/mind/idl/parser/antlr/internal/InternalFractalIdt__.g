lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : '#ifndef' ;
T16 : '#endif' ;
T17 : ';' ;
T18 : 'typedef' ;
T19 : '{' ;
T20 : '}' ;
T21 : 'struct' ;
T22 : 'union' ;
T23 : ':' ;
T24 : 'enum' ;
T25 : ',' ;
T26 : '=' ;
T27 : '*' ;
T28 : '(' ;
T29 : ')' ;
T30 : '[' ;
T31 : ']' ;
T32 : '.' ;
T33 : '#define' ;
T34 : 'interface' ;
T35 : 'unmanaged' ;
T36 : 'void' ;
T37 : '...' ;
T38 : '#include' ;
T39 : '@' ;
T40 : 'null' ;
T41 : '+' ;
T42 : '-' ;
T43 : '||' ;
T44 : '&&' ;
T45 : '|' ;
T46 : '^' ;
T47 : '&' ;
T48 : '<<' ;
T49 : '>>' ;
T50 : '/' ;
T51 : '%' ;
T52 : '~' ;
T53 : '!' ;
T54 : 'const' ;
T55 : 'volatile' ;
T56 : 'char' ;
T57 : 'short' ;
T58 : 'int' ;
T59 : 'long' ;
T60 : 'float' ;
T61 : 'double' ;
T62 : 'signed' ;
T63 : 'unsigned' ;
T64 : 'string' ;
T65 : 'int8_t' ;
T66 : 'uint8_t' ;
T67 : 'int16_t' ;
T68 : 'uint16_t' ;
T69 : 'int32_t' ;
T70 : 'uint32_t' ;
T71 : 'int64_t' ;
T72 : 'uint64_t' ;
T73 : 'intptr_t' ;
T74 : 'uintptr_t' ;
T75 : 'in' ;
T76 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4580
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4582
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4584
RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4586
RULE_FDSYMBOL : ('f'|'F'|'d'|'D');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4588
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4590
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4592
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4594
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4596
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4598
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4600
RULE_ANY_OTHER : .;


