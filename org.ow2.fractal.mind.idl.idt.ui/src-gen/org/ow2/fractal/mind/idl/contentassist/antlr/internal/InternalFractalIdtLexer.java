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
    public static final int T62=62;
    public static final int T63=63;
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
    public static final int Tokens=64;
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:13:5: ( '+' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:13:7: '+'
            {
            match('+'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:14:5: ( '-' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:14:7: '-'
            {
            match('-'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:15:5: ( 'const' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:15:7: 'const'
            {
            match("const"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:16:5: ( 'volatile' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:16:7: 'volatile'
            {
            match("volatile"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:17:5: ( 'void' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:17:7: 'void'
            {
            match("void"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:18:5: ( 'char' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:18:7: 'char'
            {
            match("char"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:19:5: ( 'short' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:19:7: 'short'
            {
            match("short"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:20:5: ( 'int' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:20:7: 'int'
            {
            match("int"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:21:5: ( 'long' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:21:7: 'long'
            {
            match("long"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:22:5: ( 'float' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:22:7: 'float'
            {
            match("float"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:23:5: ( 'double' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:23:7: 'double'
            {
            match("double"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:24:5: ( 'signed' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:24:7: 'signed'
            {
            match("signed"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:25:5: ( 'unsigned' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:25:7: 'unsigned'
            {
            match("unsigned"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:26:5: ( 'string' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:26:7: 'string'
            {
            match("string"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:27:5: ( 'int8_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:27:7: 'int8_t'
            {
            match("int8_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:28:5: ( 'uint8_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:28:7: 'uint8_t'
            {
            match("uint8_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:29:5: ( 'int16_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:29:7: 'int16_t'
            {
            match("int16_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:30:5: ( 'uint16_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:30:7: 'uint16_t'
            {
            match("uint16_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:31:5: ( 'int32_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:31:7: 'int32_t'
            {
            match("int32_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:32:5: ( 'uint32_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:32:7: 'uint32_t'
            {
            match("uint32_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:33:5: ( 'int64_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:33:7: 'int64_t'
            {
            match("int64_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:34:5: ( 'uint64_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:34:7: 'uint64_t'
            {
            match("uint64_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:35:5: ( 'intptr_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:35:7: 'intptr_t'
            {
            match("intptr_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:36:5: ( 'uintptr_t' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:36:7: 'uintptr_t'
            {
            match("uintptr_t"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:37:5: ( 'in' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:37:7: 'in'
            {
            match("in"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:38:5: ( 'out' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:38:7: 'out'
            {
            match("out"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:39:5: ( '#ifndef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:39:7: '#ifndef'
            {
            match("#ifndef"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:40:5: ( '#endif' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:40:7: '#endif'
            {
            match("#endif"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:41:5: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:41:7: ';'
            {
            match(';'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:42:5: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:42:7: 'typedef'
            {
            match("typedef"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:43:5: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:43:7: '{'
            {
            match('{'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:44:5: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:44:7: '}'
            {
            match('}'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:45:5: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:45:7: ':'
            {
            match(':'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:46:5: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:46:7: 'enum'
            {
            match("enum"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:47:5: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:47:7: ','
            {
            match(','); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:48:5: ( '=' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:48:7: '='
            {
            match('='); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:49:5: ( '*' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:49:7: '*'
            {
            match('*'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:50:5: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:50:7: '('
            {
            match('('); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:51:5: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:51:7: ')'
            {
            match(')'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:52:5: ( '[' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:52:7: '['
            {
            match('['); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:53:5: ( ']' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:53:7: ']'
            {
            match(']'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:54:5: ( '.' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:54:7: '.'
            {
            match('.'); 

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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:55:5: ( '#define' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:55:7: '#define'
            {
            match("#define"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:56:5: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:56:7: 'interface'
            {
            match("interface"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:57:5: ( 'unmanaged' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:57:7: 'unmanaged'
            {
            match("unmanaged"); 


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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:58:5: ( '...' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:58:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:59:5: ( '#include' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:59:7: '#include'
            {
            match("#include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:60:5: ( '@' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:60:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start RULE_INCLUDELIB
    public final void mRULE_INCLUDELIB() throws RecognitionException {
        try {
            int _type = RULE_INCLUDELIB;
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5396:17: ( '<' RULE_ID '.' RULE_ID '>' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5396:19: '<' RULE_ID '.' RULE_ID '>'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5398:14: ( ( 'true' | 'false' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5398:16: ( 'true' | 'false' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5398:16: ( 'true' | 'false' )
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
                    new NoViableAltException("5398:16: ( 'true' | 'false' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5398:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5398:24: 'false'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5400:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5400:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5400:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5400:11: '^'
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

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5400:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5402:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5402:12: ( '0' .. '9' )+
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5402:12: ( '0' .. '9' )+
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
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5402:13: '0' .. '9'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("5404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5404:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5406:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5406:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5406:24: ( options {greedy=false; } : . )*
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
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5406:52: .
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5408:41: '\\r'
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5410:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5412:16: ( . )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5412:18: .
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
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=60;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA13_38 = input.LA(3);

                if ( (LA13_38=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'u':
                        {
                        int LA13_106 = input.LA(5);

                        if ( (LA13_106=='c') ) {
                            int LA13_134 = input.LA(6);

                            if ( (LA13_134=='t') ) {
                                int LA13_164 = input.LA(7);

                                if ( ((LA13_164>='0' && LA13_164<='9')||(LA13_164>='A' && LA13_164<='Z')||LA13_164=='_'||(LA13_164>='a' && LA13_164<='z')) ) {
                                    alt13=54;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                        }
                        break;
                    case 'i':
                        {
                        int LA13_107 = input.LA(5);

                        if ( (LA13_107=='n') ) {
                            int LA13_135 = input.LA(6);

                            if ( (LA13_135=='g') ) {
                                int LA13_165 = input.LA(7);

                                if ( ((LA13_165>='0' && LA13_165<='9')||(LA13_165>='A' && LA13_165<='Z')||LA13_165=='_'||(LA13_165>='a' && LA13_165<='z')) ) {
                                    alt13=54;
                                }
                                else {
                                    alt13=17;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                        }
                        break;
                    default:
                        alt13=54;}

                }
                else {
                    alt13=54;}
                }
                break;
            case 'h':
                {
                int LA13_39 = input.LA(3);

                if ( (LA13_39=='o') ) {
                    int LA13_83 = input.LA(4);

                    if ( (LA13_83=='r') ) {
                        int LA13_108 = input.LA(5);

                        if ( (LA13_108=='t') ) {
                            int LA13_136 = input.LA(6);

                            if ( ((LA13_136>='0' && LA13_136<='9')||(LA13_136>='A' && LA13_136<='Z')||LA13_136=='_'||(LA13_136>='a' && LA13_136<='z')) ) {
                                alt13=54;
                            }
                            else {
                                alt13=10;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            case 'i':
                {
                int LA13_40 = input.LA(3);

                if ( (LA13_40=='g') ) {
                    int LA13_84 = input.LA(4);

                    if ( (LA13_84=='n') ) {
                        int LA13_109 = input.LA(5);

                        if ( (LA13_109=='e') ) {
                            int LA13_137 = input.LA(6);

                            if ( (LA13_137=='d') ) {
                                int LA13_167 = input.LA(7);

                                if ( ((LA13_167>='0' && LA13_167<='9')||(LA13_167>='A' && LA13_167<='Z')||LA13_167=='_'||(LA13_167>='a' && LA13_167<='z')) ) {
                                    alt13=54;
                                }
                                else {
                                    alt13=15;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            default:
                alt13=54;}

        }
        else if ( (LA13_0=='u') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA13_85 = input.LA(4);

                    if ( (LA13_85=='a') ) {
                        int LA13_110 = input.LA(5);

                        if ( (LA13_110=='n') ) {
                            int LA13_138 = input.LA(6);

                            if ( (LA13_138=='a') ) {
                                int LA13_168 = input.LA(7);

                                if ( (LA13_168=='g') ) {
                                    int LA13_190 = input.LA(8);

                                    if ( (LA13_190=='e') ) {
                                        int LA13_206 = input.LA(9);

                                        if ( (LA13_206=='d') ) {
                                            int LA13_220 = input.LA(10);

                                            if ( ((LA13_220>='0' && LA13_220<='9')||(LA13_220>='A' && LA13_220<='Z')||LA13_220=='_'||(LA13_220>='a' && LA13_220<='z')) ) {
                                                alt13=54;
                                            }
                                            else {
                                                alt13=48;}
                                        }
                                        else {
                                            alt13=54;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                    }
                    break;
                case 's':
                    {
                    int LA13_86 = input.LA(4);

                    if ( (LA13_86=='i') ) {
                        int LA13_111 = input.LA(5);

                        if ( (LA13_111=='g') ) {
                            int LA13_139 = input.LA(6);

                            if ( (LA13_139=='n') ) {
                                int LA13_169 = input.LA(7);

                                if ( (LA13_169=='e') ) {
                                    int LA13_191 = input.LA(8);

                                    if ( (LA13_191=='d') ) {
                                        int LA13_207 = input.LA(9);

                                        if ( ((LA13_207>='0' && LA13_207<='9')||(LA13_207>='A' && LA13_207<='Z')||LA13_207=='_'||(LA13_207>='a' && LA13_207<='z')) ) {
                                            alt13=54;
                                        }
                                        else {
                                            alt13=16;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_87 = input.LA(4);

                    if ( (LA13_87=='o') ) {
                        int LA13_112 = input.LA(5);

                        if ( (LA13_112=='n') ) {
                            int LA13_140 = input.LA(6);

                            if ( ((LA13_140>='0' && LA13_140<='9')||(LA13_140>='A' && LA13_140<='Z')||LA13_140=='_'||(LA13_140>='a' && LA13_140<='z')) ) {
                                alt13=54;
                            }
                            else {
                                alt13=2;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                    }
                    break;
                default:
                    alt13=54;}

                }
                break;
            case 'i':
                {
                int LA13_43 = input.LA(3);

                if ( (LA13_43=='n') ) {
                    int LA13_88 = input.LA(4);

                    if ( (LA13_88=='t') ) {
                        switch ( input.LA(5) ) {
                        case '1':
                            {
                            int LA13_141 = input.LA(6);

                            if ( (LA13_141=='6') ) {
                                int LA13_171 = input.LA(7);

                                if ( (LA13_171=='_') ) {
                                    int LA13_192 = input.LA(8);

                                    if ( (LA13_192=='t') ) {
                                        int LA13_208 = input.LA(9);

                                        if ( ((LA13_208>='0' && LA13_208<='9')||(LA13_208>='A' && LA13_208<='Z')||LA13_208=='_'||(LA13_208>='a' && LA13_208<='z')) ) {
                                            alt13=54;
                                        }
                                        else {
                                            alt13=21;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                            }
                            break;
                        case '3':
                            {
                            int LA13_142 = input.LA(6);

                            if ( (LA13_142=='2') ) {
                                int LA13_172 = input.LA(7);

                                if ( (LA13_172=='_') ) {
                                    int LA13_193 = input.LA(8);

                                    if ( (LA13_193=='t') ) {
                                        int LA13_209 = input.LA(9);

                                        if ( ((LA13_209>='0' && LA13_209<='9')||(LA13_209>='A' && LA13_209<='Z')||LA13_209=='_'||(LA13_209>='a' && LA13_209<='z')) ) {
                                            alt13=54;
                                        }
                                        else {
                                            alt13=23;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                            }
                            break;
                        case '6':
                            {
                            int LA13_143 = input.LA(6);

                            if ( (LA13_143=='4') ) {
                                int LA13_173 = input.LA(7);

                                if ( (LA13_173=='_') ) {
                                    int LA13_194 = input.LA(8);

                                    if ( (LA13_194=='t') ) {
                                        int LA13_210 = input.LA(9);

                                        if ( ((LA13_210>='0' && LA13_210<='9')||(LA13_210>='A' && LA13_210<='Z')||LA13_210=='_'||(LA13_210>='a' && LA13_210<='z')) ) {
                                            alt13=54;
                                        }
                                        else {
                                            alt13=25;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                            }
                            break;
                        case 'p':
                            {
                            int LA13_144 = input.LA(6);

                            if ( (LA13_144=='t') ) {
                                int LA13_174 = input.LA(7);

                                if ( (LA13_174=='r') ) {
                                    int LA13_195 = input.LA(8);

                                    if ( (LA13_195=='_') ) {
                                        int LA13_211 = input.LA(9);

                                        if ( (LA13_211=='t') ) {
                                            int LA13_225 = input.LA(10);

                                            if ( ((LA13_225>='0' && LA13_225<='9')||(LA13_225>='A' && LA13_225<='Z')||LA13_225=='_'||(LA13_225>='a' && LA13_225<='z')) ) {
                                                alt13=54;
                                            }
                                            else {
                                                alt13=27;}
                                        }
                                        else {
                                            alt13=54;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                            }
                            break;
                        case '8':
                            {
                            int LA13_145 = input.LA(6);

                            if ( (LA13_145=='_') ) {
                                int LA13_175 = input.LA(7);

                                if ( (LA13_175=='t') ) {
                                    int LA13_196 = input.LA(8);

                                    if ( ((LA13_196>='0' && LA13_196<='9')||(LA13_196>='A' && LA13_196<='Z')||LA13_196=='_'||(LA13_196>='a' && LA13_196<='z')) ) {
                                        alt13=54;
                                    }
                                    else {
                                        alt13=19;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                            }
                            break;
                        default:
                            alt13=54;}

                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            default:
                alt13=54;}

        }
        else if ( (LA13_0=='n') ) {
            int LA13_3 = input.LA(2);

            if ( (LA13_3=='u') ) {
                int LA13_44 = input.LA(3);

                if ( (LA13_44=='l') ) {
                    int LA13_89 = input.LA(4);

                    if ( (LA13_89=='l') ) {
                        int LA13_114 = input.LA(5);

                        if ( ((LA13_114>='0' && LA13_114<='9')||(LA13_114>='A' && LA13_114<='Z')||LA13_114=='_'||(LA13_114>='a' && LA13_114<='z')) ) {
                            alt13=54;
                        }
                        else {
                            alt13=3;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0=='+') ) {
            alt13=4;
        }
        else if ( (LA13_0=='-') ) {
            alt13=5;
        }
        else if ( (LA13_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA13_47 = input.LA(3);

                if ( (LA13_47=='n') ) {
                    int LA13_90 = input.LA(4);

                    if ( (LA13_90=='s') ) {
                        int LA13_115 = input.LA(5);

                        if ( (LA13_115=='t') ) {
                            int LA13_147 = input.LA(6);

                            if ( ((LA13_147>='0' && LA13_147<='9')||(LA13_147>='A' && LA13_147<='Z')||LA13_147=='_'||(LA13_147>='a' && LA13_147<='z')) ) {
                                alt13=54;
                            }
                            else {
                                alt13=6;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            case 'h':
                {
                int LA13_48 = input.LA(3);

                if ( (LA13_48=='a') ) {
                    int LA13_91 = input.LA(4);

                    if ( (LA13_91=='r') ) {
                        int LA13_116 = input.LA(5);

                        if ( ((LA13_116>='0' && LA13_116<='9')||(LA13_116>='A' && LA13_116<='Z')||LA13_116=='_'||(LA13_116>='a' && LA13_116<='z')) ) {
                            alt13=54;
                        }
                        else {
                            alt13=9;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            default:
                alt13=54;}

        }
        else if ( (LA13_0=='v') ) {
            int LA13_7 = input.LA(2);

            if ( (LA13_7=='o') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA13_92 = input.LA(4);

                    if ( (LA13_92=='a') ) {
                        int LA13_117 = input.LA(5);

                        if ( (LA13_117=='t') ) {
                            int LA13_149 = input.LA(6);

                            if ( (LA13_149=='i') ) {
                                int LA13_177 = input.LA(7);

                                if ( (LA13_177=='l') ) {
                                    int LA13_197 = input.LA(8);

                                    if ( (LA13_197=='e') ) {
                                        int LA13_213 = input.LA(9);

                                        if ( ((LA13_213>='0' && LA13_213<='9')||(LA13_213>='A' && LA13_213<='Z')||LA13_213=='_'||(LA13_213>='a' && LA13_213<='z')) ) {
                                            alt13=54;
                                        }
                                        else {
                                            alt13=7;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_93 = input.LA(4);

                    if ( (LA13_93=='d') ) {
                        int LA13_118 = input.LA(5);

                        if ( ((LA13_118>='0' && LA13_118<='9')||(LA13_118>='A' && LA13_118<='Z')||LA13_118=='_'||(LA13_118>='a' && LA13_118<='z')) ) {
                            alt13=54;
                        }
                        else {
                            alt13=8;}
                    }
                    else {
                        alt13=54;}
                    }
                    break;
                default:
                    alt13=54;}

            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0=='i') ) {
            int LA13_8 = input.LA(2);

            if ( (LA13_8=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA13_119 = input.LA(5);

                        if ( (LA13_119=='r') ) {
                            int LA13_151 = input.LA(6);

                            if ( (LA13_151=='f') ) {
                                int LA13_178 = input.LA(7);

                                if ( (LA13_178=='a') ) {
                                    int LA13_198 = input.LA(8);

                                    if ( (LA13_198=='c') ) {
                                        int LA13_214 = input.LA(9);

                                        if ( (LA13_214=='e') ) {
                                            int LA13_227 = input.LA(10);

                                            if ( ((LA13_227>='0' && LA13_227<='9')||(LA13_227>='A' && LA13_227<='Z')||LA13_227=='_'||(LA13_227>='a' && LA13_227<='z')) ) {
                                                alt13=54;
                                            }
                                            else {
                                                alt13=47;}
                                        }
                                        else {
                                            alt13=54;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
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
                                        alt13=54;
                                    }
                                    else {
                                        alt13=24;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                        }
                        break;
                    case '8':
                        {
                        int LA13_121 = input.LA(5);

                        if ( (LA13_121=='_') ) {
                            int LA13_153 = input.LA(6);

                            if ( (LA13_153=='t') ) {
                                int LA13_180 = input.LA(7);

                                if ( ((LA13_180>='0' && LA13_180<='9')||(LA13_180>='A' && LA13_180<='Z')||LA13_180=='_'||(LA13_180>='a' && LA13_180<='z')) ) {
                                    alt13=54;
                                }
                                else {
                                    alt13=18;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                        }
                        break;
                    case 'p':
                        {
                        int LA13_122 = input.LA(5);

                        if ( (LA13_122=='t') ) {
                            int LA13_154 = input.LA(6);

                            if ( (LA13_154=='r') ) {
                                int LA13_181 = input.LA(7);

                                if ( (LA13_181=='_') ) {
                                    int LA13_201 = input.LA(8);

                                    if ( (LA13_201=='t') ) {
                                        int LA13_216 = input.LA(9);

                                        if ( ((LA13_216>='0' && LA13_216<='9')||(LA13_216>='A' && LA13_216<='Z')||LA13_216=='_'||(LA13_216>='a' && LA13_216<='z')) ) {
                                            alt13=54;
                                        }
                                        else {
                                            alt13=26;}
                                    }
                                    else {
                                        alt13=54;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                        }
                        break;
                    case '1':
                        {
                        int LA13_123 = input.LA(5);

                        if ( (LA13_123=='6') ) {
                            int LA13_155 = input.LA(6);

                            if ( (LA13_155=='_') ) {
                                int LA13_182 = input.LA(7);

                                if ( (LA13_182=='t') ) {
                                    int LA13_202 = input.LA(8);

                                    if ( ((LA13_202>='0' && LA13_202<='9')||(LA13_202>='A' && LA13_202<='Z')||LA13_202=='_'||(LA13_202>='a' && LA13_202<='z')) ) {
                                        alt13=54;
                                    }
                                    else {
                                        alt13=20;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                        }
                        break;
                    case '3':
                        {
                        int LA13_124 = input.LA(5);

                        if ( (LA13_124=='2') ) {
                            int LA13_156 = input.LA(6);

                            if ( (LA13_156=='_') ) {
                                int LA13_183 = input.LA(7);

                                if ( (LA13_183=='t') ) {
                                    int LA13_203 = input.LA(8);

                                    if ( ((LA13_203>='0' && LA13_203<='9')||(LA13_203>='A' && LA13_203<='Z')||LA13_203=='_'||(LA13_203>='a' && LA13_203<='z')) ) {
                                        alt13=54;
                                    }
                                    else {
                                        alt13=22;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
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
                        alt13=54;
                        }
                        break;
                    default:
                        alt13=11;}

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
                    alt13=54;
                    }
                    break;
                default:
                    alt13=28;}

            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0=='l') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='o') ) {
                int LA13_51 = input.LA(3);

                if ( (LA13_51=='n') ) {
                    int LA13_96 = input.LA(4);

                    if ( (LA13_96=='g') ) {
                        int LA13_126 = input.LA(5);

                        if ( ((LA13_126>='0' && LA13_126<='9')||(LA13_126>='A' && LA13_126<='Z')||LA13_126=='_'||(LA13_126>='a' && LA13_126<='z')) ) {
                            alt13=54;
                        }
                        else {
                            alt13=12;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_52 = input.LA(3);

                if ( (LA13_52=='l') ) {
                    int LA13_97 = input.LA(4);

                    if ( (LA13_97=='s') ) {
                        int LA13_127 = input.LA(5);

                        if ( (LA13_127=='e') ) {
                            int LA13_158 = input.LA(6);

                            if ( ((LA13_158>='0' && LA13_158<='9')||(LA13_158>='A' && LA13_158<='Z')||LA13_158=='_'||(LA13_158>='a' && LA13_158<='z')) ) {
                                alt13=54;
                            }
                            else {
                                alt13=53;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            case 'l':
                {
                int LA13_53 = input.LA(3);

                if ( (LA13_53=='o') ) {
                    int LA13_98 = input.LA(4);

                    if ( (LA13_98=='a') ) {
                        int LA13_128 = input.LA(5);

                        if ( (LA13_128=='t') ) {
                            int LA13_159 = input.LA(6);

                            if ( ((LA13_159>='0' && LA13_159<='9')||(LA13_159>='A' && LA13_159<='Z')||LA13_159=='_'||(LA13_159>='a' && LA13_159<='z')) ) {
                                alt13=54;
                            }
                            else {
                                alt13=13;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            default:
                alt13=54;}

        }
        else if ( (LA13_0=='d') ) {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='o') ) {
                int LA13_54 = input.LA(3);

                if ( (LA13_54=='u') ) {
                    int LA13_99 = input.LA(4);

                    if ( (LA13_99=='b') ) {
                        int LA13_129 = input.LA(5);

                        if ( (LA13_129=='l') ) {
                            int LA13_160 = input.LA(6);

                            if ( (LA13_160=='e') ) {
                                int LA13_185 = input.LA(7);

                                if ( ((LA13_185>='0' && LA13_185<='9')||(LA13_185>='A' && LA13_185<='Z')||LA13_185=='_'||(LA13_185>='a' && LA13_185<='z')) ) {
                                    alt13=54;
                                }
                                else {
                                    alt13=14;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0=='o') ) {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='u') ) {
                int LA13_55 = input.LA(3);

                if ( (LA13_55=='t') ) {
                    int LA13_100 = input.LA(4);

                    if ( ((LA13_100>='0' && LA13_100<='9')||(LA13_100>='A' && LA13_100<='Z')||LA13_100=='_'||(LA13_100>='a' && LA13_100<='z')) ) {
                        alt13=54;
                    }
                    else {
                        alt13=29;}
                }
                else {
                    alt13=54;}
            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0=='#') ) {
            switch ( input.LA(2) ) {
            case 'd':
                {
                alt13=46;
                }
                break;
            case 'e':
                {
                alt13=31;
                }
                break;
            case 'i':
                {
                int LA13_58 = input.LA(3);

                if ( (LA13_58=='n') ) {
                    alt13=50;
                }
                else if ( (LA13_58=='f') ) {
                    alt13=30;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 58, input);

                    throw nvae;
                }
                }
                break;
            default:
                alt13=60;}

        }
        else if ( (LA13_0==';') ) {
            alt13=32;
        }
        else if ( (LA13_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA13_60 = input.LA(3);

                if ( (LA13_60=='p') ) {
                    int LA13_103 = input.LA(4);

                    if ( (LA13_103=='e') ) {
                        int LA13_131 = input.LA(5);

                        if ( (LA13_131=='d') ) {
                            int LA13_161 = input.LA(6);

                            if ( (LA13_161=='e') ) {
                                int LA13_186 = input.LA(7);

                                if ( (LA13_186=='f') ) {
                                    int LA13_205 = input.LA(8);

                                    if ( ((LA13_205>='0' && LA13_205<='9')||(LA13_205>='A' && LA13_205<='Z')||LA13_205=='_'||(LA13_205>='a' && LA13_205<='z')) ) {
                                        alt13=54;
                                    }
                                    else {
                                        alt13=33;}
                                }
                                else {
                                    alt13=54;}
                            }
                            else {
                                alt13=54;}
                        }
                        else {
                            alt13=54;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            case 'r':
                {
                int LA13_61 = input.LA(3);

                if ( (LA13_61=='u') ) {
                    int LA13_104 = input.LA(4);

                    if ( (LA13_104=='e') ) {
                        int LA13_132 = input.LA(5);

                        if ( ((LA13_132>='0' && LA13_132<='9')||(LA13_132>='A' && LA13_132<='Z')||LA13_132=='_'||(LA13_132>='a' && LA13_132<='z')) ) {
                            alt13=54;
                        }
                        else {
                            alt13=53;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
                }
                break;
            default:
                alt13=54;}

        }
        else if ( (LA13_0=='{') ) {
            alt13=34;
        }
        else if ( (LA13_0=='}') ) {
            alt13=35;
        }
        else if ( (LA13_0==':') ) {
            alt13=36;
        }
        else if ( (LA13_0=='e') ) {
            int LA13_19 = input.LA(2);

            if ( (LA13_19=='n') ) {
                int LA13_65 = input.LA(3);

                if ( (LA13_65=='u') ) {
                    int LA13_105 = input.LA(4);

                    if ( (LA13_105=='m') ) {
                        int LA13_133 = input.LA(5);

                        if ( ((LA13_133>='0' && LA13_133<='9')||(LA13_133>='A' && LA13_133<='Z')||LA13_133=='_'||(LA13_133>='a' && LA13_133<='z')) ) {
                            alt13=54;
                        }
                        else {
                            alt13=37;}
                    }
                    else {
                        alt13=54;}
                }
                else {
                    alt13=54;}
            }
            else {
                alt13=54;}
        }
        else if ( (LA13_0==',') ) {
            alt13=38;
        }
        else if ( (LA13_0=='=') ) {
            alt13=39;
        }
        else if ( (LA13_0=='*') ) {
            alt13=40;
        }
        else if ( (LA13_0=='(') ) {
            alt13=41;
        }
        else if ( (LA13_0==')') ) {
            alt13=42;
        }
        else if ( (LA13_0=='[') ) {
            alt13=43;
        }
        else if ( (LA13_0==']') ) {
            alt13=44;
        }
        else if ( (LA13_0=='.') ) {
            int LA13_27 = input.LA(2);

            if ( (LA13_27=='.') ) {
                alt13=49;
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='@') ) {
            alt13=51;
        }
        else if ( (LA13_0=='<') ) {
            int LA13_29 = input.LA(2);

            if ( ((LA13_29>='A' && LA13_29<='Z')||(LA13_29>='^' && LA13_29<='_')||(LA13_29>='a' && LA13_29<='z')) ) {
                alt13=52;
            }
            else {
                alt13=60;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_30 = input.LA(2);

            if ( ((LA13_30>='A' && LA13_30<='Z')||LA13_30=='_'||(LA13_30>='a' && LA13_30<='z')) ) {
                alt13=54;
            }
            else {
                alt13=60;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='m'||(LA13_0>='p' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=54;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=55;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_33 = input.LA(2);

            if ( ((LA13_33>='\u0000' && LA13_33<='\uFFFE')) ) {
                alt13=56;
            }
            else {
                alt13=60;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_34 = input.LA(2);

            if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFE')) ) {
                alt13=56;
            }
            else {
                alt13=60;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt13=57;
                }
                break;
            case '/':
                {
                alt13=58;
                }
                break;
            default:
                alt13=60;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=59;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='>' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=60;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

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
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:206: T62
                {
                mT62(); 

                }
                break;
            case 51 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:210: T63
                {
                mT63(); 

                }
                break;
            case 52 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:214: RULE_INCLUDELIB
                {
                mRULE_INCLUDELIB(); 

                }
                break;
            case 53 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:230: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 54 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:243: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:251: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 56 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:260: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 57 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:272: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:288: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:304: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1:312: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}