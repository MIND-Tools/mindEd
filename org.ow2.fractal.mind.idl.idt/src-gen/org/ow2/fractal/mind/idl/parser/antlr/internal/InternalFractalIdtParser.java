package org.ow2.fractal.mind.idl.parser.antlr.internal; 

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
import org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalFractalIdtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDELIB", "RULE_BOOLEAN", "RULE_INT", "RULE_EXPONENT", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#ifndef'", "'#endif'", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'@'", "'null'", "'+'", "'-'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'/'", "'%'", "'~'", "'!'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_INCLUDELIB=6;
    public static final int RULE_FDSYMBOL=10;
    public static final int RULE_EXPONENT=9;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=8;
    public static final int RULE_WS=13;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;

        public InternalFractalIdtParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[228+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g"; }



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
        	return classLoader.getResourceAsStream("org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.tokens");
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:84:1: entryRuleIdtFile returns [EObject current=null] : iv_ruleIdtFile= ruleIdtFile EOF ;
    public final EObject entryRuleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdtFile = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:85:2: (iv_ruleIdtFile= ruleIdtFile EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:86:2: iv_ruleIdtFile= ruleIdtFile EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIdtFileRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIdtFile_in_entryRuleIdtFile81);
            iv_ruleIdtFile=ruleIdtFile();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIdtFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdtFile91); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:93:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject lv_begindef_0_0 = null;

        EObject lv_def_1_0 = null;

        EObject lv_includes_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_enddef_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:98:6: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:99:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:99:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:99:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:99:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:100:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:100:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:101:3: lv_begindef_0_0= ruleConstantDefinitionBegin
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:123:2: ( (lv_def_1_0= ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_def_1_0= ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_def_1_0= ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:125:3: lv_def_1_0= ruleConstantDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantDefinition_in_ruleIdtFile158);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:147:2: ( (lv_includes_2_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:148:1: (lv_includes_2_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:148:1: (lv_includes_2_0= ruleIncludeDirective )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:149:3: lv_includes_2_0= ruleIncludeDirective
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIncludeDirective_in_ruleIdtFile179);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:171:3: ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==33) ) {
                    alt2=1;
                }
                else if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=22)||LA2_0==24) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:171:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:171:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:172:1: (lv_constant_3_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:172:1: (lv_constant_3_0= ruleConstantDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:173:3: lv_constant_3_0= ruleConstantDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleIdtFile202);
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
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:196:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:196:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:197:1: (lv_type_4_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:197:1: (lv_type_4_0= ruleTypeDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:198:3: lv_type_4_0= ruleTypeDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleIdtFile229);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:220:4: ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:221:1: (lv_enddef_5_0= ruleConstantDefinitionEnd )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:221:1: (lv_enddef_5_0= ruleConstantDefinitionEnd )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:222:3: lv_enddef_5_0= ruleConstantDefinitionEnd
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getEnddefConstantDefinitionEndParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile252);
            lv_enddef_5_0=ruleConstantDefinitionEnd();
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
              	       			"enddef",
              	        		lv_enddef_5_0, 
              	        		"ConstantDefinitionEnd", 
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
    // $ANTLR end ruleIdtFile


    // $ANTLR start entryRuleConstantDefinitionBegin
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:252:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:253:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:254:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefinitionBeginRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin288);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantDefinitionBegin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionBegin298); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:261:1: ruleConstantDefinitionBegin returns [EObject current=null] : ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:266:6: ( ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:267:1: ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:267:1: ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:267:3: '#ifndef' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,15,FOLLOW_15_in_ruleConstantDefinitionBegin333); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:271:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:272:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:272:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:273:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin350); if (failed) return current;
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


    // $ANTLR start entryRuleConstantDefinitionEnd
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:303:1: entryRuleConstantDefinitionEnd returns [EObject current=null] : iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF ;
    public final EObject entryRuleConstantDefinitionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionEnd = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:304:2: (iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:305:2: iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefinitionEndRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd391);
            iv_ruleConstantDefinitionEnd=ruleConstantDefinitionEnd();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantDefinitionEnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionEnd401); if (failed) return current;

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
    // $ANTLR end entryRuleConstantDefinitionEnd


    // $ANTLR start ruleConstantDefinitionEnd
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:312:1: ruleConstantDefinitionEnd returns [EObject current=null] : ( '#endif' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:317:6: ( ( '#endif' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:318:1: ( '#endif' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:318:1: ( '#endif' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:318:3: '#endif' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_ruleConstantDefinitionEnd436); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:322:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:323:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:323:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:324:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinitionEnd453); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getConstantDefinitionEndAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstantDefinitionEndRule().getType().getClassifier());
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
    // $ANTLR end ruleConstantDefinitionEnd


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:356:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:357:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:358:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition496);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition506); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:365:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:370:6: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:371:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:371:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:371:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:371:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 21:
            case 22:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("371:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:372:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition557);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:385:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition587);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:398:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition617);
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

            match(input,17,FOLLOW_17_in_ruleTypeDefinition627); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:421:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:422:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:423:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification663);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification673); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:430:1: ruleTypedefSpecification returns [EObject current=null] : ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:435:6: ( ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:436:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:436:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:436:3: 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            match(input,18,FOLLOW_18_in_ruleTypedefSpecification708); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:440:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:441:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:441:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:442:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification729);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:464:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:465:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:465:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:466:3: lv_dec_2_0= ruleDeclarators
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarators_in_ruleTypedefSpecification750);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:496:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:497:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:498:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification786);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification796); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:505:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:510:6: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:511:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:511:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:511:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:511:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=54 && LA4_0<=55)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:512:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:512:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:513:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification842);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:535:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:536:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:536:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:537:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification864);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:567:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:568:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:569:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification900);
            iv_ruleTypeSpecification=ruleTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification910); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:576:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:581:6: ( ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:582:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:582:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 21:
            case 22:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 36:
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
                alt6=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("582:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:582:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:582:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:583:1: (lv_typeDefName_0_0= ruleTypedefName )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:583:1: (lv_typeDefName_0_0= ruleTypedefName )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:584:3: lv_typeDefName_0_0= ruleTypedefName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypedefName_in_ruleTypeSpecification956);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:608:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification987);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:621:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification1017);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:633:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:633:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==36||(LA5_0>=56 && LA5_0<=74)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:634:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:634:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:635:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1043);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:665:1: entryRuleTypedefName returns [String current=null] : iv_ruleTypedefName= ruleTypedefName EOF ;
    public final String entryRuleTypedefName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypedefName = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:666:2: (iv_ruleTypedefName= ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:667:2: iv_ruleTypedefName= ruleTypedefName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName1081);
            iv_ruleTypedefName=ruleTypedefName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedefName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName1092); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:674:1: ruleTypedefName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FullyQualifiedName_0= ruleFullyQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypedefName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullyQualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:679:6: (this_FullyQualifiedName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:681:5: this_FullyQualifiedName_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName1138);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:699:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:700:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:701:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1182);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1192); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:708:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:713:6: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==17||LA7_3==25||(LA7_3>=27 && LA7_3<=29)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==19) ) {
                        alt7=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==19) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==22) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==17||LA7_3==25||(LA7_3>=27 && LA7_3<=29)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==19) ) {
                        alt7=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==19) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("714:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:715:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1242);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:728:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1272);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:747:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:748:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:749:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1307);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1317); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:756:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:761:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:762:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:762:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:762:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:762:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:763:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:763:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:764:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1363);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:786:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:787:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:787:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:788:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1380); if (failed) return current;
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

            match(input,19,FOLLOW_19_in_ruleStructOrUnionDefinition1396); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:814:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=21 && LA9_0<=22)||LA9_0==24||LA9_0==36||LA9_0==39||(LA9_0>=54 && LA9_0<=74)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:815:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:815:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:816:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1417);
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

            match(input,20,FOLLOW_20_in_ruleStructOrUnionDefinition1428); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:850:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:851:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:852:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructorUnionReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1464);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference1474); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:859:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:864:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:865:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:865:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:865:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:865:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:866:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:866:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:867:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1520);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:889:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:890:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:890:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:891:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructorUnionReference1537); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:921:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:922:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:923:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1579);
            iv_ruleStructOrUnion=ruleStructOrUnion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion1590); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:930:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:935:6: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:936:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:936:1: (kw= 'struct' | kw= 'union' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("936:1: (kw= 'struct' | kw= 'union' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:937:2: kw= 'struct'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleStructOrUnion1628); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStructOrUnionAccess().getStructKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:944:2: kw= 'union'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleStructOrUnion1647); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:957:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:958:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:959:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructMemberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember1687);
            iv_ruleStructMember=ruleStructMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember1697); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:966:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_qualType_1_0 = null;

        EObject lv_dec_2_0 = null;

        EObject lv_constExpr_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:971:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:972:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:972:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:972:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:972:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:973:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:973:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:974:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotations_in_ruleStructMember1743);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:996:2: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:997:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:997:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:998:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1764);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1020:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1021:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1021:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1022:3: lv_dec_2_0= ruleDeclarators
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarators_in_ruleStructMember1785);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1044:2: ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1044:4: ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleStructMember1796); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStructMemberAccess().getColonKeyword_3_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1048:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1049:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1049:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1050:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleStructMember1817);
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

            match(input,17,FOLLOW_17_in_ruleStructMember1829); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1084:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1085:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1086:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1865);
            iv_ruleEnumSpecification=ruleEnumSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification1875); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1093:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1098:6: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1099:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1099:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==19) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==17||LA12_2==25||(LA12_2>=27 && LA12_2<=29)) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1099:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1==19) ) {
                    alt12=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1099:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1099:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1100:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1925);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1113:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumReference_in_ruleEnumSpecification1955);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1132:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1133:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1134:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1990);
            iv_ruleEnumDefinition=ruleEnumDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition2000); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1141:1: ruleEnumDefinition returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_enumMemberList_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1146:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1147:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1147:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1147:3: 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleEnumDefinition2035); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1151:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1152:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1152:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1153:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDefinition2052); if (failed) return current;
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

            match(input,19,FOLLOW_19_in_ruleEnumDefinition2068); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1179:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1180:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1180:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1181:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2089);
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

            match(input,20,FOLLOW_20_in_ruleEnumDefinition2099); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1215:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1216:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1217:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference2135);
            iv_ruleEnumReference=ruleEnumReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference2145); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1224:1: ruleEnumReference returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1229:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1230:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1230:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1230:3: 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,24,FOLLOW_24_in_ruleEnumReference2180); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1234:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1235:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1235:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1236:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumReference2197); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1266:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1267:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1268:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumMemberListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2238);
            iv_ruleEnumMemberList=ruleEnumMemberList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList2248); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1275:1: ruleEnumMemberList returns [EObject current=null] : (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject this_EnumMember_0 = null;

        EObject lv_enumMember_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1280:6: ( (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1281:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1281:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1282:2: this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList2298);
            this_EnumMember_0=ruleEnumMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_EnumMember_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1293:1: ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1293:3: ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    match(input,25,FOLLOW_25_in_ruleEnumMemberList2308); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1297:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1298:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1298:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1299:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList2329);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1329:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1330:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1331:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumMemberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember2367);
            iv_ruleEnumMember=ruleEnumMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember2377); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1338:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_constExpr_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1343:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1344:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1344:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1344:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1344:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1345:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1345:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1346:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotations_in_ruleEnumMember2423);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1368:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1369:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1369:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1370:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember2440); if (failed) return current;
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1392:2: ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1392:4: '=' ( (lv_constExpr_3_0= ruleConstantExpression ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleEnumMember2456); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1396:1: ( (lv_constExpr_3_0= ruleConstantExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1397:1: (lv_constExpr_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1397:1: (lv_constExpr_3_0= ruleConstantExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1398:3: lv_constExpr_3_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleEnumMember2477);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1428:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1429:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1430:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaratorsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators2515);
            iv_ruleDeclarators=ruleDeclarators();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators2525); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1437:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1442:6: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1443:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1443:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1443:2: ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1443:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1444:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1444:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1445:3: lv_dec_0_0= ruleDeclarator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2571);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1467:2: ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1467:4: ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    match(input,25,FOLLOW_25_in_ruleDeclarators2582); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1471:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1472:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1472:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1473:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2603);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1503:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1504:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1505:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaratorRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator2641);
            iv_ruleDeclarator=ruleDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator2651); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1512:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1517:6: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1518:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1518:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1518:2: ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1518:2: ( (lv_pointer_0_0= rulePointerSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1519:1: (lv_pointer_0_0= rulePointerSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1519:1: (lv_pointer_0_0= rulePointerSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1520:3: lv_pointer_0_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePointerSpecification_in_ruleDeclarator2697);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1542:2: ( (lv_dc_1_0= ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1543:1: (lv_dc_1_0= ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1543:1: (lv_dc_1_0= ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1544:3: lv_dc_1_0= ruleDirectDeclarator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2718);
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


    // $ANTLR start entryRulePointerSpecification
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1574:1: entryRulePointerSpecification returns [EObject current=null] : iv_rulePointerSpecification= rulePointerSpecification EOF ;
    public final EObject entryRulePointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1575:2: (iv_rulePointerSpecification= rulePointerSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1576:2: iv_rulePointerSpecification= rulePointerSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPointerSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2754);
            iv_rulePointerSpecification=rulePointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePointerSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointerSpecification2764); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1583:1: rulePointerSpecification returns [EObject current=null] : ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* ) ;
    public final EObject rulePointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiedPointer_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1588:6: ( ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1589:1: ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1589:1: ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1589:2: () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1589:2: ()
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1590:2: 
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1603:2: ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1604:1: (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1604:1: (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1605:3: lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerQualified_PointerSpecificationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualified_PointerSpecification_in_rulePointerSpecification2822);
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
            	    break loop17;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1635:1: entryRuleQualified_PointerSpecification returns [EObject current=null] : iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF ;
    public final EObject entryRuleQualified_PointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualified_PointerSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1636:2: (iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1637:2: iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualified_PointerSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification2859);
            iv_ruleQualified_PointerSpecification=ruleQualified_PointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualified_PointerSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualified_PointerSpecification2869); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1644:1: ruleQualified_PointerSpecification returns [EObject current=null] : ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* ) ;
    public final EObject ruleQualified_PointerSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1649:6: ( ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1650:1: ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1650:1: ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1650:2: () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1650:2: ()
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1651:2: 
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

            match(input,27,FOLLOW_27_in_ruleQualified_PointerSpecification2916); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualified_PointerSpecificationAccess().getAsteriskKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1668:1: ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=54 && LA18_0<=55)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1669:1: (lv_typeQualifier_2_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1669:1: (lv_typeQualifier_2_0= ruleTypeQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1670:3: lv_typeQualifier_2_0= ruleTypeQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleQualified_PointerSpecification2937);
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
    // $ANTLR end ruleQualified_PointerSpecification


    // $ANTLR start entryRuleDirectDeclarator
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1700:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1701:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1702:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDirectDeclaratorRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2974);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDirectDeclarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator2984); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1709:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_dec_2_0 = null;

        EObject lv_array_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1714:6: ( ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1715:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1715:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1715:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1715:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==28) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1715:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1715:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1715:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1716:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1716:1: (lv_id_0_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1717:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectDeclarator3027); if (failed) return current;
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1740:6: ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1740:6: ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1740:8: '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleDirectDeclarator3049); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1744:1: ( (lv_dec_2_0= ruleDeclarator ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1745:1: (lv_dec_2_0= ruleDeclarator )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1745:1: (lv_dec_2_0= ruleDeclarator )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1746:3: lv_dec_2_0= ruleDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDecDeclaratorParserRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclarator_in_ruleDirectDeclarator3070);
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

                    match(input,29,FOLLOW_29_in_ruleDirectDeclarator3080); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1772:3: ( (lv_array_4_0= ruleArraySpecification ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:1: (lv_array_4_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:1: (lv_array_4_0= ruleArraySpecification )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1774:3: lv_array_4_0= ruleArraySpecification
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator3103);
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
            	    break loop20;
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


    // $ANTLR start entryRuleArraySpecification
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1804:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1805:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1806:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArraySpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3140);
            iv_ruleArraySpecification=ruleArraySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification3150); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1813:1: ruleArraySpecification returns [EObject current=null] : ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_constExpr_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1818:6: ( ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1819:1: ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1819:1: ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1819:3: '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']'
            {
            match(input,30,FOLLOW_30_in_ruleArraySpecification3185); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1823:1: ( (lv_constExpr_1_0= ruleConstantExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==RULE_INT||(LA21_0>=27 && LA21_0<=28)||LA21_0==32||(LA21_0>=41 && LA21_0<=42)||LA21_0==47||(LA21_0>=52 && LA21_0<=53)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1824:1: (lv_constExpr_1_0= ruleConstantExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1824:1: (lv_constExpr_1_0= ruleConstantExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1825:3: lv_constExpr_1_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArraySpecificationAccess().getConstExprConstantExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleArraySpecification3206);
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

            match(input,31,FOLLOW_31_in_ruleArraySpecification3217); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1859:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1860:2: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1861:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName3254);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullyQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName3265); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1868:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1873:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1874:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1874:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1874:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName3305); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1881:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1882:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_ruleFullyQualifiedName3324); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName3339); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1902:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1903:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1904:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3386);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition3396); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1911:1: ruleConstantDefinition returns [EObject current=null] : ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_expr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1916:6: ( ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1917:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1917:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1917:3: '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            match(input,33,FOLLOW_33_in_ruleConstantDefinition3431); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1921:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1922:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1922:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1923:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition3448); if (failed) return current;
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1945:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||LA23_0==RULE_INT||(LA23_0>=27 && LA23_0<=28)||LA23_0==32||(LA23_0>=41 && LA23_0<=42)||LA23_0==47||(LA23_0>=52 && LA23_0<=53)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1946:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1946:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1947:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3474);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1977:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1978:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1979:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3511);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition3521); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1986:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_fqn_3_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_5_0 = null;

        EObject lv_methodDef_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1991:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1992:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1992:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1992:2: ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1992:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1993:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1993:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1994:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotations_in_ruleInterfaceDefinition3567);
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

            match(input,34,FOLLOW_34_in_ruleInterfaceDefinition3577); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2020:1: ( 'unmanaged' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2020:3: 'unmanaged'
                    {
                    match(input,35,FOLLOW_35_in_ruleInterfaceDefinition3588); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2024:3: ( (lv_fqn_3_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2025:1: (lv_fqn_3_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2025:1: (lv_fqn_3_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2026:3: lv_fqn_3_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3611);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2048:2: ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2048:4: ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleInterfaceDefinition3622); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2052:1: ( (lv_fqn2_5_0= ruleFullyQualifiedName ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2053:1: (lv_fqn2_5_0= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2053:1: (lv_fqn2_5_0= ruleFullyQualifiedName )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2054:3: lv_fqn2_5_0= ruleFullyQualifiedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3643);
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

            match(input,19,FOLLOW_19_in_ruleInterfaceDefinition3655); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2080:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=21 && LA26_0<=22)||LA26_0==24||LA26_0==36||LA26_0==39||(LA26_0>=54 && LA26_0<=74)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2081:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2081:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2082:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3676);
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
            	    break loop26;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleInterfaceDefinition3687); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2116:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2117:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2118:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMethodDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3723);
            iv_ruleMethodDefinition=ruleMethodDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition3733); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2125:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_2_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) ) ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_ParameterList_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2130:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_2_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) ) ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2131:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_2_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2131:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_2_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) ) ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2131:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_2_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) ) ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2131:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2132:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2132:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2133:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotations_in_ruleMethodDefinition3779);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2155:2: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2156:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2156:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2157:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3800);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2179:2: ( (lv_id_2_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2180:1: (lv_id_2_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2180:1: (lv_id_2_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2181:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodDefinition3817); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_2_0(), "id"); 
              		
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
              	        		lv_id_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    int LA28_2 = input.LA(3);

                    if ( (LA28_2==RULE_ID||LA28_2==25||(LA28_2>=27 && LA28_2<=28)||LA28_2==36||(LA28_2>=56 && LA28_2<=74)) ) {
                        alt28=2;
                    }
                    else if ( (LA28_2==29) ) {
                        int LA28_5 = input.LA(4);

                        if ( (synpred32()) ) {
                            alt28=1;
                        }
                        else if ( (true) ) {
                            alt28=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2203:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) )", 28, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2203:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) )", 28, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_ID:
                case 21:
                case 22:
                case 24:
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
                case 73:
                case 74:
                case 75:
                case 76:
                    {
                    alt28=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2203:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) )", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2203:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:3: ( '(' ( 'void' )? ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:3: ( '(' ( 'void' )? ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:5: '(' ( 'void' )? ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleMethodDefinition3834); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2207:1: ( 'void' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==36) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2207:3: 'void'
                            {
                            match(input,36,FOLLOW_36_in_ruleMethodDefinition3845); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_3_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_ruleMethodDefinition3857); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_3_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2216:6: ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2216:6: ( '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2216:8: '(' ( (lv_ParameterList_7_0= ruleParameterList ) ) ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleMethodDefinition3875); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2220:1: ( (lv_ParameterList_7_0= ruleParameterList ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2221:1: (lv_ParameterList_7_0= ruleParameterList )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2221:1: (lv_ParameterList_7_0= ruleParameterList )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2222:3: lv_ParameterList_7_0= ruleParameterList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_3_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterList_in_ruleMethodDefinition3896);
                    lv_ParameterList_7_0=ruleParameterList();
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
                      	        		lv_ParameterList_7_0, 
                      	        		"ParameterList", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,29,FOLLOW_29_in_ruleMethodDefinition3906); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_3_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleMethodDefinition3918); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_4(), null); 
                  
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2260:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2261:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2262:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3954);
            iv_ruleParameterList=ruleParameterList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3964); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2269:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2274:6: ( ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:2: ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2276:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2276:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2277:3: lv_param_0_0= ruleParameter
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList4010);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2299:2: ( ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||(LA29_1>=21 && LA29_1<=22)||LA29_1==24||LA29_1==36||LA29_1==39||(LA29_1>=54 && LA29_1<=76)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2299:4: ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    match(input,25,FOLLOW_25_in_ruleParameterList4021); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2303:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2304:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2304:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2305:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList4042);
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
            	    break loop29;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2327:4: ( ',' '...' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2327:6: ',' '...'
                    {
                    match(input,25,FOLLOW_25_in_ruleParameterList4055); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_2_0(), null); 
                          
                    }
                    match(input,37,FOLLOW_37_in_ruleParameterList4065); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2343:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2344:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2345:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4103);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4113); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2352:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2357:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2358:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2358:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2358:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2358:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2359:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2359:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2360:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotations_in_ruleParameter4159);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2382:2: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=75 && LA31_0<=76)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2383:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2383:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2384:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterQualifier_in_ruleParameter4180);
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
            	    break loop31;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2406:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2407:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2407:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2408:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4202);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2430:2: ( (lv_dec_3_0= ruleDeclarator ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||(LA32_0>=27 && LA32_0<=28)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2431:1: (lv_dec_3_0= ruleDeclarator )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2431:1: (lv_dec_3_0= ruleDeclarator )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2432:3: lv_dec_3_0= ruleDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclarator_in_ruleParameter4223);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2462:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2463:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2464:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeDirectiveRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4260);
            iv_ruleIncludeDirective=ruleIncludeDirective();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective4270); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2471:1: ruleIncludeDirective returns [EObject current=null] : ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2476:6: ( ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2477:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2477:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2477:3: '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            {
            match(input,38,FOLLOW_38_in_ruleIncludeDirective4305); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2481:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_INCLUDELIB) ) {
                alt33=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2481:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2481:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2481:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2482:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2482:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2483:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeDirective4323); if (failed) return current;
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2506:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2506:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2507:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2507:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2508:3: lv_includeID_2_0= RULE_INCLUDELIB
                    {
                    lv_includeID_2_0=(Token)input.LT(1);
                    match(input,RULE_INCLUDELIB,FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective4351); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2538:1: entryRuleAnnotations returns [EObject current=null] : iv_ruleAnnotations= ruleAnnotations EOF ;
    public final EObject entryRuleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotations = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2539:2: (iv_ruleAnnotations= ruleAnnotations EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2540:2: iv_ruleAnnotations= ruleAnnotations EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_entryRuleAnnotations4393);
            iv_ruleAnnotations=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotations; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotations4403); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2547:1: ruleAnnotations returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2552:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2553:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2553:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2553:2: () ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2553:2: ()
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2554:2: 
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2567:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==39) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2568:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2568:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2569:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotations4461);
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
            	    break loop34;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2599:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2600:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2601:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4498);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4508); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2608:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fqn_1_0 = null;

        EObject lv_annotationParamaters_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2613:6: ( ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2614:1: ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2614:1: ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2614:3: '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )?
            {
            match(input,39,FOLLOW_39_in_ruleAnnotation4543); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2618:1: ( (lv_fqn_1_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2619:1: (lv_fqn_1_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2619:1: (lv_fqn_1_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2620:3: lv_fqn_1_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getFqnFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleAnnotation4564);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2642:2: ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2643:1: (lv_annotationParamaters_2_0= ruleAnnotationParameters )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2643:1: (lv_annotationParamaters_2_0= ruleAnnotationParameters )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2644:3: lv_annotationParamaters_2_0= ruleAnnotationParameters
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParamatersAnnotationParametersParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationParameters_in_ruleAnnotation4585);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2674:1: entryRuleAnnotationParameters returns [EObject current=null] : iv_ruleAnnotationParameters= ruleAnnotationParameters EOF ;
    public final EObject entryRuleAnnotationParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationParameters = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2675:2: (iv_ruleAnnotationParameters= ruleAnnotationParameters EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2676:2: iv_ruleAnnotationParameters= ruleAnnotationParameters EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationParametersRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters4622);
            iv_ruleAnnotationParameters=ruleAnnotationParameters();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationParameters; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationParameters4632); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2683:1: ruleAnnotationParameters returns [EObject current=null] : ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' ) ;
    public final EObject ruleAnnotationParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_valuePair_2_0 = null;

        EObject lv_value_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2688:6: ( ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2689:1: ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2689:1: ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2689:2: () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2689:2: ()
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2690:2: 
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

            match(input,28,FOLLOW_28_in_ruleAnnotationParameters4679); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationParametersAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2707:1: ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==26) ) {
                    alt36=1;
                }
                else if ( (LA36_1==29) ) {
                    alt36=2;
                }
            }
            else if ( (LA36_0==RULE_STRING||(LA36_0>=RULE_BOOLEAN && LA36_0<=RULE_INT)||LA36_0==19||(LA36_0>=39 && LA36_0<=42)) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2707:2: ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2707:2: ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2708:1: (lv_valuePair_2_0= ruleAnnotationValuePairs )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2708:1: (lv_valuePair_2_0= ruleAnnotationValuePairs )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2709:3: lv_valuePair_2_0= ruleAnnotationValuePairs
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationParametersAccess().getValuePairAnnotationValuePairsParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationValuePairs_in_ruleAnnotationParameters4701);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2732:6: ( (lv_value_3_0= ruleAnnotationValue ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2732:6: ( (lv_value_3_0= ruleAnnotationValue ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2733:1: (lv_value_3_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2733:1: (lv_value_3_0= ruleAnnotationValue )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2734:3: lv_value_3_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationParametersAccess().getValueAnnotationValueParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationValue_in_ruleAnnotationParameters4728);
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

            match(input,29,FOLLOW_29_in_ruleAnnotationParameters4740); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2768:1: entryRuleAnnotationValuePairs returns [EObject current=null] : iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF ;
    public final EObject entryRuleAnnotationValuePairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePairs = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2769:2: (iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2770:2: iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValuePairsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs4776);
            iv_ruleAnnotationValuePairs=ruleAnnotationValuePairs();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValuePairs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValuePairs4786); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2777:1: ruleAnnotationValuePairs returns [EObject current=null] : ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* ) ;
    public final EObject ruleAnnotationValuePairs() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_listValue_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2782:6: ( ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2783:1: ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2783:1: ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2783:2: ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2783:2: ( (lv_first_0_0= ruleAnnotationValuePair ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2784:1: (lv_first_0_0= ruleAnnotationValuePair )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2784:1: (lv_first_0_0= ruleAnnotationValuePair )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2785:3: lv_first_0_0= ruleAnnotationValuePair
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairsAccess().getFirstAnnotationValuePairParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4832);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2807:2: ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==25) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2807:4: ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) )
            	    {
            	    match(input,25,FOLLOW_25_in_ruleAnnotationValuePairs4843); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAnnotationValuePairsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2811:1: ( (lv_listValue_2_0= ruleAnnotationValuePair ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2812:1: (lv_listValue_2_0= ruleAnnotationValuePair )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2812:1: (lv_listValue_2_0= ruleAnnotationValuePair )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2813:3: lv_listValue_2_0= ruleAnnotationValuePair
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairsAccess().getListValueAnnotationValuePairParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4864);
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
            	    break loop37;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2843:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2844:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2845:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValuePairRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4902);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValuePair4912); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2852:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_value_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2857:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2858:1: ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2858:1: ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2858:2: ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2858:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2859:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2859:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2860:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationValuePair4954); if (failed) return current;
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

            match(input,26,FOLLOW_26_in_ruleAnnotationValuePair4969); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2886:1: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2887:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2887:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2888:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4990);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2918:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2919:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2920:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue5026);
            iv_ruleAnnotationValue=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValue5036); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2927:1: ruleAnnotationValue returns [EObject current=null] : ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_4 = null;

        EObject this_ArrayAnnotationValue_5 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2932:6: ( ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2933:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2933:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )
            int alt38=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 41:
            case 42:
                {
                alt38=1;
                }
                break;
            case 40:
                {
                alt38=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt38=3;
                }
                break;
            case RULE_ID:
                {
                alt38=4;
                }
                break;
            case 39:
                {
                alt38=5;
                }
                break;
            case 19:
                {
                alt38=6;
                }
                break;
            case RULE_STRING:
                {
                alt38=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2933:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2933:2: rulesignedINT
                    {
                    pushFollow(FOLLOW_rulesignedINT_in_ruleAnnotationValue5070);
                    rulesignedINT();
                    _fsp--;
                    if (failed) return current;

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2934:7: 'null'
                    {
                    match(input,40,FOLLOW_40_in_ruleAnnotationValue5078); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationValueAccess().getNullKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2939:6: RULE_BOOLEAN
                    {
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5093); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getBooleanTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2944:6: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationValue5107); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getIDTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2950:2: this_Annotation_4= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getAnnotationParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationValue5137);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2963:2: this_ArrayAnnotationValue_5= ruleArrayAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getArrayAnnotationValueParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5167);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2975:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotationValue5181); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2987:1: entryRuleArrayAnnotationValue returns [EObject current=null] : iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF ;
    public final EObject entryRuleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAnnotationValue = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2988:2: (iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2989:2: iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrayAnnotationValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5216);
            iv_ruleArrayAnnotationValue=ruleArrayAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrayAnnotationValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayAnnotationValue5226); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2996:1: ruleArrayAnnotationValue returns [EObject current=null] : ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' ) ;
    public final EObject ruleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject lv_firstValue_1_0 = null;

        EObject lv_values_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3001:6: ( ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3002:1: ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3002:1: ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3002:3: '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}'
            {
            match(input,19,FOLLOW_19_in_ruleArrayAnnotationValue5261); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3006:1: ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||(LA40_0>=RULE_BOOLEAN && LA40_0<=RULE_INT)||LA40_0==19||(LA40_0>=39 && LA40_0<=42)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3006:2: ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3006:2: ( (lv_firstValue_1_0= ruleAnnotationValue ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3007:1: (lv_firstValue_1_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3007:1: (lv_firstValue_1_0= ruleAnnotationValue )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3008:3: lv_firstValue_1_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getFirstValueAnnotationValueParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5283);
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

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3030:2: ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==25) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3030:4: ',' ( (lv_values_3_0= ruleAnnotationValue ) )
                    	    {
                    	    match(input,25,FOLLOW_25_in_ruleArrayAnnotationValue5294); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getCommaKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3034:1: ( (lv_values_3_0= ruleAnnotationValue ) )
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3035:1: (lv_values_3_0= ruleAnnotationValue )
                    	    {
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3035:1: (lv_values_3_0= ruleAnnotationValue )
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3036:3: lv_values_3_0= ruleAnnotationValue
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5315);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleArrayAnnotationValue5329); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3070:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3071:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3072:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT5366);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT5377); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3079:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3084:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3085:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3085:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3085:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3085:2: (kw= '+' | kw= '-' )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            else if ( (LA41_0==42) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3086:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_rulesignedINT5416); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3093:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_rulesignedINT5435); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT5452); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_2);
                  
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3113:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3114:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3115:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5497);
            iv_ruleConstantExpression=ruleConstantExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression5507); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3122:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3127:6: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3129:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5556);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3148:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3149:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3150:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5590);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression5600); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3157:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3162:6: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3163:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3163:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3163:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3163:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3164:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3164:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3165:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5646);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3187:2: ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3187:4: '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    match(input,43,FOLLOW_43_in_ruleLogicalOrExpression5657); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3191:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3192:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3192:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3193:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5678);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3223:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3224:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3225:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5716);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression5726); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3232:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3237:6: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3238:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3238:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3238:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3238:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3239:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3239:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3240:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5772);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3262:2: ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3262:4: '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    match(input,44,FOLLOW_44_in_ruleLogicalAndExpression5783); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3266:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3267:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3267:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3268:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5804);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3298:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3299:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3300:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression5842);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression5852); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3307:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3312:6: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3313:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3313:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3313:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3313:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3314:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3314:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3315:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleXorExpression_in_ruleOrExpression5898);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3337:2: ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3337:4: '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    match(input,45,FOLLOW_45_in_ruleOrExpression5909); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3341:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3342:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3342:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3343:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleOrExpression5930);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3373:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3374:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3375:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getXorExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleXorExpression_in_entryRuleXorExpression5968);
            iv_ruleXorExpression=ruleXorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXorExpression5978); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3382:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3387:6: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3388:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3388:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3388:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3388:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3389:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3389:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3390:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleXorExpression6024);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3412:2: ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3412:4: '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    match(input,46,FOLLOW_46_in_ruleXorExpression6035); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3416:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3417:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3417:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3418:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXorExpression_in_ruleXorExpression6056);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3448:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3449:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3450:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression6094);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression6104); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3457:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3462:6: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3463:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3463:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3463:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3463:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3464:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3464:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3465:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleAndExpression6150);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3487:2: ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3487:4: '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleAndExpression6161); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3491:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3492:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3492:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3493:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAndExpression_in_ruleAndExpression6182);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3523:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3524:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3525:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShiftExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6220);
            iv_ruleShiftExpression=ruleShiftExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression6230); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3532:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3537:6: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3538:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3538:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3538:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3538:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3539:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3539:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3540:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6276);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3562:2: ( ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=48 && LA47_0<=49)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3562:3: ( (lv_op_1_0= ruleShiftOperation ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3562:3: ( (lv_op_1_0= ruleShiftOperation ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3563:1: (lv_op_1_0= ruleShiftOperation )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3563:1: (lv_op_1_0= ruleShiftOperation )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3564:3: lv_op_1_0= ruleShiftOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getOpShiftOperationParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleShiftOperation_in_ruleShiftExpression6298);
                    lv_op_1_0=ruleShiftOperation();
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
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"ShiftOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3586:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3587:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3587:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3588:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleShiftExpression_in_ruleShiftExpression6319);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3618:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3619:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3620:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditiveExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6357);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression6367); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3627:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3632:6: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3633:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3633:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3633:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3633:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3634:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3634:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3635:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6413);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3657:2: ( ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=41 && LA48_0<=42)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3657:3: ( (lv_op_1_0= ruleAdditiveOperation ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3657:3: ( (lv_op_1_0= ruleAdditiveOperation ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3658:1: (lv_op_1_0= ruleAdditiveOperation )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3658:1: (lv_op_1_0= ruleAdditiveOperation )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3659:3: lv_op_1_0= ruleAdditiveOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAdditiveOperationParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveOperation_in_ruleAdditiveExpression6435);
                    lv_op_1_0=ruleAdditiveOperation();
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
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"AdditiveOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3681:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3682:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3682:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3683:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6456);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3713:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3714:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3715:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMulExpression_in_entryRuleMulExpression6494);
            iv_ruleMulExpression=ruleMulExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulExpression6504); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3722:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightExpr_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3727:6: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3728:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3728:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3728:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3728:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3729:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3729:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3730:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCastExpression_in_ruleMulExpression6550);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3752:2: ( ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==27||(LA49_0>=50 && LA49_0<=51)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3752:3: ( (lv_op_1_0= ruleMulOperation ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3752:3: ( (lv_op_1_0= ruleMulOperation ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3753:1: (lv_op_1_0= ruleMulOperation )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3753:1: (lv_op_1_0= ruleMulOperation )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3754:3: lv_op_1_0= ruleMulOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getOpMulOperationParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMulOperation_in_ruleMulExpression6572);
                    lv_op_1_0=ruleMulOperation();
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
                      	       			"op",
                      	        		lv_op_1_0, 
                      	        		"MulOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3776:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3777:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3777:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3778:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMulExpression_in_ruleMulExpression6593);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3808:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3809:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3810:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCastExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCastExpression_in_entryRuleCastExpression6631);
            iv_ruleCastExpression=ruleCastExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastExpression6641); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3817:1: ruleCastExpression returns [EObject current=null] : ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3822:6: ( ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred61()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3823:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==RULE_INT||LA50_0==27||LA50_0==32||(LA50_0>=41 && LA50_0<=42)||LA50_0==47||(LA50_0>=52 && LA50_0<=53)) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3823:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:2: ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:2: ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:4: '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleCastExpression6677); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3827:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3828:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3828:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3829:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6698);
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

                    match(input,29,FOLLOW_29_in_ruleCastExpression6708); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3855:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3856:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3856:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3857:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCastExpression_in_ruleCastExpression6729);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3880:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3880:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3881:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3881:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3882:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleCastExpression6757);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3912:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3913:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3914:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6793);
            iv_ruleUnaryExpression=ruleUnaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression6803); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3921:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= ruleUnaryOperation ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_unaryExpr_0_0 = null;

        EObject lv_primaryExpr_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3926:6: ( ( ( (lv_unaryExpr_0_0= ruleUnaryOperation ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3927:1: ( ( (lv_unaryExpr_0_0= ruleUnaryOperation ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3927:1: ( ( (lv_unaryExpr_0_0= ruleUnaryOperation ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3927:2: ( (lv_unaryExpr_0_0= ruleUnaryOperation ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3927:2: ( (lv_unaryExpr_0_0= ruleUnaryOperation ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27||(LA51_0>=41 && LA51_0<=42)||LA51_0==47||(LA51_0>=52 && LA51_0<=53)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3928:1: (lv_unaryExpr_0_0= ruleUnaryOperation )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3928:1: (lv_unaryExpr_0_0= ruleUnaryOperation )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3929:3: lv_unaryExpr_0_0= ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExprUnaryOperationParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryExpression6849);
                    lv_unaryExpr_0_0=ruleUnaryOperation();
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
                      	       			"unaryExpr",
                      	        		lv_unaryExpr_0_0, 
                      	        		"UnaryOperation", 
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3951:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3952:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3952:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3953:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6871);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3983:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3984:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3985:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6907);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression6917); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3992:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3997:6: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3998:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3998:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==RULE_INT||LA52_0==32) ) {
                alt52=1;
            }
            else if ( (LA52_0==28) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3998:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3998:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3998:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3999:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3999:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4000:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression6963);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4023:6: ( '(' this_ConstantExpression_2= ruleConstantExpression ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4023:6: ( '(' this_ConstantExpression_2= ruleConstantExpression ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4023:8: '(' this_ConstantExpression_2= ruleConstantExpression ')'
                    {
                    match(input,28,FOLLOW_28_in_rulePrimaryExpression6980); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_rulePrimaryExpression7005);
                    this_ConstantExpression_2=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,29,FOLLOW_29_in_rulePrimaryExpression7014); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4051:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4052:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4053:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral7051);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral7061); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4060:1: ruleLiteral returns [EObject current=null] : ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4065:6: ( ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4066:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4066:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA53_1 = input.LA(2);

                if ( (synpred64()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4066:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case RULE_INT:
            case 32:
                {
                alt53=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4066:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4066:2: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral7095); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4071:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral7109); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4076:6: ruleFloatingPointLiteral
                    {
                    pushFollow(FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7123);
                    ruleFloatingPointLiteral();
                    _fsp--;
                    if (failed) return current;

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4077:6: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4077:6: ( ( RULE_ID ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4078:1: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4078:1: ( RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4079:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral7143); if (failed) return current;
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


    // $ANTLR start entryRuleShiftOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4102:1: entryRuleShiftOperation returns [String current=null] : iv_ruleShiftOperation= ruleShiftOperation EOF ;
    public final String entryRuleShiftOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShiftOperation = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4103:2: (iv_ruleShiftOperation= ruleShiftOperation EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4104:2: iv_ruleShiftOperation= ruleShiftOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShiftOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleShiftOperation_in_entryRuleShiftOperation7180);
            iv_ruleShiftOperation=ruleShiftOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleShiftOperation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOperation7191); if (failed) return current;

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
    // $ANTLR end entryRuleShiftOperation


    // $ANTLR start ruleShiftOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4111:1: ruleShiftOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<<' | kw= '>>' ) ;
    public final AntlrDatatypeRuleToken ruleShiftOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4116:6: ( (kw= '<<' | kw= '>>' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4117:1: (kw= '<<' | kw= '>>' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4117:1: (kw= '<<' | kw= '>>' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==48) ) {
                alt54=1;
            }
            else if ( (LA54_0==49) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4117:1: (kw= '<<' | kw= '>>' )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4118:2: kw= '<<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleShiftOperation7229); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getShiftOperationAccess().getLessThanSignLessThanSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4125:2: kw= '>>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleShiftOperation7248); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getShiftOperationAccess().getGreaterThanSignGreaterThanSignKeyword_1(), null); 
                          
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
    // $ANTLR end ruleShiftOperation


    // $ANTLR start entryRuleAdditiveOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4138:1: entryRuleAdditiveOperation returns [String current=null] : iv_ruleAdditiveOperation= ruleAdditiveOperation EOF ;
    public final String entryRuleAdditiveOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperation = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4139:2: (iv_ruleAdditiveOperation= ruleAdditiveOperation EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4140:2: iv_ruleAdditiveOperation= ruleAdditiveOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditiveOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAdditiveOperation_in_entryRuleAdditiveOperation7289);
            iv_ruleAdditiveOperation=ruleAdditiveOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdditiveOperation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveOperation7300); if (failed) return current;

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
    // $ANTLR end entryRuleAdditiveOperation


    // $ANTLR start ruleAdditiveOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4147:1: ruleAdditiveOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4152:6: ( (kw= '+' | kw= '-' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4153:1: (kw= '+' | kw= '-' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4153:1: (kw= '+' | kw= '-' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            else if ( (LA55_0==42) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4153:1: (kw= '+' | kw= '-' )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4154:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleAdditiveOperation7338); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAdditiveOperationAccess().getPlusSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4161:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleAdditiveOperation7357); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAdditiveOperationAccess().getHyphenMinusKeyword_1(), null); 
                          
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
    // $ANTLR end ruleAdditiveOperation


    // $ANTLR start entryRuleMulOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4174:1: entryRuleMulOperation returns [String current=null] : iv_ruleMulOperation= ruleMulOperation EOF ;
    public final String entryRuleMulOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOperation = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4175:2: (iv_ruleMulOperation= ruleMulOperation EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4176:2: iv_ruleMulOperation= ruleMulOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMulOperation_in_entryRuleMulOperation7398);
            iv_ruleMulOperation=ruleMulOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMulOperation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOperation7409); if (failed) return current;

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
    // $ANTLR end entryRuleMulOperation


    // $ANTLR start ruleMulOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4183:1: ruleMulOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMulOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4188:6: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4189:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4189:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt56=1;
                }
                break;
            case 50:
                {
                alt56=2;
                }
                break;
            case 51:
                {
                alt56=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4189:1: (kw= '*' | kw= '/' | kw= '%' )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4190:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleMulOperation7447); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMulOperationAccess().getAsteriskKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4197:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleMulOperation7466); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMulOperationAccess().getSolidusKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4204:2: kw= '%'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleMulOperation7485); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getMulOperationAccess().getPercentSignKeyword_2(), null); 
                          
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
    // $ANTLR end ruleMulOperation


    // $ANTLR start entryRuleUnaryOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4217:1: entryRuleUnaryOperation returns [String current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final String entryRuleUnaryOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperation = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4218:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4219:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation7526);
            iv_ruleUnaryOperation=ruleUnaryOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation7537); if (failed) return current;

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
    // $ANTLR end entryRuleUnaryOperation


    // $ANTLR start ruleUnaryOperation
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4226:1: ruleUnaryOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4231:6: ( (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4232:1: (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4232:1: (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt57=1;
                }
                break;
            case 27:
                {
                alt57=2;
                }
                break;
            case 41:
                {
                alt57=3;
                }
                break;
            case 42:
                {
                alt57=4;
                }
                break;
            case 52:
                {
                alt57=5;
                }
                break;
            case 53:
                {
                alt57=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4232:1: (kw= '&' | kw= '*' | kw= '+' | kw= '-' | kw= '~' | kw= '!' )", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4233:2: kw= '&'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleUnaryOperation7575); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOperationAccess().getAmpersandKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4240:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleUnaryOperation7594); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOperationAccess().getAsteriskKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4247:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleUnaryOperation7613); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOperationAccess().getPlusSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4254:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleUnaryOperation7632); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOperationAccess().getHyphenMinusKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4261:2: kw= '~'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleUnaryOperation7651); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOperationAccess().getTildeKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4268:2: kw= '!'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleUnaryOperation7670); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnaryOperationAccess().getExclamationMarkKeyword_5(), null); 
                          
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
    // $ANTLR end ruleUnaryOperation


    // $ANTLR start entryRuleFloatingPointLiteral
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4281:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4282:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4283:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatingPointLiteralRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7711);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointLiteral7722); if (failed) return current;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4290:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_Exponent_3=null;
        Token this_FDsymbol_4=null;
        Token this_INT_6=null;
        Token this_Exponent_7=null;
        Token this_FDsymbol_8=null;
        Token this_INT_9=null;
        Token this_Exponent_10=null;
        Token this_FDsymbol_11=null;
        Token this_INT_12=null;
        Token this_Exponent_13=null;
        Token this_FDsymbol_14=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4295:6: ( ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:1: ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:1: ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )
            int alt70=4;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:2: ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:2: ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:3: (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:3: (this_INT_0= RULE_INT )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_INT) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4296:8: this_INT_0= RULE_INT
                    	    {
                    	    this_INT_0=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7764); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_INT_0);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getINTTerminalRuleCall_0_0(), null); 
                    	          
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
                    match(input,32,FOLLOW_32_in_ruleFloatingPointLiteral7784); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4309:1: (this_INT_2= RULE_INT )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_INT) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4309:6: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7800); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_INT_2);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getINTTerminalRuleCall_0_2(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4316:3: (this_Exponent_3= RULE_EXPONENT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_EXPONENT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4316:8: this_Exponent_3= RULE_EXPONENT
                            {
                            this_Exponent_3=(Token)input.LT(1);
                            match(input,RULE_EXPONENT,FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral7823); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_Exponent_3);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getExponentTerminalRuleCall_0_3(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4323:3: (this_FDsymbol_4= RULE_FDSYMBOL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_FDSYMBOL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4323:8: this_FDsymbol_4= RULE_FDSYMBOL
                            {
                            this_FDsymbol_4=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7846); if (failed) return current;
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4331:6: (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4331:6: (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4332:2: kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleFloatingPointLiteral7874); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4337:1: (this_INT_6= RULE_INT )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_INT) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4337:6: this_INT_6= RULE_INT
                    	    {
                    	    this_INT_6=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7890); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_INT_6);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getINTTerminalRuleCall_1_1(), null); 
                    	          
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

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4344:3: (this_Exponent_7= RULE_EXPONENT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_EXPONENT) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4344:8: this_Exponent_7= RULE_EXPONENT
                            {
                            this_Exponent_7=(Token)input.LT(1);
                            match(input,RULE_EXPONENT,FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral7913); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_Exponent_7);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getExponentTerminalRuleCall_1_2(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4351:3: (this_FDsymbol_8= RULE_FDSYMBOL )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_FDSYMBOL) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4351:8: this_FDsymbol_8= RULE_FDSYMBOL
                            {
                            this_FDsymbol_8=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7936); if (failed) return current;
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:6: ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:6: ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:7: (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:7: (this_INT_9= RULE_INT )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_INT) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:12: this_INT_9= RULE_INT
                    	    {
                    	    this_INT_9=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7967); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_INT_9);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getINTTerminalRuleCall_2_0(), null); 
                    	          
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

                    this_Exponent_10=(Token)input.LT(1);
                    match(input,RULE_EXPONENT,FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral7989); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getExponentTerminalRuleCall_2_1(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4373:1: (this_FDsymbol_11= RULE_FDSYMBOL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_FDSYMBOL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4373:6: this_FDsymbol_11= RULE_FDSYMBOL
                            {
                            this_FDsymbol_11=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral8010); if (failed) return current;
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4381:6: ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4381:6: ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4381:7: (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4381:7: (this_INT_12= RULE_INT )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_INT) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4381:12: this_INT_12= RULE_INT
                    	    {
                    	    this_INT_12=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatingPointLiteral8041); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		current.merge(this_INT_12);
                    	          
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getINTTerminalRuleCall_3_0(), null); 
                    	          
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

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4388:3: (this_Exponent_13= RULE_EXPONENT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_EXPONENT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4388:8: this_Exponent_13= RULE_EXPONENT
                            {
                            this_Exponent_13=(Token)input.LT(1);
                            match(input,RULE_EXPONENT,FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral8064); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_Exponent_13);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getExponentTerminalRuleCall_3_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4395:3: (this_FDsymbol_14= RULE_FDSYMBOL )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_FDSYMBOL) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4395:8: this_FDsymbol_14= RULE_FDSYMBOL
                            {
                            this_FDsymbol_14=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral8087); if (failed) return current;
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


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4410:1: ruleTypeQualifier returns [Enumerator current=null] : ( ( 'const' ) | ( 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4414:6: ( ( ( 'const' ) | ( 'volatile' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4415:1: ( ( 'const' ) | ( 'volatile' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4415:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==54) ) {
                alt71=1;
            }
            else if ( (LA71_0==55) ) {
                alt71=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4415:1: ( ( 'const' ) | ( 'volatile' ) )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4415:2: ( 'const' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4415:2: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4415:4: 'const'
                    {
                    match(input,54,FOLLOW_54_in_ruleTypeQualifier8147); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4421:6: ( 'volatile' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4421:6: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4421:8: 'volatile'
                    {
                    match(input,55,FOLLOW_55_in_ruleTypeQualifier8162); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4431:1: ruleTypeSpecifier returns [Enumerator current=null] : ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4435:6: ( ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4436:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4436:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt72=20;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt72=1;
                }
                break;
            case 56:
                {
                alt72=2;
                }
                break;
            case 57:
                {
                alt72=3;
                }
                break;
            case 58:
                {
                alt72=4;
                }
                break;
            case 59:
                {
                alt72=5;
                }
                break;
            case 60:
                {
                alt72=6;
                }
                break;
            case 61:
                {
                alt72=7;
                }
                break;
            case 62:
                {
                alt72=8;
                }
                break;
            case 63:
                {
                alt72=9;
                }
                break;
            case 64:
                {
                alt72=10;
                }
                break;
            case 65:
                {
                alt72=11;
                }
                break;
            case 66:
                {
                alt72=12;
                }
                break;
            case 67:
                {
                alt72=13;
                }
                break;
            case 68:
                {
                alt72=14;
                }
                break;
            case 69:
                {
                alt72=15;
                }
                break;
            case 70:
                {
                alt72=16;
                }
                break;
            case 71:
                {
                alt72=17;
                }
                break;
            case 72:
                {
                alt72=18;
                }
                break;
            case 73:
                {
                alt72=19;
                }
                break;
            case 74:
                {
                alt72=20;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4436:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4436:2: ( 'void' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4436:2: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4436:4: 'void'
                    {
                    match(input,36,FOLLOW_36_in_ruleTypeSpecifier8205); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4442:6: ( 'char' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4442:6: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4442:8: 'char'
                    {
                    match(input,56,FOLLOW_56_in_ruleTypeSpecifier8220); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4448:6: ( 'short' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4448:6: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4448:8: 'short'
                    {
                    match(input,57,FOLLOW_57_in_ruleTypeSpecifier8235); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4454:6: ( 'int' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4454:6: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4454:8: 'int'
                    {
                    match(input,58,FOLLOW_58_in_ruleTypeSpecifier8250); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4460:6: ( 'long' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4460:6: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4460:8: 'long'
                    {
                    match(input,59,FOLLOW_59_in_ruleTypeSpecifier8265); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4466:6: ( 'float' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4466:6: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4466:8: 'float'
                    {
                    match(input,60,FOLLOW_60_in_ruleTypeSpecifier8280); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4472:6: ( 'double' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4472:6: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4472:8: 'double'
                    {
                    match(input,61,FOLLOW_61_in_ruleTypeSpecifier8295); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4478:6: ( 'signed' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4478:6: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4478:8: 'signed'
                    {
                    match(input,62,FOLLOW_62_in_ruleTypeSpecifier8310); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4484:6: ( 'unsigned' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4484:6: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4484:8: 'unsigned'
                    {
                    match(input,63,FOLLOW_63_in_ruleTypeSpecifier8325); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4490:6: ( 'string' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4490:6: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4490:8: 'string'
                    {
                    match(input,64,FOLLOW_64_in_ruleTypeSpecifier8340); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4496:6: ( 'int8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4496:6: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4496:8: 'int8_t'
                    {
                    match(input,65,FOLLOW_65_in_ruleTypeSpecifier8355); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10(), null); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4502:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4502:6: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4502:8: 'uint8_t'
                    {
                    match(input,66,FOLLOW_66_in_ruleTypeSpecifier8370); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4508:6: ( 'int16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4508:6: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4508:8: 'int16_t'
                    {
                    match(input,67,FOLLOW_67_in_ruleTypeSpecifier8385); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12(), null); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4514:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4514:6: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4514:8: 'uint16_t'
                    {
                    match(input,68,FOLLOW_68_in_ruleTypeSpecifier8400); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4520:6: ( 'int32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4520:6: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4520:8: 'int32_t'
                    {
                    match(input,69,FOLLOW_69_in_ruleTypeSpecifier8415); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14(), null); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4526:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4526:6: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4526:8: 'uint32_t'
                    {
                    match(input,70,FOLLOW_70_in_ruleTypeSpecifier8430); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15(), null); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4532:6: ( 'int64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4532:6: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4532:8: 'int64_t'
                    {
                    match(input,71,FOLLOW_71_in_ruleTypeSpecifier8445); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16(), null); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4538:6: ( 'uint64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4538:6: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4538:8: 'uint64_t'
                    {
                    match(input,72,FOLLOW_72_in_ruleTypeSpecifier8460); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4544:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4544:6: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4544:8: 'intptr_t'
                    {
                    match(input,73,FOLLOW_73_in_ruleTypeSpecifier8475); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18(), null); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4550:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4550:6: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4550:8: 'uintptr_t'
                    {
                    match(input,74,FOLLOW_74_in_ruleTypeSpecifier8490); if (failed) return current;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4560:1: ruleParameterQualifier returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4564:6: ( ( ( 'in' ) | ( 'out' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4565:1: ( ( 'in' ) | ( 'out' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4565:1: ( ( 'in' ) | ( 'out' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==75) ) {
                alt73=1;
            }
            else if ( (LA73_0==76) ) {
                alt73=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4565:1: ( ( 'in' ) | ( 'out' ) )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4565:2: ( 'in' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4565:2: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4565:4: 'in'
                    {
                    match(input,75,FOLLOW_75_in_ruleParameterQualifier8533); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4571:6: ( 'out' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4571:6: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4571:8: 'out'
                    {
                    match(input,76,FOLLOW_76_in_ruleParameterQualifier8548); if (failed) return current;
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

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:3: ( ( '(' ( 'void' )? ')' ) )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:3: ( '(' ( 'void' )? ')' )
        {
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:3: ( '(' ( 'void' )? ')' )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:5: '(' ( 'void' )? ')'
        {
        match(input,28,FOLLOW_28_in_synpred323834); if (failed) return ;
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2207:1: ( 'void' )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==36) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2207:3: 'void'
                {
                match(input,36,FOLLOW_36_in_synpred323845); if (failed) return ;

                }
                break;

        }

        match(input,29,FOLLOW_29_in_synpred323857); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:2: ( ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) ) )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:2: ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) )
        {
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:2: ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3823:4: '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) )
        {
        match(input,28,FOLLOW_28_in_synpred616677); if (failed) return ;
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3827:1: ( ( ruleQualifiedTypeSpecification ) )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3828:1: ( ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3828:1: ( ruleQualifiedTypeSpecification )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3829:3: ruleQualifiedTypeSpecification
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_synpred616698);
        ruleQualifiedTypeSpecification();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,29,FOLLOW_29_in_synpred616708); if (failed) return ;
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3855:1: ( ( ruleCastExpression ) )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3856:1: ( ruleCastExpression )
        {
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3856:1: ( ruleCastExpression )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:3857:3: ruleCastExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCastExpression_in_synpred616729);
        ruleCastExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4066:2: ( RULE_ID )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4066:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred647095); if (failed) return ;

        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:6: ( ( ( RULE_INT )+ RULE_EXPONENT ( RULE_FDSYMBOL )? ) )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:6: ( ( RULE_INT )+ RULE_EXPONENT ( RULE_FDSYMBOL )? )
        {
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:6: ( ( RULE_INT )+ RULE_EXPONENT ( RULE_FDSYMBOL )? )
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:7: ( RULE_INT )+ RULE_EXPONENT ( RULE_FDSYMBOL )?
        {
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:7: ( RULE_INT )+
        int cnt83=0;
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_INT) ) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4359:12: RULE_INT
        	    {
        	    match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred877967); if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt83 >= 1 ) break loop83;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(83, input);
                    throw eee;
            }
            cnt83++;
        } while (true);

        match(input,RULE_EXPONENT,FOLLOW_RULE_EXPONENT_in_synpred877989); if (failed) return ;
        // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4373:1: ( RULE_FDSYMBOL )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_FDSYMBOL) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:4373:6: RULE_FDSYMBOL
                {
                match(input,RULE_FDSYMBOL,FOLLOW_RULE_FDSYMBOL_in_synpred878010); if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred87

    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred87() {
        backtracking++;
        int start = input.mark();
        try {
            synpred87_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
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


    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA70_eotS =
        "\7\uffff";
    static final String DFA70_eofS =
        "\1\uffff\1\5\5\uffff";
    static final String DFA70_minS =
        "\2\10\2\uffff\1\0\2\uffff";
    static final String DFA70_maxS =
        "\1\40\1\63\2\uffff\1\0\2\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\1\1\1\uffff\1\4\1\3";
    static final String DFA70_specialS =
        "\4\uffff\1\0\2\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\27\uffff\1\2",
            "\1\1\1\4\1\5\5\uffff\3\5\1\uffff\3\5\1\uffff\2\5\1\uffff\1\5"+
            "\1\uffff\1\5\1\uffff\1\5\1\3\1\5\4\uffff\1\5\2\uffff\13\5",
            "",
            "",
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
            return "4296:1: ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )* (this_Exponent_3= RULE_EXPONENT )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_INT_6= RULE_INT )+ (this_Exponent_7= RULE_EXPONENT )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_INT_9= RULE_INT )+ this_Exponent_10= RULE_EXPONENT (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_INT_12= RULE_INT )+ (this_Exponent_13= RULE_EXPONENT )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87()) ) {s = 6;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_4);
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
 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile158 = new BitSet(new long[]{0x0000004201650000L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile179 = new BitSet(new long[]{0x0000004201650000L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile202 = new BitSet(new long[]{0x0000000201650000L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile229 = new BitSet(new long[]{0x0000000201650000L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConstantDefinitionBegin333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConstantDefinitionEnd436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionEnd453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition557 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition587 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition617 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTypeDefinition627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTypedefSpecification708 = new BitSet(new long[]{0xFFC0001001600010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification729 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification842 = new BitSet(new long[]{0xFFC0001001600010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_ruleTypeSpecification956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1043 = new BitSet(new long[]{0xFF00001000000002L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1363 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1380 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStructOrUnionDefinition1396 = new BitSet(new long[]{0xFFC0009001700010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1417 = new BitSet(new long[]{0xFFC0009001700010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_20_in_ruleStructOrUnionDefinition1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStructOrUnion1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStructOrUnion1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleStructMember1743 = new BitSet(new long[]{0xFFC0001001600010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1764 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1785 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_23_in_ruleStructMember1796 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1817 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructMember1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEnumDefinition2035 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition2052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumDefinition2068 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2089 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumDefinition2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEnumReference2180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2298 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleEnumMemberList2308 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2329 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleEnumMember2423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2440 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEnumMember2456 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2571 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDeclarators2582 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2603 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerSpecification_in_ruleDeclarator2697 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointerSpecification2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_rulePointerSpecification2822 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualified_PointerSpecification2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleQualified_PointerSpecification2916 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualified_PointerSpecification2937 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator3027 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28_in_ruleDirectDeclarator3049 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator3070 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDirectDeclarator3080 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator3103 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleArraySpecification3185 = new BitSet(new long[]{0x0030860198000130L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification3206 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleArraySpecification3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName3254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3305 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleFullyQualifiedName3324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3339 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConstantDefinition3431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3448 = new BitSet(new long[]{0x0030860118000132L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleInterfaceDefinition3567 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInterfaceDefinition3577 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleInterfaceDefinition3588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3611 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceDefinition3622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInterfaceDefinition3655 = new BitSet(new long[]{0xFFC0009001700010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3676 = new BitSet(new long[]{0xFFC0009001700010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_20_in_ruleInterfaceDefinition3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleMethodDefinition3779 = new BitSet(new long[]{0xFFC0001001600010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3817 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMethodDefinition3834 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_36_in_ruleMethodDefinition3845 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMethodDefinition3857 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_28_in_ruleMethodDefinition3875 = new BitSet(new long[]{0xFFC0009001600010L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3896 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMethodDefinition3906 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethodDefinition3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4010 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameterList4021 = new BitSet(new long[]{0xFFC0009001600010L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4042 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameterList4055 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleParameterList4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleParameter4159 = new BitSet(new long[]{0xFFC0001001600010L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter4180 = new BitSet(new long[]{0xFFC0001001600010L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4202 = new BitSet(new long[]{0x0000000018000012L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIncludeDirective4305 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations4393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotations4461 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAnnotation4543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleAnnotation4564 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleAnnotationParameters_in_ruleAnnotation4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters4622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationParameters4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAnnotationParameters4679 = new BitSet(new long[]{0x00000780200801B0L});
    public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_ruleAnnotationParameters4701 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationParameters4728 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationParameters4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs4776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePairs4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4832 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAnnotationValuePairs4843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4864 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair4954 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAnnotationValuePair4969 = new BitSet(new long[]{0x00000780000801B0L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue5026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAnnotationValue5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValue5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationValue5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotationValue5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayAnnotationValue5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleArrayAnnotationValue5261 = new BitSet(new long[]{0x00000780001801B0L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5283 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleArrayAnnotationValue5294 = new BitSet(new long[]{0x00000780000801B0L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5315 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayAnnotationValue5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT5366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulesignedINT5416 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_42_in_rulesignedINT5435 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5646 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleLogicalOrExpression5657 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5772 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleLogicalAndExpression5783 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression5898 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleOrExpression5909 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression5968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression6024 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXorExpression6035 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression6094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression6150 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAndExpression6161 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6276 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperation_in_ruleShiftExpression6298 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6413 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperation_in_ruleAdditiveExpression6435 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression6494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression6550 = new BitSet(new long[]{0x000C000008000002L});
    public static final BitSet FOLLOW_ruleMulOperation_in_ruleMulExpression6572 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression6631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCastExpression6677 = new BitSet(new long[]{0xFFC0001001600010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6698 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCastExpression6708 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryExpression6849 = new BitSet(new long[]{0x0000000110000130L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression6980 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression7005 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperation_in_entryRuleShiftOperation7180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOperation7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleShiftOperation7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleShiftOperation7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperation_in_entryRuleAdditiveOperation7289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveOperation7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAdditiveOperation7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAdditiveOperation7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOperation_in_entryRuleMulOperation7398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOperation7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMulOperation7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMulOperation7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMulOperation7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation7526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUnaryOperation7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUnaryOperation7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleUnaryOperation7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleUnaryOperation7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnaryOperation7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUnaryOperation7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7764 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_ruleFloatingPointLiteral7784 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7800 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral7823 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFloatingPointLiteral7874 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7890 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral7913 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatingPointLiteral7967 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral7989 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatingPointLiteral8041 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_RULE_EXPONENT_in_ruleFloatingPointLiteral8064 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeQualifier8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeQualifier8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeSpecifier8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTypeSpecifier8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTypeSpecifier8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTypeSpecifier8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypeSpecifier8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTypeSpecifier8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTypeSpecifier8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTypeSpecifier8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTypeSpecifier8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleTypeSpecifier8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleTypeSpecifier8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleTypeSpecifier8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleTypeSpecifier8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTypeSpecifier8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTypeSpecifier8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTypeSpecifier8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTypeSpecifier8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTypeSpecifier8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTypeSpecifier8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTypeSpecifier8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleParameterQualifier8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleParameterQualifier8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred323834 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_36_in_synpred323845 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred323857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred616677 = new BitSet(new long[]{0xFFC0001001600010L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred616698 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred616708 = new BitSet(new long[]{0x0030860118000130L});
    public static final BitSet FOLLOW_ruleCastExpression_in_synpred616729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred647095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred877967 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_EXPONENT_in_synpred877989 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred878010 = new BitSet(new long[]{0x0000000000000002L});

}