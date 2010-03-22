package org.ow2.fractal.mind.idl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalIdtLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=5;
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
    public static final int RULE_INCLUDELIB=8;
    public static final int RULE_INT=4;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=62;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_STRING=7;
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
    public InternalFractalIdtLexer() {;} 
    public InternalFractalIdtLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:10:5: ( 'struct' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:10:7: 'struct'
            {
            match("struct"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:11:5: ( 'union' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:11:7: 'union'
            {
            match("union"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:12:5: ( 'null' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:12:7: 'null'
            {
            match("null"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:13:5: ( 'const' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:13:7: 'const'
            {
            match("const"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:14:5: ( 'volatile' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:14:7: 'volatile'
            {
            match("volatile"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:15:5: ( 'void' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:15:7: 'void'
            {
            match("void"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:16:5: ( 'char' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:16:7: 'char'
            {
            match("char"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:17:5: ( 'short' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:17:7: 'short'
            {
            match("short"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:18:5: ( 'int' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:18:7: 'int'
            {
            match("int"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:19:5: ( 'long' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:19:7: 'long'
            {
            match("long"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:20:5: ( 'float' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:20:7: 'float'
            {
            match("float"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:21:5: ( 'double' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:21:7: 'double'
            {
            match("double"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:22:5: ( 'signed' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:22:7: 'signed'
            {
            match("signed"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:23:5: ( 'unsigned' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:23:7: 'unsigned'
            {
            match("unsigned"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:24:5: ( 'string' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:24:7: 'string'
            {
            match("string"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:25:5: ( 'int8_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:25:7: 'int8_t'
            {
            match("int8_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:26:5: ( 'uint8_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:26:7: 'uint8_t'
            {
            match("uint8_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:27:5: ( 'int16_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:27:7: 'int16_t'
            {
            match("int16_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:28:5: ( 'uint16_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:28:7: 'uint16_t'
            {
            match("uint16_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:29:5: ( 'int32_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:29:7: 'int32_t'
            {
            match("int32_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:30:5: ( 'uint32_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:30:7: 'uint32_t'
            {
            match("uint32_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:31:5: ( 'int64_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:31:7: 'int64_t'
            {
            match("int64_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:32:5: ( 'uint64_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:32:7: 'uint64_t'
            {
            match("uint64_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:33:5: ( 'intptr_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:33:7: 'intptr_t'
            {
            match("intptr_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:34:5: ( 'uintptr_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:34:7: 'uintptr_t'
            {
            match("uintptr_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:35:5: ( 'in' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:35:7: 'in'
            {
            match("in"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:36:5: ( 'out' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:36:7: 'out'
            {
            match("out"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:37:5: ( '#ifndef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:37:7: '#ifndef'
            {
            match("#ifndef"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:38:5: ( '#endif' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:38:7: '#endif'
            {
            match("#endif"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:39:5: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:39:7: ';'
            {
            match(';'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:40:5: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:40:7: 'typedef'
            {
            match("typedef"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:41:5: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:41:7: '{'
            {
            match('{'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:42:5: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:42:7: '}'
            {
            match('}'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:43:5: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:43:7: ':'
            {
            match(':'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:44:5: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:44:7: 'enum'
            {
            match("enum"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:45:5: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:45:7: ','
            {
            match(','); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:46:5: ( '=' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:46:7: '='
            {
            match('='); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:47:5: ( '*' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:47:7: '*'
            {
            match('*'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:48:5: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:48:7: '('
            {
            match('('); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:49:5: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:49:7: ')'
            {
            match(')'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:50:5: ( '[' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:50:7: '['
            {
            match('['); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:51:5: ( ']' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:51:7: ']'
            {
            match(']'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:52:5: ( '.' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:52:7: '.'
            {
            match('.'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:53:5: ( '#define' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:53:7: '#define'
            {
            match("#define"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:54:5: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:54:7: 'interface'
            {
            match("interface"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:55:5: ( 'unmanaged' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:55:7: 'unmanaged'
            {
            match("unmanaged"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:56:5: ( '...' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:56:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:57:5: ( '#include' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:57:7: '#include'
            {
            match("#include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:58:5: ( '@' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:58:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start RULE_INCLUDELIB
    public final void mRULE_INCLUDELIB() throws RecognitionException {
        try {
            int _type = RULE_INCLUDELIB;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5084:17: ( '<' RULE_ID '.' RULE_ID '>' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5084:19: '<' RULE_ID '.' RULE_ID '>'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5086:14: ( ( 'true' | 'false' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5086:16: ( 'true' | 'false' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5086:16: ( 'true' | 'false' )
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
                    new NoViableAltException("5086:16: ( 'true' | 'false' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5086:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5086:24: 'false'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5088:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5088:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5088:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5088:11: '^'
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

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5088:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5090:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5090:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5090:12: ( '0' .. '9' )+
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
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5090:13: '0' .. '9'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("5092:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5092:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5094:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5094:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5094:24: ( options {greedy=false; } : . )*
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
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5094:52: .
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5096:41: '\\r'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5098:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5098:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5098:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5100:16: ( . )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5100:18: .
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
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=58;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA13_36 = input.LA(3);

                if ( (LA13_36=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA13_102 = input.LA(5);

                        if ( (LA13_102=='n') ) {
                            int LA13_130 = input.LA(6);

                            if ( (LA13_130=='g') ) {
                                int LA13_160 = input.LA(7);

                                if ( ((LA13_160>='0' && LA13_160<='9')||(LA13_160>='A' && LA13_160<='Z')||LA13_160=='_'||(LA13_160>='a' && LA13_160<='z')) ) {
                                    alt13=52;
                                }
                                else {
                                    alt13=15;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    case 'u':
                        {
                        int LA13_103 = input.LA(5);

                        if ( (LA13_103=='c') ) {
                            int LA13_131 = input.LA(6);

                            if ( (LA13_131=='t') ) {
                                int LA13_161 = input.LA(7);

                                if ( ((LA13_161>='0' && LA13_161<='9')||(LA13_161>='A' && LA13_161<='Z')||LA13_161=='_'||(LA13_161>='a' && LA13_161<='z')) ) {
                                    alt13=52;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    default:
                        alt13=52;}

                }
                else {
                    alt13=52;}
                }
                break;
            case 'i':
                {
                int LA13_37 = input.LA(3);

                if ( (LA13_37=='g') ) {
                    int LA13_79 = input.LA(4);

                    if ( (LA13_79=='n') ) {
                        int LA13_104 = input.LA(5);

                        if ( (LA13_104=='e') ) {
                            int LA13_132 = input.LA(6);

                            if ( (LA13_132=='d') ) {
                                int LA13_162 = input.LA(7);

                                if ( ((LA13_162>='0' && LA13_162<='9')||(LA13_162>='A' && LA13_162<='Z')||LA13_162=='_'||(LA13_162>='a' && LA13_162<='z')) ) {
                                    alt13=52;
                                }
                                else {
                                    alt13=13;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            case 'h':
                {
                int LA13_38 = input.LA(3);

                if ( (LA13_38=='o') ) {
                    int LA13_80 = input.LA(4);

                    if ( (LA13_80=='r') ) {
                        int LA13_105 = input.LA(5);

                        if ( (LA13_105=='t') ) {
                            int LA13_133 = input.LA(6);

                            if ( ((LA13_133>='0' && LA13_133<='9')||(LA13_133>='A' && LA13_133<='Z')||LA13_133=='_'||(LA13_133>='a' && LA13_133<='z')) ) {
                                alt13=52;
                            }
                            else {
                                alt13=8;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            default:
                alt13=52;}

        }
        else if ( (LA13_0=='u') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA13_81 = input.LA(4);

                    if ( (LA13_81=='o') ) {
                        int LA13_106 = input.LA(5);

                        if ( (LA13_106=='n') ) {
                            int LA13_134 = input.LA(6);

                            if ( ((LA13_134>='0' && LA13_134<='9')||(LA13_134>='A' && LA13_134<='Z')||LA13_134=='_'||(LA13_134>='a' && LA13_134<='z')) ) {
                                alt13=52;
                            }
                            else {
                                alt13=2;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                    }
                    break;
                case 's':
                    {
                    int LA13_82 = input.LA(4);

                    if ( (LA13_82=='i') ) {
                        int LA13_107 = input.LA(5);

                        if ( (LA13_107=='g') ) {
                            int LA13_135 = input.LA(6);

                            if ( (LA13_135=='n') ) {
                                int LA13_165 = input.LA(7);

                                if ( (LA13_165=='e') ) {
                                    int LA13_186 = input.LA(8);

                                    if ( (LA13_186=='d') ) {
                                        int LA13_202 = input.LA(9);

                                        if ( ((LA13_202>='0' && LA13_202<='9')||(LA13_202>='A' && LA13_202<='Z')||LA13_202=='_'||(LA13_202>='a' && LA13_202<='z')) ) {
                                            alt13=52;
                                        }
                                        else {
                                            alt13=14;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                    }
                    break;
                case 'm':
                    {
                    int LA13_83 = input.LA(4);

                    if ( (LA13_83=='a') ) {
                        int LA13_108 = input.LA(5);

                        if ( (LA13_108=='n') ) {
                            int LA13_136 = input.LA(6);

                            if ( (LA13_136=='a') ) {
                                int LA13_166 = input.LA(7);

                                if ( (LA13_166=='g') ) {
                                    int LA13_187 = input.LA(8);

                                    if ( (LA13_187=='e') ) {
                                        int LA13_203 = input.LA(9);

                                        if ( (LA13_203=='d') ) {
                                            int LA13_217 = input.LA(10);

                                            if ( ((LA13_217>='0' && LA13_217<='9')||(LA13_217>='A' && LA13_217<='Z')||LA13_217=='_'||(LA13_217>='a' && LA13_217<='z')) ) {
                                                alt13=52;
                                            }
                                            else {
                                                alt13=46;}
                                        }
                                        else {
                                            alt13=52;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                    }
                    break;
                default:
                    alt13=52;}

                }
                break;
            case 'i':
                {
                int LA13_41 = input.LA(3);

                if ( (LA13_41=='n') ) {
                    int LA13_84 = input.LA(4);

                    if ( (LA13_84=='t') ) {
                        switch ( input.LA(5) ) {
                        case '3':
                            {
                            int LA13_137 = input.LA(6);

                            if ( (LA13_137=='2') ) {
                                int LA13_167 = input.LA(7);

                                if ( (LA13_167=='_') ) {
                                    int LA13_188 = input.LA(8);

                                    if ( (LA13_188=='t') ) {
                                        int LA13_204 = input.LA(9);

                                        if ( ((LA13_204>='0' && LA13_204<='9')||(LA13_204>='A' && LA13_204<='Z')||LA13_204=='_'||(LA13_204>='a' && LA13_204<='z')) ) {
                                            alt13=52;
                                        }
                                        else {
                                            alt13=21;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                            }
                            break;
                        case '6':
                            {
                            int LA13_138 = input.LA(6);

                            if ( (LA13_138=='4') ) {
                                int LA13_168 = input.LA(7);

                                if ( (LA13_168=='_') ) {
                                    int LA13_189 = input.LA(8);

                                    if ( (LA13_189=='t') ) {
                                        int LA13_205 = input.LA(9);

                                        if ( ((LA13_205>='0' && LA13_205<='9')||(LA13_205>='A' && LA13_205<='Z')||LA13_205=='_'||(LA13_205>='a' && LA13_205<='z')) ) {
                                            alt13=52;
                                        }
                                        else {
                                            alt13=23;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                            }
                            break;
                        case '1':
                            {
                            int LA13_139 = input.LA(6);

                            if ( (LA13_139=='6') ) {
                                int LA13_169 = input.LA(7);

                                if ( (LA13_169=='_') ) {
                                    int LA13_190 = input.LA(8);

                                    if ( (LA13_190=='t') ) {
                                        int LA13_206 = input.LA(9);

                                        if ( ((LA13_206>='0' && LA13_206<='9')||(LA13_206>='A' && LA13_206<='Z')||LA13_206=='_'||(LA13_206>='a' && LA13_206<='z')) ) {
                                            alt13=52;
                                        }
                                        else {
                                            alt13=19;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                            }
                            break;
                        case 'p':
                            {
                            int LA13_140 = input.LA(6);

                            if ( (LA13_140=='t') ) {
                                int LA13_170 = input.LA(7);

                                if ( (LA13_170=='r') ) {
                                    int LA13_191 = input.LA(8);

                                    if ( (LA13_191=='_') ) {
                                        int LA13_207 = input.LA(9);

                                        if ( (LA13_207=='t') ) {
                                            int LA13_221 = input.LA(10);

                                            if ( ((LA13_221>='0' && LA13_221<='9')||(LA13_221>='A' && LA13_221<='Z')||LA13_221=='_'||(LA13_221>='a' && LA13_221<='z')) ) {
                                                alt13=52;
                                            }
                                            else {
                                                alt13=25;}
                                        }
                                        else {
                                            alt13=52;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                            }
                            break;
                        case '8':
                            {
                            int LA13_141 = input.LA(6);

                            if ( (LA13_141=='_') ) {
                                int LA13_171 = input.LA(7);

                                if ( (LA13_171=='t') ) {
                                    int LA13_192 = input.LA(8);

                                    if ( ((LA13_192>='0' && LA13_192<='9')||(LA13_192>='A' && LA13_192<='Z')||LA13_192=='_'||(LA13_192>='a' && LA13_192<='z')) ) {
                                        alt13=52;
                                    }
                                    else {
                                        alt13=17;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                            }
                            break;
                        default:
                            alt13=52;}

                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            default:
                alt13=52;}

        }
        else if ( (LA13_0=='n') ) {
            int LA13_3 = input.LA(2);

            if ( (LA13_3=='u') ) {
                int LA13_42 = input.LA(3);

                if ( (LA13_42=='l') ) {
                    int LA13_85 = input.LA(4);

                    if ( (LA13_85=='l') ) {
                        int LA13_110 = input.LA(5);

                        if ( ((LA13_110>='0' && LA13_110<='9')||(LA13_110>='A' && LA13_110<='Z')||LA13_110=='_'||(LA13_110>='a' && LA13_110<='z')) ) {
                            alt13=52;
                        }
                        else {
                            alt13=3;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA13_43 = input.LA(3);

                if ( (LA13_43=='a') ) {
                    int LA13_86 = input.LA(4);

                    if ( (LA13_86=='r') ) {
                        int LA13_111 = input.LA(5);

                        if ( ((LA13_111>='0' && LA13_111<='9')||(LA13_111>='A' && LA13_111<='Z')||LA13_111=='_'||(LA13_111>='a' && LA13_111<='z')) ) {
                            alt13=52;
                        }
                        else {
                            alt13=7;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            case 'o':
                {
                int LA13_44 = input.LA(3);

                if ( (LA13_44=='n') ) {
                    int LA13_87 = input.LA(4);

                    if ( (LA13_87=='s') ) {
                        int LA13_112 = input.LA(5);

                        if ( (LA13_112=='t') ) {
                            int LA13_144 = input.LA(6);

                            if ( ((LA13_144>='0' && LA13_144<='9')||(LA13_144>='A' && LA13_144<='Z')||LA13_144=='_'||(LA13_144>='a' && LA13_144<='z')) ) {
                                alt13=52;
                            }
                            else {
                                alt13=4;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            default:
                alt13=52;}

        }
        else if ( (LA13_0=='v') ) {
            int LA13_5 = input.LA(2);

            if ( (LA13_5=='o') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA13_88 = input.LA(4);

                    if ( (LA13_88=='a') ) {
                        int LA13_113 = input.LA(5);

                        if ( (LA13_113=='t') ) {
                            int LA13_145 = input.LA(6);

                            if ( (LA13_145=='i') ) {
                                int LA13_173 = input.LA(7);

                                if ( (LA13_173=='l') ) {
                                    int LA13_193 = input.LA(8);

                                    if ( (LA13_193=='e') ) {
                                        int LA13_209 = input.LA(9);

                                        if ( ((LA13_209>='0' && LA13_209<='9')||(LA13_209>='A' && LA13_209<='Z')||LA13_209=='_'||(LA13_209>='a' && LA13_209<='z')) ) {
                                            alt13=52;
                                        }
                                        else {
                                            alt13=5;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_89 = input.LA(4);

                    if ( (LA13_89=='d') ) {
                        int LA13_114 = input.LA(5);

                        if ( ((LA13_114>='0' && LA13_114<='9')||(LA13_114>='A' && LA13_114<='Z')||LA13_114=='_'||(LA13_114>='a' && LA13_114<='z')) ) {
                            alt13=52;
                        }
                        else {
                            alt13=6;}
                    }
                    else {
                        alt13=52;}
                    }
                    break;
                default:
                    alt13=52;}

            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0=='i') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'p':
                        {
                        int LA13_115 = input.LA(5);

                        if ( (LA13_115=='t') ) {
                            int LA13_147 = input.LA(6);

                            if ( (LA13_147=='r') ) {
                                int LA13_174 = input.LA(7);

                                if ( (LA13_174=='_') ) {
                                    int LA13_194 = input.LA(8);

                                    if ( (LA13_194=='t') ) {
                                        int LA13_210 = input.LA(9);

                                        if ( ((LA13_210>='0' && LA13_210<='9')||(LA13_210>='A' && LA13_210<='Z')||LA13_210=='_'||(LA13_210>='a' && LA13_210<='z')) ) {
                                            alt13=52;
                                        }
                                        else {
                                            alt13=24;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    case '1':
                        {
                        int LA13_116 = input.LA(5);

                        if ( (LA13_116=='6') ) {
                            int LA13_148 = input.LA(6);

                            if ( (LA13_148=='_') ) {
                                int LA13_175 = input.LA(7);

                                if ( (LA13_175=='t') ) {
                                    int LA13_195 = input.LA(8);

                                    if ( ((LA13_195>='0' && LA13_195<='9')||(LA13_195>='A' && LA13_195<='Z')||LA13_195=='_'||(LA13_195>='a' && LA13_195<='z')) ) {
                                        alt13=52;
                                    }
                                    else {
                                        alt13=18;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    case '8':
                        {
                        int LA13_117 = input.LA(5);

                        if ( (LA13_117=='_') ) {
                            int LA13_149 = input.LA(6);

                            if ( (LA13_149=='t') ) {
                                int LA13_176 = input.LA(7);

                                if ( ((LA13_176>='0' && LA13_176<='9')||(LA13_176>='A' && LA13_176<='Z')||LA13_176=='_'||(LA13_176>='a' && LA13_176<='z')) ) {
                                    alt13=52;
                                }
                                else {
                                    alt13=16;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    case 'e':
                        {
                        int LA13_118 = input.LA(5);

                        if ( (LA13_118=='r') ) {
                            int LA13_150 = input.LA(6);

                            if ( (LA13_150=='f') ) {
                                int LA13_177 = input.LA(7);

                                if ( (LA13_177=='a') ) {
                                    int LA13_197 = input.LA(8);

                                    if ( (LA13_197=='c') ) {
                                        int LA13_212 = input.LA(9);

                                        if ( (LA13_212=='e') ) {
                                            int LA13_224 = input.LA(10);

                                            if ( ((LA13_224>='0' && LA13_224<='9')||(LA13_224>='A' && LA13_224<='Z')||LA13_224=='_'||(LA13_224>='a' && LA13_224<='z')) ) {
                                                alt13=52;
                                            }
                                            else {
                                                alt13=45;}
                                        }
                                        else {
                                            alt13=52;}
                                    }
                                    else {
                                        alt13=52;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    case '3':
                        {
                        int LA13_119 = input.LA(5);

                        if ( (LA13_119=='2') ) {
                            int LA13_151 = input.LA(6);

                            if ( (LA13_151=='_') ) {
                                int LA13_178 = input.LA(7);

                                if ( (LA13_178=='t') ) {
                                    int LA13_198 = input.LA(8);

                                    if ( ((LA13_198>='0' && LA13_198<='9')||(LA13_198>='A' && LA13_198<='Z')||LA13_198=='_'||(LA13_198>='a' && LA13_198<='z')) ) {
                                        alt13=52;
                                    }
                                    else {
                                        alt13=20;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                        }
                        break;
                    case '6':
                        {
                        int LA13_120 = input.LA(5);

                        if ( (LA13_120=='4') ) {
                            int LA13_152 = input.LA(6);

                            if ( (LA13_152=='_') ) {
                                int LA13_179 = input.LA(7);

                                if ( (LA13_179=='t') ) {
                                    int LA13_199 = input.LA(8);

                                    if ( ((LA13_199>='0' && LA13_199<='9')||(LA13_199>='A' && LA13_199<='Z')||LA13_199=='_'||(LA13_199>='a' && LA13_199<='z')) ) {
                                        alt13=52;
                                    }
                                    else {
                                        alt13=22;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
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
                        alt13=52;
                        }
                        break;
                    default:
                        alt13=9;}

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
                    alt13=52;
                    }
                    break;
                default:
                    alt13=26;}

            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0=='l') ) {
            int LA13_7 = input.LA(2);

            if ( (LA13_7=='o') ) {
                int LA13_47 = input.LA(3);

                if ( (LA13_47=='n') ) {
                    int LA13_92 = input.LA(4);

                    if ( (LA13_92=='g') ) {
                        int LA13_122 = input.LA(5);

                        if ( ((LA13_122>='0' && LA13_122<='9')||(LA13_122>='A' && LA13_122<='Z')||LA13_122=='_'||(LA13_122>='a' && LA13_122<='z')) ) {
                            alt13=52;
                        }
                        else {
                            alt13=10;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_48 = input.LA(3);

                if ( (LA13_48=='l') ) {
                    int LA13_93 = input.LA(4);

                    if ( (LA13_93=='s') ) {
                        int LA13_123 = input.LA(5);

                        if ( (LA13_123=='e') ) {
                            int LA13_154 = input.LA(6);

                            if ( ((LA13_154>='0' && LA13_154<='9')||(LA13_154>='A' && LA13_154<='Z')||LA13_154=='_'||(LA13_154>='a' && LA13_154<='z')) ) {
                                alt13=52;
                            }
                            else {
                                alt13=51;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            case 'l':
                {
                int LA13_49 = input.LA(3);

                if ( (LA13_49=='o') ) {
                    int LA13_94 = input.LA(4);

                    if ( (LA13_94=='a') ) {
                        int LA13_124 = input.LA(5);

                        if ( (LA13_124=='t') ) {
                            int LA13_155 = input.LA(6);

                            if ( ((LA13_155>='0' && LA13_155<='9')||(LA13_155>='A' && LA13_155<='Z')||LA13_155=='_'||(LA13_155>='a' && LA13_155<='z')) ) {
                                alt13=52;
                            }
                            else {
                                alt13=11;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            default:
                alt13=52;}

        }
        else if ( (LA13_0=='d') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='o') ) {
                int LA13_50 = input.LA(3);

                if ( (LA13_50=='u') ) {
                    int LA13_95 = input.LA(4);

                    if ( (LA13_95=='b') ) {
                        int LA13_125 = input.LA(5);

                        if ( (LA13_125=='l') ) {
                            int LA13_156 = input.LA(6);

                            if ( (LA13_156=='e') ) {
                                int LA13_181 = input.LA(7);

                                if ( ((LA13_181>='0' && LA13_181<='9')||(LA13_181>='A' && LA13_181<='Z')||LA13_181=='_'||(LA13_181>='a' && LA13_181<='z')) ) {
                                    alt13=52;
                                }
                                else {
                                    alt13=12;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0=='o') ) {
            int LA13_10 = input.LA(2);

            if ( (LA13_10=='u') ) {
                int LA13_51 = input.LA(3);

                if ( (LA13_51=='t') ) {
                    int LA13_96 = input.LA(4);

                    if ( ((LA13_96>='0' && LA13_96<='9')||(LA13_96>='A' && LA13_96<='Z')||LA13_96=='_'||(LA13_96>='a' && LA13_96<='z')) ) {
                        alt13=52;
                    }
                    else {
                        alt13=27;}
                }
                else {
                    alt13=52;}
            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0=='#') ) {
            switch ( input.LA(2) ) {
            case 'd':
                {
                alt13=44;
                }
                break;
            case 'i':
                {
                int LA13_53 = input.LA(3);

                if ( (LA13_53=='n') ) {
                    alt13=48;
                }
                else if ( (LA13_53=='f') ) {
                    alt13=28;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 53, input);

                    throw nvae;
                }
                }
                break;
            case 'e':
                {
                alt13=29;
                }
                break;
            default:
                alt13=58;}

        }
        else if ( (LA13_0==';') ) {
            alt13=30;
        }
        else if ( (LA13_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA13_56 = input.LA(3);

                if ( (LA13_56=='p') ) {
                    int LA13_99 = input.LA(4);

                    if ( (LA13_99=='e') ) {
                        int LA13_127 = input.LA(5);

                        if ( (LA13_127=='d') ) {
                            int LA13_157 = input.LA(6);

                            if ( (LA13_157=='e') ) {
                                int LA13_182 = input.LA(7);

                                if ( (LA13_182=='f') ) {
                                    int LA13_201 = input.LA(8);

                                    if ( ((LA13_201>='0' && LA13_201<='9')||(LA13_201>='A' && LA13_201<='Z')||LA13_201=='_'||(LA13_201>='a' && LA13_201<='z')) ) {
                                        alt13=52;
                                    }
                                    else {
                                        alt13=31;}
                                }
                                else {
                                    alt13=52;}
                            }
                            else {
                                alt13=52;}
                        }
                        else {
                            alt13=52;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            case 'r':
                {
                int LA13_57 = input.LA(3);

                if ( (LA13_57=='u') ) {
                    int LA13_100 = input.LA(4);

                    if ( (LA13_100=='e') ) {
                        int LA13_128 = input.LA(5);

                        if ( ((LA13_128>='0' && LA13_128<='9')||(LA13_128>='A' && LA13_128<='Z')||LA13_128=='_'||(LA13_128>='a' && LA13_128<='z')) ) {
                            alt13=52;
                        }
                        else {
                            alt13=51;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
                }
                break;
            default:
                alt13=52;}

        }
        else if ( (LA13_0=='{') ) {
            alt13=32;
        }
        else if ( (LA13_0=='}') ) {
            alt13=33;
        }
        else if ( (LA13_0==':') ) {
            alt13=34;
        }
        else if ( (LA13_0=='e') ) {
            int LA13_17 = input.LA(2);

            if ( (LA13_17=='n') ) {
                int LA13_61 = input.LA(3);

                if ( (LA13_61=='u') ) {
                    int LA13_101 = input.LA(4);

                    if ( (LA13_101=='m') ) {
                        int LA13_129 = input.LA(5);

                        if ( ((LA13_129>='0' && LA13_129<='9')||(LA13_129>='A' && LA13_129<='Z')||LA13_129=='_'||(LA13_129>='a' && LA13_129<='z')) ) {
                            alt13=52;
                        }
                        else {
                            alt13=35;}
                    }
                    else {
                        alt13=52;}
                }
                else {
                    alt13=52;}
            }
            else {
                alt13=52;}
        }
        else if ( (LA13_0==',') ) {
            alt13=36;
        }
        else if ( (LA13_0=='=') ) {
            alt13=37;
        }
        else if ( (LA13_0=='*') ) {
            alt13=38;
        }
        else if ( (LA13_0=='(') ) {
            alt13=39;
        }
        else if ( (LA13_0==')') ) {
            alt13=40;
        }
        else if ( (LA13_0=='[') ) {
            alt13=41;
        }
        else if ( (LA13_0==']') ) {
            alt13=42;
        }
        else if ( (LA13_0=='.') ) {
            int LA13_25 = input.LA(2);

            if ( (LA13_25=='.') ) {
                alt13=47;
            }
            else {
                alt13=43;}
        }
        else if ( (LA13_0=='@') ) {
            alt13=49;
        }
        else if ( (LA13_0=='<') ) {
            int LA13_27 = input.LA(2);

            if ( ((LA13_27>='A' && LA13_27<='Z')||(LA13_27>='^' && LA13_27<='_')||(LA13_27>='a' && LA13_27<='z')) ) {
                alt13=50;
            }
            else {
                alt13=58;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_28 = input.LA(2);

            if ( ((LA13_28>='A' && LA13_28<='Z')||LA13_28=='_'||(LA13_28>='a' && LA13_28<='z')) ) {
                alt13=52;
            }
            else {
                alt13=58;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='m'||(LA13_0>='p' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=52;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=53;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_31 = input.LA(2);

            if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFE')) ) {
                alt13=54;
            }
            else {
                alt13=58;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_32 = input.LA(2);

            if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFE')) ) {
                alt13=54;
            }
            else {
                alt13=58;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=56;
                }
                break;
            case '*':
                {
                alt13=55;
                }
                break;
            default:
                alt13=58;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=57;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||LA13_0=='+'||LA13_0=='-'||(LA13_0>='>' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=58;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:158: T50
                {
                mT50(); 

                }
                break;
            case 39 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:162: T51
                {
                mT51(); 

                }
                break;
            case 40 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:166: T52
                {
                mT52(); 

                }
                break;
            case 41 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:170: T53
                {
                mT53(); 

                }
                break;
            case 42 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:174: T54
                {
                mT54(); 

                }
                break;
            case 43 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:178: T55
                {
                mT55(); 

                }
                break;
            case 44 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:182: T56
                {
                mT56(); 

                }
                break;
            case 45 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:186: T57
                {
                mT57(); 

                }
                break;
            case 46 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:190: T58
                {
                mT58(); 

                }
                break;
            case 47 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:194: T59
                {
                mT59(); 

                }
                break;
            case 48 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:198: T60
                {
                mT60(); 

                }
                break;
            case 49 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:202: T61
                {
                mT61(); 

                }
                break;
            case 50 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:206: RULE_INCLUDELIB
                {
                mRULE_INCLUDELIB(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:222: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:235: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:243: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:252: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:264: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:280: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:296: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:304: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}