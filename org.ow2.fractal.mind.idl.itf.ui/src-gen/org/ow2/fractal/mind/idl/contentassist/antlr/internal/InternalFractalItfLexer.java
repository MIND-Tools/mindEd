package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalItfLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int RULE_INT=4;
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
    public static final int Tokens=58;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=6;
    public static final int T50=50;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T57=57;
    public InternalFractalItfLexer() {;} 
    public InternalFractalItfLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:10:5: ( 'struct' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:10:7: 'struct'
            {
            match("struct"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:11:5: ( 'union' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:11:7: 'union'
            {
            match("union"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:12:5: ( 'const' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:12:7: 'const'
            {
            match("const"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:13:5: ( 'volatile' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:13:7: 'volatile'
            {
            match("volatile"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:14:5: ( 'void' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:14:7: 'void'
            {
            match("void"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:15:5: ( 'char' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:15:7: 'char'
            {
            match("char"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:16:5: ( 'short' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:16:7: 'short'
            {
            match("short"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:17:5: ( 'int' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:17:7: 'int'
            {
            match("int"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:18:5: ( 'long' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:18:7: 'long'
            {
            match("long"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:19:5: ( 'float' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:19:7: 'float'
            {
            match("float"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:20:5: ( 'double' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:20:7: 'double'
            {
            match("double"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:21:5: ( 'signed' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:21:7: 'signed'
            {
            match("signed"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:22:5: ( 'unsigned' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:22:7: 'unsigned'
            {
            match("unsigned"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:23:5: ( 'string' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:23:7: 'string'
            {
            match("string"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:24:5: ( 'int8_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:24:7: 'int8_t'
            {
            match("int8_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:25:5: ( 'uint8_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:25:7: 'uint8_t'
            {
            match("uint8_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:26:5: ( 'int16_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:26:7: 'int16_t'
            {
            match("int16_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:27:5: ( 'uint16_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:27:7: 'uint16_t'
            {
            match("uint16_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:28:5: ( 'int32_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:28:7: 'int32_t'
            {
            match("int32_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:29:5: ( 'uint32_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:29:7: 'uint32_t'
            {
            match("uint32_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:30:5: ( 'int64_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:30:7: 'int64_t'
            {
            match("int64_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:31:5: ( 'uint64_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:31:7: 'uint64_t'
            {
            match("uint64_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:32:5: ( 'intptr_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:32:7: 'intptr_t'
            {
            match("intptr_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:33:5: ( 'uintptr_t' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:33:7: 'uintptr_t'
            {
            match("uintptr_t"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:34:5: ( 'in' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:34:7: 'in'
            {
            match("in"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:35:5: ( 'out' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:35:7: 'out'
            {
            match("out"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:36:5: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:36:7: ';'
            {
            match(';'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:37:5: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:37:7: 'typedef'
            {
            match("typedef"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:38:5: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:38:7: '{'
            {
            match('{'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:39:5: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:39:7: '}'
            {
            match('}'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:40:5: ( ':' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:40:7: ':'
            {
            match(':'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:41:5: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:41:7: 'enum'
            {
            match("enum"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:42:5: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:42:7: ','
            {
            match(','); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:43:5: ( '=' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:43:7: '='
            {
            match('='); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:44:5: ( '*' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:44:7: '*'
            {
            match('*'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:45:5: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:45:7: '('
            {
            match('('); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:46:5: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:46:7: ')'
            {
            match(')'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:47:5: ( '[' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:47:7: '['
            {
            match('['); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:48:5: ( ']' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:48:7: ']'
            {
            match(']'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:49:5: ( '.' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:49:7: '.'
            {
            match('.'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:50:5: ( '#define' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:50:7: '#define'
            {
            match("#define"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:51:5: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:51:7: 'interface'
            {
            match("interface"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:52:5: ( 'unmanaged' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:52:7: 'unmanaged'
            {
            match("unmanaged"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:53:5: ( '...' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:53:7: '...'
            {
            match("..."); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:54:5: ( '#include' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:54:7: '#include'
            {
            match("#include"); 


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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:55:5: ( '<' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:55:7: '<'
            {
            match('<'); 

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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:56:5: ( '>' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:56:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3954:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3954:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3954:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3954:11: '^'
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

            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3954:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:
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
            	    break loop2;
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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3956:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3956:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3956:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3956:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3958:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3960:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3960:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3960:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3960:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3962:41: '\\r'
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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3964:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3964:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3964:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3966:16: ( . )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3966:18: .
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
        // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=54;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='o') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='r') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='t') ) {
                            int LA12_117 = input.LA(6);

                            if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                                alt12=48;
                            }
                            else {
                                alt12=7;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
                }
                break;
            case 't':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'u':
                        {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='c') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='t') ) {
                                int LA12_145 = input.LA(7);

                                if ( ((LA12_145>='0' && LA12_145<='9')||(LA12_145>='A' && LA12_145<='Z')||LA12_145=='_'||(LA12_145>='a' && LA12_145<='z')) ) {
                                    alt12=48;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    case 'i':
                        {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='n') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='g') ) {
                                int LA12_146 = input.LA(7);

                                if ( ((LA12_146>='0' && LA12_146<='9')||(LA12_146>='A' && LA12_146<='Z')||LA12_146=='_'||(LA12_146>='a' && LA12_146<='z')) ) {
                                    alt12=48;
                                }
                                else {
                                    alt12=14;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    default:
                        alt12=48;}

                }
                else {
                    alt12=48;}
                }
                break;
            case 'i':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='g') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='n') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='e') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='d') ) {
                                int LA12_147 = input.LA(7);

                                if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                                    alt12=48;
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
                }
                break;
            default:
                alt12=48;}

        }
        else if ( (LA12_0=='u') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='o') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='n') ) {
                            int LA12_121 = input.LA(6);

                            if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                                alt12=48;
                            }
                            else {
                                alt12=2;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                    }
                    break;
                case 's':
                    {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='i') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='g') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='n') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='e') ) {
                                    int LA12_170 = input.LA(8);

                                    if ( (LA12_170=='d') ) {
                                        int LA12_186 = input.LA(9);

                                        if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                            alt12=48;
                                        }
                                        else {
                                            alt12=13;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='a') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='n') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='a') ) {
                                int LA12_150 = input.LA(7);

                                if ( (LA12_150=='g') ) {
                                    int LA12_171 = input.LA(8);

                                    if ( (LA12_171=='e') ) {
                                        int LA12_187 = input.LA(9);

                                        if ( (LA12_187=='d') ) {
                                            int LA12_201 = input.LA(10);

                                            if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                                                alt12=48;
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=48;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                    }
                    break;
                default:
                    alt12=48;}

                }
                break;
            case 'i':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='n') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='t') ) {
                        switch ( input.LA(5) ) {
                        case '3':
                            {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='2') ) {
                                int LA12_151 = input.LA(7);

                                if ( (LA12_151=='_') ) {
                                    int LA12_172 = input.LA(8);

                                    if ( (LA12_172=='t') ) {
                                        int LA12_188 = input.LA(9);

                                        if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                                            alt12=48;
                                        }
                                        else {
                                            alt12=20;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                            }
                            break;
                        case '1':
                            {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='6') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='_') ) {
                                    int LA12_173 = input.LA(8);

                                    if ( (LA12_173=='t') ) {
                                        int LA12_189 = input.LA(9);

                                        if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                                            alt12=48;
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                            }
                            break;
                        case '8':
                            {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='_') ) {
                                int LA12_153 = input.LA(7);

                                if ( (LA12_153=='t') ) {
                                    int LA12_174 = input.LA(8);

                                    if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
                                        alt12=48;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                            }
                            break;
                        case '6':
                            {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='4') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='_') ) {
                                    int LA12_175 = input.LA(8);

                                    if ( (LA12_175=='t') ) {
                                        int LA12_191 = input.LA(9);

                                        if ( ((LA12_191>='0' && LA12_191<='9')||(LA12_191>='A' && LA12_191<='Z')||LA12_191=='_'||(LA12_191>='a' && LA12_191<='z')) ) {
                                            alt12=48;
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                            }
                            break;
                        case 'p':
                            {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='t') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='r') ) {
                                    int LA12_176 = input.LA(8);

                                    if ( (LA12_176=='_') ) {
                                        int LA12_192 = input.LA(9);

                                        if ( (LA12_192=='t') ) {
                                            int LA12_205 = input.LA(10);

                                            if ( ((LA12_205>='0' && LA12_205<='9')||(LA12_205>='A' && LA12_205<='Z')||LA12_205=='_'||(LA12_205>='a' && LA12_205<='z')) ) {
                                                alt12=48;
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=48;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                            }
                            break;
                        default:
                            alt12=48;}

                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
                }
                break;
            default:
                alt12=48;}

        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='a') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='r') ) {
                        int LA12_100 = input.LA(5);

                        if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                            alt12=48;
                        }
                        else {
                            alt12=6;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
                }
                break;
            case 'o':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='n') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='s') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='t') ) {
                            int LA12_130 = input.LA(6);

                            if ( ((LA12_130>='0' && LA12_130<='9')||(LA12_130>='A' && LA12_130<='Z')||LA12_130=='_'||(LA12_130>='a' && LA12_130<='z')) ) {
                                alt12=48;
                            }
                            else {
                                alt12=3;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
                }
                break;
            default:
                alt12=48;}

        }
        else if ( (LA12_0=='v') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='d') ) {
                        int LA12_102 = input.LA(5);

                        if ( ((LA12_102>='0' && LA12_102<='9')||(LA12_102>='A' && LA12_102<='Z')||LA12_102=='_'||(LA12_102>='a' && LA12_102<='z')) ) {
                            alt12=48;
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=48;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='a') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='t') ) {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='i') ) {
                                int LA12_157 = input.LA(7);

                                if ( (LA12_157=='l') ) {
                                    int LA12_177 = input.LA(8);

                                    if ( (LA12_177=='e') ) {
                                        int LA12_193 = input.LA(9);

                                        if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                                            alt12=48;
                                        }
                                        else {
                                            alt12=4;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                    }
                    break;
                default:
                    alt12=48;}

            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='r') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='f') ) {
                                int LA12_158 = input.LA(7);

                                if ( (LA12_158=='a') ) {
                                    int LA12_178 = input.LA(8);

                                    if ( (LA12_178=='c') ) {
                                        int LA12_194 = input.LA(9);

                                        if ( (LA12_194=='e') ) {
                                            int LA12_207 = input.LA(10);

                                            if ( ((LA12_207>='0' && LA12_207<='9')||(LA12_207>='A' && LA12_207<='Z')||LA12_207=='_'||(LA12_207>='a' && LA12_207<='z')) ) {
                                                alt12=48;
                                            }
                                            else {
                                                alt12=42;}
                                        }
                                        else {
                                            alt12=48;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    case '8':
                        {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='_') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='t') ) {
                                int LA12_159 = input.LA(7);

                                if ( ((LA12_159>='0' && LA12_159<='9')||(LA12_159>='A' && LA12_159<='Z')||LA12_159=='_'||(LA12_159>='a' && LA12_159<='z')) ) {
                                    alt12=48;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    case 'p':
                        {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='t') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='r') ) {
                                int LA12_160 = input.LA(7);

                                if ( (LA12_160=='_') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( (LA12_180=='t') ) {
                                        int LA12_195 = input.LA(9);

                                        if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                            alt12=48;
                                        }
                                        else {
                                            alt12=23;}
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    case '6':
                        {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='4') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='_') ) {
                                int LA12_161 = input.LA(7);

                                if ( (LA12_161=='t') ) {
                                    int LA12_181 = input.LA(8);

                                    if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
                                        alt12=48;
                                    }
                                    else {
                                        alt12=21;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    case '3':
                        {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='2') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='_') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='t') ) {
                                    int LA12_182 = input.LA(8);

                                    if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                                        alt12=48;
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                        }
                        break;
                    case '1':
                        {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='6') ) {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='_') ) {
                                int LA12_163 = input.LA(7);

                                if ( (LA12_163=='t') ) {
                                    int LA12_183 = input.LA(8);

                                    if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                                        alt12=48;
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
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
                        alt12=48;
                        }
                        break;
                    default:
                        alt12=8;}

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
                    alt12=48;
                    }
                    break;
                default:
                    alt12=25;}

            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='o') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='n') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='g') ) {
                        int LA12_111 = input.LA(5);

                        if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                            alt12=48;
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='l') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='o') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='a') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='t') ) {
                            int LA12_140 = input.LA(6);

                            if ( ((LA12_140>='0' && LA12_140<='9')||(LA12_140>='A' && LA12_140<='Z')||LA12_140=='_'||(LA12_140>='a' && LA12_140<='z')) ) {
                                alt12=48;
                            }
                            else {
                                alt12=10;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='o') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='u') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='b') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='l') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='e') ) {
                                int LA12_165 = input.LA(7);

                                if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                                    alt12=48;
                                }
                                else {
                                    alt12=11;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='u') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='t') ) {
                    int LA12_89 = input.LA(4);

                    if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                        alt12=48;
                    }
                    else {
                        alt12=26;}
                }
                else {
                    alt12=48;}
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0==';') ) {
            alt12=27;
        }
        else if ( (LA12_0=='t') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='y') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='p') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='e') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='d') ) {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='e') ) {
                                int LA12_166 = input.LA(7);

                                if ( (LA12_166=='f') ) {
                                    int LA12_185 = input.LA(8);

                                    if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
                                        alt12=48;
                                    }
                                    else {
                                        alt12=28;}
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=29;
        }
        else if ( (LA12_0=='}') ) {
            alt12=30;
        }
        else if ( (LA12_0==':') ) {
            alt12=31;
        }
        else if ( (LA12_0=='e') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='u') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='m') ) {
                        int LA12_116 = input.LA(5);

                        if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                            alt12=48;
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=48;}
                }
                else {
                    alt12=48;}
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0==',') ) {
            alt12=33;
        }
        else if ( (LA12_0=='=') ) {
            alt12=34;
        }
        else if ( (LA12_0=='*') ) {
            alt12=35;
        }
        else if ( (LA12_0=='(') ) {
            alt12=36;
        }
        else if ( (LA12_0==')') ) {
            alt12=37;
        }
        else if ( (LA12_0=='[') ) {
            alt12=38;
        }
        else if ( (LA12_0==']') ) {
            alt12=39;
        }
        else if ( (LA12_0=='.') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='.') ) {
                alt12=44;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='#') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                alt12=45;
                }
                break;
            case 'd':
                {
                alt12=41;
                }
                break;
            default:
                alt12=54;}

        }
        else if ( (LA12_0=='<') ) {
            alt12=46;
        }
        else if ( (LA12_0=='>') ) {
            alt12=47;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='A' && LA12_27<='Z')||LA12_27=='_'||(LA12_27>='a' && LA12_27<='z')) ) {
                alt12=48;
            }
            else {
                alt12=54;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12=48;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=49;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_30 = input.LA(2);

            if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFE')) ) {
                alt12=50;
            }
            else {
                alt12=54;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_31 = input.LA(2);

            if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFE')) ) {
                alt12=50;
            }
            else {
                alt12=54;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=51;
                }
                break;
            case '/':
                {
                alt12=52;
                }
                break;
            default:
                alt12=54;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=53;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||LA12_0=='+'||LA12_0=='-'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=54;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:198: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:206: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:215: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:227: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:243: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:259: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1:267: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}