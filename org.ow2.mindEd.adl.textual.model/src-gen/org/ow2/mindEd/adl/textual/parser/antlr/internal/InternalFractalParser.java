package org.ow2.mindEd.adl.textual.parser.antlr.internal; 

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
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalFractalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_CODEC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'composite'", "'<'", "','", "'>'", "'('", "')'", "'extends'", "'contains'", "'as'", "'='", "'attribute'", "'['", "']'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'nodata'", "'source'", "'conformsto'", "'@'", "'null'", "'0x'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'.*'", "'+'", "'-'", "'optional'", "'mandatory'", "'provides'", "'requires'"
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
            ruleMemo = new HashMap[205+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g"; }



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
        	return classLoader.getResourceAsStream("org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlDefinition";	
       	}
       	
       	@Override
       	protected FractalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleAdlDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:84:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:85:2: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdlDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81);
            iv_ruleAdlDefinition=ruleAdlDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdlDefinition91); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:93:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_architecturedefinition_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:98:6: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:99:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:99:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:99:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:99:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:100:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:100:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:101:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:123:3: ( (lv_architecturedefinition_1_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:124:1: (lv_architecturedefinition_1_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:124:1: (lv_architecturedefinition_1_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:125:3: lv_architecturedefinition_1_0= ruleArchitectureDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitecturedefinitionArchitectureDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159);
            lv_architecturedefinition_1_0=ruleArchitectureDefinition();
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
              	        		lv_architecturedefinition_1_0, 
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:155:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:156:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition195);
            iv_ruleImportDefinition=ruleImportDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportDefinition205); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:164:1: ruleImportDefinition returns [EObject current=null] : ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importName_1_1 = null;

        AntlrDatatypeRuleToken lv_importName_1_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:169:6: ( ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:170:1: ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:170:1: ( 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:170:3: 'import' ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) ) ';'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleImportDefinition240); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportDefinitionAccess().getImportKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:174:1: ( ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:175:1: ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:175:1: ( (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:176:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:176:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:177:3: lv_importName_1_1= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFQNParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleImportDefinition263);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:198:8: lv_importName_1_2= ruleFULL_IMPORT_NAME
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImportDefinitionAccess().getImportNameFULL_IMPORT_NAMEParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition282);
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleImportDefinition295); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:234:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:235:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:236:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArchitectureDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition331);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchitectureDefinition341); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:243:1: ruleArchitectureDefinition returns [EObject current=null] : (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentTypeDefinition_0 = null;

        EObject this_PrimitiveComponentDefinition_1 = null;

        EObject this_CompositeComponentDefinition_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:248:6: ( (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:249:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:249:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (synpred4()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("249:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt3=1;
                }
                break;
            case 15:
            case 16:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("249:1: (this_ComponentTypeDefinition_0= ruleComponentTypeDefinition | this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition | this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:250:2: this_ComponentTypeDefinition_0= ruleComponentTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getComponentTypeDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition391);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:263:2: this_PrimitiveComponentDefinition_1= rulePrimitiveComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveComponentDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition421);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:276:2: this_CompositeComponentDefinition_2= ruleCompositeComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeComponentDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition451);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:295:1: entryRulePrimitiveComponentDefinition returns [EObject current=null] : iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF ;
    public final EObject entryRulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:296:2: (iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:297:2: iv_rulePrimitiveComponentDefinition= rulePrimitiveComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition486);
            iv_rulePrimitiveComponentDefinition=rulePrimitiveComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition496); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:304:1: rulePrimitiveComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? ) ;
    public final EObject rulePrimitiveComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_primitiveFormalArgumentsList_4_0 = null;

        EObject lv_referencesList_5_0 = null;

        EObject lv_body_7_0 = null;

        EObject lv_body_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:309:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? 'primitive' ( (lv_name_3_0= ruleFQN ) ) ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )? ( ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:311:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:311:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:312:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition542);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:334:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:335:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:335:1: (lv_abstract_1_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:336:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_rulePrimitiveComponentDefinition561); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getAbstractAbstractKeyword_1_0(), "abstract"); 
                          
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

            match(input,16,FollowSets000.FOLLOW_16_in_rulePrimitiveComponentDefinition585); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:359:1: ( (lv_name_3_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:360:1: (lv_name_3_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:360:1: (lv_name_3_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:361:3: lv_name_3_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getNameFQNParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition606);
            lv_name_3_0=ruleFQN();
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
              	        		lv_name_3_0, 
              	        		"FQN", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:383:2: ( (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:384:1: (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:384:1: (lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:385:3: lv_primitiveFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getPrimitiveFormalArgumentsListFormalArgumentsListParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition627);
                    lv_primitiveFormalArgumentsList_4_0=ruleFormalArgumentsList();
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
                      	        		lv_primitiveFormalArgumentsList_4_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:407:3: ( (lv_referencesList_5_0= rulePrimitiveReferencesList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:408:1: (lv_referencesList_5_0= rulePrimitiveReferencesList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:408:1: (lv_referencesList_5_0= rulePrimitiveReferencesList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:409:3: lv_referencesList_5_0= rulePrimitiveReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getReferencesListPrimitiveReferencesListParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition649);
                    lv_referencesList_5_0=rulePrimitiveReferencesList();
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
                      	        		lv_referencesList_5_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:431:3: ( ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' ) | ( (lv_body_9_0= rulePrimitiveBody ) ) )?
            int alt9=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt9=1;
                    }
                    break;
                case 30:
                case 37:
                case 38:
                case 39:
                case 41:
                case 56:
                case 57:
                    {
                    alt9=2;
                    }
                    break;
                case EOF:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred11()) ) {
                        alt9=2;
                    }
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:431:4: ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:431:4: ( '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:431:6: '{' ( (lv_body_7_0= rulePrimitiveBody ) )? '}'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rulePrimitiveComponentDefinition662); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getLeftCurlyBracketKeyword_6_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:435:1: ( (lv_body_7_0= rulePrimitiveBody ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==30||(LA8_0>=37 && LA8_0<=39)||LA8_0==41||(LA8_0>=56 && LA8_0<=57)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==18) ) {
                        int LA8_2 = input.LA(2);

                        if ( (synpred9()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:436:1: (lv_body_7_0= rulePrimitiveBody )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:436:1: (lv_body_7_0= rulePrimitiveBody )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:437:3: lv_body_7_0= rulePrimitiveBody
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition683);
                            lv_body_7_0=rulePrimitiveBody();
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
                              	       			"body",
                              	        		lv_body_7_0, 
                              	        		"PrimitiveBody", 
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

                    match(input,18,FollowSets000.FOLLOW_18_in_rulePrimitiveComponentDefinition694); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getRightCurlyBracketKeyword_6_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:464:6: ( (lv_body_9_0= rulePrimitiveBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:464:6: ( (lv_body_9_0= rulePrimitiveBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:465:1: (lv_body_9_0= rulePrimitiveBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:465:1: (lv_body_9_0= rulePrimitiveBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:466:3: lv_body_9_0= rulePrimitiveBody
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition722);
                    lv_body_9_0=rulePrimitiveBody();
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
                      	       			"body",
                      	        		lv_body_9_0, 
                      	        		"PrimitiveBody", 
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
    // $ANTLR end rulePrimitiveComponentDefinition


    // $ANTLR start entryRulePrimitiveDefinitionElement
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:496:1: entryRulePrimitiveDefinitionElement returns [EObject current=null] : iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF ;
    public final EObject entryRulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinitionElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:497:2: (iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:498:2: iv_rulePrimitiveDefinitionElement= rulePrimitiveDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveDefinitionElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement760);
            iv_rulePrimitiveDefinitionElement=rulePrimitiveDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement770); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:505:1: rulePrimitiveDefinitionElement returns [EObject current=null] : (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) ;
    public final EObject rulePrimitiveDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;

        EObject this_AttributeDefinition_1 = null;

        EObject this_DataDefinition_2 = null;

        EObject this_ImplementationDefinition_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:510:6: ( (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:511:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:511:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred12()) ) {
                    alt10=1;
                }
                else if ( (synpred13()) ) {
                    alt10=2;
                }
                else if ( (synpred14()) ) {
                    alt10=3;
                }
                else if ( (true) ) {
                    alt10=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("511:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 56:
            case 57:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 37:
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("511:1: (this_InterfaceDefinition_0= ruleInterfaceDefinition | this_AttributeDefinition_1= ruleAttributeDefinition | this_DataDefinition_2= ruleDataDefinition | this_ImplementationDefinition_3= ruleImplementationDefinition )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:512:2: this_InterfaceDefinition_0= ruleInterfaceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement820);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:525:2: this_AttributeDefinition_1= ruleAttributeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getAttributeDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement850);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:2: this_DataDefinition_2= ruleDataDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getDataDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement880);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:551:2: this_ImplementationDefinition_3= ruleImplementationDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitiveDefinitionElementAccess().getImplementationDefinitionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement910);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:570:1: entryRuleComponentTypeDefinition returns [EObject current=null] : iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF ;
    public final EObject entryRuleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:571:2: (iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:572:2: iv_ruleComponentTypeDefinition= ruleComponentTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getComponentTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition945);
            iv_ruleComponentTypeDefinition=ruleComponentTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComponentTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentTypeDefinition955); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:579:1: ruleComponentTypeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? ) ;
    public final EObject ruleComponentTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_referencesList_3_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_body_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:584:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'type' ( (lv_name_2_0= ruleFQN ) ) ( (lv_referencesList_3_0= ruleTypeReferencesList ) )? ( ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:585:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:586:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:586:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:587:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1001);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentTypeDefinition1012); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getTypeKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:613:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:614:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:614:1: (lv_name_2_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:615:3: lv_name_2_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1033);
            lv_name_2_0=ruleFQN();
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:637:2: ( (lv_referencesList_3_0= ruleTypeReferencesList ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:638:1: (lv_referencesList_3_0= ruleTypeReferencesList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:638:1: (lv_referencesList_3_0= ruleTypeReferencesList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:639:3: lv_referencesList_3_0= ruleTypeReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getReferencesListTypeReferencesListParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1054);
                    lv_referencesList_3_0=ruleTypeReferencesList();
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
                      	        		lv_referencesList_3_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:3: ( ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' ) | ( (lv_body_7_0= ruleTypeBody ) ) )?
            int alt14=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt14=1;
                    }
                    break;
                case 41:
                case 56:
                case 57:
                    {
                    alt14=2;
                    }
                    break;
                case EOF:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred19()) ) {
                        alt14=2;
                    }
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:4: ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:4: ( '{' ( (lv_body_5_0= ruleTypeBody ) )? '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:661:6: '{' ( (lv_body_5_0= ruleTypeBody ) )? '}'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentTypeDefinition1067); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getLeftCurlyBracketKeyword_4_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:665:1: ( (lv_body_5_0= ruleTypeBody ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==41||(LA13_0>=56 && LA13_0<=57)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==18) ) {
                        int LA13_2 = input.LA(2);

                        if ( (synpred17()) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:666:1: (lv_body_5_0= ruleTypeBody )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:666:1: (lv_body_5_0= ruleTypeBody )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:667:3: lv_body_5_0= ruleTypeBody
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1088);
                            lv_body_5_0=ruleTypeBody();
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
                              	       			"body",
                              	        		lv_body_5_0, 
                              	        		"TypeBody", 
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

                    match(input,18,FollowSets000.FOLLOW_18_in_ruleComponentTypeDefinition1099); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getComponentTypeDefinitionAccess().getRightCurlyBracketKeyword_4_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:6: ( (lv_body_7_0= ruleTypeBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:6: ( (lv_body_7_0= ruleTypeBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:695:1: (lv_body_7_0= ruleTypeBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:695:1: (lv_body_7_0= ruleTypeBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:696:3: lv_body_7_0= ruleTypeBody
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1127);
                    lv_body_7_0=ruleTypeBody();
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
                      	       			"body",
                      	        		lv_body_7_0, 
                      	        		"TypeBody", 
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
    // $ANTLR end ruleComponentTypeDefinition


    // $ANTLR start entryRuleTypeReferenceDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:726:1: entryRuleTypeReferenceDefinition returns [EObject current=null] : iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF ;
    public final EObject entryRuleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferenceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:727:2: (iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:728:2: iv_ruleTypeReferenceDefinition= ruleTypeReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1165);
            iv_ruleTypeReferenceDefinition=ruleTypeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1175); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:735:1: ruleTypeReferenceDefinition returns [EObject current=null] : ( (lv_referenceName_0_0= ruleFQN ) ) ;
    public final EObject ruleTypeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:740:6: ( ( (lv_referenceName_0_0= ruleFQN ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:741:1: ( (lv_referenceName_0_0= ruleFQN ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:741:1: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:742:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:742:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:743:3: lv_referenceName_0_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1220);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:773:1: entryRuleTypeDefinitionElement returns [EObject current=null] : iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF ;
    public final EObject entryRuleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinitionElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:774:2: (iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:775:2: iv_ruleTypeDefinitionElement= ruleTypeDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1255);
            iv_ruleTypeDefinitionElement=ruleTypeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinitionElement1265); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:782:1: ruleTypeDefinitionElement returns [EObject current=null] : this_InterfaceDefinition_0= ruleInterfaceDefinition ;
    public final EObject ruleTypeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDefinition_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:6: (this_InterfaceDefinition_0= ruleInterfaceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:789:2: this_InterfaceDefinition_0= ruleInterfaceDefinition
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1314);
            this_InterfaceDefinition_0=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_InterfaceDefinition_0; 
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
    // $ANTLR end ruleTypeDefinitionElement


    // $ANTLR start entryRuleCompositeComponentDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:808:1: entryRuleCompositeComponentDefinition returns [EObject current=null] : iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF ;
    public final EObject entryRuleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:809:2: (iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:810:2: iv_ruleCompositeComponentDefinition= ruleCompositeComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1348);
            iv_ruleCompositeComponentDefinition=ruleCompositeComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1358); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:817:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? ) ;
    public final EObject ruleCompositeComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_templateSpecifiersList_3_0 = null;

        EObject lv_compositeFormalArgumentsList_4_0 = null;

        EObject lv_referencesList_5_0 = null;

        EObject lv_body_7_0 = null;

        EObject lv_body_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:822:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:824:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:824:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:825:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1404);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleCompositeComponentDefinition1415); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:851:1: ( (lv_name_2_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:852:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:852:1: (lv_name_2_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:3: lv_name_2_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1436);
            lv_name_2_0=ruleFQN();
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:875:2: ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:876:1: (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:876:1: (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:877:3: lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getTemplateSpecifiersListTemplateSpecifiersListParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1457);
                    lv_templateSpecifiersList_3_0=ruleTemplateSpecifiersList();
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
                      	        		lv_templateSpecifiersList_3_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:899:3: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:900:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:900:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:901:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1479);
                    lv_compositeFormalArgumentsList_4_0=ruleFormalArgumentsList();
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
                      	        		lv_compositeFormalArgumentsList_4_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:923:3: ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:924:1: (lv_referencesList_5_0= ruleCompositeReferencesList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:924:1: (lv_referencesList_5_0= ruleCompositeReferencesList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:925:3: lv_referencesList_5_0= ruleCompositeReferencesList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getReferencesListCompositeReferencesListParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1501);
                    lv_referencesList_5_0=ruleCompositeReferencesList();
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
                      	        		lv_referencesList_5_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:3: ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )?
            int alt20=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt20=1;
                    }
                    break;
                case 27:
                case 33:
                case 41:
                case 56:
                case 57:
                    {
                    alt20=2;
                    }
                    break;
                case EOF:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred26()) ) {
                        alt20=2;
                    }
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:4: ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:4: ( '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:6: '{' ( (lv_body_7_0= ruleCompositeBody ) )? '}'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleCompositeComponentDefinition1514); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_6_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:951:1: ( (lv_body_7_0= ruleCompositeBody ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27||LA19_0==33||LA19_0==41||(LA19_0>=56 && LA19_0<=57)) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==18) ) {
                        int LA19_2 = input.LA(2);

                        if ( (synpred24()) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:952:1: (lv_body_7_0= ruleCompositeBody )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:952:1: (lv_body_7_0= ruleCompositeBody )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:953:3: lv_body_7_0= ruleCompositeBody
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1535);
                            lv_body_7_0=ruleCompositeBody();
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
                              	       			"body",
                              	        		lv_body_7_0, 
                              	        		"CompositeBody", 
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

                    match(input,18,FollowSets000.FOLLOW_18_in_ruleCompositeComponentDefinition1546); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getRightCurlyBracketKeyword_6_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:980:6: ( (lv_body_9_0= ruleCompositeBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:980:6: ( (lv_body_9_0= ruleCompositeBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:981:1: (lv_body_9_0= ruleCompositeBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:981:1: (lv_body_9_0= ruleCompositeBody )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:982:3: lv_body_9_0= ruleCompositeBody
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1574);
                    lv_body_9_0=ruleCompositeBody();
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
                      	       			"body",
                      	        		lv_body_9_0, 
                      	        		"CompositeBody", 
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
    // $ANTLR end ruleCompositeComponentDefinition


    // $ANTLR start entryRuleTemplateSpecifiersList
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1012:1: entryRuleTemplateSpecifiersList returns [EObject current=null] : iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF ;
    public final EObject entryRuleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifiersList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1013:2: (iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1014:2: iv_ruleTemplateSpecifiersList= ruleTemplateSpecifiersList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifiersListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1612);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1622); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1021:1: ruleTemplateSpecifiersList returns [EObject current=null] : ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' ) ;
    public final EObject ruleTemplateSpecifiersList() throws RecognitionException {
        EObject current = null;

        EObject lv_templateSpecifiers_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1026:6: ( ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1027:1: ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1027:1: ( '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1027:3: '<' ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* ) '>'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleTemplateSpecifiersList1657); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getLessThanSignKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1031:1: ( ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1031:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) ) ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1031:2: ( (lv_templateSpecifiers_1_0= ruleTemplateSpecifier ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1032:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1032:1: (lv_templateSpecifiers_1_0= ruleTemplateSpecifier )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1033:3: lv_templateSpecifiers_1_0= ruleTemplateSpecifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1679);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1055:2: ( ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1055:4: ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleTemplateSpecifiersList1690); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTemplateSpecifiersListAccess().getCommaKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1059:1: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1060:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1060:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1061:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifiersListAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1711);
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
            	    break loop21;
                }
            } while (true);


            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleTemplateSpecifiersList1724); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1095:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1096:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1097:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalArgumentsListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1760);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalArgumentsList1770); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1104:1: ruleFormalArgumentsList returns [EObject current=null] : ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1109:6: ( ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1110:1: ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1110:1: ( '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1110:3: '(' ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* ) ')'
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleFormalArgumentsList1805); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1114:1: ( ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1114:2: ( (lv_formalArguments_1_0= ruleFormalArgument ) ) ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1114:2: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1115:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1115:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1116:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1827);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1138:2: ( ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1138:4: ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleFormalArgumentsList1838); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1142:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1143:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1143:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1144:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1859);
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
            	    break loop22;
                }
            } while (true);


            }

            match(input,25,FollowSets000.FOLLOW_25_in_ruleFormalArgumentsList1872); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1178:1: entryRulePrimitiveReferencesList returns [EObject current=null] : iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF ;
    public final EObject entryRulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferencesList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1179:2: (iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1180:2: iv_rulePrimitiveReferencesList= rulePrimitiveReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveReferencesListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList1908);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveReferencesList1918); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1187:1: rulePrimitiveReferencesList returns [EObject current=null] : ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* ) ;
    public final EObject rulePrimitiveReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1192:6: ( ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1193:1: ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1193:1: ( 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1193:3: 'extends' ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) ) ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )*
            {
            match(input,26,FollowSets000.FOLLOW_26_in_rulePrimitiveReferencesList1953); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1197:1: ( (lv_references_1_0= rulePrimitiveReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1198:1: (lv_references_1_0= rulePrimitiveReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1198:1: (lv_references_1_0= rulePrimitiveReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1199:3: lv_references_1_0= rulePrimitiveReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList1974);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1221:2: ( ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1221:4: ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveReferencesList1985); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPrimitiveReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1225:1: ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1226:1: (lv_references_3_0= rulePrimitiveReferenceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1226:1: (lv_references_3_0= rulePrimitiveReferenceDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1227:3: lv_references_3_0= rulePrimitiveReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferencesListAccess().getReferencesPrimitiveReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2006);
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
            	    break loop23;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1257:1: entryRuleCompositeReferencesList returns [EObject current=null] : iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF ;
    public final EObject entryRuleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferencesList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1258:2: (iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1259:2: iv_ruleCompositeReferencesList= ruleCompositeReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeReferencesListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2044);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeReferencesList2054); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1266:1: ruleCompositeReferencesList returns [EObject current=null] : ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* ) ;
    public final EObject ruleCompositeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1271:6: ( ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1272:1: ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1272:1: ( 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1272:3: 'extends' ( (lv_references_1_0= ruleCompositeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )*
            {
            match(input,26,FollowSets000.FOLLOW_26_in_ruleCompositeReferencesList2089); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCompositeReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1276:1: ( (lv_references_1_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1277:1: (lv_references_1_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1277:1: (lv_references_1_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1278:3: lv_references_1_0= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2110);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1300:2: ( ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1300:4: ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferencesList2121); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getCompositeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1304:1: ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1305:1: (lv_references_3_0= ruleCompositeReferenceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1305:1: (lv_references_3_0= ruleCompositeReferenceDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1306:3: lv_references_3_0= ruleCompositeReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferencesListAccess().getReferencesCompositeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2142);
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
            	    break loop24;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1336:1: entryRuleTypeReferencesList returns [EObject current=null] : iv_ruleTypeReferencesList= ruleTypeReferencesList EOF ;
    public final EObject entryRuleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReferencesList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1337:2: (iv_ruleTypeReferencesList= ruleTypeReferencesList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1338:2: iv_ruleTypeReferencesList= ruleTypeReferencesList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeReferencesListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2180);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReferencesList2190); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1345:1: ruleTypeReferencesList returns [EObject current=null] : ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* ) ;
    public final EObject ruleTypeReferencesList() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1_0 = null;

        EObject lv_references_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1350:6: ( ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1351:1: ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1351:1: ( 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1351:3: 'extends' ( (lv_references_1_0= ruleTypeReferenceDefinition ) ) ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )*
            {
            match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeReferencesList2225); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeReferencesListAccess().getExtendsKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1355:1: ( (lv_references_1_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1356:1: (lv_references_1_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1356:1: (lv_references_1_0= ruleTypeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1357:3: lv_references_1_0= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2246);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1379:2: ( ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1379:4: ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleTypeReferencesList2257); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getTypeReferencesListAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1383:1: ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1384:1: (lv_references_3_0= ruleTypeReferenceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1384:1: (lv_references_3_0= ruleTypeReferenceDefinition )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1385:3: lv_references_3_0= ruleTypeReferenceDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTypeReferencesListAccess().getReferencesTypeReferenceDefinitionParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2278);
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
            	    break loop25;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1415:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1416:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1417:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalArgumentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2316);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalArgument2326); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1424:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1429:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1430:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1430:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1431:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1431:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1432:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalArgument2367); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1462:1: entryRuleCompositeDefinitionElement returns [EObject current=null] : iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF ;
    public final EObject entryRuleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinitionElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1463:2: (iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1464:2: iv_ruleCompositeDefinitionElement= ruleCompositeDefinitionElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeDefinitionElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2407);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2417); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1471:1: ruleCompositeDefinitionElement returns [EObject current=null] : (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentDefinition_0 = null;

        EObject this_InterfaceDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1476:6: ( (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1477:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1477:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA26_1 = input.LA(2);

                if ( (synpred32()) ) {
                    alt26=1;
                }
                else if ( (synpred33()) ) {
                    alt26=2;
                }
                else if ( (true) ) {
                    alt26=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1477:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt26=1;
                }
                break;
            case 56:
            case 57:
                {
                alt26=2;
                }
                break;
            case 33:
                {
                alt26=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1477:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: this_SubComponentDefinition_0= ruleSubComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2467);
                    this_SubComponentDefinition_0=ruleSubComponentDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SubComponentDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: this_InterfaceDefinition_1= ruleInterfaceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2497);
                    this_InterfaceDefinition_1=ruleInterfaceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1504:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getBindingDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2527);
                    this_BindingDefinition_2=ruleBindingDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BindingDefinition_2; 
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
    // $ANTLR end ruleCompositeDefinitionElement


    // $ANTLR start entryRuleSubComponentDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1523:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1524:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1525:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubComponentDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2562);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentDefinition2572); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1532:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_referenceDefinition_2_0 = null;

        EObject lv_body_5_1 = null;

        EObject lv_body_5_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1537:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1538:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1538:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1538:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'contains' ( (lv_referenceDefinition_2_0= ruleComponentReference ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1538:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1539:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1539:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1540:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2618);
                    lv_annotationsList_0_0=ruleAnnotationsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruleSubComponentDefinition2629); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1566:1: ( (lv_referenceDefinition_2_0= ruleComponentReference ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1567:1: (lv_referenceDefinition_2_0= ruleComponentReference )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1567:1: (lv_referenceDefinition_2_0= ruleComponentReference )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1568:3: lv_referenceDefinition_2_0= ruleComponentReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getReferenceDefinitionComponentReferenceParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_ruleSubComponentDefinition2650);
                    lv_referenceDefinition_2_0=ruleComponentReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubComponentDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"referenceDefinition",
                      	        		lv_referenceDefinition_2_0, 
                      	        		"ComponentReference", 
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleSubComponentDefinition2661); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1594:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1595:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1595:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1596:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubComponentDefinition2678); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubComponentDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_4_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1618:2: ( ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred37()) ) {
                    alt30=1;
                }
            }
            else if ( (LA30_0==16||LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
                    int alt29=2;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        int LA29_1 = input.LA(2);

                        if ( (synpred36()) ) {
                            alt29=1;
                        }
                        else if ( (true) ) {
                            alt29=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )", 29, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 20:
                        {
                        alt29=1;
                        }
                        break;
                    case 16:
                        {
                        alt29=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: lv_body_5_1= ruleSubComponentCompositeBody
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentCompositeBodyParserRuleCall_5_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentDefinition2706);
                            lv_body_5_1=ruleSubComponentCompositeBody();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSubComponentDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"body",
                              	        		lv_body_5_1, 
                              	        		"SubComponentCompositeBody", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1642:8: lv_body_5_2= ruleSubComponentPrimitiveBody
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentPrimitiveBodyParserRuleCall_5_0_1(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentDefinition2725);
                            lv_body_5_2=ruleSubComponentPrimitiveBody();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSubComponentDefinitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"body",
                              	        		lv_body_5_2, 
                              	        		"SubComponentPrimitiveBody", 
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
    // $ANTLR end ruleSubComponentDefinition


    // $ANTLR start entryRuleSubComponentCompositeBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1676:1: entryRuleSubComponentCompositeBody returns [EObject current=null] : iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF ;
    public final EObject entryRuleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1677:2: (iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1678:2: iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubComponentCompositeBodyRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2767);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2777); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubComponentCompositeBody


    // $ANTLR start ruleSubComponentCompositeBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1685:1: ruleSubComponentCompositeBody returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* '}' ) ;
    public final EObject ruleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_1_0=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_elements_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1690:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1691:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1691:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1691:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'composite' ) ) '{' ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* '}'
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1691:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1693:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentCompositeBody2823);
                    lv_annotationsList_0_0=ruleAnnotationsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubComponentCompositeBodyRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1715:3: ( (lv_anonymous_1_0= 'composite' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:1: (lv_anonymous_1_0= 'composite' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:1: (lv_anonymous_1_0= 'composite' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1717:3: lv_anonymous_1_0= 'composite'
            {
            lv_anonymous_1_0=(Token)input.LT(1);
            match(input,20,FollowSets000.FOLLOW_20_in_ruleSubComponentCompositeBody2842); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentCompositeBodyAccess().getAnonymousCompositeKeyword_1_0(), "anonymous"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubComponentCompositeBodyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "anonymous", true, "composite", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleSubComponentCompositeBody2865); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1740:1: ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27||LA33_0==33||LA33_0==41||(LA33_0>=56 && LA33_0<=57)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1740:2: ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1740:2: ( (lv_elements_3_0= ruleCompositeDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1741:1: (lv_elements_3_0= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1741:1: (lv_elements_3_0= ruleCompositeDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1742:3: lv_elements_3_0= ruleCompositeDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsCompositeDefinitionElementParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_ruleSubComponentCompositeBody2887);
            	    lv_elements_3_0=ruleCompositeDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubComponentCompositeBodyRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"CompositeDefinitionElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1764:2: ( ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==14) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1764:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleSubComponentCompositeBody2898); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSubComponentCompositeBodyAccess().getSemicolonKeyword_3_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleSubComponentCompositeBody2912); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentCompositeBodyAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleSubComponentCompositeBody


    // $ANTLR start entryRuleSubComponentPrimitiveBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1780:1: entryRuleSubComponentPrimitiveBody returns [EObject current=null] : iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF ;
    public final EObject entryRuleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentPrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1781:2: (iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1782:2: iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubComponentPrimitiveBodyRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2948);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2958); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubComponentPrimitiveBody


    // $ANTLR start ruleSubComponentPrimitiveBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1789:1: ruleSubComponentPrimitiveBody returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* '}' ) ;
    public final EObject ruleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_1_0=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_elements_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1794:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1795:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1795:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1795:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_anonymous_1_0= 'primitive' ) ) '{' ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* '}'
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1795:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1796:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1796:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1797:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentPrimitiveBody3004);
                    lv_annotationsList_0_0=ruleAnnotationsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSubComponentPrimitiveBodyRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1819:3: ( (lv_anonymous_1_0= 'primitive' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1820:1: (lv_anonymous_1_0= 'primitive' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1820:1: (lv_anonymous_1_0= 'primitive' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1821:3: lv_anonymous_1_0= 'primitive'
            {
            lv_anonymous_1_0=(Token)input.LT(1);
            match(input,16,FollowSets000.FOLLOW_16_in_ruleSubComponentPrimitiveBody3023); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getAnonymousPrimitiveKeyword_1_0(), "anonymous"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubComponentPrimitiveBodyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "anonymous", true, "primitive", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleSubComponentPrimitiveBody3046); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1844:1: ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30||(LA36_0>=37 && LA36_0<=39)||LA36_0==41||(LA36_0>=56 && LA36_0<=57)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1844:2: ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1844:2: ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1845:1: (lv_elements_3_0= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1845:1: (lv_elements_3_0= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1846:3: lv_elements_3_0= rulePrimitiveDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsPrimitiveDefinitionElementParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_ruleSubComponentPrimitiveBody3068);
            	    lv_elements_3_0=rulePrimitiveDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubComponentPrimitiveBodyRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_3_0, 
            	      	        		"PrimitiveDefinitionElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1868:2: ( ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==14) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1868:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleSubComponentPrimitiveBody3079); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getSemicolonKeyword_3_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleSubComponentPrimitiveBody3093); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getRightCurlyBracketKeyword_4(), null); 
                  
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
    // $ANTLR end ruleSubComponentPrimitiveBody


    // $ANTLR start entryRuleCompositeBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1884:1: entryRuleCompositeBody returns [EObject current=null] : iv_ruleCompositeBody= ruleCompositeBody EOF ;
    public final EObject entryRuleCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1885:2: (iv_ruleCompositeBody= ruleCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1886:2: iv_ruleCompositeBody= ruleCompositeBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeBodyRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_entryRuleCompositeBody3129);
            iv_ruleCompositeBody=ruleCompositeBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeBody3139); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompositeBody


    // $ANTLR start ruleCompositeBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1893:1: ruleCompositeBody returns [EObject current=null] : ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* ;
    public final EObject ruleCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:6: ( ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) ( ';' )? )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) ( ';' )? )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: ( ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) ( ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==27||LA38_0==33||LA38_0==41||(LA38_0>=56 && LA38_0<=57)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:2: ( (lv_elements_0_0= ruleCompositeDefinitionElement ) ) ( ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:2: ( (lv_elements_0_0= ruleCompositeDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1900:1: (lv_elements_0_0= ruleCompositeDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1900:1: (lv_elements_0_0= ruleCompositeDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1901:3: lv_elements_0_0= ruleCompositeDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getCompositeBodyAccess().getElementsCompositeDefinitionElementParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeBody3185);
            	    lv_elements_0_0=ruleCompositeDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getCompositeBodyRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_0_0, 
            	      	        		"CompositeDefinitionElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1923:2: ( ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==14) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1923:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeBody3196); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getCompositeBodyAccess().getSemicolonKeyword_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


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
    // $ANTLR end ruleCompositeBody


    // $ANTLR start entryRulePrimitiveBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1935:1: entryRulePrimitiveBody returns [EObject current=null] : iv_rulePrimitiveBody= rulePrimitiveBody EOF ;
    public final EObject entryRulePrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1936:2: (iv_rulePrimitiveBody= rulePrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1937:2: iv_rulePrimitiveBody= rulePrimitiveBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveBodyRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_entryRulePrimitiveBody3235);
            iv_rulePrimitiveBody=rulePrimitiveBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveBody3245); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveBody


    // $ANTLR start rulePrimitiveBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1944:1: rulePrimitiveBody returns [EObject current=null] : ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* ;
    public final EObject rulePrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1949:6: ( ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1950:1: ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1950:1: ( ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==30||(LA40_0>=37 && LA40_0<=39)||LA40_0==41||(LA40_0>=56 && LA40_0<=57)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1950:2: ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) ) ( ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1950:2: ( (lv_elements_0_0= rulePrimitiveDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1951:1: (lv_elements_0_0= rulePrimitiveDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1951:1: (lv_elements_0_0= rulePrimitiveDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1952:3: lv_elements_0_0= rulePrimitiveDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveBodyAccess().getElementsPrimitiveDefinitionElementParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveBody3291);
            	    lv_elements_0_0=rulePrimitiveDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPrimitiveBodyRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_0_0, 
            	      	        		"PrimitiveDefinitionElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1974:2: ( ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==14) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1974:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_rulePrimitiveBody3302); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveBodyAccess().getSemicolonKeyword_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


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
    // $ANTLR end rulePrimitiveBody


    // $ANTLR start entryRuleTypeBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1986:1: entryRuleTypeBody returns [EObject current=null] : iv_ruleTypeBody= ruleTypeBody EOF ;
    public final EObject entryRuleTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1987:2: (iv_ruleTypeBody= ruleTypeBody EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1988:2: iv_ruleTypeBody= ruleTypeBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeBodyRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_entryRuleTypeBody3341);
            iv_ruleTypeBody=ruleTypeBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBody3351); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeBody


    // $ANTLR start ruleTypeBody
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1995:1: ruleTypeBody returns [EObject current=null] : ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) ( ';' )? )* ;
    public final EObject ruleTypeBody() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2000:6: ( ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) ( ';' )? )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2001:1: ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) ( ';' )? )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2001:1: ( ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) ( ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==41||(LA42_0>=56 && LA42_0<=57)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2001:2: ( (lv_elements_0_0= ruleTypeDefinitionElement ) ) ( ';' )?
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2001:2: ( (lv_elements_0_0= ruleTypeDefinitionElement ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2002:1: (lv_elements_0_0= ruleTypeDefinitionElement )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2002:1: (lv_elements_0_0= ruleTypeDefinitionElement )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2003:3: lv_elements_0_0= ruleTypeDefinitionElement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTypeBodyAccess().getElementsTypeDefinitionElementParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinitionElement_in_ruleTypeBody3397);
            	    lv_elements_0_0=ruleTypeDefinitionElement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTypeBodyRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"elements",
            	      	        		lv_elements_0_0, 
            	      	        		"TypeDefinitionElement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2025:2: ( ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==14) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2025:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleTypeBody3408); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getTypeBodyAccess().getSemicolonKeyword_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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
    // $ANTLR end ruleTypeBody


    // $ANTLR start entryRuleComponentReference
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2039:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2040:2: (iv_ruleComponentReference= ruleComponentReference EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2041:2: iv_ruleComponentReference= ruleComponentReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getComponentReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_entryRuleComponentReference3449);
            iv_ruleComponentReference=ruleComponentReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComponentReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentReference3459); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComponentReference


    // $ANTLR start ruleComponentReference
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2048:1: ruleComponentReference returns [EObject current=null] : (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition ) ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeReferenceDefinition_0 = null;

        EObject this_PrimitiveReferenceDefinition_1 = null;

        EObject this_TypeReferenceDefinition_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2053:6: ( (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred50()) ) {
                    alt43=1;
                }
                else if ( (synpred51()) ) {
                    alt43=2;
                }
                else if ( (true) ) {
                    alt43=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2054:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2054:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getComponentReferenceAccess().getCompositeReferenceDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleComponentReference3509);
                    this_CompositeReferenceDefinition_0=ruleCompositeReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompositeReferenceDefinition_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:2: this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getComponentReferenceAccess().getPrimitiveReferenceDefinitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_ruleComponentReference3539);
                    this_PrimitiveReferenceDefinition_1=rulePrimitiveReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveReferenceDefinition_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2081:2: this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getComponentReferenceAccess().getTypeReferenceDefinitionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleComponentReference3569);
                    this_TypeReferenceDefinition_2=ruleTypeReferenceDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeReferenceDefinition_2; 
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
    // $ANTLR end ruleComponentReference


    // $ANTLR start entryRuleCompositeReferenceDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2100:1: entryRuleCompositeReferenceDefinition returns [EObject current=null] : iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF ;
    public final EObject entryRuleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeReferenceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2101:2: (iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2102:2: iv_ruleCompositeReferenceDefinition= ruleCompositeReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompositeReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3604);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3614); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2109:1: ruleCompositeReferenceDefinition returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? ) ;
    public final EObject ruleCompositeReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        EObject lv_templatesList_2_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_argumentsList_7_0 = null;

        EObject lv_argumentsList_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2114:6: ( ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:2: ( (lv_referenceName_0_0= ruleFQN ) ) ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )? ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2115:2: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2116:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2116:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2117:3: lv_referenceName_0_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3660);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2139:2: ( '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2139:4: '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleCompositeReferenceDefinition3671); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLessThanSignKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2143:1: ( (lv_templatesList_2_0= ruleTemplateDefinition ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2144:1: (lv_templatesList_2_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2144:1: (lv_templatesList_2_0= ruleTemplateDefinition )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2145:3: lv_templatesList_2_0= ruleTemplateDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3692);
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2167:2: ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==22) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2167:4: ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferenceDefinition3703); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2171:1: ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2172:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2172:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2173:3: lv_templatesList_4_0= ruleTemplateDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3724);
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
                    	    break loop44;
                        }
                    } while (true);

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleCompositeReferenceDefinition3736); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2199:3: ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2199:5: '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleCompositeReferenceDefinition3749); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2203:1: ( (lv_argumentsList_7_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2204:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2204:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2205:3: lv_argumentsList_7_0= ruleArgumentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3770);
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:2: ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==22) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:4: ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferenceDefinition3781); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2232:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2232:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCompositeReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3802);
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
                    	    break loop46;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_ruleCompositeReferenceDefinition3814); if (failed) return current;
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


    // $ANTLR start entryRulePrimitiveReferenceDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2267:1: entryRulePrimitiveReferenceDefinition returns [EObject current=null] : iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF ;
    public final EObject entryRulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReferenceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2268:2: (iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2269:2: iv_rulePrimitiveReferenceDefinition= rulePrimitiveReferenceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3852);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3862); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2276:1: rulePrimitiveReferenceDefinition returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? ) ;
    public final EObject rulePrimitiveReferenceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        EObject lv_argumentsList_2_0 = null;

        EObject lv_argumentsList_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2281:6: ( ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2282:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2282:1: ( ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2282:2: ( (lv_referenceName_0_0= ruleFQN ) ) ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2282:2: ( (lv_referenceName_0_0= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2283:1: (lv_referenceName_0_0= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2283:1: (lv_referenceName_0_0= ruleFQN )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2284:3: lv_referenceName_0_0= ruleFQN
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getReferenceNameFQNParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3908);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2306:2: ( '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==24) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2306:4: '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveReferenceDefinition3919); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2310:1: ( (lv_argumentsList_2_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2311:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2311:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2312:3: lv_argumentsList_2_0= ruleArgumentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3940);
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2334:2: ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==22) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2334:4: ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveReferenceDefinition3951); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2338:1: ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2339:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2339:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2340:3: lv_argumentsList_4_0= ruleArgumentDefinition
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getPrimitiveReferenceDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3972);
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
                    	    break loop48;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_rulePrimitiveReferenceDefinition3984); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2374:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2375:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2376:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4022);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateDefinition4032); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2383:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_reference_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2388:6: ( ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2389:1: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2389:1: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2389:2: ( ( (lv_name_0_0= RULE_ID ) ) '=' )? ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2389:2: ( ( (lv_name_0_0= RULE_ID ) ) '=' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==29) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2389:3: ( (lv_name_0_0= RULE_ID ) ) '='
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2389:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2390:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2390:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2391:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateDefinition4075); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleTemplateDefinition4090); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2417:3: ( (lv_reference_2_0= ruleCompositeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2418:1: (lv_reference_2_0= ruleCompositeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2418:1: (lv_reference_2_0= ruleCompositeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:3: lv_reference_2_0= ruleCompositeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateDefinitionAccess().getReferenceCompositeReferenceDefinitionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4113);
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


    // $ANTLR start entryRuleAttributeDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2449:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2450:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2451:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4149);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeDefinition4159); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2458:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleValue ) ) )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_3_0=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2463:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleValue ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2464:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleValue ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2464:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleValue ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2464:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) ( '=' ( (lv_value_5_0= ruleValue ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2464:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==41) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2465:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2465:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2466:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition4205);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeDefinition4216); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2492:1: ( (lv_type_2_0= ruleAttributeType ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=48 && LA52_0<=50)) ) {
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2493:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2493:1: (lv_type_2_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2494:3: lv_type_2_0= ruleAttributeType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4237);
                    lv_type_2_0=ruleAttributeType();
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
                      	        		lv_type_2_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2516:3: ( (lv_attributeName_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2517:1: (lv_attributeName_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2517:1: (lv_attributeName_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2518:3: lv_attributeName_3_0= RULE_ID
            {
            lv_attributeName_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeDefinition4255); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_3_0(), "attributeName"); 
              		
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
              	        		lv_attributeName_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2540:2: ( '=' ( (lv_value_5_0= ruleValue ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2540:4: '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeDefinition4271); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2544:1: ( (lv_value_5_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2545:1: (lv_value_5_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2545:1: (lv_value_5_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2546:3: lv_value_5_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleAttributeDefinition4292);
                    lv_value_5_0=ruleValue();
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
                      	        		lv_value_5_0, 
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2576:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2577:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2578:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArgumentDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4330);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentDefinition4340); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2585:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;

        AntlrDatatypeRuleToken lv_argumentValue_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2590:6: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )
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
                        new NoViableAltException("2591:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_INT||LA54_0==RULE_STRING||(LA54_0>=42 && LA54_0<=43)||(LA54_0>=52 && LA54_0<=53)) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2591:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:3: ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2593:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleArgumentDefinition4383); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleArgumentDefinition4398); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2619:1: ( (lv_argumentValue_2_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2620:1: (lv_argumentValue_2_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2620:1: (lv_argumentValue_2_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2621:3: lv_argumentValue_2_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleArgumentDefinition4419);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2644:6: ( (lv_argumentValue_3_0= ruleValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2644:6: ( (lv_argumentValue_3_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2645:1: (lv_argumentValue_3_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2645:1: (lv_argumentValue_3_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2646:3: lv_argumentValue_3_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleArgumentDefinition4447);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2676:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2677:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2678:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4483);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition4493); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2685:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) ) )? ( (lv_contingency_8_0= ruleContingency ) )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token lv_collection_7_0=null;
        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_role_1_0 = null;

        AntlrDatatypeRuleToken lv_signature_2_0 = null;

        Enumerator lv_contingency_8_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2690:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) ) )? ( (lv_contingency_8_0= ruleContingency ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) ) )? ( (lv_contingency_8_0= ruleContingency ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) ) )? ( (lv_contingency_8_0= ruleContingency ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) ) )? ( (lv_contingency_8_0= ruleContingency ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2693:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition4539);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2715:3: ( (lv_role_1_0= ruleRole ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2716:1: (lv_role_1_0= ruleRole )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2716:1: (lv_role_1_0= ruleRole )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2717:3: lv_role_1_0= ruleRole
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getRoleRoleEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleInterfaceDefinition4561);
            lv_role_1_0=ruleRole();
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
              	        		lv_role_1_0, 
              	        		"Role", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2739:2: ( (lv_signature_2_0= ruleFQN ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2740:1: (lv_signature_2_0= ruleFQN )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2740:1: (lv_signature_2_0= ruleFQN )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:3: lv_signature_2_0= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFQNParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleInterfaceDefinition4582);
                    lv_signature_2_0=ruleFQN();
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
                      	        		lv_signature_2_0, 
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleInterfaceDefinition4593); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getAsKeyword_3(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2767:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2768:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2768:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2769:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInterfaceDefinition4610); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
              		
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
              	        		lv_name_4_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ( (lv_collection_7_0= ']' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2792:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2792:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2793:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleInterfaceDefinition4634); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0(), "collection"); 
                          
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2812:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2813:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2813:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2814:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)input.LT(1);
                            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInterfaceDefinition4664); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_1_0(), "collectionsize"); 
                              		
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
                              	        		lv_collectionsize_6_0, 
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2836:3: ( (lv_collection_7_0= ']' ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2837:1: (lv_collection_7_0= ']' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2837:1: (lv_collection_7_0= ']' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2838:3: lv_collection_7_0= ']'
                    {
                    lv_collection_7_0=(Token)input.LT(1);
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleInterfaceDefinition4688); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionRightSquareBracketKeyword_5_2_0(), "collection"); 
                          
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2857:4: ( (lv_contingency_8_0= ruleContingency ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=54 && LA59_0<=55)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2858:1: (lv_contingency_8_0= ruleContingency )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2858:1: (lv_contingency_8_0= ruleContingency )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2859:3: lv_contingency_8_0= ruleContingency
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleContingency_in_ruleInterfaceDefinition4724);
                    lv_contingency_8_0=ruleContingency();
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
                      	        		lv_contingency_8_0, 
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2889:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2890:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2891:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4761);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBindingDefinition4771); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2898:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceSourceParentName_3_0=null;
        Token lv_interfaceSourceName_5_0=null;
        Token lv_interfaceSourceIndex_7_0=null;
        Token lv_interfaceTargetParentName_11_0=null;
        Token lv_interfaceTargetName_13_0=null;
        Token lv_interfaceTargetIndex_15_0=null;
        EObject lv_annotationsList_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==41) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2905:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2905:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2906:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4817);
                    lv_annotationsList_0_0=ruleAnnotationsList();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBindingDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2928:3: ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2928:5: 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )?
            {
            match(input,33,FollowSets000.FOLLOW_33_in_ruleBindingDefinition4829); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2932:1: ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) )
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
                    new NoViableAltException("2932:1: ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2932:3: 'this'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleBindingDefinition4840); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2937:6: ( (lv_interfaceSourceParentName_3_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2937:6: ( (lv_interfaceSourceParentName_3_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2938:1: (lv_interfaceSourceParentName_3_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2938:1: (lv_interfaceSourceParentName_3_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2939:3: lv_interfaceSourceParentName_3_0= RULE_ID
                    {
                    lv_interfaceSourceParentName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition4863); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceParentNameIDTerminalRuleCall_1_1_1_0(), "interfaceSourceParentName"); 
                      		
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
                      	        		lv_interfaceSourceParentName_3_0, 
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

            match(input,35,FollowSets000.FOLLOW_35_in_ruleBindingDefinition4879); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_1_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2965:1: ( (lv_interfaceSourceName_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2966:1: (lv_interfaceSourceName_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2966:1: (lv_interfaceSourceName_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2967:3: lv_interfaceSourceName_5_0= RULE_ID
            {
            lv_interfaceSourceName_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition4896); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceNameIDTerminalRuleCall_1_3_0(), "interfaceSourceName"); 
              		
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
              	        		lv_interfaceSourceName_5_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2989:2: ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==31) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2989:4: '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleBindingDefinition4912); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_1_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2993:1: ( (lv_interfaceSourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2994:1: (lv_interfaceSourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2994:1: (lv_interfaceSourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2995:3: lv_interfaceSourceIndex_7_0= RULE_INT
                    {
                    lv_interfaceSourceIndex_7_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBindingDefinition4929); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceSourceIndexINTTerminalRuleCall_1_4_1_0(), "interfaceSourceIndex"); 
                      		
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
                      	        		lv_interfaceSourceIndex_7_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleBindingDefinition4944); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_1_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruleBindingDefinition4956); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_1_5(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3025:1: ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==34) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3025:1: ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) )", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3025:3: 'this'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleBindingDefinition4967); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_6_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3030:6: ( (lv_interfaceTargetParentName_11_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3030:6: ( (lv_interfaceTargetParentName_11_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3031:1: (lv_interfaceTargetParentName_11_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3031:1: (lv_interfaceTargetParentName_11_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3032:3: lv_interfaceTargetParentName_11_0= RULE_ID
                    {
                    lv_interfaceTargetParentName_11_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition4990); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetParentNameIDTerminalRuleCall_1_6_1_0(), "interfaceTargetParentName"); 
                      		
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
                      	        		lv_interfaceTargetParentName_11_0, 
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

            match(input,35,FollowSets000.FOLLOW_35_in_ruleBindingDefinition5006); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_1_7(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3058:1: ( (lv_interfaceTargetName_13_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3059:1: (lv_interfaceTargetName_13_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3059:1: (lv_interfaceTargetName_13_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3060:3: lv_interfaceTargetName_13_0= RULE_ID
            {
            lv_interfaceTargetName_13_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition5023); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetNameIDTerminalRuleCall_1_8_0(), "interfaceTargetName"); 
              		
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
              	        		lv_interfaceTargetName_13_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3082:2: ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==31) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3082:4: '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleBindingDefinition5039); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_1_9_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3086:1: ( (lv_interfaceTargetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:1: (lv_interfaceTargetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:1: (lv_interfaceTargetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3088:3: lv_interfaceTargetIndex_15_0= RULE_INT
                    {
                    lv_interfaceTargetIndex_15_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBindingDefinition5056); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getBindingDefinitionAccess().getInterfaceTargetIndexINTTerminalRuleCall_1_9_1_0(), "interfaceTargetIndex"); 
                      		
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
                      	        		lv_interfaceTargetIndex_15_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleBindingDefinition5071); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_1_9_2(), null); 
                          
                    }

                    }
                    break;

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
    // $ANTLR end ruleBindingDefinition


    // $ANTLR start entryRuleDataDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3122:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3123:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3124:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5110);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataDefinition5120); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3136:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3137:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3137:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3137:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3137:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==41) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3138:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3138:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3139:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5166);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3161:3: ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==37) ) {
                alt67=1;
            }
            else if ( (LA67_0==38) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3161:3: ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3161:4: ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3161:4: ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3161:6: 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleDataDefinition5179); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_1_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3165:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ID||LA66_0==RULE_PATH) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==RULE_CODEC) ) {
                        alt66=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3165:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3165:2: ( (lv_fileC_2_0= ruleFileC ) )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3165:2: ( (lv_fileC_2_0= ruleFileC ) )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:1: (lv_fileC_2_0= ruleFileC )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:1: (lv_fileC_2_0= ruleFileC )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3167:3: lv_fileC_2_0= ruleFileC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_1_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleFileC_in_ruleDataDefinition5201);
                            lv_fileC_2_0=ruleFileC();
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
                              	        		lv_fileC_2_0, 
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
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3190:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3190:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3191:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3191:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3192:3: lv_inlineCcode_3_0= ruleInlineCodeC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_0_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5228);
                            lv_inlineCcode_3_0=ruleInlineCodeC();
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
                              	        		lv_inlineCcode_3_0, 
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3215:7: 'nodata'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleDataDefinition5246); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDataDefinitionAccess().getNodataKeyword_1_1(), null); 
                          
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
    // $ANTLR end ruleDataDefinition


    // $ANTLR start entryRuleImplementationDefinition
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3228:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3229:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5283);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementationDefinition5293); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3236:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3241:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3242:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3242:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3242:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3242:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==41) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3243:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3243:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3244:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5339);
                    lv_annotationsList_0_0=ruleAnnotationsList();
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
                      	       			"annotationsList",
                      	        		lv_annotationsList_0_0, 
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

            match(input,39,FollowSets000.FOLLOW_39_in_ruleImplementationDefinition5350); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3270:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||LA69_0==RULE_PATH) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_CODEC) ) {
                alt69=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3270:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3270:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3270:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3271:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3271:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3272:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileC_in_ruleImplementationDefinition5372);
                    lv_fileC_2_0=ruleFileC();
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
                      	        		lv_fileC_2_0, 
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3295:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3295:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3296:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3296:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3297:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5399);
                    lv_inlineCcode_3_0=ruleInlineCodeC();
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
                      	        		lv_inlineCcode_3_0, 
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3327:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3328:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3329:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5436);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateSpecifier5446); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3336:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_reference_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3341:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3342:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3342:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3342:2: ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3342:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3343:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3343:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3344:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateSpecifier5488); if (failed) return current;
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

            match(input,40,FollowSets000.FOLLOW_40_in_ruleTemplateSpecifier5503); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3370:1: ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3371:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3371:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3372:3: lv_reference_2_0= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getReferenceTypeReferenceDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5524);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3402:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3403:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3404:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileC_in_entryRuleFileC5560);
            iv_ruleFileC=ruleFileC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileC5570); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3411:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        Token lv_directory_0_0=null;
        AntlrDatatypeRuleToken lv_fileName_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3416:6: ( ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3417:1: ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3417:1: ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3417:2: ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3417:2: ( (lv_directory_0_0= RULE_PATH ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_PATH) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3418:1: (lv_directory_0_0= RULE_PATH )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3418:1: (lv_directory_0_0= RULE_PATH )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:3: lv_directory_0_0= RULE_PATH
                    {
                    lv_directory_0_0=(Token)input.LT(1);
                    match(input,RULE_PATH,FollowSets000.FOLLOW_RULE_PATH_in_ruleFileC5612); if (failed) return current;
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3441:3: ( (lv_fileName_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3442:1: (lv_fileName_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3442:1: (lv_fileName_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3443:3: lv_fileName_1_0= ruleFileName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFileNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleFileC5639);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3473:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3474:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3475:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_entryRuleFileName5676);
            iv_ruleFileName=ruleFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileName5687); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3482:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3487:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3488:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3488:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3488:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFileName5727); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3495:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==35) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3496:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleFileName5746); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFileNameAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFileName5761); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3516:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3517:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3518:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5808);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineCodeC5818); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3525:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODEC ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3530:6: ( ( (lv_codeC_0_0= RULE_CODEC ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3531:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3531:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3532:1: (lv_codeC_0_0= RULE_CODEC )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3532:1: (lv_codeC_0_0= RULE_CODEC )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3533:3: lv_codeC_0_0= RULE_CODEC
            {
            lv_codeC_0_0=(Token)input.LT(1);
            match(input,RULE_CODEC,FollowSets000.FOLLOW_RULE_CODEC_in_ruleInlineCodeC5859); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3563:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3564:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3565:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList5899);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList5909); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3572:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3577:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3578:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3578:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3578:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3578:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3579:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3579:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3580:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList5955);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3602:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==41) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3603:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3603:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3604:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList5976);
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
            	    break loop72;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3634:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3635:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3636:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation6013);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation6023); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3643:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3648:6: ( ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3649:1: ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3649:1: ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3649:3: '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )?
            {
            match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotation6058); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3653:1: ( (lv_name_1_0= ruleAnnotationType ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3654:1: (lv_name_1_0= ruleAnnotationType )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3654:1: (lv_name_1_0= ruleAnnotationType )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3655:3: lv_name_1_0= ruleAnnotationType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_ruleAnnotation6079);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3677:2: ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==24) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3677:4: '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation6090); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3681:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3682:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3682:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3683:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_ruleAnnotation6111);
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3705:2: ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==22) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3705:4: ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation6122); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3709:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3710:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3710:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3711:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_ruleAnnotation6143);
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
                    	    break loop73;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_ruleAnnotation6155); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3745:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3746:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3747:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6193);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationElement6203); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3754:1: ruleAnnotationElement returns [EObject current=null] : ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_1_0=null;
        EObject lv_elementValue_0_0 = null;

        EObject lv_elementValue_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3759:6: ( ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3760:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3760:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_INT||LA75_0==RULE_STRING||LA75_0==17||LA75_0==41) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3760:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3760:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3760:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3761:1: (lv_elementValue_0_0= ruleElementValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3761:1: (lv_elementValue_0_0= ruleElementValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3762:3: lv_elementValue_0_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleAnnotationElement6249);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3785:6: ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3785:6: ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3785:7: ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3785:7: ( (lv_elementName_1_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3786:1: (lv_elementName_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3786:1: (lv_elementName_1_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3787:3: lv_elementName_1_0= RULE_ID
                    {
                    lv_elementName_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationElement6273); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationElement6288); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_1_1(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3813:1: ( (lv_elementValue_3_0= ruleElementValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3814:1: (lv_elementValue_3_0= ruleElementValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3814:1: (lv_elementValue_3_0= ruleElementValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3815:3: lv_elementValue_3_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleAnnotationElement6309);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3845:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3846:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3847:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_entryRuleElementValue6346);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementValue6356); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3854:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3859:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3860:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3860:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt76=1;
                }
                break;
            case 41:
                {
                alt76=2;
                }
                break;
            case 17:
                {
                alt76=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3860:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3861:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleElementValue6406);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3874:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleElementValue6436);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3887:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6466);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3906:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3907:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3908:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_entryRuleConstantValue6501);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantValue6511); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3915:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3920:6: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3921:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3921:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3922:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3922:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3923:3: lv_value_0_0= ruleConstantFormat
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantFormat_in_ruleConstantValue6556);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3953:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3954:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3955:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6592);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantFormat6603); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3962:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3967:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3968:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3968:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_STRING) ) {
                alt77=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3968:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3968:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConstantFormat6643); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3976:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConstantFormat6669); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3991:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3992:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3993:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6714);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6724); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4000:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4005:6: ( ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4006:1: ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4006:1: ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4006:3: '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleElementValueArrayInitializer6759); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4010:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4011:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4011:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4012:3: lv_values_1_0= ruleElementValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6780);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4034:2: ( ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==22) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4034:4: ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleElementValueArrayInitializer6791); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4038:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4039:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4039:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4040:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6812);
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
            	    break loop78;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleElementValueArrayInitializer6824); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4074:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4075:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4076:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue6861);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue6872); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4083:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4088:6: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4089:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4089:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt79=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt79=1;
                }
                break;
            case RULE_INT:
            case 52:
            case 53:
                {
                alt79=2;
                }
                break;
            case 43:
                {
                alt79=3;
                }
                break;
            case RULE_STRING:
                {
                alt79=4;
                }
                break;
            case 42:
                {
                alt79=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4089:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4089:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValue6912); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4098:5: this_signedINT_1= rulesignedINT
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleValue6945);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4110:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleHexadecimalType_in_ruleValue6978);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4121:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleValue7004); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4130:2: kw= 'null'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleValue7028); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getValueAccess().getNullKeyword_4(), null); 
                          
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4143:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4144:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4145:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHexadecimalTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7069);
            iv_ruleHexadecimalType=ruleHexadecimalType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHexadecimalType7080); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4152:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4157:6: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4158:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4158:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4159:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,43,FollowSets000.FOLLOW_43_in_ruleHexadecimalType7118); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getHexadecimalTypeAccess().getXKeyword_0(), null); 
                  
            }
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleHexadecimalType7133); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4179:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4180:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4181:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7179);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType7190); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4188:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4193:6: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4194:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4194:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            int alt80=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt80=1;
                }
                break;
            case 45:
                {
                alt80=2;
                }
                break;
            case 46:
                {
                alt80=3;
                }
                break;
            case 47:
                {
                alt80=4;
                }
                break;
            case RULE_ID:
                {
                alt80=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4194:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4195:2: kw= 'Override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleAnnotationType7228); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4202:2: kw= 'Singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleAnnotationType7247); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4209:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleAnnotationType7266); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4216:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleAnnotationType7285); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4223:5: this_FQN_4= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationTypeAccess().getFQNParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleAnnotationType7313);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4241:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4242:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4243:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_entryRuleAttributeType7359);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeType7370); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4250:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4255:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4256:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4256:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt81=1;
                }
                break;
            case 49:
                {
                alt81=2;
                }
                break;
            case 50:
                {
                alt81=3;
                }
                break;
            case RULE_ID:
                {
                alt81=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4256:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4257:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleAttributeType7408); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4264:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleAttributeType7427); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4271:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleAttributeType7446); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4277:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeType7467); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4292:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4293:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4294:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_entryRuleFQN7513);
            iv_ruleFQN=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFQN7524); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4301:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4306:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4307:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4307:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4307:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN7564); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4314:1: (kw= '.' this_ID_2= RULE_ID )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==35) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4315:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,35,FollowSets000.FOLLOW_35_in_ruleFQN7583); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN7598); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4335:1: entryRuleFULL_IMPORT_NAME returns [String current=null] : iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF ;
    public final String entryRuleFULL_IMPORT_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_IMPORT_NAME = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4336:2: (iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4337:2: iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFULL_IMPORT_NAMERule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7646);
            iv_ruleFULL_IMPORT_NAME=ruleFULL_IMPORT_NAME();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFULL_IMPORT_NAME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7657); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4344:1: ruleFULL_IMPORT_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleFULL_IMPORT_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4349:6: ( (this_FQN_0= ruleFQN kw= '.*' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4350:1: (this_FQN_0= ruleFQN kw= '.*' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4350:1: (this_FQN_0= ruleFQN kw= '.*' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4351:5: this_FQN_0= ruleFQN kw= '.*'
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFQNParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7704);
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
            match(input,51,FollowSets000.FOLLOW_51_in_ruleFULL_IMPORT_NAME7722); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4375:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4376:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4377:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT7763);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT7774); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4384:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4389:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4390:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4390:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4390:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4390:2: (kw= '+' | kw= '-' )?
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==52) ) {
                alt83=1;
            }
            else if ( (LA83_0==53) ) {
                alt83=2;
            }
            switch (alt83) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4391:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FollowSets000.FOLLOW_52_in_rulesignedINT7813); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4398:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FollowSets000.FOLLOW_53_in_rulesignedINT7832); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT7849); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4418:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4422:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4423:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4423:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==54) ) {
                alt84=1;
            }
            else if ( (LA84_0==55) ) {
                alt84=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4423:1: ( ( 'optional' ) | ( 'mandatory' ) )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4423:2: ( 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4423:2: ( 'optional' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4423:4: 'optional'
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleContingency7906); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4429:6: ( 'mandatory' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4429:6: ( 'mandatory' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4429:8: 'mandatory'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleContingency7921); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4439:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4443:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4444:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4444:1: ( ( 'provides' ) | ( 'requires' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==56) ) {
                alt85=1;
            }
            else if ( (LA85_0==57) ) {
                alt85=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4444:1: ( ( 'provides' ) | ( 'requires' ) )", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4444:2: ( 'provides' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4444:2: ( 'provides' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4444:4: 'provides'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleRole7964); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4450:6: ( 'requires' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4450:6: ( 'requires' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4450:8: 'requires'
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleRole7979); if (failed) return current;
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

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:250:2: ( ruleComponentTypeDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:250:2: ruleComponentTypeDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleComponentTypeDefinition_in_synpred3391);
        ruleComponentTypeDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:263:2: ( rulePrimitiveComponentDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:263:2: rulePrimitiveComponentDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveComponentDefinition_in_synpred4421);
        rulePrimitiveComponentDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:436:1: ( ( rulePrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:436:1: ( rulePrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:436:1: ( rulePrimitiveBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:437:3: rulePrimitiveBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_synpred9683);
        rulePrimitiveBody();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:464:6: ( ( ( rulePrimitiveBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:464:6: ( ( rulePrimitiveBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:464:6: ( ( rulePrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:465:1: ( rulePrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:465:1: ( rulePrimitiveBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:466:3: rulePrimitiveBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getPrimitiveComponentDefinitionAccess().getBodyPrimitiveBodyParserRuleCall_6_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_synpred11722);
        rulePrimitiveBody();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:512:2: ( ruleInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:512:2: ruleInterfaceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_synpred12820);
        ruleInterfaceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:525:2: ( ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:525:2: ruleAttributeDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_synpred13850);
        ruleAttributeDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:2: ( ruleDataDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:2: ruleDataDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_synpred14880);
        ruleDataDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:666:1: ( ( ruleTypeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:666:1: ( ruleTypeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:666:1: ( ruleTypeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:667:3: ruleTypeBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_synpred171088);
        ruleTypeBody();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:6: ( ( ( ruleTypeBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:6: ( ( ruleTypeBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:694:6: ( ( ruleTypeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:695:1: ( ruleTypeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:695:1: ( ruleTypeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:696:3: ruleTypeBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getComponentTypeDefinitionAccess().getBodyTypeBodyParserRuleCall_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_synpred191127);
        ruleTypeBody();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:952:1: ( ( ruleCompositeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:952:1: ( ruleCompositeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:952:1: ( ruleCompositeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:953:3: ruleCompositeBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_synpred241535);
        ruleCompositeBody();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:980:6: ( ( ( ruleCompositeBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:980:6: ( ( ruleCompositeBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:980:6: ( ( ruleCompositeBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:981:1: ( ruleCompositeBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:981:1: ( ruleCompositeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:982:3: ruleCompositeBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompositeComponentDefinitionAccess().getBodyCompositeBodyParserRuleCall_6_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_synpred261574);
        ruleCompositeBody();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: ( ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: ruleSubComponentDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_synpred322467);
        ruleSubComponentDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: ( ruleInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: ruleInterfaceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_synpred332497);
        ruleInterfaceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: ( ruleSubComponentCompositeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: ruleSubComponentCompositeBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentCompositeBodyParserRuleCall_5_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_synpred362706);
        ruleSubComponentCompositeBody();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( ( ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )
        int alt89=2;
        switch ( input.LA(1) ) {
        case 41:
            {
            int LA89_1 = input.LA(2);

            if ( (synpred36()) ) {
                alt89=1;
            }
            else if ( (true) ) {
                alt89=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )", 89, 1, input);

                throw nvae;
            }
            }
            break;
        case 20:
            {
            alt89=1;
            }
            break;
        case 16:
            {
            alt89=2;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: ruleSubComponentCompositeBody
                {
                pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_synpred372706);
                ruleSubComponentCompositeBody();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1642:8: ruleSubComponentPrimitiveBody
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentPrimitiveBodyParserRuleCall_5_0_1(), currentNode); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_synpred372725);
                ruleSubComponentPrimitiveBody();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: ( ruleCompositeReferenceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: ruleCompositeReferenceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_synpred503509);
        ruleCompositeReferenceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:2: ( rulePrimitiveReferenceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:2: rulePrimitiveReferenceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_synpred513539);
        rulePrimitiveReferenceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    public final boolean synpred33() {
        backtracking++;
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
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
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\1\4\1\16\1\4\2\uffff\1\16";
    static final String DFA2_maxS =
        "\1\4\1\63\1\4\2\uffff\1\63";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\24\uffff\1\2\17\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\24\uffff\1\2\17\uffff\1\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "176:1: (lv_importName_1_1= ruleFQN | lv_importName_1_2= ruleFULL_IMPORT_NAME )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x000002000019A000L});
        public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleImportDefinition240 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleImportDefinition263 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_ruleImportDefinition282 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleImportDefinition295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_ruleArchitectureDefinition391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_ruleArchitectureDefinition421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_ruleArchitectureDefinition451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_entryRulePrimitiveComponentDefinition486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveComponentDefinition496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveComponentDefinition542 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePrimitiveComponentDefinition561 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimitiveComponentDefinition585 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition606 = new BitSet(new long[]{0x030002E045020002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition627 = new BitSet(new long[]{0x030002E044020002L});
        public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition649 = new BitSet(new long[]{0x030002E040020002L});
        public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition662 = new BitSet(new long[]{0x030002E040040000L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition683 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePrimitiveComponentDefinition694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_rulePrimitiveComponentDefinition722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_entryRulePrimitiveDefinitionElement760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinitionElement770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rulePrimitiveDefinitionElement820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinitionElement850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinitionElement880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinitionElement910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_entryRuleComponentTypeDefinition945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentTypeDefinition955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleComponentTypeDefinition1001 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentTypeDefinition1012 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1033 = new BitSet(new long[]{0x0300020004020002L});
        public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1054 = new BitSet(new long[]{0x0300020000020002L});
        public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1067 = new BitSet(new long[]{0x0300020000040000L});
        public static final BitSet FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1088 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleComponentTypeDefinition1099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_ruleComponentTypeDefinition1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_entryRuleTypeReferenceDefinition1165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferenceDefinition1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleTypeReferenceDefinition1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_entryRuleTypeDefinitionElement1255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinitionElement1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleTypeDefinitionElement1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeComponentDefinition_in_entryRuleCompositeComponentDefinition1348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeComponentDefinition1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeComponentDefinition1404 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCompositeComponentDefinition1415 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1436 = new BitSet(new long[]{0x030002020D220002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1457 = new BitSet(new long[]{0x030002020D020002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1479 = new BitSet(new long[]{0x030002020C020002L});
        public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1501 = new BitSet(new long[]{0x0300020208020002L});
        public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition1514 = new BitSet(new long[]{0x0300020208040000L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1535 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList1657 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1679 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList1690 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1711 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList1805 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1827 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList1838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1859 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList1908 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rulePrimitiveReferencesList1953 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList1974 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveReferencesList1985 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2006 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCompositeReferencesList2089 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2110 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferencesList2121 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2142 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypeReferencesList2225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2246 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleTypeReferencesList2257 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2278 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2618 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSubComponentDefinition2629 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleComponentReference_in_ruleSubComponentDefinition2650 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSubComponentDefinition2661 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2678 = new BitSet(new long[]{0x0000020000110002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentDefinition2706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentDefinition2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentCompositeBody2823 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSubComponentCompositeBody2842 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSubComponentCompositeBody2865 = new BitSet(new long[]{0x0300020208040000L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleSubComponentCompositeBody2887 = new BitSet(new long[]{0x0300020208044000L});
        public static final BitSet FOLLOW_14_in_ruleSubComponentCompositeBody2898 = new BitSet(new long[]{0x0300020208040000L});
        public static final BitSet FOLLOW_18_in_ruleSubComponentCompositeBody2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentPrimitiveBody3004 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSubComponentPrimitiveBody3023 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSubComponentPrimitiveBody3046 = new BitSet(new long[]{0x030002E040040000L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_ruleSubComponentPrimitiveBody3068 = new BitSet(new long[]{0x030002E040044000L});
        public static final BitSet FOLLOW_14_in_ruleSubComponentPrimitiveBody3079 = new BitSet(new long[]{0x030002E040040000L});
        public static final BitSet FOLLOW_18_in_ruleSubComponentPrimitiveBody3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_entryRuleCompositeBody3129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeBody3139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeBody3185 = new BitSet(new long[]{0x0300020208004002L});
        public static final BitSet FOLLOW_14_in_ruleCompositeBody3196 = new BitSet(new long[]{0x0300020208000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_entryRulePrimitiveBody3235 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveBody3245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveBody3291 = new BitSet(new long[]{0x030002E040004002L});
        public static final BitSet FOLLOW_14_in_rulePrimitiveBody3302 = new BitSet(new long[]{0x030002E040000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_entryRuleTypeBody3341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBody3351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleTypeBody3397 = new BitSet(new long[]{0x0300020000004002L});
        public static final BitSet FOLLOW_14_in_ruleTypeBody3408 = new BitSet(new long[]{0x0300020000000002L});
        public static final BitSet FOLLOW_ruleComponentReference_in_entryRuleComponentReference3449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentReference3459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleComponentReference3509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_ruleComponentReference3539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleComponentReference3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3660 = new BitSet(new long[]{0x0000000001200002L});
        public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3671 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3692 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3703 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3724 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3736 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3749 = new BitSet(new long[]{0x00300C0000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3770 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3781 = new BitSet(new long[]{0x00300C0000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3802 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3908 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition3919 = new BitSet(new long[]{0x00300C0000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3940 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition3951 = new BitSet(new long[]{0x00300C0000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3972 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition3984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4075 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTemplateDefinition4090 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4149 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition4159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition4205 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAttributeDefinition4216 = new BitSet(new long[]{0x0007000000000010L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4237 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition4255 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeDefinition4271 = new BitSet(new long[]{0x00300C0000000130L});
        public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition4292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition4383 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleArgumentDefinition4398 = new BitSet(new long[]{0x00300C0000000130L});
        public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition4539 = new BitSet(new long[]{0x0300000000000000L});
        public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition4561 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleInterfaceDefinition4582 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition4593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition4610 = new BitSet(new long[]{0x00C0000080000002L});
        public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition4634 = new BitSet(new long[]{0x0000000100000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition4664 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition4688 = new BitSet(new long[]{0x00C0000000000002L});
        public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition4724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition4771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4817 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBindingDefinition4829 = new BitSet(new long[]{0x0000000400000010L});
        public static final BitSet FOLLOW_34_in_ruleBindingDefinition4840 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4863 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleBindingDefinition4879 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4896 = new BitSet(new long[]{0x0000001080000000L});
        public static final BitSet FOLLOW_31_in_ruleBindingDefinition4912 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition4929 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBindingDefinition4944 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleBindingDefinition4956 = new BitSet(new long[]{0x0000000400000010L});
        public static final BitSet FOLLOW_34_in_ruleBindingDefinition4967 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4990 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleBindingDefinition5006 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5023 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleBindingDefinition5039 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5056 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBindingDefinition5071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5166 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleDataDefinition5179 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDataDefinition5246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5339 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleImplementationDefinition5350 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier5446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier5488 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleTemplateSpecifier5503 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileC5570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PATH_in_ruleFileC5612 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleFileC5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName5676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileName5687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5727 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleFileName5746 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC5818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CODEC_in_ruleInlineCodeC5859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList5899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList5909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList5955 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList5976 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAnnotation6058 = new BitSet(new long[]{0x0000F00000000010L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation6079 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation6090 = new BitSet(new long[]{0x0000020000020130L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6111 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation6122 = new BitSet(new long[]{0x0000020000020130L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6143 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleAnnotation6155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement6273 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationElement6288 = new BitSet(new long[]{0x0000020000020120L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue6346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementValue6356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue6406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue6436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue6501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue6511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue6556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat6603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat6643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat6669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer6759 = new BitSet(new long[]{0x0000020000020120L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6780 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer6791 = new BitSet(new long[]{0x0000020000020120L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6812 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer6824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue6861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue6872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValue6912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleValue6945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue6978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleValue7004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleValue7028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7069 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType7080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleHexadecimalType7118 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType7133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleAnnotationType7228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAnnotationType7247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAnnotationType7266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAnnotationType7285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleAnnotationType7313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType7359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType7370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAttributeType7408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAttributeType7427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAttributeType7446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType7467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN7513 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFQN7524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7564 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleFQN7583 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7598 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7704 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleFULL_IMPORT_NAME7722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT7763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT7774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulesignedINT7813 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_53_in_rulesignedINT7832 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT7849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleContingency7906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleContingency7921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleRole7964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleRole7979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_synpred3391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_synpred4421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_synpred9683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_synpred11722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_synpred12820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred13850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_synpred14880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_synpred171088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_synpred191127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_synpred241535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_synpred261574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred322467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_synpred332497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_synpred362706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_synpred372706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_synpred372725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_synpred503509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_synpred513539 = new BitSet(new long[]{0x0000000000000002L});
    }


}