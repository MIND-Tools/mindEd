lexer grammar InternalFractal;
@header {
package org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'this' ;
T14 : 'null' ;
T15 : 'Override' ;
T16 : 'Singleton' ;
T17 : 'LDFlags' ;
T18 : 'CFlags' ;
T19 : 'STRUCT' ;
T20 : 'UNION' ;
T21 : 'ENUM' ;
T22 : '+' ;
T23 : '-' ;
T24 : 'optional' ;
T25 : 'mandatory' ;
T26 : 'provides' ;
T27 : 'requires' ;
T28 : 'import' ;
T29 : ';' ;
T30 : 'primitive' ;
T31 : '{' ;
T32 : '}' ;
T33 : 'type' ;
T34 : 'composite' ;
T35 : '<' ;
T36 : '>' ;
T37 : ',' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'extends' ;
T41 : 'contains' ;
T42 : 'as' ;
T43 : '=' ;
T44 : 'attribute' ;
T45 : ']' ;
T46 : 'binds' ;
T47 : '.' ;
T48 : 'to' ;
T49 : '[' ;
T50 : 'data' ;
T51 : 'source' ;
T52 : 'conformsto' ;
T53 : '@' ;
T54 : '0x' ;
T55 : '.*' ;
T56 : 'abstract' ;
T57 : '[]' ;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9924
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9926
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9928
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9930
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9932
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9934
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9936
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9938
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 9940
RULE_ANY_OTHER : .;


