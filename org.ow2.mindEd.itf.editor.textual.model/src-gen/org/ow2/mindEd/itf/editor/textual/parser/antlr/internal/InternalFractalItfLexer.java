package org.ow2.mindEd.itf.editor.textual.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFractalItfLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_MUL_OPERATION=11;
    public static final int RULE_BOOLEAN=7;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=4;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_UNARY_OPERATION=12;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FDSYMBOL=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SHIFT_OPERATION=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_INCLUDE_LIB=6;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_ADDITIVE_OPERATION=8;
    public static final int T__39=39;
    public static final int RULE_WS=16;

    // delegates
    // delegators

    public InternalFractalItfLexer() {;} 
    public InternalFractalItfLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFractalItfLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:11:7: ( ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:12:7: ( 'typedef' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:12:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:13:7: ( '{' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:14:7: ( '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:15:7: ( 'struct' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:15:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:16:7: ( 'union' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:16:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:17:7: ( ':' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:18:7: ( 'enum' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:18:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:19:7: ( ',' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:20:7: ( '=' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:21:7: ( '(' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:22:7: ( ')' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:23:7: ( '*' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:24:7: ( '[' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:25:7: ( ']' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:26:7: ( '.' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:27:7: ( '#define' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:27:9: '#define'
            {
            match("#define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:28:7: ( 'interface' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:28:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:29:7: ( 'unmanaged' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:29:9: 'unmanaged'
            {
            match("unmanaged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:30:7: ( 'void' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:30:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:31:7: ( '...' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:31:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:32:7: ( '#include' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:32:9: '#include'
            {
            match("#include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:33:7: ( '/' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:33:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:34:7: ( '@' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:34:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:35:7: ( 'null' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:35:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:36:7: ( '||' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:36:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:37:7: ( '&&' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:37:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:38:7: ( '|' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:38:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:39:7: ( '^' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:39:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:40:7: ( '&' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:40:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:41:7: ( 'e' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:41:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:42:7: ( 'E' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:42:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:43:7: ( 'const' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:43:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:44:7: ( 'volatile' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:44:9: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:45:7: ( 'char' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:45:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:46:7: ( 'short' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:46:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:47:7: ( 'int' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:47:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:48:7: ( 'long' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:48:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:49:7: ( 'float' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:49:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:50:7: ( 'double' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:50:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:51:7: ( 'signed' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:51:9: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:52:7: ( 'unsigned' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:52:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:53:7: ( 'string' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:53:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:54:7: ( 'int8_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:54:9: 'int8_t'
            {
            match("int8_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:55:7: ( 'uint8_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:55:9: 'uint8_t'
            {
            match("uint8_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:56:7: ( 'int16_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:56:9: 'int16_t'
            {
            match("int16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:57:7: ( 'uint16_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:57:9: 'uint16_t'
            {
            match("uint16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:58:7: ( 'int32_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:58:9: 'int32_t'
            {
            match("int32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:59:7: ( 'uint32_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:59:9: 'uint32_t'
            {
            match("uint32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:60:7: ( 'int64_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:60:9: 'int64_t'
            {
            match("int64_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:61:7: ( 'uint64_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:61:9: 'uint64_t'
            {
            match("uint64_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:62:7: ( 'intptr_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:62:9: 'intptr_t'
            {
            match("intptr_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:63:7: ( 'uintptr_t' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:63:9: 'uintptr_t'
            {
            match("uintptr_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:64:7: ( 'in' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:64:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:65:7: ( 'out' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:65:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "RULE_INCLUDE_LIB"
    public final void mRULE_INCLUDE_LIB() throws RecognitionException {
        try {
            int _type = RULE_INCLUDE_LIB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3645:18: ( '<' ( RULE_ID '/' )* RULE_ID '.' RULE_ID '>' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3645:20: '<' ( RULE_ID '/' )* RULE_ID '.' RULE_ID '>'
            {
            match('<'); 
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3645:24: ( RULE_ID '/' )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3645:25: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_ID(); 
            match('.'); 
            mRULE_ID(); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE_LIB"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3647:14: ( ( 'true' | 'false' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3647:16: ( 'true' | 'false' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3647:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3647:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3647:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_SHIFT_OPERATION"
    public final void mRULE_SHIFT_OPERATION() throws RecognitionException {
        try {
            int _type = RULE_SHIFT_OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3649:22: ( ( '<<' | '>>' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3649:24: ( '<<' | '>>' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3649:24: ( '<<' | '>>' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            else if ( (LA3_0=='>') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3649:25: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3649:30: '>>'
                    {
                    match(">>"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHIFT_OPERATION"

    // $ANTLR start "RULE_ADDITIVE_OPERATION"
    public final void mRULE_ADDITIVE_OPERATION() throws RecognitionException {
        try {
            int _type = RULE_ADDITIVE_OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3651:25: ( ( '+' | '-' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3651:27: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITIVE_OPERATION"

    // $ANTLR start "RULE_MUL_OPERATION"
    public final void mRULE_MUL_OPERATION() throws RecognitionException {
        try {
            int _type = RULE_MUL_OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3653:20: ( ( '*' | '/' | '%' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3653:22: ( '*' | '/' | '%' )
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_OPERATION"

    // $ANTLR start "RULE_UNARY_OPERATION"
    public final void mRULE_UNARY_OPERATION() throws RecognitionException {
        try {
            int _type = RULE_UNARY_OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3655:22: ( ( '&' | '*' | '+' | '-' | '~' | '!' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3655:24: ( '&' | '*' | '+' | '-' | '~' | '!' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARY_OPERATION"

    // $ANTLR start "RULE_FDSYMBOL"
    public final void mRULE_FDSYMBOL() throws RecognitionException {
        try {
            int _type = RULE_FDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3657:15: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3657:17: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FDSYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3659:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3659:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3659:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3659:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3659:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3661:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3661:12: ( '0' .. '9' )+
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3661:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3661:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3663:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3665:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3665:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3665:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3665:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3667:41: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3669:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3671:16: ( . )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3671:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | RULE_INCLUDE_LIB | RULE_BOOLEAN | RULE_SHIFT_OPERATION | RULE_ADDITIVE_OPERATION | RULE_MUL_OPERATION | RULE_UNARY_OPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=69;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:340: RULE_INCLUDE_LIB
                {
                mRULE_INCLUDE_LIB(); 

                }
                break;
            case 57 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:357: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 58 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:370: RULE_SHIFT_OPERATION
                {
                mRULE_SHIFT_OPERATION(); 

                }
                break;
            case 59 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:391: RULE_ADDITIVE_OPERATION
                {
                mRULE_ADDITIVE_OPERATION(); 

                }
                break;
            case 60 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:415: RULE_MUL_OPERATION
                {
                mRULE_MUL_OPERATION(); 

                }
                break;
            case 61 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:434: RULE_UNARY_OPERATION
                {
                mRULE_UNARY_OPERATION(); 

                }
                break;
            case 62 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:455: RULE_FDSYMBOL
                {
                mRULE_FDSYMBOL(); 

                }
                break;
            case 63 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:469: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 64 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:477: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:486: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:498: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 67 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:514: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:530: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 69 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1:538: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\6\uffff";
    static final String DFA1_minS =
        "\2\101\2\56\2\uffff";
    static final String DFA1_maxS =
        "\4\172\2\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\32\2\3\uffff\1\1\1\2\1\uffff\32\2",
            "\32\2\4\uffff\1\2\1\uffff\32\2",
            "\1\5\1\4\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
            "\1\5\1\4\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    static class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 3645:24: ( RULE_ID '/' )*";
        }
    }
    static final String DFA15_eotS =
        "\2\uffff\1\57\2\uffff\2\57\1\uffff\1\71\7\uffff\1\102\1\53\2\57"+
        "\1\111\1\uffff\1\57\1\115\1\117\1\120\1\121\2\57\2\127\1\57\2\53"+
        "\3\uffff\1\127\2\uffff\2\53\3\uffff\2\57\3\uffff\5\57\1\uffff\1"+
        "\57\14\uffff\1\155\1\57\4\uffff\1\57\6\uffff\5\57\1\uffff\2\57\10"+
        "\uffff\12\57\1\u0089\1\uffff\11\57\1\u0093\1\57\1\u0095\10\57\1"+
        "\u00a2\6\57\1\uffff\1\u00a9\1\57\1\u00ab\1\57\1\u00ad\1\u00ae\3"+
        "\57\1\uffff\1\57\1\uffff\2\57\1\u00b5\1\57\1\u00b7\7\57\1\uffff"+
        "\6\57\1\uffff\1\57\1\uffff\1\u00c6\2\uffff\1\u00c7\1\u0095\2\57"+
        "\1\u00ca\1\u00cb\1\uffff\1\u00cc\1\uffff\10\57\1\u00d5\5\57\2\uffff"+
        "\1\u00db\1\u00dc\3\uffff\2\57\1\u00df\5\57\1\uffff\1\u00e5\1\u00e6"+
        "\1\u00e7\2\57\2\uffff\1\57\1\u00eb\1\uffff\1\u00ec\1\u00ed\1\u00ee"+
        "\2\57\3\uffff\1\u00f1\1\u00f2\1\u00f3\4\uffff\1\u00f4\1\u00f5\5"+
        "\uffff";
    static final String DFA15_eofS =
        "\u00f6\uffff";
    static final String DFA15_minS =
        "\1\0\1\uffff\1\162\2\uffff\1\150\1\151\1\uffff\1\60\7\uffff\1\56"+
        "\1\144\1\156\1\157\1\52\1\uffff\1\165\1\174\1\46\1\101\1\60\1\150"+
        "\1\157\2\60\1\165\1\74\1\76\3\uffff\1\60\2\uffff\2\0\3\uffff\1\160"+
        "\1\165\3\uffff\1\162\1\157\1\147\1\151\1\156\1\uffff\1\165\14\uffff"+
        "\1\60\1\151\4\uffff\1\154\6\uffff\1\156\1\141\1\156\1\157\1\154"+
        "\1\uffff\1\165\1\164\10\uffff\2\145\1\151\1\162\1\156\1\157\1\141"+
        "\1\151\1\164\1\155\1\60\1\uffff\1\144\1\141\1\154\1\163\1\162\1"+
        "\147\1\141\1\163\1\142\1\60\1\144\1\60\1\143\1\156\1\164\1\145\2"+
        "\156\1\147\1\61\1\60\1\162\1\137\1\66\1\62\1\64\1\164\1\uffff\1"+
        "\60\1\164\1\60\1\164\2\60\1\164\1\145\1\154\1\uffff\1\145\1\uffff"+
        "\1\164\1\147\1\60\1\144\1\60\1\141\1\156\1\137\1\66\1\62\1\64\1"+
        "\164\1\uffff\1\146\1\164\3\137\1\162\1\uffff\1\151\1\uffff\1\60"+
        "\2\uffff\2\60\1\145\1\146\2\60\1\uffff\1\60\1\uffff\1\147\1\145"+
        "\1\164\3\137\1\162\1\141\1\60\3\164\1\137\1\154\2\uffff\2\60\3\uffff"+
        "\1\145\1\144\1\60\3\164\1\137\1\143\1\uffff\3\60\1\164\1\145\2\uffff"+
        "\1\144\1\60\1\uffff\3\60\1\164\1\145\3\uffff\3\60\4\uffff\2\60\5"+
        "\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\uffff\1\171\2\uffff\1\164\1\156\1\uffff\1\172\7\uffff"+
        "\1\56\1\151\1\156\1\157\1\57\1\uffff\1\165\1\174\1\46\2\172\2\157"+
        "\2\172\1\165\1\172\1\76\3\uffff\1\172\2\uffff\2\uffff\3\uffff\1"+
        "\160\1\165\3\uffff\1\162\1\157\1\147\1\163\1\156\1\uffff\1\165\14"+
        "\uffff\1\172\1\154\4\uffff\1\154\6\uffff\1\156\1\141\1\156\1\157"+
        "\1\154\1\uffff\1\165\1\164\10\uffff\2\145\1\165\1\162\1\156\1\157"+
        "\1\141\1\151\1\164\1\155\1\172\1\uffff\1\144\1\141\1\154\1\163\1"+
        "\162\1\147\1\141\1\163\1\142\1\172\1\144\1\172\1\143\1\156\1\164"+
        "\1\145\2\156\1\147\1\160\1\172\1\162\1\137\1\66\1\62\1\64\1\164"+
        "\1\uffff\1\172\1\164\1\172\1\164\2\172\1\164\1\145\1\154\1\uffff"+
        "\1\145\1\uffff\1\164\1\147\1\172\1\144\1\172\1\141\1\156\1\137\1"+
        "\66\1\62\1\64\1\164\1\uffff\1\146\1\164\3\137\1\162\1\uffff\1\151"+
        "\1\uffff\1\172\2\uffff\2\172\1\145\1\146\2\172\1\uffff\1\172\1\uffff"+
        "\1\147\1\145\1\164\3\137\1\162\1\141\1\172\3\164\1\137\1\154\2\uffff"+
        "\2\172\3\uffff\1\145\1\144\1\172\3\164\1\137\1\143\1\uffff\3\172"+
        "\1\164\1\145\2\uffff\1\144\1\172\1\uffff\3\172\1\164\1\145\3\uffff"+
        "\3\172\4\uffff\2\172\5\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\7\1\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\5\uffff\1\30\14\uffff\1\73\1\74\1\75\1\uffff"+
        "\1\77\1\100\2\uffff\1\104\1\105\1\1\2\uffff\1\77\1\3\1\4\5\uffff"+
        "\1\7\1\uffff\1\37\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\25\1\20\1"+
        "\21\1\26\2\uffff\1\102\1\103\1\27\1\30\1\uffff\1\32\1\34\1\33\1"+
        "\36\1\35\1\40\5\uffff\1\76\2\uffff\1\72\1\70\1\73\1\74\1\75\1\100"+
        "\1\101\1\104\13\uffff\1\66\33\uffff\1\45\11\uffff\1\67\1\uffff\1"+
        "\71\14\uffff\1\10\6\uffff\1\24\1\uffff\1\31\1\uffff\1\43\1\46\6"+
        "\uffff\1\44\1\uffff\1\6\16\uffff\1\41\1\47\2\uffff\1\5\1\53\1\51"+
        "\10\uffff\1\54\5\uffff\1\50\1\2\2\uffff\1\55\5\uffff\1\56\1\60\1"+
        "\62\3\uffff\1\52\1\57\1\61\1\63\2\uffff\1\64\1\42\1\23\1\65\1\22";
    static final String DFA15_specialS =
        "\1\0\47\uffff\1\2\1\1\u00cc\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\44\1\50\1\21\1\53\1\43\1"+
            "\30\1\51\1\13\1\14\1\15\1\42\1\11\1\42\1\20\1\24\12\47\1\7\1"+
            "\1\1\40\1\12\1\41\1\53\1\25\3\46\1\45\1\32\1\45\24\46\1\16\1"+
            "\53\1\17\1\31\1\46\1\53\2\46\1\33\1\36\1\10\1\35\2\46\1\22\2"+
            "\46\1\34\1\46\1\26\1\37\3\46\1\5\1\2\1\6\1\23\4\46\1\3\1\27"+
            "\1\4\1\44\uff81\53",
            "",
            "\1\56\6\uffff\1\55",
            "",
            "",
            "\1\63\1\64\12\uffff\1\62",
            "\1\66\4\uffff\1\65",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\70\14\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\103\4\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107\4\uffff\1\110",
            "",
            "\1\113",
            "\1\114",
            "\1\116",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\123\6\uffff\1\122",
            "\1\124",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\126\12\57\1\125"+
            "\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\130\13\57",
            "\1\131",
            "\1\132\4\uffff\32\133\3\uffff\2\133\1\uffff\32\133",
            "\1\132",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\0\140",
            "\0\140",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\3\uffff\1\150\5\uffff\1\151",
            "\1\152",
            "",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\154\6\57",
            "\1\156\2\uffff\1\157",
            "",
            "",
            "",
            "",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\173\13\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\57\1\u0085\1\57\1\u0086\2\57\1\u0087\1\57\1\u0084\1\57"+
            "\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0083\12\57\1\u0088"+
            "\12\57",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0094",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009e\1\uffff\1\u009f\2\uffff\1\u00a0\1\uffff\1\u009d\67"+
            "\uffff\1\u00a1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00aa",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ac",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c8",
            "\1\u00c9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "\1\u00ea",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | RULE_INCLUDE_LIB | RULE_BOOLEAN | RULE_SHIFT_OPERATION | RULE_ADDITIVE_OPERATION | RULE_MUL_OPERATION | RULE_UNARY_OPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0==';') ) {s = 1;}

                        else if ( (LA15_0=='t') ) {s = 2;}

                        else if ( (LA15_0=='{') ) {s = 3;}

                        else if ( (LA15_0=='}') ) {s = 4;}

                        else if ( (LA15_0=='s') ) {s = 5;}

                        else if ( (LA15_0=='u') ) {s = 6;}

                        else if ( (LA15_0==':') ) {s = 7;}

                        else if ( (LA15_0=='e') ) {s = 8;}

                        else if ( (LA15_0==',') ) {s = 9;}

                        else if ( (LA15_0=='=') ) {s = 10;}

                        else if ( (LA15_0=='(') ) {s = 11;}

                        else if ( (LA15_0==')') ) {s = 12;}

                        else if ( (LA15_0=='*') ) {s = 13;}

                        else if ( (LA15_0=='[') ) {s = 14;}

                        else if ( (LA15_0==']') ) {s = 15;}

                        else if ( (LA15_0=='.') ) {s = 16;}

                        else if ( (LA15_0=='#') ) {s = 17;}

                        else if ( (LA15_0=='i') ) {s = 18;}

                        else if ( (LA15_0=='v') ) {s = 19;}

                        else if ( (LA15_0=='/') ) {s = 20;}

                        else if ( (LA15_0=='@') ) {s = 21;}

                        else if ( (LA15_0=='n') ) {s = 22;}

                        else if ( (LA15_0=='|') ) {s = 23;}

                        else if ( (LA15_0=='&') ) {s = 24;}

                        else if ( (LA15_0=='^') ) {s = 25;}

                        else if ( (LA15_0=='E') ) {s = 26;}

                        else if ( (LA15_0=='c') ) {s = 27;}

                        else if ( (LA15_0=='l') ) {s = 28;}

                        else if ( (LA15_0=='f') ) {s = 29;}

                        else if ( (LA15_0=='d') ) {s = 30;}

                        else if ( (LA15_0=='o') ) {s = 31;}

                        else if ( (LA15_0=='<') ) {s = 32;}

                        else if ( (LA15_0=='>') ) {s = 33;}

                        else if ( (LA15_0=='+'||LA15_0=='-') ) {s = 34;}

                        else if ( (LA15_0=='%') ) {s = 35;}

                        else if ( (LA15_0=='!'||LA15_0=='~') ) {s = 36;}

                        else if ( (LA15_0=='D'||LA15_0=='F') ) {s = 37;}

                        else if ( ((LA15_0>='A' && LA15_0<='C')||(LA15_0>='G' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='b')||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='r')||(LA15_0>='w' && LA15_0<='z')) ) {s = 38;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 39;}

                        else if ( (LA15_0=='\"') ) {s = 40;}

                        else if ( (LA15_0=='\'') ) {s = 41;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 42;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='$'||LA15_0=='?'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='\u007F' && LA15_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_41 = input.LA(1);

                        s = -1;
                        if ( ((LA15_41>='\u0000' && LA15_41<='\uFFFF')) ) {s = 96;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_40 = input.LA(1);

                        s = -1;
                        if ( ((LA15_40>='\u0000' && LA15_40<='\uFFFF')) ) {s = 96;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}