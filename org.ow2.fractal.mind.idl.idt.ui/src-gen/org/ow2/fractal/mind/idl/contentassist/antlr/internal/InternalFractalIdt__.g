lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'struct' ;
T15 : 'union' ;
T16 : 'null' ;
T17 : '+' ;
T18 : '-' ;
T19 : '<<' ;
T20 : '>>' ;
T21 : '*' ;
T22 : '/' ;
T23 : '%' ;
T24 : '&' ;
T25 : '~' ;
T26 : '!' ;
T27 : 'f' ;
T28 : 'F' ;
T29 : 'd' ;
T30 : 'D' ;
T31 : 'const' ;
T32 : 'volatile' ;
T33 : 'void' ;
T34 : 'char' ;
T35 : 'short' ;
T36 : 'int' ;
T37 : 'long' ;
T38 : 'float' ;
T39 : 'double' ;
T40 : 'signed' ;
T41 : 'unsigned' ;
T42 : 'string' ;
T43 : 'int8_t' ;
T44 : 'uint8_t' ;
T45 : 'int16_t' ;
T46 : 'uint16_t' ;
T47 : 'int32_t' ;
T48 : 'uint32_t' ;
T49 : 'int64_t' ;
T50 : 'uint64_t' ;
T51 : 'intptr_t' ;
T52 : 'uintptr_t' ;
T53 : 'in' ;
T54 : 'out' ;
T55 : '#ifndef' ;
T56 : '#endif' ;
T57 : ';' ;
T58 : 'typedef' ;
T59 : '{' ;
T60 : '}' ;
T61 : ':' ;
T62 : 'enum' ;
T63 : ',' ;
T64 : '=' ;
T65 : '(' ;
T66 : ')' ;
T67 : '[' ;
T68 : ']' ;
T69 : '.' ;
T70 : '#define' ;
T71 : 'interface' ;
T72 : 'unmanaged' ;
T73 : '...' ;
T74 : '#include' ;
T75 : '@' ;
T76 : '||' ;
T77 : '&&' ;
T78 : '|' ;
T79 : '^' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7888
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7890
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7892
RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7894
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7896
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7898
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7900
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7902
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7904
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 7906
RULE_ANY_OTHER : .;


