lexer grammar InternalFractalItf;
@header {
package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'struct' ;
T14 : 'union' ;
T15 : 'null' ;
T16 : 'const' ;
T17 : 'volatile' ;
T18 : 'void' ;
T19 : 'char' ;
T20 : 'short' ;
T21 : 'int' ;
T22 : 'long' ;
T23 : 'float' ;
T24 : 'double' ;
T25 : 'signed' ;
T26 : 'unsigned' ;
T27 : 'string' ;
T28 : 'int8_t' ;
T29 : 'uint8_t' ;
T30 : 'int16_t' ;
T31 : 'uint16_t' ;
T32 : 'int32_t' ;
T33 : 'uint32_t' ;
T34 : 'int64_t' ;
T35 : 'uint64_t' ;
T36 : 'intptr_t' ;
T37 : 'uintptr_t' ;
T38 : 'in' ;
T39 : 'out' ;
T40 : ';' ;
T41 : 'typedef' ;
T42 : '{' ;
T43 : '}' ;
T44 : ':' ;
T45 : 'enum' ;
T46 : ',' ;
T47 : '=' ;
T48 : '*' ;
T49 : '(' ;
T50 : ')' ;
T51 : '[' ;
T52 : ']' ;
T53 : '.' ;
T54 : '#define' ;
T55 : 'interface' ;
T56 : 'unmanaged' ;
T57 : '...' ;
T58 : '#include' ;
T59 : '@' ;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4860
RULE_INCLUDELIB : '<' RULE_ID '.' RULE_ID '>';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4862
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4864
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4866
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4868
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4870
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4872
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4874
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g" 4876
RULE_ANY_OTHER : .;


