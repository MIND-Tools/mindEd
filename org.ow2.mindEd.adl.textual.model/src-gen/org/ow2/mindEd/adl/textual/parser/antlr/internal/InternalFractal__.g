lexer grammar InternalFractal;
@header {
package org.ow2.mindEd.adl.textual.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'import' ;
T14 : ';' ;
T15 : 'abstract' ;
T16 : 'primitive' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'type' ;
T20 : 'composite' ;
T21 : '<' ;
T22 : ',' ;
T23 : '>' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'extends' ;
T27 : 'contains' ;
T28 : 'as' ;
T29 : '=' ;
T30 : 'attribute' ;
T31 : '[' ;
T32 : ']' ;
T33 : '[]' ;
T34 : 'binds' ;
T35 : 'this' ;
T36 : '.' ;
T37 : 'to' ;
T38 : 'data' ;
T39 : 'nodata' ;
T40 : 'source' ;
T41 : 'conformsto' ;
T42 : '@' ;
T43 : 'null' ;
T44 : '0x' ;
T45 : 'Override' ;
T46 : 'Singleton' ;
T47 : 'LDFlags' ;
T48 : 'CFlags' ;
T49 : 'STRUCT' ;
T50 : 'UNION' ;
T51 : 'ENUM' ;
T52 : '.*' ;
T53 : '+' ;
T54 : '-' ;
T55 : 'optional' ;
T56 : 'mandatory' ;
T57 : 'provides' ;
T58 : 'requires' ;

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4464
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4466
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4468
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4470
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4472
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4474
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4476
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4478
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g" 4480
RULE_ANY_OTHER : .;

