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

public class InternalFractalIdtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_INCLUDELIB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#ifndef'", "'#endif'", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_INCLUDELIB=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalFractalIdtParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g"; }



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



    // $ANTLR start entryRuleIdtFile
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:73:1: entryRuleIdtFile returns [EObject current=null] : iv_ruleIdtFile= ruleIdtFile EOF ;
    public final EObject entryRuleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdtFile = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:74:2: (iv_ruleIdtFile= ruleIdtFile EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:75:2: iv_ruleIdtFile= ruleIdtFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIdtFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleIdtFile_in_entryRuleIdtFile75);
            iv_ruleIdtFile=ruleIdtFile();
            _fsp--;

             current =iv_ruleIdtFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdtFile85); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:82:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) ) ;
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
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:87:6: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:89:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:89:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:90:3: lv_begindef_0_0= ruleConstantDefinitionBegin
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile131);
            lv_begindef_0_0=ruleConstantDefinitionBegin();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:112:2: ( (lv_def_1_0= ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:113:1: (lv_def_1_0= ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:113:1: (lv_def_1_0= ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:114:3: lv_def_1_0= ruleConstantDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantDefinition_in_ruleIdtFile152);
            lv_def_1_0=ruleConstantDefinition();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:136:2: ( (lv_includes_2_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:137:1: (lv_includes_2_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:137:1: (lv_includes_2_0= ruleIncludeDirective )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:138:3: lv_includes_2_0= ruleIncludeDirective
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncludeDirective_in_ruleIdtFile173);
            	    lv_includes_2_0=ruleIncludeDirective();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:160:3: ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }
                else if ( (LA2_0==15||(LA2_0>=18 && LA2_0<=19)||LA2_0==21) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:160:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:160:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:161:1: (lv_constant_3_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:161:1: (lv_constant_3_0= ruleConstantDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:162:3: lv_constant_3_0= ruleConstantDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleIdtFile196);
            	    lv_constant_3_0=ruleConstantDefinition();
            	    _fsp--;


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
            	    break;
            	case 2 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:185:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:185:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:186:1: (lv_type_4_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:186:1: (lv_type_4_0= ruleTypeDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:187:3: lv_type_4_0= ruleTypeDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleIdtFile223);
            	    lv_type_4_0=ruleTypeDefinition();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:209:4: ( (lv_enddef_5_0= ruleConstantDefinitionEnd ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:210:1: (lv_enddef_5_0= ruleConstantDefinitionEnd )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:210:1: (lv_enddef_5_0= ruleConstantDefinitionEnd )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:211:3: lv_enddef_5_0= ruleConstantDefinitionEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getEnddefConstantDefinitionEndParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile246);
            lv_enddef_5_0=ruleConstantDefinitionEnd();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:241:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:242:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:243:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDefinitionBeginRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin282);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();
            _fsp--;

             current =iv_ruleConstantDefinitionBegin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionBegin292); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:250:1: ruleConstantDefinitionBegin returns [EObject current=null] : ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:255:6: ( ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:256:1: ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:256:1: ( '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:256:3: '#ifndef' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,12,FOLLOW_12_in_ruleConstantDefinitionBegin327); 

                    createLeafNode(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:260:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:261:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:261:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:262:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin344); 

            			createLeafNode(grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:292:1: entryRuleConstantDefinitionEnd returns [EObject current=null] : iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF ;
    public final EObject entryRuleConstantDefinitionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionEnd = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:293:2: (iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:294:2: iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDefinitionEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd385);
            iv_ruleConstantDefinitionEnd=ruleConstantDefinitionEnd();
            _fsp--;

             current =iv_ruleConstantDefinitionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionEnd395); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:301:1: ruleConstantDefinitionEnd returns [EObject current=null] : ( '#endif' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:306:6: ( ( '#endif' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:307:1: ( '#endif' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:307:1: ( '#endif' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:307:3: '#endif' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,13,FOLLOW_13_in_ruleConstantDefinitionEnd430); 

                    createLeafNode(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:311:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:312:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:312:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:313:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinitionEnd447); 

            			createLeafNode(grammarAccess.getConstantDefinitionEndAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:345:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:346:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:347:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition490);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition500); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:354:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:359:6: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:360:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:360:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:360:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:360:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 18:
            case 19:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("360:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:361:5: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition548);
                    this_TypedefSpecification_0=ruleTypedefSpecification();
                    _fsp--;

                     
                            current = this_TypedefSpecification_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:371:5: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition575);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;

                     
                            current = this_StructOrUnionSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:381:5: this_EnumSpecification_2= ruleEnumSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition602);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;

                     
                            current = this_EnumSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleTypeDefinition612); 

                    createLeafNode(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:401:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:402:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:403:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypedefSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification648);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();
            _fsp--;

             current =iv_ruleTypedefSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification658); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:410:1: ruleTypedefSpecification returns [EObject current=null] : ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:415:6: ( ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:416:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:416:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:416:3: 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            match(input,15,FOLLOW_15_in_ruleTypedefSpecification693); 

                    createLeafNode(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:420:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:421:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:421:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:422:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification714);
            lv_qualifedType_1_0=ruleQualifiedTypeSpecification();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:444:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:445:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:445:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:446:3: lv_dec_2_0= ruleDeclarators
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarators_in_ruleTypedefSpecification735);
            lv_dec_2_0=ruleDeclarators();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:476:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:477:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:478:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification771);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();
            _fsp--;

             current =iv_ruleQualifiedTypeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification781); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:485:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:490:6: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:491:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:491:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:491:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:491:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=36 && LA4_0<=37)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:492:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:492:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:493:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification827);
            	    lv_typeQualifier_0_0=ruleTypeQualifier();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:515:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:516:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:516:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:517:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification849);
            lv_typeSpec_1_0=ruleTypeSpecification();
            _fsp--;


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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:547:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:548:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:549:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification885);
            iv_ruleTypeSpecification=ruleTypeSpecification();
            _fsp--;

             current =iv_ruleTypeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification895); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:556:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:561:6: ( ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:562:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:562:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 18:
            case 19:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 33:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("562:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:562:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:562:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:563:1: (lv_typeDefName_0_0= ruleTypedefName )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:563:1: (lv_typeDefName_0_0= ruleTypedefName )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:564:3: lv_typeDefName_0_0= ruleTypedefName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypedefName_in_ruleTypeSpecification941);
                    lv_typeDefName_0_0=ruleTypedefName();
                    _fsp--;


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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:588:5: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification969);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;

                     
                            current = this_StructOrUnionSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:598:5: this_EnumSpecification_2= ruleEnumSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification996);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;

                     
                            current = this_EnumSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:607:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:607:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==33||(LA5_0>=38 && LA5_0<=56)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:608:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:608:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:609:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1022);
                    	    lv_typeSpecifier_3_0=ruleTypeSpecifier();
                    	    _fsp--;


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
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:639:1: entryRuleTypedefName returns [String current=null] : iv_ruleTypedefName= ruleTypedefName EOF ;
    public final String entryRuleTypedefName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypedefName = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:640:2: (iv_ruleTypedefName= ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:641:2: iv_ruleTypedefName= ruleTypedefName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypedefNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName1060);
            iv_ruleTypedefName=ruleTypedefName();
            _fsp--;

             current =iv_ruleTypedefName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName1071); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:648:1: ruleTypedefName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FullyQualifiedName_0= ruleFullyQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypedefName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullyQualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:653:6: (this_FullyQualifiedName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:655:5: this_FullyQualifiedName_0= ruleFullyQualifiedName
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName1117);
            this_FullyQualifiedName_0=ruleFullyQualifiedName();
            _fsp--;


            		current.merge(this_FullyQualifiedName_0);
                
             
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:673:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:674:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:675:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1161);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();
            _fsp--;

             current =iv_ruleStructOrUnionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1171); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:682:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:687:6: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==14||(LA7_3>=24 && LA7_3<=25)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==16) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==16) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==19) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==14||(LA7_3>=24 && LA7_3<=25)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==16) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==16) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("688:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:689:5: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1218);
                    this_StructOrUnionDefinition_0=ruleStructOrUnionDefinition();
                    _fsp--;

                     
                            current = this_StructOrUnionDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:699:5: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1245);
                    this_StructorUnionReference_1=ruleStructorUnionReference();
                    _fsp--;

                     
                            current = this_StructorUnionReference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:715:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:716:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:717:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1280);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();
            _fsp--;

             current =iv_ruleStructOrUnionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1290); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:724:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:729:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:730:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:730:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:730:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:730:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:731:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:731:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:732:3: lv_struct_0_0= ruleStructOrUnion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1336);
            lv_struct_0_0=ruleStructOrUnion();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:754:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:755:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:755:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:756:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1353); 

                    			createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
                    		

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
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleStructOrUnionDefinition1369); 

                    createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:782:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=18 && LA9_0<=19)||LA9_0==21||LA9_0==33||(LA9_0>=36 && LA9_0<=56)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:783:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:783:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:784:3: lv_structMember_3_0= ruleStructMember
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1390);
            	    lv_structMember_3_0=ruleStructMember();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleStructOrUnionDefinition1401); 

                    createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:818:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:819:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:820:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructorUnionReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1437);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();
            _fsp--;

             current =iv_ruleStructorUnionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference1447); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:827:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:832:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:833:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:833:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:833:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:833:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:834:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:834:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:835:3: lv_struct_0_0= ruleStructOrUnion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1493);
            lv_struct_0_0=ruleStructOrUnion();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:857:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:858:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:858:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:859:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructorUnionReference1510); 

            			createLeafNode(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:889:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:890:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:891:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1552);
            iv_ruleStructOrUnion=ruleStructOrUnion();
            _fsp--;

             current =iv_ruleStructOrUnion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion1563); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:898:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:903:6: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:904:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:904:1: (kw= 'struct' | kw= 'union' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("904:1: (kw= 'struct' | kw= 'union' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:905:2: kw= 'struct'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleStructOrUnion1601); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getStructOrUnionAccess().getStructKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:912:2: kw= 'union'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleStructOrUnion1620); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:925:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:926:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:927:2: iv_ruleStructMember= ruleStructMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember1660);
            iv_ruleStructMember=ruleStructMember();
            _fsp--;

             current =iv_ruleStructMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember1670); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:934:1: ruleStructMember returns [EObject current=null] : ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        EObject lv_qualType_0_0 = null;

        EObject lv_dec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:939:6: ( ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:940:1: ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:940:1: ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:940:2: ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:940:2: ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:941:1: (lv_qualType_0_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:941:1: (lv_qualType_0_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:942:3: lv_qualType_0_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1716);
            lv_qualType_0_0=ruleQualifiedTypeSpecification();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructMemberRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"qualType",
            	        		lv_qualType_0_0, 
            	        		"QualifiedTypeSpecification", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:964:2: ( (lv_dec_1_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:965:1: (lv_dec_1_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:965:1: (lv_dec_1_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:966:3: lv_dec_1_0= ruleDeclarators
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarators_in_ruleStructMember1737);
            lv_dec_1_0=ruleDeclarators();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructMemberRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dec",
            	        		lv_dec_1_0, 
            	        		"Declarators", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:988:2: ( ':' RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:988:4: ':' RULE_INT
                    {
                    match(input,20,FOLLOW_20_in_ruleStructMember1748); 

                            createLeafNode(grammarAccess.getStructMemberAccess().getColonKeyword_2_0(), null); 
                        
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStructMember1757); 
                     
                        createLeafNode(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1(), null); 
                        

                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleStructMember1768); 

                    createLeafNode(grammarAccess.getStructMemberAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1008:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1009:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1010:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1804);
            iv_ruleEnumSpecification=ruleEnumSpecification();
            _fsp--;

             current =iv_ruleEnumSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification1814); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1017:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1022:6: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1023:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1023:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==16) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==14||(LA12_2>=24 && LA12_2<=25)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1023:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1==16) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1023:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1023:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1024:5: this_EnumDefinition_0= ruleEnumDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1861);
                    this_EnumDefinition_0=ruleEnumDefinition();
                    _fsp--;

                     
                            current = this_EnumDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1034:5: this_EnumReference_1= ruleEnumReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumReference_in_ruleEnumSpecification1888);
                    this_EnumReference_1=ruleEnumReference();
                    _fsp--;

                     
                            current = this_EnumReference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1050:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1051:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1052:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1923);
            iv_ruleEnumDefinition=ruleEnumDefinition();
            _fsp--;

             current =iv_ruleEnumDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition1933); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1059:1: ruleEnumDefinition returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_enumMemberList_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1064:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1065:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1065:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1065:3: 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}'
            {
            match(input,21,FOLLOW_21_in_ruleEnumDefinition1968); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1069:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1070:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1070:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1071:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDefinition1985); 

                    			createLeafNode(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
                    		

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
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleEnumDefinition2001); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1097:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1098:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1098:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1099:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2022);
            lv_enumMemberList_3_0=ruleEnumMemberList();
            _fsp--;


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

            match(input,17,FOLLOW_17_in_ruleEnumDefinition2032); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1133:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1134:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1135:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference2068);
            iv_ruleEnumReference=ruleEnumReference();
            _fsp--;

             current =iv_ruleEnumReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference2078); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1142:1: ruleEnumReference returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1147:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1148:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1148:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1148:3: 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,21,FOLLOW_21_in_ruleEnumReference2113); 

                    createLeafNode(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1152:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1153:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1153:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1154:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumReference2130); 

            			createLeafNode(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1184:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1185:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1186:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumMemberListRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2171);
            iv_ruleEnumMemberList=ruleEnumMemberList();
            _fsp--;

             current =iv_ruleEnumMemberList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList2181); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1193:1: ruleEnumMemberList returns [EObject current=null] : (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject this_EnumMember_0 = null;

        EObject lv_enumMember_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1198:6: ( (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1199:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1199:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1200:5: this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList2228);
            this_EnumMember_0=ruleEnumMember();
            _fsp--;

             
                    current = this_EnumMember_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1208:1: ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1208:3: ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleEnumMemberList2238); 

            	            createLeafNode(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1212:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1213:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1213:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1214:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList2259);
            	    lv_enumMember_2_0=ruleEnumMember();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1244:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1245:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1246:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember2297);
            iv_ruleEnumMember=ruleEnumMember();
            _fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember2307); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1253:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1258:6: ( ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1259:1: ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1259:1: ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1259:2: ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1259:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1260:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1260:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1261:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember2349); 

            			createLeafNode(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumMemberRule().getType().getClassifier());
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1283:2: ( '=' RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1283:4: '=' RULE_INT
                    {
                    match(input,23,FOLLOW_23_in_ruleEnumMember2365); 

                            createLeafNode(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0(), null); 
                        
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumMember2374); 
                     
                        createLeafNode(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1299:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1300:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1301:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaratorsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators2411);
            iv_ruleDeclarators=ruleDeclarators();
            _fsp--;

             current =iv_ruleDeclarators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators2421); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1308:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1313:6: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1314:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1314:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1314:2: ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1314:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1315:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1315:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1316:3: lv_dec_0_0= ruleDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2467);
            lv_dec_0_0=ruleDeclarator();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1338:2: ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1338:4: ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleDeclarators2478); 

            	            createLeafNode(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1342:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1343:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1343:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1344:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2499);
            	    lv_declaratorList_2_0=ruleDeclarator();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1374:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1375:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1376:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator2537);
            iv_ruleDeclarator=ruleDeclarator();
            _fsp--;

             current =iv_ruleDeclarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator2547); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1383:1: ruleDeclarator returns [EObject current=null] : ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_1_0 = null;

        EObject lv_dc_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1388:6: ( ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1389:1: ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1389:1: ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1389:2: ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1389:2: ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1389:4: '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )*
            	    {
            	    match(input,24,FOLLOW_24_in_ruleDeclarator2583); 

            	            createLeafNode(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1393:1: ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( ((LA17_0>=36 && LA17_0<=37)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1394:1: (lv_typeQualifier_1_0= ruleTypeQualifier )
            	    	    {
            	    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1394:1: (lv_typeQualifier_1_0= ruleTypeQualifier )
            	    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1395:3: lv_typeQualifier_1_0= ruleTypeQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleDeclarator2604);
            	    	    lv_typeQualifier_1_0=ruleTypeQualifier();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getDeclaratorRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"typeQualifier",
            	    	    	        		lv_typeQualifier_1_0, 
            	    	    	        		"TypeQualifier", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1417:5: ( (lv_dc_2_0= ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1418:1: (lv_dc_2_0= ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1418:1: (lv_dc_2_0= ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1419:3: lv_dc_2_0= ruleDirectDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2628);
            lv_dc_2_0=ruleDirectDeclarator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclaratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dc",
            	        		lv_dc_2_0, 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleDirectDeclarator
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1449:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1450:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1451:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectDeclaratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2664);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();
            _fsp--;

             current =iv_ruleDirectDeclarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator2674); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1458:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject this_Declarator_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1463:6: ( ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1464:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1464:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1464:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1464:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==25) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1464:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1464:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1464:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1465:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1465:1: (lv_id_0_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1466:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectDeclarator2717); 

                    			createLeafNode(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0(), "id"); 
                    		

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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1489:6: ( '(' this_Declarator_2= ruleDeclarator ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1489:6: ( '(' this_Declarator_2= ruleDeclarator ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1489:8: '(' this_Declarator_2= ruleDeclarator ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleDirectDeclarator2739); 

                            createLeafNode(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2761);
                    this_Declarator_2=ruleDeclarator();
                    _fsp--;

                     
                            current = this_Declarator_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,26,FOLLOW_26_in_ruleDirectDeclarator2770); 

                            createLeafNode(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1506:3: ( ruleArraySpecification )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1506:4: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2782);
            	    ruleArraySpecification();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1514:1: entryRuleArraySpecification returns [String current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final String entryRuleArraySpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1515:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1516:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArraySpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2813);
            iv_ruleArraySpecification=ruleArraySpecification();
            _fsp--;

             current =iv_ruleArraySpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification2824); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1523:1: ruleArraySpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArraySpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1528:6: ( (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1529:1: (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1529:1: (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1530:2: kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']'
            {
            kw=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleArraySpecification2862); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1535:1: (this_INT_1= RULE_INT | this_ID_2= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1535:1: (this_INT_1= RULE_INT | this_ID_2= RULE_ID )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1535:6: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArraySpecification2878); 

                    		current.merge(this_INT_1);
                        
                     
                        createLeafNode(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1543:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArraySpecification2904); 

                    		current.merge(this_ID_2);
                        
                     
                        createLeafNode(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleArraySpecification2923); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1564:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1565:2: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1566:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName2964);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;

             current =iv_ruleFullyQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName2975); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1573:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1578:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1579:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1579:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1579:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName3015); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1586:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1587:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,29,FOLLOW_29_in_ruleFullyQualifiedName3034); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName3049); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1607:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1608:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1609:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3096);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition3106); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1616:1: ruleConstantDefinition returns [EObject current=null] : ( '#define' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1621:6: ( ( '#define' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1622:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1622:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1622:3: '#define' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,30,FOLLOW_30_in_ruleConstantDefinition3141); 

                    createLeafNode(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1626:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1627:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1627:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1628:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition3158); 

            			createLeafNode(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

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


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1658:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1659:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1660:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3199);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition3209); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1667:1: ruleInterfaceDefinition returns [EObject current=null] : ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fqn_2_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_4_0 = null;

        EObject lv_methodDef_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1672:6: ( ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1673:1: ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1673:1: ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1673:3: 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}'
            {
            match(input,31,FOLLOW_31_in_ruleInterfaceDefinition3244); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1677:1: ( 'unmanaged' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1677:3: 'unmanaged'
                    {
                    match(input,32,FOLLOW_32_in_ruleInterfaceDefinition3255); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1681:3: ( (lv_fqn_2_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1682:1: (lv_fqn_2_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1682:1: (lv_fqn_2_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1683:3: lv_fqn_2_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3278);
            lv_fqn_2_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"fqn",
            	        		lv_fqn_2_0, 
            	        		"FullyQualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1705:2: ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1705:4: ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleInterfaceDefinition3289); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1709:1: ( (lv_fqn2_4_0= ruleFullyQualifiedName ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1710:1: (lv_fqn2_4_0= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1710:1: (lv_fqn2_4_0= ruleFullyQualifiedName )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1711:3: lv_fqn2_4_0= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3310);
                    lv_fqn2_4_0=ruleFullyQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fqn2",
                    	        		lv_fqn2_4_0, 
                    	        		"FullyQualifiedName", 
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

            match(input,16,FOLLOW_16_in_ruleInterfaceDefinition3322); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1737:1: ( (lv_methodDef_6_0= ruleMethodDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=18 && LA25_0<=19)||LA25_0==21||LA25_0==33||(LA25_0>=36 && LA25_0<=56)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1738:1: (lv_methodDef_6_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1738:1: (lv_methodDef_6_0= ruleMethodDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1739:3: lv_methodDef_6_0= ruleMethodDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3343);
            	    lv_methodDef_6_0=ruleMethodDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"methodDef",
            	    	        		lv_methodDef_6_0, 
            	    	        		"MethodDefinition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleInterfaceDefinition3354); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1774:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1775:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3390);
            iv_ruleMethodDefinition=ruleMethodDefinition();
            _fsp--;

             current =iv_ruleMethodDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition3400); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1782:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_qualifiedTypeSpec_0_0 = null;

        EObject lv_ParameterList_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1787:6: ( ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1788:1: ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1788:1: ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1788:2: ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1788:2: ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1789:1: (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1789:1: (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1790:3: lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3446);
            lv_qualifiedTypeSpec_0_0=ruleQualifiedTypeSpecification();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"qualifiedTypeSpec",
            	        		lv_qualifiedTypeSpec_0_0, 
            	        		"QualifiedTypeSpecification", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1812:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1813:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1813:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1814:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodDefinition3463); 

            			createLeafNode(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_1_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1836:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==RULE_ID||(LA27_2>=24 && LA27_2<=25)||LA27_2==33||(LA27_2>=38 && LA27_2<=56)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_2==26) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1836:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 27, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_ID:
                case 18:
                case 19:
                case 21:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1836:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 27, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1836:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1836:3: ( '(' ( 'void' )? ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1836:3: ( '(' ( 'void' )? ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1836:5: '(' ( 'void' )? ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleMethodDefinition3480); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1840:1: ( 'void' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==33) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1840:3: 'void'
                            {
                            match(input,33,FOLLOW_33_in_ruleMethodDefinition3491); 

                                    createLeafNode(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,26,FOLLOW_26_in_ruleMethodDefinition3503); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1849:6: ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1849:6: ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1849:8: '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleMethodDefinition3521); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1853:1: ( (lv_ParameterList_6_0= ruleParameterList ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1854:1: (lv_ParameterList_6_0= ruleParameterList )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1854:1: (lv_ParameterList_6_0= ruleParameterList )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1855:3: lv_ParameterList_6_0= ruleParameterList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleMethodDefinition3542);
                    lv_ParameterList_6_0=ruleParameterList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ParameterList",
                    	        		lv_ParameterList_6_0, 
                    	        		"ParameterList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleMethodDefinition3552); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleMethodDefinition3564); 

                    createLeafNode(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1893:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1894:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1895:2: iv_ruleParameterList= ruleParameterList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterListRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3600);
            iv_ruleParameterList=ruleParameterList();
            _fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3610); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1902:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1907:6: ( ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1908:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1908:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1908:2: ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1908:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1909:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1909:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1910:3: lv_param_0_0= ruleParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3656);
            lv_param_0_0=ruleParameter();
            _fsp--;


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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1932:2: ( ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID||(LA28_1>=18 && LA28_1<=19)||LA28_1==21||LA28_1==33||(LA28_1>=36 && LA28_1<=58)) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1932:4: ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleParameterList3667); 

            	            createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1936:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1937:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1937:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1938:3: lv_params_2_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3688);
            	    lv_params_2_0=ruleParameter();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1960:4: ( ',' '...' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1960:6: ',' '...'
                    {
                    match(input,22,FOLLOW_22_in_ruleParameterList3701); 

                            createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_2_0(), null); 
                        
                    match(input,34,FOLLOW_34_in_ruleParameterList3711); 

                            createLeafNode(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1976:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1977:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1978:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3749);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3759); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1985:1: ruleParameter returns [EObject current=null] : ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_ParameterQualifier_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1990:6: ( ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1991:1: ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1991:1: ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1991:2: ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1991:2: ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=57 && LA30_0<=58)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1992:1: (lv_ParameterQualifier_0_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1992:1: (lv_ParameterQualifier_0_0= ruleParameterQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1993:3: lv_ParameterQualifier_0_0= ruleParameterQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterQualifier_in_ruleParameter3805);
            	    lv_ParameterQualifier_0_0=ruleParameterQualifier();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ParameterQualifier",
            	    	        		lv_ParameterQualifier_0_0, 
            	    	        		"ParameterQualifier", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2015:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2016:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2016:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2017:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3827);
            lv_qualifiedTypeSpec_1_0=ruleQualifiedTypeSpecification();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2039:2: ( (lv_dec_2_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2040:1: (lv_dec_2_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2040:1: (lv_dec_2_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2041:3: lv_dec_2_0= ruleDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarator_in_ruleParameter3848);
            lv_dec_2_0=ruleDeclarator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
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


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2071:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2072:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2073:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludeDirectiveRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3884);
            iv_ruleIncludeDirective=ruleIncludeDirective();
            _fsp--;

             current =iv_ruleIncludeDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective3894); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2080:1: ruleIncludeDirective returns [EObject current=null] : ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2085:6: ( ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2086:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2086:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2086:3: '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            {
            match(input,35,FOLLOW_35_in_ruleIncludeDirective3929); 

                    createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2090:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_INCLUDELIB) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2090:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2090:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2090:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2091:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2091:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2092:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeDirective3947); 

                    			createLeafNode(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0(), "importedURI"); 
                    		

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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2115:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2115:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2116:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2116:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2117:3: lv_includeID_2_0= RULE_INCLUDELIB
                    {
                    lv_includeID_2_0=(Token)input.LT(1);
                    match(input,RULE_INCLUDELIB,FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective3975); 

                    			createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0(), "includeID"); 
                    		

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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2147:1: ruleTypeQualifier returns [Enumerator current=null] : ( ( 'const' ) | ( 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2151:6: ( ( ( 'const' ) | ( 'volatile' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2152:1: ( ( 'const' ) | ( 'volatile' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2152:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            else if ( (LA32_0==37) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2152:1: ( ( 'const' ) | ( 'volatile' ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2152:2: ( 'const' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2152:2: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2152:4: 'const'
                    {
                    match(input,36,FOLLOW_36_in_ruleTypeQualifier4029); 

                            current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2158:6: ( 'volatile' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2158:6: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2158:8: 'volatile'
                    {
                    match(input,37,FOLLOW_37_in_ruleTypeQualifier4044); 

                            current = grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2168:1: ruleTypeSpecifier returns [Enumerator current=null] : ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2172:6: ( ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2173:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2173:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt33=20;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt33=1;
                }
                break;
            case 38:
                {
                alt33=2;
                }
                break;
            case 39:
                {
                alt33=3;
                }
                break;
            case 40:
                {
                alt33=4;
                }
                break;
            case 41:
                {
                alt33=5;
                }
                break;
            case 42:
                {
                alt33=6;
                }
                break;
            case 43:
                {
                alt33=7;
                }
                break;
            case 44:
                {
                alt33=8;
                }
                break;
            case 45:
                {
                alt33=9;
                }
                break;
            case 46:
                {
                alt33=10;
                }
                break;
            case 47:
                {
                alt33=11;
                }
                break;
            case 48:
                {
                alt33=12;
                }
                break;
            case 49:
                {
                alt33=13;
                }
                break;
            case 50:
                {
                alt33=14;
                }
                break;
            case 51:
                {
                alt33=15;
                }
                break;
            case 52:
                {
                alt33=16;
                }
                break;
            case 53:
                {
                alt33=17;
                }
                break;
            case 54:
                {
                alt33=18;
                }
                break;
            case 55:
                {
                alt33=19;
                }
                break;
            case 56:
                {
                alt33=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2173:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2173:2: ( 'void' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2173:2: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2173:4: 'void'
                    {
                    match(input,33,FOLLOW_33_in_ruleTypeSpecifier4087); 

                            current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2179:6: ( 'char' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2179:6: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2179:8: 'char'
                    {
                    match(input,38,FOLLOW_38_in_ruleTypeSpecifier4102); 

                            current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2185:6: ( 'short' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2185:6: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2185:8: 'short'
                    {
                    match(input,39,FOLLOW_39_in_ruleTypeSpecifier4117); 

                            current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2191:6: ( 'int' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2191:6: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2191:8: 'int'
                    {
                    match(input,40,FOLLOW_40_in_ruleTypeSpecifier4132); 

                            current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2197:6: ( 'long' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2197:6: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2197:8: 'long'
                    {
                    match(input,41,FOLLOW_41_in_ruleTypeSpecifier4147); 

                            current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:6: ( 'float' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:6: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2203:8: 'float'
                    {
                    match(input,42,FOLLOW_42_in_ruleTypeSpecifier4162); 

                            current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2209:6: ( 'double' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2209:6: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2209:8: 'double'
                    {
                    match(input,43,FOLLOW_43_in_ruleTypeSpecifier4177); 

                            current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2215:6: ( 'signed' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2215:6: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2215:8: 'signed'
                    {
                    match(input,44,FOLLOW_44_in_ruleTypeSpecifier4192); 

                            current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2221:6: ( 'unsigned' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2221:6: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2221:8: 'unsigned'
                    {
                    match(input,45,FOLLOW_45_in_ruleTypeSpecifier4207); 

                            current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2227:6: ( 'string' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2227:6: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2227:8: 'string'
                    {
                    match(input,46,FOLLOW_46_in_ruleTypeSpecifier4222); 

                            current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2233:6: ( 'int8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2233:6: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2233:8: 'int8_t'
                    {
                    match(input,47,FOLLOW_47_in_ruleTypeSpecifier4237); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2239:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2239:6: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2239:8: 'uint8_t'
                    {
                    match(input,48,FOLLOW_48_in_ruleTypeSpecifier4252); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2245:6: ( 'int16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2245:6: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2245:8: 'int16_t'
                    {
                    match(input,49,FOLLOW_49_in_ruleTypeSpecifier4267); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2251:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2251:6: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2251:8: 'uint16_t'
                    {
                    match(input,50,FOLLOW_50_in_ruleTypeSpecifier4282); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2257:6: ( 'int32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2257:6: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2257:8: 'int32_t'
                    {
                    match(input,51,FOLLOW_51_in_ruleTypeSpecifier4297); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2263:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2263:6: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2263:8: 'uint32_t'
                    {
                    match(input,52,FOLLOW_52_in_ruleTypeSpecifier4312); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2269:6: ( 'int64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2269:6: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2269:8: 'int64_t'
                    {
                    match(input,53,FOLLOW_53_in_ruleTypeSpecifier4327); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:6: ( 'uint64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:6: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2275:8: 'uint64_t'
                    {
                    match(input,54,FOLLOW_54_in_ruleTypeSpecifier4342); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2281:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2281:6: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2281:8: 'intptr_t'
                    {
                    match(input,55,FOLLOW_55_in_ruleTypeSpecifier4357); 

                            current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2287:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2287:6: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2287:8: 'uintptr_t'
                    {
                    match(input,56,FOLLOW_56_in_ruleTypeSpecifier4372); 

                            current = grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2297:1: ruleParameterQualifier returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2301:6: ( ( ( 'in' ) | ( 'out' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2302:1: ( ( 'in' ) | ( 'out' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2302:1: ( ( 'in' ) | ( 'out' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            else if ( (LA34_0==58) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2302:1: ( ( 'in' ) | ( 'out' ) )", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2302:2: ( 'in' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2302:2: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2302:4: 'in'
                    {
                    match(input,57,FOLLOW_57_in_ruleParameterQualifier4415); 

                            current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2308:6: ( 'out' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2308:6: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2308:8: 'out'
                    {
                    match(input,58,FOLLOW_58_in_ruleParameterQualifier4430); 

                            current = grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile131 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile152 = new BitSet(new long[]{0x00000008402CA000L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile173 = new BitSet(new long[]{0x00000008402CA000L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile196 = new BitSet(new long[]{0x00000000402CA000L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile223 = new BitSet(new long[]{0x00000000402CA000L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstantDefinitionBegin327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConstantDefinitionEnd430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionEnd447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition548 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition575 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition602 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDefinition612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTypedefSpecification693 = new BitSet(new long[]{0x01FFFFF2002C0010L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification714 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification827 = new BitSet(new long[]{0x01FFFFF2002C0010L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_ruleTypeSpecification941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1022 = new BitSet(new long[]{0x01FFFFC200000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1336 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1353 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructOrUnionDefinition1369 = new BitSet(new long[]{0x01FFFFF2002E0010L});
    public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1390 = new BitSet(new long[]{0x01FFFFF2002E0010L});
    public static final BitSet FOLLOW_17_in_ruleStructOrUnionDefinition1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStructOrUnion1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStructOrUnion1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1716 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1737 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_ruleStructMember1748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStructMember1757 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStructMember1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEnumDefinition1968 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1985 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumDefinition2001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2022 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDefinition2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference2068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEnumReference2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2228 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleEnumMemberList2238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2259 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2349 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleEnumMember2365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumMember2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2467 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDeclarators2478 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2499 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDeclarator2583 = new BitSet(new long[]{0x0000003003000010L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleDeclarator2604 = new BitSet(new long[]{0x0000003003000010L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator2717 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25_in_ruleDirectDeclarator2739 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2761 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDirectDeclarator2770 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2782 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleArraySpecification2862 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArraySpecification2878 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArraySpecification2904 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArraySpecification2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3015 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleFullyQualifiedName3034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3049 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConstantDefinition3141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition3244 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition3255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3278 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceDefinition3289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3310 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceDefinition3322 = new BitSet(new long[]{0x01FFFFF2002E0010L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3343 = new BitSet(new long[]{0x01FFFFF2002E0010L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceDefinition3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMethodDefinition3480 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_33_in_ruleMethodDefinition3491 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMethodDefinition3503 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25_in_ruleMethodDefinition3521 = new BitSet(new long[]{0x07FFFFF2002C0010L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3542 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMethodDefinition3552 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethodDefinition3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3656 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameterList3667 = new BitSet(new long[]{0x07FFFFF2002C0010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3688 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameterList3701 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParameterList3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter3805 = new BitSet(new long[]{0x07FFFFF2002C0010L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3827 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleIncludeDirective3929 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeQualifier4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeQualifier4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTypeSpecifier4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeSpecifier4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeSpecifier4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeSpecifier4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeSpecifier4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeSpecifier4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeSpecifier4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeSpecifier4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeSpecifier4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeSpecifier4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeSpecifier4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeSpecifier4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeSpecifier4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeSpecifier4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeSpecifier4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeSpecifier4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeSpecifier4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeSpecifier4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeSpecifier4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTypeSpecifier4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleParameterQualifier4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleParameterQualifier4430 = new BitSet(new long[]{0x0000000000000002L});

}