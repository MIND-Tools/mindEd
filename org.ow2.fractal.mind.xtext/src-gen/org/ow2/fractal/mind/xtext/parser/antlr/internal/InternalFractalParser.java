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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:74:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:74:55: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:75:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdlDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition79);
            iv_ruleAdlDefinition=ruleAdlDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition89); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:82:1: ruleAdlDefinition returns [EObject current=null] : ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_definitionAnnotationsList_1 = null;

        EObject lv_architecturedefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:6: ( ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:88:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:88:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:88:2: (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:88:2: (lv_imports_0= ruleImportDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:91:6: lv_imports_0= ruleImportDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition148);
            	    lv_imports_0=ruleImportDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "imports", lv_imports_0, "ImportDefinition", currentNode);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:109:3: (lv_definitionAnnotationsList_1= ruleAnnotationsList )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:112:6: lv_definitionAnnotationsList_1= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getDefinitionAnnotationsListAnnotationsListParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition187);
                    lv_definitionAnnotationsList_1=ruleAnnotationsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "definitionAnnotationsList", lv_definitionAnnotationsList_1, "AnnotationsList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:130:3: (lv_architecturedefinition_2= ruleArchitectureDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:133:6: lv_architecturedefinition_2= ruleArchitectureDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitecturedefinitionArchitectureDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition226);
            lv_architecturedefinition_2=ruleArchitectureDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "architecturedefinition", lv_architecturedefinition_2, "ArchitectureDefinition", currentNode);
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
    // $ANTLR end ruleAdlDefinition


    // $ANTLR start entryRuleImportDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:158:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:158:58: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:159:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition263);
            iv_ruleImportDefinition=ruleImportDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition273); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:166:1: ruleImportDefinition returns [EObject current=null] : ( 'import' (lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME ) ) ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_importName_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:6: ( ( 'import' (lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME ) ) ';' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:172:1: ( 'import' (lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME ) ) ';' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:172:1: ( 'import' (lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME ) ) ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:172:2: 'import' (lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME ) ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleImportDefinition307); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportDefinitionAccess().getImportKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:176:1: (lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:178:6: lv_importName_1= ( ruleFQN | ruleFULL_IMPORT_NAME )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:178:22: ( ruleFQN | ruleFULL_IMPORT_NAME )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:178:24: ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFQNParserRuleCall_1_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleImportDefinition333);
                    ruleFQN();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:185:7: ruleFULL_IMPORT_NAME
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFULL_IMPORT_NAMEParserRuleCall_1_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition347);
                    ruleFULL_IMPORT_NAME();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "importName", lv_importName_1, null, lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            match(input,14,FOLLOW_14_in_ruleImportDefinition365); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:217:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:217:64: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:218:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArchitectureDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition398);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition408); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:225:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:230:6: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:231:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:231:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
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
                    new NoViableAltException("231:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:232:5: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition455);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:242:5: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition482);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:252:5: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition509);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:267:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:267:70: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:268:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition541);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition551); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:275:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) ) ;
    public final EObject rulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0=null;
        AntlrDatatypeRuleToken lv_name_2 = null;

        EObject lv_primitiveFormalArgumentsList_3 = null;

        EObject lv_referencesList_4 = null;

        EObject lv_elements_6 = null;

        EObject lv_elements_7 = null;

        EObject lv_elements_9 = null;

        EObject lv_elements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:280:6: ( ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:281:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:281:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:281:2: (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFQN ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:281:2: (lv_abstract_0= 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:283:6: lv_abstract_0= 'abstract'
                    {
                    lv_abstract_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePrimitiveComponentDefinition597); if (failed) return current;
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
                    break;

            }

            match(input,16,FOLLOW_16_in_rulePrimitiveComponentDefinition620); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:306:1: (lv_name_2= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:309:6: lv_name_2= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition654);
            lv_name_2=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_2, "FQN", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:327:2: (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:330:6: lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition692);
                    lv_primitiveFormalArgumentsList_3=ruleFormalArgumentsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "primitiveFormalArgumentsList", lv_primitiveFormalArgumentsList_3, "FormalArgumentsList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:348:3: (lv_referencesList_4= rulePrimitiveReferencesList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:351:6: lv_referencesList_4= rulePrimitiveReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getReferencesListPrimitiveReferencesListParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition731);
                    lv_referencesList_4=rulePrimitiveReferencesList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "referencesList", lv_referencesList_4, "PrimitiveReferencesList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:369:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )
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
                    new NoViableAltException("369:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:369:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:369:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:369:5: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_rulePrimitiveComponentDefinition747); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:373:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==30||(LA9_0>=37 && LA9_0<=39)||LA9_0==41||(LA9_0>=55 && LA9_0<=56)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:373:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:373:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==41) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:376:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition782);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "elements", lv_elements_6, "AnnotationsList", currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:394:3: (lv_elements_7= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:397:6: lv_elements_7= rulePrimitiveDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition821);
                    	    lv_elements_7=rulePrimitiveDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "elements", lv_elements_7, "PrimitiveDefinitionElement", currentNode);
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

                    match(input,18,FOLLOW_18_in_rulePrimitiveComponentDefinition836); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:420:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:420:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==30||(LA11_0>=37 && LA11_0<=39)||LA11_0==41||(LA11_0>=55 && LA11_0<=56)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:420:7: (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:420:7: (lv_elements_9= ruleAnnotationsList )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==41) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:423:6: lv_elements_9= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition878);
                    	            lv_elements_9=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "elements", lv_elements_9, "AnnotationsList", currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:441:3: (lv_elements_10= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:444:6: lv_elements_10= rulePrimitiveDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition917);
                    	    lv_elements_10=rulePrimitiveDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "elements", lv_elements_10, "PrimitiveDefinitionElement", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:469:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:469:68: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:470:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement957);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement967); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:477:1: rulePrimitiveDefinitionElement returns [EObject current=null] : ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:482:6: ( ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:483:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
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
                    new NoViableAltException("483:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:484:5: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement1015);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:494:5: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1042);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:504:5: this_DataDefinition_2= ruleDataDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1069);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:514:5: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_0_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1096);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:522:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:522:3: ';'
                    {
                    match(input,14,FOLLOW_14_in_rulePrimitiveDefinitionElement1106); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:533:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:533:65: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:534:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getComponentTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1141);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComponentTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentTypeDefinition1151); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:1: ruleComponentTypeDefinition returns [EObject current=null] : ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) ;
    public final EObject ruleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_referencesList_2 = null;

        EObject lv_elements_3 = null;

        EObject lv_elements_4 = null;

        EObject lv_elements_6 = null;

        EObject lv_elements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:546:6: ( ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:547:1: ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:547:1: ( 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:547:2: 'type' (lv_name_1= ruleFQN ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )
            {
            match(input,19,FOLLOW_19_in_ruleComponentTypeDefinition1185); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:551:1: (lv_name_1= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:554:6: lv_name_1= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1219);
            lv_name_1=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "FQN", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:572:2: (lv_referencesList_2= ruleTypeReferencesList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:575:6: lv_referencesList_2= ruleTypeReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getReferencesListTypeReferencesListParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1257);
                    lv_referencesList_2=ruleTypeReferencesList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "referencesList", lv_referencesList_2, "TypeReferencesList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:593:3: ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )
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
                    new NoViableAltException("593:3: ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:593:4: ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:593:4: ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==41||(LA17_0>=55 && LA17_0<=56)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:593:5: (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:593:5: (lv_elements_3= ruleAnnotationsList )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==41) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:596:6: lv_elements_3= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_0_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1298);
                    	            lv_elements_3=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "elements", lv_elements_3, "AnnotationsList", currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:614:3: (lv_elements_4= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:617:6: lv_elements_4= ruleTypeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1337);
                    	    lv_elements_4=ruleTypeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "elements", lv_elements_4, "TypeDefinitionElement", currentNode);
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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:636:6: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:636:6: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:636:7: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleComponentTypeDefinition1359); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:640:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==41||(LA19_0>=55 && LA19_0<=56)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:640:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:640:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==41) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:643:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_1_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1394);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "elements", lv_elements_6, "AnnotationsList", currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:661:3: (lv_elements_7= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:664:6: lv_elements_7= ruleTypeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1433);
                    	    lv_elements_7=ruleTypeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "elements", lv_elements_7, "TypeDefinitionElement", currentNode);
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

                    match(input,18,FOLLOW_18_in_ruleComponentTypeDefinition1448); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:693:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:693:65: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:694:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1483);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferenceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1493); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:701:1: ruleTypeReferenceDefinition returns [EObject current=null] : (lv_referenceName_0= ruleFQN ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:706:6: ( (lv_referenceName_0= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:707:1: (lv_referenceName_0= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:707:1: (lv_referenceName_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:710:6: lv_referenceName_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1551);
            lv_referenceName_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeReferenceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "referenceName", lv_referenceName_0, "FQN", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:735:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:735:63: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:736:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1587);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinitionElement1597); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:743:1: ruleTypeDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:748:6: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:749:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:749:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:750:5: this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )?
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1644);
            this_InterfaceDefinition_0=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_InterfaceDefinition_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:758:1: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:758:2: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleTypeDefinitionElement1653); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:769:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:769:70: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:770:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1688);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1698); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:777:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) ) ;
    public final EObject ruleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_templateSpecifiersList_2 = null;

        EObject lv_compositeFormalArgumentsList_3 = null;

        EObject lv_referencesList_4 = null;

        EObject lv_elements_6 = null;

        EObject lv_elements_7 = null;

        EObject lv_elements_9 = null;

        EObject lv_elements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:782:6: ( ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:783:1: ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:783:1: ( 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:783:2: 'composite' (lv_name_1= ruleFQN ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )
            {
            match(input,20,FOLLOW_20_in_ruleCompositeComponentDefinition1732); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:787:1: (lv_name_1= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:790:6: lv_name_1= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1766);
            lv_name_1=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "FQN", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:808:2: (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:811:6: lv_templateSpecifiersList_2= ruleTemplateSpecifiersList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1804);
                    lv_templateSpecifiersList_2=ruleTemplateSpecifiersList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "templateSpecifiersList", lv_templateSpecifiersList_2, "TemplateSpecifiersList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:829:3: (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:832:6: lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1843);
                    lv_compositeFormalArgumentsList_3=ruleFormalArgumentsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "compositeFormalArgumentsList", lv_compositeFormalArgumentsList_3, "FormalArgumentsList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:850:3: (lv_referencesList_4= ruleCompositeReferencesList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:853:6: lv_referencesList_4= ruleCompositeReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getReferencesListCompositeReferencesListParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1882);
                    lv_referencesList_4=ruleCompositeReferencesList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "referencesList", lv_referencesList_4, "CompositeReferencesList", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )
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
                    new NoViableAltException("871:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:871:5: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleCompositeComponentDefinition1898); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:875:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==27||LA26_0==33||LA26_0==41||(LA26_0>=55 && LA26_0<=56)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:875:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:875:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==41) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:878:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1933);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "elements", lv_elements_6, "AnnotationsList", currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:896:3: (lv_elements_7= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:899:6: lv_elements_7= ruleCompositeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1972);
                    	    lv_elements_7=ruleCompositeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "elements", lv_elements_7, "CompositeDefinitionElement", currentNode);
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

                    match(input,18,FOLLOW_18_in_ruleCompositeComponentDefinition1987); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==27||LA28_0==33||LA28_0==41||(LA28_0>=55 && LA28_0<=56)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:7: (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:922:7: (lv_elements_9= ruleAnnotationsList )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==41) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:925:6: lv_elements_9= ruleAnnotationsList
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2029);
                    	            lv_elements_9=ruleAnnotationsList();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "elements", lv_elements_9, "AnnotationsList", currentNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	        currentNode = currentNode.getParent();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:943:3: (lv_elements_10= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:946:6: lv_elements_10= ruleCompositeDefinitionElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2068);
                    	    lv_elements_10=ruleCompositeDefinitionElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "elements", lv_elements_10, "CompositeDefinitionElement", currentNode);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:971:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:971:64: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:972:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifiersListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2108);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2118); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:979:1: ruleTemplateSpecifiersList returns [EObject current=null] : ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject lv_templateSpecifiers_1 = null;

        EObject lv_templateSpecifiers_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:984:6: ( ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:985:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:985:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:985:2: '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>'
            {
            match(input,21,FOLLOW_21_in_ruleTemplateSpecifiersList2152); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:989:1: ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:989:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:989:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:992:6: lv_templateSpecifiers_1= ruleTemplateSpecifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2187);
            lv_templateSpecifiers_1=ruleTemplateSpecifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSpecifiersListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "templateSpecifiers", lv_templateSpecifiers_1, "TemplateSpecifier", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1010:2: ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1010:3: ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTemplateSpecifiersList2201); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1014:1: (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1017:6: lv_templateSpecifiers_3= ruleTemplateSpecifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2235);
            	    lv_templateSpecifiers_3=ruleTemplateSpecifier();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTemplateSpecifiersListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "templateSpecifiers", lv_templateSpecifiers_3, "TemplateSpecifier", currentNode);
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


            }

            match(input,23,FOLLOW_23_in_ruleTemplateSpecifiersList2251); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1046:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1046:61: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1047:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalArgumentsListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2284);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList2294); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:1: ruleFormalArgumentsList returns [EObject current=null] : ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject lv_formalArguments_1 = null;

        EObject lv_formalArguments_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1059:6: ( ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1060:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1060:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1060:2: '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleFormalArgumentsList2328); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1064:1: ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1064:2: (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1064:2: (lv_formalArguments_1= ruleFormalArgument )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1067:6: lv_formalArguments_1= ruleFormalArgument
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2363);
            lv_formalArguments_1=ruleFormalArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFormalArgumentsListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "formalArguments", lv_formalArguments_1, "FormalArgument", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1085:2: ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1085:3: ',' (lv_formalArguments_3= ruleFormalArgument )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleFormalArgumentsList2377); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1089:1: (lv_formalArguments_3= ruleFormalArgument )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1092:6: lv_formalArguments_3= ruleFormalArgument
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2411);
            	    lv_formalArguments_3=ruleFormalArgument();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFormalArgumentsListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "formalArguments", lv_formalArguments_3, "FormalArgument", currentNode);
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


            }

            match(input,25,FOLLOW_25_in_ruleFormalArgumentsList2427); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1121:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1121:65: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1122:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveReferencesListRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2460);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferencesList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferencesList2470); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1129:1: rulePrimitiveReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1134:6: ( ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1135:1: ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1135:1: ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1135:2: 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )*
            {
            match(input,26,FOLLOW_26_in_rulePrimitiveReferencesList2504); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1139:1: (lv_references_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1142:6: lv_references_1= rulePrimitiveReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2538);
            lv_references_1=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "references", lv_references_1, "PrimitiveReferenceDefinition", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1160:2: ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1160:3: ',' (lv_references_3= rulePrimitiveReferenceDefinition )
            	    {
            	    match(input,22,FOLLOW_22_in_rulePrimitiveReferencesList2552); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1164:1: (lv_references_3= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1167:6: lv_references_3= rulePrimitiveReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2586);
            	    lv_references_3=rulePrimitiveReferenceDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveReferencesListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "references", lv_references_3, "PrimitiveReferenceDefinition", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1192:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1192:65: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1193:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeReferencesListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2625);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferencesList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferencesList2635); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1200:1: ruleCompositeReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1205:6: ( ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1206:1: ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1206:1: ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1206:2: 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )*
            {
            match(input,26,FOLLOW_26_in_ruleCompositeReferencesList2669); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1210:1: (lv_references_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1213:6: lv_references_1= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2703);
            lv_references_1=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "references", lv_references_1, "CompositeReferenceDefinition", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1231:2: ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1231:3: ',' (lv_references_3= ruleCompositeReferenceDefinition )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleCompositeReferencesList2717); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1235:1: (lv_references_3= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1238:6: lv_references_3= ruleCompositeReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2751);
            	    lv_references_3=ruleCompositeReferenceDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeReferencesListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "references", lv_references_3, "CompositeReferenceDefinition", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1263:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1263:60: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1264:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeReferencesListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2790);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferencesList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferencesList2800); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1271:1: ruleTypeReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1276:6: ( ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:1: ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:1: ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1277:2: 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )*
            {
            match(input,26,FOLLOW_26_in_ruleTypeReferencesList2834); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1281:1: (lv_references_1= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1284:6: lv_references_1= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2868);
            lv_references_1=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "references", lv_references_1, "TypeReferenceDefinition", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1302:2: ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1302:3: ',' (lv_references_3= ruleTypeReferenceDefinition )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTypeReferencesList2882); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1306:1: (lv_references_3= ruleTypeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1309:6: lv_references_3= ruleTypeReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2916);
            	    lv_references_3=ruleTypeReferenceDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTypeReferencesListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "references", lv_references_3, "TypeReferenceDefinition", currentNode);
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
    // $ANTLR end ruleTypeReferencesList


    // $ANTLR start entryRuleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1334:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1334:56: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1335:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalArgumentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2955);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument2965); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1342:1: ruleFormalArgument returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1347:6: ( (lv_name_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1348:1: (lv_name_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1348:1: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1350:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument3011); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFormalArgumentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1375:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1375:68: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1376:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3051);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeDefinitionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3061); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1383:1: ruleCompositeDefinitionElement returns [EObject current=null] : ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_InterfaceDefinition_2 = null;

        EObject this_BindingDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1388:6: ( ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:1: ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:1: ( ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:2: ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:2: ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )
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
                    new NoViableAltException("1389:2: ( ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition ) | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:3: ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:3: ( 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1389:4: 'contains' this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    match(input,27,FOLLOW_27_in_ruleCompositeDefinitionElement3097); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeDefinitionElementAccess().getContainsKeyword_0_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3119);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1404:5: this_InterfaceDefinition_2= ruleInterfaceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3147);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1414:5: this_BindingDefinition_3= ruleBindingDefinition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3174);
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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1422:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1422:3: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleCompositeDefinitionElement3184); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1433:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1433:64: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1434:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3219);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition3229); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1441:1: ruleSubComponentDefinition returns [EObject current=null] : (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeAnonymousSubComponent_0 = null;

        EObject this_CompositeSubComponent_1 = null;

        EObject this_PrimitiveAnonymousSubComponent_2 = null;

        EObject this_PrimitiveSubComponent_3 = null;

        EObject this_TemplateSubComponent_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1446:6: ( (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1447:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1447:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )
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
                        new NoViableAltException("1447:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )", 37, 1, input);

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
                        new NoViableAltException("1447:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )", 37, 2, input);

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
                    new NoViableAltException("1447:1: (this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent | this_CompositeSubComponent_1= ruleCompositeSubComponent | this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_TemplateSubComponent_4= ruleTemplateSubComponent )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1448:5: this_CompositeAnonymousSubComponent_0= ruleCompositeAnonymousSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeAnonymousSubComponentParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3276);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1458:5: this_CompositeSubComponent_1= ruleCompositeSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeSubComponentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3303);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1468:5: this_PrimitiveAnonymousSubComponent_2= rulePrimitiveAnonymousSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveAnonymousSubComponentParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3330);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:5: this_PrimitiveSubComponent_3= rulePrimitiveSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveSubComponentParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3357);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1488:5: this_TemplateSubComponent_4= ruleTemplateSubComponent
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplateSubComponentParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3384);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1505:1: entryRuleCompositeReferenceDefinition returns [EObject current=null] : iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF ;
    public final EObject entryRuleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1505:70: (iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1506:2: iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3418);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferenceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3428); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1513:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_templatesList_2 = null;

        EObject lv_templatesList_4 = null;

        EObject lv_argumentsList_7 = null;

        EObject lv_argumentsList_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1518:6: ( ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:1: ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:1: ( (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:2: (lv_referenceName_0= ruleFQN ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:2: (lv_referenceName_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1522:6: lv_referenceName_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3487);
            lv_referenceName_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "referenceName", lv_referenceName_0, "FQN", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1540:2: ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1540:3: '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>'
                    {
                    match(input,21,FOLLOW_21_in_ruleCompositeReferenceDefinition3501); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1544:1: (lv_templatesList_2= ruleTemplateDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1547:6: lv_templatesList_2= ruleTemplateDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3535);
                    lv_templatesList_2=ruleTemplateDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		add(current, "templatesList", lv_templatesList_2, "TemplateDefinition", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1565:2: ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==22) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1565:3: ',' (lv_templatesList_4= ruleTemplateDefinition )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3549); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1569:1: (lv_templatesList_4= ruleTemplateDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1572:6: lv_templatesList_4= ruleTemplateDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3583);
                    	    lv_templatesList_4=ruleTemplateDefinition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "templatesList", lv_templatesList_4, "TemplateDefinition", currentNode);
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

                    match(input,23,FOLLOW_23_in_ruleCompositeReferenceDefinition3598); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1594:3: ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1594:4: '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleCompositeReferenceDefinition3610); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1598:1: (lv_argumentsList_7= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1601:6: lv_argumentsList_7= ruleArgumentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3644);
                    lv_argumentsList_7=ruleArgumentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		add(current, "argumentsList", lv_argumentsList_7, "ArgumentDefinition", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1619:2: ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==22) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1619:3: ',' (lv_argumentsList_9= ruleArgumentDefinition )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3658); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1623:1: (lv_argumentsList_9= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1626:6: lv_argumentsList_9= ruleArgumentDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3692);
                    	    lv_argumentsList_9=ruleArgumentDefinition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "argumentsList", lv_argumentsList_9, "ArgumentDefinition", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleCompositeReferenceDefinition3707); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1655:1: entryRuleCompositeSubComponent returns [EObject current=null] : iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF ;
    public final EObject entryRuleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1655:63: (iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1656:2: iv_ruleCompositeSubComponent= ruleCompositeSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3742);
            iv_ruleCompositeSubComponent=ruleCompositeSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSubComponent3752); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1663:1: ruleCompositeSubComponent returns [EObject current=null] : ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleCompositeSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1668:6: ( ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1669:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1669:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1669:2: 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition ) 'as' (lv_name_3= RULE_ID )
            {
            match(input,20,FOLLOW_20_in_ruleCompositeSubComponent3786); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeSubComponentAccess().getCompositeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1673:1: (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1676:6: lv_referenceDefinition_1= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3820);
            lv_referenceDefinition_1=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "CompositeReferenceDefinition", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            match(input,28,FOLLOW_28_in_ruleCompositeSubComponent3833); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1698:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1700:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeSubComponent3855); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getCompositeSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
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
    // $ANTLR end ruleCompositeSubComponent


    // $ANTLR start entryRuleCompositeAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1725:1: entryRuleCompositeAnonymousSubComponent returns [EObject current=null] : iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF ;
    public final EObject entryRuleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1725:72: (iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1726:2: iv_ruleCompositeAnonymousSubComponent= ruleCompositeAnonymousSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3896);
            iv_ruleCompositeAnonymousSubComponent=ruleCompositeAnonymousSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeAnonymousSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3906); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1733:1: ruleCompositeAnonymousSubComponent returns [EObject current=null] : ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' ) ;
    public final EObject ruleCompositeAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;

        EObject lv_elements_5 = null;

        EObject lv_elements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1738:6: ( ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1739:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1739:1: ( 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1739:2: 'composite' (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleCompositeAnonymousSubComponent3940); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1743:1: (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1746:6: lv_referenceDefinition_1= ruleCompositeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3974);
                    lv_referenceDefinition_1=ruleCompositeReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "CompositeReferenceDefinition", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_ruleCompositeAnonymousSubComponent3988); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1768:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1770:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4010); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            match(input,17,FOLLOW_17_in_ruleCompositeAnonymousSubComponent4027); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:1: ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==27||LA44_0==33||LA44_0==41||(LA44_0>=55 && LA44_0<=56)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:2: (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:2: (lv_elements_5= ruleAnnotationsList )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==41) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1795:6: lv_elements_5= ruleAnnotationsList
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4062);
            	            lv_elements_5=ruleAnnotationsList();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "elements", lv_elements_5, "AnnotationsList", currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1813:3: (lv_elements_6= ruleCompositeDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1816:6: lv_elements_6= ruleCompositeDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4101);
            	    lv_elements_6=ruleCompositeDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeAnonymousSubComponentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "elements", lv_elements_6, "CompositeDefinitionElement", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleCompositeAnonymousSubComponent4116); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1845:1: entryRulePrimitiveReferenceDefinition returns [EObject current=null] : iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF ;
    public final EObject entryRulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1845:70: (iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1846:2: iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4149);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferenceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4159); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1853:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_argumentsList_2 = null;

        EObject lv_argumentsList_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1858:6: ( ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:1: ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:1: ( (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:2: (lv_referenceName_0= ruleFQN ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:2: (lv_referenceName_0= ruleFQN )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1862:6: lv_referenceName_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition4218);
            lv_referenceName_0=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "referenceName", lv_referenceName_0, "FQN", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1880:2: ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1880:3: '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_rulePrimitiveReferenceDefinition4232); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1884:1: (lv_argumentsList_2= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1887:6: lv_argumentsList_2= ruleArgumentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4266);
                    lv_argumentsList_2=ruleArgumentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		add(current, "argumentsList", lv_argumentsList_2, "ArgumentDefinition", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1905:2: ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1905:3: ',' (lv_argumentsList_4= ruleArgumentDefinition )
                    	    {
                    	    match(input,22,FOLLOW_22_in_rulePrimitiveReferenceDefinition4280); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1909:1: (lv_argumentsList_4= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1912:6: lv_argumentsList_4= ruleArgumentDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4314);
                    	    lv_argumentsList_4=ruleArgumentDefinition();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "argumentsList", lv_argumentsList_4, "ArgumentDefinition", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_rulePrimitiveReferenceDefinition4329); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1941:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1941:60: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1942:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4364);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition4374); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1949:1: ruleTemplateDefinition returns [EObject current=null] : ( ( (lv_name_0= RULE_ID ) '=' )? (lv_reference_2= ruleCompositeReferenceDefinition ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_reference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1954:6: ( ( ( (lv_name_0= RULE_ID ) '=' )? (lv_reference_2= ruleCompositeReferenceDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:1: ( ( (lv_name_0= RULE_ID ) '=' )? (lv_reference_2= ruleCompositeReferenceDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:1: ( ( (lv_name_0= RULE_ID ) '=' )? (lv_reference_2= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:2: ( (lv_name_0= RULE_ID ) '=' )? (lv_reference_2= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:2: ( (lv_name_0= RULE_ID ) '=' )?
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:3: (lv_name_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:3: (lv_name_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1957:6: lv_name_0= RULE_ID
                    {
                    lv_name_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition4422); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTemplateDefinitionAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,29,FOLLOW_29_in_ruleTemplateDefinition4439); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1979:3: (lv_reference_2= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1982:6: lv_reference_2= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getReferenceCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4475);
            lv_reference_2=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "reference", lv_reference_2, "CompositeReferenceDefinition", currentNode);
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
    // $ANTLR end ruleTemplateDefinition


    // $ANTLR start entryRuleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2007:1: entryRuleTemplateSubComponent returns [EObject current=null] : iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF ;
    public final EObject entryRuleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2007:62: (iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2008:2: iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4512);
            iv_ruleTemplateSubComponent=ruleTemplateSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSubComponent4522); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2015:1: ruleTemplateSubComponent returns [EObject current=null] : ( (lv_referenceDefinition_0= ruleCompositeReferenceDefinition )? 'as' (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        EObject lv_referenceDefinition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2020:6: ( ( (lv_referenceDefinition_0= ruleCompositeReferenceDefinition )? 'as' (lv_name_2= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2021:1: ( (lv_referenceDefinition_0= ruleCompositeReferenceDefinition )? 'as' (lv_name_2= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2021:1: ( (lv_referenceDefinition_0= ruleCompositeReferenceDefinition )? 'as' (lv_name_2= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2021:2: (lv_referenceDefinition_0= ruleCompositeReferenceDefinition )? 'as' (lv_name_2= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2021:2: (lv_referenceDefinition_0= ruleCompositeReferenceDefinition )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2024:6: lv_referenceDefinition_0= ruleCompositeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTemplateSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateSubComponent4581);
                    lv_referenceDefinition_0=ruleCompositeReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "referenceDefinition", lv_referenceDefinition_0, "CompositeReferenceDefinition", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_ruleTemplateSubComponent4595); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSubComponentAccess().getAsKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2046:1: (lv_name_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2048:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4617); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTemplateSubComponentAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
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
    // $ANTLR end ruleTemplateSubComponent


    // $ANTLR start entryRulePrimitiveSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2073:1: entryRulePrimitiveSubComponent returns [EObject current=null] : iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF ;
    public final EObject entryRulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2073:63: (iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2074:2: iv_rulePrimitiveSubComponent= rulePrimitiveSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4658);
            iv_rulePrimitiveSubComponent=rulePrimitiveSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSubComponent4668); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2081:1: rulePrimitiveSubComponent returns [EObject current=null] : ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) ;
    public final EObject rulePrimitiveSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2086:6: ( ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2087:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2087:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2087:2: 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition ) 'as' (lv_name_3= RULE_ID )
            {
            match(input,16,FOLLOW_16_in_rulePrimitiveSubComponent4702); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getPrimitiveKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2091:1: (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2094:6: lv_referenceDefinition_1= rulePrimitiveReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4736);
            lv_referenceDefinition_1=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "PrimitiveReferenceDefinition", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            match(input,28,FOLLOW_28_in_rulePrimitiveSubComponent4749); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2116:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2118:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4771); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
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
    // $ANTLR end rulePrimitiveSubComponent


    // $ANTLR start entryRulePrimitiveAnonymousSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2143:1: entryRulePrimitiveAnonymousSubComponent returns [EObject current=null] : iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF ;
    public final EObject entryRulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveAnonymousSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2143:72: (iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2144:2: iv_rulePrimitiveAnonymousSubComponent= rulePrimitiveAnonymousSubComponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4812);
            iv_rulePrimitiveAnonymousSubComponent=rulePrimitiveAnonymousSubComponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveAnonymousSubComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4822); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2151:1: rulePrimitiveAnonymousSubComponent returns [EObject current=null] : ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' ) ;
    public final EObject rulePrimitiveAnonymousSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_referenceDefinition_1 = null;

        EObject lv_elements_5 = null;

        EObject lv_elements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2156:6: ( ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2157:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2157:1: ( 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2157:2: 'primitive' (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )? 'as' (lv_name_3= RULE_ID ) '{' ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )* '}'
            {
            match(input,16,FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4856); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2161:1: (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2164:6: lv_referenceDefinition_1= rulePrimitiveReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4890);
                    lv_referenceDefinition_1=rulePrimitiveReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "referenceDefinition", lv_referenceDefinition_1, "PrimitiveReferenceDefinition", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_rulePrimitiveAnonymousSubComponent4904); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2186:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2188:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4926); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            match(input,17,FOLLOW_17_in_rulePrimitiveAnonymousSubComponent4943); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2210:1: ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==30||(LA51_0>=37 && LA51_0<=39)||LA51_0==41||(LA51_0>=55 && LA51_0<=56)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2210:2: (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2210:2: (lv_elements_5= ruleAnnotationsList )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==41) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2213:6: lv_elements_5= ruleAnnotationsList
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4978);
            	            lv_elements_5=ruleAnnotationsList();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		add(current, "elements", lv_elements_5, "AnnotationsList", currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2231:3: (lv_elements_6= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2234:6: lv_elements_6= rulePrimitiveDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5017);
            	    lv_elements_6=rulePrimitiveDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveAnonymousSubComponentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "elements", lv_elements_6, "PrimitiveDefinitionElement", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_rulePrimitiveAnonymousSubComponent5032); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2263:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2263:61: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2264:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5065);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5075); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2271:1: ruleAttributeDefinition returns [EObject current=null] : ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_2=null;
        AntlrDatatypeRuleToken lv_type_1 = null;

        AntlrDatatypeRuleToken lv_value_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2276:6: ( ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2277:1: ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2277:1: ( 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2277:2: 'attribute' (lv_type_1= ruleAttributeType )? (lv_attributeName_2= RULE_ID ) ( '=' (lv_value_4= ruleValue ) )?
            {
            match(input,30,FOLLOW_30_in_ruleAttributeDefinition5109); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2281:1: (lv_type_1= ruleAttributeType )?
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2284:6: lv_type_1= ruleAttributeType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5143);
                    lv_type_1=ruleAttributeType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_1, "AttributeType", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2302:3: (lv_attributeName_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2304:6: lv_attributeName_2= RULE_ID
            {
            lv_attributeName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5170); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_2_0(), "attributeName"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "attributeName", lv_attributeName_2, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2322:2: ( '=' (lv_value_4= ruleValue ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2322:3: '=' (lv_value_4= ruleValue )
                    {
                    match(input,29,FOLLOW_29_in_ruleAttributeDefinition5188); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2326:1: (lv_value_4= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2329:6: lv_value_4= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5222);
                    lv_value_4=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "value", lv_value_4, "Value", currentNode);
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
    // $ANTLR end ruleAttributeDefinition


    // $ANTLR start entryRuleArgumentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2354:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2354:60: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2355:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArgumentDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5261);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5271); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2362:1: ruleArgumentDefinition returns [EObject current=null] : ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0=null;
        AntlrDatatypeRuleToken lv_argumentValue_2 = null;

        AntlrDatatypeRuleToken lv_argumentValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2367:6: ( ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )
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
                        new NoViableAltException("2368:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_INT||LA54_0==RULE_STRING||LA54_0==42||(LA54_0>=51 && LA54_0<=52)) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2368:1: ( ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) ) | (lv_argumentValue_3= ruleValue ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:2: ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:2: ( (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:3: (lv_argumentName_0= RULE_ID ) '=' (lv_argumentValue_2= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:3: (lv_argumentName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2370:6: lv_argumentName_0= RULE_ID
                    {
                    lv_argumentName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5319); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getArgumentDefinitionAccess().getArgumentNameIDTerminalRuleCall_0_0_0(), "argumentName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "argumentName", lv_argumentName_0, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,29,FOLLOW_29_in_ruleArgumentDefinition5336); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2392:1: (lv_argumentValue_2= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2395:6: lv_argumentValue_2= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5370);
                    lv_argumentValue_2=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "argumentValue", lv_argumentValue_2, "Value", currentNode);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2414:6: (lv_argumentValue_3= ruleValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2414:6: (lv_argumentValue_3= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2417:6: lv_argumentValue_3= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5415);
                    lv_argumentValue_3=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "argumentValue", lv_argumentValue_3, "Value", currentNode);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2442:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2442:61: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2443:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5452);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition5462); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2450:1: ruleInterfaceDefinition returns [EObject current=null] : ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFQN )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        Token lv_collection_4=null;
        Token lv_collectionsize_5=null;
        Token lv_collection_6=null;
        Enumerator lv_role_0 = null;

        AntlrDatatypeRuleToken lv_signature_1 = null;

        Enumerator lv_contingency_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2455:6: ( ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFQN )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2456:1: ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFQN )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2456:1: ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFQN )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2456:2: (lv_role_0= ruleRole ) (lv_signature_1= ruleFQN )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2456:2: (lv_role_0= ruleRole )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2459:6: lv_role_0= ruleRole
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRole_in_ruleInterfaceDefinition5521);
            lv_role_0=ruleRole();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "role", lv_role_0, "Role", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2477:2: (lv_signature_1= ruleFQN )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2480:6: lv_signature_1= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFQNParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleInterfaceDefinition5559);
                    lv_signature_1=ruleFQN();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "signature", lv_signature_1, "FQN", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_ruleInterfaceDefinition5573); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2502:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2504:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDefinition5595); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2522:2: ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2522:3: (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2522:3: (lv_collection_4= '[' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2524:6: lv_collection_4= '['
                    {
                    lv_collection_4=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleInterfaceDefinition5625); if (failed) return current;
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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2543:2: (lv_collectionsize_5= RULE_INT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2545:6: lv_collectionsize_5= RULE_INT
                            {
                            lv_collectionsize_5=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInterfaceDefinition5660); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_4_1_0(), "collectionsize"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "collectionsize", lv_collectionsize_5, "INT", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2563:3: (lv_collection_6= ']' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2565:6: lv_collection_6= ']'
                    {
                    lv_collection_6=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleInterfaceDefinition5690); if (failed) return current;
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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2584:4: (lv_contingency_7= ruleContingency )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=53 && LA58_0<=54)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2587:6: lv_contingency_7= ruleContingency
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContingency_in_ruleInterfaceDefinition5739);
                    lv_contingency_7=ruleContingency();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "contingency", lv_contingency_7, "Contingency", lastConsumedNode);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2612:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2612:59: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2613:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition5777);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition5787); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2620:1: ruleBindingDefinition returns [EObject current=null] : ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceSourceParentName_2=null;
        Token lv_interfaceSourceName_4=null;
        Token lv_interfaceSourceIndex_6=null;
        Token lv_interfaceTargetParentName_10=null;
        Token lv_interfaceTargetName_12=null;
        Token lv_interfaceTargetIndex_14=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2625:6: ( ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2626:1: ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2626:1: ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2626:2: 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            {
            match(input,33,FOLLOW_33_in_ruleBindingDefinition5821); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2630:1: ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) )
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
                    new NoViableAltException("2630:1: ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2630:2: 'this'
                    {
                    match(input,34,FOLLOW_34_in_ruleBindingDefinition5831); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2635:6: (lv_interfaceSourceParentName_2= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2635:6: (lv_interfaceSourceParentName_2= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2637:6: lv_interfaceSourceParentName_2= RULE_ID
                    {
                    lv_interfaceSourceParentName_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5859); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentNameIDTerminalRuleCall_1_1_0(), "interfaceSourceParentName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "interfaceSourceParentName", lv_interfaceSourceParentName_2, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition5877); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_2(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2659:1: (lv_interfaceSourceName_4= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2661:6: lv_interfaceSourceName_4= RULE_ID
            {
            lv_interfaceSourceName_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5899); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceNameIDTerminalRuleCall_3_0(), "interfaceSourceName"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "interfaceSourceName", lv_interfaceSourceName_4, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2679:2: ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2679:3: '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']'
                    {
                    match(input,31,FOLLOW_31_in_ruleBindingDefinition5917); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2683:1: (lv_interfaceSourceIndex_6= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2685:6: lv_interfaceSourceIndex_6= RULE_INT
                    {
                    lv_interfaceSourceIndex_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition5939); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceIndexINTTerminalRuleCall_4_1_0(), "interfaceSourceIndex"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "interfaceSourceIndex", lv_interfaceSourceIndex_6, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,32,FOLLOW_32_in_ruleBindingDefinition5956); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_ruleBindingDefinition5967); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_5(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2711:1: ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) )
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
                    new NoViableAltException("2711:1: ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2711:2: 'this'
                    {
                    match(input,34,FOLLOW_34_in_ruleBindingDefinition5977); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_6_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2716:6: (lv_interfaceTargetParentName_10= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2716:6: (lv_interfaceTargetParentName_10= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2718:6: lv_interfaceTargetParentName_10= RULE_ID
                    {
                    lv_interfaceTargetParentName_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6005); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentNameIDTerminalRuleCall_6_1_0(), "interfaceTargetParentName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "interfaceTargetParentName", lv_interfaceTargetParentName_10, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition6023); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_7(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2740:1: (lv_interfaceTargetName_12= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2742:6: lv_interfaceTargetName_12= RULE_ID
            {
            lv_interfaceTargetName_12=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6045); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetNameIDTerminalRuleCall_8_0(), "interfaceTargetName"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "interfaceTargetName", lv_interfaceTargetName_12, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2760:2: ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==31) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2760:3: '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']'
                    {
                    match(input,31,FOLLOW_31_in_ruleBindingDefinition6063); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_9_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2764:1: (lv_interfaceTargetIndex_14= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2766:6: lv_interfaceTargetIndex_14= RULE_INT
                    {
                    lv_interfaceTargetIndex_14=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition6085); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetIndexINTTerminalRuleCall_9_1_0(), "interfaceTargetIndex"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "interfaceTargetIndex", lv_interfaceTargetIndex_14, "INT", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,32,FOLLOW_32_in_ruleBindingDefinition6102); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2795:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2795:56: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2796:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6137);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition6147); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2803:1: ruleDataDefinition returns [EObject current=null] : ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2808:6: ( ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2809:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2809:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' )
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
                    new NoViableAltException("2809:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) | 'nodata' )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2809:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2809:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2809:3: 'data' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
                    {
                    match(input,37,FOLLOW_37_in_ruleDataDefinition6182); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
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
                            new NoViableAltException("2813:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:2: (lv_fileC_1= ruleFileC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:2: (lv_fileC_1= ruleFileC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2816:6: lv_fileC_1= ruleFileC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition6217);
                            lv_fileC_1=ruleFileC();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "fileC", lv_fileC_1, "FileC", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2835:6: (lv_inlineCcode_2= ruleInlineCodeC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2835:6: (lv_inlineCcode_2= ruleInlineCodeC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2838:6: lv_inlineCcode_2= ruleInlineCodeC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_0_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6261);
                            lv_inlineCcode_2=ruleInlineCodeC();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "inlineCcode", lv_inlineCcode_2, "InlineCodeC", currentNode);
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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2857:6: 'nodata'
                    {
                    match(input,38,FOLLOW_38_in_ruleDataDefinition6282); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2868:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2868:66: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2869:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6315);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition6325); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2876:1: ruleImplementationDefinition returns [EObject current=null] : ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2881:6: ( ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2882:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2882:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2882:2: 'source' ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
            {
            match(input,39,FOLLOW_39_in_ruleImplementationDefinition6359); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2886:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )
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
                    new NoViableAltException("2886:1: ( (lv_fileC_1= ruleFileC ) | (lv_inlineCcode_2= ruleInlineCodeC ) )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2886:2: (lv_fileC_1= ruleFileC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2886:2: (lv_fileC_1= ruleFileC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2889:6: lv_fileC_1= ruleFileC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition6394);
                    lv_fileC_1=ruleFileC();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "fileC", lv_fileC_1, "FileC", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2908:6: (lv_inlineCcode_2= ruleInlineCodeC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2908:6: (lv_inlineCcode_2= ruleInlineCodeC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2911:6: lv_inlineCcode_2= ruleInlineCodeC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6438);
                    lv_inlineCcode_2=ruleInlineCodeC();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "inlineCcode", lv_inlineCcode_2, "InlineCodeC", currentNode);
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
    // $ANTLR end ruleImplementationDefinition


    // $ANTLR start entryRuleTemplateSpecifier
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2936:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2936:59: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2937:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6476);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier6486); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2944:1: ruleTemplateSpecifier returns [EObject current=null] : ( (lv_name_0= RULE_ID ) 'conformsto' (lv_reference_2= ruleTypeReferenceDefinition ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_reference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2949:6: ( ( (lv_name_0= RULE_ID ) 'conformsto' (lv_reference_2= ruleTypeReferenceDefinition ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2950:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_reference_2= ruleTypeReferenceDefinition ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2950:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_reference_2= ruleTypeReferenceDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2950:2: (lv_name_0= RULE_ID ) 'conformsto' (lv_reference_2= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2950:2: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2952:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier6533); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            match(input,40,FOLLOW_40_in_ruleTemplateSpecifier6550); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2974:1: (lv_reference_2= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2977:6: lv_reference_2= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getReferenceTypeReferenceDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier6584);
            lv_reference_2=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "reference", lv_reference_2, "TypeReferenceDefinition", currentNode);
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
    // $ANTLR end ruleTemplateSpecifier


    // $ANTLR start entryRuleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3002:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3002:47: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3003:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC6621);
            iv_ruleFileC=ruleFileC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6631); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3010:1: ruleFileC returns [EObject current=null] : ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        Token lv_directory_0=null;
        AntlrDatatypeRuleToken lv_fileName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3015:6: ( ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:1: ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:1: ( (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:2: (lv_directory_0= RULE_PATH )? (lv_fileName_1= ruleFileName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3016:2: (lv_directory_0= RULE_PATH )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_PATH) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3018:6: lv_directory_0= RULE_PATH
                    {
                    lv_directory_0=(Token)input.LT(1);
                    match(input,RULE_PATH,FOLLOW_RULE_PATH_in_ruleFileC6678); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getFileCAccess().getDirectoryPathTerminalRuleCall_0_0(), "directory"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "directory", lv_directory_0, "Path", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3036:3: (lv_fileName_1= ruleFileName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3039:6: lv_fileName_1= ruleFileName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFileNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC6721);
            lv_fileName_1=ruleFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "fileName", lv_fileName_1, "FileName", currentNode);
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
    // $ANTLR end ruleFileC


    // $ANTLR start entryRuleFileName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3064:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3064:49: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3065:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6759);
            iv_ruleFileName=ruleFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6770); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3072:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3078:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3079:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3079:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3079:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6810); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3086:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==35) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3087:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleFileName6829); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFileNameAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6844); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3107:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3107:53: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3108:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6889);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC6899); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3115:1: ruleInlineCodeC returns [EObject current=null] : (lv_codeC_0= RULE_CODEC ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3120:6: ( (lv_codeC_0= RULE_CODEC ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3121:1: (lv_codeC_0= RULE_CODEC )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3121:1: (lv_codeC_0= RULE_CODEC )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3123:6: lv_codeC_0= RULE_CODEC
            {
            lv_codeC_0=(Token)input.LT(1);
            match(input,RULE_CODEC,FOLLOW_RULE_CODEC_in_ruleInlineCodeC6945); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getInlineCodeCAccess().getCodeCCodeCTerminalRuleCall_0(), "codeC"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInlineCodeCRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "codeC", lv_codeC_0, "CodeC", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3148:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3148:57: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3149:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6985);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList6995); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3156:1: ruleAnnotationsList returns [EObject current=null] : ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0 = null;

        EObject lv_annotations_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3161:6: ( ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3162:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3162:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3162:2: (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3162:2: (lv_annotations_0= ruleAnnotation )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3165:6: lv_annotations_0= ruleAnnotation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7054);
            lv_annotations_0=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationsListRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "annotations", lv_annotations_0, "Annotation", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3183:2: (lv_annotations_1= ruleAnnotation )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==41) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3186:6: lv_annotations_1= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7092);
            	    lv_annotations_1=ruleAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnnotationsListRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "annotations", lv_annotations_1, "Annotation", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3211:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3211:52: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3212:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation7130);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation7140); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3219:1: ruleAnnotation returns [EObject current=null] : ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_annotationElements_3 = null;

        EObject lv_annotationElements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3224:6: ( ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3225:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3225:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3225:2: '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            {
            match(input,41,FOLLOW_41_in_ruleAnnotation7174); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3229:1: (lv_name_1= ruleAnnotationType )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3232:6: lv_name_1= ruleAnnotationType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnotation7208);
            lv_name_1=ruleAnnotationType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "AnnotationType", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3250:2: ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==24) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3250:3: '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAnnotation7222); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3254:1: (lv_annotationElements_3= ruleAnnotationElement )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3257:6: lv_annotationElements_3= ruleAnnotationElement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7256);
                    lv_annotationElements_3=ruleAnnotationElement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		add(current, "annotationElements", lv_annotationElements_3, "AnnotationElement", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3275:2: ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==22) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3275:3: ',' (lv_annotationElements_5= ruleAnnotationElement )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleAnnotation7270); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3279:1: (lv_annotationElements_5= ruleAnnotationElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3282:6: lv_annotationElements_5= ruleAnnotationElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7304);
                    	    lv_annotationElements_5=ruleAnnotationElement();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "annotationElements", lv_annotationElements_5, "AnnotationElement", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleAnnotation7319); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3311:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3311:59: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3312:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7354);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7364); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3319:1: ruleAnnotationElement returns [EObject current=null] : ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_1=null;
        EObject lv_elementValue_0 = null;

        EObject lv_elementValue_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3324:6: ( ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3325:1: ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3325:1: ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) )
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
                    new NoViableAltException("3325:1: ( (lv_elementValue_0= ruleElementValue ) | ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) ) )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3325:2: (lv_elementValue_0= ruleElementValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3325:2: (lv_elementValue_0= ruleElementValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3328:6: lv_elementValue_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7423);
                    lv_elementValue_0=ruleElementValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "elementValue", lv_elementValue_0, "ElementValue", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3347:6: ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3347:6: ( (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3347:7: (lv_elementName_1= RULE_ID ) '=' (lv_elementValue_3= ruleElementValue )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3347:7: (lv_elementName_1= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3349:6: lv_elementName_1= RULE_ID
                    {
                    lv_elementName_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7456); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_1_0_0(), "elementName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "elementName", lv_elementName_1, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,29,FOLLOW_29_in_ruleAnnotationElement7473); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_1_1(), null); 
                          
                    }
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3371:1: (lv_elementValue_3= ruleElementValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3374:6: lv_elementValue_3= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7507);
                    lv_elementValue_3=ruleElementValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "elementValue", lv_elementValue_3, "ElementValue", currentNode);
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
    // $ANTLR end ruleAnnotationElement


    // $ANTLR start entryRuleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3399:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3399:54: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3400:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7545);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7555); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3407:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3412:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3413:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3413:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
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
                    new NoViableAltException("3413:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3414:5: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7602);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3424:5: this_Annotation_1= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7629);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3434:5: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7656);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3449:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3449:55: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3450:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7688);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7698); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3457:1: ruleConstantValue returns [EObject current=null] : (lv_value_0= ruleConstantFormat ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3462:6: ( (lv_value_0= ruleConstantFormat ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3463:1: (lv_value_0= ruleConstantFormat )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3463:1: (lv_value_0= ruleConstantFormat )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3466:6: lv_value_0= ruleConstantFormat
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7756);
            lv_value_0=ruleConstantFormat();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstantValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "value", lv_value_0, "ConstantFormat", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3491:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3491:55: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3492:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7793);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7804); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3499:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3505:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3506:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3506:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
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
                    new NoViableAltException("3506:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3506:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7844); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3514:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7870); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3529:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3529:70: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3530:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7913);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7923); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3537:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1 = null;

        EObject lv_values_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3542:6: ( ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3543:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3543:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3543:2: '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}'
            {
            match(input,17,FOLLOW_17_in_ruleElementValueArrayInitializer7957); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3547:1: (lv_values_1= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3550:6: lv_values_1= ruleElementValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7991);
            lv_values_1=ruleElementValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getElementValueArrayInitializerRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "values", lv_values_1, "ElementValue", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3568:2: ( ',' (lv_values_3= ruleElementValue ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==22) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3568:3: ',' (lv_values_3= ruleElementValue )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleElementValueArrayInitializer8005); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3572:1: (lv_values_3= ruleElementValue )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3575:6: lv_values_3= ruleElementValue
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8039);
            	    lv_values_3=ruleElementValue();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getElementValueArrayInitializerRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "values", lv_values_3, "ElementValue", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer8054); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3604:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3604:46: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3605:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue8088);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue8099); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3612:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3618:6: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3619:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3619:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )
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
                    new NoViableAltException("3619:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3619:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue8139); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3628:5: this_signedINT_1= rulesignedINT
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue8172);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3640:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue8205);
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3651:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue8231); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3666:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3666:56: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3667:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHexadecimalTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType8275);
            iv_ruleHexadecimalType=ruleHexadecimalType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType8286); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3674:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3680:6: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3681:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3681:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3682:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleHexadecimalType8324); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getHexadecimalTypeAccess().getXKeyword_0(), null); 
                  
            }
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType8339); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3702:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3702:55: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3703:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8383);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType8394); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3710:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3716:6: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3717:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3717:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
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
                    new NoViableAltException("3717:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3718:2: kw= 'Override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleAnnotationType8432); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3725:2: kw= 'Singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleAnnotationType8451); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3732:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleAnnotationType8470); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3739:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleAnnotationType8489); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3746:5: this_FQN_4= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationTypeAccess().getFQNParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleAnnotationType8517);
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3764:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3764:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3765:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType8561);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType8572); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3772:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3778:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3779:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3779:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
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
                    new NoViableAltException("3779:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3780:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleAttributeType8610); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3787:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleAttributeType8629); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3794:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleAttributeType8648); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3800:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType8669); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3815:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3815:44: (iv_ruleFQN= ruleFQN EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3816:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN8713);
            iv_ruleFQN=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN8724); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3823:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3829:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3830:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3830:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3830:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN8764); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3837:1: (kw= '.' this_ID_2= RULE_ID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==35) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3838:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FOLLOW_35_in_ruleFQN8783); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN8798); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3858:1: entryRuleFULL_IMPORT_NAME returns [String current=null] : iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF ;
    public final String entryRuleFULL_IMPORT_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_IMPORT_NAME = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3858:57: (iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3859:2: iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFULL_IMPORT_NAMERule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME8844);
            iv_ruleFULL_IMPORT_NAME=ruleFULL_IMPORT_NAME();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFULL_IMPORT_NAME.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME8855); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3866:1: ruleFULL_IMPORT_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleFULL_IMPORT_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3872:6: ( (this_FQN_0= ruleFQN kw= '.*' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3873:1: (this_FQN_0= ruleFQN kw= '.*' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3873:1: (this_FQN_0= ruleFQN kw= '.*' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3874:5: this_FQN_0= ruleFQN kw= '.*'
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFQNParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME8902);
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
            match(input,50,FOLLOW_50_in_ruleFULL_IMPORT_NAME8920); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFullStopAsteriskKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3898:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3898:50: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3899:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT8959);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT8970); if (failed) return current;

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3906:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3912:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3913:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3913:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3913:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3913:2: (kw= '+' | kw= '-' )?
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
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3914:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_rulesignedINT9009); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3921:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_rulesignedINT9028); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT9045); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3941:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3945:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3946:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3946:1: ( ( 'optional' ) | ( 'mandatory' ) )
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
                    new NoViableAltException("3946:1: ( ( 'optional' ) | ( 'mandatory' ) )", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3946:2: ( 'optional' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3946:2: ( 'optional' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3946:4: 'optional'
                    {
                    match(input,53,FOLLOW_53_in_ruleContingency9102); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3952:6: ( 'mandatory' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3952:6: ( 'mandatory' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3952:8: 'mandatory'
                    {
                    match(input,54,FOLLOW_54_in_ruleContingency9117); if (failed) return current;
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3962:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3966:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3967:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3967:1: ( ( 'provides' ) | ( 'requires' ) )
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
                    new NoViableAltException("3967:1: ( ( 'provides' ) | ( 'requires' ) )", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3967:2: ( 'provides' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3967:2: ( 'provides' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3967:4: 'provides'
                    {
                    match(input,55,FOLLOW_55_in_ruleRole9160); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3973:6: ( 'requires' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3973:6: ( 'requires' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3973:8: 'requires'
                    {
                    match(input,56,FOLLOW_56_in_ruleRole9175); if (failed) return current;
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
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1448:5: ( ruleCompositeAnonymousSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1448:5: ruleCompositeAnonymousSubComponent
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeAnonymousSubComponentParserRuleCall_0(), currentNode); 
              
        }
        pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_synpred413276);
        ruleCompositeAnonymousSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1458:5: ( ruleCompositeSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1458:5: ruleCompositeSubComponent
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeSubComponentParserRuleCall_1(), currentNode); 
              
        }
        pushFollow(FOLLOW_ruleCompositeSubComponent_in_synpred423303);
        ruleCompositeSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1468:5: ( rulePrimitiveAnonymousSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1468:5: rulePrimitiveAnonymousSubComponent
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveAnonymousSubComponentParserRuleCall_2(), currentNode); 
              
        }
        pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_synpred433330);
        rulePrimitiveAnonymousSubComponent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:5: ( rulePrimitiveSubComponent )
        // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:5: rulePrimitiveSubComponent
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveSubComponentParserRuleCall_3(), currentNode); 
              
        }
        pushFollow(FOLLOW_rulePrimitiveSubComponent_in_synpred443357);
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
            return "178:22: ( ruleFQN | ruleFULL_IMPORT_NAME )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition148 = new BitSet(new long[]{0x000002000019A000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition187 = new BitSet(new long[]{0x0000000000198000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportDefinition333 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition597 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition654 = new BitSet(new long[]{0x018002E045020002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition692 = new BitSet(new long[]{0x018002E044020002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition731 = new BitSet(new long[]{0x018002E040020002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition747 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition782 = new BitSet(new long[]{0x018000E040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition821 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveComponentDefinition836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition878 = new BitSet(new long[]{0x018000E040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition917 = new BitSet(new long[]{0x018002E040000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement1015 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1042 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1069 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1096 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveDefinitionElement1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleComponentTypeDefinition1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1219 = new BitSet(new long[]{0x0180020004020002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1257 = new BitSet(new long[]{0x0180020000020002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1298 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1337 = new BitSet(new long[]{0x0180020000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1359 = new BitSet(new long[]{0x0180020000040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1394 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1433 = new BitSet(new long[]{0x0180020000040000L});
    public static final BitSet FOLLOW_18_in_ruleComponentTypeDefinition1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1644 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDefinitionElement1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeComponentDefinition1732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1766 = new BitSet(new long[]{0x018002020D220002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1804 = new BitSet(new long[]{0x018002020D020002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1843 = new BitSet(new long[]{0x018002020C020002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1882 = new BitSet(new long[]{0x0180020208020002L});
    public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition1898 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1933 = new BitSet(new long[]{0x0180000208000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1972 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2029 = new BitSet(new long[]{0x0180000208000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2068 = new BitSet(new long[]{0x0180020208000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList2152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2187 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList2201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2235 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList2328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2363 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList2377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2411 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveReferencesList2504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2538 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferencesList2552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2586 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompositeReferencesList2669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2703 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferencesList2717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2751 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeReferencesList2834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2868 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTypeReferencesList2882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2916 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompositeDefinitionElement3097 = new BitSet(new long[]{0x0000000010110010L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3119 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3147 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3174 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleCompositeDefinitionElement3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3487 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3535 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3583 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3598 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3610 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3644 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3658 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3692 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSubComponent3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeSubComponent3786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3820 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositeSubComponent3833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeSubComponent3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeAnonymousSubComponent3940 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3974 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompositeAnonymousSubComponent3988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4010 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeAnonymousSubComponent4027 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4062 = new BitSet(new long[]{0x0180000208000000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4101 = new BitSet(new long[]{0x0180020208040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeAnonymousSubComponent4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition4218 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition4232 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4266 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition4280 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4314 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4422 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTemplateDefinition4439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSubComponent4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateSubComponent4581 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTemplateSubComponent4595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSubComponent4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveSubComponent4702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4736 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveSubComponent4749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveAnonymousSubComponent4856 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4890 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveAnonymousSubComponent4904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4926 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveAnonymousSubComponent4943 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4978 = new BitSet(new long[]{0x018000E040000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5017 = new BitSet(new long[]{0x018002E040040000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveAnonymousSubComponent5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAttributeDefinition5109 = new BitSet(new long[]{0x0003800000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5170 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeDefinition5188 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5319 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArgumentDefinition5336 = new BitSet(new long[]{0x0018040000000130L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition5521 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInterfaceDefinition5559 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition5573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition5595 = new BitSet(new long[]{0x0060000080000002L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition5625 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition5660 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition5690 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition5777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition5821 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5831 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5859 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition5877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5899 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition5917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5939 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition5956 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition5967 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5977 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6005 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition6023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6045 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition6063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition6085 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataDefinition6182 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataDefinition6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplementationDefinition6359 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier6533 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTemplateSpecifier6550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC6621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATH_in_ruleFileC6678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6810 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFileName6829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODEC_in_ruleInlineCodeC6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7054 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7092 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnnotation7174 = new BitSet(new long[]{0x0000780000000010L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation7208 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAnnotation7222 = new BitSet(new long[]{0x0000020000020130L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7256 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation7270 = new BitSet(new long[]{0x0000020000020130L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7304 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleAnnotation7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7456 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotationElement7473 = new BitSet(new long[]{0x0000020000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer7957 = new BitSet(new long[]{0x0000020000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7991 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer8005 = new BitSet(new long[]{0x0000020000020120L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8039 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue8088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue8172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType8275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleHexadecimalType8324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAnnotationType8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAnnotationType8451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAnnotationType8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAnnotationType8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAnnotationType8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType8561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttributeType8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttributeType8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAttributeType8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN8713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN8764 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFQN8783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN8798 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME8844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME8902 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFULL_IMPORT_NAME8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT8959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulesignedINT9009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_52_in_rulesignedINT9028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleContingency9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleContingency9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRole9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRole9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_synpred413276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_synpred423303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_synpred433330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_synpred443357 = new BitSet(new long[]{0x0000000000000002L});

}