lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'struct' ;
T12 : 'union' ;
T13 : 'const' ;
T14 : 'volatile' ;
T15 : 'void' ;
T16 : 'char' ;
T17 : 'short' ;
T18 : 'int' ;
T19 : 'long' ;
T20 : 'float' ;
T21 : 'double' ;
T22 : 'signed' ;
T23 : 'unsigned' ;
T24 : 'string' ;
T25 : 'int8_t' ;
T26 : 'uint8_t' ;
T27 : 'int16_t' ;
T28 : 'uint16_t' ;
T29 : 'int32_t' ;
T30 : 'uint32_t' ;
T31 : 'int64_t' ;
T32 : 'uint64_t' ;
T33 : 'intptr_t' ;
T34 : 'uintptr_t' ;
T35 : 'in' ;
T36 : 'out' ;
T37 : ';' ;
T38 : 'typedef' ;
T39 : '{' ;
T40 : '}' ;
T41 : ':' ;
T42 : 'enum' ;
T43 : ',' ;
T44 : '=' ;
T45 : '*' ;
T46 : '(' ;
T47 : ')' ;
T48 : '[' ;
T49 : ']' ;
T50 : '.' ;
T51 : '#define' ;
T52 : 'interface' ;
T53 : 'unmanaged' ;
T54 : '...' ;
T55 : '#include' ;
T56 : '<' ;
T57 : '>' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3905
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3907
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3909
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3911
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3913
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3915
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3917
RULE_ANY_OTHER : .;


