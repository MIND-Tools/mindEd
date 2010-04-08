lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'struct' ;
T16 : 'union' ;
T17 : 'null' ;
T18 : '+' ;
T19 : '-' ;
T20 : '<<' ;
T21 : '>>' ;
T22 : '*' ;
T23 : '/' ;
T24 : '%' ;
T25 : '&' ;
T26 : '~' ;
T27 : '!' ;
T28 : 'const' ;
T29 : 'volatile' ;
T30 : 'void' ;
T31 : 'char' ;
T32 : 'short' ;
T33 : 'int' ;
T34 : 'long' ;
T35 : 'float' ;
T36 : 'double' ;
T37 : 'signed' ;
T38 : 'unsigned' ;
T39 : 'string' ;
T40 : 'int8_t' ;
T41 : 'uint8_t' ;
T42 : 'int16_t' ;
T43 : 'uint16_t' ;
T44 : 'int32_t' ;
T45 : 'uint32_t' ;
T46 : 'int64_t' ;
T47 : 'uint64_t' ;
T48 : 'intptr_t' ;
T49 : 'uintptr_t' ;
T50 : 'in' ;
T51 : 'out' ;
T52 : '#ifndef' ;
T53 : '#endif' ;
T54 : ';' ;
T55 : 'typedef' ;
T56 : '{' ;
T57 : '}' ;
T58 : ':' ;
T59 : 'enum' ;
T60 : ',' ;
T61 : '=' ;
T62 : '(' ;
T63 : ')' ;
T64 : '[' ;
T65 : ']' ;
T66 : '.' ;
T67 : '#define' ;
T68 : 'interface' ;
T69 : 'unmanaged' ;
T70 : '...' ;
T71 : '#include' ;
T72 : '@' ;
T73 : '||' ;
T74 : '&&' ;
T75 : '|' ;
T76 : '^' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7756
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7758
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7760
RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_INT+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7762
RULE_FDSYMBOL : ('f'|'F'|'d'|'D');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7764
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7766
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7768
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7770
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7772
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7774
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/ui/contentassist/antlr/internal/InternalFractalIdt.g" 7776
RULE_ANY_OTHER : .;


