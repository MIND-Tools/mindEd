lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T18 : '#ifndef' ;
T19 : '#endif' ;
T20 : ';' ;
T21 : 'typedef' ;
T22 : '{' ;
T23 : '}' ;
T24 : 'struct' ;
T25 : 'union' ;
T26 : ':' ;
T27 : 'enum' ;
T28 : ',' ;
T29 : '=' ;
T30 : '*' ;
T31 : '(' ;
T32 : ')' ;
T33 : '[' ;
T34 : ']' ;
T35 : '.' ;
T36 : '#define' ;
T37 : 'interface' ;
T38 : 'unmanaged' ;
T39 : 'void' ;
T40 : '...' ;
T41 : '#include' ;
T42 : '@' ;
T43 : 'null' ;
T44 : '||' ;
T45 : '&&' ;
T46 : '|' ;
T47 : '^' ;
T48 : '&' ;
T49 : 'e' ;
T50 : 'E' ;
T51 : 'const' ;
T52 : 'volatile' ;
T53 : 'char' ;
T54 : 'short' ;
T55 : 'int' ;
T56 : 'long' ;
T57 : 'float' ;
T58 : 'double' ;
T59 : 'signed' ;
T60 : 'unsigned' ;
T61 : 'string' ;
T62 : 'int8_t' ;
T63 : 'uint8_t' ;
T64 : 'int16_t' ;
T65 : 'uint16_t' ;
T66 : 'int32_t' ;
T67 : 'uint32_t' ;
T68 : 'int64_t' ;
T69 : 'uint64_t' ;
T70 : 'intptr_t' ;
T71 : 'uintptr_t' ;
T72 : 'in' ;
T73 : 'out' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4681
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4683
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4685
RULE_SHIFTOPERATION : ('<<'|'>>');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4687
RULE_ADDITIVEOPERATION : ('+'|'-');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4689
RULE_MULOPERATION : ('*'|'/'|'%');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4691
RULE_UNARYOPERATION : ('&'|'*'|'+'|'-'|'~'|'!');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4693
RULE_FDSYMBOL : ('f'|'F'|'d'|'D');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4695
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4697
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4699
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4701
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4703
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4705
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g" 4707
RULE_ANY_OTHER : .;


