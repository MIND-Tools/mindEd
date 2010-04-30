package org.ow2.mindEd.idt.editor.textual.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.ow2.mindEd.idt.editor.textual.services.FractalIdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalFractalIdtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDELIB", "RULE_BOOLEAN", "RULE_ADDITIVEOPERATION", "RULE_INT", "RULE_SHIFTOPERATION", "RULE_MULOPERATION", "RULE_UNARYOPERATION", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#endif'", "'#ifndef'", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'@'", "'null'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'e'", "'E'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_INCLUDELIB=6;
    public static final int RULE_FDSYMBOL=13;
    public static final int RULE_UNARYOPERATION=12;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_ADDITIVEOPERATION=8;
    public static final int RULE_SHIFTOPERATION=10;
    public static final int RULE_INT=9;
    public static final int RULE_MULOPERATION=11;
    public static final int RULE_WS=16;
    public static final int RULE_SL_COMMENT=15;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=14;

        public InternalFractalIdtParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[221+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalIdtGrammarAccess grammarAccess;
     	
        public InternalFractalIdtParser(TokenStream input, IAstFactory factory, FractalIdtGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IdtFile";	
       	}
       	
       	@Override
       	protected FractalIdtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleIdtFile
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:84:1: entryRuleIdtFile returns [EObject current=null] : iv_ruleIdtFile= ruleIdtFile EOF ;
    public final EObject entryRuleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdtFile = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:85:2: (iv_ruleIdtFile= ruleIdtFile EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:86:2: iv_ruleIdtFile= ruleIdtFile EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIdtFileRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdtFile_in_entryRuleIdtFile81);
            iv_ruleIdtFile=ruleIdtFile();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIdtFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdtFile91); if (failed) return current;

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
    // $ANTLR end entryRuleIdtFile


    // $ANTLR start ruleIdtFile
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:93:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* '#endif' ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject lv_begindef_0_0 = null;

        EObject lv_def_1_0 = null;

        EObject lv_includes_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_type_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:98:6: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* '#endif' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:99:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* '#endif' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:99:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* '#endif' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:99:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* '#endif'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:99:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:100:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:100:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:101:3: lv_begindef_0_0= ruleConstantDefinitionBegin
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137);
            lv_begindef_0_0=ruleConstantDefinitionBegin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"begindef",
              	        		lv_begindef_0_0, 
              	        		"ConstantDefinitionBegin", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:123:2: ( (lv_def_1_0= ruleConstantDefinition ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_def_1_0= ruleConstantDefinition )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_def_1_0= ruleConstantDefinition )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:125:3: lv_def_1_0= ruleConstantDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleIdtFile158);
            lv_def_1_0=ruleConstantDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"def",
              	        		lv_def_1_0, 
              	        		"ConstantDefinition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:147:2: ( (lv_includes_2_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:148:1: (lv_includes_2_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:148:1: (lv_includes_2_0= ruleIncludeDirective )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:149:3: lv_includes_2_0= ruleIncludeDirective
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_ruleIdtFile179);
            	    lv_includes_2_0=ruleIncludeDirective();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"includes",
            	      	        		lv_includes_2_0, 
            	      	        		"IncludeDirective", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:171:3: ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )*
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
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:171:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:171:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:172:1: (lv_constant_3_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:172:1: (lv_constant_3_0= ruleConstantDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:173:3: lv_constant_3_0= ruleConstantDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleIdtFile202);
            	    lv_constant_3_0=ruleConstantDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"constant",
            	      	        		lv_constant_3_0, 
            	      	        		"ConstantDefinition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:196:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:196:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:197:1: (lv_type_4_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:197:1: (lv_type_4_0= ruleTypeDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:198:3: lv_type_4_0= ruleTypeDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleIdtFile229);
            	    lv_type_4_0=ruleTypeDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"type",
            	      	        		lv_type_4_0, 
            	      	        		"TypeDefinition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleIdtFile241); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIdtFileAccess().getEndifKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleIdtFile


    // $ANTLR start entryRuleConstantDefinitionBegin
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:232:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:233:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:234:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefinitionBeginRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin277);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantDefinitionBegin; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinitionBegin287); if (failed) return current;

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
    // $ANTLR end entryRuleConstantDefinitionBegin


    // $ANTLR start ruleConstantDefinitionBegin
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:241:1: ruleConstantDefinitionBegin returns [EObject current=null] : ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:246:6: ( ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:247:1: ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:247:1: ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:247:3: '#ifndef' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantDefinitionBegin322); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:251:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:252:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:252:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:253:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin339); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstantDefinitionBeginRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConstantDefinitionBegin


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:285:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:286:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:287:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition382);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition392); if (failed) return current;

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
    // $ANTLR end entryRuleTypeDefinition


    // $ANTLR start ruleTypeDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:294:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:299:6: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:300:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:300:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:300:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:300:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("300:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:301:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition443);
                    this_TypedefSpecification_0=ruleTypedefSpecification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypedefSpecification_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:314:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition473);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StructOrUnionSpecification_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:327:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition503);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumSpecification_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleTypeDefinition513); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeDefinition


    // $ANTLR start entryRuleTypedefSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:350:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:351:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification549);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefSpecification559); if (failed) return current;

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
    // $ANTLR end entryRuleTypedefSpecification


    // $ANTLR start ruleTypedefSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:359:1: ruleTypedefSpecification returns [EObject current=null] : ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:364:6: ( ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:365:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:365:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:365:3: 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedefSpecification594); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:369:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:370:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:370:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:371:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification615);
            lv_qualifedType_1_0=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypedefSpecificationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"qualifedType",
              	        		lv_qualifedType_1_0, 
              	        		"QualifiedTypeSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:393:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:394:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:394:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:395:3: lv_dec_2_0= ruleDeclarators
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleTypedefSpecification636);
            lv_dec_2_0=ruleDeclarators();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypedefSpecificationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dec",
              	        		lv_dec_2_0, 
              	        		"Declarators", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypedefSpecification


    // $ANTLR start entryRuleQualifiedTypeSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:425:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:426:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:427:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification672);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification682); if (failed) return current;

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
    // $ANTLR end entryRuleQualifiedTypeSpecification


    // $ANTLR start ruleQualifiedTypeSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:434:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:439:6: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:440:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:440:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:440:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:440:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=51 && LA4_0<=52)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:441:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:441:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:442:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification728);
            	    lv_typeQualifier_0_0=ruleTypeQualifier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getQualifiedTypeSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"typeQualifier",
            	      	        		lv_typeQualifier_0_0, 
            	      	        		"TypeQualifier", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:464:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:465:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:465:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:466:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification750);
            lv_typeSpec_1_0=ruleTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getQualifiedTypeSpecificationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"typeSpec",
              	        		lv_typeSpec_1_0, 
              	        		"TypeSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleQualifiedTypeSpecification


    // $ANTLR start entryRuleTypeSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:496:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:497:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:498:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification786);
            iv_ruleTypeSpecification=ruleTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSpecification796); if (failed) return current;

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
    // $ANTLR end entryRuleTypeSpecification


    // $ANTLR start ruleTypeSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:505:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:510:6: ( ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:511:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:511:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
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
                {
                alt6=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("511:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:511:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:511:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:512:1: (lv_typeDefName_0_0= ruleTypedefName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:512:1: (lv_typeDefName_0_0= ruleTypedefName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:513:3: lv_typeDefName_0_0= ruleTypedefName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefName_in_ruleTypeSpecification842);
                    lv_typeDefName_0_0=ruleTypedefName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeSpecificationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"typeDefName",
                      	        		lv_typeDefName_0_0, 
                      	        		"TypedefName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:537:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification873);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StructOrUnionSpecification_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:550:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification903);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumSpecification_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:562:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:562:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==39||(LA5_0>=53 && LA5_0<=71)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:563:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:563:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:564:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification929);
                    	    lv_typeSpecifier_3_0=ruleTypeSpecifier();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTypeSpecificationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"typeSpecifier",
                    	      	        		lv_typeSpecifier_3_0, 
                    	      	        		"TypeSpecifier", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeSpecification


    // $ANTLR start entryRuleTypedefName
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:594:1: entryRuleTypedefName returns [String current=null] : iv_ruleTypedefName= ruleTypedefName EOF ;
    public final String entryRuleTypedefName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypedefName = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:595:2: (iv_ruleTypedefName= ruleTypedefName EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:596:2: iv_ruleTypedefName= ruleTypedefName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefName_in_entryRuleTypedefName967);
            iv_ruleTypedefName=ruleTypedefName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedefName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefName978); if (failed) return current;

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
    // $ANTLR end entryRuleTypedefName


    // $ANTLR start ruleTypedefName
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:603:1: ruleTypedefName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FullyQualifiedName_0= ruleFullyQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypedefName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullyQualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:608:6: (this_FullyQualifiedName_0= ruleFullyQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:610:5: this_FullyQualifiedName_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName1024);
            this_FullyQualifiedName_0=ruleFullyQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_FullyQualifiedName_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypedefName


    // $ANTLR start entryRuleStructOrUnionSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:628:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:629:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:630:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1068);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1078); if (failed) return current;

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
    // $ANTLR end entryRuleStructOrUnionSpecification


    // $ANTLR start ruleStructOrUnionSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:637:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:642:6: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==20||LA7_3==28||(LA7_3>=30 && LA7_3<=33)) ) {
                        alt7=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==22) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==25) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==20||LA7_3==28||(LA7_3>=30 && LA7_3<=33)) ) {
                        alt7=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==22) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("643:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:644:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1128);
                    this_StructOrUnionDefinition_0=ruleStructOrUnionDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StructOrUnionDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:657:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1158);
                    this_StructorUnionReference_1=ruleStructorUnionReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StructorUnionReference_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStructOrUnionSpecification


    // $ANTLR start entryRuleStructOrUnionDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:676:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:677:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:678:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1193);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1203); if (failed) return current;

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
    // $ANTLR end entryRuleStructOrUnionDefinition


    // $ANTLR start ruleStructOrUnionDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:685:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:690:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:691:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:691:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:691:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:691:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:692:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:692:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:693:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1249);
            lv_struct_0_0=ruleStructOrUnion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStructOrUnionDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"struct",
              	        		lv_struct_0_0, 
              	        		"StructOrUnion", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:715:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:716:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:716:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:717:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1266); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStructOrUnionDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,22,FollowSets000.FOLLOW_22_in_ruleStructOrUnionDefinition1282); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:743:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=24 && LA9_0<=25)||LA9_0==27||LA9_0==39||LA9_0==42||(LA9_0>=51 && LA9_0<=71)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:744:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:744:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:745:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1303);
            	    lv_structMember_3_0=ruleStructMember();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStructOrUnionDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"structMember",
            	      	        		lv_structMember_3_0, 
            	      	        		"StructMember", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,23,FollowSets000.FOLLOW_23_in_ruleStructOrUnionDefinition1314); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStructOrUnionDefinition


    // $ANTLR start entryRuleStructorUnionReference
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:779:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:780:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:781:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructorUnionReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1350);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructorUnionReference1360); if (failed) return current;

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
    // $ANTLR end entryRuleStructorUnionReference


    // $ANTLR start ruleStructorUnionReference
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:788:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:793:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:794:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:794:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:794:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:794:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:795:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:795:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:796:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1406);
            lv_struct_0_0=ruleStructOrUnion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStructorUnionReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"struct",
              	        		lv_struct_0_0, 
              	        		"StructOrUnion", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:818:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:819:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:819:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:820:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructorUnionReference1423); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStructorUnionReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStructorUnionReference


    // $ANTLR start entryRuleStructOrUnion
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:850:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:851:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:852:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1465);
            iv_ruleStructOrUnion=ruleStructOrUnion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnion1476); if (failed) return current;

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
    // $ANTLR end entryRuleStructOrUnion


    // $ANTLR start ruleStructOrUnion
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:859:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:864:6: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:865:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:865:1: (kw= 'struct' | kw= 'union' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("865:1: (kw= 'struct' | kw= 'union' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:866:2: kw= 'struct'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleStructOrUnion1514); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStructOrUnionAccess().getStructKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:873:2: kw= 'union'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleStructOrUnion1533); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStructOrUnion


    // $ANTLR start entryRuleStructMember
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:886:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:887:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:888:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructMemberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_entryRuleStructMember1573);
            iv_ruleStructMember=ruleStructMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructMember1583); if (failed) return current;

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
    // $ANTLR end entryRuleStructMember


    // $ANTLR start ruleStructMember
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:895:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_qualType_1_0 = null;

        EObject lv_dec_2_0 = null;

        EObject lv_constExpr_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:900:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:901:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:901:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:901:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:901:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:902:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:902:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:903:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleStructMember1629);
            lv_annotations_0_0=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStructMemberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"annotations",
              	        		lv_annotations_0_0, 
              	        		"Annotations", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:925:2: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:926:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:926:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:927:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1650);
            lv_qualType_1_0=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStructMemberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"qualType",
              	        		lv_qualType_1_0, 
              	        		"QualifiedTypeSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:949:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:950:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:950:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:951:3: lv_dec_2_0= ruleDeclarators
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleStructMember1671);
            lv_dec_2_0=ruleDeclarators();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStructMemberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dec",
              	        		lv_dec_2_0, 
              	        		"Declarators", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:973:2: ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:973:4: ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleStructMember1682); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStructMemberAccess().getColonKeyword_3_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:977:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:978:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:978:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:979:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleStructMember1703);
                    lv_constExpr_4_0=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStructMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"constExpr",
                      	        		lv_constExpr_4_0, 
                      	        		"ConstantExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleStructMember1715); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStructMemberAccess().getSemicolonKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStructMember


    // $ANTLR start entryRuleEnumSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1013:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1014:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1015:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1751);
            iv_ruleEnumSpecification=ruleEnumSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumSpecification1761); if (failed) return current;

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
    // $ANTLR end entryRuleEnumSpecification


    // $ANTLR start ruleEnumSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1022:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1027:6: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1028:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1028:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==22) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==20||LA12_2==28||(LA12_2>=30 && LA12_2<=33)) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1028:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1==22) ) {
                    alt12=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1028:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1028:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1029:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1811);
                    this_EnumDefinition_0=ruleEnumDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1042:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_ruleEnumSpecification1841);
                    this_EnumReference_1=ruleEnumReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumReference_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEnumSpecification


    // $ANTLR start entryRuleEnumDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1061:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1062:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1063:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1876);
            iv_ruleEnumDefinition=ruleEnumDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumDefinition1886); if (failed) return current;

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
    // $ANTLR end entryRuleEnumDefinition


    // $ANTLR start ruleEnumDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1070:1: ruleEnumDefinition returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_enumMemberList_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1075:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1076:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1076:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1076:3: 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}'
            {
            match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumDefinition1921); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1080:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1081:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1081:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1082:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumDefinition1938); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEnumDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumDefinition1954); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1108:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1109:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1109:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1110:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1975);
            lv_enumMemberList_3_0=ruleEnumMemberList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"enumMemberList",
              	        		lv_enumMemberList_3_0, 
              	        		"EnumMemberList", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumDefinition1985); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEnumDefinition


    // $ANTLR start entryRuleEnumReference
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1144:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1145:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1146:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_entryRuleEnumReference2021);
            iv_ruleEnumReference=ruleEnumReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumReference2031); if (failed) return current;

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
    // $ANTLR end entryRuleEnumReference


    // $ANTLR start ruleEnumReference
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1153:1: ruleEnumReference returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1158:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1159:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1159:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1159:3: 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumReference2066); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1163:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1164:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1164:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1165:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumReference2083); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEnumReference


    // $ANTLR start entryRuleEnumMemberList
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1195:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1196:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1197:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumMemberListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2124);
            iv_ruleEnumMemberList=ruleEnumMemberList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMemberList2134); if (failed) return current;

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
    // $ANTLR end entryRuleEnumMemberList


    // $ANTLR start ruleEnumMemberList
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1204:1: ruleEnumMemberList returns [EObject current=null] : (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject this_EnumMember_0 = null;

        EObject lv_enumMember_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1209:6: ( (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1210:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1210:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1211:2: this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2184);
            this_EnumMember_0=ruleEnumMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_EnumMember_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1222:1: ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1222:3: ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    match(input,28,FollowSets000.FOLLOW_28_in_ruleEnumMemberList2194); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1226:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1227:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1227:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1228:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2215);
            	    lv_enumMember_2_0=ruleEnumMember();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEnumMemberListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"enumMember",
            	      	        		lv_enumMember_2_0, 
            	      	        		"EnumMember", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEnumMemberList


    // $ANTLR start entryRuleEnumMember
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1258:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1259:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1260:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumMemberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_entryRuleEnumMember2253);
            iv_ruleEnumMember=ruleEnumMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMember2263); if (failed) return current;

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
    // $ANTLR end entryRuleEnumMember


    // $ANTLR start ruleEnumMember
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1267:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_constExpr_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1272:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1273:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1273:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1273:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1273:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1274:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1274:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1275:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleEnumMember2309);
            lv_annotations_0_0=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumMemberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"annotations",
              	        		lv_annotations_0_0, 
              	        		"Annotations", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1297:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1298:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1298:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1299:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumMember2326); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumMemberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1321:2: ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1321:4: '=' ( (lv_constExpr_3_0= ruleConstantExpression ) )
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumMember2342); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1325:1: ( (lv_constExpr_3_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1326:1: (lv_constExpr_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1326:1: (lv_constExpr_3_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1327:3: lv_constExpr_3_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleEnumMember2363);
                    lv_constExpr_3_0=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEnumMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"constExpr",
                      	        		lv_constExpr_3_0, 
                      	        		"ConstantExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEnumMember


    // $ANTLR start entryRuleDeclarators
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1357:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1358:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1359:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaratorsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_entryRuleDeclarators2401);
            iv_ruleDeclarators=ruleDeclarators();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarators2411); if (failed) return current;

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
    // $ANTLR end entryRuleDeclarators


    // $ANTLR start ruleDeclarators
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1366:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1371:6: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1372:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1372:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1372:2: ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1372:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1373:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1373:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1374:3: lv_dec_0_0= ruleDeclarator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2457);
            lv_dec_0_0=ruleDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclaratorsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dec",
              	        		lv_dec_0_0, 
              	        		"Declarator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1396:2: ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1396:4: ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    match(input,28,FollowSets000.FOLLOW_28_in_ruleDeclarators2468); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1400:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1401:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1401:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1402:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2489);
            	    lv_declaratorList_2_0=ruleDeclarator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDeclaratorsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"declaratorList",
            	      	        		lv_declaratorList_2_0, 
            	      	        		"Declarator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDeclarators


    // $ANTLR start entryRuleDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1432:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1433:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1434:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_entryRuleDeclarator2527);
            iv_ruleDeclarator=ruleDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarator2537); if (failed) return current;

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
    // $ANTLR end entryRuleDeclarator


    // $ANTLR start ruleDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1441:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1446:6: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:2: ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:2: ( (lv_pointer_0_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1448:1: (lv_pointer_0_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1448:1: (lv_pointer_0_0= rulePointerSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1449:3: lv_pointer_0_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleDeclarator2583);
            lv_pointer_0_0=rulePointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclaratorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pointer",
              	        		lv_pointer_0_0, 
              	        		"PointerSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1471:2: ( (lv_dc_1_0= ruleDirectDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1472:1: (lv_dc_1_0= ruleDirectDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1472:1: (lv_dc_1_0= ruleDirectDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1473:3: lv_dc_1_0= ruleDirectDeclarator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2604);
            lv_dc_1_0=ruleDirectDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclaratorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"dc",
              	        		lv_dc_1_0, 
              	        		"DirectDeclarator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDeclarator


    // $ANTLR start entryRuleAbstractDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1503:1: entryRuleAbstractDeclarator returns [EObject current=null] : iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF ;
    public final EObject entryRuleAbstractDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1504:2: (iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1505:2: iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAbstractDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2640);
            iv_ruleAbstractDeclarator=ruleAbstractDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAbstractDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractDeclarator2650); if (failed) return current;

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
    // $ANTLR end entryRuleAbstractDeclarator


    // $ANTLR start ruleAbstractDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1512:1: ruleAbstractDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? ) ;
    public final EObject ruleAbstractDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1517:6: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1518:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1518:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1518:2: ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1518:2: ( (lv_pointer_0_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1519:1: (lv_pointer_0_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1519:1: (lv_pointer_0_0= rulePointerSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1520:3: lv_pointer_0_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAbstractDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleAbstractDeclarator2696);
            lv_pointer_0_0=rulePointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAbstractDeclaratorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pointer",
              	        		lv_pointer_0_0, 
              	        		"PointerSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1542:2: ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31||LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1543:1: (lv_dc_1_0= ruleAbstractDirectDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1543:1: (lv_dc_1_0= ruleAbstractDirectDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1544:3: lv_dc_1_0= ruleAbstractDirectDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAbstractDeclaratorAccess().getDcAbstractDirectDeclaratorParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractDirectDeclarator_in_ruleAbstractDeclarator2717);
                    lv_dc_1_0=ruleAbstractDirectDeclarator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAbstractDeclaratorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dc",
                      	        		lv_dc_1_0, 
                      	        		"AbstractDirectDeclarator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAbstractDeclarator


    // $ANTLR start entryRulePointerSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1574:1: entryRulePointerSpecification returns [EObject current=null] : iv_rulePointerSpecification= rulePointerSpecification EOF ;
    public final EObject entryRulePointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1575:2: (iv_rulePointerSpecification= rulePointerSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1576:2: iv_rulePointerSpecification= rulePointerSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPointerSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2754);
            iv_rulePointerSpecification=rulePointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePointerSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePointerSpecification2764); if (failed) return current;

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
    // $ANTLR end entryRulePointerSpecification


    // $ANTLR start rulePointerSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1583:1: rulePointerSpecification returns [EObject current=null] : ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* ) ;
    public final EObject rulePointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiedPointer_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1588:6: ( ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1589:1: ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1589:1: ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1589:2: () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1589:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1590:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPointerSpecificationAccess().getPointerSpecificationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPointerSpecificationAccess().getPointerSpecificationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1603:2: ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1604:1: (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1604:1: (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1605:3: lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerQualified_PointerSpecificationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualified_PointerSpecification_in_rulePointerSpecification2822);
            	    lv_qualifiedPointer_1_0=ruleQualified_PointerSpecification();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPointerSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"qualifiedPointer",
            	      	        		lv_qualifiedPointer_1_0, 
            	      	        		"Qualified_PointerSpecification", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePointerSpecification


    // $ANTLR start entryRuleQualified_PointerSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1635:1: entryRuleQualified_PointerSpecification returns [EObject current=null] : iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF ;
    public final EObject entryRuleQualified_PointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualified_PointerSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1636:2: (iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1637:2: iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualified_PointerSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification2859);
            iv_ruleQualified_PointerSpecification=ruleQualified_PointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualified_PointerSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualified_PointerSpecification2869); if (failed) return current;

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
    // $ANTLR end entryRuleQualified_PointerSpecification


    // $ANTLR start ruleQualified_PointerSpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1644:1: ruleQualified_PointerSpecification returns [EObject current=null] : ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* ) ;
    public final EObject ruleQualified_PointerSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1649:6: ( ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1650:1: ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1650:1: ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1650:2: () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1650:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1651:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getQualified_PointerSpecificationAccess().getQualified_PointerSpecificationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getQualified_PointerSpecificationAccess().getQualified_PointerSpecificationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,30,FollowSets000.FOLLOW_30_in_ruleQualified_PointerSpecification2916); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualified_PointerSpecificationAccess().getAsteriskKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1668:1: ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=51 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1669:1: (lv_typeQualifier_2_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1669:1: (lv_typeQualifier_2_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1670:3: lv_typeQualifier_2_0= ruleTypeQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualified_PointerSpecification2937);
            	    lv_typeQualifier_2_0=ruleTypeQualifier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getQualified_PointerSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"typeQualifier",
            	      	        		lv_typeQualifier_2_0, 
            	      	        		"TypeQualifier", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleQualified_PointerSpecification


    // $ANTLR start entryRuleDirectDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1700:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1701:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1702:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDirectDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2974);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectDeclarator2984); if (failed) return current;

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
    // $ANTLR end entryRuleDirectDeclarator


    // $ANTLR start ruleDirectDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1709:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_dec_2_0 = null;

        EObject lv_array_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1714:6: ( ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1715:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1715:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1715:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1715:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1715:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1715:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1715:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1716:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1716:1: (lv_id_0_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1717:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDirectDeclarator3027); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDirectDeclaratorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_0_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1740:6: ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1740:6: ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1740:8: '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleDirectDeclarator3049); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1744:1: ( (lv_dec_2_0= ruleDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1745:1: (lv_dec_2_0= ruleDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1745:1: (lv_dec_2_0= ruleDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1746:3: lv_dec_2_0= ruleDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDecDeclaratorParserRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDirectDeclarator3070);
                    lv_dec_2_0=ruleDeclarator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDirectDeclaratorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dec",
                      	        		lv_dec_2_0, 
                      	        		"Declarator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleDirectDeclarator3080); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1772:3: ( (lv_array_4_0= ruleArraySpecification ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1773:1: (lv_array_4_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1773:1: (lv_array_4_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1774:3: lv_array_4_0= ruleArraySpecification
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator3103);
            	    lv_array_4_0=ruleArraySpecification();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDirectDeclaratorRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"array",
            	      	        		lv_array_4_0, 
            	      	        		"ArraySpecification", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDirectDeclarator


    // $ANTLR start entryRuleAbstractDirectDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1804:1: entryRuleAbstractDirectDeclarator returns [EObject current=null] : iv_ruleAbstractDirectDeclarator= ruleAbstractDirectDeclarator EOF ;
    public final EObject entryRuleAbstractDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1805:2: (iv_ruleAbstractDirectDeclarator= ruleAbstractDirectDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1806:2: iv_ruleAbstractDirectDeclarator= ruleAbstractDirectDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAbstractDirectDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractDirectDeclarator_in_entryRuleAbstractDirectDeclarator3140);
            iv_ruleAbstractDirectDeclarator=ruleAbstractDirectDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAbstractDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractDirectDeclarator3150); if (failed) return current;

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
    // $ANTLR end entryRuleAbstractDirectDeclarator


    // $ANTLR start ruleAbstractDirectDeclarator
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1813:1: ruleAbstractDirectDeclarator returns [EObject current=null] : ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ ) ;
    public final EObject ruleAbstractDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_1_0 = null;

        EObject lv_arrays_3_0 = null;

        EObject lv_array_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1818:6: ( ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1819:1: ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1819:1: ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1819:1: ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1819:2: ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1819:2: ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1819:4: '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )*
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleAbstractDirectDeclarator3186); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractDirectDeclaratorAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1823:1: ( (lv_dec_1_0= ruleAbstractDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1824:1: (lv_dec_1_0= ruleAbstractDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1824:1: (lv_dec_1_0= ruleAbstractDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1825:3: lv_dec_1_0= ruleAbstractDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAbstractDirectDeclaratorAccess().getDecAbstractDeclaratorParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractDeclarator_in_ruleAbstractDirectDeclarator3207);
                    lv_dec_1_0=ruleAbstractDeclarator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAbstractDirectDeclaratorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dec",
                      	        		lv_dec_1_0, 
                      	        		"AbstractDeclarator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleAbstractDirectDeclarator3217); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractDirectDeclaratorAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1851:1: ( (lv_arrays_3_0= ruleArraySpecification ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==33) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1852:1: (lv_arrays_3_0= ruleArraySpecification )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1852:1: (lv_arrays_3_0= ruleArraySpecification )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1853:3: lv_arrays_3_0= ruleArraySpecification
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAbstractDirectDeclaratorAccess().getArraysArraySpecificationParserRuleCall_0_3_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3238);
                    	    lv_arrays_3_0=ruleArraySpecification();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAbstractDirectDeclaratorRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"arrays",
                    	      	        		lv_arrays_3_0, 
                    	      	        		"ArraySpecification", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
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
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1876:6: ( (lv_array_4_0= ruleArraySpecification ) )+
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1876:6: ( (lv_array_4_0= ruleArraySpecification ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==33) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1877:1: (lv_array_4_0= ruleArraySpecification )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1877:1: (lv_array_4_0= ruleArraySpecification )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1878:3: lv_array_4_0= ruleArraySpecification
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAbstractDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3267);
                    	    lv_array_4_0=ruleArraySpecification();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAbstractDirectDeclaratorRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"array",
                    	      	        		lv_array_4_0, 
                    	      	        		"ArraySpecification", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAbstractDirectDeclarator


    // $ANTLR start entryRuleArraySpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1908:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1909:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1910:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArraySpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3304);
            iv_ruleArraySpecification=ruleArraySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArraySpecification3314); if (failed) return current;

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
    // $ANTLR end entryRuleArraySpecification


    // $ANTLR start ruleArraySpecification
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1917:1: ruleArraySpecification returns [EObject current=null] : ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_constExpr_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1922:6: ( ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1923:1: ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1923:1: ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1923:3: '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']'
            {
            match(input,33,FollowSets000.FOLLOW_33_in_ruleArraySpecification3349); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1927:1: ( (lv_constExpr_1_0= ruleConstantExpression ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=RULE_ADDITIVEOPERATION && LA25_0<=RULE_INT)||LA25_0==RULE_UNARYOPERATION||LA25_0==31||LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1928:1: (lv_constExpr_1_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1928:1: (lv_constExpr_1_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1929:3: lv_constExpr_1_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArraySpecificationAccess().getConstExprConstantExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleArraySpecification3370);
                    lv_constExpr_1_0=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArraySpecificationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"constExpr",
                      	        		lv_constExpr_1_0, 
                      	        		"ConstantExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,34,FollowSets000.FOLLOW_34_in_ruleArraySpecification3381); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleArraySpecification


    // $ANTLR start entryRuleFullyQualifiedName
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1963:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1964:2: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1965:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName3418);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullyQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFullyQualifiedName3429); if (failed) return current;

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
    // $ANTLR end entryRuleFullyQualifiedName


    // $ANTLR start ruleFullyQualifiedName
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1972:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1977:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1978:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1978:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1978:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFullyQualifiedName3469); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1985:1: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1986:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleFullyQualifiedName3488); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFullyQualifiedName3503); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFullyQualifiedName


    // $ANTLR start entryRuleConstantDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2006:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2007:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2008:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3550);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinition3560); if (failed) return current;

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
    // $ANTLR end entryRuleConstantDefinition


    // $ANTLR start ruleConstantDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2015:1: ruleConstantDefinition returns [EObject current=null] : ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_expr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2020:6: ( ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2021:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2021:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2021:3: '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            match(input,36,FollowSets000.FOLLOW_36_in_ruleConstantDefinition3595); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2025:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2026:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2026:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2027:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinition3612); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstantDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2049:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=RULE_ADDITIVEOPERATION && LA27_0<=RULE_INT)||LA27_0==RULE_UNARYOPERATION||LA27_0==31||LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2050:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2050:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2051:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3638);
                    lv_expr_2_0=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_2_0, 
                      	        		"ConstantExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConstantDefinition


    // $ANTLR start entryRuleInterfaceDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2081:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2082:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2083:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3675);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition3685); if (failed) return current;

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
    // $ANTLR end entryRuleInterfaceDefinition


    // $ANTLR start ruleInterfaceDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2090:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_fqn_3_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_5_0 = null;

        EObject lv_methodDef_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2095:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2096:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2096:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2096:2: ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2096:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2097:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2097:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2098:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleInterfaceDefinition3731);
            lv_annotations_0_0=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"annotations",
              	        		lv_annotations_0_0, 
              	        		"Annotations", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,37,FollowSets000.FOLLOW_37_in_ruleInterfaceDefinition3741); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:1: ( 'unmanaged' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:3: 'unmanaged'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleInterfaceDefinition3752); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2128:3: ( (lv_fqn_3_0= ruleFullyQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2129:1: (lv_fqn_3_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2129:1: (lv_fqn_3_0= ruleFullyQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2130:3: lv_fqn_3_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3775);
            lv_fqn_3_0=ruleFullyQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fqn",
              	        		lv_fqn_3_0, 
              	        		"FullyQualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2152:2: ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2152:4: ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) )
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceDefinition3786); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2156:1: ( (lv_fqn2_5_0= ruleFullyQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2157:1: (lv_fqn2_5_0= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2157:1: (lv_fqn2_5_0= ruleFullyQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2158:3: lv_fqn2_5_0= ruleFullyQualifiedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3807);
                    lv_fqn2_5_0=ruleFullyQualifiedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"fqn2",
                      	        		lv_fqn2_5_0, 
                      	        		"FullyQualifiedName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,22,FollowSets000.FOLLOW_22_in_ruleInterfaceDefinition3819); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2184:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=24 && LA30_0<=25)||LA30_0==27||LA30_0==39||LA30_0==42||(LA30_0>=51 && LA30_0<=71)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2185:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2185:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2186:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3840);
            	    lv_methodDef_7_0=ruleMethodDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"methodDef",
            	      	        		lv_methodDef_7_0, 
            	      	        		"MethodDefinition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,23,FollowSets000.FOLLOW_23_in_ruleInterfaceDefinition3851); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_7(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInterfaceDefinition


    // $ANTLR start entryRuleMethodDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2220:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2221:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2222:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMethodDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3887);
            iv_ruleMethodDefinition=ruleMethodDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodDefinition3897); if (failed) return current;

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
    // $ANTLR end entryRuleMethodDefinition


    // $ANTLR start ruleMethodDefinition
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2229:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_pointerSpecification_2_0 = null;

        EObject lv_ParameterList_8_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2234:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2235:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2235:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2235:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2235:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2236:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2236:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2237:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleMethodDefinition3943);
            lv_annotations_0_0=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"annotations",
              	        		lv_annotations_0_0, 
              	        		"Annotations", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2259:2: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2260:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2260:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2261:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3964);
            lv_qualifiedTypeSpec_1_0=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"qualifiedTypeSpec",
              	        		lv_qualifiedTypeSpec_1_0, 
              	        		"QualifiedTypeSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2283:2: ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2284:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2284:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2285:3: lv_pointerSpecification_2_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationPointerSpecificationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3985);
            lv_pointerSpecification_2_0=rulePointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"pointerSpecification",
              	        		lv_pointerSpecification_2_0, 
              	        		"PointerSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2307:2: ( (lv_id_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2308:1: (lv_id_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2308:1: (lv_id_3_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2309:3: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodDefinition4002); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_3_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 24:
                case 25:
                case 27:
                case 42:
                case 51:
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
                    {
                    alt32=2;
                    }
                    break;
                case 39:
                    {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==RULE_ID||LA32_3==28||(LA32_3>=30 && LA32_3<=31)||LA32_3==33||LA32_3==39||(LA32_3>=53 && LA32_3<=71)) ) {
                        alt32=2;
                    }
                    else if ( (LA32_3==32) ) {
                        int LA32_5 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt32=1;
                        }
                        else if ( (true) ) {
                            alt32=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2331:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 32, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2331:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 32, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2331:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2331:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:3: ( '(' ( 'void' )? ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:3: ( '(' ( 'void' )? ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:5: '(' ( 'void' )? ')'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodDefinition4019); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2335:1: ( 'void' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==39) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2335:3: 'void'
                            {
                            match(input,39,FollowSets000.FOLLOW_39_in_ruleMethodDefinition4030); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleMethodDefinition4042); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2344:6: ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2344:6: ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2344:8: '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodDefinition4060); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2348:1: ( (lv_ParameterList_8_0= ruleParameterList ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2349:1: (lv_ParameterList_8_0= ruleParameterList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2349:1: (lv_ParameterList_8_0= ruleParameterList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2350:3: lv_ParameterList_8_0= ruleParameterList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_4_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_ruleMethodDefinition4081);
                    lv_ParameterList_8_0=ruleParameterList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ParameterList",
                      	        		lv_ParameterList_8_0, 
                      	        		"ParameterList", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleMethodDefinition4091); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleMethodDefinition4103); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMethodDefinition


    // $ANTLR start entryRuleParameterList
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2388:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2389:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2390:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_entryRuleParameterList4139);
            iv_ruleParameterList=ruleParameterList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterList4149); if (failed) return current;

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
    // $ANTLR end entryRuleParameterList


    // $ANTLR start ruleParameterList
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2397:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2402:6: ( ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2403:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2403:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2403:2: ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2403:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2404:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2404:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2405:3: lv_param_0_0= ruleParameter
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList4195);
            lv_param_0_0=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"param",
              	        		lv_param_0_0, 
              	        		"Parameter", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2427:2: ( ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID||(LA33_1>=24 && LA33_1<=25)||LA33_1==27||LA33_1==39||LA33_1==42||(LA33_1>=51 && LA33_1<=73)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2427:4: ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList4206); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2431:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2432:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2432:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2433:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList4227);
            	    lv_params_2_0=ruleParameter();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getParameterListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"params",
            	      	        		lv_params_2_0, 
            	      	        		"Parameter", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2455:4: ( ',' '...' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2455:6: ',' '...'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList4240); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_2_0(), null); 
                          
                    }
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleParameterList4250); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleParameterList


    // $ANTLR start entryRuleParameter
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2471:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2472:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2473:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4288);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4298); if (failed) return current;

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2480:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;

        EObject lv_absDec_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2485:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2486:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2486:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2486:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2486:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2487:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2487:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2488:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleParameter4344);
            lv_annotations_0_0=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"annotations",
              	        		lv_annotations_0_0, 
              	        		"Annotations", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2510:2: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=72 && LA35_0<=73)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2511:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2511:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2512:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterQualifier_in_ruleParameter4365);
            	    lv_ParameterQualifier_1_0=ruleParameterQualifier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"ParameterQualifier",
            	      	        		lv_ParameterQualifier_1_0, 
            	      	        		"ParameterQualifier", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2534:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2535:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2535:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2536:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4387);
            lv_qualifiedTypeSpec_2_0=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"qualifiedTypeSpec",
              	        		lv_qualifiedTypeSpec_2_0, 
              	        		"QualifiedTypeSpecification", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )
            int alt36=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA36_1 = input.LA(2);

                if ( (synpred40()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2558:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt36=1;
                }
                break;
            case 31:
                {
                int LA36_3 = input.LA(2);

                if ( (synpred40()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2558:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 28:
            case 32:
            case 33:
                {
                alt36=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2558:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:3: ( (lv_dec_3_0= ruleDeclarator ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:3: ( (lv_dec_3_0= ruleDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2559:1: (lv_dec_3_0= ruleDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2559:1: (lv_dec_3_0= ruleDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2560:3: lv_dec_3_0= ruleDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleParameter4409);
                    lv_dec_3_0=ruleDeclarator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dec",
                      	        		lv_dec_3_0, 
                      	        		"Declarator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2583:6: ( (lv_absDec_4_0= ruleAbstractDeclarator ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2583:6: ( (lv_absDec_4_0= ruleAbstractDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2584:1: (lv_absDec_4_0= ruleAbstractDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2584:1: (lv_absDec_4_0= ruleAbstractDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2585:3: lv_absDec_4_0= ruleAbstractDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getAbsDecAbstractDeclaratorParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractDeclarator_in_ruleParameter4436);
                    lv_absDec_4_0=ruleAbstractDeclarator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"absDec",
                      	        		lv_absDec_4_0, 
                      	        		"AbstractDeclarator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleIncludeDirective
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2615:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2616:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeDirectiveRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4473);
            iv_ruleIncludeDirective=ruleIncludeDirective();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludeDirective4483); if (failed) return current;

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
    // $ANTLR end entryRuleIncludeDirective


    // $ANTLR start ruleIncludeDirective
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2624:1: ruleIncludeDirective returns [EObject current=null] : ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2629:6: ( ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2630:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2630:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2630:3: '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            {
            match(input,41,FollowSets000.FOLLOW_41_in_ruleIncludeDirective4518); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2634:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INCLUDELIB) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2634:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2634:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2634:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2635:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2635:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2636:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective4536); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0(), "importedURI"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIncludeDirectiveRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"importedURI",
                      	        		lv_importedURI_1_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2659:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2659:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2660:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2660:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2661:3: lv_includeID_2_0= RULE_INCLUDELIB
                    {
                    lv_includeID_2_0=(Token)input.LT(1);
                    match(input,RULE_INCLUDELIB,FollowSets000.FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective4564); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0(), "includeID"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIncludeDirectiveRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"includeID",
                      	        		lv_includeID_2_0, 
                      	        		"IncludeLib", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleIncludeDirective


    // $ANTLR start entryRuleAnnotations
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2691:1: entryRuleAnnotations returns [EObject current=null] : iv_ruleAnnotations= ruleAnnotations EOF ;
    public final EObject entryRuleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotations = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:2: (iv_ruleAnnotations= ruleAnnotations EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2693:2: iv_ruleAnnotations= ruleAnnotations EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_entryRuleAnnotations4606);
            iv_ruleAnnotations=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotations; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotations4616); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotations


    // $ANTLR start ruleAnnotations
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2700:1: ruleAnnotations returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2705:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2706:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2706:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2706:2: () ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2706:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2707:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAnnotationsAccess().getAnnotationsAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAnnotationsAccess().getAnnotationsAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2720:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==42) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2721:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2721:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2722:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotations4674);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnnotationsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"Annotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotations


    // $ANTLR start entryRuleAnnotation
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2752:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2753:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2754:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4711);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4721); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2761:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fqn_1_0 = null;

        EObject lv_annotationParamaters_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2766:6: ( ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:1: ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:1: ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:3: '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )?
            {
            match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation4756); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2771:1: ( (lv_fqn_1_0= ruleFullyQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2772:1: (lv_fqn_1_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2772:1: (lv_fqn_1_0= ruleFullyQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2773:3: lv_fqn_1_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getFqnFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleAnnotation4777);
            lv_fqn_1_0=ruleFullyQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fqn",
              	        		lv_fqn_1_0, 
              	        		"FullyQualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2795:2: ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2796:1: (lv_annotationParamaters_2_0= ruleAnnotationParameters )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2796:1: (lv_annotationParamaters_2_0= ruleAnnotationParameters )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2797:3: lv_annotationParamaters_2_0= ruleAnnotationParameters
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParamatersAnnotationParametersParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationParameters_in_ruleAnnotation4798);
                    lv_annotationParamaters_2_0=ruleAnnotationParameters();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"annotationParamaters",
                      	        		lv_annotationParamaters_2_0, 
                      	        		"AnnotationParameters", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleAnnotationParameters
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2827:1: entryRuleAnnotationParameters returns [EObject current=null] : iv_ruleAnnotationParameters= ruleAnnotationParameters EOF ;
    public final EObject entryRuleAnnotationParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationParameters = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2828:2: (iv_ruleAnnotationParameters= ruleAnnotationParameters EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2829:2: iv_ruleAnnotationParameters= ruleAnnotationParameters EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationParametersRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters4835);
            iv_ruleAnnotationParameters=ruleAnnotationParameters();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationParameters; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationParameters4845); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotationParameters


    // $ANTLR start ruleAnnotationParameters
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2836:1: ruleAnnotationParameters returns [EObject current=null] : ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' ) ;
    public final EObject ruleAnnotationParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_valuePair_2_0 = null;

        EObject lv_value_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2841:6: ( ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:1: ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:1: ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2843:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAnnotationParametersAccess().getAnnotationParametersAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAnnotationParametersAccess().getAnnotationParametersAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleAnnotationParameters4892); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationParametersAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2860:1: ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==29) ) {
                    alt40=1;
                }
                else if ( (LA40_1==32) ) {
                    alt40=2;
                }
            }
            else if ( (LA40_0==RULE_STRING||(LA40_0>=RULE_BOOLEAN && LA40_0<=RULE_INT)||LA40_0==22||(LA40_0>=42 && LA40_0<=43)) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2860:2: ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2860:2: ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2861:1: (lv_valuePair_2_0= ruleAnnotationValuePairs )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2861:1: (lv_valuePair_2_0= ruleAnnotationValuePairs )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2862:3: lv_valuePair_2_0= ruleAnnotationValuePairs
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationParametersAccess().getValuePairAnnotationValuePairsParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePairs_in_ruleAnnotationParameters4914);
                    lv_valuePair_2_0=ruleAnnotationValuePairs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationParametersRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"valuePair",
                      	        		lv_valuePair_2_0, 
                      	        		"AnnotationValuePairs", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2885:6: ( (lv_value_3_0= ruleAnnotationValue ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2885:6: ( (lv_value_3_0= ruleAnnotationValue ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2886:1: (lv_value_3_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2886:1: (lv_value_3_0= ruleAnnotationValue )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2887:3: lv_value_3_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationParametersAccess().getValueAnnotationValueParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationParameters4941);
                    lv_value_3_0=ruleAnnotationValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationParametersRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_3_0, 
                      	        		"AnnotationValue", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleAnnotationParameters4953); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationParametersAccess().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotationParameters


    // $ANTLR start entryRuleAnnotationValuePairs
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2921:1: entryRuleAnnotationValuePairs returns [EObject current=null] : iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF ;
    public final EObject entryRuleAnnotationValuePairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePairs = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2922:2: (iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2923:2: iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValuePairsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs4989);
            iv_ruleAnnotationValuePairs=ruleAnnotationValuePairs();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValuePairs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePairs4999); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotationValuePairs


    // $ANTLR start ruleAnnotationValuePairs
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2930:1: ruleAnnotationValuePairs returns [EObject current=null] : ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* ) ;
    public final EObject ruleAnnotationValuePairs() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_listValue_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2935:6: ( ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2936:1: ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2936:1: ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2936:2: ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2936:2: ( (lv_first_0_0= ruleAnnotationValuePair ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2937:1: (lv_first_0_0= ruleAnnotationValuePair )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2937:1: (lv_first_0_0= ruleAnnotationValuePair )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2938:3: lv_first_0_0= ruleAnnotationValuePair
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairsAccess().getFirstAnnotationValuePairParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs5045);
            lv_first_0_0=ruleAnnotationValuePair();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationValuePairsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"first",
              	        		lv_first_0_0, 
              	        		"AnnotationValuePair", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2960:2: ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2960:4: ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) )
            	    {
            	    match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotationValuePairs5056); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAnnotationValuePairsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2964:1: ( (lv_listValue_2_0= ruleAnnotationValuePair ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2965:1: (lv_listValue_2_0= ruleAnnotationValuePair )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2965:1: (lv_listValue_2_0= ruleAnnotationValuePair )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2966:3: lv_listValue_2_0= ruleAnnotationValuePair
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairsAccess().getListValueAnnotationValuePairParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs5077);
            	    lv_listValue_2_0=ruleAnnotationValuePair();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnnotationValuePairsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"listValue",
            	      	        		lv_listValue_2_0, 
            	      	        		"AnnotationValuePair", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotationValuePairs


    // $ANTLR start entryRuleAnnotationValuePair
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2996:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2997:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2998:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValuePairRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair5115);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePair5125); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotationValuePair


    // $ANTLR start ruleAnnotationValuePair
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3005:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_value_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3010:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3011:1: ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3011:1: ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3011:2: ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3011:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3012:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3012:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3013:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValuePair5167); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAnnotationValuePairAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationValuePairRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationValuePair5182); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3039:1: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3040:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3040:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3041:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair5203);
            lv_value_2_0=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationValuePairRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"AnnotationValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotationValuePair


    // $ANTLR start entryRuleAnnotationValue
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3071:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3072:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3073:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue5239);
            iv_ruleAnnotationValue=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValue5249); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotationValue


    // $ANTLR start ruleAnnotationValue
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3080:1: ruleAnnotationValue returns [EObject current=null] : ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_4 = null;

        EObject this_ArrayAnnotationValue_5 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3085:6: ( ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3086:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3086:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )
            int alt42=7;
            switch ( input.LA(1) ) {
            case RULE_ADDITIVEOPERATION:
            case RULE_INT:
                {
                alt42=1;
                }
                break;
            case 43:
                {
                alt42=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt42=3;
                }
                break;
            case RULE_ID:
                {
                alt42=4;
                }
                break;
            case 42:
                {
                alt42=5;
                }
                break;
            case 22:
                {
                alt42=6;
                }
                break;
            case RULE_STRING:
                {
                alt42=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3086:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3086:2: rulesignedINT
                    {
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleAnnotationValue5283);
                    rulesignedINT();
                    _fsp--;
                    if (failed) return current;

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3087:7: 'null'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleAnnotationValue5291); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationValueAccess().getNullKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3092:6: RULE_BOOLEAN
                    {
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5306); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getBooleanTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3097:6: RULE_ID
                    {
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValue5320); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getIDTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3103:2: this_Annotation_4= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getAnnotationParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationValue5350);
                    this_Annotation_4=ruleAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Annotation_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3116:2: this_ArrayAnnotationValue_5= ruleArrayAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getArrayAnnotationValueParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5380);
                    this_ArrayAnnotationValue_5=ruleArrayAnnotationValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ArrayAnnotationValue_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3128:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnnotationValue5394); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getSTRINGTerminalRuleCall_6(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotationValue


    // $ANTLR start entryRuleArrayAnnotationValue
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3140:1: entryRuleArrayAnnotationValue returns [EObject current=null] : iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF ;
    public final EObject entryRuleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3141:2: (iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3142:2: iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrayAnnotationValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5429);
            iv_ruleArrayAnnotationValue=ruleArrayAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrayAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayAnnotationValue5439); if (failed) return current;

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
    // $ANTLR end entryRuleArrayAnnotationValue


    // $ANTLR start ruleArrayAnnotationValue
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3149:1: ruleArrayAnnotationValue returns [EObject current=null] : ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' ) ;
    public final EObject ruleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject lv_firstValue_1_0 = null;

        EObject lv_values_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3154:6: ( ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3155:1: ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3155:1: ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3155:3: '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleArrayAnnotationValue5474); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3159:1: ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||(LA44_0>=RULE_BOOLEAN && LA44_0<=RULE_INT)||LA44_0==22||(LA44_0>=42 && LA44_0<=43)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3159:2: ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3159:2: ( (lv_firstValue_1_0= ruleAnnotationValue ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3160:1: (lv_firstValue_1_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3160:1: (lv_firstValue_1_0= ruleAnnotationValue )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3161:3: lv_firstValue_1_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getFirstValueAnnotationValueParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5496);
                    lv_firstValue_1_0=ruleAnnotationValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArrayAnnotationValueRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"firstValue",
                      	        		lv_firstValue_1_0, 
                      	        		"AnnotationValue", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3183:2: ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==28) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3183:4: ',' ( (lv_values_3_0= ruleAnnotationValue ) )
                    	    {
                    	    match(input,28,FollowSets000.FOLLOW_28_in_ruleArrayAnnotationValue5507); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getCommaKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3187:1: ( (lv_values_3_0= ruleAnnotationValue ) )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3188:1: (lv_values_3_0= ruleAnnotationValue )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3188:1: (lv_values_3_0= ruleAnnotationValue )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3189:3: lv_values_3_0= ruleAnnotationValue
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5528);
                    	    lv_values_3_0=ruleAnnotationValue();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getArrayAnnotationValueRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"values",
                    	      	        		lv_values_3_0, 
                    	      	        		"AnnotationValue", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleArrayAnnotationValue5542); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getRightCurlyBracketKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleArrayAnnotationValue


    // $ANTLR start entryRulesignedINT
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3223:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3224:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3225:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT5579);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT5590); if (failed) return current;

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
    // $ANTLR end entryRulesignedINT


    // $ANTLR start rulesignedINT
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3232:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AdditiveOperation_0=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3237:6: ( ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3238:1: ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3238:1: ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3238:2: (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3238:2: (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ADDITIVEOPERATION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3238:7: this_AdditiveOperation_0= RULE_ADDITIVEOPERATION
                    {
                    this_AdditiveOperation_0=(Token)input.LT(1);
                    match(input,RULE_ADDITIVEOPERATION,FollowSets000.FOLLOW_RULE_ADDITIVEOPERATION_in_rulesignedINT5631); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_AdditiveOperation_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSignedINTAccess().getAdditiveOperationTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT5653); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulesignedINT


    // $ANTLR start entryRuleConstantExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3260:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3261:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3262:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5698);
            iv_ruleConstantExpression=ruleConstantExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantExpression5708); if (failed) return current;

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
    // $ANTLR end entryRuleConstantExpression


    // $ANTLR start ruleConstantExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3269:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3274:6: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3276:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5757);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConstantExpression


    // $ANTLR start entryRuleLogicalOrExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3295:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3296:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3297:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5791);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression5801); if (failed) return current;

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
    // $ANTLR end entryRuleLogicalOrExpression


    // $ANTLR start ruleLogicalOrExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3304:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3309:6: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3310:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3310:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3310:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3310:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5847);
            lv_leftExpr_0_0=ruleLogicalAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLogicalOrExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"LogicalAndExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3334:2: ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3334:4: '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleLogicalOrExpression5858); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3338:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3339:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3339:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3340:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5879);
                    lv_rightExpr_2_0=ruleLogicalOrExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLogicalOrExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"LogicalOrExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLogicalOrExpression


    // $ANTLR start entryRuleLogicalAndExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3370:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3371:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3372:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5917);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression5927); if (failed) return current;

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
    // $ANTLR end entryRuleLogicalAndExpression


    // $ANTLR start ruleLogicalAndExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3379:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3384:6: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3385:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3385:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3385:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3385:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3386:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3386:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5973);
            lv_leftExpr_0_0=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLogicalAndExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"OrExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3409:2: ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3409:4: '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleLogicalAndExpression5984); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3413:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3414:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3414:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3415:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression6005);
                    lv_rightExpr_2_0=ruleLogicalAndExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLogicalAndExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"LogicalAndExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLogicalAndExpression


    // $ANTLR start entryRuleOrExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3445:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3446:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3447:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression6043);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression6053); if (failed) return current;

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
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3454:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3459:6: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3460:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3460:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3460:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3460:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3461:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3461:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3462:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleOrExpression6099);
            lv_leftExpr_0_0=ruleXorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"XorExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3484:2: ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3484:4: '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleOrExpression6110); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3488:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3489:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3489:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3490:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleOrExpression6131);
                    lv_rightExpr_2_0=ruleOrExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"OrExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleXorExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3520:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3521:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3522:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getXorExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_entryRuleXorExpression6169);
            iv_ruleXorExpression=ruleXorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXorExpression6179); if (failed) return current;

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
    // $ANTLR end entryRuleXorExpression


    // $ANTLR start ruleXorExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3529:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3534:6: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3535:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3535:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3535:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3535:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3536:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3536:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3537:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleXorExpression6225);
            lv_leftExpr_0_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getXorExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"AndExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3559:2: ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3559:4: '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleXorExpression6236); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3563:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3564:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3564:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3565:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleXorExpression6257);
                    lv_rightExpr_2_0=ruleXorExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getXorExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"XorExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleXorExpression


    // $ANTLR start entryRuleAndExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3595:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3596:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3597:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression6295);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression6305); if (failed) return current;

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
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3604:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3609:6: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3611:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3611:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3612:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleAndExpression6351);
            lv_leftExpr_0_0=ruleShiftExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"ShiftExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3634:2: ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3634:4: '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleAndExpression6362); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3638:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3639:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3639:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3640:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleAndExpression6383);
                    lv_rightExpr_2_0=ruleAndExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"AndExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleShiftExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3670:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3671:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3672:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShiftExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6421);
            iv_ruleShiftExpression=ruleShiftExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShiftExpression6431); if (failed) return current;

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
    // $ANTLR end entryRuleShiftExpression


    // $ANTLR start ruleShiftExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3679:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3684:6: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3685:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3686:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3686:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3687:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6477);
            lv_leftExpr_0_0=ruleAdditiveExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getShiftExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"AdditiveExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3709:2: ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_SHIFTOPERATION) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3709:3: ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3709:3: ( (lv_op_1_0= RULE_SHIFTOPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3710:1: (lv_op_1_0= RULE_SHIFTOPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3710:1: (lv_op_1_0= RULE_SHIFTOPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3711:3: lv_op_1_0= RULE_SHIFTOPERATION
                    {
                    lv_op_1_0=(Token)input.LT(1);
                    match(input,RULE_SHIFTOPERATION,FollowSets000.FOLLOW_RULE_SHIFTOPERATION_in_ruleShiftExpression6495); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getShiftExpressionAccess().getOpShiftOperationTerminalRuleCall_1_0_0(), "op"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getShiftExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"ShiftOperation", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3733:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3734:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3735:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleShiftExpression6521);
                    lv_rightExpr_2_0=ruleShiftExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getShiftExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"ShiftExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleShiftExpression


    // $ANTLR start entryRuleAdditiveExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3765:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3766:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3767:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditiveExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6559);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression6569); if (failed) return current;

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
    // $ANTLR end entryRuleAdditiveExpression


    // $ANTLR start ruleAdditiveExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3774:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3779:6: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3780:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3780:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3780:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3780:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3781:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3781:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3782:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6615);
            lv_leftExpr_0_0=ruleMulExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAdditiveExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"MulExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3804:2: ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ADDITIVEOPERATION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3804:3: ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3804:3: ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3805:1: (lv_op_1_0= RULE_ADDITIVEOPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3805:1: (lv_op_1_0= RULE_ADDITIVEOPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3806:3: lv_op_1_0= RULE_ADDITIVEOPERATION
                    {
                    lv_op_1_0=(Token)input.LT(1);
                    match(input,RULE_ADDITIVEOPERATION,FollowSets000.FOLLOW_RULE_ADDITIVEOPERATION_in_ruleAdditiveExpression6633); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAdditiveExpressionAccess().getOpAdditiveOperationTerminalRuleCall_1_0_0(), "op"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAdditiveExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"AdditiveOperation", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3828:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3829:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3829:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3830:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6659);
                    lv_rightExpr_2_0=ruleAdditiveExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAdditiveExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"AdditiveExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAdditiveExpression


    // $ANTLR start entryRuleMulExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3860:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3861:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3862:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_entryRuleMulExpression6697);
            iv_ruleMulExpression=ruleMulExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMulExpression6707); if (failed) return current;

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
    // $ANTLR end entryRuleMulExpression


    // $ANTLR start ruleMulExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3869:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3874:6: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3875:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3875:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3875:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3875:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3876:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3876:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3877:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleMulExpression6753);
            lv_leftExpr_0_0=ruleCastExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMulExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftExpr",
              	        		lv_leftExpr_0_0, 
              	        		"CastExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3899:2: ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_MULOPERATION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3899:3: ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3899:3: ( (lv_op_1_0= RULE_MULOPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3900:1: (lv_op_1_0= RULE_MULOPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3900:1: (lv_op_1_0= RULE_MULOPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3901:3: lv_op_1_0= RULE_MULOPERATION
                    {
                    lv_op_1_0=(Token)input.LT(1);
                    match(input,RULE_MULOPERATION,FollowSets000.FOLLOW_RULE_MULOPERATION_in_ruleMulExpression6771); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getMulExpressionAccess().getOpMulOperationTerminalRuleCall_1_0_0(), "op"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMulExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"MulOperation", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3923:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3924:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3924:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3925:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleMulExpression6797);
                    lv_rightExpr_2_0=ruleMulExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMulExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightExpr",
                      	        		lv_rightExpr_2_0, 
                      	        		"MulExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMulExpression


    // $ANTLR start entryRuleCastExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3955:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3956:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3957:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCastExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_entryRuleCastExpression6835);
            iv_ruleCastExpression=ruleCastExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCastExpression6845); if (failed) return current;

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
    // $ANTLR end entryRuleCastExpression


    // $ANTLR start ruleCastExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3964:1: ruleCastExpression returns [EObject current=null] : ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3969:6: ( ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_ADDITIVEOPERATION:
                case RULE_INT:
                case RULE_UNARYOPERATION:
                case 31:
                case 35:
                    {
                    alt54=2;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ADDITIVEOPERATION:
                    case RULE_SHIFTOPERATION:
                    case RULE_MULOPERATION:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                        {
                        alt54=2;
                        }
                        break;
                    case 32:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_SHIFTOPERATION:
                        case RULE_MULOPERATION:
                        case 18:
                        case 20:
                        case 21:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 32:
                        case 34:
                        case 36:
                        case 41:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                            {
                            alt54=2;
                            }
                            break;
                        case RULE_ADDITIVEOPERATION:
                            {
                            int LA54_6 = input.LA(5);

                            if ( (LA54_6==RULE_INT) ) {
                                int LA54_7 = input.LA(6);

                                if ( (synpred64()) ) {
                                    alt54=1;
                                }
                                else if ( (true) ) {
                                    alt54=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 54, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA54_6>=RULE_ID && LA54_6<=RULE_STRING)||LA54_6==RULE_ADDITIVEOPERATION||LA54_6==RULE_UNARYOPERATION||LA54_6==31||LA54_6==35) ) {
                                alt54=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 54, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_UNARYOPERATION:
                        case 31:
                        case 35:
                            {
                            alt54=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 54, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 35:
                        {
                        alt54=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 54, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 24:
                case 25:
                case 27:
                case 39:
                case 51:
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
                    {
                    alt54=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 54, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||(LA54_0>=RULE_ADDITIVEOPERATION && LA54_0<=RULE_INT)||LA54_0==RULE_UNARYOPERATION||LA54_0==35) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3970:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:2: ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:2: ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:4: '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleCastExpression6881); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3974:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3975:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3975:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3976:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6902);
                    lv_type_1_0=ruleQualifiedTypeSpecification();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCastExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_1_0, 
                      	        		"QualifiedTypeSpecification", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleCastExpression6912); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4002:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4003:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4003:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4004:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleCastExpression6933);
                    lv_expr_3_0=ruleCastExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCastExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_3_0, 
                      	        		"CastExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4027:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4027:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4028:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4028:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4029:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleCastExpression6961);
                    lv_unaryExpr_4_0=ruleUnaryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCastExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"unaryExpr",
                      	        		lv_unaryExpr_4_0, 
                      	        		"UnaryExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCastExpression


    // $ANTLR start entryRuleUnaryExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4059:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4060:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4061:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6997);
            iv_ruleUnaryExpression=ruleUnaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression7007); if (failed) return current;

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
    // $ANTLR end entryRuleUnaryExpression


    // $ANTLR start ruleUnaryExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4068:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unaryExpr_0_0=null;
        EObject lv_primaryExpr_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4073:6: ( ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4074:1: ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4074:1: ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4074:2: ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4074:2: ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_UNARYOPERATION) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4075:1: (lv_unaryExpr_0_0= RULE_UNARYOPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4075:1: (lv_unaryExpr_0_0= RULE_UNARYOPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4076:3: lv_unaryExpr_0_0= RULE_UNARYOPERATION
                    {
                    lv_unaryExpr_0_0=(Token)input.LT(1);
                    match(input,RULE_UNARYOPERATION,FollowSets000.FOLLOW_RULE_UNARYOPERATION_in_ruleUnaryExpression7049); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getUnaryExpressionAccess().getUnaryExprUnaryOperationTerminalRuleCall_0_0(), "unaryExpr"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"unaryExpr",
                      	        		lv_unaryExpr_0_0, 
                      	        		"UnaryOperation", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4098:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4099:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4099:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4100:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression7076);
            lv_primaryExpr_1_0=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"primaryExpr",
              	        		lv_primaryExpr_1_0, 
              	        		"PrimaryExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUnaryExpression


    // $ANTLR start entryRulePrimaryExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4130:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4131:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4132:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7112);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression7122); if (failed) return current;

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
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4139:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4144:6: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4145:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4145:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||(LA56_0>=RULE_ADDITIVEOPERATION && LA56_0<=RULE_INT)||LA56_0==35) ) {
                alt56=1;
            }
            else if ( (LA56_0==31) ) {
                alt56=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4145:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4145:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4145:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4146:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4146:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4147:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression7168);
                    lv_literal_0_0=ruleLiteral();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"literal",
                      	        		lv_literal_0_0, 
                      	        		"Literal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4170:6: ( '(' this_ConstantExpression_2= ruleConstantExpression ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4170:6: ( '(' this_ConstantExpression_2= ruleConstantExpression ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4170:8: '(' this_ConstantExpression_2= ruleConstantExpression ')'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rulePrimaryExpression7185); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_rulePrimaryExpression7210);
                    this_ConstantExpression_2=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,32,FollowSets000.FOLLOW_32_in_rulePrimaryExpression7219); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start entryRuleLiteral
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4198:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4199:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4200:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral7256);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral7266); if (failed) return current;

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
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4207:1: ruleLiteral returns [EObject current=null] : ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4212:6: ( ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4213:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4213:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA57_1 = input.LA(2);

                if ( (synpred67()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4213:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt57=2;
                }
                break;
            case RULE_ADDITIVEOPERATION:
            case RULE_INT:
            case 35:
                {
                alt57=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4213:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4213:2: RULE_ID
                    {
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral7300); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4218:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral7314); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4223:6: ruleFloatingPointLiteral
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7328);
                    ruleFloatingPointLiteral();
                    _fsp--;
                    if (failed) return current;

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4224:6: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4224:6: ( ( RULE_ID ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4225:1: ( RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4225:1: ( RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4226:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getLiteralRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral7348); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getLiteralAccess().getRefConstantDefinitionCrossReference_3_0(), "ref"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleFloatingPointLiteral
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4249:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4250:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4251:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatingPointLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7385);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatingPointLiteral7396); if (failed) return current;

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
    // $ANTLR end entryRuleFloatingPointLiteral


    // $ANTLR start ruleFloatingPointLiteral
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4258:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FDsymbol_4=null;
        Token this_FDsymbol_8=null;
        Token this_FDsymbol_11=null;
        Token this_FDsymbol_14=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;

        AntlrDatatypeRuleToken this_signedINT_6 = null;

        AntlrDatatypeRuleToken this_Exponent_7 = null;

        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;

        AntlrDatatypeRuleToken this_signedINT_12 = null;

        AntlrDatatypeRuleToken this_Exponent_13 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4263:6: ( ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )
            int alt70=4;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:3: (this_signedINT_0= rulesignedINT )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_ADDITIVEOPERATION && LA58_0<=RULE_INT)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4265:5: this_signedINT_0= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_0(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7445);
                    	    this_signedINT_0=rulesignedINT();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_signedINT_0);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode = currentNode.getParent();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    kw=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleFloatingPointLiteral7465); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4281:1: (this_signedINT_2= rulesignedINT )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ADDITIVEOPERATION) ) {
                            int LA59_2 = input.LA(2);

                            if ( (LA59_2==RULE_INT) ) {
                                int LA59_4 = input.LA(3);

                                if ( (synpred71()) ) {
                                    alt59=1;
                                }


                            }


                        }
                        else if ( (LA59_0==RULE_INT) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4282:5: this_signedINT_2= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7488);
                    	    this_signedINT_2=rulesignedINT();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_signedINT_2);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode = currentNode.getParent();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4292:3: (this_Exponent_3= ruleExponent )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=49 && LA60_0<=50)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4293:5: this_Exponent_3= ruleExponent
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_0_3(), currentNode); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7518);
                            this_Exponent_3=ruleExponent();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_Exponent_3);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                      currentNode = currentNode.getParent();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4303:3: (this_FDsymbol_4= RULE_FDSYMBOL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_FDSYMBOL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4303:8: this_FDsymbol_4= RULE_FDSYMBOL
                            {
                            this_FDsymbol_4=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7541); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_FDsymbol_4);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFDsymbolTerminalRuleCall_0_4(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4311:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4311:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4312:2: kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleFloatingPointLiteral7569); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4317:1: (this_signedINT_6= rulesignedINT )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ADDITIVEOPERATION) ) {
                            int LA62_2 = input.LA(2);

                            if ( (LA62_2==RULE_INT) ) {
                                int LA62_4 = input.LA(3);

                                if ( (synpred75()) ) {
                                    alt62=1;
                                }


                            }


                        }
                        else if ( (LA62_0==RULE_INT) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4318:5: this_signedINT_6= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7592);
                    	    this_signedINT_6=rulesignedINT();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_signedINT_6);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode = currentNode.getParent();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4328:3: (this_Exponent_7= ruleExponent )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=49 && LA63_0<=50)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4329:5: this_Exponent_7= ruleExponent
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_1_2(), currentNode); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7622);
                            this_Exponent_7=ruleExponent();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_Exponent_7);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                      currentNode = currentNode.getParent();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4339:3: (this_FDsymbol_8= RULE_FDSYMBOL )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_FDSYMBOL) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4339:8: this_FDsymbol_8= RULE_FDSYMBOL
                            {
                            this_FDsymbol_8=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7645); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_FDsymbol_8);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFDsymbolTerminalRuleCall_1_3(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:7: (this_signedINT_9= rulesignedINT )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=RULE_ADDITIVEOPERATION && LA65_0<=RULE_INT)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4348:5: this_signedINT_9= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7683);
                    	    this_signedINT_9=rulesignedINT();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_signedINT_9);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode = currentNode.getParent();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7712);
                    this_Exponent_10=ruleExponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4369:1: (this_FDsymbol_11= RULE_FDSYMBOL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_FDSYMBOL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4369:6: this_FDsymbol_11= RULE_FDSYMBOL
                            {
                            this_FDsymbol_11=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7733); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_FDsymbol_11);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFDsymbolTerminalRuleCall_2_2(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4377:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4377:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4377:7: (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4377:7: (this_signedINT_12= rulesignedINT )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ADDITIVEOPERATION) ) {
                            int LA67_2 = input.LA(2);

                            if ( (synpred82()) ) {
                                alt67=1;
                            }


                        }
                        else if ( (LA67_0==RULE_INT) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4378:5: this_signedINT_12= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7771);
                    	    this_signedINT_12=rulesignedINT();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_signedINT_12);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode = currentNode.getParent();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4388:3: (this_Exponent_13= ruleExponent )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=49 && LA68_0<=50)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4389:5: this_Exponent_13= ruleExponent
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_3_1(), currentNode); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7801);
                            this_Exponent_13=ruleExponent();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_Exponent_13);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                      currentNode = currentNode.getParent();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4399:3: (this_FDsymbol_14= RULE_FDSYMBOL )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_FDSYMBOL) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4399:8: this_FDsymbol_14= RULE_FDSYMBOL
                            {
                            this_FDsymbol_14=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7824); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_FDsymbol_14);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFDsymbolTerminalRuleCall_3_2(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFloatingPointLiteral


    // $ANTLR start entryRuleExponent
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4414:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4415:2: (iv_ruleExponent= ruleExponent EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4416:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExponentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_entryRuleExponent7873);
            iv_ruleExponent=ruleExponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExponent7884); if (failed) return current;

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
    // $ANTLR end entryRuleExponent


    // $ANTLR start ruleExponent
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4423:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_AdditiveOperation_2=null;
        Token this_INT_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4428:6: ( ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4429:1: ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4429:1: ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4429:2: (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4429:2: (kw= 'e' | kw= 'E' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==49) ) {
                alt71=1;
            }
            else if ( (LA71_0==50) ) {
                alt71=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4429:2: (kw= 'e' | kw= 'E' )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4430:2: kw= 'e'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleExponent7923); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getExponentAccess().getEKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4437:2: kw= 'E'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleExponent7942); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getExponentAccess().getEKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4442:2: (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ADDITIVEOPERATION) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4442:7: this_AdditiveOperation_2= RULE_ADDITIVEOPERATION
                    {
                    this_AdditiveOperation_2=(Token)input.LT(1);
                    match(input,RULE_ADDITIVEOPERATION,FollowSets000.FOLLOW_RULE_ADDITIVEOPERATION_in_ruleExponent7959); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_AdditiveOperation_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getExponentAccess().getAdditiveOperationTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4449:3: (this_INT_3= RULE_INT )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_INT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4449:8: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)input.LT(1);
            	    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExponent7982); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getExponentAccess().getINTTerminalRuleCall_2(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExponent


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4464:1: ruleTypeQualifier returns [Enumerator current=null] : ( ( 'const' ) | ( 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4468:6: ( ( ( 'const' ) | ( 'volatile' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4469:1: ( ( 'const' ) | ( 'volatile' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4469:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==51) ) {
                alt74=1;
            }
            else if ( (LA74_0==52) ) {
                alt74=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4469:1: ( ( 'const' ) | ( 'volatile' ) )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4469:2: ( 'const' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4469:2: ( 'const' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4469:4: 'const'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeQualifier8041); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4475:6: ( 'volatile' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4475:6: ( 'volatile' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4475:8: 'volatile'
                    {
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeQualifier8056); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeQualifier


    // $ANTLR start ruleTypeSpecifier
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4485:1: ruleTypeSpecifier returns [Enumerator current=null] : ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4489:6: ( ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4490:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4490:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt75=20;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt75=1;
                }
                break;
            case 53:
                {
                alt75=2;
                }
                break;
            case 54:
                {
                alt75=3;
                }
                break;
            case 55:
                {
                alt75=4;
                }
                break;
            case 56:
                {
                alt75=5;
                }
                break;
            case 57:
                {
                alt75=6;
                }
                break;
            case 58:
                {
                alt75=7;
                }
                break;
            case 59:
                {
                alt75=8;
                }
                break;
            case 60:
                {
                alt75=9;
                }
                break;
            case 61:
                {
                alt75=10;
                }
                break;
            case 62:
                {
                alt75=11;
                }
                break;
            case 63:
                {
                alt75=12;
                }
                break;
            case 64:
                {
                alt75=13;
                }
                break;
            case 65:
                {
                alt75=14;
                }
                break;
            case 66:
                {
                alt75=15;
                }
                break;
            case 67:
                {
                alt75=16;
                }
                break;
            case 68:
                {
                alt75=17;
                }
                break;
            case 69:
                {
                alt75=18;
                }
                break;
            case 70:
                {
                alt75=19;
                }
                break;
            case 71:
                {
                alt75=20;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4490:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4490:2: ( 'void' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4490:2: ( 'void' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4490:4: 'void'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleTypeSpecifier8099); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4496:6: ( 'char' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4496:6: ( 'char' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4496:8: 'char'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeSpecifier8114); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4502:6: ( 'short' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4502:6: ( 'short' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4502:8: 'short'
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleTypeSpecifier8129); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4508:6: ( 'int' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4508:6: ( 'int' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4508:8: 'int'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleTypeSpecifier8144); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4514:6: ( 'long' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4514:6: ( 'long' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4514:8: 'long'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleTypeSpecifier8159); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4520:6: ( 'float' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4520:6: ( 'float' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4520:8: 'float'
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleTypeSpecifier8174); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4526:6: ( 'double' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4526:6: ( 'double' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4526:8: 'double'
                    {
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeSpecifier8189); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4532:6: ( 'signed' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4532:6: ( 'signed' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4532:8: 'signed'
                    {
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleTypeSpecifier8204); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4538:6: ( 'unsigned' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4538:6: ( 'unsigned' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4538:8: 'unsigned'
                    {
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeSpecifier8219); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4544:6: ( 'string' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4544:6: ( 'string' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4544:8: 'string'
                    {
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeSpecifier8234); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4550:6: ( 'int8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4550:6: ( 'int8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4550:8: 'int8_t'
                    {
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeSpecifier8249); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10(), null); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4556:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4556:6: ( 'uint8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4556:8: 'uint8_t'
                    {
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeSpecifier8264); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4562:6: ( 'int16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4562:6: ( 'int16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4562:8: 'int16_t'
                    {
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeSpecifier8279); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12(), null); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4568:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4568:6: ( 'uint16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4568:8: 'uint16_t'
                    {
                    match(input,65,FollowSets000.FOLLOW_65_in_ruleTypeSpecifier8294); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4574:6: ( 'int32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4574:6: ( 'int32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4574:8: 'int32_t'
                    {
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleTypeSpecifier8309); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14(), null); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4580:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4580:6: ( 'uint32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4580:8: 'uint32_t'
                    {
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleTypeSpecifier8324); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15(), null); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4586:6: ( 'int64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4586:6: ( 'int64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4586:8: 'int64_t'
                    {
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleTypeSpecifier8339); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16(), null); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4592:6: ( 'uint64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4592:6: ( 'uint64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4592:8: 'uint64_t'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleTypeSpecifier8354); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4598:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4598:6: ( 'intptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4598:8: 'intptr_t'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleTypeSpecifier8369); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18(), null); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4604:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4604:6: ( 'uintptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4604:8: 'uintptr_t'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleTypeSpecifier8384); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeSpecifier


    // $ANTLR start ruleParameterQualifier
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4614:1: ruleParameterQualifier returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4618:6: ( ( ( 'in' ) | ( 'out' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4619:1: ( ( 'in' ) | ( 'out' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4619:1: ( ( 'in' ) | ( 'out' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==72) ) {
                alt76=1;
            }
            else if ( (LA76_0==73) ) {
                alt76=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4619:1: ( ( 'in' ) | ( 'out' ) )", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4619:2: ( 'in' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4619:2: ( 'in' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4619:4: 'in'
                    {
                    match(input,72,FollowSets000.FOLLOW_72_in_ruleParameterQualifier8427); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4625:6: ( 'out' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4625:6: ( 'out' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4625:8: 'out'
                    {
                    match(input,73,FollowSets000.FOLLOW_73_in_ruleParameterQualifier8442); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleParameterQualifier

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:3: ( ( '(' ( 'void' )? ')' ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:3: ( '(' ( 'void' )? ')' )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:3: ( '(' ( 'void' )? ')' )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2331:5: '(' ( 'void' )? ')'
        {
        match(input,31,FollowSets000.FOLLOW_31_in_synpred364019); if (failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2335:1: ( 'void' )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==39) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2335:3: 'void'
                {
                match(input,39,FollowSets000.FOLLOW_39_in_synpred364030); if (failed) return ;

                }
                break;

        }

        match(input,32,FollowSets000.FOLLOW_32_in_synpred364042); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:3: ( ( ( ruleDeclarator ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:3: ( ( ruleDeclarator ) )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:3: ( ( ruleDeclarator ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2559:1: ( ruleDeclarator )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2559:1: ( ruleDeclarator )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2560:3: ruleDeclarator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_synpred404409);
        ruleDeclarator();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:2: ( ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:2: ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:2: ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3970:4: '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) )
        {
        match(input,31,FollowSets000.FOLLOW_31_in_synpred646881); if (failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3974:1: ( ( ruleQualifiedTypeSpecification ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3975:1: ( ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3975:1: ( ruleQualifiedTypeSpecification )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3976:3: ruleQualifiedTypeSpecification
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_synpred646902);
        ruleQualifiedTypeSpecification();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,32,FollowSets000.FOLLOW_32_in_synpred646912); if (failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4002:1: ( ( ruleCastExpression ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4003:1: ( ruleCastExpression )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4003:1: ( ruleCastExpression )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4004:3: ruleCastExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_synpred646933);
        ruleCastExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4213:2: ( RULE_ID )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4213:2: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred677300); if (failed) return ;

        }
    }
    // $ANTLR end synpred67

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4282:5: ( rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4282:5: rulesignedINT
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred717488);
        rulesignedINT();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred71

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:2: ( ( ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:2: ( ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:2: ( ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:3: ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4264:3: ( rulesignedINT )+
        int cnt80=0;
        loop80:
        do {
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_ADDITIVEOPERATION && LA80_0<=RULE_INT)) ) {
                alt80=1;
            }


            switch (alt80) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4265:5: rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred747445);
        	    rulesignedINT();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt80 >= 1 ) break loop80;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(80, input);
                    throw eee;
            }
            cnt80++;
        } while (true);

        match(input,35,FollowSets000.FOLLOW_35_in_synpred747465); if (failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4281:1: ( rulesignedINT )*
        loop81:
        do {
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_ADDITIVEOPERATION && LA81_0<=RULE_INT)) ) {
                alt81=1;
            }


            switch (alt81) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4282:5: rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred747488);
        	    rulesignedINT();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop81;
            }
        } while (true);

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4292:3: ( ruleExponent )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( ((LA82_0>=49 && LA82_0<=50)) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4293:5: ruleExponent
                {
                pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred747518);
                ruleExponent();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4303:3: ( RULE_FDSYMBOL )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_FDSYMBOL) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4303:8: RULE_FDSYMBOL
                {
                match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred747541); if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4318:5: ( rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4318:5: rulesignedINT
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred757592);
        rulesignedINT();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:6: ( ( ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:6: ( ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:6: ( ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:7: ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4347:7: ( rulesignedINT )+
        int cnt87=0;
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_ADDITIVEOPERATION && LA87_0<=RULE_INT)) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4348:5: rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred817683);
        	    rulesignedINT();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt87 >= 1 ) break loop87;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(87, input);
                    throw eee;
            }
            cnt87++;
        } while (true);

        pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred817712);
        ruleExponent();
        _fsp--;
        if (failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4369:1: ( RULE_FDSYMBOL )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_FDSYMBOL) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4369:6: RULE_FDSYMBOL
                {
                match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred817733); if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4378:5: ( rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:4378:5: rulesignedINT
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred827771);
        rulesignedINT();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    public final boolean synpred71() {
        backtracking++;
        int start = input.mark();
        try {
            synpred71_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred81() {
        backtracking++;
        int start = input.mark();
        try {
            synpred81_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred74() {
        backtracking++;
        int start = input.mark();
        try {
            synpred74_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred75() {
        backtracking++;
        int start = input.mark();
        try {
            synpred75_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred67() {
        backtracking++;
        int start = input.mark();
        try {
            synpred67_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred64() {
        backtracking++;
        int start = input.mark();
        try {
            synpred64_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA70_eotS =
        "\15\uffff";
    static final String DFA70_eofS =
        "\2\uffff\1\10\12\uffff";
    static final String DFA70_minS =
        "\1\10\1\11\1\10\1\uffff\2\10\1\0\2\uffff\1\11\1\0\2\uffff";
    static final String DFA70_maxS =
        "\1\43\1\11\1\62\1\uffff\2\11\1\0\2\uffff\1\11\1\0\2\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\1\4\2\uffff\2\3";
    static final String DFA70_specialS =
        "\6\uffff\1\1\3\uffff\1\0\2\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\2\31\uffff\1\3",
            "\1\2",
            "\1\6\1\2\2\10\1\uffff\1\10\4\uffff\1\10\1\uffff\2\10\1\uffff"+
            "\3\10\1\uffff\2\10\3\uffff\1\10\1\uffff\1\10\1\7\1\10\4\uffff"+
            "\1\10\2\uffff\5\10\1\4\1\5",
            "",
            "\1\11\1\12",
            "\1\11\1\12",
            "\1\uffff",
            "",
            "",
            "\1\12",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4264:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred81()) ) {s = 12;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 7;}

                        else if ( (synpred81()) ) {s = 11;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile158 = new BitSet(new long[]{0x000002100B240000L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile179 = new BitSet(new long[]{0x000002100B240000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile202 = new BitSet(new long[]{0x000000100B240000L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile229 = new BitSet(new long[]{0x000000100B240000L});
        public static final BitSet FOLLOW_18_in_ruleIdtFile241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin277 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleConstantDefinitionBegin322 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition443 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition473 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition503 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTypeDefinition513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTypedefSpecification594 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification615 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification728 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefName_in_ruleTypeSpecification842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification929 = new BitSet(new long[]{0xFFE0008000000002L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1249 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1266 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStructOrUnionDefinition1282 = new BitSet(new long[]{0xFFF804800B800010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1303 = new BitSet(new long[]{0xFFF804800B800010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_23_in_ruleStructOrUnionDefinition1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1406 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleStructOrUnion1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleStructOrUnion1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1573 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleStructMember1629 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1650 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1671 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleStructMember1682 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1703 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStructMember1715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1876 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumDefinition1921 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1938 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEnumDefinition1954 = new BitSet(new long[]{0x0000040000000010L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1975 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumDefinition1985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference2021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumReference2066 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2184 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEnumMemberList2194 = new BitSet(new long[]{0x0000040000000010L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2215 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleEnumMember2309 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2326 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumMember2342 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2457 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleDeclarators2468 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2489 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleDeclarator2583 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleAbstractDeclarator2696 = new BitSet(new long[]{0x0000000280000002L});
        public static final BitSet FOLLOW_ruleAbstractDirectDeclarator_in_ruleAbstractDeclarator2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePointerSpecification2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_rulePointerSpecification2822 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification2859 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualified_PointerSpecification2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleQualified_PointerSpecification2916 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualified_PointerSpecification2937 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator3027 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_31_in_ruleDirectDeclarator3049 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator3070 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDirectDeclarator3080 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator3103 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleAbstractDirectDeclarator_in_entryRuleAbstractDirectDeclarator3140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDirectDeclarator3150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAbstractDirectDeclarator3186 = new BitSet(new long[]{0x00000003C0000000L});
        public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleAbstractDirectDeclarator3207 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAbstractDirectDeclarator3217 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3238 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3267 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArraySpecification3349 = new BitSet(new long[]{0x0000000C80001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification3370 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleArraySpecification3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName3418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName3429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3469 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleFullyQualifiedName3488 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3503 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleConstantDefinition3595 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3612 = new BitSet(new long[]{0x0000000880001332L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleInterfaceDefinition3731 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleInterfaceDefinition3741 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_38_in_ruleInterfaceDefinition3752 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3775 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceDefinition3786 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3807 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInterfaceDefinition3819 = new BitSet(new long[]{0xFFF804800B800010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3840 = new BitSet(new long[]{0xFFF804800B800010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_23_in_ruleInterfaceDefinition3851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3887 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleMethodDefinition3943 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3964 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3985 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition4002 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMethodDefinition4019 = new BitSet(new long[]{0x0000008100000000L});
        public static final BitSet FOLLOW_39_in_ruleMethodDefinition4030 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMethodDefinition4042 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_31_in_ruleMethodDefinition4060 = new BitSet(new long[]{0xFFF804800B000010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition4081 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMethodDefinition4091 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMethodDefinition4103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList4139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterList4149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4195 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList4206 = new BitSet(new long[]{0xFFF804800B000010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4227 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList4240 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleParameterList4250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleParameter4344 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter4365 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4387 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleParameter4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective4483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleIncludeDirective4518 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective4564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations4606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations4616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotations4674 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation4756 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleAnnotation4777 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleAnnotationParameters_in_ruleAnnotation4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters4835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationParameters4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAnnotationParameters4892 = new BitSet(new long[]{0x00000C01004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_ruleAnnotationParameters4914 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationParameters4941 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAnnotationParameters4953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs4989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePairs4999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs5045 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleAnnotationValuePairs5056 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs5077 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair5115 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair5125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair5167 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationValuePair5182 = new BitSet(new long[]{0x00000C00004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair5203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue5239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue5249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue5283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAnnotationValue5291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValue5320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationValue5350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotationValue5394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayAnnotationValue5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleArrayAnnotationValue5474 = new BitSet(new long[]{0x00000C0000C003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5496 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_28_in_ruleArrayAnnotationValue5507 = new BitSet(new long[]{0x00000C00004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5528 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_23_in_ruleArrayAnnotationValue5542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT5579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT5590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ADDITIVEOPERATION_in_rulesignedINT5631 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT5653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression5708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5847 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleLogicalOrExpression5858 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5973 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleLogicalAndExpression5984 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression6005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression6043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression6053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression6099 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleOrExpression6110 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression6131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression6169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression6179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression6225 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleXorExpression6236 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression6257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression6295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression6305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression6351 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAndExpression6362 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression6383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression6431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6477 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_SHIFTOPERATION_in_ruleShiftExpression6495 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression6521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6615 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_ADDITIVEOPERATION_in_ruleAdditiveExpression6633 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression6697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression6707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression6753 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_RULE_MULOPERATION_in_ruleMulExpression6771 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression6797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression6835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression6845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCastExpression6881 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6902 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCastExpression6912 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression7007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UNARYOPERATION_in_ruleUnaryExpression7049 = new BitSet(new long[]{0x0000000880000330L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression7076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression7122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression7168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulePrimaryExpression7185 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression7210 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePrimaryExpression7219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral7314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral7396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7445 = new BitSet(new long[]{0x0000000800000300L});
        public static final BitSet FOLLOW_35_in_ruleFloatingPointLiteral7465 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7488 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7518 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFloatingPointLiteral7569 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7592 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7622 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7683 = new BitSet(new long[]{0x0006000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7712 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7771 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7801 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExponent_in_entryRuleExponent7873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExponent7884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleExponent7923 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_50_in_ruleExponent7942 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_RULE_ADDITIVEOPERATION_in_ruleExponent7959 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExponent7982 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_51_in_ruleTypeQualifier8041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypeQualifier8056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleTypeSpecifier8099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeSpecifier8114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypeSpecifier8129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTypeSpecifier8144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypeSpecifier8159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTypeSpecifier8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTypeSpecifier8189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTypeSpecifier8204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeSpecifier8219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeSpecifier8234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeSpecifier8249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeSpecifier8264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTypeSpecifier8279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTypeSpecifier8294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTypeSpecifier8309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTypeSpecifier8324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTypeSpecifier8339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTypeSpecifier8354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTypeSpecifier8369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTypeSpecifier8384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleParameterQualifier8427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleParameterQualifier8442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_synpred364019 = new BitSet(new long[]{0x0000008100000000L});
        public static final BitSet FOLLOW_39_in_synpred364030 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_synpred364042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_synpred404409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_synpred646881 = new BitSet(new long[]{0xFFF800800B000010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred646902 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_synpred646912 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_synpred646933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred677300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred717488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred747445 = new BitSet(new long[]{0x0000000800000300L});
        public static final BitSet FOLLOW_35_in_synpred747465 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred747488 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred747518 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred747541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred757592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred817683 = new BitSet(new long[]{0x0006000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred817712 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred817733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred827771 = new BitSet(new long[]{0x0000000000000002L});
    }


}