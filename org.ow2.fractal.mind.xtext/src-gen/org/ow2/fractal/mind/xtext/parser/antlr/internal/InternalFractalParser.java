package org.ow2.fractal.mind.xtext.parser.antlr.internal; 

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
import org.ow2.fractal.mind.xtext.services.FractalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalFractalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_CODEC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'composite'", "'<'", "','", "'>'", "'('", "')'", "'extends'", "'contains'", "'as'", "'='", "'attribute'", "'['", "']'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'nodata'", "'source'", "'conformsto'", "'@'", "'0x'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'.*'", "'+'", "'-'", "'optional'", "'mandatory'", "'provides'", "'requires'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_CODEC=7;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_PATH=6;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalFractalParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[197+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalGrammarAccess grammarAccess;
     	
        public InternalFractalParser(TokenStream input, IAstFactory factory, FractalGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlDefinition";	
       	} 



    // $ANTLR start entryRuleAdlDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:79:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:80:2: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:81:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdlDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81);
            iv_ruleAdlDefinition=ruleAdlDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAdlDefinition


    // $ANTLR start ruleAdlDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:88:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_definitionAnnotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architecturedefinition_2_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_definitionAnnotationsList_1_0 = null;

        EObject lv_architecturedefinition_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:93:6: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_definitionAnnotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architecturedefinition_2_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:94:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_definitionAnnotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architecturedefinition_2_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:94:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_definitionAnnotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architecturedefinition_2_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:94:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_definitionAnnotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architecturedefinition_2_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:94:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:95:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:95:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:96:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137);
            	    lv_imports_0_0=ruleImportDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"imports",
            	      	        		lv_imports_0_0, 
            	      	        		"ImportDefinition", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:118:3: ( (lv_definitionAnnotationsList_1_0= ruleAnnotationsList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:119:1: (lv_definitionAnnotationsList_1_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:119:1: (lv_definitionAnnotationsList_1_0= ruleAnnotationsList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:120:3: lv_definitionAnnotationsList_1_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getDefinitionAnnotationsListAnnotationsListParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition159);
                    lv_definitionAnnotationsList_1_0=ruleAnnotationsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"definitionAnnotationsList",
                      	        		lv_definitionAnnotationsList_1_0, 
                      	        		"AnnotationsList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:142:3: ( (lv_architecturedefinition_2_0= ruleArchitectureDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:143:1: (lv_architecturedefinition_2_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:143:1: (lv_architecturedefinition_2_0= ruleArchitectureDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:144:3: lv_architecturedefinition_2_0= ruleArchitectureDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitecturedefinitionArchitectureDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition181);
            lv_architecturedefinition_2_0=ruleArchitectureDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"architecturedefinition",
              	        		lv_architecturedefinition_2_0, 
              	        		"ArchitectureDefinition", 
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
    // $ANTLR end ruleAdlDefinition


    // $ANTLR start entryRuleImportDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:174:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:175:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:176:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition217);
            iv_ruleImportDefinition=ruleImportDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition227); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImportDefinition


    // $ANTLR start ruleImportDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:183:1: ruleImportDefinition returns [EObject current=null] : ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importName_1_1 = null;

        AntlrDatatypeRuleToken lv_importName_1_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:188:6: ( ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:189:1: ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:189:1: ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:189:3: 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleImportDefinition262); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportDefinitionAccess().getImportKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:193:1: ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:194:1: ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:194:1: ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:195:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:195:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:196:3: lv_importName_1_1= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFQNParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleImportDefinition285);
                    lv_importName_1_1=ruleFQN();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImportDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"importName",
                      	        		lv_importName_1_1, 
                      	        		"FQN", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:217:8: lv_importName_1_2= ruleFULL_IMPORT_NAME
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFULL_IMPORT_NAMEParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition304);
                    lv_importName_1_2=ruleFULL_IMPORT_NAME();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImportDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"importName",
                      	        		lv_importName_1_2, 
                      	        		"FULL_IMPORT_NAME", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            match(input,14,FOLLOW_14_in_ruleImportDefinition317); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_2(), null); 
                  
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
    // $ANTLR end ruleImportDefinition


    // $ANTLR start entryRuleArchitectureDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:253:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:254:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:255:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArchitectureDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition353);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition363); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArchitectureDefinition


    // $ANTLR start ruleArchitectureDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:262:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:267:6: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:268:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:268:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 15:
            case 16:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("268:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:269:2: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition413);
                    this_ComponentTypeDefinition_0=ruleComponentTypeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ComponentTypeDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:282:2: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition443);
                    this_PrimitiveComponentDefinition_1=rulePrimitiveComponentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveComponentDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:295:2: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition473);
                    this_CompositeComponentDefinition_2=ruleCompositeComponentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompositeComponentDefinition_2; 
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
    // $ANTLR end ruleArchitectureDefinition


    // $ANTLR start entryRulePrimitiveComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:314:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:315:2: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:316:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition508);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition518); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveComponentDefinition


    // $ANTLR start rulePrimitiveComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:323:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? 'primitive' ( (lv_name_2_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= rulePrimitiveReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* ) ) ;
    public final EObject rulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_primitiveFormalArgumentsList_3_0 = null;

        EObject lv_referencesList_4_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;

        EObject lv_elements_10_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:328:6: ( ( ( (lv_abstract_0_0= 'abstract' ) )? 'primitive' ( (lv_name_2_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= rulePrimitiveReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:329:1: ( ( (lv_abstract_0_0= 'abstract' ) )? 'primitive' ( (lv_name_2_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= rulePrimitiveReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:329:1: ( ( (lv_abstract_0_0= 'abstract' ) )? 'primitive' ( (lv_name_2_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= rulePrimitiveReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:329:2: ( (lv_abstract_0_0= 'abstract' ) )? 'primitive' ( (lv_name_2_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= rulePrimitiveReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:329:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:330:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:330:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:331:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePrimitiveComponentDefinition561); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getAbstractAbstractKeyword_0_0(), "abstract"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "abstract", true, "abstract", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_rulePrimitiveComponentDefinition585); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:354:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:355:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:355:1: (lv_name_2_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:356:3: lv_name_2_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition606);
            lv_name_2_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:378:2: ( (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:379:1: (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:379:1: (lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:380:3: lv_primitiveFormalArgumentsList_3_0= ruleFormalArgumentsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition627);
                    lv_primitiveFormalArgumentsList_3_0=ruleFormalArgumentsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"primitiveFormalArgumentsList",
                      	        		lv_primitiveFormalArgumentsList_3_0, 
                      	        		"FormalArgumentsList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:402:3: ( (lv_referencesList_4_0= rulePrimitiveReferencesList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:403:1: (lv_referencesList_4_0= rulePrimitiveReferencesList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:403:1: (lv_referencesList_4_0= rulePrimitiveReferencesList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:404:3: lv_referencesList_4_0= rulePrimitiveReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getReferencesListPrimitiveReferencesListParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition649);
                    lv_referencesList_4_0=rulePrimitiveReferencesList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referencesList",
                      	        		lv_referencesList_4_0, 
                      	        		"PrimitiveReferencesList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:426:3: ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||LA12_0==30||(LA12_0>=37 && LA12_0<=39)||LA12_0==41||(LA12_0>=55 && LA12_0<=56)) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("426:3: ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )* )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:426:4: ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:426:4: ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:426:6: '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_rulePrimitiveComponentDefinition662); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:430:1: ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==30||(LA9_0>=37 && LA9_0<=39)||LA9_0==41||(LA9_0>=55 && LA9_0<=56)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:430:2: ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:430:2: ( (lv_elements_6_0= ruleAnnotationsList ) )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==41) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:431:1: (lv_elements_6_0= ruleAnnotationsList )
                    	            {
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:431:1: (lv_elements_6_0= ruleAnnotationsList )
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:432:3: lv_elements_6_0= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition684);
                    	            lv_elements_6_0=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"elements",
                    	              	        		lv_elements_6_0, 
                    	              	        		"AnnotationsList", 
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

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:454:3: ( (lv_elements_7_0= rulePrimitiveDefinitionElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:455:1: (lv_elements_7_0= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:455:1: (lv_elements_7_0= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:456:3: lv_elements_7_0= rulePrimitiveDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition706);
                    	    lv_elements_7_0=rulePrimitiveDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"elements",
                    	      	        		lv_elements_7_0, 
                    	      	        		"PrimitiveDefinitionElement", 
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
                    	    break loop9;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_rulePrimitiveComponentDefinition718); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:6: ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:6: ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==30||(LA11_0>=37 && LA11_0<=39)||LA11_0==41||(LA11_0>=55 && LA11_0<=56)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:7: ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:7: ( (lv_elements_9_0= ruleAnnotationsList ) )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==41) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:484:1: (lv_elements_9_0= ruleAnnotationsList )
                    	            {
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:484:1: (lv_elements_9_0= ruleAnnotationsList )
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:485:3: lv_elements_9_0= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition747);
                    	            lv_elements_9_0=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"elements",
                    	              	        		lv_elements_9_0, 
                    	              	        		"AnnotationsList", 
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

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:507:3: ( (lv_elements_10_0= rulePrimitiveDefinitionElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:508:1: (lv_elements_10_0= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:508:1: (lv_elements_10_0= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:509:3: lv_elements_10_0= rulePrimitiveDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition769);
                    	    lv_elements_10_0=rulePrimitiveDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"elements",
                    	      	        		lv_elements_10_0, 
                    	      	        		"PrimitiveDefinitionElement", 
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
                    	    break loop11;
                        }
                    } while (true);


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
    // $ANTLR end rulePrimitiveComponentDefinition


    // $ANTLR start entryRulePrimitiveDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:539:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:540:2: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement808);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement818); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveDefinitionElement


    // $ANTLR start rulePrimitiveDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:548:1: rulePrimitiveDefinitionElement returns [EObject current=null] : ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:553:6: ( ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:554:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:554:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:554:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:554:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 55:
            case 56:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 37:
            case 38:
                {
                alt13=3;
                }
                break;
            case 39:
                {
                alt13=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("554:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:555:2: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement869);
                    this_InterfaceDefinition_0=ruleInterfaceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:568:2: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement899);
                    this_AttributeDefinition_1=ruleAttributeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AttributeDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:581:2: this_DataDefinition_2= ruleDataDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement929);
                    this_DataDefinition_2=ruleDataDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DataDefinition_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:594:2: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_0_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement959);
                    this_ImplementationDefinition_3=ruleImplementationDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ImplementationDefinition_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:605:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:605:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_rulePrimitiveDefinitionElement970); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                          
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
    // $ANTLR end rulePrimitiveDefinitionElement


    // $ANTLR start entryRuleComponentTypeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:617:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:618:2: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:619:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getComponentTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1008);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComponentTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentTypeDefinition1018); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComponentTypeDefinition


    // $ANTLR start ruleComponentTypeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:1: ruleComponentTypeDefinition returns [EObject current=null] : ( 'type' ( (lv_name_1_0= ruleFQN ) ) ( (lv_referencesList_2_0= ruleTypeReferencesList ) )? ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) ) ) ;
    public final EObject ruleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_referencesList_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:631:6: ( ( 'type' ( (lv_name_1_0= ruleFQN ) ) ( (lv_referencesList_2_0= ruleTypeReferencesList ) )? ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:632:1: ( 'type' ( (lv_name_1_0= ruleFQN ) ) ( (lv_referencesList_2_0= ruleTypeReferencesList ) )? ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:632:1: ( 'type' ( (lv_name_1_0= ruleFQN ) ) ( (lv_referencesList_2_0= ruleTypeReferencesList ) )? ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:632:3: 'type' ( (lv_name_1_0= ruleFQN ) ) ( (lv_referencesList_2_0= ruleTypeReferencesList ) )? ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) )
            {
            match(input,19,FOLLOW_19_in_ruleComponentTypeDefinition1053); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:636:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:637:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:637:1: (lv_name_1_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:638:3: lv_name_1_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1074);
            lv_name_1_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:660:2: ( (lv_referencesList_2_0= ruleTypeReferencesList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:661:1: (lv_referencesList_2_0= ruleTypeReferencesList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:661:1: (lv_referencesList_2_0= ruleTypeReferencesList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:662:3: lv_referencesList_2_0= ruleTypeReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getReferencesListTypeReferencesListParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1095);
                    lv_referencesList_2_0=ruleTypeReferencesList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referencesList",
                      	        		lv_referencesList_2_0, 
                      	        		"TypeReferencesList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:3: ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||LA20_0==41||(LA20_0>=55 && LA20_0<=56)) ) {
                alt20=1;
            }
            else if ( (LA20_0==17) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("684:3: ( ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )* | ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:4: ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:4: ( ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==41||(LA17_0>=55 && LA17_0<=56)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:5: ( (lv_elements_3_0= ruleAnnotationsList ) )? ( (lv_elements_4_0= ruleTypeDefinitionElement ) )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:5: ( (lv_elements_3_0= ruleAnnotationsList ) )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==41) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:685:1: (lv_elements_3_0= ruleAnnotationsList )
                    	            {
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:685:1: (lv_elements_3_0= ruleAnnotationsList )
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:686:3: lv_elements_3_0= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1119);
                    	            lv_elements_3_0=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"elements",
                    	              	        		lv_elements_3_0, 
                    	              	        		"AnnotationsList", 
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

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:708:3: ( (lv_elements_4_0= ruleTypeDefinitionElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:709:1: (lv_elements_4_0= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:709:1: (lv_elements_4_0= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:710:3: lv_elements_4_0= ruleTypeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1141);
                    	    lv_elements_4_0=ruleTypeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"elements",
                    	      	        		lv_elements_4_0, 
                    	      	        		"TypeDefinitionElement", 
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:733:6: ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:733:6: ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:733:8: '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleComponentTypeDefinition1160); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:737:1: ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==41||(LA19_0>=55 && LA19_0<=56)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:737:2: ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleTypeDefinitionElement ) )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:737:2: ( (lv_elements_6_0= ruleAnnotationsList ) )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==41) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:738:1: (lv_elements_6_0= ruleAnnotationsList )
                    	            {
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:738:1: (lv_elements_6_0= ruleAnnotationsList )
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:739:3: lv_elements_6_0= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_1_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1182);
                    	            lv_elements_6_0=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"elements",
                    	              	        		lv_elements_6_0, 
                    	              	        		"AnnotationsList", 
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

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:761:3: ( (lv_elements_7_0= ruleTypeDefinitionElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:762:1: (lv_elements_7_0= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:762:1: (lv_elements_7_0= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:763:3: lv_elements_7_0= ruleTypeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1204);
                    	    lv_elements_7_0=ruleTypeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"elements",
                    	      	        		lv_elements_7_0, 
                    	      	        		"TypeDefinitionElement", 
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
                    	    break loop19;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleComponentTypeDefinition1216); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2(), null); 
                          
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
    // $ANTLR end ruleComponentTypeDefinition


    // $ANTLR start entryRuleTypeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:797:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:798:2: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:799:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1254);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferenceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1264); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeReferenceDefinition


    // $ANTLR start ruleTypeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:806:1: ruleTypeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0_0= ruleFQN ) ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:811:6: ( ( (lv_referenceName_0_0= ruleFQN ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:812:1: ( (lv_referenceName_0_0= ruleFQN ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:812:1: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:813:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:813:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:814:3: lv_referenceName_0_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1309);
            lv_referenceName_0_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeReferenceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"referenceName",
              	        		lv_referenceName_0_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end ruleTypeReferenceDefinition


    // $ANTLR start entryRuleTypeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:844:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:845:2: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:846:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1344);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinitionElement1354); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDefinitionElement


    // $ANTLR start ruleTypeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:853:1: ruleTypeDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:858:6: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:859:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:859:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:860:2: this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1404);
            this_InterfaceDefinition_0=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_InterfaceDefinition_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:1: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:3: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleTypeDefinitionElement1414); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                          
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
    // $ANTLR end ruleTypeDefinitionElement


    // $ANTLR start entryRuleCompositeComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:883:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:884:2: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:885:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1452);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1462); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeComponentDefinition


    // $ANTLR start ruleCompositeComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:892:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( 'composite' ( (lv_name_1_0= ruleFQN ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= ruleCompositeReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* ) ) ;
    public final EObject ruleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_templateSpecifiersList_2_0 = null;

        EObject lv_compositeFormalArgumentsList_3_0 = null;

        EObject lv_referencesList_4_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;

        EObject lv_elements_10_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:897:6: ( ( 'composite' ( (lv_name_1_0= ruleFQN ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= ruleCompositeReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:898:1: ( 'composite' ( (lv_name_1_0= ruleFQN ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= ruleCompositeReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:898:1: ( 'composite' ( (lv_name_1_0= ruleFQN ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= ruleCompositeReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:898:3: 'composite' ( (lv_name_1_0= ruleFQN ) ) ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_4_0= ruleCompositeReferencesList ) )? ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* )
            {
            match(input,20,FOLLOW_20_in_ruleCompositeComponentDefinition1497); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:902:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:903:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:903:1: (lv_name_1_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:904:3: lv_name_1_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1518);
            lv_name_1_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:926:2: ( (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:927:1: (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:927:1: (lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:928:3: lv_templateSpecifiersList_2_0= ruleTemplateSpecifiersList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1539);
                    lv_templateSpecifiersList_2_0=ruleTemplateSpecifiersList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"templateSpecifiersList",
                      	        		lv_templateSpecifiersList_2_0, 
                      	        		"TemplateSpecifiersList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:950:3: ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:951:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:951:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:952:3: lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1561);
                    lv_compositeFormalArgumentsList_3_0=ruleFormalArgumentsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"compositeFormalArgumentsList",
                      	        		lv_compositeFormalArgumentsList_3_0, 
                      	        		"FormalArgumentsList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:974:3: ( (lv_referencesList_4_0= ruleCompositeReferencesList ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:975:1: (lv_referencesList_4_0= ruleCompositeReferencesList )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:975:1: (lv_referencesList_4_0= ruleCompositeReferencesList )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:976:3: lv_referencesList_4_0= ruleCompositeReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getReferencesListCompositeReferencesListParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1583);
                    lv_referencesList_4_0=ruleCompositeReferencesList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referencesList",
                      	        		lv_referencesList_4_0, 
                      	        		"CompositeReferencesList", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:998:3: ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||LA29_0==27||LA29_0==33||LA29_0==41||(LA29_0>=55 && LA29_0<=56)) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("998:3: ( ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' ) | ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )* )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:998:4: ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:998:4: ( '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:998:6: '{' ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleCompositeComponentDefinition1596); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1002:1: ( ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==27||LA26_0==33||LA26_0==41||(LA26_0>=55 && LA26_0<=56)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1002:2: ( (lv_elements_6_0= ruleAnnotationsList ) )? ( (lv_elements_7_0= ruleCompositeDefinitionElement ) )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1002:2: ( (lv_elements_6_0= ruleAnnotationsList ) )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==41) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1003:1: (lv_elements_6_0= ruleAnnotationsList )
                    	            {
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1003:1: (lv_elements_6_0= ruleAnnotationsList )
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1004:3: lv_elements_6_0= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1618);
                    	            lv_elements_6_0=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"elements",
                    	              	        		lv_elements_6_0, 
                    	              	        		"AnnotationsList", 
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

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1026:3: ( (lv_elements_7_0= ruleCompositeDefinitionElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1027:1: (lv_elements_7_0= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1027:1: (lv_elements_7_0= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1028:3: lv_elements_7_0= ruleCompositeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1640);
                    	    lv_elements_7_0=ruleCompositeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"elements",
                    	      	        		lv_elements_7_0, 
                    	      	        		"CompositeDefinitionElement", 
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
                    	    break loop26;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleCompositeComponentDefinition1652); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1055:6: ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1055:6: ( ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==27||LA28_0==33||LA28_0==41||(LA28_0>=55 && LA28_0<=56)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1055:7: ( (lv_elements_9_0= ruleAnnotationsList ) )? ( (lv_elements_10_0= ruleCompositeDefinitionElement ) )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1055:7: ( (lv_elements_9_0= ruleAnnotationsList ) )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==41) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1056:1: (lv_elements_9_0= ruleAnnotationsList )
                    	            {
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1056:1: (lv_elements_9_0= ruleAnnotationsList )
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1057:3: lv_elements_9_0= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1681);
                    	            lv_elements_9_0=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        try {
                    	              	       		add(
                    	              	       			current, 
                    	              	       			"elements",
                    	              	        		lv_elements_9_0, 
                    	              	        		"AnnotationsList", 
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

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1079:3: ( (lv_elements_10_0= ruleCompositeDefinitionElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1080:1: (lv_elements_10_0= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1080:1: (lv_elements_10_0= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1081:3: lv_elements_10_0= ruleCompositeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1703);
                    	    lv_elements_10_0=ruleCompositeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"elements",
                    	      	        		lv_elements_10_0, 
                    	      	        		"CompositeDefinitionElement", 
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
                    	    break loop28;
                        }
                    } while (true);


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
    // $ANTLR end ruleCompositeComponentDefinition


    // $ANTLR start entryRuleTemplateSpecifiersList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1111:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1112:2: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1113:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifiersListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1742);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1752); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateSpecifiersList


    // $ANTLR start ruleTemplateSpecifiersList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1120:1: ruleTemplateSpecifiersList returns [EObject current=null] : ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject lv_templateSpecifiers_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:6: ( ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1126:1: ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1126:1: ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1126:3: '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>'
            {
            match(input,21,FOLLOW_21_in_ruleTemplateSpecifiersList1787); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1130:1: ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1130:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1130:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1131:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1131:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1132:3: lv_templateSpecifiers_1_0= ruleTemplateSpecifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1809);
            lv_templateSpecifiers_1_0=ruleTemplateSpecifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSpecifiersListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"templateSpecifiers",
              	        		lv_templateSpecifiers_1_0, 
              	        		"TemplateSpecifier", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1154:2: ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1154:4: ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTemplateSpecifiersList1820); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1158:1: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1159:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1159:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1160:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1841);
            	    lv_templateSpecifiers_3_0=ruleTemplateSpecifier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTemplateSpecifiersListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"templateSpecifiers",
            	      	        		lv_templateSpecifiers_3_0, 
            	      	        		"TemplateSpecifier", 
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
            	    break loop30;
                }
            } while (true);


            }

            match(input,23,FOLLOW_23_in_ruleTemplateSpecifiersList1854); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getGreaterThanSignKeyword_2(), null); 
                  
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
    // $ANTLR end ruleTemplateSpecifiersList


    // $ANTLR start entryRuleFormalArgumentsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1194:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1195:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1196:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalArgumentsListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1890);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList1900); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormalArgumentsList


    // $ANTLR start ruleFormalArgumentsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1203:1: ruleFormalArgumentsList returns [EObject current=null] : ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1208:6: ( ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1209:1: ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1209:1: ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1209:3: '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleFormalArgumentsList1935); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1213:1: ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1213:2: ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1213:2: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1214:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1214:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1215:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1957);
            lv_formalArguments_1_0=ruleFormalArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFormalArgumentsListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"formalArguments",
              	        		lv_formalArguments_1_0, 
              	        		"FormalArgument", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1237:2: ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1237:4: ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleFormalArgumentsList1968); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1241:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1242:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1242:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1243:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1989);
            	    lv_formalArguments_3_0=ruleFormalArgument();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFormalArgumentsListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"formalArguments",
            	      	        		lv_formalArguments_3_0, 
            	      	        		"FormalArgument", 
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
            	    break loop31;
                }
            } while (true);


            }

            match(input,25,FOLLOW_25_in_ruleFormalArgumentsList2002); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_2(), null); 
                  
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
    // $ANTLR end ruleFormalArgumentsList


    // $ANTLR start entryRulePrimitiveReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1278:2: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1279:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveReferencesListRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2038);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferencesList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferencesList2048); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveReferencesList


    // $ANTLR start rulePrimitiveReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1286:1: rulePrimitiveReferencesList returns [EObject current=null] : ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1291:6: ( ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1292:1: ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1292:1: ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1292:3: 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )*
            {
            match(input,26,FOLLOW_26_in_rulePrimitiveReferencesList2083); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1296:1: ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1297:1: (lv_references_1_0= rulePrimitiveReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1297:1: (lv_references_1_0= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1298:3: lv_references_1_0= rulePrimitiveReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2104);
            lv_references_1_0=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"references",
              	        		lv_references_1_0, 
              	        		"PrimitiveReferenceDefinition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1320:2: ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1320:4: ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    {
            	    match(input,22,FOLLOW_22_in_rulePrimitiveReferencesList2115); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1324:1: ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1325:1: (lv_references_3_0= rulePrimitiveReferenceDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1325:1: (lv_references_3_0= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1326:3: lv_references_3_0= rulePrimitiveReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2136);
            	    lv_references_3_0=rulePrimitiveReferenceDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"references",
            	      	        		lv_references_3_0, 
            	      	        		"PrimitiveReferenceDefinition", 
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
            	    break loop32;
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
    // $ANTLR end rulePrimitiveReferencesList


    // $ANTLR start entryRuleCompositeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1356:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1357:2: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1358:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeReferencesListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2174);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferencesList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferencesList2184); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeReferencesList


    // $ANTLR start ruleCompositeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1365:1: ruleCompositeReferencesList returns [EObject current=null] : ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1370:6: ( ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1371:1: ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1371:1: ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1371:3: 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )*
            {
            match(input,26,FOLLOW_26_in_ruleCompositeReferencesList2219); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1375:1: ( (lv_references_1_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1376:1: (lv_references_1_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1376:1: (lv_references_1_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1377:3: lv_references_1_0= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2240);
            lv_references_1_0=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"references",
              	        		lv_references_1_0, 
              	        		"CompositeReferenceDefinition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1399:2: ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1399:4: ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleCompositeReferencesList2251); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1403:1: ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1404:1: (lv_references_3_0= ruleCompositeReferenceDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1404:1: (lv_references_3_0= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1405:3: lv_references_3_0= ruleCompositeReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2272);
            	    lv_references_3_0=ruleCompositeReferenceDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"references",
            	      	        		lv_references_3_0, 
            	      	        		"CompositeReferenceDefinition", 
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
    // $ANTLR end ruleCompositeReferencesList


    // $ANTLR start entryRuleTypeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1435:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1436:2: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1437:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeReferencesListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2310);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferencesList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferencesList2320); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeReferencesList


    // $ANTLR start ruleTypeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1444:1: ruleTypeReferencesList returns [EObject current=null] : ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1449:6: ( ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1450:1: ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1450:1: ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1450:3: 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )*
            {
            match(input,26,FOLLOW_26_in_ruleTypeReferencesList2355); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1454:1: ( (lv_references_1_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1455:1: (lv_references_1_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1455:1: (lv_references_1_0= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1456:3: lv_references_1_0= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2376);
            lv_references_1_0=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"references",
              	        		lv_references_1_0, 
              	        		"TypeReferenceDefinition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:2: ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:4: ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTypeReferencesList2387); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1482:1: ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1483:1: (lv_references_3_0= ruleTypeReferenceDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1483:1: (lv_references_3_0= ruleTypeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1484:3: lv_references_3_0= ruleTypeReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2408);
            	    lv_references_3_0=ruleTypeReferenceDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"references",
            	      	        		lv_references_3_0, 
            	      	        		"TypeReferenceDefinition", 
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
    // $ANTLR end ruleTypeReferencesList


    // $ANTLR start entryRuleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1514:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1515:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1516:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalArgumentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2446);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument2456); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormalArgument


    // $ANTLR start ruleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1523:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1528:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1529:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1529:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1530:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1530:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1531:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument2497); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFormalArgumentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // $ANTLR end ruleFormalArgument


    // $ANTLR start entryRuleCompositeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1561:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1562:2: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1563:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2537);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2547); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeDefinitionElement


    // $ANTLR start ruleCompositeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1570:1: ruleCompositeDefinitionElement returns [EObject current=null] : ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_InterfaceDefinition_2 = null;

        EObject this_BindingDefinition_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1575:6: ( ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:1: ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:1: ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:2: ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:2: ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt35=1;
                }
                break;
            case 55:
            case 56:
                {
                alt35=2;
                }
                break;
            case 33:
                {
                alt35=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1576:2: ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:3: ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:3: ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1576:5: 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    match(input,27,FOLLOW_27_in_ruleCompositeDefinitionElement2584); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionElementAccess().getContainsKeyword_0_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2609);
                    this_SubComponentDefinition_1=ruleSubComponentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SubComponentDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1594:2: this_InterfaceDefinition_2= ruleInterfaceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2640);
                    this_InterfaceDefinition_2=ruleInterfaceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceDefinition_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1607:2: this_BindingDefinition_3= ruleBindingDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2670);
                    this_BindingDefinition_3=ruleBindingDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BindingDefinition_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1618:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1618:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleCompositeDefinitionElement2681); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                          
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
    // $ANTLR end ruleCompositeDefinitionElement


    // $ANTLR start entryRuleSubComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1630:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1631:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1632:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2719);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2729); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubComponentDefinition


    // $ANTLR start ruleSubComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1639:1: ruleSubComponentDefinition returns [EObject current=null] : (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeAnonymousSubComponent_0 = null;

        EObject this_CompositeSubComponent_1 = null;

        EObject this_PrimitiveAnonymousSubComponent_2 = null;

        EObject this_PrimitiveSubComponent_3 = null;

        EObject this_TemplateSubComponent_4 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1644:6: ( (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1645:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1645:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA37_1 = input.LA(2);

                if ( (synpred41()) ) {
                    alt37=1;
                }
                else if ( (synpred42()) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1645:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA37_2 = input.LA(2);

                if ( (synpred43()) ) {
                    alt37=3;
                }
                else if ( (synpred44()) ) {
                    alt37=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1645:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 28:
                {
                alt37=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1645:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1646:2: this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeAnonymousSubComponentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition2779);
                    this_CompositeAnonymousSubComponent_0=ruleCompositeAnonymousSubComponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompositeAnonymousSubComponent_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1659:2: this_CompositeSubComponent_1= ruleCompositeSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeSubComponentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition2809);
                    this_CompositeSubComponent_1=ruleCompositeSubComponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompositeSubComponent_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1672:2: this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveAnonymousSubComponentParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition2839);
                    this_PrimitiveAnonymousSubComponent_2=rulePrimitiveAnonymousSubComponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveAnonymousSubComponent_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1685:2: this_PrimitiveSubComponent_3= rulePrimitiveSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveSubComponentParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition2869);
                    this_PrimitiveSubComponent_3=rulePrimitiveSubComponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveSubComponent_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1698:2: this_TemplateSubComponent_4= ruleTemplateSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplateSubComponentParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition2899);
                    this_TemplateSubComponent_4=ruleTemplateSubComponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TemplateSubComponent_4; 
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
    // $ANTLR end ruleSubComponentDefinition


    // $ANTLR start entryRuleCompositeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1719:1: entryRuleCompositeReferenceDefinition returns [EObject current=null] : iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF ;
    public final EObject entryRuleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1720:2: (iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1721:2: iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition2936);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferenceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition2946); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeReferenceDefinition


    // $ANTLR start ruleCompositeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1728:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        EObject lv_templatesList_2_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_argumentsList_7_0 = null;

        EObject lv_argumentsList_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1733:6: ( ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1734:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1734:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1734:2: ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1734:2: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1735:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1735:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1736:3: lv_referenceName_0_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition2992);
            lv_referenceName_0_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"referenceName",
              	        		lv_referenceName_0_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1758:2: ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1758:4: '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>'
                    {
                    match(input,21,FOLLOW_21_in_ruleCompositeReferenceDefinition3003); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1762:1: ( (lv_templatesList_2_0= ruleTemplateDefinition ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1763:1: (lv_templatesList_2_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1763:1: (lv_templatesList_2_0= ruleTemplateDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1764:3: lv_templatesList_2_0= ruleTemplateDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3024);
                    lv_templatesList_2_0=ruleTemplateDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"templatesList",
                      	        		lv_templatesList_2_0, 
                      	        		"TemplateDefinition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1786:2: ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==22) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1786:4: ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3035); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1790:1: ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1791:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1791:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:3: lv_templatesList_4_0= ruleTemplateDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3056);
                    	    lv_templatesList_4_0=ruleTemplateDefinition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"templatesList",
                    	      	        		lv_templatesList_4_0, 
                    	      	        		"TemplateDefinition", 
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
                    	    break loop38;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleCompositeReferenceDefinition3068); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1818:3: ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1818:5: '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleCompositeReferenceDefinition3081); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1822:1: ( (lv_argumentsList_7_0= ruleArgumentDefinition ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1823:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1823:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1824:3: lv_argumentsList_7_0= ruleArgumentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3102);
                    lv_argumentsList_7_0=ruleArgumentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"argumentsList",
                      	        		lv_argumentsList_7_0, 
                      	        		"ArgumentDefinition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1846:2: ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==22) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1846:4: ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3113); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1850:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1851:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1851:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1852:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3134);
                    	    lv_argumentsList_9_0=ruleArgumentDefinition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"argumentsList",
                    	      	        		lv_argumentsList_9_0, 
                    	      	        		"ArgumentDefinition", 
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
                    	    break loop40;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleCompositeReferenceDefinition3146); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getRightParenthesisKeyword_2_3(), null); 
                          
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
    // $ANTLR end ruleCompositeReferenceDefinition


    // $ANTLR start entryRuleCompositeSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1886:1: entryRuleCompositeSubComponent returns [EObject current=null] : iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF ;
    public final EObject entryRuleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1887:2: (iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1888:2: iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3184);
            iv_ruleCompositeSubComponent=ruleCompositeSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSubComponent3194); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeSubComponent


    // $ANTLR start ruleCompositeSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1895:1: ruleCompositeSubComponent returns [EObject current=null] : ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_referenceDefinition_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1900:6: ( ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1901:1: ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1901:1: ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1901:3: 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            match(input,20,FOLLOW_20_in_ruleCompositeSubComponent3229); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeSubComponentAccess().getCompositeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1905:1: ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1906:1: (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1906:1: (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1907:3: lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3250);
            lv_referenceDefinition_1_0=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"referenceDefinition",
              	        		lv_referenceDefinition_1_0, 
              	        		"CompositeReferenceDefinition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,28,FOLLOW_28_in_ruleCompositeSubComponent3260); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1933:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1934:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1934:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1935:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeSubComponent3277); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getCompositeSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
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
    // $ANTLR end ruleCompositeSubComponent


    // $ANTLR start entryRuleCompositeAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1965:1: entryRuleCompositeAnonymousSubComponent returns [EObject current=null] : iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF ;
    public final EObject entryRuleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1966:2: (iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1967:2: iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3318);
            iv_ruleCompositeAnonymousSubComponent=ruleCompositeAnonymousSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeAnonymousSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3328); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeAnonymousSubComponent


    // $ANTLR start ruleCompositeAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1974:1: ruleCompositeAnonymousSubComponent returns [EObject current=null] : ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) ) )* '}' ) ;
    public final EObject ruleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_referenceDefinition_1_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1979:6: ( ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1980:1: ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1980:1: ( 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1980:3: 'composite' ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) ) )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleCompositeAnonymousSubComponent3363); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1984:1: ( (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1985:1: (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1985:1: (lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1986:3: lv_referenceDefinition_1_0= ruleCompositeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3384);
                    lv_referenceDefinition_1_0=ruleCompositeReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referenceDefinition",
                      	        		lv_referenceDefinition_1_0, 
                      	        		"CompositeReferenceDefinition", 
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

            match(input,28,FOLLOW_28_in_ruleCompositeAnonymousSubComponent3395); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2012:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2013:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2013:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2014:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent3412); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,17,FOLLOW_17_in_ruleCompositeAnonymousSubComponent3427); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2040:1: ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==27||LA44_0==33||LA44_0==41||(LA44_0>=55 && LA44_0<=56)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2040:2: ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= ruleCompositeDefinitionElement ) )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2040:2: ( (lv_elements_5_0= ruleAnnotationsList ) )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==41) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2041:1: (lv_elements_5_0= ruleAnnotationsList )
            	            {
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2041:1: (lv_elements_5_0= ruleAnnotationsList )
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2042:3: lv_elements_5_0= ruleAnnotationsList
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent3449);
            	            lv_elements_5_0=ruleAnnotationsList();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"elements",
            	              	        		lv_elements_5_0, 
            	              	        		"AnnotationsList", 
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

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2064:3: ( (lv_elements_6_0= ruleCompositeDefinitionElement ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2065:1: (lv_elements_6_0= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2065:1: (lv_elements_6_0= ruleCompositeDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2066:3: lv_elements_6_0= ruleCompositeDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent3471);
            	    lv_elements_6_0=ruleCompositeDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_6_0, 
            	      	        		"CompositeDefinitionElement", 
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
            	    break loop44;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleCompositeAnonymousSubComponent3483); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                  
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
    // $ANTLR end ruleCompositeAnonymousSubComponent


    // $ANTLR start entryRulePrimitiveReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2100:1: entryRulePrimitiveReferenceDefinition returns [EObject current=null] : iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF ;
    public final EObject entryRulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2101:2: (iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2102:2: iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3519);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferenceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3529); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveReferenceDefinition


    // $ANTLR start rulePrimitiveReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2109:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        EObject lv_argumentsList_2_0 = null;

        EObject lv_argumentsList_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2114:6: ( ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2115:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2115:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2115:2: ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2115:2: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2116:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2116:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2117:3: lv_referenceName_0_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3575);
            lv_referenceName_0_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"referenceName",
              	        		lv_referenceName_0_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2139:2: ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2139:4: '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_rulePrimitiveReferenceDefinition3586); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2143:1: ( (lv_argumentsList_2_0= ruleArgumentDefinition ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2144:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2144:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2145:3: lv_argumentsList_2_0= ruleArgumentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3607);
                    lv_argumentsList_2_0=ruleArgumentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"argumentsList",
                      	        		lv_argumentsList_2_0, 
                      	        		"ArgumentDefinition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2167:2: ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2167:4: ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_rulePrimitiveReferenceDefinition3618); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2171:1: ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2172:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2172:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2173:3: lv_argumentsList_4_0= ruleArgumentDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3639);
                    	    lv_argumentsList_4_0=ruleArgumentDefinition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"argumentsList",
                    	      	        		lv_argumentsList_4_0, 
                    	      	        		"ArgumentDefinition", 
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
                    	    break loop45;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_rulePrimitiveReferenceDefinition3651); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                          
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
    // $ANTLR end rulePrimitiveReferenceDefinition


    // $ANTLR start entryRuleTemplateDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2207:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2208:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2209:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition3689);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition3699); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateDefinition


    // $ANTLR start ruleTemplateDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2216:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_reference_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2221:6: ( ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2222:1: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2222:1: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2222:2: ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2222:2: ( ( (lv_name_0_0= RULE_ID ) ) '=' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==29) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2222:3: ( (lv_name_0_0= RULE_ID ) ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2222:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2223:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2223:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2224:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition3742); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTemplateDefinitionAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_0_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,29,FOLLOW_29_in_ruleTemplateDefinition3757); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2250:3: ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2251:1: (lv_reference_2_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2251:1: (lv_reference_2_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2252:3: lv_reference_2_0= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getReferenceCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition3780);
            lv_reference_2_0=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"reference",
              	        		lv_reference_2_0, 
              	        		"CompositeReferenceDefinition", 
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
    // $ANTLR end ruleTemplateDefinition


    // $ANTLR start entryRuleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2282:1: entryRuleTemplateSubComponent returns [EObject current=null] : iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF ;
    public final EObject entryRuleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2283:2: (iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2284:2: iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent3816);
            iv_ruleTemplateSubComponent=ruleTemplateSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSubComponent3826); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateSubComponent


    // $ANTLR start ruleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2291:1: ruleTemplateSubComponent returns [EObject current=null] : ( ( (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_referenceDefinition_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2296:6: ( ( ( (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2297:1: ( ( (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2297:1: ( ( (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2297:2: ( (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition ) )? 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2297:2: ( (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2298:1: (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2298:1: (lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2299:3: lv_referenceDefinition_0_0= ruleCompositeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTemplateSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateSubComponent3872);
                    lv_referenceDefinition_0_0=ruleCompositeReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referenceDefinition",
                      	        		lv_referenceDefinition_0_0, 
                      	        		"CompositeReferenceDefinition", 
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

            match(input,28,FOLLOW_28_in_ruleTemplateSubComponent3883); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSubComponentAccess().getAsKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2325:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2326:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2326:1: (lv_name_2_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2327:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent3900); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTemplateSubComponentAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
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
    // $ANTLR end ruleTemplateSubComponent


    // $ANTLR start entryRulePrimitiveSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2357:1: entryRulePrimitiveSubComponent returns [EObject current=null] : iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF ;
    public final EObject entryRulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2358:2: (iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2359:2: iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent3941);
            iv_rulePrimitiveSubComponent=rulePrimitiveSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSubComponent3951); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveSubComponent


    // $ANTLR start rulePrimitiveSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2366:1: rulePrimitiveSubComponent returns [EObject current=null] : ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_referenceDefinition_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2371:6: ( ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2372:1: ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2372:1: ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2372:3: 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) ) 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_rulePrimitiveSubComponent3986); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getPrimitiveKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2376:1: ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2377:1: (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2377:1: (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2378:3: lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4007);
            lv_referenceDefinition_1_0=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"referenceDefinition",
              	        		lv_referenceDefinition_1_0, 
              	        		"PrimitiveReferenceDefinition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,28,FOLLOW_28_in_rulePrimitiveSubComponent4017); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2404:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2405:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2406:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4034); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
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
    // $ANTLR end rulePrimitiveSubComponent


    // $ANTLR start entryRulePrimitiveAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2436:1: entryRulePrimitiveAnonymousSubComponent returns [EObject current=null] : iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF ;
    public final EObject entryRulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2437:2: (iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2438:2: iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4075);
            iv_rulePrimitiveAnonymousSubComponent=rulePrimitiveAnonymousSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveAnonymousSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4085); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveAnonymousSubComponent


    // $ANTLR start rulePrimitiveAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2445:1: rulePrimitiveAnonymousSubComponent returns [EObject current=null] : ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) ) )* '}' ) ;
    public final EObject rulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_referenceDefinition_1_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2450:6: ( ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2451:1: ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2451:1: ( 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2451:3: 'primitive' ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) '{' ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) ) )* '}'
            {
            match(input,16,FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4120); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2455:1: ( (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2456:1: (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2456:1: (lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2457:3: lv_referenceDefinition_1_0= rulePrimitiveReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4141);
                    lv_referenceDefinition_1_0=rulePrimitiveReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referenceDefinition",
                      	        		lv_referenceDefinition_1_0, 
                      	        		"PrimitiveReferenceDefinition", 
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

            match(input,28,FOLLOW_28_in_rulePrimitiveAnonymousSubComponent4152); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2483:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2484:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2484:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2485:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4169); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,17,FOLLOW_17_in_rulePrimitiveAnonymousSubComponent4184); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2511:1: ( ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==30||(LA51_0>=37 && LA51_0<=39)||LA51_0==41||(LA51_0>=55 && LA51_0<=56)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2511:2: ( (lv_elements_5_0= ruleAnnotationsList ) )? ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2511:2: ( (lv_elements_5_0= ruleAnnotationsList ) )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==41) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2512:1: (lv_elements_5_0= ruleAnnotationsList )
            	            {
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2512:1: (lv_elements_5_0= ruleAnnotationsList )
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2513:3: lv_elements_5_0= ruleAnnotationsList
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4206);
            	            lv_elements_5_0=ruleAnnotationsList();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"elements",
            	              	        		lv_elements_5_0, 
            	              	        		"AnnotationsList", 
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

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2535:3: ( (lv_elements_6_0= rulePrimitiveDefinitionElement ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2536:1: (lv_elements_6_0= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2536:1: (lv_elements_6_0= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2537:3: lv_elements_6_0= rulePrimitiveDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent4228);
            	    lv_elements_6_0=rulePrimitiveDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_6_0, 
            	      	        		"PrimitiveDefinitionElement", 
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
            	    break loop51;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_rulePrimitiveAnonymousSubComponent4240); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                  
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
    // $ANTLR end rulePrimitiveAnonymousSubComponent


    // $ANTLR start entryRuleAttributeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2571:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2572:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2573:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4276);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition4286); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeDefinition


    // $ANTLR start ruleAttributeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2580:1: ruleAttributeDefinition returns [EObject current=null] : ( 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) ( '=' ( (lv_value_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_2_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2585:6: ( ( 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) ( '=' ( (lv_value_4_0= ruleValue ) ) )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2586:1: ( 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) ( '=' ( (lv_value_4_0= ruleValue ) ) )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2586:1: ( 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) ( '=' ( (lv_value_4_0= ruleValue ) ) )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2586:3: 'attribute' ( (lv_type_1_0= ruleAttributeType ) )? ( (lv_attributeName_2_0= RULE_ID ) ) ( '=' ( (lv_value_4_0= ruleValue ) ) )?
            {
            match(input,30,FOLLOW_30_in_ruleAttributeDefinition4321); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2590:1: ( (lv_type_1_0= ruleAttributeType ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=47 && LA52_0<=49)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==RULE_ID) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2591:1: (lv_type_1_0= ruleAttributeType )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2591:1: (lv_type_1_0= ruleAttributeType )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2592:3: lv_type_1_0= ruleAttributeType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4342);
                    lv_type_1_0=ruleAttributeType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_1_0, 
                      	        		"AttributeType", 
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2614:3: ( (lv_attributeName_2_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2615:1: (lv_attributeName_2_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2615:1: (lv_attributeName_2_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2616:3: lv_attributeName_2_0= RULE_ID
            {
            lv_attributeName_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition4360); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_2_0(), "attributeName"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"attributeName",
              	        		lv_attributeName_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2638:2: ( '=' ( (lv_value_4_0= ruleValue ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2638:4: '=' ( (lv_value_4_0= ruleValue ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleAttributeDefinition4376); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2642:1: ( (lv_value_4_0= ruleValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2643:1: (lv_value_4_0= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2643:1: (lv_value_4_0= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2644:3: lv_value_4_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition4397);
                    lv_value_4_0=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_4_0, 
                      	        		"Value", 
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
    // $ANTLR end ruleAttributeDefinition


    // $ANTLR start entryRuleArgumentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2674:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2675:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2676:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArgumentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4435);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition4445); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgumentDefinition


    // $ANTLR start ruleArgumentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2683:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;

        AntlrDatatypeRuleToken lv_argumentValue_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2688:6: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==29) ) {
                    alt54=1;
                }
                else if ( (LA54_1==EOF||LA54_1==22||LA54_1==25) ) {
                    alt54=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2689:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_INT||LA54_0==RULE_STRING||LA54_0==42||(LA54_0>=51 && LA54_0<=52)) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2689:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:3: ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2690:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2690:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2691:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition4488); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getArgumentDefinitionAccess().getArgumentNameIDTerminalRuleCall_0_0_0(), "argumentName"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"argumentName",
                      	        		lv_argumentName_0_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,29,FOLLOW_29_in_ruleArgumentDefinition4503); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2717:1: ( (lv_argumentValue_2_0= ruleValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2718:1: (lv_argumentValue_2_0= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2718:1: (lv_argumentValue_2_0= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2719:3: lv_argumentValue_2_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition4524);
                    lv_argumentValue_2_0=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"argumentValue",
                      	        		lv_argumentValue_2_0, 
                      	        		"Value", 
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2742:6: ( (lv_argumentValue_3_0= ruleValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2742:6: ( (lv_argumentValue_3_0= ruleValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2743:1: (lv_argumentValue_3_0= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2743:1: (lv_argumentValue_3_0= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2744:3: lv_argumentValue_3_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition4552);
                    lv_argumentValue_3_0=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"argumentValue",
                      	        		lv_argumentValue_3_0, 
                      	        		"Value", 
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
    // $ANTLR end ruleArgumentDefinition


    // $ANTLR start entryRuleInterfaceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2774:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2775:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2776:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4588);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition4598); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2783:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_role_0_0= ruleRole ) ) ( (lv_signature_1_0= ruleFQN ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) ) )? ( (lv_contingency_7_0= ruleContingency ) )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_collection_4_0=null;
        Token lv_collectionsize_5_0=null;
        Token lv_collection_6_0=null;
        Enumerator lv_role_0_0 = null;

        AntlrDatatypeRuleToken lv_signature_1_0 = null;

        Enumerator lv_contingency_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2788:6: ( ( ( (lv_role_0_0= ruleRole ) ) ( (lv_signature_1_0= ruleFQN ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) ) )? ( (lv_contingency_7_0= ruleContingency ) )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:1: ( ( (lv_role_0_0= ruleRole ) ) ( (lv_signature_1_0= ruleFQN ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) ) )? ( (lv_contingency_7_0= ruleContingency ) )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:1: ( ( (lv_role_0_0= ruleRole ) ) ( (lv_signature_1_0= ruleFQN ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) ) )? ( (lv_contingency_7_0= ruleContingency ) )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:2: ( (lv_role_0_0= ruleRole ) ) ( (lv_signature_1_0= ruleFQN ) )? 'as' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) ) )? ( (lv_contingency_7_0= ruleContingency ) )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2789:2: ( (lv_role_0_0= ruleRole ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2790:1: (lv_role_0_0= ruleRole )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2790:1: (lv_role_0_0= ruleRole )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2791:3: lv_role_0_0= ruleRole
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRole_in_ruleInterfaceDefinition4644);
            lv_role_0_0=ruleRole();
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
              	       			"role",
              	        		lv_role_0_0, 
              	        		"Role", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:2: ( (lv_signature_1_0= ruleFQN ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2814:1: (lv_signature_1_0= ruleFQN )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2814:1: (lv_signature_1_0= ruleFQN )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2815:3: lv_signature_1_0= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFQNParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleInterfaceDefinition4665);
                    lv_signature_1_0=ruleFQN();
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
                      	       			"signature",
                      	        		lv_signature_1_0, 
                      	        		"FQN", 
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

            match(input,28,FOLLOW_28_in_ruleInterfaceDefinition4676); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2841:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2842:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2842:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2843:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDefinition4693); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2865:2: ( ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2865:3: ( (lv_collection_4_0= '[' ) ) ( (lv_collectionsize_5_0= RULE_INT ) )? ( (lv_collection_6_0= ']' ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2865:3: ( (lv_collection_4_0= '[' ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2866:1: (lv_collection_4_0= '[' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2866:1: (lv_collection_4_0= '[' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2867:3: lv_collection_4_0= '['
                    {
                    lv_collection_4_0=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleInterfaceDefinition4717); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_4_0_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", true, "[", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2886:2: ( (lv_collectionsize_5_0= RULE_INT ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2887:1: (lv_collectionsize_5_0= RULE_INT )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2887:1: (lv_collectionsize_5_0= RULE_INT )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2888:3: lv_collectionsize_5_0= RULE_INT
                            {
                            lv_collectionsize_5_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInterfaceDefinition4747); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_4_1_0(), "collectionsize"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"collectionsize",
                              	        		lv_collectionsize_5_0, 
                              	        		"INT", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2910:3: ( (lv_collection_6_0= ']' ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2911:1: (lv_collection_6_0= ']' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2911:1: (lv_collection_6_0= ']' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2912:3: lv_collection_6_0= ']'
                    {
                    lv_collection_6_0=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleInterfaceDefinition4771); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionRightSquareBracketKeyword_4_2_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", true, "]", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2931:4: ( (lv_contingency_7_0= ruleContingency ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=53 && LA58_0<=54)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2932:1: (lv_contingency_7_0= ruleContingency )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2932:1: (lv_contingency_7_0= ruleContingency )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2933:3: lv_contingency_7_0= ruleContingency
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContingency_in_ruleInterfaceDefinition4807);
                    lv_contingency_7_0=ruleContingency();
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
                      	       			"contingency",
                      	        		lv_contingency_7_0, 
                      	        		"Contingency", 
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
    // $ANTLR end ruleInterfaceDefinition


    // $ANTLR start entryRuleBindingDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2963:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2964:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2965:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4844);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition4854); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBindingDefinition


    // $ANTLR start ruleBindingDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2972:1: ruleBindingDefinition returns [EObject current=null] : ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_4_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_12_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']' )? ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceSourceParentName_2_0=null;
        Token lv_interfaceSourceName_4_0=null;
        Token lv_interfaceSourceIndex_6_0=null;
        Token lv_interfaceTargetParentName_10_0=null;
        Token lv_interfaceTargetName_12_0=null;
        Token lv_interfaceTargetIndex_14_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2977:6: ( ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_4_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_12_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2978:1: ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_4_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_12_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2978:1: ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_4_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_12_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2978:3: 'binds' ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_4_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_12_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']' )?
            {
            match(input,33,FOLLOW_33_in_ruleBindingDefinition4889); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2982:1: ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==34) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2982:1: ( 'this' | ( (lv_interfaceSourceParentName_2_0= RULE_ID ) ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2982:3: 'this'
                    {
                    match(input,34,FOLLOW_34_in_ruleBindingDefinition4900); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2987:6: ( (lv_interfaceSourceParentName_2_0= RULE_ID ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2987:6: ( (lv_interfaceSourceParentName_2_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2988:1: (lv_interfaceSourceParentName_2_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2988:1: (lv_interfaceSourceParentName_2_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2989:3: lv_interfaceSourceParentName_2_0= RULE_ID
                    {
                    lv_interfaceSourceParentName_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition4923); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentNameIDTerminalRuleCall_1_1_0(), "interfaceSourceParentName"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"interfaceSourceParentName",
                      	        		lv_interfaceSourceParentName_2_0, 
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

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition4939); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3015:1: ( (lv_interfaceSourceName_4_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:1: (lv_interfaceSourceName_4_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:1: (lv_interfaceSourceName_4_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3017:3: lv_interfaceSourceName_4_0= RULE_ID
            {
            lv_interfaceSourceName_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition4956); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceNameIDTerminalRuleCall_3_0(), "interfaceSourceName"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"interfaceSourceName",
              	        		lv_interfaceSourceName_4_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3039:2: ( '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3039:4: '[' ( (lv_interfaceSourceIndex_6_0= RULE_INT ) ) ']'
                    {
                    match(input,31,FOLLOW_31_in_ruleBindingDefinition4972); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3043:1: ( (lv_interfaceSourceIndex_6_0= RULE_INT ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3044:1: (lv_interfaceSourceIndex_6_0= RULE_INT )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3044:1: (lv_interfaceSourceIndex_6_0= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3045:3: lv_interfaceSourceIndex_6_0= RULE_INT
                    {
                    lv_interfaceSourceIndex_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition4989); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceIndexINTTerminalRuleCall_4_1_0(), "interfaceSourceIndex"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"interfaceSourceIndex",
                      	        		lv_interfaceSourceIndex_6_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBindingDefinition5004); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_ruleBindingDefinition5016); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_5(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3075:1: ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==34) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3075:1: ( 'this' | ( (lv_interfaceTargetParentName_10_0= RULE_ID ) ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3075:3: 'this'
                    {
                    match(input,34,FOLLOW_34_in_ruleBindingDefinition5027); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_6_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3080:6: ( (lv_interfaceTargetParentName_10_0= RULE_ID ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3080:6: ( (lv_interfaceTargetParentName_10_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3081:1: (lv_interfaceTargetParentName_10_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3081:1: (lv_interfaceTargetParentName_10_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3082:3: lv_interfaceTargetParentName_10_0= RULE_ID
                    {
                    lv_interfaceTargetParentName_10_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5050); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentNameIDTerminalRuleCall_6_1_0(), "interfaceTargetParentName"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"interfaceTargetParentName",
                      	        		lv_interfaceTargetParentName_10_0, 
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

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition5066); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_7(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3108:1: ( (lv_interfaceTargetName_12_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3109:1: (lv_interfaceTargetName_12_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3109:1: (lv_interfaceTargetName_12_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3110:3: lv_interfaceTargetName_12_0= RULE_ID
            {
            lv_interfaceTargetName_12_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5083); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetNameIDTerminalRuleCall_8_0(), "interfaceTargetName"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"interfaceTargetName",
              	        		lv_interfaceTargetName_12_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3132:2: ( '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==31) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3132:4: '[' ( (lv_interfaceTargetIndex_14_0= RULE_INT ) ) ']'
                    {
                    match(input,31,FOLLOW_31_in_ruleBindingDefinition5099); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_9_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3136:1: ( (lv_interfaceTargetIndex_14_0= RULE_INT ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3137:1: (lv_interfaceTargetIndex_14_0= RULE_INT )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3137:1: (lv_interfaceTargetIndex_14_0= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3138:3: lv_interfaceTargetIndex_14_0= RULE_INT
                    {
                    lv_interfaceTargetIndex_14_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition5116); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetIndexINTTerminalRuleCall_9_1_0(), "interfaceTargetIndex"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"interfaceTargetIndex",
                      	        		lv_interfaceTargetIndex_14_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBindingDefinition5131); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_9_2(), null); 
                          
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
    // $ANTLR end ruleBindingDefinition


    // $ANTLR start entryRuleDataDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3172:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3173:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3174:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5169);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5179); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataDefinition


    // $ANTLR start ruleDataDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3181:1: ruleDataDefinition returns [EObject current=null] : ( ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1_0 = null;

        EObject lv_inlineCcode_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3186:6: ( ( ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:1: ( ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) | 'nodata' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:1: ( ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) | 'nodata' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            else if ( (LA64_0==38) ) {
                alt64=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3187:1: ( ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) | 'nodata' )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:2: ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:2: ( 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:4: 'data' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )
                    {
                    match(input,37,FOLLOW_37_in_ruleDataDefinition5215); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3191:1: ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID||LA63_0==RULE_PATH) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==RULE_CODEC) ) {
                        alt63=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3191:1: ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3191:2: ( (lv_fileC_1_0= ruleFileC ) )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3191:2: ( (lv_fileC_1_0= ruleFileC ) )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3192:1: (lv_fileC_1_0= ruleFileC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3192:1: (lv_fileC_1_0= ruleFileC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3193:3: lv_fileC_1_0= ruleFileC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition5237);
                            lv_fileC_1_0=ruleFileC();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"fileC",
                              	        		lv_fileC_1_0, 
                              	        		"FileC", 
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
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3216:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3216:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3217:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3217:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3218:3: lv_inlineCcode_2_0= ruleInlineCodeC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_0_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5264);
                            lv_inlineCcode_2_0=ruleInlineCodeC();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"inlineCcode",
                              	        		lv_inlineCcode_2_0, 
                              	        		"InlineCodeC", 
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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3241:7: 'nodata'
                    {
                    match(input,38,FOLLOW_38_in_ruleDataDefinition5282); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDataDefinitionAccess().getNodataKeyword_1(), null); 
                          
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
    // $ANTLR end ruleDataDefinition


    // $ANTLR start entryRuleImplementationDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3253:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3254:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3255:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5318);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5328); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImplementationDefinition


    // $ANTLR start ruleImplementationDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3262:1: ruleImplementationDefinition returns [EObject current=null] : ( 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1_0 = null;

        EObject lv_inlineCcode_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3267:6: ( ( 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3268:1: ( 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3268:1: ( 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3268:3: 'source' ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )
            {
            match(input,39,FOLLOW_39_in_ruleImplementationDefinition5363); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3272:1: ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID||LA65_0==RULE_PATH) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_CODEC) ) {
                alt65=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3272:1: ( ( (lv_fileC_1_0= ruleFileC ) ) | ( (lv_inlineCcode_2_0= ruleInlineCodeC ) ) )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3272:2: ( (lv_fileC_1_0= ruleFileC ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3272:2: ( (lv_fileC_1_0= ruleFileC ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3273:1: (lv_fileC_1_0= ruleFileC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3273:1: (lv_fileC_1_0= ruleFileC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3274:3: lv_fileC_1_0= ruleFileC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5385);
                    lv_fileC_1_0=ruleFileC();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"fileC",
                      	        		lv_fileC_1_0, 
                      	        		"FileC", 
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3297:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3297:6: ( (lv_inlineCcode_2_0= ruleInlineCodeC ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3298:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3298:1: (lv_inlineCcode_2_0= ruleInlineCodeC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3299:3: lv_inlineCcode_2_0= ruleInlineCodeC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5412);
                    lv_inlineCcode_2_0=ruleInlineCodeC();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"inlineCcode",
                      	        		lv_inlineCcode_2_0, 
                      	        		"InlineCodeC", 
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
    // $ANTLR end ruleImplementationDefinition


    // $ANTLR start entryRuleTemplateSpecifier
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3329:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3330:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3331:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5449);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier5459); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTemplateSpecifier


    // $ANTLR start ruleTemplateSpecifier
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3338:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_reference_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3343:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3344:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3344:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3344:2: ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3344:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3345:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3345:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3346:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier5501); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,40,FOLLOW_40_in_ruleTemplateSpecifier5516); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3372:1: ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3373:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3373:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3374:3: lv_reference_2_0= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getReferenceTypeReferenceDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5537);
            lv_reference_2_0=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"reference",
              	        		lv_reference_2_0, 
              	        		"TypeReferenceDefinition", 
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
    // $ANTLR end ruleTemplateSpecifier


    // $ANTLR start entryRuleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3404:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3405:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3406:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC5573);
            iv_ruleFileC=ruleFileC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC5583); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFileC


    // $ANTLR start ruleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3413:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        Token lv_directory_0_0=null;
        AntlrDatatypeRuleToken lv_fileName_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3418:6: ( ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3419:1: ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3419:1: ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3419:2: ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3419:2: ( (lv_directory_0_0= RULE_PATH ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_PATH) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3420:1: (lv_directory_0_0= RULE_PATH )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3420:1: (lv_directory_0_0= RULE_PATH )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3421:3: lv_directory_0_0= RULE_PATH
                    {
                    lv_directory_0_0=(Token)input.LT(1);
                    match(input,RULE_PATH,FOLLOW_RULE_PATH_in_ruleFileC5625); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getFileCAccess().getDirectoryPathTerminalRuleCall_0_0(), "directory"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"directory",
                      	        		lv_directory_0_0, 
                      	        		"Path", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3443:3: ( (lv_fileName_1_0= ruleFileName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3444:1: (lv_fileName_1_0= ruleFileName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3444:1: (lv_fileName_1_0= ruleFileName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3445:3: lv_fileName_1_0= ruleFileName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFileNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC5652);
            lv_fileName_1_0=ruleFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"fileName",
              	        		lv_fileName_1_0, 
              	        		"FileName", 
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
    // $ANTLR end ruleFileC


    // $ANTLR start entryRuleFileName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3475:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3476:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3477:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName5689);
            iv_ruleFileName=ruleFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName5700); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFileName


    // $ANTLR start ruleFileName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3484:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3489:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3490:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3490:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3490:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName5740); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3497:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==35) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3498:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleFileName5759); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFileNameAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName5774); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_1_1(), null); 
                          
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
    // $ANTLR end ruleFileName


    // $ANTLR start entryRuleInlineCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3518:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3519:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3520:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5821);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC5831); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInlineCodeC


    // $ANTLR start ruleInlineCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3527:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODEC ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3532:6: ( ( (lv_codeC_0_0= RULE_CODEC ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3533:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3533:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3534:1: (lv_codeC_0_0= RULE_CODEC )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3534:1: (lv_codeC_0_0= RULE_CODEC )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3535:3: lv_codeC_0_0= RULE_CODEC
            {
            lv_codeC_0_0=(Token)input.LT(1);
            match(input,RULE_CODEC,FOLLOW_RULE_CODEC_in_ruleInlineCodeC5872); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInlineCodeCAccess().getCodeCCodeCTerminalRuleCall_0(), "codeC"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInlineCodeCRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"codeC",
              	        		lv_codeC_0_0, 
              	        		"CodeC", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // $ANTLR end ruleInlineCodeC


    // $ANTLR start entryRuleAnnotationsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3565:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3566:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3567:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList5912);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList5922); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationsList


    // $ANTLR start ruleAnnotationsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3574:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3579:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3580:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3580:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3580:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3580:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3581:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3581:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3582:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList5968);
            lv_annotations_0_0=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationsListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"annotations",
              	        		lv_annotations_0_0, 
              	        		"Annotation", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3604:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==41) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3605:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3605:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3606:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList5989);
            	    lv_annotations_1_0=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnnotationsListRule().getType().getClassifier());
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
            	    break loop68;
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
    // $ANTLR end ruleAnnotationsList


    // $ANTLR start entryRuleAnnotation
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3636:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3637:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3638:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6026);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6036); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3645:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3650:6: ( ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3651:1: ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3651:1: ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3651:3: '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )?
            {
            match(input,41,FOLLOW_41_in_ruleAnnotation6071); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3655:1: ( (lv_name_1_0= ruleAnnotationType ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3656:1: (lv_name_1_0= ruleAnnotationType )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3656:1: (lv_name_1_0= ruleAnnotationType )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3657:3: lv_name_1_0= ruleAnnotationType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnotation6092);
            lv_name_1_0=ruleAnnotationType();
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
              	       			"name",
              	        		lv_name_1_0, 
              	        		"AnnotationType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3679:2: ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==24) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3679:4: '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAnnotation6103); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3683:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3684:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3684:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3685:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6124);
                    lv_annotationElements_3_0=ruleAnnotationElement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"annotationElements",
                      	        		lv_annotationElements_3_0, 
                      	        		"AnnotationElement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3707:2: ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==22) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3707:4: ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleAnnotation6135); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3711:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3712:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3712:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3713:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6156);
                    	    lv_annotationElements_5_0=ruleAnnotationElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotationElements",
                    	      	        		lv_annotationElements_5_0, 
                    	      	        		"AnnotationElement", 
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
                    	    break loop69;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleAnnotation6168); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3(), null); 
                          
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


    // $ANTLR start entryRuleAnnotationElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3747:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3748:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3749:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6206);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement6216); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationElement


    // $ANTLR start ruleAnnotationElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3756:1: ruleAnnotationElement returns [EObject current=null] : ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_1_0=null;
        EObject lv_elementValue_0_0 = null;

        EObject lv_elementValue_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3761:6: ( ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3762:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3762:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_INT||LA71_0==RULE_STRING||LA71_0==17||LA71_0==41) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID) ) {
                alt71=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3762:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3762:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3762:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3763:1: (lv_elementValue_0_0= ruleElementValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3763:1: (lv_elementValue_0_0= ruleElementValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3764:3: lv_elementValue_0_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement6262);
                    lv_elementValue_0_0=ruleElementValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"elementValue",
                      	        		lv_elementValue_0_0, 
                      	        		"ElementValue", 
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3787:6: ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3787:6: ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3787:7: ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3787:7: ( (lv_elementName_1_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3788:1: (lv_elementName_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3788:1: (lv_elementName_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3789:3: lv_elementName_1_0= RULE_ID
                    {
                    lv_elementName_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement6286); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_1_0_0(), "elementName"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"elementName",
                      	        		lv_elementName_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,29,FOLLOW_29_in_ruleAnnotationElement6301); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_1_1(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3815:1: ( (lv_elementValue_3_0= ruleElementValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3816:1: (lv_elementValue_3_0= ruleElementValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3816:1: (lv_elementValue_3_0= ruleElementValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3817:3: lv_elementValue_3_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement6322);
                    lv_elementValue_3_0=ruleElementValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"elementValue",
                      	        		lv_elementValue_3_0, 
                      	        		"ElementValue", 
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
    // $ANTLR end ruleAnnotationElement


    // $ANTLR start entryRuleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3847:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3848:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3849:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue6359);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue6369); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElementValue


    // $ANTLR start ruleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3856:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3861:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3862:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3862:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt72=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt72=1;
                }
                break;
            case 41:
                {
                alt72=2;
                }
                break;
            case 17:
                {
                alt72=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3862:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3863:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue6419);
                    this_ConstantValue_0=ruleConstantValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ConstantValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3876:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue6449);
                    this_Annotation_1=ruleAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Annotation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3889:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6479);
                    this_ElementValueArrayInitializer_2=ruleElementValueArrayInitializer();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ElementValueArrayInitializer_2; 
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
    // $ANTLR end ruleElementValue


    // $ANTLR start entryRuleConstantValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3908:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3909:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3910:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue6514);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue6524); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3917:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3922:6: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3923:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3923:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3924:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3924:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3925:3: lv_value_0_0= ruleConstantFormat
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue6569);
            lv_value_0_0=ruleConstantFormat();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstantValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"ConstantFormat", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleConstantFormat
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3955:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3956:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3957:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6605);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat6616); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantFormat


    // $ANTLR start ruleConstantFormat
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3964:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3969:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3970:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3970:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_STRING) ) {
                alt73=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3970:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3970:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat6656); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3978:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat6682); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
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
    // $ANTLR end ruleConstantFormat


    // $ANTLR start entryRuleElementValueArrayInitializer
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3993:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3994:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3995:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6727);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6737); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElementValueArrayInitializer


    // $ANTLR start ruleElementValueArrayInitializer
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4002:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4007:6: ( ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4008:1: ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4008:1: ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4008:3: '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}'
            {
            match(input,17,FOLLOW_17_in_ruleElementValueArrayInitializer6772); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4012:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4013:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4013:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4014:3: lv_values_1_0= ruleElementValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6793);
            lv_values_1_0=ruleElementValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getElementValueArrayInitializerRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"values",
              	        		lv_values_1_0, 
              	        		"ElementValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4036:2: ( ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==22) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4036:4: ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleElementValueArrayInitializer6804); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4040:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4041:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4041:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4042:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6825);
            	    lv_values_3_0=ruleElementValue();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getElementValueArrayInitializerRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"values",
            	      	        		lv_values_3_0, 
            	      	        		"ElementValue", 
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
            	    break loop74;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer6837); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getRightCurlyBracketKeyword_3(), null); 
                  
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
    // $ANTLR end ruleElementValueArrayInitializer


    // $ANTLR start entryRuleValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4076:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4077:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4078:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue6874);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue6885); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4085:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4090:6: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4091:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4091:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )
            int alt75=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt75=1;
                }
                break;
            case RULE_INT:
            case 51:
            case 52:
                {
                alt75=2;
                }
                break;
            case 42:
                {
                alt75=3;
                }
                break;
            case RULE_STRING:
                {
                alt75=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4091:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4091:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue6925); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4100:5: this_signedINT_1= rulesignedINT
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue6958);
                    this_signedINT_1=rulesignedINT();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_signedINT_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4112:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue6991);
                    this_HexadecimalType_2=ruleHexadecimalType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_HexadecimalType_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4123:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue7017); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3(), null); 
                          
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
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleHexadecimalType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4138:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4139:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4140:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHexadecimalTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7063);
            iv_ruleHexadecimalType=ruleHexadecimalType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType7074); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHexadecimalType


    // $ANTLR start ruleHexadecimalType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4147:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4152:6: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4153:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4153:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4154:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleHexadecimalType7112); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getHexadecimalTypeAccess().getXKeyword_0(), null); 
                  
            }
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType7127); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getHexadecimalTypeAccess().getINTTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleHexadecimalType


    // $ANTLR start entryRuleAnnotationType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4174:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4175:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4176:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7173);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType7184); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotationType


    // $ANTLR start ruleAnnotationType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4183:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4188:6: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4189:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4189:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            int alt76=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt76=1;
                }
                break;
            case 44:
                {
                alt76=2;
                }
                break;
            case 45:
                {
                alt76=3;
                }
                break;
            case 46:
                {
                alt76=4;
                }
                break;
            case RULE_ID:
                {
                alt76=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4189:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4190:2: kw= 'Override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleAnnotationType7222); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4197:2: kw= 'Singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleAnnotationType7241); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4204:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleAnnotationType7260); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4211:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleAnnotationType7279); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4218:5: this_FQN_4= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationTypeAccess().getFQNParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleAnnotationType7307);
                    this_FQN_4=ruleFQN();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_FQN_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
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
    // $ANTLR end ruleAnnotationType


    // $ANTLR start entryRuleAttributeType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4236:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4237:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4238:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType7353);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType7364); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeType


    // $ANTLR start ruleAttributeType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4245:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4250:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4251:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4251:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt77=1;
                }
                break;
            case 48:
                {
                alt77=2;
                }
                break;
            case 49:
                {
                alt77=3;
                }
                break;
            case RULE_ID:
                {
                alt77=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4251:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4252:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleAttributeType7402); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4259:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleAttributeType7421); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4266:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleAttributeType7440); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4272:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType7461); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAttributeTypeAccess().getIDTerminalRuleCall_3(), null); 
                          
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
    // $ANTLR end ruleAttributeType


    // $ANTLR start entryRuleFQN
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4287:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4288:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4289:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN7507);
            iv_ruleFQN=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN7518); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4296:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4301:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4302:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN7558); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4309:1: (kw= '.' this_ID_2= RULE_ID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==35) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4310:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FOLLOW_35_in_ruleFQN7577); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN7592); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // $ANTLR end ruleFQN


    // $ANTLR start entryRuleFULL_IMPORT_NAME
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4330:1: entryRuleFULL_IMPORT_NAME returns [String current=null] : iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF ;
    public final String entryRuleFULL_IMPORT_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_IMPORT_NAME = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4331:2: (iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4332:2: iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFULL_IMPORT_NAMERule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7640);
            iv_ruleFULL_IMPORT_NAME=ruleFULL_IMPORT_NAME();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFULL_IMPORT_NAME.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7651); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFULL_IMPORT_NAME


    // $ANTLR start ruleFULL_IMPORT_NAME
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4339:1: ruleFULL_IMPORT_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleFULL_IMPORT_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4344:6: ( (this_FQN_0= ruleFQN kw= '.*' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4345:1: (this_FQN_0= ruleFQN kw= '.*' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4345:1: (this_FQN_0= ruleFQN kw= '.*' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4346:5: this_FQN_0= ruleFQN kw= '.*'
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFQNParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7698);
            this_FQN_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_FQN_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            kw=(Token)input.LT(1);
            match(input,50,FOLLOW_50_in_ruleFULL_IMPORT_NAME7716); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFullStopAsteriskKeyword_1(), null); 
                  
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
    // $ANTLR end ruleFULL_IMPORT_NAME


    // $ANTLR start entryRulesignedINT
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4370:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4371:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4372:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT7757);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT7768); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4379:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4384:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4385:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4385:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4385:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4385:2: (kw= '+' | kw= '-' )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==51) ) {
                alt79=1;
            }
            else if ( (LA79_0==52) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4386:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_rulesignedINT7807); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4393:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_rulesignedINT7826); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT7843); if (failed) return current;
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


    // $ANTLR start ruleContingency
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4413:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4417:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4418:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4418:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==53) ) {
                alt80=1;
            }
            else if ( (LA80_0==54) ) {
                alt80=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4418:1: ( ( 'optional' ) | ( 'mandatory' ) )", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4418:2: ( 'optional' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4418:2: ( 'optional' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4418:4: 'optional'
                    {
                    match(input,53,FOLLOW_53_in_ruleContingency7900); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4424:6: ( 'mandatory' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4424:6: ( 'mandatory' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4424:8: 'mandatory'
                    {
                    match(input,54,FOLLOW_54_in_ruleContingency7915); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getContingencyAccess().getMandatoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getContingencyAccess().getMandatoryEnumLiteralDeclaration_1(), null); 
                          
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
    // $ANTLR end ruleContingency


    // $ANTLR start ruleRole
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4434:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4438:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4439:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4439:1: ( ( 'provides' ) | ( 'requires' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==55) ) {
                alt81=1;
            }
            else if ( (LA81_0==56) ) {
                alt81=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4439:1: ( ( 'provides' ) | ( 'requires' ) )", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4439:2: ( 'provides' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4439:2: ( 'provides' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4439:4: 'provides'
                    {
                    match(input,55,FOLLOW_55_in_ruleRole7958); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4445:6: ( 'requires' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4445:6: ( 'requires' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4445:8: 'requires'
                    {
                    match(input,56,FOLLOW_56_in_ruleRole7973); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1(), null); 
                          
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
    // $ANTLR end ruleRole

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1646:2: ( ruleCompositeAnonymousSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1646:2: ruleCompositeAnonymousSubComponent
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_synpred412779);
        ruleCompositeAnonymousSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1659:2: ( ruleCompositeSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1659:2: ruleCompositeSubComponent
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompositeSubComponent_in_synpred422809);
        ruleCompositeSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1672:2: ( rulePrimitiveAnonymousSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1672:2: rulePrimitiveAnonymousSubComponent
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_synpred432839);
        rulePrimitiveAnonymousSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1685:2: ( rulePrimitiveSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1685:2: rulePrimitiveSubComponent
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePrimitiveSubComponent_in_synpred442869);
        rulePrimitiveSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\4\1\16\1\4\2\uffff\1\16";
    static final String DFA3_maxS =
        "\1\4\1\62\1\4\2\uffff\1\62";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\24\uffff\1\2\16\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\24\uffff\1\2\16\uffff\1\4"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "195:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x000002000019A000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0000000000198000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportDefinition285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition304 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition606 = new BitSet(new long[]{0x018002E045020002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition627 = new BitSet(new long[]{0x018002E044020002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition649 = new BitSet(new long[]{0x018002E040020002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition662 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition684 = new BitSet(new long[]{0x018000E040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition706 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveComponentDefinition718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition747 = new BitSet(new long[]{0x018000E040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition769 = new BitSet(new long[]{0x018002E040000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement869 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement899 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement929 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement959 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveDefinitionElement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleComponentTypeDefinition1053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1074 = new BitSet(new long[]{0x0180020004020002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1095 = new BitSet(new long[]{0x0180020000020002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1119 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1141 = new BitSet(new long[]{0x0180020000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1160 = new BitSet(new long[]{0x0180020000040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1182 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1204 = new BitSet(new long[]{0x0180020000040000L});
    public static final BitSet FOLLOW_18_in_ruleComponentTypeDefinition1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1404 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDefinitionElement1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeComponentDefinition1497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1518 = new BitSet(new long[]{0x018002020D220002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1539 = new BitSet(new long[]{0x018002020D020002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1561 = new BitSet(new long[]{0x018002020C020002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1583 = new BitSet(new long[]{0x0180020208020002L});
    public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition1596 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1618 = new BitSet(new long[]{0x0180000208000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1640 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1681 = new BitSet(new long[]{0x0180000208000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1703 = new BitSet(new long[]{0x0180020208000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList1787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1809 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList1820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1841 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList1935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1957 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList1968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1989 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveReferencesList2083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2104 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferencesList2115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2136 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompositeReferencesList2219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2240 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferencesList2251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2272 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeReferencesList2355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2376 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTypeReferencesList2387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2408 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompositeDefinitionElement2584 = new BitSet(new long[]{0x0000000010110010L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2609 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2640 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2670 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleCompositeDefinitionElement2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition2936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition2992 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3024 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3056 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3068 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3081 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3102 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3113 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3134 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSubComponent3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeSubComponent3229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositeSubComponent3260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeSubComponent3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeAnonymousSubComponent3363 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3384 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositeAnonymousSubComponent3395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent3412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeAnonymousSubComponent3427 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent3449 = new BitSet(new long[]{0x0180000208000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent3471 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeAnonymousSubComponent3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3575 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition3586 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3607 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition3618 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3639 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition3689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition3742 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemplateDefinition3757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent3816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSubComponent3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateSubComponent3872 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTemplateSubComponent3883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent3941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSubComponent3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveSubComponent3986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveSubComponent4017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4120 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4141 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveAnonymousSubComponent4152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4169 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveAnonymousSubComponent4184 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4206 = new BitSet(new long[]{0x018000E040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent4228 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveAnonymousSubComponent4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAttributeDefinition4321 = new BitSet(new long[]{0x0003800000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition4360 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeDefinition4376 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition4488 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArgumentDefinition4503 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition4644 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInterfaceDefinition4665 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition4676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition4693 = new BitSet(new long[]{0x0060000080000002L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition4717 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition4747 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition4771 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition4889 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition4900 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4923 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition4939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4956 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition4972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition4989 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition5004 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition5016 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5027 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5050 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition5066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5083 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition5099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5116 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataDefinition5215 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataDefinition5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplementationDefinition5363 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier5501 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTemplateSpecifier5516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATH_in_ruleFileC5625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName5689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5740 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFileName5759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODEC_in_ruleInlineCodeC5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList5912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList5968 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList5989 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnnotation6071 = new BitSet(new long[]{0x0000780000000010L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation6092 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAnnotation6103 = new BitSet(new long[]{0x0000020000020130L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6124 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation6135 = new BitSet(new long[]{0x0000020000020130L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6156 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleAnnotation6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement6286 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationElement6301 = new BitSet(new long[]{0x0000020000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue6359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue6514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer6772 = new BitSet(new long[]{0x0000020000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6793 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer6804 = new BitSet(new long[]{0x0000020000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6825 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue6874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleHexadecimalType7112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAnnotationType7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAnnotationType7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAnnotationType7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAnnotationType7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAnnotationType7307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType7353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttributeType7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttributeType7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAttributeType7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN7507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7558 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFQN7577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7592 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7698 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFULL_IMPORT_NAME7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT7757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulesignedINT7807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_52_in_rulesignedINT7826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleContingency7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleContingency7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRole7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRole7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_synpred412779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_synpred422809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_synpred432839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_synpred442869 = new BitSet(new long[]{0x0000000000000002L});

}