package org.ow2.mindEd.idt.editor.textual.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalIdtLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=17;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int RULE_INCLUDELIB=6;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=9;
    public static final int T38=38;
    public static final int RULE_MULOPERATION=11;
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
    public static final int RULE_UNARYOPERATION=12;
    public static final int RULE_FDSYMBOL=13;
    public static final int RULE_ADDITIVEOPERATION=8;
    public static final int T49=49;
    public static final int RULE_SHIFTOPERATION=10;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=74;
    public static final int RULE_SL_COMMENT=15;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=14;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T52=52;
    public static final int RULE_WS=16;
    public static final int T51=51;
    public static final int T54=54;
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
    public String getGrammarFileName() { return "../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g"; }

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:10:5: ( '#endif' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:10:7: '#endif'
            {
            match("#endif"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:11:5: ( '#ifndef' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:11:7: '#ifndef'
            {
            match("#ifndef"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:12:5: ( ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:12:7: ';'
            {
            match(';'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:13:5: ( 'typedef' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:13:7: 'typedef'
            {
            match("typedef"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:14:5: ( '{' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:14:7: '{'
            {
            match('{'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:15:5: ( '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:15:7: '}'
            {
            match('}'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:16:5: ( 'struct' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:16:7: 'struct'
            {
            match("struct"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:17:5: ( 'union' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:17:7: 'union'
            {
            match("union"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:18:5: ( ':' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:18:7: ':'
            {
            match(':'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:19:5: ( 'enum' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:19:7: 'enum'
            {
            match("enum"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:20:5: ( ',' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:20:7: ','
            {
            match(','); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:21:5: ( '=' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:21:7: '='
            {
            match('='); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:22:5: ( '*' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:22:7: '*'
            {
            match('*'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:23:5: ( '(' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:23:7: '('
            {
            match('('); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:24:5: ( ')' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:24:7: ')'
            {
            match(')'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:25:5: ( '[' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:25:7: '['
            {
            match('['); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:26:5: ( ']' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:26:7: ']'
            {
            match(']'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:27:5: ( '.' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:27:7: '.'
            {
            match('.'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:28:5: ( '#define' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:28:7: '#define'
            {
            match("#define"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:29:5: ( 'interface' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:29:7: 'interface'
            {
            match("interface"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:30:5: ( 'unmanaged' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:30:7: 'unmanaged'
            {
            match("unmanaged"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:31:5: ( 'void' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:31:7: 'void'
            {
            match("void"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:32:5: ( '...' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:32:7: '...'
            {
            match("..."); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:33:5: ( '#include' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:33:7: '#include'
            {
            match("#include"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:34:5: ( '@' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:34:7: '@'
            {
            match('@'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:35:5: ( 'null' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:35:7: 'null'
            {
            match("null"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:36:5: ( '||' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:36:7: '||'
            {
            match("||"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:37:5: ( '&&' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:37:7: '&&'
            {
            match("&&"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:38:5: ( '|' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:38:7: '|'
            {
            match('|'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:39:5: ( '^' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:39:7: '^'
            {
            match('^'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:40:5: ( '&' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:40:7: '&'
            {
            match('&'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:41:5: ( 'e' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:41:7: 'e'
            {
            match('e'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:42:5: ( 'E' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:42:7: 'E'
            {
            match('E'); 

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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:43:5: ( 'const' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:43:7: 'const'
            {
            match("const"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:44:5: ( 'volatile' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:44:7: 'volatile'
            {
            match("volatile"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:45:5: ( 'char' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:45:7: 'char'
            {
            match("char"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:46:5: ( 'short' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:46:7: 'short'
            {
            match("short"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:47:5: ( 'int' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:47:7: 'int'
            {
            match("int"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:48:5: ( 'long' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:48:7: 'long'
            {
            match("long"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:49:5: ( 'float' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:49:7: 'float'
            {
            match("float"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:50:5: ( 'double' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:50:7: 'double'
            {
            match("double"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:51:5: ( 'signed' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:51:7: 'signed'
            {
            match("signed"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:52:5: ( 'unsigned' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:52:7: 'unsigned'
            {
            match("unsigned"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:53:5: ( 'string' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:53:7: 'string'
            {
            match("string"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:54:5: ( 'int8_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:54:7: 'int8_t'
            {
            match("int8_t"); 


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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:55:5: ( 'uint8_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:55:7: 'uint8_t'
            {
            match("uint8_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:56:5: ( 'int16_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:56:7: 'int16_t'
            {
            match("int16_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:57:5: ( 'uint16_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:57:7: 'uint16_t'
            {
            match("uint16_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:58:5: ( 'int32_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:58:7: 'int32_t'
            {
            match("int32_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:59:5: ( 'uint32_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:59:7: 'uint32_t'
            {
            match("uint32_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:60:5: ( 'int64_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:60:7: 'int64_t'
            {
            match("int64_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:61:5: ( 'uint64_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:61:7: 'uint64_t'
            {
            match("uint64_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:62:5: ( 'intptr_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:62:7: 'intptr_t'
            {
            match("intptr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:63:5: ( 'uintptr_t' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:63:7: 'uintptr_t'
            {
            match("uintptr_t"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:64:5: ( 'in' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:64:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:65:5: ( 'out' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:65:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start RULE_INCLUDELIB
    public final void mRULE_INCLUDELIB() throws RecognitionException {
        try {
            int _type = RULE_INCLUDELIB;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4634:17: ( '<' RULE_ID '.' RULE_ID '>' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4634:19: '<' RULE_ID '.' RULE_ID '>'
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4636:14: ( ( 'true' | 'false' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4636:16: ( 'true' | 'false' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4636:16: ( 'true' | 'false' )
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
                    new NoViableAltException("4636:16: ( 'true' | 'false' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4636:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4636:24: 'false'
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

    // $ANTLR start RULE_SHIFTOPERATION
    public final void mRULE_SHIFTOPERATION() throws RecognitionException {
        try {
            int _type = RULE_SHIFTOPERATION;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4638:21: ( ( '<<' | '>>' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4638:23: ( '<<' | '>>' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4638:23: ( '<<' | '>>' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                alt2=1;
            }
            else if ( (LA2_0=='>') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4638:23: ( '<<' | '>>' )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4638:24: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4638:29: '>>'
                    {
                    match(">>"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SHIFTOPERATION

    // $ANTLR start RULE_ADDITIVEOPERATION
    public final void mRULE_ADDITIVEOPERATION() throws RecognitionException {
        try {
            int _type = RULE_ADDITIVEOPERATION;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4640:24: ( ( '+' | '-' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4640:26: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ADDITIVEOPERATION

    // $ANTLR start RULE_MULOPERATION
    public final void mRULE_MULOPERATION() throws RecognitionException {
        try {
            int _type = RULE_MULOPERATION;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4642:19: ( ( '*' | '/' | '%' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4642:21: ( '*' | '/' | '%' )
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_MULOPERATION

    // $ANTLR start RULE_UNARYOPERATION
    public final void mRULE_UNARYOPERATION() throws RecognitionException {
        try {
            int _type = RULE_UNARYOPERATION;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4644:21: ( ( '&' | '*' | '+' | '-' | '~' | '!' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4644:23: ( '&' | '*' | '+' | '-' | '~' | '!' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_UNARYOPERATION

    // $ANTLR start RULE_FDSYMBOL
    public final void mRULE_FDSYMBOL() throws RecognitionException {
        try {
            int _type = RULE_FDSYMBOL;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4646:15: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4646:17: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_FDSYMBOL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4648:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4648:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4648:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4648:11: '^'
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4648:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:
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
            	    break loop4;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4650:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4650:12: ( '0' .. '9' )+
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4650:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4650:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4652:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4652:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4654:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4654:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4654:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4654:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4656:41: '\\r'
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4658:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4658:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4658:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4660:16: ( . )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4660:18: .
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
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:8: ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_SHIFTOPERATION | RULE_ADDITIVEOPERATION | RULE_MULOPERATION | RULE_UNARYOPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=70;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='#') ) {
            alt14 = mTokensHelper001();
        }
        else if ( (LA14_0==';') ) {
            alt14 = mTokensHelper002();
        }
        else if ( (LA14_0=='t') ) {
            alt14 = mTokensHelper003();
        }
        else if ( (LA14_0=='{') ) {
            alt14 = mTokensHelper004();
        }
        else if ( (LA14_0=='}') ) {
            alt14 = mTokensHelper005();
        }
        else if ( (LA14_0=='s') ) {
            alt14 = mTokensHelper006();
        }
        else if ( (LA14_0=='u') ) {
            alt14 = mTokensHelper007();
        }
        else if ( (LA14_0==':') ) {
            alt14 = mTokensHelper008();
        }
        else if ( (LA14_0=='e') ) {
            alt14 = mTokensHelper009();
        }
        else if ( (LA14_0==',') ) {
            alt14 = mTokensHelper010();
        }
        else if ( (LA14_0=='=') ) {
            alt14 = mTokensHelper011();
        }
        else if ( (LA14_0=='*') ) {
            alt14 = mTokensHelper012();
        }
        else if ( (LA14_0=='(') ) {
            alt14 = mTokensHelper013();
        }
        else if ( (LA14_0==')') ) {
            alt14 = mTokensHelper014();
        }
        else if ( (LA14_0=='[') ) {
            alt14 = mTokensHelper015();
        }
        else if ( (LA14_0==']') ) {
            alt14 = mTokensHelper016();
        }
        else if ( (LA14_0=='.') ) {
            alt14 = mTokensHelper017();
        }
        else if ( (LA14_0=='i') ) {
            alt14 = mTokensHelper018();
        }
        else if ( (LA14_0=='v') ) {
            alt14 = mTokensHelper019();
        }
        else if ( (LA14_0=='@') ) {
            alt14 = mTokensHelper020();
        }
        else if ( (LA14_0=='n') ) {
            alt14 = mTokensHelper021();
        }
        else if ( (LA14_0=='|') ) {
            alt14 = mTokensHelper022();
        }
        else if ( (LA14_0=='&') ) {
            alt14 = mTokensHelper023();
        }
        else if ( (LA14_0=='^') ) {
            alt14 = mTokensHelper024();
        }
        else if ( (LA14_0=='E') ) {
            alt14 = mTokensHelper025();
        }
        else if ( (LA14_0=='c') ) {
            alt14 = mTokensHelper026();
        }
        else if ( (LA14_0=='l') ) {
            alt14 = mTokensHelper027();
        }
        else if ( (LA14_0=='f') ) {
            alt14 = mTokensHelper028();
        }
        else if ( (LA14_0=='d') ) {
            alt14 = mTokensHelper029();
        }
        else if ( (LA14_0=='o') ) {
            alt14 = mTokensHelper030();
        }
        else if ( (LA14_0=='<') ) {
            alt14 = mTokensHelper031();
        }
        else if ( (LA14_0=='>') ) {
            alt14 = mTokensHelper032();
        }
        else if ( (LA14_0=='+'||LA14_0=='-') ) {
            alt14 = mTokensHelper033();
        }
        else if ( (LA14_0=='/') ) {
            alt14 = mTokensHelper034();
        }
        else if ( (LA14_0=='!'||LA14_0=='~') ) {
            alt14 = mTokensHelper035();
        }
        else if ( (LA14_0=='D'||LA14_0=='F') ) {
            alt14 = mTokensHelper036();
        }
        else if ( ((LA14_0>='A' && LA14_0<='C')||(LA14_0>='G' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||(LA14_0>='p' && LA14_0<='r')||(LA14_0>='w' && LA14_0<='z')) ) {
            alt14 = mTokensHelper037();
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14 = mTokensHelper038();
        }
        else if ( (LA14_0=='\"') ) {
            alt14 = mTokensHelper039();
        }
        else if ( (LA14_0=='\'') ) {
            alt14 = mTokensHelper040();
        }
        else if ( (LA14_0=='%') ) {
            alt14 = mTokensHelper041();
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14 = mTokensHelper042();
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='$'||LA14_0=='?'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='\u007F' && LA14_0<='\uFFFE')) ) {
            alt14 = mTokensHelper043();
        }
        else {
            alt14 = mTokensHelper044();
        }
        switch (alt14) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:10: T18
                {
                mT18(); 

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:14: T19
                {
                mT19(); 

                }
                break;
            case 3 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:18: T20
                {
                mT20(); 

                }
                break;
            case 4 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:22: T21
                {
                mT21(); 

                }
                break;
            case 5 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:26: T22
                {
                mT22(); 

                }
                break;
            case 6 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:30: T23
                {
                mT23(); 

                }
                break;
            case 7 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:34: T24
                {
                mT24(); 

                }
                break;
            case 8 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:38: T25
                {
                mT25(); 

                }
                break;
            case 9 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:42: T26
                {
                mT26(); 

                }
                break;
            case 10 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:46: T27
                {
                mT27(); 

                }
                break;
            case 11 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:50: T28
                {
                mT28(); 

                }
                break;
            case 12 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:54: T29
                {
                mT29(); 

                }
                break;
            case 13 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:58: T30
                {
                mT30(); 

                }
                break;
            case 14 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:62: T31
                {
                mT31(); 

                }
                break;
            case 15 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:66: T32
                {
                mT32(); 

                }
                break;
            case 16 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:70: T33
                {
                mT33(); 

                }
                break;
            case 17 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:74: T34
                {
                mT34(); 

                }
                break;
            case 18 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:78: T35
                {
                mT35(); 

                }
                break;
            case 19 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:82: T36
                {
                mT36(); 

                }
                break;
            case 20 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:86: T37
                {
                mT37(); 

                }
                break;
            case 21 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:90: T38
                {
                mT38(); 

                }
                break;
            case 22 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:94: T39
                {
                mT39(); 

                }
                break;
            case 23 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:98: T40
                {
                mT40(); 

                }
                break;
            case 24 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:102: T41
                {
                mT41(); 

                }
                break;
            case 25 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:106: T42
                {
                mT42(); 

                }
                break;
            case 26 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:110: T43
                {
                mT43(); 

                }
                break;
            case 27 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:114: T44
                {
                mT44(); 

                }
                break;
            case 28 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:118: T45
                {
                mT45(); 

                }
                break;
            case 29 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:122: T46
                {
                mT46(); 

                }
                break;
            case 30 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:126: T47
                {
                mT47(); 

                }
                break;
            case 31 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:130: T48
                {
                mT48(); 

                }
                break;
            case 32 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:134: T49
                {
                mT49(); 

                }
                break;
            case 33 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:138: T50
                {
                mT50(); 

                }
                break;
            case 34 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:142: T51
                {
                mT51(); 

                }
                break;
            case 35 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:146: T52
                {
                mT52(); 

                }
                break;
            case 36 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:150: T53
                {
                mT53(); 

                }
                break;
            case 37 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:154: T54
                {
                mT54(); 

                }
                break;
            case 38 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:158: T55
                {
                mT55(); 

                }
                break;
            case 39 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:162: T56
                {
                mT56(); 

                }
                break;
            case 40 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:166: T57
                {
                mT57(); 

                }
                break;
            case 41 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:170: T58
                {
                mT58(); 

                }
                break;
            case 42 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:174: T59
                {
                mT59(); 

                }
                break;
            case 43 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:178: T60
                {
                mT60(); 

                }
                break;
            case 44 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:182: T61
                {
                mT61(); 

                }
                break;
            case 45 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:186: T62
                {
                mT62(); 

                }
                break;
            case 46 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:190: T63
                {
                mT63(); 

                }
                break;
            case 47 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:194: T64
                {
                mT64(); 

                }
                break;
            case 48 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:198: T65
                {
                mT65(); 

                }
                break;
            case 49 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:202: T66
                {
                mT66(); 

                }
                break;
            case 50 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:206: T67
                {
                mT67(); 

                }
                break;
            case 51 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:210: T68
                {
                mT68(); 

                }
                break;
            case 52 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:214: T69
                {
                mT69(); 

                }
                break;
            case 53 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:218: T70
                {
                mT70(); 

                }
                break;
            case 54 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:222: T71
                {
                mT71(); 

                }
                break;
            case 55 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:226: T72
                {
                mT72(); 

                }
                break;
            case 56 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:230: T73
                {
                mT73(); 

                }
                break;
            case 57 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:234: RULE_INCLUDELIB
                {
                mRULE_INCLUDELIB(); 

                }
                break;
            case 58 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:250: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 59 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:263: RULE_SHIFTOPERATION
                {
                mRULE_SHIFTOPERATION(); 

                }
                break;
            case 60 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:283: RULE_ADDITIVEOPERATION
                {
                mRULE_ADDITIVEOPERATION(); 

                }
                break;
            case 61 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:306: RULE_MULOPERATION
                {
                mRULE_MULOPERATION(); 

                }
                break;
            case 62 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:324: RULE_UNARYOPERATION
                {
                mRULE_UNARYOPERATION(); 

                }
                break;
            case 63 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:344: RULE_FDSYMBOL
                {
                mRULE_FDSYMBOL(); 

                }
                break;
            case 64 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:358: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 65 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:366: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 66 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:375: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 67 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:387: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:403: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 69 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:419: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 70 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1:427: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'i':
            {
            int LA14_44 = input.LA(3);

            if ( (LA14_44=='n') ) {
                return 24;
            }
            else if ( (LA14_44=='f') ) {
                return 2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_SHIFTOPERATION | RULE_ADDITIVEOPERATION | RULE_MULOPERATION | RULE_UNARYOPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 44, input);

                throw nvae;
            }
            }
        case 'e':
            {
            return 1;
            }
        case 'd':
            {
            return 19;
            }
        default:
            return 70;}

    }

    private int mTokensHelper002() throws RecognitionException {
        return 3;
    }

    private int mTokensHelper003() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'y':
            {
            int LA14_48 = input.LA(3);

            if ( (LA14_48=='p') ) {
                int LA14_100 = input.LA(4);

                if ( (LA14_100=='e') ) {
                    int LA14_122 = input.LA(5);

                    if ( (LA14_122=='d') ) {
                        int LA14_150 = input.LA(6);

                        if ( (LA14_150=='e') ) {
                            int LA14_180 = input.LA(7);

                            if ( (LA14_180=='f') ) {
                                int LA14_203 = input.LA(8);

                                if ( ((LA14_203>='0' && LA14_203<='9')||(LA14_203>='A' && LA14_203<='Z')||LA14_203=='_'||(LA14_203>='a' && LA14_203<='z')) ) {
                                    return 64;
                                }
                                else {
                                    return 4;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        case 'r':
            {
            int LA14_49 = input.LA(3);

            if ( (LA14_49=='u') ) {
                int LA14_101 = input.LA(4);

                if ( (LA14_101=='e') ) {
                    int LA14_123 = input.LA(5);

                    if ( ((LA14_123>='0' && LA14_123<='9')||(LA14_123>='A' && LA14_123<='Z')||LA14_123=='_'||(LA14_123>='a' && LA14_123<='z')) ) {
                        return 64;
                    }
                    else {
                        return 58;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        default:
            return 64;}

    }

    private int mTokensHelper004() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper005() throws RecognitionException {
        return 6;
    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'h':
            {
            int LA14_53 = input.LA(3);

            if ( (LA14_53=='o') ) {
                int LA14_102 = input.LA(4);

                if ( (LA14_102=='r') ) {
                    int LA14_124 = input.LA(5);

                    if ( (LA14_124=='t') ) {
                        int LA14_152 = input.LA(6);

                        if ( ((LA14_152>='0' && LA14_152<='9')||(LA14_152>='A' && LA14_152<='Z')||LA14_152=='_'||(LA14_152>='a' && LA14_152<='z')) ) {
                            return 64;
                        }
                        else {
                            return 37;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        case 'i':
            {
            int LA14_54 = input.LA(3);

            if ( (LA14_54=='g') ) {
                int LA14_103 = input.LA(4);

                if ( (LA14_103=='n') ) {
                    int LA14_125 = input.LA(5);

                    if ( (LA14_125=='e') ) {
                        int LA14_153 = input.LA(6);

                        if ( (LA14_153=='d') ) {
                            int LA14_182 = input.LA(7);

                            if ( ((LA14_182>='0' && LA14_182<='9')||(LA14_182>='A' && LA14_182<='Z')||LA14_182=='_'||(LA14_182>='a' && LA14_182<='z')) ) {
                                return 64;
                            }
                            else {
                                return 42;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        case 't':
            {
            int LA14_55 = input.LA(3);

            if ( (LA14_55=='r') ) {
                switch ( input.LA(4) ) {
                case 'i':
                    {
                    int LA14_126 = input.LA(5);

                    if ( (LA14_126=='n') ) {
                        int LA14_154 = input.LA(6);

                        if ( (LA14_154=='g') ) {
                            int LA14_183 = input.LA(7);

                            if ( ((LA14_183>='0' && LA14_183<='9')||(LA14_183>='A' && LA14_183<='Z')||LA14_183=='_'||(LA14_183>='a' && LA14_183<='z')) ) {
                                return 64;
                            }
                            else {
                                return 44;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                case 'u':
                    {
                    int LA14_127 = input.LA(5);

                    if ( (LA14_127=='c') ) {
                        int LA14_155 = input.LA(6);

                        if ( (LA14_155=='t') ) {
                            int LA14_184 = input.LA(7);

                            if ( ((LA14_184>='0' && LA14_184<='9')||(LA14_184>='A' && LA14_184<='Z')||LA14_184=='_'||(LA14_184>='a' && LA14_184<='z')) ) {
                                return 64;
                            }
                            else {
                                return 7;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                default:
                    return 64;}

            }
            else {
                return 64;}
            }
        default:
            return 64;}

    }

    private int mTokensHelper007() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'i':
            {
            int LA14_56 = input.LA(3);

            if ( (LA14_56=='n') ) {
                int LA14_105 = input.LA(4);

                if ( (LA14_105=='t') ) {
                    switch ( input.LA(5) ) {
                    case '8':
                        {
                        int LA14_156 = input.LA(6);

                        if ( (LA14_156=='_') ) {
                            int LA14_185 = input.LA(7);

                            if ( (LA14_185=='t') ) {
                                int LA14_207 = input.LA(8);

                                if ( ((LA14_207>='0' && LA14_207<='9')||(LA14_207>='A' && LA14_207<='Z')||LA14_207=='_'||(LA14_207>='a' && LA14_207<='z')) ) {
                                    return 64;
                                }
                                else {
                                    return 46;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                        }
                    case 'p':
                        {
                        int LA14_157 = input.LA(6);

                        if ( (LA14_157=='t') ) {
                            int LA14_186 = input.LA(7);

                            if ( (LA14_186=='r') ) {
                                int LA14_208 = input.LA(8);

                                if ( (LA14_208=='_') ) {
                                    int LA14_224 = input.LA(9);

                                    if ( (LA14_224=='t') ) {
                                        int LA14_236 = input.LA(10);

                                        if ( ((LA14_236>='0' && LA14_236<='9')||(LA14_236>='A' && LA14_236<='Z')||LA14_236=='_'||(LA14_236>='a' && LA14_236<='z')) ) {
                                            return 64;
                                        }
                                        else {
                                            return 54;}
                                    }
                                    else {
                                        return 64;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                        }
                    case '6':
                        {
                        int LA14_158 = input.LA(6);

                        if ( (LA14_158=='4') ) {
                            int LA14_187 = input.LA(7);

                            if ( (LA14_187=='_') ) {
                                int LA14_209 = input.LA(8);

                                if ( (LA14_209=='t') ) {
                                    int LA14_225 = input.LA(9);

                                    if ( ((LA14_225>='0' && LA14_225<='9')||(LA14_225>='A' && LA14_225<='Z')||LA14_225=='_'||(LA14_225>='a' && LA14_225<='z')) ) {
                                        return 64;
                                    }
                                    else {
                                        return 52;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                        }
                    case '3':
                        {
                        int LA14_159 = input.LA(6);

                        if ( (LA14_159=='2') ) {
                            int LA14_188 = input.LA(7);

                            if ( (LA14_188=='_') ) {
                                int LA14_210 = input.LA(8);

                                if ( (LA14_210=='t') ) {
                                    int LA14_226 = input.LA(9);

                                    if ( ((LA14_226>='0' && LA14_226<='9')||(LA14_226>='A' && LA14_226<='Z')||LA14_226=='_'||(LA14_226>='a' && LA14_226<='z')) ) {
                                        return 64;
                                    }
                                    else {
                                        return 50;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                        }
                    case '1':
                        {
                        int LA14_160 = input.LA(6);

                        if ( (LA14_160=='6') ) {
                            int LA14_189 = input.LA(7);

                            if ( (LA14_189=='_') ) {
                                int LA14_211 = input.LA(8);

                                if ( (LA14_211=='t') ) {
                                    int LA14_227 = input.LA(9);

                                    if ( ((LA14_227>='0' && LA14_227<='9')||(LA14_227>='A' && LA14_227<='Z')||LA14_227=='_'||(LA14_227>='a' && LA14_227<='z')) ) {
                                        return 64;
                                    }
                                    else {
                                        return 48;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                        }
                    default:
                        return 64;}

                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        case 'n':
            {
            switch ( input.LA(3) ) {
            case 's':
                {
                int LA14_106 = input.LA(4);

                if ( (LA14_106=='i') ) {
                    int LA14_129 = input.LA(5);

                    if ( (LA14_129=='g') ) {
                        int LA14_161 = input.LA(6);

                        if ( (LA14_161=='n') ) {
                            int LA14_190 = input.LA(7);

                            if ( (LA14_190=='e') ) {
                                int LA14_212 = input.LA(8);

                                if ( (LA14_212=='d') ) {
                                    int LA14_228 = input.LA(9);

                                    if ( ((LA14_228>='0' && LA14_228<='9')||(LA14_228>='A' && LA14_228<='Z')||LA14_228=='_'||(LA14_228>='a' && LA14_228<='z')) ) {
                                        return 64;
                                    }
                                    else {
                                        return 43;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
                }
            case 'i':
                {
                int LA14_107 = input.LA(4);

                if ( (LA14_107=='o') ) {
                    int LA14_130 = input.LA(5);

                    if ( (LA14_130=='n') ) {
                        int LA14_162 = input.LA(6);

                        if ( ((LA14_162>='0' && LA14_162<='9')||(LA14_162>='A' && LA14_162<='Z')||LA14_162=='_'||(LA14_162>='a' && LA14_162<='z')) ) {
                            return 64;
                        }
                        else {
                            return 8;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
                }
            case 'm':
                {
                int LA14_108 = input.LA(4);

                if ( (LA14_108=='a') ) {
                    int LA14_131 = input.LA(5);

                    if ( (LA14_131=='n') ) {
                        int LA14_163 = input.LA(6);

                        if ( (LA14_163=='a') ) {
                            int LA14_192 = input.LA(7);

                            if ( (LA14_192=='g') ) {
                                int LA14_213 = input.LA(8);

                                if ( (LA14_213=='e') ) {
                                    int LA14_229 = input.LA(9);

                                    if ( (LA14_229=='d') ) {
                                        int LA14_241 = input.LA(10);

                                        if ( ((LA14_241>='0' && LA14_241<='9')||(LA14_241>='A' && LA14_241<='Z')||LA14_241=='_'||(LA14_241>='a' && LA14_241<='z')) ) {
                                            return 64;
                                        }
                                        else {
                                            return 21;}
                                    }
                                    else {
                                        return 64;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
                }
            default:
                return 64;}

            }
        default:
            return 64;}

    }

    private int mTokensHelper008() throws RecognitionException {
        return 9;
    }

    private int mTokensHelper009() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'n':
            {
            int LA14_59 = input.LA(3);

            if ( (LA14_59=='u') ) {
                int LA14_109 = input.LA(4);

                if ( (LA14_109=='m') ) {
                    int LA14_132 = input.LA(5);

                    if ( ((LA14_132>='0' && LA14_132<='9')||(LA14_132>='A' && LA14_132<='Z')||LA14_132=='_'||(LA14_132>='a' && LA14_132<='z')) ) {
                        return 64;
                    }
                    else {
                        return 10;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
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
        case 'o':
        case 'p':
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
            return 64;
            }
        default:
            return 32;}

    }

    private int mTokensHelper010() throws RecognitionException {
        return 11;
    }

    private int mTokensHelper011() throws RecognitionException {
        return 12;
    }

    private int mTokensHelper012() throws RecognitionException {
        return 13;
    }

    private int mTokensHelper013() throws RecognitionException {
        return 14;
    }

    private int mTokensHelper014() throws RecognitionException {
        return 15;
    }

    private int mTokensHelper015() throws RecognitionException {
        return 16;
    }

    private int mTokensHelper016() throws RecognitionException {
        return 17;
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA14_17 = input.LA(2);

        if ( (LA14_17=='.') ) {
            return 23;
        }
        else {
            return 18;}
    }

    private int mTokensHelper018() throws RecognitionException {
        int LA14_18 = input.LA(2);

        if ( (LA14_18=='n') ) {
            switch ( input.LA(3) ) {
            case 't':
                {
                switch ( input.LA(4) ) {
                case '6':
                    {
                    int LA14_133 = input.LA(5);

                    if ( (LA14_133=='4') ) {
                        int LA14_165 = input.LA(6);

                        if ( (LA14_165=='_') ) {
                            int LA14_193 = input.LA(7);

                            if ( (LA14_193=='t') ) {
                                int LA14_214 = input.LA(8);

                                if ( ((LA14_214>='0' && LA14_214<='9')||(LA14_214>='A' && LA14_214<='Z')||LA14_214=='_'||(LA14_214>='a' && LA14_214<='z')) ) {
                                    return 64;
                                }
                                else {
                                    return 51;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                case '3':
                    {
                    int LA14_134 = input.LA(5);

                    if ( (LA14_134=='2') ) {
                        int LA14_166 = input.LA(6);

                        if ( (LA14_166=='_') ) {
                            int LA14_194 = input.LA(7);

                            if ( (LA14_194=='t') ) {
                                int LA14_215 = input.LA(8);

                                if ( ((LA14_215>='0' && LA14_215<='9')||(LA14_215>='A' && LA14_215<='Z')||LA14_215=='_'||(LA14_215>='a' && LA14_215<='z')) ) {
                                    return 64;
                                }
                                else {
                                    return 49;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                case 'e':
                    {
                    int LA14_135 = input.LA(5);

                    if ( (LA14_135=='r') ) {
                        int LA14_167 = input.LA(6);

                        if ( (LA14_167=='f') ) {
                            int LA14_195 = input.LA(7);

                            if ( (LA14_195=='a') ) {
                                int LA14_216 = input.LA(8);

                                if ( (LA14_216=='c') ) {
                                    int LA14_232 = input.LA(9);

                                    if ( (LA14_232=='e') ) {
                                        int LA14_242 = input.LA(10);

                                        if ( ((LA14_242>='0' && LA14_242<='9')||(LA14_242>='A' && LA14_242<='Z')||LA14_242=='_'||(LA14_242>='a' && LA14_242<='z')) ) {
                                            return 64;
                                        }
                                        else {
                                            return 20;}
                                    }
                                    else {
                                        return 64;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                case '1':
                    {
                    int LA14_136 = input.LA(5);

                    if ( (LA14_136=='6') ) {
                        int LA14_168 = input.LA(6);

                        if ( (LA14_168=='_') ) {
                            int LA14_196 = input.LA(7);

                            if ( (LA14_196=='t') ) {
                                int LA14_217 = input.LA(8);

                                if ( ((LA14_217>='0' && LA14_217<='9')||(LA14_217>='A' && LA14_217<='Z')||LA14_217=='_'||(LA14_217>='a' && LA14_217<='z')) ) {
                                    return 64;
                                }
                                else {
                                    return 47;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                case 'p':
                    {
                    int LA14_137 = input.LA(5);

                    if ( (LA14_137=='t') ) {
                        int LA14_169 = input.LA(6);

                        if ( (LA14_169=='r') ) {
                            int LA14_197 = input.LA(7);

                            if ( (LA14_197=='_') ) {
                                int LA14_218 = input.LA(8);

                                if ( (LA14_218=='t') ) {
                                    int LA14_234 = input.LA(9);

                                    if ( ((LA14_234>='0' && LA14_234<='9')||(LA14_234>='A' && LA14_234<='Z')||LA14_234=='_'||(LA14_234>='a' && LA14_234<='z')) ) {
                                        return 64;
                                    }
                                    else {
                                        return 53;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
                case '8':
                    {
                    int LA14_138 = input.LA(5);

                    if ( (LA14_138=='_') ) {
                        int LA14_170 = input.LA(6);

                        if ( (LA14_170=='t') ) {
                            int LA14_198 = input.LA(7);

                            if ( ((LA14_198>='0' && LA14_198<='9')||(LA14_198>='A' && LA14_198<='Z')||LA14_198=='_'||(LA14_198>='a' && LA14_198<='z')) ) {
                                return 64;
                            }
                            else {
                                return 45;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                    }
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
                    return 64;
                    }
                default:
                    return 38;}

                }
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
                return 64;
                }
            default:
                return 55;}

        }
        else {
            return 64;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA14_19 = input.LA(2);

        if ( (LA14_19=='o') ) {
            switch ( input.LA(3) ) {
            case 'i':
                {
                int LA14_112 = input.LA(4);

                if ( (LA14_112=='d') ) {
                    int LA14_140 = input.LA(5);

                    if ( ((LA14_140>='0' && LA14_140<='9')||(LA14_140>='A' && LA14_140<='Z')||LA14_140=='_'||(LA14_140>='a' && LA14_140<='z')) ) {
                        return 64;
                    }
                    else {
                        return 22;}
                }
                else {
                    return 64;}
                }
            case 'l':
                {
                int LA14_113 = input.LA(4);

                if ( (LA14_113=='a') ) {
                    int LA14_141 = input.LA(5);

                    if ( (LA14_141=='t') ) {
                        int LA14_172 = input.LA(6);

                        if ( (LA14_172=='i') ) {
                            int LA14_199 = input.LA(7);

                            if ( (LA14_199=='l') ) {
                                int LA14_220 = input.LA(8);

                                if ( (LA14_220=='e') ) {
                                    int LA14_235 = input.LA(9);

                                    if ( ((LA14_235>='0' && LA14_235<='9')||(LA14_235>='A' && LA14_235<='Z')||LA14_235=='_'||(LA14_235>='a' && LA14_235<='z')) ) {
                                        return 64;
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 64;}
                            }
                            else {
                                return 64;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
                }
            default:
                return 64;}

        }
        else {
            return 64;}
    }

    private int mTokensHelper020() throws RecognitionException {
        return 25;
    }

    private int mTokensHelper021() throws RecognitionException {
        int LA14_21 = input.LA(2);

        if ( (LA14_21=='u') ) {
            int LA14_73 = input.LA(3);

            if ( (LA14_73=='l') ) {
                int LA14_114 = input.LA(4);

                if ( (LA14_114=='l') ) {
                    int LA14_142 = input.LA(5);

                    if ( ((LA14_142>='0' && LA14_142<='9')||(LA14_142>='A' && LA14_142<='Z')||LA14_142=='_'||(LA14_142>='a' && LA14_142<='z')) ) {
                        return 64;
                    }
                    else {
                        return 26;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
        }
        else {
            return 64;}
    }

    private int mTokensHelper022() throws RecognitionException {
        int LA14_22 = input.LA(2);

        if ( (LA14_22=='|') ) {
            return 27;
        }
        else {
            return 29;}
    }

    private int mTokensHelper023() throws RecognitionException {
        int LA14_23 = input.LA(2);

        if ( (LA14_23=='&') ) {
            return 28;
        }
        else {
            return 31;}
    }

    private int mTokensHelper024() throws RecognitionException {
        int LA14_24 = input.LA(2);

        if ( ((LA14_24>='A' && LA14_24<='Z')||LA14_24=='_'||(LA14_24>='a' && LA14_24<='z')) ) {
            return 64;
        }
        else {
            return 30;}
    }

    private int mTokensHelper025() throws RecognitionException {
        int LA14_25 = input.LA(2);

        if ( ((LA14_25>='0' && LA14_25<='9')||(LA14_25>='A' && LA14_25<='Z')||LA14_25=='_'||(LA14_25>='a' && LA14_25<='z')) ) {
            return 64;
        }
        else {
            return 33;}
    }

    private int mTokensHelper026() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA14_80 = input.LA(3);

            if ( (LA14_80=='n') ) {
                int LA14_115 = input.LA(4);

                if ( (LA14_115=='s') ) {
                    int LA14_143 = input.LA(5);

                    if ( (LA14_143=='t') ) {
                        int LA14_174 = input.LA(6);

                        if ( ((LA14_174>='0' && LA14_174<='9')||(LA14_174>='A' && LA14_174<='Z')||LA14_174=='_'||(LA14_174>='a' && LA14_174<='z')) ) {
                            return 64;
                        }
                        else {
                            return 34;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        case 'h':
            {
            int LA14_81 = input.LA(3);

            if ( (LA14_81=='a') ) {
                int LA14_116 = input.LA(4);

                if ( (LA14_116=='r') ) {
                    int LA14_144 = input.LA(5);

                    if ( ((LA14_144>='0' && LA14_144<='9')||(LA14_144>='A' && LA14_144<='Z')||LA14_144=='_'||(LA14_144>='a' && LA14_144<='z')) ) {
                        return 64;
                    }
                    else {
                        return 36;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        default:
            return 64;}

    }

    private int mTokensHelper027() throws RecognitionException {
        int LA14_27 = input.LA(2);

        if ( (LA14_27=='o') ) {
            int LA14_82 = input.LA(3);

            if ( (LA14_82=='n') ) {
                int LA14_117 = input.LA(4);

                if ( (LA14_117=='g') ) {
                    int LA14_145 = input.LA(5);

                    if ( ((LA14_145>='0' && LA14_145<='9')||(LA14_145>='A' && LA14_145<='Z')||LA14_145=='_'||(LA14_145>='a' && LA14_145<='z')) ) {
                        return 64;
                    }
                    else {
                        return 39;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
        }
        else {
            return 64;}
    }

    private int mTokensHelper028() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'l':
            {
            int LA14_83 = input.LA(3);

            if ( (LA14_83=='o') ) {
                int LA14_118 = input.LA(4);

                if ( (LA14_118=='a') ) {
                    int LA14_146 = input.LA(5);

                    if ( (LA14_146=='t') ) {
                        int LA14_177 = input.LA(6);

                        if ( ((LA14_177>='0' && LA14_177<='9')||(LA14_177>='A' && LA14_177<='Z')||LA14_177=='_'||(LA14_177>='a' && LA14_177<='z')) ) {
                            return 64;
                        }
                        else {
                            return 40;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
        case 'a':
            {
            int LA14_84 = input.LA(3);

            if ( (LA14_84=='l') ) {
                int LA14_119 = input.LA(4);

                if ( (LA14_119=='s') ) {
                    int LA14_147 = input.LA(5);

                    if ( (LA14_147=='e') ) {
                        int LA14_178 = input.LA(6);

                        if ( ((LA14_178>='0' && LA14_178<='9')||(LA14_178>='A' && LA14_178<='Z')||LA14_178=='_'||(LA14_178>='a' && LA14_178<='z')) ) {
                            return 64;
                        }
                        else {
                            return 58;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
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
        case 'm':
        case 'n':
        case 'o':
        case 'p':
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
            return 64;
            }
        default:
            return 63;}

    }

    private int mTokensHelper029() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA14_86 = input.LA(3);

            if ( (LA14_86=='u') ) {
                int LA14_120 = input.LA(4);

                if ( (LA14_120=='b') ) {
                    int LA14_148 = input.LA(5);

                    if ( (LA14_148=='l') ) {
                        int LA14_179 = input.LA(6);

                        if ( (LA14_179=='e') ) {
                            int LA14_202 = input.LA(7);

                            if ( ((LA14_202>='0' && LA14_202<='9')||(LA14_202>='A' && LA14_202<='Z')||LA14_202=='_'||(LA14_202>='a' && LA14_202<='z')) ) {
                                return 64;
                            }
                            else {
                                return 41;}
                        }
                        else {
                            return 64;}
                    }
                    else {
                        return 64;}
                }
                else {
                    return 64;}
            }
            else {
                return 64;}
            }
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
        case 'p':
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
            return 64;
            }
        default:
            return 63;}

    }

    private int mTokensHelper030() throws RecognitionException {
        int LA14_30 = input.LA(2);

        if ( (LA14_30=='u') ) {
            int LA14_87 = input.LA(3);

            if ( (LA14_87=='t') ) {
                int LA14_121 = input.LA(4);

                if ( ((LA14_121>='0' && LA14_121<='9')||(LA14_121>='A' && LA14_121<='Z')||LA14_121=='_'||(LA14_121>='a' && LA14_121<='z')) ) {
                    return 64;
                }
                else {
                    return 56;}
            }
            else {
                return 64;}
        }
        else {
            return 64;}
    }

    private int mTokensHelper031() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '<':
            {
            return 59;
            }
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
        case '^':
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
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            return 57;
            }
        default:
            return 70;}

    }

    private int mTokensHelper032() throws RecognitionException {
        int LA14_32 = input.LA(2);

        if ( (LA14_32=='>') ) {
            return 59;
        }
        else {
            return 70;}
    }

    private int mTokensHelper033() throws RecognitionException {
        return 60;
    }

    private int mTokensHelper034() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 68;
            }
        case '*':
            {
            return 67;
            }
        default:
            return 61;}

    }

    private int mTokensHelper035() throws RecognitionException {
        return 62;
    }

    private int mTokensHelper036() throws RecognitionException {
        int LA14_36 = input.LA(2);

        if ( ((LA14_36>='0' && LA14_36<='9')||(LA14_36>='A' && LA14_36<='Z')||LA14_36=='_'||(LA14_36>='a' && LA14_36<='z')) ) {
            return 64;
        }
        else {
            return 63;}
    }

    private int mTokensHelper037() throws RecognitionException {
        return 64;
    }

    private int mTokensHelper038() throws RecognitionException {
        return 65;
    }

    private int mTokensHelper039() throws RecognitionException {
        int LA14_39 = input.LA(2);

        if ( ((LA14_39>='\u0000' && LA14_39<='\uFFFE')) ) {
            return 66;
        }
        else {
            return 70;}
    }

    private int mTokensHelper040() throws RecognitionException {
        int LA14_40 = input.LA(2);

        if ( ((LA14_40>='\u0000' && LA14_40<='\uFFFE')) ) {
            return 66;
        }
        else {
            return 70;}
    }

    private int mTokensHelper041() throws RecognitionException {
        return 61;
    }

    private int mTokensHelper042() throws RecognitionException {
        return 69;
    }

    private int mTokensHelper043() throws RecognitionException {
        return 70;
    }

    private int mTokensHelper044() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_SHIFTOPERATION | RULE_ADDITIVEOPERATION | RULE_MULOPERATION | RULE_UNARYOPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

        throw nvae;
    }



 

}