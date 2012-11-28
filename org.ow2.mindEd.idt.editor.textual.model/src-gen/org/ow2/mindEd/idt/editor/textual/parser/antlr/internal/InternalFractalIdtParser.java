package org.ow2.mindEd.idt.editor.textual.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ow2.mindEd.idt.editor.textual.services.FractalIdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalIdtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDE_LIB", "RULE_BOOLEAN", "RULE_ADDITIVE_OPERATION", "RULE_INT", "RULE_SHIFT_OPERATION", "RULE_MUL_OPERATION", "RULE_UNARY_OPERATION", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#ifndef'", "'#endif'", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'('", "')'", "'*'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'/'", "'@'", "'null'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'e'", "'E'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
    };
    public static final int T__68=68;
    public static final int RULE_MUL_OPERATION=11;
    public static final int RULE_BOOLEAN=7;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int RULE_FDSYMBOL=13;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_SHIFT_OPERATION=10;
    public static final int RULE_INCLUDE_LIB=6;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_ADDITIVE_OPERATION=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=16;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalFractalIdtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFractalIdtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFractalIdtParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalIdtGrammarAccess grammarAccess;
     	
        public InternalFractalIdtParser(TokenStream input, FractalIdtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IdtFile";	
       	}
       	
       	@Override
       	protected FractalIdtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIdtFile"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:74:1: entryRuleIdtFile returns [EObject current=null] : iv_ruleIdtFile= ruleIdtFile EOF ;
    public final EObject entryRuleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdtFile = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:75:2: (iv_ruleIdtFile= ruleIdtFile EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:76:2: iv_ruleIdtFile= ruleIdtFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdtFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdtFile_in_entryRuleIdtFile81);
            iv_ruleIdtFile=ruleIdtFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdtFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdtFile91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdtFile"


    // $ANTLR start "ruleIdtFile"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:83:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject lv_begindef_0_0 = null;

        EObject lv_def_1_0 = null;

        EObject lv_includes_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_endDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:86:28: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:88:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:88:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:89:3: lv_begindef_0_0= ruleConstantDefinitionBegin
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137);
            lv_begindef_0_0=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"begindef",
                      		lv_begindef_0_0, 
                      		"ConstantDefinitionBegin");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:105:2: ( (lv_def_1_0= ruleConstantDefinition ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:106:1: (lv_def_1_0= ruleConstantDefinition )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:106:1: (lv_def_1_0= ruleConstantDefinition )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:107:3: lv_def_1_0= ruleConstantDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleIdtFile158);
            lv_def_1_0=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"ConstantDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:123:2: ( (lv_includes_2_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_includes_2_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_includes_2_0= ruleIncludeDirective )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:125:3: lv_includes_2_0= ruleIncludeDirective
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_ruleIdtFile179);
            	    lv_includes_2_0=ruleIncludeDirective();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"includes",
            	              		lv_includes_2_0, 
            	              		"IncludeDirective");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:141:3: ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==36) ) {
                    alt2=1;
                }
                else if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=25)||LA2_0==27) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:141:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:141:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:142:1: (lv_constant_3_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:142:1: (lv_constant_3_0= ruleConstantDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:143:3: lv_constant_3_0= ruleConstantDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleIdtFile202);
            	    lv_constant_3_0=ruleConstantDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constant",
            	              		lv_constant_3_0, 
            	              		"ConstantDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:160:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:160:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:161:1: (lv_type_4_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:161:1: (lv_type_4_0= ruleTypeDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:162:3: lv_type_4_0= ruleTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleIdtFile229);
            	    lv_type_4_0=ruleTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"type",
            	              		lv_type_4_0, 
            	              		"TypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:178:4: ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:179:1: (lv_endDef_5_0= ruleConstantDefinitionEnd )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:179:1: (lv_endDef_5_0= ruleConstantDefinitionEnd )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:180:3: lv_endDef_5_0= ruleConstantDefinitionEnd
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getEndDefConstantDefinitionEndParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile252);
            lv_endDef_5_0=ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"endDef",
                      		lv_endDef_5_0, 
                      		"ConstantDefinitionEnd");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdtFile"


    // $ANTLR start "entryRuleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:204:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:205:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:206:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin288);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionBegin; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinitionBegin298); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDefinitionBegin"


    // $ANTLR start "ruleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:213:1: ruleConstantDefinitionBegin returns [EObject current=null] : (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:216:28: ( (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:217:1: (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:217:1: (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:217:3: otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantDefinitionBegin335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:222:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:222:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDefinitionBeginAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefinitionBeginRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDefinitionBegin"


    // $ANTLR start "entryRuleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:247:1: entryRuleConstantDefinitionEnd returns [String current=null] : iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF ;
    public final String entryRuleConstantDefinitionEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantDefinitionEnd = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:248:2: (iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:249:2: iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionEndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd394);
            iv_ruleConstantDefinitionEnd=ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionEnd.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinitionEnd405); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDefinitionEnd"


    // $ANTLR start "ruleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:256:1: ruleConstantDefinitionEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#endif' ;
    public final AntlrDatatypeRuleToken ruleConstantDefinitionEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:259:28: (kw= '#endif' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:261:2: kw= '#endif'
            {
            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantDefinitionEnd442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDefinitionEnd"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:276:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:277:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:278:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition483);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition493); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:285:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:288:28: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 24:
            case 25:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:290:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition544);
                    this_TypedefSpecification_0=ruleTypedefSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedefSpecification_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:303:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition574);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructOrUnionSpecification_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:316:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition604);
                    this_EnumSpecification_2=ruleEnumSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumSpecification_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTypeDefinition616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleTypedefSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:339:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:340:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:341:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedefSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification652);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefSpecification662); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedefSpecification"


    // $ANTLR start "ruleTypedefSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:348:1: ruleTypedefSpecification returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:351:28: ( (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:3: otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedefSpecification699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:356:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:357:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:357:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:358:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification720);
            lv_qualifedType_1_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedefSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"qualifedType",
                      		lv_qualifedType_1_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:374:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:375:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:375:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:376:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleTypedefSpecification741);
            lv_dec_2_0=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedefSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_2_0, 
                      		"Declarators");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedefSpecification"


    // $ANTLR start "entryRuleQualifiedTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:400:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:401:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:402:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification777);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedTypeSpecification"


    // $ANTLR start "ruleQualifiedTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:409:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:412:28: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=52 && LA4_0<=53)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:414:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:414:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:415:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification833);
            	    lv_typeQualifier_0_0=ruleTypeQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQualifiedTypeSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeQualifier",
            	              		lv_typeQualifier_0_0, 
            	              		"TypeQualifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:431:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:432:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:432:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:433:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification855);
            lv_typeSpec_1_0=ruleTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQualifiedTypeSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpec",
                      		lv_typeSpec_1_0, 
                      		"TypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedTypeSpecification"


    // $ANTLR start "entryRuleTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:457:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:458:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:459:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification891);
            iv_ruleTypeSpecification=ruleTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSpecification901); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpecification"


    // $ANTLR start "ruleTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:466:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;

        Enumerator lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:469:28: ( ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 24:
            case 25:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 39:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:471:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:471:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:472:3: lv_typeDefName_0_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameQualifiedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTypeSpecification947);
                    lv_typeDefName_0_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeSpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"typeDefName",
                              		lv_typeDefName_0_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:490:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification978);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructOrUnionSpecification_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:503:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification1008);
                    this_EnumSpecification_2=ruleEnumSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumSpecification_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:516:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:516:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:517:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1035);
                    lv_typeSpecifier_3_0=ruleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeSpecificationRule());
                      	        }
                             		add(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_3_0, 
                              		"TypeSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:533:2: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==39||(LA5_0>=54 && LA5_0<=72)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:534:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:534:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:535:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1056);
                    	    lv_typeSpecifier_4_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_4_0, 
                    	              		"TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecification"


    // $ANTLR start "entryRuleStructOrUnionSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:559:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:560:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:561:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1094);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1104); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructOrUnionSpecification"


    // $ANTLR start "ruleStructOrUnionSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:568:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:571:28: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:572:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:572:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==20||LA7_3==26||LA7_3==28||(LA7_3>=30 && LA7_3<=33)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==22) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==25) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==20||LA7_3==26||LA7_3==28||(LA7_3>=30 && LA7_3<=33)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==22) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:573:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1154);
                    this_StructOrUnionDefinition_0=ruleStructOrUnionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructOrUnionDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:586:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1184);
                    this_StructorUnionReference_1=ruleStructorUnionReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructorUnionReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructOrUnionSpecification"


    // $ANTLR start "entryRuleStructOrUnionDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:605:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:606:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:607:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1219);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructOrUnionDefinition"


    // $ANTLR start "ruleStructOrUnionDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:614:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:617:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:619:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:619:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:620:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1275);
            lv_struct_0_0=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructOrUnionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"struct",
                      		lv_struct_0_0, 
                      		"StructOrUnion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:636:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:637:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:637:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:638:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStructOrUnionDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStructOrUnionDefinition1310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:658:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=24 && LA9_0<=25)||LA9_0==27||LA9_0==39||LA9_0==43||(LA9_0>=52 && LA9_0<=72)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:659:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:659:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:660:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1331);
            	    lv_structMember_3_0=ruleStructMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStructOrUnionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"structMember",
            	              		lv_structMember_3_0, 
            	              		"StructMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStructOrUnionDefinition1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructOrUnionDefinition"


    // $ANTLR start "entryRuleStructorUnionReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:688:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:689:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:690:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructorUnionReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1380);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructorUnionReference1390); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructorUnionReference"


    // $ANTLR start "ruleStructorUnionReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:697:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:700:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:702:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:702:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:703:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1436);
            lv_struct_0_0=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructorUnionReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"struct",
                      		lv_struct_0_0, 
                      		"StructOrUnion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:719:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:720:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:720:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:721:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructorUnionReference1453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStructorUnionReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructorUnionReference"


    // $ANTLR start "entryRuleStructOrUnion"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:745:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:746:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:747:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1495);
            iv_ruleStructOrUnion=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnion1506); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructOrUnion"


    // $ANTLR start "ruleStructOrUnion"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:754:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:757:28: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:758:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:758:1: (kw= 'struct' | kw= 'union' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:759:2: kw= 'struct'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStructOrUnion1544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:766:2: kw= 'union'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStructOrUnion1563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructOrUnion"


    // $ANTLR start "entryRuleStructMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:779:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:780:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:781:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_entryRuleStructMember1603);
            iv_ruleStructMember=ruleStructMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructMember1613); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructMember"


    // $ANTLR start "ruleStructMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:788:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_qualType_1_0 = null;

        EObject lv_dec_2_0 = null;

        EObject lv_constExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:791:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:793:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:793:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:794:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleStructMember1659);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:810:3: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:811:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:811:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:812:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1681);
            lv_qualType_1_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
              	        }
                     		set(
                     			current, 
                     			"qualType",
                      		lv_qualType_1_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:828:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:829:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:829:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:830:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleStructMember1702);
            lv_dec_2_0=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_2_0, 
                      		"Declarators");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:846:2: (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:846:4: otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStructMember1715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStructMemberAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:850:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:851:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:851:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:852:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleStructMember1736);
                    lv_constExpr_4_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"constExpr",
                              		lv_constExpr_4_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStructMember1750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStructMemberAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructMember"


    // $ANTLR start "entryRuleEnumSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:880:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:881:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:882:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1786);
            iv_ruleEnumSpecification=ruleEnumSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumSpecification1796); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumSpecification"


    // $ANTLR start "ruleEnumSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:889:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:892:28: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:893:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:893:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==22) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==EOF||LA13_2==RULE_ID||LA13_2==20||LA13_2==26||LA13_2==28||(LA13_2>=30 && LA13_2<=33)) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==22) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:894:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1846);
                    this_EnumDefinition_0=ruleEnumDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:907:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_ruleEnumSpecification1876);
                    this_EnumReference_1=ruleEnumReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumSpecification"


    // $ANTLR start "entryRuleEnumDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:926:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:927:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:928:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1911);
            iv_ruleEnumDefinition=ruleEnumDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumDefinition1921); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDefinition"


    // $ANTLR start "ruleEnumDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:935:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enumMemberList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:938:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:939:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:939:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:939:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumDefinition1958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:943:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:944:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:944:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:945:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumDefinition1975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnumDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumDefinition1993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:965:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:966:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:966:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:967:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2014);
            lv_enumMemberList_3_0=ruleEnumMemberList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"enumMemberList",
                      		lv_enumMemberList_3_0, 
                      		"EnumMemberList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumDefinition2026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumDefinition"


    // $ANTLR start "entryRuleEnumReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:995:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:996:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:997:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_entryRuleEnumReference2062);
            iv_ruleEnumReference=ruleEnumReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumReference2072); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumReference"


    // $ANTLR start "ruleEnumReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1004:1: ruleEnumReference returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1007:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1008:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1008:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1008:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumReference2109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumReferenceAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1012:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1013:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1013:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1014:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumReference2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumReference"


    // $ANTLR start "entryRuleEnumMemberList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1038:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1039:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1040:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2167);
            iv_ruleEnumMemberList=ruleEnumMemberList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMemberList2177); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumMemberList"


    // $ANTLR start "ruleEnumMemberList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1047:1: ruleEnumMemberList returns [EObject current=null] : ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enumMember_0_0 = null;

        EObject lv_enumMember_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1050:28: ( ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:2: ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:2: ( (lv_enumMember_0_0= ruleEnumMember ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1052:1: (lv_enumMember_0_0= ruleEnumMember )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1052:1: (lv_enumMember_0_0= ruleEnumMember )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1053:3: lv_enumMember_0_0= ruleEnumMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2223);
            lv_enumMember_0_0=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumMemberListRule());
              	        }
                     		add(
                     			current, 
                     			"enumMember",
                      		lv_enumMember_0_0, 
                      		"EnumMember");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1069:2: (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1069:4: otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEnumMemberList2236); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1073:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1074:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1074:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1075:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2257);
            	    lv_enumMember_2_0=ruleEnumMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumMemberListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enumMember",
            	              		lv_enumMember_2_0, 
            	              		"EnumMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumMemberList"


    // $ANTLR start "entryRuleEnumMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1099:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1100:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1101:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_entryRuleEnumMember2295);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMember2305); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1108:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_constExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1111:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1113:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1113:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1114:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumMember2347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumMemberRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1130:2: (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1130:4: otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumMember2365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1134:1: ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1135:1: (lv_constExpr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1135:1: (lv_constExpr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1136:3: lv_constExpr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleEnumMember2386);
                    lv_constExpr_2_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"constExpr",
                              		lv_constExpr_2_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleDeclarators"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1160:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1161:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1162:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_entryRuleDeclarators2424);
            iv_ruleDeclarators=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarators2434); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarators"


    // $ANTLR start "ruleDeclarators"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1169:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1172:28: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:2: ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1174:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1174:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1175:3: lv_dec_0_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2480);
            lv_dec_0_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaratorsRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_0_0, 
                      		"Declarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1191:2: (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1191:4: otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDeclarators2493); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1195:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1196:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1196:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1197:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2514);
            	    lv_declaratorList_2_0=ruleDeclarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclaratorsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaratorList",
            	              		lv_declaratorList_2_0, 
            	              		"Declarator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarators"


    // $ANTLR start "entryRuleDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1221:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1222:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1223:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_entryRuleDeclarator2552);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarator2562); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarator"


    // $ANTLR start "ruleDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1230:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( ( (lv_dc_1_0= ruleDirectNamedDeclarator ) ) | ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) ) | (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;

        EObject lv_dc_2_0 = null;

        EObject lv_dec_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1233:28: ( ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( ( (lv_dc_1_0= ruleDirectNamedDeclarator ) ) | ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) ) | (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:1: ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( ( (lv_dc_1_0= ruleDirectNamedDeclarator ) ) | ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) ) | (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:1: ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( ( (lv_dc_1_0= ruleDirectNamedDeclarator ) ) | ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) ) | (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:2: ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( ( (lv_dc_1_0= ruleDirectNamedDeclarator ) ) | ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) ) | (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:2: ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1235:1: (lv_pointer_0_0= ruleQualifiedPointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1235:1: (lv_pointer_0_0= ruleQualifiedPointerSpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1236:3: lv_pointer_0_0= ruleQualifiedPointerSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getPointerQualifiedPointerSpecificationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedPointerSpecification_in_ruleDeclarator2608);
            	    lv_pointer_0_0=ruleQualifiedPointerSpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pointer",
            	              		lv_pointer_0_0, 
            	              		"QualifiedPointerSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1252:3: ( ( (lv_dc_1_0= ruleDirectNamedDeclarator ) ) | ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) ) | (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case EOF:
            case 20:
            case 26:
            case 28:
            case 31:
            case 33:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1252:4: ( (lv_dc_1_0= ruleDirectNamedDeclarator ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1252:4: ( (lv_dc_1_0= ruleDirectNamedDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1253:1: (lv_dc_1_0= ruleDirectNamedDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1253:1: (lv_dc_1_0= ruleDirectNamedDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1254:3: lv_dc_1_0= ruleDirectNamedDeclarator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectNamedDeclaratorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDirectNamedDeclarator_in_ruleDeclarator2631);
                    lv_dc_1_0=ruleDirectNamedDeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"dc",
                              		lv_dc_1_0, 
                              		"DirectNamedDeclarator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1271:6: ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1271:6: ( (lv_dc_2_0= ruleDirectAnonymousDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1272:1: (lv_dc_2_0= ruleDirectAnonymousDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1272:1: (lv_dc_2_0= ruleDirectAnonymousDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1273:3: lv_dc_2_0= ruleDirectAnonymousDeclarator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectAnonymousDeclaratorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDirectAnonymousDeclarator_in_ruleDeclarator2658);
                    lv_dc_2_0=ruleDirectAnonymousDeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"dc",
                              		lv_dc_2_0, 
                              		"DirectAnonymousDeclarator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1290:6: (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1290:6: (otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1290:8: otherlv_3= '(' ( (lv_dec_4_0= ruleDeclarator ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDeclarator2677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeclaratorAccess().getLeftParenthesisKeyword_1_2_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1294:1: ( (lv_dec_4_0= ruleDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1295:1: (lv_dec_4_0= ruleDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1295:1: (lv_dec_4_0= ruleDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1296:3: lv_dec_4_0= ruleDeclarator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDecDeclaratorParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarator2698);
                    lv_dec_4_0=ruleDeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"dec",
                              		lv_dec_4_0, 
                              		"Declarator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDeclarator2710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDeclaratorAccess().getRightParenthesisKeyword_1_2_2());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRuleQualifiedPointerSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1324:1: entryRuleQualifiedPointerSpecification returns [EObject current=null] : iv_ruleQualifiedPointerSpecification= ruleQualifiedPointerSpecification EOF ;
    public final EObject entryRuleQualifiedPointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPointerSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1325:2: (iv_ruleQualifiedPointerSpecification= ruleQualifiedPointerSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1326:2: iv_ruleQualifiedPointerSpecification= ruleQualifiedPointerSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedPointerSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedPointerSpecification_in_entryRuleQualifiedPointerSpecification2748);
            iv_ruleQualifiedPointerSpecification=ruleQualifiedPointerSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedPointerSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedPointerSpecification2758); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedPointerSpecification"


    // $ANTLR start "ruleQualifiedPointerSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1333:1: ruleQualifiedPointerSpecification returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* ) ;
    public final EObject ruleQualifiedPointerSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_typeQualifiers_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1336:28: ( ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1337:1: ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1337:1: ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1337:2: () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1337:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1338:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQualifiedPointerSpecificationAccess().getQualifiedPointerSpecificationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleQualifiedPointerSpecification2807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQualifiedPointerSpecificationAccess().getAsteriskKeyword_1());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1350:1: ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=52 && LA20_0<=53)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1351:1: (lv_typeQualifiers_2_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1351:1: (lv_typeQualifiers_2_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1352:3: lv_typeQualifiers_2_0= ruleTypeQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedPointerSpecificationAccess().getTypeQualifiersTypeQualifierEnumRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedPointerSpecification2828);
            	    lv_typeQualifiers_2_0=ruleTypeQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQualifiedPointerSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeQualifiers",
            	              		lv_typeQualifiers_2_0, 
            	              		"TypeQualifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedPointerSpecification"


    // $ANTLR start "entryRuleDirectNamedDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1376:1: entryRuleDirectNamedDeclarator returns [EObject current=null] : iv_ruleDirectNamedDeclarator= ruleDirectNamedDeclarator EOF ;
    public final EObject entryRuleDirectNamedDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectNamedDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1377:2: (iv_ruleDirectNamedDeclarator= ruleDirectNamedDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1378:2: iv_ruleDirectNamedDeclarator= ruleDirectNamedDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectNamedDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectNamedDeclarator_in_entryRuleDirectNamedDeclarator2865);
            iv_ruleDirectNamedDeclarator=ruleDirectNamedDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirectNamedDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectNamedDeclarator2875); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectNamedDeclarator"


    // $ANTLR start "ruleDirectNamedDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1385:1: ruleDirectNamedDeclarator returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectNamedDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1388:28: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:1: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:1: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:2: ( (lv_id_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1390:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1390:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1391:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDirectNamedDeclarator2917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_0_0, grammarAccess.getDirectNamedDeclaratorAccess().getIdIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDirectNamedDeclaratorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1407:2: ( (lv_array_1_0= ruleArraySpecification ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1408:1: (lv_array_1_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1408:1: (lv_array_1_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1409:3: lv_array_1_0= ruleArraySpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDirectNamedDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectNamedDeclarator2943);
            	    lv_array_1_0=ruleArraySpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDirectNamedDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"array",
            	              		lv_array_1_0, 
            	              		"ArraySpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectNamedDeclarator"


    // $ANTLR start "entryRuleDirectAnonymousDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1433:1: entryRuleDirectAnonymousDeclarator returns [EObject current=null] : iv_ruleDirectAnonymousDeclarator= ruleDirectAnonymousDeclarator EOF ;
    public final EObject entryRuleDirectAnonymousDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectAnonymousDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1434:2: (iv_ruleDirectAnonymousDeclarator= ruleDirectAnonymousDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1435:2: iv_ruleDirectAnonymousDeclarator= ruleDirectAnonymousDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectAnonymousDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectAnonymousDeclarator_in_entryRuleDirectAnonymousDeclarator2980);
            iv_ruleDirectAnonymousDeclarator=ruleDirectAnonymousDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirectAnonymousDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectAnonymousDeclarator2990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectAnonymousDeclarator"


    // $ANTLR start "ruleDirectAnonymousDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1442:1: ruleDirectAnonymousDeclarator returns [EObject current=null] : ( () ( (lv_array_1_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectAnonymousDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1445:28: ( ( () ( (lv_array_1_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1446:1: ( () ( (lv_array_1_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1446:1: ( () ( (lv_array_1_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1446:2: () ( (lv_array_1_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1446:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDirectAnonymousDeclaratorAccess().getDirectAnonymousDeclaratorAction_0(),
                          current);
                  
            }

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1455:2: ( (lv_array_1_0= ruleArraySpecification ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1456:1: (lv_array_1_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1456:1: (lv_array_1_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1457:3: lv_array_1_0= ruleArraySpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDirectAnonymousDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectAnonymousDeclarator3048);
            	    lv_array_1_0=ruleArraySpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDirectAnonymousDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"array",
            	              		lv_array_1_0, 
            	              		"ArraySpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectAnonymousDeclarator"


    // $ANTLR start "entryRuleArraySpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1481:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1482:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1483:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3085);
            iv_ruleArraySpecification=ruleArraySpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArraySpecification3095); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySpecification"


    // $ANTLR start "ruleArraySpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1490:1: ruleArraySpecification returns [EObject current=null] : ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        Token lv_unspecifiedSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fixedSize_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1493:28: ( ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                int LA23_1 = input.LA(2);

                if ( ((LA23_1>=RULE_ID && LA23_1<=RULE_STRING)||(LA23_1>=RULE_ADDITIVE_OPERATION && LA23_1<=RULE_INT)||LA23_1==RULE_UNARY_OPERATION||LA23_1==30||LA23_1==35) ) {
                    alt23=2;
                }
                else if ( (LA23_1==34) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:3: ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']'
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:3: ( (lv_unspecifiedSize_0_0= '[' ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1495:1: (lv_unspecifiedSize_0_0= '[' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1495:1: (lv_unspecifiedSize_0_0= '[' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1496:3: lv_unspecifiedSize_0_0= '['
                    {
                    lv_unspecifiedSize_0_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArraySpecification3139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unspecifiedSize_0_0, grammarAccess.getArraySpecificationAccess().getUnspecifiedSizeLeftSquareBracketKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArraySpecificationRule());
                      	        }
                             		setWithLastConsumed(current, "unspecifiedSize", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArraySpecification3164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1514:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1514:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1514:8: otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArraySpecification3184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1518:1: ( (lv_fixedSize_3_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1519:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1519:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1520:3: lv_fixedSize_3_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArraySpecificationAccess().getFixedSizeConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleArraySpecification3205);
                    lv_fixedSize_3_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArraySpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"fixedSize",
                              		lv_fixedSize_3_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArraySpecification3217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySpecification"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1548:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1549:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1550:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3255);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName3266); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1557:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1560:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1561:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1561:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1561:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1568:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1569:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleQualifiedName3325); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3340); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleConstantDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1589:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1590:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1591:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3387);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinition3397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1598:1: ruleConstantDefinition returns [EObject current=null] : (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1601:28: ( (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1602:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1602:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1602:3: otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConstantDefinition3434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1606:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1607:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1607:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinition3451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1624:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=RULE_ADDITIVE_OPERATION && LA25_0<=RULE_INT)||LA25_0==RULE_UNARY_OPERATION||LA25_0==30||LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1625:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1625:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1626:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3477);
                    lv_expr_2_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1650:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1651:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1652:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3514);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition3524); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1659:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_methodDef_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1662:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1663:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1663:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1663:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1663:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1664:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1664:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1665:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3570);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInterfaceDefinition3583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1685:1: (otherlv_2= 'unmanaged' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1685:3: otherlv_2= 'unmanaged'
                    {
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInterfaceDefinition3596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1689:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1690:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1690:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1691:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3619);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1707:2: (otherlv_4= ':' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1707:4: otherlv_4= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceDefinition3632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1711:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1712:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1712:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1713:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2InterfaceDefinitionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3659);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInterfaceDefinition3673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1733:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||(LA29_0>=24 && LA29_0<=25)||LA29_0==27||LA29_0==39||LA29_0==43||(LA29_0>=52 && LA29_0<=72)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1734:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1734:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1735:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3694);
            	    lv_methodDef_7_0=ruleMethodDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methodDef",
            	              		lv_methodDef_7_0, 
            	              		"MethodDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInterfaceDefinition3707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleMethodDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1763:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1764:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1765:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3743);
            iv_ruleMethodDefinition=ruleMethodDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodDefinition3753); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDefinition"


    // $ANTLR start "ruleMethodDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1772:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_pointerSpecification_2_0 = null;

        EObject lv_ParameterList_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1775:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1776:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1776:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1776:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1776:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1777:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1777:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1778:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3799);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1794:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1795:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1795:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1796:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3821);
            lv_qualifiedTypeSpec_1_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"qualifiedTypeSpec",
                      		lv_qualifiedTypeSpec_1_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1812:2: ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1813:1: (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1813:1: (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1814:3: lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationQualifiedPointerSpecificationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedPointerSpecification_in_ruleMethodDefinition3842);
            	    lv_pointerSpecification_2_0=ruleQualifiedPointerSpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pointerSpecification",
            	              		lv_pointerSpecification_2_0, 
            	              		"QualifiedPointerSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1830:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1831:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1831:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1832:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodDefinition3860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMethodDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:2: ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 24:
                case 25:
                case 27:
                case 43:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                    {
                    alt33=2;
                    }
                    break;
                case 39:
                    {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==RULE_ID||LA33_3==28||LA33_3==30||(LA33_3>=32 && LA33_3<=33)||LA33_3==39||(LA33_3>=54 && LA33_3<=72)) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==31) ) {
                        int LA33_5 = input.LA(4);

                        if ( (synpred38_InternalFractalIdt()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    alt33=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:5: otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMethodDefinition3879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_0_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1852:1: (otherlv_5= 'void' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==39) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1852:3: otherlv_5= 'void'
                            {
                            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMethodDefinition3892); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodDefinition3906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1861:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1861:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1861:8: otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMethodDefinition3926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1865:1: ( (lv_ParameterList_8_0= ruleParameterList ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1866:1: (lv_ParameterList_8_0= ruleParameterList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1866:1: (lv_ParameterList_8_0= ruleParameterList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1867:3: lv_ParameterList_8_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_ruleMethodDefinition3947);
                    lv_ParameterList_8_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"ParameterList",
                              		lv_ParameterList_8_0, 
                              		"ParameterList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodDefinition3959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMethodDefinition3973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDefinition"


    // $ANTLR start "entryRuleParameterList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1899:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1900:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1901:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_entryRuleParameterList4009);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterList4019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1908:1: ruleParameterList returns [EObject current=null] : ( ( (lv_params_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1911:28: ( ( ( (lv_params_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1912:1: ( ( (lv_params_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1912:1: ( ( (lv_params_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1912:2: ( (lv_params_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1912:2: ( (lv_params_0_0= ruleParameter ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1913:1: (lv_params_0_0= ruleParameter )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1913:1: (lv_params_0_0= ruleParameter )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:3: lv_params_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList4065);
            lv_params_0_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterListRule());
              	        }
                     		add(
                     			current, 
                     			"params",
                      		lv_params_0_0, 
                      		"Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1930:2: (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID||(LA34_1>=24 && LA34_1<=25)||LA34_1==27||LA34_1==39||LA34_1==43||(LA34_1>=52 && LA34_1<=74)) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1930:4: otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList4078); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1934:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1935:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1935:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1936:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList4099);
            	    lv_params_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_2_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1952:4: (otherlv_3= ',' otherlv_4= '...' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1952:6: otherlv_3= ',' otherlv_4= '...'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList4114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_0());
                          
                    }
                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleParameterList4126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1968:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1969:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1970:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4164);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4174); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1977:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1980:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1981:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1981:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1981:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1981:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1982:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1982:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1983:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleParameter4220);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1999:3: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=73 && LA37_0<=74)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2000:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2000:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2001:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterQualifier_in_ruleParameter4242);
            	    lv_ParameterQualifier_1_0=ruleParameterQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ParameterQualifier",
            	              		lv_ParameterQualifier_1_0, 
            	              		"ParameterQualifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2017:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2018:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2018:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2019:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4264);
            lv_qualifiedTypeSpec_2_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"qualifiedTypeSpec",
                      		lv_qualifiedTypeSpec_2_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2035:2: ( (lv_dec_3_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2036:1: (lv_dec_3_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2036:1: (lv_dec_3_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2037:3: lv_dec_3_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleParameter4285);
            lv_dec_3_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_3_0, 
                      		"Declarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleIncludeDirective"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2061:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2062:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2063:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeDirectiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4321);
            iv_ruleIncludeDirective=ruleIncludeDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludeDirective4331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeDirective"


    // $ANTLR start "ruleIncludeDirective"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2070:1: ruleIncludeDirective returns [EObject current=null] : (otherlv_0= '#include' ( ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* ) | ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedURI_1_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token lv_includeID_4_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2073:28: ( (otherlv_0= '#include' ( ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* ) | ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2074:1: (otherlv_0= '#include' ( ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* ) | ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2074:1: (otherlv_0= '#include' ( ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* ) | ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2074:3: otherlv_0= '#include' ( ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* ) | ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIncludeDirective4368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2078:1: ( ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* ) | ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_INCLUDE_LIB) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2078:2: ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2078:2: ( ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )* )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2078:3: ( (lv_importedURI_1_0= RULE_STRING ) ) (otherlv_2= '/' this_STRING_3= RULE_STRING )*
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2078:3: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2079:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2079:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2080:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective4387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_importedURI_1_0, grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIncludeDirectiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"importedURI",
                              		lv_importedURI_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2096:2: (otherlv_2= '/' this_STRING_3= RULE_STRING )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==42) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2096:4: otherlv_2= '/' this_STRING_3= RULE_STRING
                    	    {
                    	    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleIncludeDirective4405); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getIncludeDirectiveAccess().getSolidusKeyword_1_0_1_0());
                    	          
                    	    }
                    	    this_STRING_3=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective4416); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_STRING_3, grammarAccess.getIncludeDirectiveAccess().getSTRINGTerminalRuleCall_1_0_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2105:6: ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2105:6: ( (lv_includeID_4_0= RULE_INCLUDE_LIB ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2106:1: (lv_includeID_4_0= RULE_INCLUDE_LIB )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2106:1: (lv_includeID_4_0= RULE_INCLUDE_LIB )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2107:3: lv_includeID_4_0= RULE_INCLUDE_LIB
                    {
                    lv_includeID_4_0=(Token)match(input,RULE_INCLUDE_LIB,FollowSets000.FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective4441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_includeID_4_0, grammarAccess.getIncludeDirectiveAccess().getIncludeIDINCLUDE_LIBTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIncludeDirectiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"includeID",
                              		lv_includeID_4_0, 
                              		"INCLUDE_LIB");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeDirective"


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2131:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2132:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2133:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4483);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList4493); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationsList"


    // $ANTLR start "ruleAnnotationsList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2140:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2143:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2144:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2144:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2144:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2144:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2145:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2145:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2146:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4539);
            lv_annotations_0_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
              	        }
                     		add(
                     			current, 
                     			"annotations",
                      		lv_annotations_0_0, 
                      		"Annotation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2162:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==43) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2163:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2163:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2164:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4560);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationsList"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2188:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2189:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2190:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4597);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2197:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotationParametersList_3_0 = null;

        EObject lv_annotationParametersList_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2200:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2201:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2201:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2201:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAnnotation4644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2205:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2206:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2206:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2207:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotation4665);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2223:2: (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2223:4: otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnnotation4678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2227:1: ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2228:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2228:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2229:3: lv_annotationParametersList_3_0= ruleAnnotationValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4699);
                    lv_annotationParametersList_3_0=ruleAnnotationValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotationParametersList",
                              		lv_annotationParametersList_3_0, 
                              		"AnnotationValuePair");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2245:2: (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==28) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2245:4: otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation4712); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2249:1: ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2250:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2250:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2251:3: lv_annotationParametersList_5_0= ruleAnnotationValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4733);
                    	    lv_annotationParametersList_5_0=ruleAnnotationValuePair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotationParametersList",
                    	              		lv_annotationParametersList_5_0, 
                    	              		"AnnotationValuePair");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAnnotation4747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationValuePair"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2279:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2280:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2281:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValuePairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4785);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePair4795); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationValuePair"


    // $ANTLR start "ruleAnnotationValuePair"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2288:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2291:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2292:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2292:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2292:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2292:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==29) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2292:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2292:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2293:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2293:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2294:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValuePair4838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationValuePairAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationValuePairRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationValuePair4855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2314:3: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2315:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2315:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2316:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4878);
            lv_value_2_0=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationValuePairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"AnnotationValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationValuePair"


    // $ANTLR start "entryRuleAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2340:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2341:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2342:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4914);
            iv_ruleAnnotationValue=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValue4924); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationValue"


    // $ANTLR start "ruleAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2349:1: ruleAnnotationValue returns [EObject current=null] : ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_5=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_4 = null;

        EObject lv_arrayValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2352:28: ( ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2353:1: ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2353:1: ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||(LA45_0>=RULE_BOOLEAN && LA45_0<=RULE_INT)||LA45_0==44) ) {
                alt45=1;
            }
            else if ( (LA45_0==22) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2353:2: ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2353:2: ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2354:1: ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2354:1: ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2355:1: (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2355:1: (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING )
                    int alt44=5;
                    switch ( input.LA(1) ) {
                    case RULE_ADDITIVE_OPERATION:
                    case RULE_INT:
                        {
                        alt44=1;
                        }
                        break;
                    case 44:
                        {
                        alt44=2;
                        }
                        break;
                    case RULE_BOOLEAN:
                        {
                        alt44=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt44=4;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt44=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2356:3: lv_value_0_1= rulesignedINT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotationValueAccess().getValueSignedINTParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleAnnotationValue4972);
                            lv_value_0_1=rulesignedINT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_0_1, 
                                      		"signedINT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2371:8: lv_value_0_2= 'null'
                            {
                            lv_value_0_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAnnotationValue4988); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_0_2, grammarAccess.getAnnotationValueAccess().getValueNullKeyword_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_0_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2383:8: lv_value_0_3= RULE_BOOLEAN
                            {
                            lv_value_0_3=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5016); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_0_3, grammarAccess.getAnnotationValueAccess().getValueBOOLEANTerminalRuleCall_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_0_3, 
                                      		"BOOLEAN");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2398:8: lv_value_0_4= ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotationValueAccess().getValueQualifiedNameParserRuleCall_0_0_3()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotationValue5040);
                            lv_value_0_4=ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_0_4, 
                                      		"QualifiedName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2413:8: lv_value_0_5= RULE_STRING
                            {
                            lv_value_0_5=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnnotationValue5055); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_0_5, grammarAccess.getAnnotationValueAccess().getValueSTRINGTerminalRuleCall_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_0_5, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2432:6: ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2432:6: ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2433:1: (lv_arrayValue_1_0= ruleArrayAnnotationValue )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2433:1: (lv_arrayValue_1_0= ruleArrayAnnotationValue )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2434:3: lv_arrayValue_1_0= ruleArrayAnnotationValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationValueAccess().getArrayValueArrayAnnotationValueParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5090);
                    lv_arrayValue_1_0=ruleArrayAnnotationValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationValueRule());
                      	        }
                             		set(
                             			current, 
                             			"arrayValue",
                              		lv_arrayValue_1_0, 
                              		"ArrayAnnotationValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationValue"


    // $ANTLR start "entryRuleArrayAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2458:1: entryRuleArrayAnnotationValue returns [EObject current=null] : iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF ;
    public final EObject entryRuleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2459:2: (iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2460:2: iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayAnnotationValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5126);
            iv_ruleArrayAnnotationValue=ruleArrayAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayAnnotationValue5136); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayAnnotationValue"


    // $ANTLR start "ruleArrayAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2467:1: ruleArrayAnnotationValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2470:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2471:1: (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2471:1: (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2471:3: otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleArrayAnnotationValue5173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayAnnotationValueAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2475:1: ( (lv_values_1_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2476:1: (lv_values_1_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2476:1: (lv_values_1_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2477:3: lv_values_1_0= ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5194);
            lv_values_1_0=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayAnnotationValueRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"AnnotationValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2493:2: (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==28) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2493:4: otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleArrayAnnotationValue5207); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayAnnotationValueAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2497:1: ( (lv_values_3_0= ruleAnnotationValue ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2498:1: (lv_values_3_0= ruleAnnotationValue )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2498:1: (lv_values_3_0= ruleAnnotationValue )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2499:3: lv_values_3_0= ruleAnnotationValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5228);
            	    lv_values_3_0=ruleAnnotationValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayAnnotationValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"AnnotationValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleArrayAnnotationValue5242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayAnnotationValueAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayAnnotationValue"


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2527:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2528:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2529:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT5279);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT5290); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignedINT"


    // $ANTLR start "rulesignedINT"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2536:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITIVE_OPERATION_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2539:28: ( ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2540:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2540:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2540:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2540:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ADDITIVE_OPERATION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2540:7: this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION
                    {
                    this_ADDITIVE_OPERATION_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT5331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ADDITIVE_OPERATION_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ADDITIVE_OPERATION_0, grammarAccess.getSignedINTAccess().getADDITIVE_OPERATIONTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT5353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignedINT"


    // $ANTLR start "entryRuleConstantExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2562:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2563:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2564:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5398);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantExpression5408); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2571:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2574:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2576:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5457);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2595:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2596:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2597:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5491);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression5501); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2604:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2607:28: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2608:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2608:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2608:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2608:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2609:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2609:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2610:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5547);
            lv_leftExpr_0_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"LogicalAndExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2626:2: (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2626:4: otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLogicalOrExpression5560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2630:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2631:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2631:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2632:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5581);
                    lv_rightExpr_2_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2656:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2657:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2658:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5619);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression5629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2665:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2668:28: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2669:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2669:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2669:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2669:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2670:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2670:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2671:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5675);
            lv_leftExpr_0_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"OrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2687:2: (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2687:4: otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleLogicalAndExpression5688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2691:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2693:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5709);
                    lv_rightExpr_2_0=ruleLogicalAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"LogicalAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2717:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2718:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2719:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression5747);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression5757); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2726:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2729:28: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2730:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2730:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2730:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2730:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2731:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2731:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2732:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleOrExpression5803);
            lv_leftExpr_0_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"XorExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2748:2: (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2748:4: otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOrExpression5816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2752:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2753:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2753:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2754:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleOrExpression5837);
                    lv_rightExpr_2_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"OrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2778:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2779:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2780:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_entryRuleXorExpression5875);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXorExpression5885); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2787:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2790:28: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2791:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2791:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2791:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2791:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2792:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2792:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2793:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleXorExpression5931);
            lv_leftExpr_0_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"AndExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2809:2: (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2809:4: otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleXorExpression5944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2813:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2814:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2814:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2815:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleXorExpression5965);
                    lv_rightExpr_2_0=ruleXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXorExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"XorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2839:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2840:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2841:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression6003);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression6013); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2848:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2851:28: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2852:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2852:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2852:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2852:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2853:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2853:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2854:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleAndExpression6059);
            lv_leftExpr_0_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"ShiftExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2870:2: (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2870:4: otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAndExpression6072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2874:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2875:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2875:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2876:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleAndExpression6093);
                    lv_rightExpr_2_0=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"AndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2900:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2901:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2902:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6131);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShiftExpression6141); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2909:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2912:28: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2914:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2914:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2915:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6187);
            lv_leftExpr_0_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"AdditiveExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2931:2: ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_SHIFT_OPERATION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2931:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2931:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2932:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2932:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2933:3: lv_op_1_0= RULE_SHIFT_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_SHIFT_OPERATION,FollowSets000.FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression6205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getShiftExpressionAccess().getOpSHIFT_OPERATIONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getShiftExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"SHIFT_OPERATION");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2949:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2950:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2950:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2951:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleShiftExpression6231);
                    lv_rightExpr_2_0=ruleShiftExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"ShiftExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2975:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2976:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2977:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6269);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression6279); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2984:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2987:28: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2989:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2989:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2990:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6325);
            lv_leftExpr_0_0=ruleMulExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"MulExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3006:2: ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ADDITIVE_OPERATION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3006:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3006:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3007:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3007:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3008:3: lv_op_1_0= RULE_ADDITIVE_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression6343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getAdditiveExpressionAccess().getOpADDITIVE_OPERATIONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"ADDITIVE_OPERATION");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3024:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3025:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3025:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3026:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6369);
                    lv_rightExpr_2_0=ruleAdditiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"AdditiveExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMulExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3050:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3051:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3052:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_entryRuleMulExpression6407);
            iv_ruleMulExpression=ruleMulExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMulExpression6417); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulExpression"


    // $ANTLR start "ruleMulExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3059:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3062:28: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3064:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3064:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3065:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleMulExpression6463);
            lv_leftExpr_0_0=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMulExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"CastExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3081:2: ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_MUL_OPERATION) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3081:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3081:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3082:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3082:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3083:3: lv_op_1_0= RULE_MUL_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_MUL_OPERATION,FollowSets000.FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression6481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getMulExpressionAccess().getOpMUL_OPERATIONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMulExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"MUL_OPERATION");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3099:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3100:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3100:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3101:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleMulExpression6507);
                    lv_rightExpr_2_0=ruleMulExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMulExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"MulExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulExpression"


    // $ANTLR start "entryRuleCastExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3125:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3126:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3127:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_entryRuleCastExpression6545);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCastExpression6555); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastExpression"


    // $ANTLR start "ruleCastExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3134:1: ruleCastExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3137:28: ( ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                switch ( input.LA(2) ) {
                case 24:
                case 25:
                case 27:
                case 39:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                    {
                    alt56=1;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ADDITIVE_OPERATION:
                    case RULE_SHIFT_OPERATION:
                    case RULE_MUL_OPERATION:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        {
                        alt56=2;
                        }
                        break;
                    case 31:
                        {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_UNARY_OPERATION:
                        case 30:
                        case 35:
                            {
                            alt56=1;
                            }
                            break;
                        case RULE_ADDITIVE_OPERATION:
                            {
                            int LA56_6 = input.LA(5);

                            if ( (LA56_6==RULE_INT) ) {
                                int LA56_7 = input.LA(6);

                                if ( (synpred64_InternalFractalIdt()) ) {
                                    alt56=1;
                                }
                                else if ( (true) ) {
                                    alt56=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 56, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA56_6>=RULE_ID && LA56_6<=RULE_STRING)||LA56_6==RULE_ADDITIVE_OPERATION||LA56_6==RULE_UNARY_OPERATION||LA56_6==30||LA56_6==35) ) {
                                alt56=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_SHIFT_OPERATION:
                        case RULE_MUL_OPERATION:
                        case 19:
                        case 20:
                        case 21:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 31:
                        case 34:
                        case 36:
                        case 41:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            {
                            alt56=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 35:
                        {
                        alt56=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STRING:
                case RULE_ADDITIVE_OPERATION:
                case RULE_INT:
                case RULE_UNARY_OPERATION:
                case 30:
                case 35:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||(LA56_0>=RULE_ADDITIVE_OPERATION && LA56_0<=RULE_INT)||LA56_0==RULE_UNARY_OPERATION||LA56_0==35) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCastExpression6593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3142:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3143:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3143:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3144:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6614);
                    lv_type_1_0=ruleQualifiedTypeSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"QualifiedTypeSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCastExpression6626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3164:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3165:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3165:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3166:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleCastExpression6647);
                    lv_expr_3_0=ruleCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_3_0, 
                              		"CastExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3183:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3183:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3184:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3184:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3185:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleCastExpression6675);
                    lv_unaryExpr_4_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"unaryExpr",
                              		lv_unaryExpr_4_0, 
                              		"UnaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3209:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3210:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3211:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6711);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression6721); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3218:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unaryExpr_0_0=null;
        EObject lv_primaryExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3221:28: ( ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3222:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3222:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3222:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3222:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_UNARY_OPERATION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3223:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3223:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3224:3: lv_unaryExpr_0_0= RULE_UNARY_OPERATION
                    {
                    lv_unaryExpr_0_0=(Token)match(input,RULE_UNARY_OPERATION,FollowSets000.FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_unaryExpr_0_0, grammarAccess.getUnaryExpressionAccess().getUnaryExprUNARY_OPERATIONTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"unaryExpr",
                              		lv_unaryExpr_0_0, 
                              		"UNARY_OPERATION");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3240:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3241:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3241:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3242:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6790);
            lv_primaryExpr_1_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"primaryExpr",
                      		lv_primaryExpr_1_0, 
                      		"PrimaryExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3266:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3267:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3268:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6826);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression6836); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3275:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3278:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3279:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3279:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||(LA58_0>=RULE_ADDITIVE_OPERATION && LA58_0<=RULE_INT)||LA58_0==35) ) {
                alt58=1;
            }
            else if ( (LA58_0==30) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3279:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3279:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3280:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3280:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3281:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression6882);
                    lv_literal_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_0_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3298:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3298:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3298:8: otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaryExpression6901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6926);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrimaryExpression6937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3326:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3327:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3328:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral6975);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral6986); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3335:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_FloatingPointLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3338:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3339:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3339:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt59=1;
                }
                break;
            case RULE_STRING:
                {
                alt59=2;
                }
                break;
            case RULE_ADDITIVE_OPERATION:
            case RULE_INT:
            case 35:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3339:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral7026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3347:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral7052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3356:5: this_FloatingPointLiteral_2= ruleFloatingPointLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7085);
                    this_FloatingPointLiteral_2=ruleFloatingPointLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FloatingPointLiteral_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleFloatingPointLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3374:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3375:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3376:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7131);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatingPointLiteral7142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatingPointLiteral"


    // $ANTLR start "ruleFloatingPointLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3383:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FDSYMBOL_4=null;
        Token this_FDSYMBOL_8=null;
        Token this_FDSYMBOL_11=null;
        Token this_FDSYMBOL_14=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;

        AntlrDatatypeRuleToken this_signedINT_6 = null;

        AntlrDatatypeRuleToken this_Exponent_7 = null;

        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;

        AntlrDatatypeRuleToken this_signedINT_12 = null;

        AntlrDatatypeRuleToken this_Exponent_13 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3386:28: ( ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            int alt72=4;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:3: (this_signedINT_0= rulesignedINT )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_ADDITIVE_OPERATION && LA60_0<=RULE_INT)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3388:5: this_signedINT_0= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7191);
                    	    this_signedINT_0=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_0);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFloatingPointLiteral7211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1()); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3404:1: (this_signedINT_2= rulesignedINT )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_INT) ) {
                            int LA61_2 = input.LA(2);

                            if ( (synpred70_InternalFractalIdt()) ) {
                                alt61=1;
                            }


                        }
                        else if ( (LA61_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA61_3 = input.LA(2);

                            if ( (LA61_3==RULE_INT) ) {
                                int LA61_5 = input.LA(3);

                                if ( (synpred70_InternalFractalIdt()) ) {
                                    alt61=1;
                                }


                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3405:5: this_signedINT_2= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7234);
                    	    this_signedINT_2=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3415:3: (this_Exponent_3= ruleExponent )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_INT||(LA62_0>=50 && LA62_0<=51)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3416:5: this_Exponent_3= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_0_3()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7264);
                            this_Exponent_3=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Exponent_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_FDSYMBOL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7287); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_4, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_0_4()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3434:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3434:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3435:2: kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFloatingPointLiteral7315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3440:1: (this_signedINT_6= rulesignedINT )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_INT) ) {
                            int LA64_2 = input.LA(2);

                            if ( (synpred74_InternalFractalIdt()) ) {
                                alt64=1;
                            }


                        }
                        else if ( (LA64_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA64_3 = input.LA(2);

                            if ( (LA64_3==RULE_INT) ) {
                                int LA64_5 = input.LA(3);

                                if ( (synpred74_InternalFractalIdt()) ) {
                                    alt64=1;
                                }


                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3441:5: this_signedINT_6= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7338);
                    	    this_signedINT_6=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_6);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3451:3: (this_Exponent_7= ruleExponent )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_INT||(LA65_0>=50 && LA65_0<=51)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3452:5: this_Exponent_7= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_1_2()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7368);
                            this_Exponent_7=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Exponent_7);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3462:3: (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_FDSYMBOL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3462:8: this_FDSYMBOL_8= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_8=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7391); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_8);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_8, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_1_3()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:7: (this_signedINT_9= rulesignedINT )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_INT) ) {
                            int LA67_2 = input.LA(2);

                            if ( (synpred78_InternalFractalIdt()) ) {
                                alt67=1;
                            }


                        }
                        else if ( (LA67_0==RULE_ADDITIVE_OPERATION) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3471:5: this_signedINT_9= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7429);
                    	    this_signedINT_9=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_9);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7458);
                    this_Exponent_10=ruleExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3492:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_FDSYMBOL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3492:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7479); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_11);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_11, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_2_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3500:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3500:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3500:7: (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3500:7: (this_signedINT_12= rulesignedINT )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_INT) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred81_InternalFractalIdt()) ) {
                                alt69=1;
                            }


                        }
                        else if ( (LA69_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA69_3 = input.LA(2);

                            if ( (synpred81_InternalFractalIdt()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3501:5: this_signedINT_12= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7517);
                    	    this_signedINT_12=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_12);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3511:3: (this_Exponent_13= ruleExponent )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_INT||(LA70_0>=50 && LA70_0<=51)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3512:5: this_Exponent_13= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_3_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7547);
                            this_Exponent_13=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Exponent_13);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3522:3: (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_FDSYMBOL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3522:8: this_FDSYMBOL_14= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_14=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7570); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_14);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_14, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_3_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatingPointLiteral"


    // $ANTLR start "entryRuleExponent"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3537:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3538:2: (iv_ruleExponent= ruleExponent EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3539:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_entryRuleExponent7619);
            iv_ruleExponent=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExponent7630); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3546:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ADDITIVE_OPERATION_2=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3549:28: ( ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )?
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==50) ) {
                alt73=1;
            }
            else if ( (LA73_0==51) ) {
                alt73=2;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3551:2: kw= 'e'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleExponent7669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3557:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3557:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3558:2: kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleExponent7689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1_0()); 
                          
                    }
                    this_ADDITIVE_OPERATION_2=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ADDITIVE_OPERATION_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ADDITIVE_OPERATION_2, grammarAccess.getExponentAccess().getADDITIVE_OPERATIONTerminalRuleCall_0_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3570:4: (this_INT_3= RULE_INT )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_INT) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3570:9: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExponent7728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getExponentAccess().getINTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponent"


    // $ANTLR start "ruleTypeQualifier"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3585:1: ruleTypeQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3587:28: ( ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3588:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3588:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==52) ) {
                alt75=1;
            }
            else if ( (LA75_0==53) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3588:2: (enumLiteral_0= 'const' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3588:2: (enumLiteral_0= 'const' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3588:4: enumLiteral_0= 'const'
                    {
                    enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeQualifier7789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3594:6: (enumLiteral_1= 'volatile' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3594:6: (enumLiteral_1= 'volatile' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3594:8: enumLiteral_1= 'volatile'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeQualifier7806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeQualifier"


    // $ANTLR start "ruleTypeSpecifier"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3604:1: ruleTypeSpecifier returns [Enumerator current=null] : ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3606:28: ( ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3607:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3607:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            int alt76=20;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt76=1;
                }
                break;
            case 54:
                {
                alt76=2;
                }
                break;
            case 55:
                {
                alt76=3;
                }
                break;
            case 56:
                {
                alt76=4;
                }
                break;
            case 57:
                {
                alt76=5;
                }
                break;
            case 58:
                {
                alt76=6;
                }
                break;
            case 59:
                {
                alt76=7;
                }
                break;
            case 60:
                {
                alt76=8;
                }
                break;
            case 61:
                {
                alt76=9;
                }
                break;
            case 62:
                {
                alt76=10;
                }
                break;
            case 63:
                {
                alt76=11;
                }
                break;
            case 64:
                {
                alt76=12;
                }
                break;
            case 65:
                {
                alt76=13;
                }
                break;
            case 66:
                {
                alt76=14;
                }
                break;
            case 67:
                {
                alt76=15;
                }
                break;
            case 68:
                {
                alt76=16;
                }
                break;
            case 69:
                {
                alt76=17;
                }
                break;
            case 70:
                {
                alt76=18;
                }
                break;
            case 71:
                {
                alt76=19;
                }
                break;
            case 72:
                {
                alt76=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3607:2: (enumLiteral_0= 'void' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3607:2: (enumLiteral_0= 'void' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3607:4: enumLiteral_0= 'void'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTypeSpecifier7851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3613:6: (enumLiteral_1= 'char' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3613:6: (enumLiteral_1= 'char' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3613:8: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypeSpecifier7868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3619:6: (enumLiteral_2= 'short' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3619:6: (enumLiteral_2= 'short' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3619:8: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTypeSpecifier7885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3625:6: (enumLiteral_3= 'int' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3625:6: (enumLiteral_3= 'int' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3625:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTypeSpecifier7902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3631:6: (enumLiteral_4= 'long' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3631:6: (enumLiteral_4= 'long' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3631:8: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTypeSpecifier7919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3637:6: (enumLiteral_5= 'float' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3637:6: (enumLiteral_5= 'float' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3637:8: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeSpecifier7936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3643:6: (enumLiteral_6= 'double' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3643:6: (enumLiteral_6= 'double' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3643:8: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTypeSpecifier7953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3649:6: (enumLiteral_7= 'signed' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3649:6: (enumLiteral_7= 'signed' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3649:8: enumLiteral_7= 'signed'
                    {
                    enumLiteral_7=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeSpecifier7970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3655:6: (enumLiteral_8= 'unsigned' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3655:6: (enumLiteral_8= 'unsigned' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3655:8: enumLiteral_8= 'unsigned'
                    {
                    enumLiteral_8=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeSpecifier7987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3661:6: (enumLiteral_9= 'string' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3661:6: (enumLiteral_9= 'string' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3661:8: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeSpecifier8004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3667:6: (enumLiteral_10= 'int8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3667:6: (enumLiteral_10= 'int8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3667:8: enumLiteral_10= 'int8_t'
                    {
                    enumLiteral_10=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeSpecifier8021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3673:6: (enumLiteral_11= 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3673:6: (enumLiteral_11= 'uint8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3673:8: enumLiteral_11= 'uint8_t'
                    {
                    enumLiteral_11=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeSpecifier8038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3679:6: (enumLiteral_12= 'int16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3679:6: (enumLiteral_12= 'int16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3679:8: enumLiteral_12= 'int16_t'
                    {
                    enumLiteral_12=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTypeSpecifier8055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:6: (enumLiteral_13= 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:6: (enumLiteral_13= 'uint16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:8: enumLiteral_13= 'uint16_t'
                    {
                    enumLiteral_13=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTypeSpecifier8072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3691:6: (enumLiteral_14= 'int32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3691:6: (enumLiteral_14= 'int32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3691:8: enumLiteral_14= 'int32_t'
                    {
                    enumLiteral_14=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTypeSpecifier8089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3697:6: (enumLiteral_15= 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3697:6: (enumLiteral_15= 'uint32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3697:8: enumLiteral_15= 'uint32_t'
                    {
                    enumLiteral_15=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTypeSpecifier8106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3703:6: (enumLiteral_16= 'int64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3703:6: (enumLiteral_16= 'int64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3703:8: enumLiteral_16= 'int64_t'
                    {
                    enumLiteral_16=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTypeSpecifier8123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3709:6: (enumLiteral_17= 'uint64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3709:6: (enumLiteral_17= 'uint64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3709:8: enumLiteral_17= 'uint64_t'
                    {
                    enumLiteral_17=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTypeSpecifier8140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3715:6: (enumLiteral_18= 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3715:6: (enumLiteral_18= 'intptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3715:8: enumLiteral_18= 'intptr_t'
                    {
                    enumLiteral_18=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTypeSpecifier8157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3721:6: (enumLiteral_19= 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3721:6: (enumLiteral_19= 'uintptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3721:8: enumLiteral_19= 'uintptr_t'
                    {
                    enumLiteral_19=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleTypeSpecifier8174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "ruleParameterQualifier"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3731:1: ruleParameterQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3733:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==73) ) {
                alt77=1;
            }
            else if ( (LA77_0==74) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:2: (enumLiteral_0= 'in' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleParameterQualifier8219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3740:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3740:6: (enumLiteral_1= 'out' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3740:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleParameterQualifier8236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterQualifier"

    // $ANTLR start synpred38_InternalFractalIdt
    public final void synpred38_InternalFractalIdt_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:3: ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1848:5: otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred38_InternalFractalIdt3879); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1852:1: (otherlv_5= 'void' )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==39) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1852:3: otherlv_5= 'void'
                {
                otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_synpred38_InternalFractalIdt3892); if (state.failed) return ;

                }
                break;

        }

        otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred38_InternalFractalIdt3906); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalFractalIdt

    // $ANTLR start synpred64_InternalFractalIdt
    public final void synpred64_InternalFractalIdt_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:2: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
        {
        otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred64_InternalFractalIdt6593); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3142:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3143:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3143:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3144:3: lv_type_1_0= ruleQualifiedTypeSpecification
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_synpred64_InternalFractalIdt6614);
        lv_type_1_0=ruleQualifiedTypeSpecification();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred64_InternalFractalIdt6626); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3164:1: ( (lv_expr_3_0= ruleCastExpression ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3165:1: (lv_expr_3_0= ruleCastExpression )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3165:1: (lv_expr_3_0= ruleCastExpression )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3166:3: lv_expr_3_0= ruleCastExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_synpred64_InternalFractalIdt6647);
        lv_expr_3_0=ruleCastExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred64_InternalFractalIdt

    // $ANTLR start synpred70_InternalFractalIdt
    public final void synpred70_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_2 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3405:5: (this_signedINT_2= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3405:5: this_signedINT_2= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt7234);
        this_signedINT_2=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalFractalIdt

    // $ANTLR start synpred73_InternalFractalIdt
    public final void synpred73_InternalFractalIdt_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_FDSYMBOL_4=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:2: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:3: (this_signedINT_0= rulesignedINT )+
        int cnt82=0;
        loop82:
        do {
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ADDITIVE_OPERATION && LA82_0<=RULE_INT)) ) {
                alt82=1;
            }


            switch (alt82) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3388:5: this_signedINT_0= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred73_InternalFractalIdt7191);
        	    this_signedINT_0=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt82 >= 1 ) break loop82;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(82, input);
                    throw eee;
            }
            cnt82++;
        } while (true);

        kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_synpred73_InternalFractalIdt7211); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3404:1: (this_signedINT_2= rulesignedINT )*
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_INT) ) {
                int LA83_2 = input.LA(2);

                if ( (synpred70_InternalFractalIdt()) ) {
                    alt83=1;
                }


            }
            else if ( (LA83_0==RULE_ADDITIVE_OPERATION) ) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3405:5: this_signedINT_2= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred73_InternalFractalIdt7234);
        	    this_signedINT_2=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop83;
            }
        } while (true);

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3415:3: (this_Exponent_3= ruleExponent )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_INT||(LA84_0>=50 && LA84_0<=51)) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3416:5: this_Exponent_3= ruleExponent
                {
                pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred73_InternalFractalIdt7264);
                this_Exponent_3=ruleExponent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        int alt85=2;
        int LA85_0 = input.LA(1);

        if ( (LA85_0==RULE_FDSYMBOL) ) {
            alt85=1;
        }
        switch (alt85) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                {
                this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred73_InternalFractalIdt7287); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred73_InternalFractalIdt

    // $ANTLR start synpred74_InternalFractalIdt
    public final void synpred74_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_6 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3441:5: (this_signedINT_6= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3441:5: this_signedINT_6= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred74_InternalFractalIdt7338);
        this_signedINT_6=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalFractalIdt

    // $ANTLR start synpred78_InternalFractalIdt
    public final void synpred78_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_9 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3471:5: (this_signedINT_9= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3471:5: this_signedINT_9= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred78_InternalFractalIdt7429);
        this_signedINT_9=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalFractalIdt

    // $ANTLR start synpred80_InternalFractalIdt
    public final void synpred80_InternalFractalIdt_fragment() throws RecognitionException {   
        Token this_FDSYMBOL_11=null;
        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:6: ( ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3470:7: (this_signedINT_9= rulesignedINT )+
        int cnt89=0;
        loop89:
        do {
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_INT) ) {
                int LA89_2 = input.LA(2);

                if ( (synpred78_InternalFractalIdt()) ) {
                    alt89=1;
                }


            }
            else if ( (LA89_0==RULE_ADDITIVE_OPERATION) ) {
                alt89=1;
            }


            switch (alt89) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3471:5: this_signedINT_9= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred80_InternalFractalIdt7429);
        	    this_signedINT_9=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt89 >= 1 ) break loop89;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(89, input);
                    throw eee;
            }
            cnt89++;
        } while (true);

        pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred80_InternalFractalIdt7458);
        this_Exponent_10=ruleExponent();

        state._fsp--;
        if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3492:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_FDSYMBOL) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3492:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                {
                this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred80_InternalFractalIdt7479); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred80_InternalFractalIdt

    // $ANTLR start synpred81_InternalFractalIdt
    public final void synpred81_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_12 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3501:5: (this_signedINT_12= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3501:5: this_signedINT_12= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred81_InternalFractalIdt7517);
        this_signedINT_12=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_InternalFractalIdt

    // Delegated rules

    public final boolean synpred38_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA72_eotS =
        "\15\uffff";
    static final String DFA72_eofS =
        "\2\uffff\1\7\12\uffff";
    static final String DFA72_minS =
        "\1\10\1\11\1\10\1\uffff\1\11\2\10\1\uffff\1\0\1\uffff\1\0\1\11"+
        "\1\uffff";
    static final String DFA72_maxS =
        "\1\43\1\11\1\63\1\uffff\1\11\1\10\1\43\1\uffff\1\0\1\uffff\1\0"+
        "\1\11\1\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\1\2\3\uffff\1\4\1\uffff\1\1\2\uffff\1\3";
    static final String DFA72_specialS =
        "\6\uffff\1\1\1\uffff\1\0\1\uffff\1\2\2\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\2\31\uffff\1\3",
            "\1\2",
            "\1\10\1\6\2\7\1\uffff\1\7\5\uffff\3\7\1\uffff\3\7\1\uffff"+
            "\2\7\2\uffff\1\7\2\uffff\1\7\1\11\1\7\4\uffff\1\7\3\uffff\5"+
            "\7\1\4\1\5",
            "",
            "\1\12",
            "\1\13",
            "\2\11\31\uffff\1\11",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\12",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "3387:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_8 = input.LA(1);

                         
                        int index72_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalFractalIdt()) ) {s = 9;}

                        else if ( (synpred80_InternalFractalIdt()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index72_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_6 = input.LA(1);

                         
                        int index72_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA72_6>=RULE_ADDITIVE_OPERATION && LA72_6<=RULE_INT)||LA72_6==35) ) {s = 9;}

                        else if ( (synpred80_InternalFractalIdt()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index72_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_10 = input.LA(1);

                         
                        int index72_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalFractalIdt()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index72_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile158 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile179 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile202 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile229 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleConstantDefinitionBegin335 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleConstantDefinitionEnd442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition544 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition574 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition604 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTypeDefinition616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTypedefSpecification699 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification720 = new BitSet(new long[]{0x0000000340000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification833 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeSpecification947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification1008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1035 = new BitSet(new long[]{0xFFF000900B200012L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1056 = new BitSet(new long[]{0xFFF000900B200012L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1275 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1292 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStructOrUnionDefinition1310 = new BitSet(new long[]{0xFFF008900BA00010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1331 = new BitSet(new long[]{0xFFF008900BA00010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_23_in_ruleStructOrUnionDefinition1344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1436 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleStructOrUnion1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleStructOrUnion1563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleStructMember1659 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1681 = new BitSet(new long[]{0x0000000340000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1702 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleStructMember1715 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1736 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStructMember1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumDefinition1958 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1975 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEnumDefinition1993 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2014 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumDefinition2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference2062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumReference2109 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2223 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEnumMemberList2236 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2257 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2347 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumMember2365 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2480 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleDeclarators2493 = new BitSet(new long[]{0x0000000340000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2514 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPointerSpecification_in_ruleDeclarator2608 = new BitSet(new long[]{0x0000000340000010L});
        public static final BitSet FOLLOW_ruleDirectNamedDeclarator_in_ruleDeclarator2631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirectAnonymousDeclarator_in_ruleDeclarator2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDeclarator2677 = new BitSet(new long[]{0x0000000340000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarator2698 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDeclarator2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPointerSpecification_in_entryRuleQualifiedPointerSpecification2748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedPointerSpecification2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleQualifiedPointerSpecification2807 = new BitSet(new long[]{0x0030000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedPointerSpecification2828 = new BitSet(new long[]{0x0030000000000002L});
        public static final BitSet FOLLOW_ruleDirectNamedDeclarator_in_entryRuleDirectNamedDeclarator2865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectNamedDeclarator2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDirectNamedDeclarator2917 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectNamedDeclarator2943 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleDirectAnonymousDeclarator_in_entryRuleDirectAnonymousDeclarator2980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectAnonymousDeclarator2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectAnonymousDeclarator3048 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArraySpecification3139 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleArraySpecification3164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArraySpecification3184 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification3205 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleArraySpecification3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3306 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleQualifiedName3325 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3340 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleConstantDefinition3434 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3451 = new BitSet(new long[]{0x0000000840001332L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3514 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3570 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleInterfaceDefinition3583 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_38_in_ruleInterfaceDefinition3596 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3619 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceDefinition3632 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3659 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInterfaceDefinition3673 = new BitSet(new long[]{0xFFF008900BA00010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3694 = new BitSet(new long[]{0xFFF008900BA00010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_23_in_ruleInterfaceDefinition3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3743 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3799 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3821 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_ruleQualifiedPointerSpecification_in_ruleMethodDefinition3842 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3860 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMethodDefinition3879 = new BitSet(new long[]{0x0000008080000000L});
        public static final BitSet FOLLOW_39_in_ruleMethodDefinition3892 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMethodDefinition3906 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_30_in_ruleMethodDefinition3926 = new BitSet(new long[]{0xFFF008900B200010L,0x00000000000007FFL});
        public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3947 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMethodDefinition3959 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMethodDefinition3973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList4009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterList4019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4065 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList4078 = new BitSet(new long[]{0xFFF008900B200010L,0x00000000000007FFL});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4099 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList4114 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleParameterList4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleParameter4220 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000007FFL});
        public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter4242 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000007FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4264 = new BitSet(new long[]{0x0000000340000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter4285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective4331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleIncludeDirective4368 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4387 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleIncludeDirective4405 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4416 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4539 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4560 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAnnotation4644 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation4665 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleAnnotation4678 = new BitSet(new long[]{0x00001000004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4699 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation4712 = new BitSet(new long[]{0x00001000004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4733 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_31_in_ruleAnnotation4747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair4795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair4838 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationValuePair4855 = new BitSet(new long[]{0x00001000004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue4924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleAnnotationValue4988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationValue5040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotationValue5055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayAnnotationValue5136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleArrayAnnotationValue5173 = new BitSet(new long[]{0x00001000004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5194 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_28_in_ruleArrayAnnotationValue5207 = new BitSet(new long[]{0x00001000004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5228 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_23_in_ruleArrayAnnotationValue5242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT5279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT5290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT5331 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT5353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression5408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5547 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleLogicalOrExpression5560 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5675 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleLogicalAndExpression5688 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression5803 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleOrExpression5816 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression5837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression5875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression5885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression5931 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleXorExpression5944 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression5965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression6003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression6059 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAndExpression6072 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression6141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6187 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression6205 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression6231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6269 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6325 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression6343 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression6407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression6417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression6463 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression6481 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression6507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression6545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression6555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCastExpression6593 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6614 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCastExpression6626 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression6647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6763 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulePrimaryExpression6901 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6926 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulePrimaryExpression6937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral7052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral7142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7191 = new BitSet(new long[]{0x0000000800000300L});
        public static final BitSet FOLLOW_35_in_ruleFloatingPointLiteral7211 = new BitSet(new long[]{0x000C000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7234 = new BitSet(new long[]{0x000C000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7264 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFloatingPointLiteral7315 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7338 = new BitSet(new long[]{0x000C000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7368 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7429 = new BitSet(new long[]{0x000C000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7458 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7517 = new BitSet(new long[]{0x000C000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7547 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExponent_in_entryRuleExponent7619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExponent7630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleExponent7669 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_51_in_ruleExponent7689 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7704 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExponent7728 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_52_in_ruleTypeQualifier7789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeQualifier7806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleTypeSpecifier7851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypeSpecifier7868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTypeSpecifier7885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypeSpecifier7902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTypeSpecifier7919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTypeSpecifier7936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTypeSpecifier7953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeSpecifier7970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeSpecifier7987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeSpecifier8004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeSpecifier8021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTypeSpecifier8038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTypeSpecifier8055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTypeSpecifier8072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTypeSpecifier8089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTypeSpecifier8106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTypeSpecifier8123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTypeSpecifier8140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTypeSpecifier8157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleTypeSpecifier8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleParameterQualifier8219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleParameterQualifier8236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred38_InternalFractalIdt3879 = new BitSet(new long[]{0x0000008080000000L});
        public static final BitSet FOLLOW_39_in_synpred38_InternalFractalIdt3892 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_synpred38_InternalFractalIdt3906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_synpred64_InternalFractalIdt6593 = new BitSet(new long[]{0xFFF000900B200010L,0x00000000000001FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred64_InternalFractalIdt6614 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_synpred64_InternalFractalIdt6626 = new BitSet(new long[]{0x0000000840001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_synpred64_InternalFractalIdt6647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt7234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred73_InternalFractalIdt7191 = new BitSet(new long[]{0x0000000800000300L});
        public static final BitSet FOLLOW_35_in_synpred73_InternalFractalIdt7211 = new BitSet(new long[]{0x000C000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred73_InternalFractalIdt7234 = new BitSet(new long[]{0x000C000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred73_InternalFractalIdt7264 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred73_InternalFractalIdt7287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred74_InternalFractalIdt7338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred78_InternalFractalIdt7429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred80_InternalFractalIdt7429 = new BitSet(new long[]{0x000C000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred80_InternalFractalIdt7458 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred80_InternalFractalIdt7479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred81_InternalFractalIdt7517 = new BitSet(new long[]{0x0000000000000002L});
    }


}