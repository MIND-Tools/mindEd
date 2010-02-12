lexer grammar InternalFractalIdt;
@header {
package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'struct' ;
T12 : 'union' ;
T13 : '".*"' ;
T14 : '<.*>' ;
T15 : 'const' ;
T16 : 'volatile' ;
T17 : 'void' ;
T18 : 'char' ;
T19 : 'short' ;
T20 : 'int' ;
T21 : 'long' ;
T22 : 'float' ;
T23 : 'double' ;
T24 : 'signed' ;
T25 : 'unsigned' ;
T26 : 'string' ;
T27 : 'int8_t' ;
T28 : 'uint8_t' ;
T29 : 'int16_t' ;
T30 : 'uint16_t' ;
T31 : 'int32_t' ;
T32 : 'uint32_t' ;
T33 : 'int64_t' ;
T34 : 'uint64_t' ;
T35 : 'intptr_t' ;
T36 : 'uintptr_t' ;
T37 : 'in' ;
T38 : 'out' ;
T39 : ';' ;
T40 : 'typedef' ;
T41 : '{' ;
T42 : '}' ;
T43 : ':' ;
T44 : 'enum' ;
T45 : ',' ;
T46 : '=' ;
T47 : '*' ;
T48 : '(' ;
T49 : ')' ;
T50 : '[' ;
T51 : ']' ;
T52 : '.' ;
T53 : '#define' ;
T54 : 'interface' ;
T55 : 'unmanaged' ;
T56 : '...' ;
T57 : '#include' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3805
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3807
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3809
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3811
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3813
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3815
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g" 3817
RULE_ANY_OTHER : .;


