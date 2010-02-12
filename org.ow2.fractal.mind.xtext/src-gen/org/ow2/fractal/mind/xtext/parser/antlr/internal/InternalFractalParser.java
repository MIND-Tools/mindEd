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

public class InternalFractalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'composite'", "'<'", "','", "'>'", "'('", "')'", "'extends'", "'contains'", "'as'", "'='", "'?'", "'attribute'", "'['", "']'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'{{'", "'}}'", "'nodata'", "'source'", "'conformsto'", "'@'", "':'", "'/'", "'\\\\'", "'!'", "'\"'", "'\\''", "'*'", "'\\\\\\\\'", "'override'", "'singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'+'", "'-'", "'optional'", "'mandatory'", "'provides'", "'requires'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalFractalParser(TokenStream input) {
            super(input);
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:73:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:73:55: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:74:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdlDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition73);
            iv_ruleAdlDefinition=ruleAdlDefinition();
            _fsp--;

             current =iv_ruleAdlDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition83); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:81:1: ruleAdlDefinition returns [EObject current=null] : ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_definitionAnnotationsList_1 = null;

        EObject lv_architecturedefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:86:6: ( ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:2: (lv_imports_0= ruleImportDefinition )* (lv_definitionAnnotationsList_1= ruleAnnotationsList )? (lv_architecturedefinition_2= ruleArchitectureDefinition )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:87:2: (lv_imports_0= ruleImportDefinition )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:90:6: lv_imports_0= ruleImportDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition142);
            	    lv_imports_0=ruleImportDefinition();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:108:3: (lv_definitionAnnotationsList_1= ruleAnnotationsList )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:111:6: lv_definitionAnnotationsList_1= ruleAnnotationsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getDefinitionAnnotationsListAnnotationsListParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition181);
                    lv_definitionAnnotationsList_1=ruleAnnotationsList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:129:3: (lv_architecturedefinition_2= ruleArchitectureDefinition )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)||(LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:132:6: lv_architecturedefinition_2= ruleArchitectureDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitecturedefinitionArchitectureDefinitionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition220);
            	    lv_architecturedefinition_2=ruleArchitectureDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdlDefinitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "architecturedefinition", lv_architecturedefinition_2, "ArchitectureDefinition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end ruleAdlDefinition


    // $ANTLR start entryRuleImportDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:157:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:157:58: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:158:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition258);
            iv_ruleImportDefinition=ruleImportDefinition();
            _fsp--;

             current =iv_ruleImportDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition268); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:165:1: ruleImportDefinition returns [EObject current=null] : ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:170:6: ( ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ';' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:1: ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ';' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:1: ( 'import' (lv_importName_1= ruleFullyQualifiedName ) ';' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:171:2: 'import' (lv_importName_1= ruleFullyQualifiedName ) ';'
            {
            match(input,11,FOLLOW_11_in_ruleImportDefinition302); 

                    createLeafNode(grammarAccess.getImportDefinitionAccess().getImportKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:175:1: (lv_importName_1= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:178:6: lv_importName_1= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleImportDefinition336);
            lv_importName_1=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "importName", lv_importName_1, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,12,FOLLOW_12_in_ruleImportDefinition349); 

                    createLeafNode(grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleImportDefinition


    // $ANTLR start entryRuleArchitectureDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:207:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:207:64: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:208:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArchitectureDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition382);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();
            _fsp--;

             current =iv_ruleArchitectureDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition392); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:215:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:220:6: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:221:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:221:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("221:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:222:5: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition439);
                    this_ComponentTypeDefinition_0=ruleComponentTypeDefinition();
                    _fsp--;

                     
                            current = this_ComponentTypeDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:232:5: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition466);
                    this_PrimitiveComponentDefinition_1=rulePrimitiveComponentDefinition();
                    _fsp--;

                     
                            current = this_PrimitiveComponentDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:242:5: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition493);
                    this_CompositeComponentDefinition_2=ruleCompositeComponentDefinition();
                    _fsp--;

                     
                            current = this_CompositeComponentDefinition_2; 
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
    // $ANTLR end ruleArchitectureDefinition


    // $ANTLR start entryRulePrimitiveComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:257:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:257:70: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:258:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition525);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();
            _fsp--;

             current =iv_rulePrimitiveComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition535); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:265:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) ) ;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:270:6: ( ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:1: ( (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:2: (lv_abstract_0= 'abstract' )? 'primitive' (lv_name_2= ruleFullyQualifiedName ) (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= rulePrimitiveReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:271:2: (lv_abstract_0= 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:273:6: lv_abstract_0= 'abstract'
                    {
                    lv_abstract_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_rulePrimitiveComponentDefinition581); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getAbstractAbstractKeyword_0_0(), "abstract"); 
                        

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
                    break;

            }

            match(input,14,FOLLOW_14_in_rulePrimitiveComponentDefinition604); 

                    createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:296:1: (lv_name_2= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:299:6: lv_name_2= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveComponentDefinition638);
            lv_name_2=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveComponentDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:317:2: (lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:320:6: lv_primitiveFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition676);
                    lv_primitiveFormalArgumentsList_3=ruleFormalArgumentsList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:338:3: (lv_referencesList_4= rulePrimitiveReferencesList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:341:6: lv_referencesList_4= rulePrimitiveReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getReferencesListPrimitiveReferencesListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition715);
                    lv_referencesList_4=rulePrimitiveReferencesList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||(LA12_0>=13 && LA12_0<=14)||(LA12_0>=17 && LA12_0<=18)||LA12_0==29||LA12_0==36||(LA12_0>=39 && LA12_0<=40)||LA12_0==42||(LA12_0>=62 && LA12_0<=63)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("359:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )* )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:359:5: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_rulePrimitiveComponentDefinition731); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==29||LA9_0==36||(LA9_0>=39 && LA9_0<=40)||LA9_0==42||(LA9_0>=62 && LA9_0<=63)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:363:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==42) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:366:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition766);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;


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
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:384:3: (lv_elements_7= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:387:6: lv_elements_7= rulePrimitiveDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition805);
                    	    lv_elements_7=rulePrimitiveDefinitionElement();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_rulePrimitiveComponentDefinition820); 

                            createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==29||LA11_0==36||(LA11_0>=39 && LA11_0<=40)||LA11_0==42||(LA11_0>=62 && LA11_0<=63)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:7: (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= rulePrimitiveDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:410:7: (lv_elements_9= ruleAnnotationsList )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==42) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:413:6: lv_elements_9= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition862);
                    	            lv_elements_9=ruleAnnotationsList();
                    	            _fsp--;


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
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:431:3: (lv_elements_10= rulePrimitiveDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:434:6: lv_elements_10= rulePrimitiveDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition901);
                    	    lv_elements_10=rulePrimitiveDefinitionElement();
                    	    _fsp--;


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
    // $ANTLR end rulePrimitiveComponentDefinition


    // $ANTLR start entryRulePrimitiveDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:459:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:459:68: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:460:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement941);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();
            _fsp--;

             current =iv_rulePrimitiveDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement951); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:467:1: rulePrimitiveDefinitionElement returns [EObject current=null] : ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:472:6: ( ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:1: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:473:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 36:
            case 39:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("473:2: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:474:5: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement999);
                    this_InterfaceDefinition_0=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:484:5: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1026);
                    this_AttributeDefinition_1=ruleAttributeDefinition();
                    _fsp--;

                     
                            current = this_AttributeDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:494:5: this_DataDefinition_2= ruleDataDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1053);
                    this_DataDefinition_2=ruleDataDefinition();
                    _fsp--;

                     
                            current = this_DataDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:504:5: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1080);
                    this_ImplementationDefinition_3=ruleImplementationDefinition();
                    _fsp--;

                     
                            current = this_ImplementationDefinition_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:512:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:512:3: ';'
                    {
                    match(input,12,FOLLOW_12_in_rulePrimitiveDefinitionElement1090); 

                            createLeafNode(grammarAccess.getPrimitiveDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                        

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
    // $ANTLR end rulePrimitiveDefinitionElement


    // $ANTLR start entryRuleComponentTypeDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:523:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:523:65: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:524:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1125);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();
            _fsp--;

             current =iv_ruleComponentTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentTypeDefinition1135); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:531:1: ruleComponentTypeDefinition returns [EObject current=null] : ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) ;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:536:6: ( ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:537:1: ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:537:1: ( 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:537:2: 'type' (lv_name_1= ruleFullyQualifiedName ) (lv_referencesList_2= ruleTypeReferencesList )? ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )
            {
            match(input,17,FOLLOW_17_in_ruleComponentTypeDefinition1169); 

                    createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:541:1: (lv_name_1= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:544:6: lv_name_1= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleComponentTypeDefinition1203);
            lv_name_1=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getComponentTypeDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:562:2: (lv_referencesList_2= ruleTypeReferencesList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:565:6: lv_referencesList_2= ruleTypeReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getReferencesListTypeReferencesListParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1241);
                    lv_referencesList_2=ruleTypeReferencesList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:3: ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||(LA20_0>=13 && LA20_0<=14)||(LA20_0>=17 && LA20_0<=18)||LA20_0==42||(LA20_0>=62 && LA20_0<=63)) ) {
                alt20=1;
            }
            else if ( (LA20_0==15) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("583:3: ( ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )* | ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:4: ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:4: ( (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==42||(LA17_0>=62 && LA17_0<=63)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:5: (lv_elements_3= ruleAnnotationsList )? (lv_elements_4= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:583:5: (lv_elements_3= ruleAnnotationsList )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==42) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:586:6: lv_elements_3= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_0_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1282);
                    	            lv_elements_3=ruleAnnotationsList();
                    	            _fsp--;


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
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:604:3: (lv_elements_4= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:607:6: lv_elements_4= ruleTypeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1321);
                    	    lv_elements_4=ruleTypeDefinitionElement();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:6: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:6: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:626:7: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleComponentTypeDefinition1343); 

                            createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==42||(LA19_0>=62 && LA19_0<=63)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleTypeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:630:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==42) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:633:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsAnnotationsListParserRuleCall_3_1_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1378);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;


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
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:651:3: (lv_elements_7= ruleTypeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:654:6: lv_elements_7= ruleTypeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getElementsTypeDefinitionElementParserRuleCall_3_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1417);
                    	    lv_elements_7=ruleTypeDefinitionElement();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleComponentTypeDefinition1432); 

                            createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2(), null); 
                        

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
    // $ANTLR end ruleComponentTypeDefinition


    // $ANTLR start entryRuleTypeReferenceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:683:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:683:65: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:684:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1467);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();
            _fsp--;

             current =iv_ruleTypeReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1477); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:691:1: ruleTypeReferenceDefinition returns [EObject current=null] : (lv_referenceName_0= ruleFullyQualifiedName ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:696:6: ( (lv_referenceName_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:697:1: (lv_referenceName_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:697:1: (lv_referenceName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:700:6: lv_referenceName_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFullyQualifiedNameParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypeReferenceDefinition1535);
            lv_referenceName_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleTypeReferenceDefinition


    // $ANTLR start entryRuleTypeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:725:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:725:63: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:726:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1571);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();
            _fsp--;

             current =iv_ruleTypeDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinitionElement1581); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:733:1: ruleTypeDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:738:6: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:739:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:739:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:740:5: this_InterfaceDefinition_0= ruleInterfaceDefinition ( ';' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1628);
            this_InterfaceDefinition_0=ruleInterfaceDefinition();
            _fsp--;

             
                    current = this_InterfaceDefinition_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:748:1: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:748:2: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleTypeDefinitionElement1637); 

                            createLeafNode(grammarAccess.getTypeDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                        

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
    // $ANTLR end ruleTypeDefinitionElement


    // $ANTLR start entryRuleCompositeComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:759:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:759:70: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:760:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1672);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();
            _fsp--;

             current =iv_ruleCompositeComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1682); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:767:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) ) ;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:772:6: ( ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:773:1: ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:773:1: ( 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:773:2: 'composite' (lv_name_1= ruleFullyQualifiedName ) (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )? (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )? (lv_referencesList_4= ruleCompositeReferencesList )? ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )
            {
            match(input,18,FOLLOW_18_in_ruleCompositeComponentDefinition1716); 

                    createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:777:1: (lv_name_1= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:780:6: lv_name_1= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleCompositeComponentDefinition1750);
            lv_name_1=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeComponentDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:798:2: (lv_templateSpecifiersList_2= ruleTemplateSpecifiersList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:801:6: lv_templateSpecifiersList_2= ruleTemplateSpecifiersList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1788);
                    lv_templateSpecifiersList_2=ruleTemplateSpecifiersList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:819:3: (lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:822:6: lv_compositeFormalArgumentsList_3= ruleFormalArgumentsList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1827);
                    lv_compositeFormalArgumentsList_3=ruleFormalArgumentsList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:840:3: (lv_referencesList_4= ruleCompositeReferencesList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:843:6: lv_referencesList_4= ruleCompositeReferencesList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getReferencesListCompositeReferencesListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1866);
                    lv_referencesList_4=ruleCompositeReferencesList();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:861:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||(LA29_0>=13 && LA29_0<=14)||(LA29_0>=17 && LA29_0<=18)||LA29_0==25||LA29_0==32||LA29_0==42||(LA29_0>=62 && LA29_0<=63)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("861:3: ( ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' ) | ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )* )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:861:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:861:4: ( '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:861:5: '{' ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleCompositeComponentDefinition1882); 

                            createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:865:1: ( (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==18||LA26_0==25||LA26_0==32||LA26_0==42||(LA26_0>=62 && LA26_0<=63)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:865:2: (lv_elements_6= ruleAnnotationsList )? (lv_elements_7= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:865:2: (lv_elements_6= ruleAnnotationsList )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==42) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:868:6: lv_elements_6= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_0_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1917);
                    	            lv_elements_6=ruleAnnotationsList();
                    	            _fsp--;


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
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:886:3: (lv_elements_7= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:889:6: lv_elements_7= ruleCompositeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_0_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1956);
                    	    lv_elements_7=ruleCompositeDefinitionElement();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleCompositeComponentDefinition1971); 

                            createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_5_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:912:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:912:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:912:7: (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement )
                    	    {
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:912:7: (lv_elements_9= ruleAnnotationsList )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==42) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:915:6: lv_elements_9= ruleAnnotationsList
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsAnnotationsListParserRuleCall_5_1_0_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2013);
                    	            lv_elements_9=ruleAnnotationsList();
                    	            _fsp--;


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
                    	            break;

                    	    }

                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:933:3: (lv_elements_10= ruleCompositeDefinitionElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:936:6: lv_elements_10= ruleCompositeDefinitionElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2052);
                    	    lv_elements_10=ruleCompositeDefinitionElement();
                    	    _fsp--;


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
    // $ANTLR end ruleCompositeComponentDefinition


    // $ANTLR start entryRuleTemplateSpecifiersList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:961:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:961:64: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:962:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSpecifiersListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2092);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;

             current =iv_ruleTemplateSpecifiersList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2102); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:969:1: ruleTemplateSpecifiersList returns [EObject current=null] : ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject lv_templateSpecifiers_1 = null;

        EObject lv_templateSpecifiers_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:974:6: ( ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:975:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:975:1: ( '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:975:2: '<' ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* ) '>'
            {
            match(input,19,FOLLOW_19_in_ruleTemplateSpecifiersList2136); 

                    createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:979:1: ( (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:979:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier ) ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:979:2: (lv_templateSpecifiers_1= ruleTemplateSpecifier )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:982:6: lv_templateSpecifiers_1= ruleTemplateSpecifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2171);
            lv_templateSpecifiers_1=ruleTemplateSpecifier();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1000:2: ( ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1000:3: ',' (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleTemplateSpecifiersList2185); 

            	            createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1004:1: (lv_templateSpecifiers_3= ruleTemplateSpecifier )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1007:6: lv_templateSpecifiers_3= ruleTemplateSpecifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2219);
            	    lv_templateSpecifiers_3=ruleTemplateSpecifier();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            match(input,21,FOLLOW_21_in_ruleTemplateSpecifiersList2235); 

                    createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getGreaterThanSignKeyword_2(), null); 
                

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
    // $ANTLR end ruleTemplateSpecifiersList


    // $ANTLR start entryRuleFormalArgumentsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1036:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1036:61: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1037:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalArgumentsListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2268);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;

             current =iv_ruleFormalArgumentsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList2278); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1044:1: ruleFormalArgumentsList returns [EObject current=null] : ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject lv_formalArguments_1 = null;

        EObject lv_formalArguments_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1049:6: ( ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1050:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1050:1: ( '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1050:2: '(' ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* ) ')'
            {
            match(input,22,FOLLOW_22_in_ruleFormalArgumentsList2312); 

                    createLeafNode(grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:1: ( (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:2: (lv_formalArguments_1= ruleFormalArgument ) ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1054:2: (lv_formalArguments_1= ruleFormalArgument )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1057:6: lv_formalArguments_1= ruleFormalArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2347);
            lv_formalArguments_1=ruleFormalArgument();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1075:2: ( ',' (lv_formalArguments_3= ruleFormalArgument ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1075:3: ',' (lv_formalArguments_3= ruleFormalArgument )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleFormalArgumentsList2361); 

            	            createLeafNode(grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1079:1: (lv_formalArguments_3= ruleFormalArgument )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1082:6: lv_formalArguments_3= ruleFormalArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2395);
            	    lv_formalArguments_3=ruleFormalArgument();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            match(input,23,FOLLOW_23_in_ruleFormalArgumentsList2411); 

                    createLeafNode(grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_2(), null); 
                

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
    // $ANTLR end ruleFormalArgumentsList


    // $ANTLR start entryRulePrimitiveReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1111:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1111:65: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1112:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2444);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;

             current =iv_rulePrimitiveReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferencesList2454); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1119:1: rulePrimitiveReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1124:6: ( ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:1: ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:1: ( 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1125:2: 'extends' (lv_references_1= rulePrimitiveReferenceDefinition ) ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )*
            {
            match(input,24,FOLLOW_24_in_rulePrimitiveReferencesList2488); 

                    createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1129:1: (lv_references_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1132:6: lv_references_1= rulePrimitiveReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2522);
            lv_references_1=rulePrimitiveReferenceDefinition();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1150:2: ( ',' (lv_references_3= rulePrimitiveReferenceDefinition ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1150:3: ',' (lv_references_3= rulePrimitiveReferenceDefinition )
            	    {
            	    match(input,20,FOLLOW_20_in_rulePrimitiveReferencesList2536); 

            	            createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1154:1: (lv_references_3= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1157:6: lv_references_3= rulePrimitiveReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2570);
            	    lv_references_3=rulePrimitiveReferenceDefinition();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end rulePrimitiveReferencesList


    // $ANTLR start entryRuleCompositeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1182:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1182:65: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1183:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2609);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;

             current =iv_ruleCompositeReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferencesList2619); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1190:1: ruleCompositeReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1195:6: ( ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1196:1: ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1196:1: ( 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1196:2: 'extends' (lv_references_1= ruleCompositeReferenceDefinition ) ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )*
            {
            match(input,24,FOLLOW_24_in_ruleCompositeReferencesList2653); 

                    createLeafNode(grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1200:1: (lv_references_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1203:6: lv_references_1= ruleCompositeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2687);
            lv_references_1=ruleCompositeReferenceDefinition();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1221:2: ( ',' (lv_references_3= ruleCompositeReferenceDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1221:3: ',' (lv_references_3= ruleCompositeReferenceDefinition )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleCompositeReferencesList2701); 

            	            createLeafNode(grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1225:1: (lv_references_3= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1228:6: lv_references_3= ruleCompositeReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2735);
            	    lv_references_3=ruleCompositeReferenceDefinition();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end ruleCompositeReferencesList


    // $ANTLR start entryRuleTypeReferencesList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1253:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1253:60: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1254:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeReferencesListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2774);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;

             current =iv_ruleTypeReferencesList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReferencesList2784); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1261:1: ruleTypeReferencesList returns [EObject current=null] : ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;

        EObject lv_references_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1266:6: ( ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1267:1: ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1267:1: ( 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1267:2: 'extends' (lv_references_1= ruleTypeReferenceDefinition ) ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )*
            {
            match(input,24,FOLLOW_24_in_ruleTypeReferencesList2818); 

                    createLeafNode(grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1271:1: (lv_references_1= ruleTypeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1274:6: lv_references_1= ruleTypeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2852);
            lv_references_1=ruleTypeReferenceDefinition();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1292:2: ( ',' (lv_references_3= ruleTypeReferenceDefinition ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1292:3: ',' (lv_references_3= ruleTypeReferenceDefinition )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleTypeReferencesList2866); 

            	            createLeafNode(grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1296:1: (lv_references_3= ruleTypeReferenceDefinition )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1299:6: lv_references_3= ruleTypeReferenceDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2900);
            	    lv_references_3=ruleTypeReferenceDefinition();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end ruleTypeReferencesList


    // $ANTLR start entryRuleFormalArgument
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1324:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1324:56: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1325:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormalArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2939);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;

             current =iv_ruleFormalArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument2949); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1332:1: ruleFormalArgument returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1337:6: ( (lv_name_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1338:1: (lv_name_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1338:1: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1340:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument2995); 

            		createLeafNode(grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

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
    // $ANTLR end ruleFormalArgument


    // $ANTLR start entryRuleCompositeDefinitionElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1365:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1365:68: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1366:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3035);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;

             current =iv_ruleCompositeDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3045); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1373:1: ruleCompositeDefinitionElement returns [EObject current=null] : ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_0 = null;

        EObject this_CompositeAnonymousSubComponent_1 = null;

        EObject this_InterfaceDefinition_2 = null;

        EObject this_BindingDefinition_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1378:6: ( ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1379:1: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1379:1: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1379:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1379:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt35=1;
                }
                break;
            case 18:
                {
                alt35=2;
                }
                break;
            case 62:
            case 63:
                {
                alt35=3;
                }
                break;
            case 32:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1379:2: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent | this_InterfaceDefinition_2= ruleInterfaceDefinition | this_BindingDefinition_3= ruleBindingDefinition )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1380:5: this_SubComponentDefinition_0= ruleSubComponentDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3093);
                    this_SubComponentDefinition_0=ruleSubComponentDefinition();
                    _fsp--;

                     
                            current = this_SubComponentDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1390:5: this_CompositeAnonymousSubComponent_1= ruleCompositeAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getCompositeAnonymousSubComponentParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleCompositeDefinitionElement3120);
                    this_CompositeAnonymousSubComponent_1=ruleCompositeAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_CompositeAnonymousSubComponent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1400:5: this_InterfaceDefinition_2= ruleInterfaceDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3147);
                    this_InterfaceDefinition_2=ruleInterfaceDefinition();
                    _fsp--;

                     
                            current = this_InterfaceDefinition_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1410:5: this_BindingDefinition_3= ruleBindingDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3174);
                    this_BindingDefinition_3=ruleBindingDefinition();
                    _fsp--;

                     
                            current = this_BindingDefinition_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1418:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1418:3: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleCompositeDefinitionElement3184); 

                            createLeafNode(grammarAccess.getCompositeDefinitionElementAccess().getSemicolonKeyword_1(), null); 
                        

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
    // $ANTLR end ruleCompositeDefinitionElement


    // $ANTLR start entryRuleSubComponentDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1429:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1429:64: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1430:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubComponentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3219);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;

             current =iv_ruleSubComponentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition3229); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1437:1: ruleSubComponentDefinition returns [EObject current=null] : ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeSubComponent_1 = null;

        EObject this_CompositeAnonymousSubComponent_2 = null;

        EObject this_PrimitiveSubComponent_3 = null;

        EObject this_PrimitiveAnonymousSubComponent_4 = null;

        EObject this_TemplateSubComponent_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1442:6: ( ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1443:1: ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1443:1: ( 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1443:2: 'contains' (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )
            {
            match(input,25,FOLLOW_25_in_ruleSubComponentDefinition3263); 

                    createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1447:1: (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1448:5: this_CompositeSubComponent_1= ruleCompositeSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeSubComponentParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3286);
                    this_CompositeSubComponent_1=ruleCompositeSubComponent();
                    _fsp--;

                     
                            current = this_CompositeSubComponent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1458:5: this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getCompositeAnonymousSubComponentParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3313);
                    this_CompositeAnonymousSubComponent_2=ruleCompositeAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_CompositeAnonymousSubComponent_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1468:5: this_PrimitiveSubComponent_3= rulePrimitiveSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveSubComponentParserRuleCall_1_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3340);
                    this_PrimitiveSubComponent_3=rulePrimitiveSubComponent();
                    _fsp--;

                     
                            current = this_PrimitiveSubComponent_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1478:5: this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getPrimitiveAnonymousSubComponentParserRuleCall_1_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3367);
                    this_PrimitiveAnonymousSubComponent_4=rulePrimitiveAnonymousSubComponent();
                    _fsp--;

                     
                            current = this_PrimitiveAnonymousSubComponent_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1488:5: this_TemplateSubComponent_5= ruleTemplateSubComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplateSubComponentParserRuleCall_1_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3394);
                    this_TemplateSubComponent_5=ruleTemplateSubComponent();
                    _fsp--;

                     
                            current = this_TemplateSubComponent_5; 
                            currentNode = currentNode.getParent();
                        

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
             currentNode = createCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3429);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;

             current =iv_ruleCompositeReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3439); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1513:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_templatesList_2 = null;

        EObject lv_templatesList_4 = null;

        EObject lv_argumentsList_7 = null;

        EObject lv_argumentsList_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1518:6: ( ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:2: (lv_referenceName_0= ruleFullyQualifiedName ) ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )? ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1519:2: (lv_referenceName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1522:6: lv_referenceName_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFullyQualifiedNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleCompositeReferenceDefinition3498);
            lv_referenceName_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1540:2: ( '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1540:3: '<' (lv_templatesList_2= ruleTemplateDefinition ) ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )* '>'
                    {
                    match(input,19,FOLLOW_19_in_ruleCompositeReferenceDefinition3512); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1544:1: (lv_templatesList_2= ruleTemplateDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1547:6: lv_templatesList_2= ruleTemplateDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3546);
                    lv_templatesList_2=ruleTemplateDefinition();
                    _fsp--;


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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1565:2: ( ',' (lv_templatesList_4= ruleTemplateDefinition ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1565:3: ',' (lv_templatesList_4= ruleTemplateDefinition )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleCompositeReferenceDefinition3560); 

                    	            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1569:1: (lv_templatesList_4= ruleTemplateDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1572:6: lv_templatesList_4= ruleTemplateDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3594);
                    	    lv_templatesList_4=ruleTemplateDefinition();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleCompositeReferenceDefinition3609); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1594:3: ( '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1594:4: '(' (lv_argumentsList_7= ruleArgumentDefinition ) ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleCompositeReferenceDefinition3621); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1598:1: (lv_argumentsList_7= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1601:6: lv_argumentsList_7= ruleArgumentDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3655);
                    lv_argumentsList_7=ruleArgumentDefinition();
                    _fsp--;


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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1619:2: ( ',' (lv_argumentsList_9= ruleArgumentDefinition ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1619:3: ',' (lv_argumentsList_9= ruleArgumentDefinition )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleCompositeReferenceDefinition3669); 

                    	            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1623:1: (lv_argumentsList_9= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1626:6: lv_argumentsList_9= ruleArgumentDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3703);
                    	    lv_argumentsList_9=ruleArgumentDefinition();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleCompositeReferenceDefinition3718); 

                            createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getRightParenthesisKeyword_2_3(), null); 
                        

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
             currentNode = createCompositeNode(grammarAccess.getCompositeSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3753);
            iv_ruleCompositeSubComponent=ruleCompositeSubComponent();
            _fsp--;

             current =iv_ruleCompositeSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSubComponent3763); 

            }

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
            match(input,18,FOLLOW_18_in_ruleCompositeSubComponent3797); 

                    createLeafNode(grammarAccess.getCompositeSubComponentAccess().getCompositeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1673:1: (lv_referenceDefinition_1= ruleCompositeReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1676:6: lv_referenceDefinition_1= ruleCompositeReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3831);
            lv_referenceDefinition_1=ruleCompositeReferenceDefinition();
            _fsp--;


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

            match(input,26,FOLLOW_26_in_ruleCompositeSubComponent3844); 

                    createLeafNode(grammarAccess.getCompositeSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1698:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1700:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeSubComponent3866); 

            		createLeafNode(grammarAccess.getCompositeSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

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
             currentNode = createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3907);
            iv_ruleCompositeAnonymousSubComponent=ruleCompositeAnonymousSubComponent();
            _fsp--;

             current =iv_ruleCompositeAnonymousSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3917); 

            }

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
            match(input,18,FOLLOW_18_in_ruleCompositeAnonymousSubComponent3951); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getCompositeKeyword_0(), null); 
                
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
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getReferenceDefinitionCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3985);
                    lv_referenceDefinition_1=ruleCompositeReferenceDefinition();
                    _fsp--;


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
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleCompositeAnonymousSubComponent3999); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1768:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1770:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4021); 

            		createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

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

            match(input,15,FOLLOW_15_in_ruleCompositeAnonymousSubComponent4038); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:1: ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18||LA44_0==25||LA44_0==32||LA44_0==42||(LA44_0>=62 && LA44_0<=63)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:2: (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1792:2: (lv_elements_5= ruleAnnotationsList )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==42) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1795:6: lv_elements_5= ruleAnnotationsList
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4073);
            	            lv_elements_5=ruleAnnotationsList();
            	            _fsp--;


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
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1813:3: (lv_elements_6= ruleCompositeDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1816:6: lv_elements_6= ruleCompositeDefinitionElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getElementsCompositeDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4112);
            	    lv_elements_6=ruleCompositeDefinitionElement();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleCompositeAnonymousSubComponent4127); 

                    createLeafNode(grammarAccess.getCompositeAnonymousSubComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
             currentNode = createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4160);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;

             current =iv_rulePrimitiveReferenceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4170); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1853:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0 = null;

        EObject lv_argumentsList_2 = null;

        EObject lv_argumentsList_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1858:6: ( ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:1: ( (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:2: (lv_referenceName_0= ruleFullyQualifiedName ) ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1859:2: (lv_referenceName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1862:6: lv_referenceName_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFullyQualifiedNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveReferenceDefinition4229);
            lv_referenceName_0=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveReferenceDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "referenceName", lv_referenceName_0, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1880:2: ( '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1880:3: '(' (lv_argumentsList_2= ruleArgumentDefinition ) ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )* ')'
                    {
                    match(input,22,FOLLOW_22_in_rulePrimitiveReferenceDefinition4243); 

                            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1884:1: (lv_argumentsList_2= ruleArgumentDefinition )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1887:6: lv_argumentsList_2= ruleArgumentDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4277);
                    lv_argumentsList_2=ruleArgumentDefinition();
                    _fsp--;


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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1905:2: ( ',' (lv_argumentsList_4= ruleArgumentDefinition ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1905:3: ',' (lv_argumentsList_4= ruleArgumentDefinition )
                    	    {
                    	    match(input,20,FOLLOW_20_in_rulePrimitiveReferenceDefinition4291); 

                    	            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1909:1: (lv_argumentsList_4= ruleArgumentDefinition )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1912:6: lv_argumentsList_4= ruleArgumentDefinition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4325);
                    	    lv_argumentsList_4=ruleArgumentDefinition();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_rulePrimitiveReferenceDefinition4340); 

                            createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                        

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
             currentNode = createCompositeNode(grammarAccess.getTemplateDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4375);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;

             current =iv_ruleTemplateDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition4385); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1949:1: ruleTemplateDefinition returns [EObject current=null] : ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_templateName_0=null;
        AntlrDatatypeRuleToken lv_templateValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1954:6: ( ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:1: ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:1: ( ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:2: ( (lv_templateName_0= RULE_ID ) '=' )? ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:2: ( (lv_templateName_0= RULE_ID ) '=' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==27) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:3: (lv_templateName_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1955:3: (lv_templateName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1957:6: lv_templateName_0= RULE_ID
                    {
                    lv_templateName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateDefinition4433); 

                    		createLeafNode(grammarAccess.getTemplateDefinitionAccess().getTemplateNameIDTerminalRuleCall_0_0_0(), "templateName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "templateName", lv_templateName_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,27,FOLLOW_27_in_ruleTemplateDefinition4450); 

                            createLeafNode(grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1979:3: ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==28) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1979:3: ( (lv_templateValue_2= ruleFullyQualifiedName ) | '?' )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1979:4: (lv_templateValue_2= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1979:4: (lv_templateValue_2= ruleFullyQualifiedName )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:1982:6: lv_templateValue_2= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getTemplateValueFullyQualifiedNameParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTemplateDefinition4487);
                    lv_templateValue_2=ruleFullyQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTemplateDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "templateValue", lv_templateValue_2, "FullyQualifiedName", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2001:6: '?'
                    {
                    match(input,28,FOLLOW_28_in_ruleTemplateDefinition4506); 

                            createLeafNode(grammarAccess.getTemplateDefinitionAccess().getQuestionMarkKeyword_1_1(), null); 
                        

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
    // $ANTLR end ruleTemplateDefinition


    // $ANTLR start entryRuleTemplateSubComponent
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2012:1: entryRuleTemplateSubComponent returns [EObject current=null] : iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF ;
    public final EObject entryRuleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSubComponent = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2012:62: (iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2013:2: iv_ruleTemplateSubComponent= ruleTemplateSubComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4540);
            iv_ruleTemplateSubComponent=ruleTemplateSubComponent();
            _fsp--;

             current =iv_ruleTemplateSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSubComponent4550); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2020:1: ruleTemplateSubComponent returns [EObject current=null] : ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleTemplateSubComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2025:6: ( ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2026:1: ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2026:1: ( ( RULE_ID ) 'as' (lv_name_2= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2026:2: ( RULE_ID ) 'as' (lv_name_2= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2026:2: ( RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2029:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSubComponentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4597); 

            		createLeafNode(grammarAccess.getTemplateSubComponentAccess().getTemplateReferenceTemplateSpecifierCrossReference_0_0(), "templateReference"); 
            	

            }

            match(input,26,FOLLOW_26_in_ruleTemplateSubComponent4609); 

                    createLeafNode(grammarAccess.getTemplateSubComponentAccess().getAsKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2046:1: (lv_name_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2048:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSubComponent4631); 

            		createLeafNode(grammarAccess.getTemplateSubComponentAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

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
             currentNode = createCompositeNode(grammarAccess.getPrimitiveSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4672);
            iv_rulePrimitiveSubComponent=rulePrimitiveSubComponent();
            _fsp--;

             current =iv_rulePrimitiveSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSubComponent4682); 

            }

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
            match(input,14,FOLLOW_14_in_rulePrimitiveSubComponent4716); 

                    createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getPrimitiveKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2091:1: (lv_referenceDefinition_1= rulePrimitiveReferenceDefinition )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2094:6: lv_referenceDefinition_1= rulePrimitiveReferenceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4750);
            lv_referenceDefinition_1=rulePrimitiveReferenceDefinition();
            _fsp--;


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

            match(input,26,FOLLOW_26_in_rulePrimitiveSubComponent4763); 

                    createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2116:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2118:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4785); 

            		createLeafNode(grammarAccess.getPrimitiveSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

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
             currentNode = createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4826);
            iv_rulePrimitiveAnonymousSubComponent=rulePrimitiveAnonymousSubComponent();
            _fsp--;

             current =iv_rulePrimitiveAnonymousSubComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4836); 

            }

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
            match(input,14,FOLLOW_14_in_rulePrimitiveAnonymousSubComponent4870); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getPrimitiveKeyword_0(), null); 
                
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
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getReferenceDefinitionPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4904);
                    lv_referenceDefinition_1=rulePrimitiveReferenceDefinition();
                    _fsp--;


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
                    break;

            }

            match(input,26,FOLLOW_26_in_rulePrimitiveAnonymousSubComponent4918); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2186:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2188:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4940); 

            		createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

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

            match(input,15,FOLLOW_15_in_rulePrimitiveAnonymousSubComponent4957); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2210:1: ( (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==29||LA51_0==36||(LA51_0>=39 && LA51_0<=40)||LA51_0==42||(LA51_0>=62 && LA51_0<=63)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2210:2: (lv_elements_5= ruleAnnotationsList )? (lv_elements_6= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2210:2: (lv_elements_5= ruleAnnotationsList )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==42) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2213:6: lv_elements_5= ruleAnnotationsList
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsAnnotationsListParserRuleCall_5_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4992);
            	            lv_elements_5=ruleAnnotationsList();
            	            _fsp--;


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
            	            break;

            	    }

            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2231:3: (lv_elements_6= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2234:6: lv_elements_6= rulePrimitiveDefinitionElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getElementsPrimitiveDefinitionElementParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5031);
            	    lv_elements_6=rulePrimitiveDefinitionElement();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_rulePrimitiveAnonymousSubComponent5046); 

                    createLeafNode(grammarAccess.getPrimitiveAnonymousSubComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
             currentNode = createCompositeNode(grammarAccess.getAttributeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5079);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;

             current =iv_ruleAttributeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5089); 

            }

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
            match(input,29,FOLLOW_29_in_ruleAttributeDefinition5123); 

                    createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2281:1: (lv_type_1= ruleAttributeType )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=55 && LA52_0<=57)) ) {
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
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5157);
                    lv_type_1=ruleAttributeType();
                    _fsp--;


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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2302:3: (lv_attributeName_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2304:6: lv_attributeName_2= RULE_ID
            {
            lv_attributeName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5184); 

            		createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_2_0(), "attributeName"); 
            	

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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2322:2: ( '=' (lv_value_4= ruleValue ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2322:3: '=' (lv_value_4= ruleValue )
                    {
                    match(input,27,FOLLOW_27_in_ruleAttributeDefinition5202); 

                            createLeafNode(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2326:1: (lv_value_4= ruleValue )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2329:6: lv_value_4= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5236);
                    lv_value_4=ruleValue();
                    _fsp--;


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
             currentNode = createCompositeNode(grammarAccess.getArgumentDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5275);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;

             current =iv_ruleArgumentDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5285); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2362:1: ruleArgumentDefinition returns [EObject current=null] : ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0=null;
        AntlrDatatypeRuleToken lv_argumentValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2367:6: ( ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:1: ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:1: ( ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:2: ( (lv_argumentName_0= RULE_ID ) '=' )? (lv_argumentValue_2= ruleValue )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:2: ( (lv_argumentName_0= RULE_ID ) '=' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==27) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:3: (lv_argumentName_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2368:3: (lv_argumentName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2370:6: lv_argumentName_0= RULE_ID
                    {
                    lv_argumentName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5333); 

                    		createLeafNode(grammarAccess.getArgumentDefinitionAccess().getArgumentNameIDTerminalRuleCall_0_0_0(), "argumentName"); 
                    	

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

                    match(input,27,FOLLOW_27_in_ruleArgumentDefinition5350); 

                            createLeafNode(grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2392:3: (lv_argumentValue_2= ruleValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2395:6: lv_argumentValue_2= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5386);
            lv_argumentValue_2=ruleValue();
            _fsp--;


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
    // $ANTLR end ruleArgumentDefinition


    // $ANTLR start entryRuleInterfaceDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2420:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2420:61: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2421:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5423);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition5433); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2428:1: ruleInterfaceDefinition returns [EObject current=null] : ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? ) ;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2433:6: ( ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2434:1: ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2434:1: ( (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2434:2: (lv_role_0= ruleRole ) (lv_signature_1= ruleFullyQualifiedName )? 'as' (lv_name_3= RULE_ID ) ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )? (lv_contingency_7= ruleContingency )?
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2434:2: (lv_role_0= ruleRole )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2437:6: lv_role_0= ruleRole
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRole_in_ruleInterfaceDefinition5492);
            lv_role_0=ruleRole();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2455:2: (lv_signature_1= ruleFullyQualifiedName )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2458:6: lv_signature_1= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition5530);
                    lv_signature_1=ruleFullyQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "signature", lv_signature_1, "FullyQualifiedName", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleInterfaceDefinition5544); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2480:1: (lv_name_3= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2482:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDefinition5566); 

            		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2500:2: ( (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==30) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2500:3: (lv_collection_4= '[' ) (lv_collectionsize_5= RULE_INT )? (lv_collection_6= ']' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2500:3: (lv_collection_4= '[' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2502:6: lv_collection_4= '['
                    {
                    lv_collection_4=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleInterfaceDefinition5596); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_4_0_0(), "collection"); 
                        

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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2521:2: (lv_collectionsize_5= RULE_INT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2523:6: lv_collectionsize_5= RULE_INT
                            {
                            lv_collectionsize_5=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInterfaceDefinition5631); 

                            		createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_4_1_0(), "collectionsize"); 
                            	

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
                            break;

                    }

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2541:3: (lv_collection_6= ']' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2543:6: lv_collection_6= ']'
                    {
                    lv_collection_6=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleInterfaceDefinition5661); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionRightSquareBracketKeyword_4_2_0(), "collection"); 
                        

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
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2562:4: (lv_contingency_7= ruleContingency )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=60 && LA58_0<=61)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2565:6: lv_contingency_7= ruleContingency
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleContingency_in_ruleInterfaceDefinition5710);
                    lv_contingency_7=ruleContingency();
                    _fsp--;


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
    // $ANTLR end ruleInterfaceDefinition


    // $ANTLR start entryRuleBindingDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2590:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2590:59: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2591:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition5748);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;

             current =iv_ruleBindingDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition5758); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2598:1: ruleBindingDefinition returns [EObject current=null] : ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) ;
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
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2603:6: ( ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2604:1: ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2604:1: ( 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2604:2: 'binds' ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) ) '.' (lv_interfaceSourceName_4= RULE_ID ) ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )? 'to' ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) ) '.' (lv_interfaceTargetName_12= RULE_ID ) ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            {
            match(input,32,FOLLOW_32_in_ruleBindingDefinition5792); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2608:1: ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==33) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2608:1: ( 'this' | (lv_interfaceSourceParentName_2= RULE_ID ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2608:2: 'this'
                    {
                    match(input,33,FOLLOW_33_in_ruleBindingDefinition5802); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2613:6: (lv_interfaceSourceParentName_2= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2613:6: (lv_interfaceSourceParentName_2= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2615:6: lv_interfaceSourceParentName_2= RULE_ID
                    {
                    lv_interfaceSourceParentName_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5830); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentNameIDTerminalRuleCall_1_1_0(), "interfaceSourceParentName"); 
                    	

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
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleBindingDefinition5848); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2637:1: (lv_interfaceSourceName_4= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2639:6: lv_interfaceSourceName_4= RULE_ID
            {
            lv_interfaceSourceName_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5870); 

            		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceNameIDTerminalRuleCall_3_0(), "interfaceSourceName"); 
            	

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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2657:2: ( '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==30) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2657:3: '[' (lv_interfaceSourceIndex_6= RULE_INT ) ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleBindingDefinition5888); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_4_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2661:1: (lv_interfaceSourceIndex_6= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2663:6: lv_interfaceSourceIndex_6= RULE_INT
                    {
                    lv_interfaceSourceIndex_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition5910); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceIndexINTTerminalRuleCall_4_1_0(), "interfaceSourceIndex"); 
                    	

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

                    match(input,31,FOLLOW_31_in_ruleBindingDefinition5927); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleBindingDefinition5938); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_5(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:1: ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==33) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2689:1: ( 'this' | (lv_interfaceTargetParentName_10= RULE_ID ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2689:2: 'this'
                    {
                    match(input,33,FOLLOW_33_in_ruleBindingDefinition5948); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_6_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2694:6: (lv_interfaceTargetParentName_10= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2694:6: (lv_interfaceTargetParentName_10= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2696:6: lv_interfaceTargetParentName_10= RULE_ID
                    {
                    lv_interfaceTargetParentName_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition5976); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentNameIDTerminalRuleCall_6_1_0(), "interfaceTargetParentName"); 
                    	

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
                    break;

            }

            match(input,34,FOLLOW_34_in_ruleBindingDefinition5994); 

                    createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_7(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2718:1: (lv_interfaceTargetName_12= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2720:6: lv_interfaceTargetName_12= RULE_ID
            {
            lv_interfaceTargetName_12=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition6016); 

            		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetNameIDTerminalRuleCall_8_0(), "interfaceTargetName"); 
            	

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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2738:2: ( '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==30) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2738:3: '[' (lv_interfaceTargetIndex_14= RULE_INT ) ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleBindingDefinition6034); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_9_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2742:1: (lv_interfaceTargetIndex_14= RULE_INT )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2744:6: lv_interfaceTargetIndex_14= RULE_INT
                    {
                    lv_interfaceTargetIndex_14=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition6056); 

                    		createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetIndexINTTerminalRuleCall_9_1_0(), "interfaceTargetIndex"); 
                    	

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

                    match(input,31,FOLLOW_31_in_ruleBindingDefinition6073); 

                            createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_9_2(), null); 
                        

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
    // $ANTLR end ruleBindingDefinition


    // $ANTLR start entryRuleDataDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2773:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2773:56: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2774:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6108);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;

             current =iv_ruleDataDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition6118); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2781:1: ruleDataDefinition returns [EObject current=null] : ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2786:6: ( ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2787:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2787:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==36) ) {
                alt64=1;
            }
            else if ( (LA64_0==39) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2787:1: ( ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) | 'nodata' )", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2787:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2787:2: ( 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2787:3: 'data' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
                    {
                    match(input,36,FOLLOW_36_in_ruleDataDefinition6153); 

                            createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2791:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==37) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2791:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2791:2: (lv_fileC_1= ruleFileC )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2791:2: (lv_fileC_1= ruleFileC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2794:6: lv_fileC_1= ruleFileC
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition6188);
                            lv_fileC_1=ruleFileC();
                            _fsp--;


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
                            break;
                        case 2 :
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                            {
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2813:7: '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}'
                            {
                            match(input,37,FOLLOW_37_in_ruleDataDefinition6208); 

                                    createLeafNode(grammarAccess.getDataDefinitionAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0_1_1_0(), null); 
                                
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2817:1: (lv_inlineCcode_3= ruleInlineCodeC )
                            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2820:6: lv_inlineCcode_3= ruleInlineCodeC
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_0_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6242);
                            lv_inlineCcode_3=ruleInlineCodeC();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inlineCcode", lv_inlineCcode_3, "InlineCodeC", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            match(input,38,FOLLOW_38_in_ruleDataDefinition6255); 

                                    createLeafNode(grammarAccess.getDataDefinitionAccess().getRightCurlyBracketRightCurlyBracketKeyword_0_1_1_2(), null); 
                                

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2843:6: 'nodata'
                    {
                    match(input,39,FOLLOW_39_in_ruleDataDefinition6273); 

                            createLeafNode(grammarAccess.getDataDefinitionAccess().getNodataKeyword_1(), null); 
                        

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
    // $ANTLR end ruleDataDefinition


    // $ANTLR start entryRuleImplementationDefinition
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2854:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2854:66: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2855:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6306);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;

             current =iv_ruleImplementationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition6316); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2862:1: ruleImplementationDefinition returns [EObject current=null] : ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_fileC_1 = null;

        EObject lv_inlineCcode_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2867:6: ( ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2868:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2868:1: ( 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2868:2: 'source' ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
            {
            match(input,40,FOLLOW_40_in_ruleImplementationDefinition6350); 

                    createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2872:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==37) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2872:1: ( (lv_fileC_1= ruleFileC ) | ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' ) )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2872:2: (lv_fileC_1= ruleFileC )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2872:2: (lv_fileC_1= ruleFileC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2875:6: lv_fileC_1= ruleFileC
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition6385);
                    lv_fileC_1=ruleFileC();
                    _fsp--;


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
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2894:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2894:6: ( '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2894:7: '{{' (lv_inlineCcode_3= ruleInlineCodeC ) '}}'
                    {
                    match(input,37,FOLLOW_37_in_ruleImplementationDefinition6405); 

                            createLeafNode(grammarAccess.getImplementationDefinitionAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2898:1: (lv_inlineCcode_3= ruleInlineCodeC )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2901:6: lv_inlineCcode_3= ruleInlineCodeC
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6439);
                    lv_inlineCcode_3=ruleInlineCodeC();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImplementationDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "inlineCcode", lv_inlineCcode_3, "InlineCodeC", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,38,FOLLOW_38_in_ruleImplementationDefinition6452); 

                            createLeafNode(grammarAccess.getImplementationDefinitionAccess().getRightCurlyBracketRightCurlyBracketKeyword_1_1_2(), null); 
                        

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
    // $ANTLR end ruleImplementationDefinition


    // $ANTLR start entryRuleTemplateSpecifier
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2930:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2930:59: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2931:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6487);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;

             current =iv_ruleTemplateSpecifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier6497); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2938:1: ruleTemplateSpecifier returns [EObject current=null] : ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        AntlrDatatypeRuleToken lv_componentTypeName_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2943:6: ( ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2944:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2944:1: ( (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2944:2: (lv_name_0= RULE_ID ) 'conformsto' (lv_componentTypeName_2= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2944:2: (lv_name_0= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2946:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier6544); 

            		createLeafNode(grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

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

            match(input,41,FOLLOW_41_in_ruleTemplateSpecifier6561); 

                    createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2968:1: (lv_componentTypeName_2= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2971:6: lv_componentTypeName_2= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getComponentTypeNameFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTemplateSpecifier6595);
            lv_componentTypeName_2=ruleFullyQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTemplateSpecifierRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "componentTypeName", lv_componentTypeName_2, "FullyQualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleTemplateSpecifier


    // $ANTLR start entryRuleFullyQualifiedName
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2996:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2996:59: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:2997:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName6633);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;

             current =iv_ruleFullyQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName6644); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3004:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3010:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3011:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3011:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3011:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName6684); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3018:1: (kw= '.' this_ID_2= RULE_ID )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==34) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3019:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,34,FOLLOW_34_in_ruleFullyQualifiedName6703); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName6718); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
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


    // $ANTLR start entryRuleFileC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3039:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3039:47: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3040:2: iv_ruleFileC= ruleFileC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC6763);
            iv_ruleFileC=ruleFileC();
            _fsp--;

             current =iv_ruleFileC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6773); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3047:1: ruleFileC returns [EObject current=null] : ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0 = null;

        AntlrDatatypeRuleToken lv_fileName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3052:6: ( ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3053:1: ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3053:1: ( (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3053:2: (lv_directory_0= rulePath )? (lv_fileName_1= ruleFilename )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3053:2: (lv_directory_0= rulePath )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( ((LA67_1>=43 && LA67_1<=45)||LA67_1==50) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3056:6: lv_directory_0= rulePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_ruleFileC6832);
                    lv_directory_0=rulePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "directory", lv_directory_0, "Path", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3074:3: (lv_fileName_1= ruleFilename )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3077:6: lv_fileName_1= ruleFilename
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFilenameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFilename_in_ruleFileC6871);
            lv_fileName_1=ruleFilename();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFileCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fileName", lv_fileName_1, "Filename", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleFileC


    // $ANTLR start entryRuleFilename
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3102:1: entryRuleFilename returns [String current=null] : iv_ruleFilename= ruleFilename EOF ;
    public final String entryRuleFilename() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilename = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3102:49: (iv_ruleFilename= ruleFilename EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3103:2: iv_ruleFilename= ruleFilename EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFilenameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFilename_in_entryRuleFilename6909);
            iv_ruleFilename=ruleFilename();
            _fsp--;

             current =iv_ruleFilename.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilename6920); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFilename


    // $ANTLR start ruleFilename
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3110:1: ruleFilename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFilename() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3116:6: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3117:1: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3117:1: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3117:6: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilename6960); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFilenameAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_ruleFilename6978); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getFilenameAccess().getFullStopKeyword_1(), null); 
                
            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilename6993); 

            		current.merge(this_ID_2);
                
             
                createLeafNode(grammarAccess.getFilenameAccess().getIDTerminalRuleCall_2(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFilename


    // $ANTLR start entryRuleInlineCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3145:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3145:53: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3146:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC7036);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;

             current =iv_ruleInlineCodeC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC7046); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3153:1: ruleInlineCodeC returns [EObject current=null] : (lv_codeC_0= ruleCodeC ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_codeC_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3158:6: ( (lv_codeC_0= ruleCodeC ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3159:1: (lv_codeC_0= ruleCodeC )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3159:1: (lv_codeC_0= ruleCodeC )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3162:6: lv_codeC_0= ruleCodeC
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInlineCodeCAccess().getCodeCCodeCParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeC_in_ruleInlineCodeC7104);
            lv_codeC_0=ruleCodeC();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInlineCodeCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "codeC", lv_codeC_0, "CodeC", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleInlineCodeC


    // $ANTLR start entryRuleAnnotationsList
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3187:57: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3188:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7140);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;

             current =iv_ruleAnnotationsList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList7150); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3195:1: ruleAnnotationsList returns [EObject current=null] : ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0 = null;

        EObject lv_annotations_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3200:6: ( ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3201:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3201:1: ( (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3201:2: (lv_annotations_0= ruleAnnotation ) (lv_annotations_1= ruleAnnotation )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3201:2: (lv_annotations_0= ruleAnnotation )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3204:6: lv_annotations_0= ruleAnnotation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7209);
            lv_annotations_0=ruleAnnotation();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3222:2: (lv_annotations_1= ruleAnnotation )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==42) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3225:6: lv_annotations_1= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7247);
            	    lv_annotations_1=ruleAnnotation();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop68;
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
    // $ANTLR end ruleAnnotationsList


    // $ANTLR start entryRuleAnnotation
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3250:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3250:52: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3251:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation7285);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation7295); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3258:1: ruleAnnotation returns [EObject current=null] : ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1 = null;

        EObject lv_annotationElements_3 = null;

        EObject lv_annotationElements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3263:6: ( ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3264:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3264:1: ( '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )? )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3264:2: '@' (lv_name_1= ruleAnnotationType ) ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            {
            match(input,42,FOLLOW_42_in_ruleAnnotation7329); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3268:1: (lv_name_1= ruleAnnotationType )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3271:6: lv_name_1= ruleAnnotationType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnotation7363);
            lv_name_1=ruleAnnotationType();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3289:2: ( '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==22) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3289:3: '(' (lv_annotationElements_3= ruleAnnotationElement ) ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )* ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleAnnotation7377); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3293:1: (lv_annotationElements_3= ruleAnnotationElement )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3296:6: lv_annotationElements_3= ruleAnnotationElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7411);
                    lv_annotationElements_3=ruleAnnotationElement();
                    _fsp--;


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

                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3314:2: ( ',' (lv_annotationElements_5= ruleAnnotationElement ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==20) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3314:3: ',' (lv_annotationElements_5= ruleAnnotationElement )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleAnnotation7425); 

                    	            createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3318:1: (lv_annotationElements_5= ruleAnnotationElement )
                    	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3321:6: lv_annotationElements_5= ruleAnnotationElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7459);
                    	    lv_annotationElements_5=ruleAnnotationElement();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleAnnotation7474); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3(), null); 
                        

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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleAnnotationElement
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3350:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3350:59: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3351:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7509);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;

             current =iv_ruleAnnotationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7519); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3358:1: ruleAnnotationElement returns [EObject current=null] : ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_0=null;
        EObject lv_elementValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3363:6: ( ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:1: ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:1: ( ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:2: ( (lv_elementName_0= RULE_ID ) '=' )? (lv_elementValue_2= ruleElementValue )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:2: ( (lv_elementName_0= RULE_ID ) '=' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:3: (lv_elementName_0= RULE_ID ) '='
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3364:3: (lv_elementName_0= RULE_ID )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3366:6: lv_elementName_0= RULE_ID
                    {
                    lv_elementName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7567); 

                    		createLeafNode(grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_0_0_0(), "elementName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elementName", lv_elementName_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,27,FOLLOW_27_in_ruleAnnotationElement7584); 

                            createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3388:3: (lv_elementValue_2= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3391:6: lv_elementValue_2= ruleElementValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7620);
            lv_elementValue_2=ruleElementValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "elementValue", lv_elementValue_2, "ElementValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleAnnotationElement


    // $ANTLR start entryRuleElementValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3416:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3416:54: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3417:2: iv_ruleElementValue= ruleElementValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7657);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;

             current =iv_ruleElementValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7667); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3424:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3429:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3430:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3430:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt72=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt72=1;
                }
                break;
            case 42:
                {
                alt72=2;
                }
                break;
            case 15:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3430:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3431:5: this_ConstantValue_0= ruleConstantValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7714);
                    this_ConstantValue_0=ruleConstantValue();
                    _fsp--;

                     
                            current = this_ConstantValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3441:5: this_Annotation_1= ruleAnnotation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7741);
                    this_Annotation_1=ruleAnnotation();
                    _fsp--;

                     
                            current = this_Annotation_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3451:5: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7768);
                    this_ElementValueArrayInitializer_2=ruleElementValueArrayInitializer();
                    _fsp--;

                     
                            current = this_ElementValueArrayInitializer_2; 
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
    // $ANTLR end ruleElementValue


    // $ANTLR start entryRuleConstantValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3466:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3466:55: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3467:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7800);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7810); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3474:1: ruleConstantValue returns [EObject current=null] : (lv_value_0= ruleConstantFormat ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3479:6: ( (lv_value_0= ruleConstantFormat ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3480:1: (lv_value_0= ruleConstantFormat )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3480:1: (lv_value_0= ruleConstantFormat )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3483:6: lv_value_0= ruleConstantFormat
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7868);
            lv_value_0=ruleConstantFormat();
            _fsp--;


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
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleConstantFormat
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3508:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3508:55: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3509:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7905);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;

             current =iv_ruleConstantFormat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7916); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3516:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3522:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3523:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3523:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_STRING) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3523:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3523:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7956); 

                    		current.merge(this_INT_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3531:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7982); 

                    		current.merge(this_STRING_1);
                        
                     
                        createLeafNode(grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3546:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3546:70: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3547:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer8025);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;

             current =iv_ruleElementValueArrayInitializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer8035); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3554:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1 = null;

        EObject lv_values_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3559:6: ( ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3560:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3560:1: ( '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}' )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3560:2: '{' (lv_values_1= ruleElementValue ) ( ',' (lv_values_3= ruleElementValue ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleElementValueArrayInitializer8069); 

                    createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3564:1: (lv_values_1= ruleElementValue )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3567:6: lv_values_1= ruleElementValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8103);
            lv_values_1=ruleElementValue();
            _fsp--;


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

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3585:2: ( ',' (lv_values_3= ruleElementValue ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==20) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3585:3: ',' (lv_values_3= ruleElementValue )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleElementValueArrayInitializer8117); 

            	            createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3589:1: (lv_values_3= ruleElementValue )
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3592:6: lv_values_3= ruleElementValue
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8151);
            	    lv_values_3=ruleElementValue();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleElementValueArrayInitializer8166); 

                    createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleElementValueArrayInitializer


    // $ANTLR start entryRuleCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3621:1: entryRuleCodeC returns [String current=null] : iv_ruleCodeC= ruleCodeC EOF ;
    public final String entryRuleCodeC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeC = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3621:46: (iv_ruleCodeC= ruleCodeC EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3622:2: iv_ruleCodeC= ruleCodeC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeCRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeC_in_entryRuleCodeC8200);
            iv_ruleCodeC=ruleCodeC();
            _fsp--;

             current =iv_ruleCodeC.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeC8211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCodeC


    // $ANTLR start ruleCodeC
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3629:1: ruleCodeC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\"' | kw= '\\'' | kw= '*' )* ;
    public final AntlrDatatypeRuleToken ruleCodeC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3635:6: ( (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\"' | kw= '\\'' | kw= '*' )* )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3636:1: (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\"' | kw= '\\'' | kw= '*' )*
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3636:1: (this_ID_0= RULE_ID | kw= ':' | kw= ',' | kw= '?' | kw= ';' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '!' | kw= '@' | kw= '\"' | kw= '\\'' | kw= '*' )*
            loop75:
            do {
                int alt75=14;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt75=1;
                    }
                    break;
                case 43:
                    {
                    alt75=2;
                    }
                    break;
                case 20:
                    {
                    alt75=3;
                    }
                    break;
                case 28:
                    {
                    alt75=4;
                    }
                    break;
                case 12:
                    {
                    alt75=5;
                    }
                    break;
                case 34:
                    {
                    alt75=6;
                    }
                    break;
                case 44:
                    {
                    alt75=7;
                    }
                    break;
                case 45:
                    {
                    alt75=8;
                    }
                    break;
                case 46:
                    {
                    alt75=9;
                    }
                    break;
                case 42:
                    {
                    alt75=10;
                    }
                    break;
                case 47:
                    {
                    alt75=11;
                    }
                    break;
                case 48:
                    {
                    alt75=12;
                    }
                    break;
                case 49:
                    {
                    alt75=13;
                    }
                    break;

                }

                switch (alt75) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3636:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeC8251); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeCAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3645:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,43,FOLLOW_43_in_ruleCodeC8275); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getColonKeyword_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3652:2: kw= ','
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,20,FOLLOW_20_in_ruleCodeC8294); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getCommaKeyword_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3659:2: kw= '?'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,28,FOLLOW_28_in_ruleCodeC8313); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getQuestionMarkKeyword_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3666:2: kw= ';'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleCodeC8332); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getSemicolonKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3673:2: kw= '.'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,34,FOLLOW_34_in_ruleCodeC8351); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getFullStopKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3680:2: kw= '/'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,44,FOLLOW_44_in_ruleCodeC8370); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getSolidusKeyword_6(), null); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3687:2: kw= '\\\\'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,45,FOLLOW_45_in_ruleCodeC8389); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getReverseSolidusKeyword_7(), null); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3694:2: kw= '!'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,46,FOLLOW_46_in_ruleCodeC8408); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getExclamationMarkKeyword_8(), null); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3701:2: kw= '@'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,42,FOLLOW_42_in_ruleCodeC8427); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getCommercialAtKeyword_9(), null); 
            	        

            	    }
            	    break;
            	case 11 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3708:2: kw= '\"'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,47,FOLLOW_47_in_ruleCodeC8446); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getQuotationMarkKeyword_10(), null); 
            	        

            	    }
            	    break;
            	case 12 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3715:2: kw= '\\''
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,48,FOLLOW_48_in_ruleCodeC8465); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getApostropheKeyword_11(), null); 
            	        

            	    }
            	    break;
            	case 13 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3722:2: kw= '*'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,49,FOLLOW_49_in_ruleCodeC8484); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeCAccess().getAsteriskKeyword_12(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCodeC


    // $ANTLR start entryRulePath
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3735:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3735:45: (iv_rulePath= rulePath EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3736:2: iv_rulePath= rulePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathRule(), currentNode); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath8524);
            iv_rulePath=rulePath();
            _fsp--;

             current =iv_rulePath.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath8535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePath


    // $ANTLR start rulePath
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3743:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_5=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3749:6: ( (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3750:1: (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3750:1: (this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3750:6: this_ID_0= RULE_ID (kw= ':' )? ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )* (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath8575); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3757:1: (kw= ':' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==43) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3758:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_rulePath8594); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getColonKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3763:3: ( (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID )*
            loop78:
            do {
                int alt78=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA78_1 = input.LA(2);

                    if ( (LA78_1==RULE_ID) ) {
                        int LA78_4 = input.LA(3);

                        if ( ((LA78_4>=44 && LA78_4<=45)||LA78_4==50) ) {
                            alt78=1;
                        }


                    }


                    }
                    break;
                case 50:
                    {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==RULE_ID) ) {
                        int LA78_4 = input.LA(3);

                        if ( ((LA78_4>=44 && LA78_4<=45)||LA78_4==50) ) {
                            alt78=1;
                        }


                    }


                    }
                    break;
                case 44:
                    {
                    int LA78_3 = input.LA(2);

                    if ( (LA78_3==RULE_ID) ) {
                        int LA78_4 = input.LA(3);

                        if ( ((LA78_4>=44 && LA78_4<=45)||LA78_4==50) ) {
                            alt78=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt78) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3763:4: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' ) this_ID_5= RULE_ID
            	    {
            	    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3763:4: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )
            	    int alt77=3;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt77=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt77=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt77=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("3763:4: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )", 77, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt77) {
            	        case 1 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3764:2: kw= '\\\\'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,45,FOLLOW_45_in_rulePath8611); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getPathAccess().getReverseSolidusKeyword_2_0_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3771:2: kw= '\\\\\\\\'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,50,FOLLOW_50_in_rulePath8630); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getPathAccess().getReverseSolidusReverseSolidusKeyword_2_0_1(), null); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3778:2: kw= '/'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,44,FOLLOW_44_in_rulePath8649); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_2_0_2(), null); 
            	                

            	            }
            	            break;

            	    }

            	    this_ID_5=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath8665); 

            	    		current.merge(this_ID_5);
            	        
            	     
            	        createLeafNode(grammarAccess.getPathAccess().getIDTerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3790:3: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt79=1;
                }
                break;
            case 50:
                {
                alt79=2;
                }
                break;
            case 44:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3790:3: (kw= '\\\\' | kw= '\\\\\\\\' | kw= '/' )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3791:2: kw= '\\\\'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_rulePath8686); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getReverseSolidusKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3798:2: kw= '\\\\\\\\'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_rulePath8705); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getReverseSolidusReverseSolidusKeyword_3_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3805:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_rulePath8724); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_3_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePath


    // $ANTLR start entryRuleValue
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3818:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3818:46: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3819:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue8764);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue8775); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3826:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_SignedInt_1= ruleSignedInt | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_SignedInt_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3832:6: ( (this_ID_0= RULE_ID | this_SignedInt_1= ruleSignedInt | this_STRING_2= RULE_STRING ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3833:1: (this_ID_0= RULE_ID | this_SignedInt_1= ruleSignedInt | this_STRING_2= RULE_STRING )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3833:1: (this_ID_0= RULE_ID | this_SignedInt_1= ruleSignedInt | this_STRING_2= RULE_STRING )
            int alt80=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt80=1;
                }
                break;
            case RULE_INT:
            case 58:
            case 59:
                {
                alt80=2;
                }
                break;
            case RULE_STRING:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3833:1: (this_ID_0= RULE_ID | this_SignedInt_1= ruleSignedInt | this_STRING_2= RULE_STRING )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3833:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue8815); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3842:5: this_SignedInt_1= ruleSignedInt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getSignedIntParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleValue8848);
                    this_SignedInt_1=ruleSignedInt();
                    _fsp--;


                    		current.merge(this_SignedInt_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3853:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue8874); 

                    		current.merge(this_STRING_2);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
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


    // $ANTLR start entryRuleAnnotationType
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3868:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3868:55: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3869:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8918);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;

             current =iv_ruleAnnotationType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType8929); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3876:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_4=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3882:6: ( (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3883:1: (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3883:1: (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID )
            int alt81=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt81=1;
                }
                break;
            case 52:
                {
                alt81=2;
                }
                break;
            case 53:
                {
                alt81=3;
                }
                break;
            case 54:
                {
                alt81=4;
                }
                break;
            case RULE_ID:
                {
                alt81=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3883:1: (kw= 'override' | kw= 'singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_ID_4= RULE_ID )", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3884:2: kw= 'override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleAnnotationType8967); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3891:2: kw= 'singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleAnnotationType8986); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3898:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleAnnotationType9005); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3905:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleAnnotationType9024); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3911:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationType9045); 

                    		current.merge(this_ID_4);
                        
                     
                        createLeafNode(grammarAccess.getAnnotationTypeAccess().getIDTerminalRuleCall_4(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3926:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3926:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3927:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType9089);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;

             current =iv_ruleAttributeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType9100); 

            }

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
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3934:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3940:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3941:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3941:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt82=1;
                }
                break;
            case 56:
                {
                alt82=2;
                }
                break;
            case 57:
                {
                alt82=3;
                }
                break;
            case RULE_ID:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3941:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3942:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleAttributeType9138); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3949:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleAttributeType9157); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3956:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_ruleAttributeType9176); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3962:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType9197); 

                    		current.merge(this_ID_3);
                        
                     
                        createLeafNode(grammarAccess.getAttributeTypeAccess().getIDTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
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


    // $ANTLR start entryRuleSignedInt
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3977:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3977:50: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3978:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignedIntRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt9241);
            iv_ruleSignedInt=ruleSignedInt();
            _fsp--;

             current =iv_ruleSignedInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt9252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignedInt


    // $ANTLR start ruleSignedInt
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3985:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3991:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3992:2: (kw= '+' | kw= '-' )?
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==58) ) {
                alt83=1;
            }
            else if ( (LA83_0==59) ) {
                alt83=2;
            }
            switch (alt83) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:3993:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleSignedInt9291); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4000:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_ruleSignedInt9310); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt9327); 

            		current.merge(this_INT_2);
                
             
                createLeafNode(grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSignedInt


    // $ANTLR start ruleContingency
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4020:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4024:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4025:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4025:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==60) ) {
                alt84=1;
            }
            else if ( (LA84_0==61) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4025:1: ( ( 'optional' ) | ( 'mandatory' ) )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4025:2: ( 'optional' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4025:2: ( 'optional' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4025:4: 'optional'
                    {
                    match(input,60,FOLLOW_60_in_ruleContingency9384); 

                            current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4031:6: ( 'mandatory' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4031:6: ( 'mandatory' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4031:8: 'mandatory'
                    {
                    match(input,61,FOLLOW_61_in_ruleContingency9399); 

                            current = grammarAccess.getContingencyAccess().getMandatoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContingencyAccess().getMandatoryEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleContingency


    // $ANTLR start ruleRole
    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4041:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4045:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4046:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4046:1: ( ( 'provides' ) | ( 'requires' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==62) ) {
                alt85=1;
            }
            else if ( (LA85_0==63) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4046:1: ( ( 'provides' ) | ( 'requires' ) )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4046:2: ( 'provides' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4046:2: ( 'provides' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4046:4: 'provides'
                    {
                    match(input,62,FOLLOW_62_in_ruleRole9442); 

                            current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4052:6: ( 'requires' )
                    {
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4052:6: ( 'requires' )
                    // ../org.ow2.fractal.mind.xtext/src-gen/org/ow2/fractal/mind/xtext/parser/antlr/internal/InternalFractal.g:4052:8: 'requires'
                    {
                    match(input,63,FOLLOW_63_in_ruleRole9457); 

                            current = grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRoleAccess().getRequiresEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleRole


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA28_eotS =
        "\16\uffff";
    static final String DFA28_eofS =
        "\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\1\uffff";
    static final String DFA28_minS =
        "\1\15\1\uffff\1\4\1\uffff\1\15\3\4\1\15\2\24\1\4\1\15\1\24";
    static final String DFA28_maxS =
        "\1\77\1\uffff\1\32\1\uffff\1\77\1\4\1\34\1\73\1\77\1\51\1\33\1\73"+
        "\1\77\1\33";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA28_specialS =
        "\16\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\1\2\uffff\1\1\1\2\6\uffff\1\3\6\uffff\1\3\11\uffff\1\3\23"+
            "\uffff\2\3",
            "",
            "\1\4\25\uffff\1\3",
            "",
            "\3\1\1\uffff\2\1\1\6\2\uffff\1\7\1\uffff\2\1\1\3\5\uffff\1\1"+
            "\1\uffff\1\5\7\uffff\1\1\23\uffff\2\1",
            "\1\10",
            "\1\11\27\uffff\1\3",
            "\1\12\2\3\63\uffff\2\3",
            "\3\1\1\uffff\2\1\1\6\2\uffff\1\7\1\uffff\2\1\1\3\5\uffff\1\1"+
            "\1\uffff\1\5\7\uffff\1\1\23\uffff\2\1",
            "\2\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1\1",
            "\1\13\2\uffff\1\14\3\uffff\1\3",
            "\1\15\2\3\63\uffff\2\3",
            "\3\1\1\uffff\2\1\5\uffff\2\1\1\3\5\uffff\1\1\11\uffff\1\1\23"+
            "\uffff\2\1",
            "\1\13\2\uffff\1\14\3\uffff\1\3"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 912:6: ( (lv_elements_9= ruleAnnotationsList )? (lv_elements_10= ruleCompositeDefinitionElement ) )*";
        }
    }
    static final String DFA37_eotS =
        "\103\uffff";
    static final String DFA37_eofS =
        "\27\uffff\1\46\6\uffff\1\52\44\uffff";
    static final String DFA37_minS =
        "\3\4\1\uffff\1\23\1\uffff\1\26\1\uffff\7\4\1\23\3\24\2\5\2\24\1"+
        "\14\1\26\1\24\2\5\2\24\1\14\3\4\1\26\2\4\1\32\1\uffff\2\4\1\32\1"+
        "\uffff\6\24\2\5\4\24\2\5\2\24\4\4\4\24";
    static final String DFA37_maxS =
        "\1\22\2\32\1\uffff\1\42\1\uffff\1\42\1\uffff\1\4\1\34\1\73\2\4\1"+
        "\73\1\4\2\42\1\25\1\33\2\5\2\27\1\77\1\42\1\33\2\5\2\27\1\77\1\34"+
        "\1\4\1\34\1\32\2\73\1\32\1\uffff\2\73\1\32\1\uffff\3\42\1\25\1\27"+
        "\1\33\2\5\3\27\1\33\2\5\2\27\1\34\1\4\2\73\2\42\2\27";
    static final String DFA37_acceptS =
        "\3\uffff\1\5\1\uffff\1\2\1\uffff\1\4\36\uffff\1\1\3\uffff\1\3\30"+
        "\uffff";
    static final String DFA37_specialS =
        "\103\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\11\uffff\1\2\3\uffff\1\1",
            "\1\4\25\uffff\1\5",
            "\1\6\25\uffff\1\7",
            "",
            "\1\11\2\uffff\1\12\3\uffff\1\13\7\uffff\1\10",
            "",
            "\1\15\3\uffff\1\16\7\uffff\1\14",
            "",
            "\1\17",
            "\1\20\27\uffff\1\21",
            "\1\22\1\25\1\26\63\uffff\1\23\1\24",
            "\1\27",
            "\1\30",
            "\1\31\1\34\1\35\63\uffff\1\32\1\33",
            "\1\36",
            "\1\11\2\uffff\1\12\3\uffff\1\13\7\uffff\1\10",
            "\1\41\1\42\5\uffff\1\37\6\uffff\1\40",
            "\1\41\1\42",
            "\1\44\2\uffff\1\45\3\uffff\1\43",
            "\1\25",
            "\1\25",
            "\1\44\2\uffff\1\45",
            "\1\44\2\uffff\1\45",
            "\3\46\1\5\3\46\6\uffff\1\46\6\uffff\1\46\11\uffff\1\46\23\uffff"+
            "\2\46",
            "\1\15\3\uffff\1\16\7\uffff\1\14",
            "\1\50\2\uffff\1\51\3\uffff\1\47",
            "\1\34",
            "\1\34",
            "\1\50\2\uffff\1\51",
            "\1\50\2\uffff\1\51",
            "\3\52\1\7\3\52\6\uffff\1\52\6\uffff\1\52\11\uffff\1\52\23\uffff"+
            "\2\52",
            "\1\53\27\uffff\1\21",
            "\1\54",
            "\1\55\27\uffff\1\56",
            "\1\12\3\uffff\1\13",
            "\1\57\1\25\1\26\63\uffff\1\23\1\24",
            "\1\60\1\63\1\64\63\uffff\1\61\1\62",
            "\1\13",
            "",
            "\1\65\1\34\1\35\63\uffff\1\32\1\33",
            "\1\66\1\71\1\72\63\uffff\1\67\1\70",
            "\1\16",
            "",
            "\1\41\1\42\14\uffff\1\40",
            "\1\41\1\42\14\uffff\1\40",
            "\1\41\1\42\5\uffff\1\73\6\uffff\1\74",
            "\1\41\1\42",
            "\1\44\2\uffff\1\45",
            "\1\44\2\uffff\1\45\3\uffff\1\75",
            "\1\63",
            "\1\63",
            "\1\44\2\uffff\1\45",
            "\1\44\2\uffff\1\45",
            "\1\50\2\uffff\1\51",
            "\1\50\2\uffff\1\51\3\uffff\1\76",
            "\1\71",
            "\1\71",
            "\1\50\2\uffff\1\51",
            "\1\50\2\uffff\1\51",
            "\1\77\27\uffff\1\56",
            "\1\100",
            "\1\101\1\63\1\64\63\uffff\1\61\1\62",
            "\1\102\1\71\1\72\63\uffff\1\67\1\70",
            "\1\41\1\42\14\uffff\1\74",
            "\1\41\1\42\14\uffff\1\74",
            "\1\44\2\uffff\1\45",
            "\1\50\2\uffff\1\51"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1447:1: (this_CompositeSubComponent_1= ruleCompositeSubComponent | this_CompositeAnonymousSubComponent_2= ruleCompositeAnonymousSubComponent | this_PrimitiveSubComponent_3= rulePrimitiveSubComponent | this_PrimitiveAnonymousSubComponent_4= rulePrimitiveAnonymousSubComponent | this_TemplateSubComponent_5= ruleTemplateSubComponent )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition142 = new BitSet(new long[]{0x0000040000066802L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition181 = new BitSet(new long[]{0x0000000000066002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition220 = new BitSet(new long[]{0x0000000000066002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportDefinition302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleImportDefinition336 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImportDefinition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveComponentDefinition581 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveComponentDefinition604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveComponentDefinition638 = new BitSet(new long[]{0xC000059021408002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition676 = new BitSet(new long[]{0xC000059021008002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition715 = new BitSet(new long[]{0xC000059020008002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition731 = new BitSet(new long[]{0xC000059020010000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition766 = new BitSet(new long[]{0xC000019020000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition805 = new BitSet(new long[]{0xC000059020010000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition862 = new BitSet(new long[]{0xC000019020000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveComponentDefinition901 = new BitSet(new long[]{0xC000059020000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement999 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement1026 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement1053 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement1080 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_rulePrimitiveDefinitionElement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleComponentTypeDefinition1203 = new BitSet(new long[]{0xC000040001008002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1241 = new BitSet(new long[]{0xC000040000008002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1282 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1321 = new BitSet(new long[]{0xC000040000000002L});
    public static final BitSet FOLLOW_15_in_ruleComponentTypeDefinition1343 = new BitSet(new long[]{0xC000040000010000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1378 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleComponentTypeDefinition1417 = new BitSet(new long[]{0xC000040000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentTypeDefinition1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypeReferenceDefinition1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1628 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleTypeDefinitionElement1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleCompositeComponentDefinition1750 = new BitSet(new long[]{0xC0000401034C8002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1788 = new BitSet(new long[]{0xC000040103448002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1827 = new BitSet(new long[]{0xC000040103048002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1866 = new BitSet(new long[]{0xC000040102048002L});
    public static final BitSet FOLLOW_15_in_ruleCompositeComponentDefinition1882 = new BitSet(new long[]{0xC000040102050000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1917 = new BitSet(new long[]{0xC000000102040000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition1956 = new BitSet(new long[]{0xC000040102050000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeComponentDefinition1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition2013 = new BitSet(new long[]{0xC000000102040000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeComponentDefinition2052 = new BitSet(new long[]{0xC000040102040002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList2092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTemplateSpecifiersList2136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2171 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleTemplateSpecifiersList2185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList2219 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList2312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2347 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleFormalArgumentsList2361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList2395 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleFormalArgumentsList2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveReferencesList2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2522 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveReferencesList2536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2570 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompositeReferencesList2653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2687 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeReferencesList2701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2735 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypeReferencesList2818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2852 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTypeReferencesList2866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2900 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement3035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement3093 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleCompositeDefinitionElement3120 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement3147 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement3174 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleCompositeDefinitionElement3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSubComponentDefinition3263 = new BitSet(new long[]{0x0000000000044010L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_ruleSubComponentDefinition3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_ruleSubComponentDefinition3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_ruleSubComponentDefinition3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_ruleSubComponentDefinition3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_ruleSubComponentDefinition3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleCompositeReferenceDefinition3498 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleCompositeReferenceDefinition3512 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3546 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeReferenceDefinition3560 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3594 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3609 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3621 = new BitSet(new long[]{0x0C00000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3655 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeReferenceDefinition3669 = new BitSet(new long[]{0x0C00000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3703 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSubComponent_in_entryRuleCompositeSubComponent3753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSubComponent3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCompositeSubComponent3797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeSubComponent3831 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCompositeSubComponent3844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeSubComponent3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeAnonymousSubComponent_in_entryRuleCompositeAnonymousSubComponent3907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeAnonymousSubComponent3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCompositeAnonymousSubComponent3951 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeAnonymousSubComponent3985 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCompositeAnonymousSubComponent3999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeAnonymousSubComponent4021 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompositeAnonymousSubComponent4038 = new BitSet(new long[]{0xC000040102050000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeAnonymousSubComponent4073 = new BitSet(new long[]{0xC000000102040000L});
    public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeAnonymousSubComponent4112 = new BitSet(new long[]{0xC000040102050000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeAnonymousSubComponent4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition4160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rulePrimitiveReferenceDefinition4229 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition4243 = new BitSet(new long[]{0x0C00000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4277 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveReferenceDefinition4291 = new BitSet(new long[]{0x0C00000000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition4325 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveReferenceDefinition4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4433 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTemplateDefinition4450 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTemplateDefinition4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTemplateDefinition4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSubComponent_in_entryRuleTemplateSubComponent4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSubComponent4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4597 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemplateSubComponent4609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSubComponent4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSubComponent_in_entryRulePrimitiveSubComponent4672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSubComponent4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveSubComponent4716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveSubComponent4750 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveSubComponent4763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveSubComponent4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveAnonymousSubComponent_in_entryRulePrimitiveAnonymousSubComponent4826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveAnonymousSubComponent4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveAnonymousSubComponent4870 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveAnonymousSubComponent4904 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveAnonymousSubComponent4918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveAnonymousSubComponent4940 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveAnonymousSubComponent4957 = new BitSet(new long[]{0xC000059020010000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveAnonymousSubComponent4992 = new BitSet(new long[]{0xC000019020000000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveAnonymousSubComponent5031 = new BitSet(new long[]{0xC000059020010000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveAnonymousSubComponent5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeDefinition5123 = new BitSet(new long[]{0x0380000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5184 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAttributeDefinition5202 = new BitSet(new long[]{0x0C00000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5333 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArgumentDefinition5350 = new BitSet(new long[]{0x0C00000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition5423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition5492 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition5530 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleInterfaceDefinition5544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition5566 = new BitSet(new long[]{0x3000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInterfaceDefinition5596 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition5631 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition5661 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition5748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBindingDefinition5792 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition5802 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5830 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5870 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_30_in_ruleBindingDefinition5888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5910 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition5927 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition5938 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition5948 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5976 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition5994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition6016 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleBindingDefinition6034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition6056 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBindingDefinition6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition6108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataDefinition6153 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataDefinition6208 = new BitSet(new long[]{0x0003FC4410101010L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6242 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDataDefinition6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataDefinition6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplementationDefinition6350 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleImplementationDefinition6405 = new BitSet(new long[]{0x0003FC4410101010L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition6439 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleImplementationDefinition6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier6487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier6544 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTemplateSpecifier6561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTemplateSpecifier6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName6633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName6684 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleFullyQualifiedName6703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName6718 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC6763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC6832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFilename_in_ruleFileC6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilename_in_entryRuleFilename6909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilename6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilename6960 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFilename6978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilename6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC7036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeC_in_ruleInlineCodeC7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7209 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7247 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAnnotation7329 = new BitSet(new long[]{0x0078000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation7363 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation7377 = new BitSet(new long[]{0x0000040000008070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7411 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation7425 = new BitSet(new long[]{0x0000040000008070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7459 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleAnnotation7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7567 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAnnotationElement7584 = new BitSet(new long[]{0x0000040000008060L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer8025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleElementValueArrayInitializer8069 = new BitSet(new long[]{0x0000040000008060L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8103 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleElementValueArrayInitializer8117 = new BitSet(new long[]{0x0000040000008060L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8151 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleElementValueArrayInitializer8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeC_in_entryRuleCodeC8200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeC8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeC8251 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_43_in_ruleCodeC8275 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_20_in_ruleCodeC8294 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_28_in_ruleCodeC8313 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_12_in_ruleCodeC8332 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_34_in_ruleCodeC8351 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_44_in_ruleCodeC8370 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_45_in_ruleCodeC8389 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_46_in_ruleCodeC8408 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_42_in_ruleCodeC8427 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_47_in_ruleCodeC8446 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_48_in_ruleCodeC8465 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_49_in_ruleCodeC8484 = new BitSet(new long[]{0x0003FC0410101012L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath8524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath8575 = new BitSet(new long[]{0x0004380000000000L});
    public static final BitSet FOLLOW_43_in_rulePath8594 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_45_in_rulePath8611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_50_in_rulePath8630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_44_in_rulePath8649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath8665 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_45_in_rulePath8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePath8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePath8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue8764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue8775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleValue8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType8918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAnnotationType8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAnnotationType8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAnnotationType9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAnnotationType9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationType9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType9089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAttributeType9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAttributeType9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAttributeType9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt9241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSignedInt9291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_59_in_ruleSignedInt9310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleContingency9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleContingency9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRole9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRole9457 = new BitSet(new long[]{0x0000000000000002L});

}