package org.ow2.fractal.mind.idl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalItfLexer extends Lexer {
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INCLUDELIB=7;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=60;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_STRING=6;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=11;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalFractalItfLexer() {;} 
    public InternalFractalItfLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:10:5: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:10:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:11:5: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:11:7: 'typedef'
            {
            match("typedef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:12:5: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:12:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:13:5: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:13:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:14:5: ( 'struct' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:14:7: 'struct'
            {
            match("struct"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:15:5: ( 'union' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:15:7: 'union'
            {
            match("union"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:16:5: ( ':' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:16:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:17:5: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:17:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:18:5: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:18:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:19:5: ( '=' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:19:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:20:5: ( '*' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:20:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:21:5: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:21:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:22:5: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:22:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:23:5: ( '[' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:23:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:24:5: ( ']' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:24:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:25:5: ( '.' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:25:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:26:5: ( '#define' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:26:7: '#define'
            {
            match("#define"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:27:5: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:27:7: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:28:5: ( 'unmanaged' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:28:7: 'unmanaged'
            {
            match("unmanaged"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:29:5: ( 'void' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:29:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:30:5: ( '...' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:30:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:31:5: ( '#include' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:31:7: '#include'
            {
            match("#include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:32:5: ( '@' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:32:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:33:5: ( 'null' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:33:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:34:5: ( 'const' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:34:7: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:35:5: ( 'volatile' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:35:7: 'volatile'
            {
            match("volatile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:36:5: ( 'char' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:36:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:37:5: ( 'short' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:37:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:38:5: ( 'int' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:38:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:39:5: ( 'long' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:39:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:40:5: ( 'float' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:40:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:41:5: ( 'double' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:41:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:42:5: ( 'signed' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:42:7: 'signed'
            {
            match("signed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:43:5: ( 'unsigned' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:43:7: 'unsigned'
            {
            match("unsigned"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:44:5: ( 'string' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:44:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:45:5: ( 'int8_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:45:7: 'int8_t'
            {
            match("int8_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:46:5: ( 'uint8_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:46:7: 'uint8_t'
            {
            match("uint8_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:47:5: ( 'int16_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:47:7: 'int16_t'
            {
            match("int16_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:48:5: ( 'uint16_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:48:7: 'uint16_t'
            {
            match("uint16_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:49:5: ( 'int32_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:49:7: 'int32_t'
            {
            match("int32_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:50:5: ( 'uint32_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:50:7: 'uint32_t'
            {
            match("uint32_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:51:5: ( 'int64_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:51:7: 'int64_t'
            {
            match("int64_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:52:5: ( 'uint64_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:52:7: 'uint64_t'
            {
            match("uint64_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:53:5: ( 'intptr_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:53:7: 'intptr_t'
            {
            match("intptr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:54:5: ( 'uintptr_t' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:54:7: 'uintptr_t'
            {
            match("uintptr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:55:5: ( 'in' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:55:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:56:5: ( 'out' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:56:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start RULE_INCLUDELIB
    public final void mRULE_INCLUDELIB() throws RecognitionException {
        try {
            int _type = RULE_INCLUDELIB;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2919:17: ( '<' RULE_ID '.' RULE_ID '>' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2919:19: '<' RULE_ID '.' RULE_ID '>'
            {
            match('<'); 
            mRULE_ID(); 
            match('.'); 
            mRULE_ID(); 
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INCLUDELIB

    // $ANTLR start RULE_BOOLEAN
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2921:14: ( ( 'true' | 'false' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2921:16: ( 'true' | 'false' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2921:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2921:16: ( 'true' | 'false' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2921:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2921:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOLEAN

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2923:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2923:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2923:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2923:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2923:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2925:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2925:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2925:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2925:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2927:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2927:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2929:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2929:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2929:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2929:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2931:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2933:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2933:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2933:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2935:16: ( . )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2935:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=56;
        int LA13_0 = input.LA(1);

        if ( (LA13_0==';') ) {
            alt13=1;
        }
        else if ( (LA13_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA13_37 = input.LA(3);

                if ( (LA13_37=='u') ) {
                    int LA13_77 = input.LA(4);

                    if ( (LA13_77=='e') ) {
                        int LA13_99 = input.LA(5);

                        if ( ((LA13_99>='0' && LA13_99<='9')||(LA13_99>='A' && LA13_99<='Z')||LA13_99=='_'||(LA13_99>='a' && LA13_99<='z')) ) {
                            alt13=50;
                        }
                        else {
                            alt13=49;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            case 'y':
                {
                int LA13_38 = input.LA(3);

                if ( (LA13_38=='p') ) {
                    int LA13_78 = input.LA(4);

                    if ( (LA13_78=='e') ) {
                        int LA13_100 = input.LA(5);

                        if ( (LA13_100=='d') ) {
                            int LA13_128 = input.LA(6);

                            if ( (LA13_128=='e') ) {
                                int LA13_157 = input.LA(7);

                                if ( (LA13_157=='f') ) {
                                    int LA13_180 = input.LA(8);

                                    if ( ((LA13_180>='0' && LA13_180<='9')||(LA13_180>='A' && LA13_180<='Z')||LA13_180=='_'||(LA13_180>='a' && LA13_180<='z')) ) {
                                        alt13=50;
                                    }
                                    else {
                                        alt13=2;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            default:
                alt13=50;}

        }
        else if ( (LA13_0=='{') ) {
            alt13=3;
        }
        else if ( (LA13_0=='}') ) {
            alt13=4;
        }
        else if ( (LA13_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA13_42 = input.LA(3);

                if ( (LA13_42=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA13_101 = input.LA(5);

                        if ( (LA13_101=='n') ) {
                            int LA13_129 = input.LA(6);

                            if ( (LA13_129=='g') ) {
                                int LA13_158 = input.LA(7);

                                if ( ((LA13_158>='0' && LA13_158<='9')||(LA13_158>='A' && LA13_158<='Z')||LA13_158=='_'||(LA13_158>='a' && LA13_158<='z')) ) {
                                    alt13=50;
                                }
                                else {
                                    alt13=35;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case 'u':
                        {
                        int LA13_102 = input.LA(5);

                        if ( (LA13_102=='c') ) {
                            int LA13_130 = input.LA(6);

                            if ( (LA13_130=='t') ) {
                                int LA13_159 = input.LA(7);

                                if ( ((LA13_159>='0' && LA13_159<='9')||(LA13_159>='A' && LA13_159<='Z')||LA13_159=='_'||(LA13_159>='a' && LA13_159<='z')) ) {
                                    alt13=50;
                                }
                                else {
                                    alt13=5;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    default:
                        alt13=50;}

                }
                else {
                    alt13=50;}
                }
                break;
            case 'i':
                {
                int LA13_43 = input.LA(3);

                if ( (LA13_43=='g') ) {
                    int LA13_80 = input.LA(4);

                    if ( (LA13_80=='n') ) {
                        int LA13_103 = input.LA(5);

                        if ( (LA13_103=='e') ) {
                            int LA13_131 = input.LA(6);

                            if ( (LA13_131=='d') ) {
                                int LA13_160 = input.LA(7);

                                if ( ((LA13_160>='0' && LA13_160<='9')||(LA13_160>='A' && LA13_160<='Z')||LA13_160=='_'||(LA13_160>='a' && LA13_160<='z')) ) {
                                    alt13=50;
                                }
                                else {
                                    alt13=33;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            case 'h':
                {
                int LA13_44 = input.LA(3);

                if ( (LA13_44=='o') ) {
                    int LA13_81 = input.LA(4);

                    if ( (LA13_81=='r') ) {
                        int LA13_104 = input.LA(5);

                        if ( (LA13_104=='t') ) {
                            int LA13_132 = input.LA(6);

                            if ( ((LA13_132>='0' && LA13_132<='9')||(LA13_132>='A' && LA13_132<='Z')||LA13_132=='_'||(LA13_132>='a' && LA13_132<='z')) ) {
                                alt13=50;
                            }
                            else {
                                alt13=28;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            default:
                alt13=50;}

        }
        else if ( (LA13_0=='u') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA13_45 = input.LA(3);

                if ( (LA13_45=='n') ) {
                    int LA13_82 = input.LA(4);

                    if ( (LA13_82=='t') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA13_133 = input.LA(6);

                            if ( (LA13_133=='6') ) {
                                int LA13_162 = input.LA(7);

                                if ( (LA13_162=='_') ) {
                                    int LA13_184 = input.LA(8);

                                    if ( (LA13_184=='t') ) {
                                        int LA13_200 = input.LA(9);

                                        if ( ((LA13_200>='0' && LA13_200<='9')||(LA13_200>='A' && LA13_200<='Z')||LA13_200=='_'||(LA13_200>='a' && LA13_200<='z')) ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=39;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                            }
                            break;
                        case '6':
                            {
                            int LA13_134 = input.LA(6);

                            if ( (LA13_134=='4') ) {
                                int LA13_163 = input.LA(7);

                                if ( (LA13_163=='_') ) {
                                    int LA13_185 = input.LA(8);

                                    if ( (LA13_185=='t') ) {
                                        int LA13_201 = input.LA(9);

                                        if ( ((LA13_201>='0' && LA13_201<='9')||(LA13_201>='A' && LA13_201<='Z')||LA13_201=='_'||(LA13_201>='a' && LA13_201<='z')) ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=43;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                            }
                            break;
                        case '3':
                            {
                            int LA13_135 = input.LA(6);

                            if ( (LA13_135=='2') ) {
                                int LA13_164 = input.LA(7);

                                if ( (LA13_164=='_') ) {
                                    int LA13_186 = input.LA(8);

                                    if ( (LA13_186=='t') ) {
                                        int LA13_202 = input.LA(9);

                                        if ( ((LA13_202>='0' && LA13_202<='9')||(LA13_202>='A' && LA13_202<='Z')||LA13_202=='_'||(LA13_202>='a' && LA13_202<='z')) ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=41;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                            }
                            break;
                        case '8':
                            {
                            int LA13_136 = input.LA(6);

                            if ( (LA13_136=='_') ) {
                                int LA13_165 = input.LA(7);

                                if ( (LA13_165=='t') ) {
                                    int LA13_187 = input.LA(8);

                                    if ( ((LA13_187>='0' && LA13_187<='9')||(LA13_187>='A' && LA13_187<='Z')||LA13_187=='_'||(LA13_187>='a' && LA13_187<='z')) ) {
                                        alt13=50;
                                    }
                                    else {
                                        alt13=37;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                            }
                            break;
                        case 'p':
                            {
                            int LA13_137 = input.LA(6);

                            if ( (LA13_137=='t') ) {
                                int LA13_166 = input.LA(7);

                                if ( (LA13_166=='r') ) {
                                    int LA13_188 = input.LA(8);

                                    if ( (LA13_188=='_') ) {
                                        int LA13_204 = input.LA(9);

                                        if ( (LA13_204=='t') ) {
                                            int LA13_216 = input.LA(10);

                                            if ( ((LA13_216>='0' && LA13_216<='9')||(LA13_216>='A' && LA13_216<='Z')||LA13_216=='_'||(LA13_216>='a' && LA13_216<='z')) ) {
                                                alt13=50;
                                            }
                                            else {
                                                alt13=45;}
                                        }
                                        else {
                                            alt13=50;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                            }
                            break;
                        default:
                            alt13=50;}

                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA13_83 = input.LA(4);

                    if ( (LA13_83=='a') ) {
                        int LA13_106 = input.LA(5);

                        if ( (LA13_106=='n') ) {
                            int LA13_138 = input.LA(6);

                            if ( (LA13_138=='a') ) {
                                int LA13_167 = input.LA(7);

                                if ( (LA13_167=='g') ) {
                                    int LA13_189 = input.LA(8);

                                    if ( (LA13_189=='e') ) {
                                        int LA13_205 = input.LA(9);

                                        if ( (LA13_205=='d') ) {
                                            int LA13_217 = input.LA(10);

                                            if ( ((LA13_217>='0' && LA13_217<='9')||(LA13_217>='A' && LA13_217<='Z')||LA13_217=='_'||(LA13_217>='a' && LA13_217<='z')) ) {
                                                alt13=50;
                                            }
                                            else {
                                                alt13=19;}
                                        }
                                        else {
                                            alt13=50;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                    }
                    break;
                case 's':
                    {
                    int LA13_84 = input.LA(4);

                    if ( (LA13_84=='i') ) {
                        int LA13_107 = input.LA(5);

                        if ( (LA13_107=='g') ) {
                            int LA13_139 = input.LA(6);

                            if ( (LA13_139=='n') ) {
                                int LA13_168 = input.LA(7);

                                if ( (LA13_168=='e') ) {
                                    int LA13_190 = input.LA(8);

                                    if ( (LA13_190=='d') ) {
                                        int LA13_206 = input.LA(9);

                                        if ( ((LA13_206>='0' && LA13_206<='9')||(LA13_206>='A' && LA13_206<='Z')||LA13_206=='_'||(LA13_206>='a' && LA13_206<='z')) ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=34;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_85 = input.LA(4);

                    if ( (LA13_85=='o') ) {
                        int LA13_108 = input.LA(5);

                        if ( (LA13_108=='n') ) {
                            int LA13_140 = input.LA(6);

                            if ( ((LA13_140>='0' && LA13_140<='9')||(LA13_140>='A' && LA13_140<='Z')||LA13_140=='_'||(LA13_140>='a' && LA13_140<='z')) ) {
                                alt13=50;
                            }
                            else {
                                alt13=6;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                    }
                    break;
                default:
                    alt13=50;}

                }
                break;
            default:
                alt13=50;}

        }
        else if ( (LA13_0==':') ) {
            alt13=7;
        }
        else if ( (LA13_0=='e') ) {
            int LA13_8 = input.LA(2);

            if ( (LA13_8=='n') ) {
                int LA13_48 = input.LA(3);

                if ( (LA13_48=='u') ) {
                    int LA13_86 = input.LA(4);

                    if ( (LA13_86=='m') ) {
                        int LA13_109 = input.LA(5);

                        if ( ((LA13_109>='0' && LA13_109<='9')||(LA13_109>='A' && LA13_109<='Z')||LA13_109=='_'||(LA13_109>='a' && LA13_109<='z')) ) {
                            alt13=50;
                        }
                        else {
                            alt13=8;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0==',') ) {
            alt13=9;
        }
        else if ( (LA13_0=='=') ) {
            alt13=10;
        }
        else if ( (LA13_0=='*') ) {
            alt13=11;
        }
        else if ( (LA13_0=='(') ) {
            alt13=12;
        }
        else if ( (LA13_0==')') ) {
            alt13=13;
        }
        else if ( (LA13_0=='[') ) {
            alt13=14;
        }
        else if ( (LA13_0==']') ) {
            alt13=15;
        }
        else if ( (LA13_0=='.') ) {
            int LA13_16 = input.LA(2);

            if ( (LA13_16=='.') ) {
                alt13=21;
            }
            else {
                alt13=16;}
        }
        else if ( (LA13_0=='#') ) {
            switch ( input.LA(2) ) {
            case 'd':
                {
                alt13=17;
                }
                break;
            case 'i':
                {
                alt13=22;
                }
                break;
            default:
                alt13=56;}

        }
        else if ( (LA13_0=='i') ) {
            int LA13_18 = input.LA(2);

            if ( (LA13_18=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case '6':
                        {
                        int LA13_110 = input.LA(5);

                        if ( (LA13_110=='4') ) {
                            int LA13_142 = input.LA(6);

                            if ( (LA13_142=='_') ) {
                                int LA13_170 = input.LA(7);

                                if ( (LA13_170=='t') ) {
                                    int LA13_191 = input.LA(8);

                                    if ( ((LA13_191>='0' && LA13_191<='9')||(LA13_191>='A' && LA13_191<='Z')||LA13_191=='_'||(LA13_191>='a' && LA13_191<='z')) ) {
                                        alt13=50;
                                    }
                                    else {
                                        alt13=42;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case '1':
                        {
                        int LA13_111 = input.LA(5);

                        if ( (LA13_111=='6') ) {
                            int LA13_143 = input.LA(6);

                            if ( (LA13_143=='_') ) {
                                int LA13_171 = input.LA(7);

                                if ( (LA13_171=='t') ) {
                                    int LA13_192 = input.LA(8);

                                    if ( ((LA13_192>='0' && LA13_192<='9')||(LA13_192>='A' && LA13_192<='Z')||LA13_192=='_'||(LA13_192>='a' && LA13_192<='z')) ) {
                                        alt13=50;
                                    }
                                    else {
                                        alt13=38;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case 'p':
                        {
                        int LA13_112 = input.LA(5);

                        if ( (LA13_112=='t') ) {
                            int LA13_144 = input.LA(6);

                            if ( (LA13_144=='r') ) {
                                int LA13_172 = input.LA(7);

                                if ( (LA13_172=='_') ) {
                                    int LA13_193 = input.LA(8);

                                    if ( (LA13_193=='t') ) {
                                        int LA13_209 = input.LA(9);

                                        if ( ((LA13_209>='0' && LA13_209<='9')||(LA13_209>='A' && LA13_209<='Z')||LA13_209=='_'||(LA13_209>='a' && LA13_209<='z')) ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=44;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case 'e':
                        {
                        int LA13_113 = input.LA(5);

                        if ( (LA13_113=='r') ) {
                            int LA13_145 = input.LA(6);

                            if ( (LA13_145=='f') ) {
                                int LA13_173 = input.LA(7);

                                if ( (LA13_173=='a') ) {
                                    int LA13_194 = input.LA(8);

                                    if ( (LA13_194=='c') ) {
                                        int LA13_210 = input.LA(9);

                                        if ( (LA13_210=='e') ) {
                                            int LA13_220 = input.LA(10);

                                            if ( ((LA13_220>='0' && LA13_220<='9')||(LA13_220>='A' && LA13_220<='Z')||LA13_220=='_'||(LA13_220>='a' && LA13_220<='z')) ) {
                                                alt13=50;
                                            }
                                            else {
                                                alt13=18;}
                                        }
                                        else {
                                            alt13=50;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case '3':
                        {
                        int LA13_114 = input.LA(5);

                        if ( (LA13_114=='2') ) {
                            int LA13_146 = input.LA(6);

                            if ( (LA13_146=='_') ) {
                                int LA13_174 = input.LA(7);

                                if ( (LA13_174=='t') ) {
                                    int LA13_195 = input.LA(8);

                                    if ( ((LA13_195>='0' && LA13_195<='9')||(LA13_195>='A' && LA13_195<='Z')||LA13_195=='_'||(LA13_195>='a' && LA13_195<='z')) ) {
                                        alt13=50;
                                    }
                                    else {
                                        alt13=40;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case '8':
                        {
                        int LA13_115 = input.LA(5);

                        if ( (LA13_115=='_') ) {
                            int LA13_147 = input.LA(6);

                            if ( (LA13_147=='t') ) {
                                int LA13_175 = input.LA(7);

                                if ( ((LA13_175>='0' && LA13_175<='9')||(LA13_175>='A' && LA13_175<='Z')||LA13_175=='_'||(LA13_175>='a' && LA13_175<='z')) ) {
                                    alt13=50;
                                }
                                else {
                                    alt13=36;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                        }
                        break;
                    case '0':
                    case '2':
                    case '4':
                    case '5':
                    case '7':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt13=50;
                        }
                        break;
                    default:
                        alt13=29;}

                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=50;
                    }
                    break;
                default:
                    alt13=46;}

            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='v') ) {
            int LA13_19 = input.LA(2);

            if ( (LA13_19=='o') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA13_89 = input.LA(4);

                    if ( (LA13_89=='a') ) {
                        int LA13_117 = input.LA(5);

                        if ( (LA13_117=='t') ) {
                            int LA13_148 = input.LA(6);

                            if ( (LA13_148=='i') ) {
                                int LA13_176 = input.LA(7);

                                if ( (LA13_176=='l') ) {
                                    int LA13_197 = input.LA(8);

                                    if ( (LA13_197=='e') ) {
                                        int LA13_212 = input.LA(9);

                                        if ( ((LA13_212>='0' && LA13_212<='9')||(LA13_212>='A' && LA13_212<='Z')||LA13_212=='_'||(LA13_212>='a' && LA13_212<='z')) ) {
                                            alt13=50;
                                        }
                                        else {
                                            alt13=26;}
                                    }
                                    else {
                                        alt13=50;}
                                }
                                else {
                                    alt13=50;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_90 = input.LA(4);

                    if ( (LA13_90=='d') ) {
                        int LA13_118 = input.LA(5);

                        if ( ((LA13_118>='0' && LA13_118<='9')||(LA13_118>='A' && LA13_118<='Z')||LA13_118=='_'||(LA13_118>='a' && LA13_118<='z')) ) {
                            alt13=50;
                        }
                        else {
                            alt13=20;}
                    }
                    else {
                        alt13=50;}
                    }
                    break;
                default:
                    alt13=50;}

            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='@') ) {
            alt13=23;
        }
        else if ( (LA13_0=='n') ) {
            int LA13_21 = input.LA(2);

            if ( (LA13_21=='u') ) {
                int LA13_63 = input.LA(3);

                if ( (LA13_63=='l') ) {
                    int LA13_91 = input.LA(4);

                    if ( (LA13_91=='l') ) {
                        int LA13_119 = input.LA(5);

                        if ( ((LA13_119>='0' && LA13_119<='9')||(LA13_119>='A' && LA13_119<='Z')||LA13_119=='_'||(LA13_119>='a' && LA13_119<='z')) ) {
                            alt13=50;
                        }
                        else {
                            alt13=24;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_64 = input.LA(3);

                if ( (LA13_64=='n') ) {
                    int LA13_92 = input.LA(4);

                    if ( (LA13_92=='s') ) {
                        int LA13_120 = input.LA(5);

                        if ( (LA13_120=='t') ) {
                            int LA13_151 = input.LA(6);

                            if ( ((LA13_151>='0' && LA13_151<='9')||(LA13_151>='A' && LA13_151<='Z')||LA13_151=='_'||(LA13_151>='a' && LA13_151<='z')) ) {
                                alt13=50;
                            }
                            else {
                                alt13=25;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            case 'h':
                {
                int LA13_65 = input.LA(3);

                if ( (LA13_65=='a') ) {
                    int LA13_93 = input.LA(4);

                    if ( (LA13_93=='r') ) {
                        int LA13_121 = input.LA(5);

                        if ( ((LA13_121>='0' && LA13_121<='9')||(LA13_121>='A' && LA13_121<='Z')||LA13_121=='_'||(LA13_121>='a' && LA13_121<='z')) ) {
                            alt13=50;
                        }
                        else {
                            alt13=27;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            default:
                alt13=50;}

        }
        else if ( (LA13_0=='l') ) {
            int LA13_23 = input.LA(2);

            if ( (LA13_23=='o') ) {
                int LA13_66 = input.LA(3);

                if ( (LA13_66=='n') ) {
                    int LA13_94 = input.LA(4);

                    if ( (LA13_94=='g') ) {
                        int LA13_122 = input.LA(5);

                        if ( ((LA13_122>='0' && LA13_122<='9')||(LA13_122>='A' && LA13_122<='Z')||LA13_122=='_'||(LA13_122>='a' && LA13_122<='z')) ) {
                            alt13=50;
                        }
                        else {
                            alt13=30;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_67 = input.LA(3);

                if ( (LA13_67=='l') ) {
                    int LA13_95 = input.LA(4);

                    if ( (LA13_95=='s') ) {
                        int LA13_123 = input.LA(5);

                        if ( (LA13_123=='e') ) {
                            int LA13_154 = input.LA(6);

                            if ( ((LA13_154>='0' && LA13_154<='9')||(LA13_154>='A' && LA13_154<='Z')||LA13_154=='_'||(LA13_154>='a' && LA13_154<='z')) ) {
                                alt13=50;
                            }
                            else {
                                alt13=49;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            case 'l':
                {
                int LA13_68 = input.LA(3);

                if ( (LA13_68=='o') ) {
                    int LA13_96 = input.LA(4);

                    if ( (LA13_96=='a') ) {
                        int LA13_124 = input.LA(5);

                        if ( (LA13_124=='t') ) {
                            int LA13_155 = input.LA(6);

                            if ( ((LA13_155>='0' && LA13_155<='9')||(LA13_155>='A' && LA13_155<='Z')||LA13_155=='_'||(LA13_155>='a' && LA13_155<='z')) ) {
                                alt13=50;
                            }
                            else {
                                alt13=31;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
                }
                break;
            default:
                alt13=50;}

        }
        else if ( (LA13_0=='d') ) {
            int LA13_25 = input.LA(2);

            if ( (LA13_25=='o') ) {
                int LA13_69 = input.LA(3);

                if ( (LA13_69=='u') ) {
                    int LA13_97 = input.LA(4);

                    if ( (LA13_97=='b') ) {
                        int LA13_125 = input.LA(5);

                        if ( (LA13_125=='l') ) {
                            int LA13_156 = input.LA(6);

                            if ( (LA13_156=='e') ) {
                                int LA13_179 = input.LA(7);

                                if ( ((LA13_179>='0' && LA13_179<='9')||(LA13_179>='A' && LA13_179<='Z')||LA13_179=='_'||(LA13_179>='a' && LA13_179<='z')) ) {
                                    alt13=50;
                                }
                                else {
                                    alt13=32;}
                            }
                            else {
                                alt13=50;}
                        }
                        else {
                            alt13=50;}
                    }
                    else {
                        alt13=50;}
                }
                else {
                    alt13=50;}
            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='o') ) {
            int LA13_26 = input.LA(2);

            if ( (LA13_26=='u') ) {
                int LA13_70 = input.LA(3);

                if ( (LA13_70=='t') ) {
                    int LA13_98 = input.LA(4);

                    if ( ((LA13_98>='0' && LA13_98<='9')||(LA13_98>='A' && LA13_98<='Z')||LA13_98=='_'||(LA13_98>='a' && LA13_98<='z')) ) {
                        alt13=50;
                    }
                    else {
                        alt13=47;}
                }
                else {
                    alt13=50;}
            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='<') ) {
            int LA13_27 = input.LA(2);

            if ( ((LA13_27>='A' && LA13_27<='Z')||(LA13_27>='^' && LA13_27<='_')||(LA13_27>='a' && LA13_27<='z')) ) {
                alt13=48;
            }
            else {
                alt13=56;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_28 = input.LA(2);

            if ( ((LA13_28>='A' && LA13_28<='Z')||LA13_28=='_'||(LA13_28>='a' && LA13_28<='z')) ) {
                alt13=50;
            }
            else {
                alt13=56;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='m'||(LA13_0>='p' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=50;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=51;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_31 = input.LA(2);

            if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFE')) ) {
                alt13=52;
            }
            else {
                alt13=56;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_32 = input.LA(2);

            if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFE')) ) {
                alt13=52;
            }
            else {
                alt13=56;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt13=53;
                }
                break;
            case '/':
                {
                alt13=54;
                }
                break;
            default:
                alt13=56;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=55;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||LA13_0=='+'||LA13_0=='-'||(LA13_0>='>' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=56;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:158: T50
                {
                mT50(); 

                }
                break;
            case 39 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:162: T51
                {
                mT51(); 

                }
                break;
            case 40 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:166: T52
                {
                mT52(); 

                }
                break;
            case 41 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:170: T53
                {
                mT53(); 

                }
                break;
            case 42 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:174: T54
                {
                mT54(); 

                }
                break;
            case 43 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:178: T55
                {
                mT55(); 

                }
                break;
            case 44 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:182: T56
                {
                mT56(); 

                }
                break;
            case 45 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:186: T57
                {
                mT57(); 

                }
                break;
            case 46 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:190: T58
                {
                mT58(); 

                }
                break;
            case 47 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:194: T59
                {
                mT59(); 

                }
                break;
            case 48 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:198: RULE_INCLUDELIB
                {
                mRULE_INCLUDELIB(); 

                }
                break;
            case 49 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:214: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 50 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:227: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:256: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:272: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:288: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1:296: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}