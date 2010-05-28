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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_CODEC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'abstract'", "'primitive'", "'{'", "'}'", "'type'", "'composite'", "'<'", "','", "'>'", "'('", "')'", "'extends'", "'contains'", "'as'", "'='", "'attribute'", "'['", "']'", "'[]'", "'binds'", "'this'", "'.'", "'to'", "'data'", "'nodata'", "'source'", "'conformsto'", "'@'", "'null'", "'0x'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'", "'STRUCT'", "'UNION'", "'ENUM'", "'.*'", "'+'", "'-'", "'optional'", "'mandatory'", "'provides'", "'requires'"
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
            case 42:
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

            if ( (LA4_0==42) ) {
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
                case 38:
                case 39:
                case 40:
                case 42:
                case 57:
                case 58:
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

                    if ( (LA8_0==30||(LA8_0>=38 && LA8_0<=40)||LA8_0==42||(LA8_0>=57 && LA8_0<=58)) ) {
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
            case 42:
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
            case 57:
            case 58:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 38:
            case 39:
                {
                alt10=3;
                }
                break;
            case 40:
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

            if ( (LA11_0==42) ) {
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
                case 42:
                case 57:
                case 58:
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

                    if ( (LA13_0==42||(LA13_0>=57 && LA13_0<=58)) ) {
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:817:1: ruleCompositeComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? ) ;
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
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:822:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'composite' ( (lv_name_2_0= ruleFQN ) ) ( (lv_templateSpecifiersList_3_0= ruleTemplateSpecifiersList ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? ( (lv_referencesList_5_0= ruleCompositeReferencesList ) )? ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:823:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:3: ( ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' ) | ( (lv_body_9_0= ruleCompositeBody ) ) )?
            int alt19=3;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt19=1;
                    }
                    break;
                case 27:
                case 34:
                case 42:
                case 57:
                case 58:
                    {
                    alt19=2;
                    }
                    break;
                case EOF:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred25()) ) {
                        alt19=2;
                    }
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:4: ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:4: ( '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:947:6: '{' ( (lv_body_7_0= ruleCompositeBody ) ) '}'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleCompositeComponentDefinition1514); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeComponentDefinitionAccess().getLeftCurlyBracketKeyword_6_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:951:1: ( (lv_body_7_0= ruleCompositeBody ) )
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

                    match(input,18,FollowSets000.FOLLOW_18_in_ruleCompositeComponentDefinition1545); if (failed) return current;
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
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1573);
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
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1611);
            iv_ruleTemplateSpecifiersList=ruleTemplateSpecifiersList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifiersList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1621); if (failed) return current;

            }

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
            match(input,21,FollowSets000.FOLLOW_21_in_ruleTemplateSpecifiersList1656); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1678);
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
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1055:4: ',' ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleTemplateSpecifiersList1689); if (failed) return current;
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
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1710);
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
            	    break loop20;
                }
            } while (true);


            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleTemplateSpecifiersList1723); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1759);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalArgumentsList1769); if (failed) return current;

            }

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
            match(input,24,FollowSets000.FOLLOW_24_in_ruleFormalArgumentsList1804); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1826);
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
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1138:4: ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleFormalArgumentsList1837); if (failed) return current;
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
            	    pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1858);
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
            	    break loop21;
                }
            } while (true);


            }

            match(input,25,FollowSets000.FOLLOW_25_in_ruleFormalArgumentsList1871); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList1907);
            iv_rulePrimitiveReferencesList=rulePrimitiveReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveReferencesList1917); if (failed) return current;

            }

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
            match(input,26,FollowSets000.FOLLOW_26_in_rulePrimitiveReferencesList1952); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList1973);
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
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1221:4: ',' ( (lv_references_3_0= rulePrimitiveReferenceDefinition ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveReferencesList1984); if (failed) return current;
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
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2005);
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
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2043);
            iv_ruleCompositeReferencesList=ruleCompositeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeReferencesList2053); if (failed) return current;

            }

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
            match(input,26,FollowSets000.FOLLOW_26_in_ruleCompositeReferencesList2088); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2109);
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
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1300:4: ',' ( (lv_references_3_0= ruleCompositeReferenceDefinition ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferencesList2120); if (failed) return current;
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
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2141);
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
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2179);
            iv_ruleTypeReferencesList=ruleTypeReferencesList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeReferencesList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReferencesList2189); if (failed) return current;

            }

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
            match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeReferencesList2224); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2245);
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
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1379:4: ',' ( (lv_references_3_0= ruleTypeReferenceDefinition ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleTypeReferencesList2256); if (failed) return current;
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
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2277);
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
            pushFollow(FollowSets000.FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2315);
            iv_ruleFormalArgument=ruleFormalArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormalArgument2325); if (failed) return current;

            }

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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFormalArgument2366); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2406);
            iv_ruleCompositeDefinitionElement=ruleCompositeDefinitionElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeDefinitionElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2416); if (failed) return current;

            }

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
            int alt25=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred31()) ) {
                    alt25=1;
                }
                else if ( (synpred32()) ) {
                    alt25=2;
                }
                else if ( (true) ) {
                    alt25=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1477:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt25=1;
                }
                break;
            case 57:
            case 58:
                {
                alt25=2;
                }
                break;
            case 34:
                {
                alt25=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1477:1: (this_SubComponentDefinition_0= ruleSubComponentDefinition | this_InterfaceDefinition_1= ruleInterfaceDefinition | this_BindingDefinition_2= ruleBindingDefinition )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: this_SubComponentDefinition_0= ruleSubComponentDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompositeDefinitionElementAccess().getSubComponentDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2466);
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
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2496);
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
                    pushFollow(FollowSets000.FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2526);
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
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2561);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentDefinition2571); if (failed) return current;

            }

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
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1539:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1539:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1540:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2617);
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruleSubComponentDefinition2628); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1566:1: ( (lv_referenceDefinition_2_0= ruleComponentReference ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1567:1: (lv_referenceDefinition_2_0= ruleComponentReference )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1567:1: (lv_referenceDefinition_2_0= ruleComponentReference )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1568:3: lv_referenceDefinition_2_0= ruleComponentReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getReferenceDefinitionComponentReferenceParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_ruleSubComponentDefinition2649);
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleSubComponentDefinition2660); if (failed) return current;
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubComponentDefinition2677); if (failed) return current;
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
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred36()) ) {
                    alt29=1;
                }
            }
            else if ( (LA29_0==16||LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )
                    int alt28=2;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        int LA28_1 = input.LA(2);

                        if ( (synpred35()) ) {
                            alt28=1;
                        }
                        else if ( (true) ) {
                            alt28=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )", 28, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 20:
                        {
                        alt28=1;
                        }
                        break;
                    case 16:
                        {
                        alt28=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1620:1: (lv_body_5_1= ruleSubComponentCompositeBody | lv_body_5_2= ruleSubComponentPrimitiveBody )", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: lv_body_5_1= ruleSubComponentCompositeBody
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentCompositeBodyParserRuleCall_5_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentDefinition2705);
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
                            pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentDefinition2724);
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
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2766);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2776); if (failed) return current;

            }

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
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1693:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentCompositeBody2822);
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
            match(input,20,FollowSets000.FOLLOW_20_in_ruleSubComponentCompositeBody2841); if (failed) return current;
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruleSubComponentCompositeBody2864); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1740:1: ( ( (lv_elements_3_0= ruleCompositeDefinitionElement ) ) ( ';' )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27||LA32_0==34||LA32_0==42||(LA32_0>=57 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
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
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_ruleSubComponentCompositeBody2886);
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
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==14) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1764:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleSubComponentCompositeBody2897); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSubComponentCompositeBodyAccess().getSemicolonKeyword_3_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleSubComponentCompositeBody2911); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2947);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2957); if (failed) return current;

            }

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
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1796:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1796:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1797:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleSubComponentPrimitiveBody3003);
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
            match(input,16,FollowSets000.FOLLOW_16_in_ruleSubComponentPrimitiveBody3022); if (failed) return current;
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruleSubComponentPrimitiveBody3045); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1844:1: ( ( (lv_elements_3_0= rulePrimitiveDefinitionElement ) ) ( ';' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30||(LA35_0>=38 && LA35_0<=40)||LA35_0==42||(LA35_0>=57 && LA35_0<=58)) ) {
                    alt35=1;
                }


                switch (alt35) {
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
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_ruleSubComponentPrimitiveBody3067);
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
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==14) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1868:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleSubComponentPrimitiveBody3078); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getSemicolonKeyword_3_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleSubComponentPrimitiveBody3092); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_entryRuleCompositeBody3128);
            iv_ruleCompositeBody=ruleCompositeBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeBody3138); if (failed) return current;

            }

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
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==27||LA37_0==34||LA37_0==42||(LA37_0>=57 && LA37_0<=58)) ) {
                    alt37=1;
                }


                switch (alt37) {
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
            	    pushFollow(FollowSets000.FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeBody3184);
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
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==14) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1923:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeBody3195); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getCompositeBodyAccess().getSemicolonKeyword_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveBody_in_entryRulePrimitiveBody3234);
            iv_rulePrimitiveBody=rulePrimitiveBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveBody3244); if (failed) return current;

            }

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
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30||(LA39_0>=38 && LA39_0<=40)||LA39_0==42||(LA39_0>=57 && LA39_0<=58)) ) {
                    alt39=1;
                }


                switch (alt39) {
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
            	    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveBody3290);
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
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==14) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1974:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_rulePrimitiveBody3301); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveBodyAccess().getSemicolonKeyword_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
            pushFollow(FollowSets000.FOLLOW_ruleTypeBody_in_entryRuleTypeBody3340);
            iv_ruleTypeBody=ruleTypeBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeBody3350); if (failed) return current;

            }

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
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==42||(LA41_0>=57 && LA41_0<=58)) ) {
                    alt41=1;
                }


                switch (alt41) {
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
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinitionElement_in_ruleTypeBody3396);
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
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==14) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2025:4: ';'
            	            {
            	            match(input,14,FollowSets000.FOLLOW_14_in_ruleTypeBody3407); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getTypeBodyAccess().getSemicolonKeyword_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
            pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_entryRuleComponentReference3448);
            iv_ruleComponentReference=ruleComponentReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComponentReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentReference3458); if (failed) return current;

            }

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
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred49()) ) {
                    alt42=1;
                }
                else if ( (synpred50()) ) {
                    alt42=2;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2054:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2054:1: (this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition | this_PrimitiveReferenceDefinition_1= rulePrimitiveReferenceDefinition | this_TypeReferenceDefinition_2= ruleTypeReferenceDefinition )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: this_CompositeReferenceDefinition_0= ruleCompositeReferenceDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getComponentReferenceAccess().getCompositeReferenceDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleComponentReference3508);
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
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_ruleComponentReference3538);
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
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleComponentReference3568);
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
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3603);
            iv_ruleCompositeReferenceDefinition=ruleCompositeReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompositeReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3613); if (failed) return current;

            }

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
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3659);
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
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2139:4: '<' ( (lv_templatesList_2_0= ruleTemplateDefinition ) ) ( ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) )* '>'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleCompositeReferenceDefinition3670); if (failed) return current;
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
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3691);
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
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==22) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2167:4: ',' ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferenceDefinition3702); if (failed) return current;
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
                    	    pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3723);
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
                    	    break loop43;
                        }
                    } while (true);

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleCompositeReferenceDefinition3735); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompositeReferenceDefinitionAccess().getGreaterThanSignKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2199:3: ( '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2199:5: '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* ')'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleCompositeReferenceDefinition3748); if (failed) return current;
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
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3769);
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
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2227:4: ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeReferenceDefinition3780); if (failed) return current;
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
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3801);
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
                    	    break loop45;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_ruleCompositeReferenceDefinition3813); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3851);
            iv_rulePrimitiveReferenceDefinition=rulePrimitiveReferenceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveReferenceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3861); if (failed) return current;

            }

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
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3907);
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
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2306:4: '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) ( ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* ')'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveReferenceDefinition3918); if (failed) return current;
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
                    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3939);
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
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==22) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2334:4: ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveReferenceDefinition3950); if (failed) return current;
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
                    	    pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3971);
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
                    	    break loop47;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_rulePrimitiveReferenceDefinition3983); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4021);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateDefinition4031); if (failed) return current;

            }

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
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==29) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateDefinition4074); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleTemplateDefinition4089); if (failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4112);
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
            pushFollow(FollowSets000.FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4148);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeDefinition4158); if (failed) return current;

            }

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
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2465:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2465:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2466:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition4204);
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

            match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeDefinition4215); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2492:1: ( (lv_type_2_0= ruleAttributeType ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=49 && LA51_0<=51)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==RULE_ID) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2493:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2493:1: (lv_type_2_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2494:3: lv_type_2_0= ruleAttributeType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4236);
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeDefinition4254); if (failed) return current;
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
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2540:4: '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeDefinition4270); if (failed) return current;
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
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleAttributeDefinition4291);
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
            pushFollow(FollowSets000.FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4329);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArgumentDefinition4339); if (failed) return current;

            }

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
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==29) ) {
                    alt53=1;
                }
                else if ( (LA53_1==EOF||LA53_1==22||LA53_1==25) ) {
                    alt53=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2591:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==RULE_INT||LA53_0==RULE_STRING||(LA53_0>=43 && LA53_0<=44)||(LA53_0>=53 && LA53_0<=54)) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2591:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) '=' ( (lv_argumentValue_2_0= ruleValue ) ) ) | ( (lv_argumentValue_3_0= ruleValue ) ) )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleArgumentDefinition4382); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleArgumentDefinition4397); if (failed) return current;
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
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleArgumentDefinition4418);
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
                    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleArgumentDefinition4446);
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
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4482);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition4492); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2685:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' ) | ( (lv_collection_8_0= '[]' ) ) )? ( (lv_contingency_9_0= ruleContingency ) )? ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token lv_collection_8_0=null;
        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_role_1_0 = null;

        AntlrDatatypeRuleToken lv_signature_2_0 = null;

        Enumerator lv_contingency_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2690:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' ) | ( (lv_collection_8_0= '[]' ) ) )? ( (lv_contingency_9_0= ruleContingency ) )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' ) | ( (lv_collection_8_0= '[]' ) ) )? ( (lv_contingency_9_0= ruleContingency ) )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' ) | ( (lv_collection_8_0= '[]' ) ) )? ( (lv_contingency_9_0= ruleContingency ) )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= ruleRole ) ) ( (lv_signature_2_0= ruleFQN ) )? 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' ) | ( (lv_collection_8_0= '[]' ) ) )? ( (lv_contingency_9_0= ruleContingency ) )?
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2692:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2693:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition4538);
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
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleInterfaceDefinition4560);
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
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2740:1: (lv_signature_2_0= ruleFQN )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2740:1: (lv_signature_2_0= ruleFQN )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2741:3: lv_signature_2_0= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getSignatureFQNParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleInterfaceDefinition4581);
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleInterfaceDefinition4592); if (failed) return current;
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInterfaceDefinition4609); if (failed) return current;
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:2: ( ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' ) | ( (lv_collection_8_0= '[]' ) ) )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            else if ( (LA57_0==33) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:3: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:3: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:4: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? ']'
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2791:4: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2792:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2792:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2793:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleInterfaceDefinition4634); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0_0(), "collection"); 
                          
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
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2813:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2813:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2814:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)input.LT(1);
                            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInterfaceDefinition4664); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_0_1_0(), "collectionsize"); 
                              		
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

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleInterfaceDefinition4680); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2841:6: ( (lv_collection_8_0= '[]' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2841:6: ( (lv_collection_8_0= '[]' ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2842:1: (lv_collection_8_0= '[]' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2842:1: (lv_collection_8_0= '[]' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2843:3: lv_collection_8_0= '[]'
                    {
                    lv_collection_8_0=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleInterfaceDefinition4705); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_5_1_0(), "collection"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "collection", true, "[]", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2862:4: ( (lv_contingency_9_0= ruleContingency ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=55 && LA58_0<=56)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2863:1: (lv_contingency_9_0= ruleContingency )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2863:1: (lv_contingency_9_0= ruleContingency )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2864:3: lv_contingency_9_0= ruleContingency
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getContingencyContingencyEnumRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleContingency_in_ruleInterfaceDefinition4741);
                    lv_contingency_9_0=ruleContingency();
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
                      	        		lv_contingency_9_0, 
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2894:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2895:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2896:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBindingDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4778);
            iv_ruleBindingDefinition=ruleBindingDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBindingDefinition4788); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) ) ;
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
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2908:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2909:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2909:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2909:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2909:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2910:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2910:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2911:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4834);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2933:3: ( 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2933:5: 'binds' ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) ) '.' ( (lv_interfaceSourceName_5_0= RULE_ID ) ) ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )? 'to' ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) ) '.' ( (lv_interfaceTargetName_13_0= RULE_ID ) ) ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )?
            {
            match(input,34,FollowSets000.FOLLOW_34_in_ruleBindingDefinition4846); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2937:1: ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2937:1: ( 'this' | ( (lv_interfaceSourceParentName_3_0= RULE_ID ) ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2937:3: 'this'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleBindingDefinition4857); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2942:6: ( (lv_interfaceSourceParentName_3_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2942:6: ( (lv_interfaceSourceParentName_3_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2943:1: (lv_interfaceSourceParentName_3_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2943:1: (lv_interfaceSourceParentName_3_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2944:3: lv_interfaceSourceParentName_3_0= RULE_ID
                    {
                    lv_interfaceSourceParentName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition4880); if (failed) return current;
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

            match(input,36,FollowSets000.FOLLOW_36_in_ruleBindingDefinition4896); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_1_2(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2970:1: ( (lv_interfaceSourceName_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2971:1: (lv_interfaceSourceName_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2971:1: (lv_interfaceSourceName_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2972:3: lv_interfaceSourceName_5_0= RULE_ID
            {
            lv_interfaceSourceName_5_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition4913); if (failed) return current;
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2994:2: ( '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2994:4: '[' ( (lv_interfaceSourceIndex_7_0= RULE_INT ) ) ']'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleBindingDefinition4929); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_1_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2998:1: ( (lv_interfaceSourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2999:1: (lv_interfaceSourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2999:1: (lv_interfaceSourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3000:3: lv_interfaceSourceIndex_7_0= RULE_INT
                    {
                    lv_interfaceSourceIndex_7_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBindingDefinition4946); if (failed) return current;
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

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleBindingDefinition4961); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_1_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,37,FollowSets000.FOLLOW_37_in_ruleBindingDefinition4973); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getToKeyword_1_5(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3030:1: ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3030:1: ( 'this' | ( (lv_interfaceTargetParentName_11_0= RULE_ID ) ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3030:3: 'this'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleBindingDefinition4984); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getThisKeyword_1_6_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3035:6: ( (lv_interfaceTargetParentName_11_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3035:6: ( (lv_interfaceTargetParentName_11_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3036:1: (lv_interfaceTargetParentName_11_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3036:1: (lv_interfaceTargetParentName_11_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3037:3: lv_interfaceTargetParentName_11_0= RULE_ID
                    {
                    lv_interfaceTargetParentName_11_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition5007); if (failed) return current;
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

            match(input,36,FollowSets000.FOLLOW_36_in_ruleBindingDefinition5023); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_1_7(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3063:1: ( (lv_interfaceTargetName_13_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3064:1: (lv_interfaceTargetName_13_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3064:1: (lv_interfaceTargetName_13_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3065:3: lv_interfaceTargetName_13_0= RULE_ID
            {
            lv_interfaceTargetName_13_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBindingDefinition5040); if (failed) return current;
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:2: ( '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3087:4: '[' ( (lv_interfaceTargetIndex_15_0= RULE_INT ) ) ']'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleBindingDefinition5056); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_1_9_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3091:1: ( (lv_interfaceTargetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3092:1: (lv_interfaceTargetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3092:1: (lv_interfaceTargetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3093:3: lv_interfaceTargetIndex_15_0= RULE_INT
                    {
                    lv_interfaceTargetIndex_15_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBindingDefinition5073); if (failed) return current;
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

                    match(input,32,FollowSets000.FOLLOW_32_in_ruleBindingDefinition5088); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3127:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3128:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3129:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDataDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5127);
            iv_ruleDataDefinition=ruleDataDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataDefinition5137); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3136:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3141:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3142:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3142:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3142:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3142:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3143:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3143:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3144:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5183);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:3: ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==38) ) {
                alt66=1;
            }
            else if ( (LA66_0==39) ) {
                alt66=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3166:3: ( ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) | 'nodata' )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:4: ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:4: ( 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:6: 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleDataDefinition5196); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDataDefinitionAccess().getDataKeyword_1_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3170:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
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
                            new NoViableAltException("3170:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3170:2: ( (lv_fileC_2_0= ruleFileC ) )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3170:2: ( (lv_fileC_2_0= ruleFileC ) )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3171:1: (lv_fileC_2_0= ruleFileC )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3171:1: (lv_fileC_2_0= ruleFileC )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3172:3: lv_fileC_2_0= ruleFileC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_1_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleFileC_in_ruleDataDefinition5218);
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
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3195:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3195:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3196:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                            {
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3196:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3197:3: lv_inlineCcode_3_0= ruleInlineCodeC
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_1_0_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5245);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:7: 'nodata'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleDataDefinition5263); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3232:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3233:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3234:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplementationDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5300);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementationDefinition5310); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3241:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3246:6: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3247:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3247:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3247:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3247:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==42) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3248:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3248:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3249:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5356);
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

            match(input,40,FollowSets000.FOLLOW_40_in_ruleImplementationDefinition5367); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3275:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||LA68_0==RULE_PATH) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_CODEC) ) {
                alt68=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3275:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3275:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3275:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3276:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3276:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3277:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileC_in_ruleImplementationDefinition5389);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3300:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3300:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3301:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3301:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3302:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5416);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3332:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3333:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3334:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplateSpecifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5453);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateSpecifier5463); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3341:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_reference_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3346:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3347:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3347:1: ( ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3347:2: ( (lv_name_0_0= RULE_ID ) ) 'conformsto' ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3347:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3348:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3348:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3349:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTemplateSpecifier5505); if (failed) return current;
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

            match(input,41,FollowSets000.FOLLOW_41_in_ruleTemplateSpecifier5520); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3375:1: ( (lv_reference_2_0= ruleTypeReferenceDefinition ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3376:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3376:1: (lv_reference_2_0= ruleTypeReferenceDefinition )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3377:3: lv_reference_2_0= ruleTypeReferenceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTemplateSpecifierAccess().getReferenceTypeReferenceDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5541);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3407:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3408:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3409:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileCRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileC_in_entryRuleFileC5577);
            iv_ruleFileC=ruleFileC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileC5587); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3416:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        Token lv_directory_0_0=null;
        AntlrDatatypeRuleToken lv_fileName_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3421:6: ( ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3422:1: ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3422:1: ( ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3422:2: ( (lv_directory_0_0= RULE_PATH ) )? ( (lv_fileName_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3422:2: ( (lv_directory_0_0= RULE_PATH ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_PATH) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3423:1: (lv_directory_0_0= RULE_PATH )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3423:1: (lv_directory_0_0= RULE_PATH )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3424:3: lv_directory_0_0= RULE_PATH
                    {
                    lv_directory_0_0=(Token)input.LT(1);
                    match(input,RULE_PATH,FollowSets000.FOLLOW_RULE_PATH_in_ruleFileC5629); if (failed) return current;
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3446:3: ( (lv_fileName_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3447:1: (lv_fileName_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3447:1: (lv_fileName_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3448:3: lv_fileName_1_0= ruleFileName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFileCAccess().getFileNameFileNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleFileC5656);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3478:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3479:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3480:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFileNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_entryRuleFileName5693);
            iv_ruleFileName=ruleFileName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileName5704); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3487:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3492:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3493:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3493:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3493:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFileName5744); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3500:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==36) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3501:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleFileName5763); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFileNameAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFileName5778); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3521:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3522:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3523:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInlineCodeCRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5825);
            iv_ruleInlineCodeC=ruleInlineCodeC();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineCodeC5835); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3530:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODEC ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3535:6: ( ( (lv_codeC_0_0= RULE_CODEC ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3536:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3536:1: ( (lv_codeC_0_0= RULE_CODEC ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3537:1: (lv_codeC_0_0= RULE_CODEC )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3537:1: (lv_codeC_0_0= RULE_CODEC )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3538:3: lv_codeC_0_0= RULE_CODEC
            {
            lv_codeC_0_0=(Token)input.LT(1);
            match(input,RULE_CODEC,FollowSets000.FOLLOW_RULE_CODEC_in_ruleInlineCodeC5876); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3568:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3569:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3570:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList5916);
            iv_ruleAnnotationsList=ruleAnnotationsList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList5926); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3577:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3582:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3583:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3583:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3583:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3583:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3584:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3584:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3585:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList5972);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3607:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==42) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3608:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3608:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3609:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList5993);
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
            	    break loop71;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3639:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3640:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3641:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation6030);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation6040); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3648:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3653:6: ( ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3654:1: ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3654:1: ( '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )? )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3654:3: '@' ( (lv_name_1_0= ruleAnnotationType ) ) ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )?
            {
            match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation6075); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3658:1: ( (lv_name_1_0= ruleAnnotationType ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:1: (lv_name_1_0= ruleAnnotationType )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3659:1: (lv_name_1_0= ruleAnnotationType )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3660:3: lv_name_1_0= ruleAnnotationType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getNameAnnotationTypeParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_ruleAnnotation6096);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3682:2: ( '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3682:4: '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* ')'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation6107); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3686:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3687:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3687:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3688:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_ruleAnnotation6128);
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

                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3710:2: ( ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==22) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3710:4: ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation6139); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3714:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3715:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3715:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3716:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_ruleAnnotation6160);
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
                    	    break loop72;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_ruleAnnotation6172); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3750:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3751:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3752:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationElementRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6210);
            iv_ruleAnnotationElement=ruleAnnotationElement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationElement6220); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3759:1: ruleAnnotationElement returns [EObject current=null] : ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_1_0=null;
        EObject lv_elementValue_0_0 = null;

        EObject lv_elementValue_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3764:6: ( ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3765:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3765:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT||LA74_0==RULE_STRING||LA74_0==17||LA74_0==42) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3765:1: ( ( (lv_elementValue_0_0= ruleElementValue ) ) | ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) ) )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3765:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3765:2: ( (lv_elementValue_0_0= ruleElementValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3766:1: (lv_elementValue_0_0= ruleElementValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3766:1: (lv_elementValue_0_0= ruleElementValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3767:3: lv_elementValue_0_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleAnnotationElement6266);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3790:6: ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3790:6: ( ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3790:7: ( (lv_elementName_1_0= RULE_ID ) ) '=' ( (lv_elementValue_3_0= ruleElementValue ) )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3790:7: ( (lv_elementName_1_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3791:1: (lv_elementName_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3791:1: (lv_elementName_1_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3792:3: lv_elementName_1_0= RULE_ID
                    {
                    lv_elementName_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationElement6290); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationElement6305); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_1_1(), null); 
                          
                    }
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3818:1: ( (lv_elementValue_3_0= ruleElementValue ) )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3819:1: (lv_elementValue_3_0= ruleElementValue )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3819:1: (lv_elementValue_3_0= ruleElementValue )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3820:3: lv_elementValue_3_0= ruleElementValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleAnnotationElement6326);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3850:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3851:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3852:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_entryRuleElementValue6363);
            iv_ruleElementValue=ruleElementValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementValue6373); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3859:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3864:6: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3865:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3865:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt75=1;
                }
                break;
            case 42:
                {
                alt75=2;
                }
                break;
            case 17:
                {
                alt75=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3865:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3866:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleElementValue6423);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3879:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleElementValue6453);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3892:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6483);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3911:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3912:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3913:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_entryRuleConstantValue6518);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantValue6528); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3920:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3925:6: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3926:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3926:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3927:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3927:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3928:3: lv_value_0_0= ruleConstantFormat
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantFormat_in_ruleConstantValue6573);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3958:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3959:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3960:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantFormatRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6609);
            iv_ruleConstantFormat=ruleConstantFormat();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantFormat6620); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3967:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3972:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3973:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3973:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_STRING) ) {
                alt76=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3973:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3973:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConstantFormat6660); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3981:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConstantFormat6686); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3996:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3997:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3998:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getElementValueArrayInitializerRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6731);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6741); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4005:1: ruleElementValueArrayInitializer returns [EObject current=null] : ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4010:6: ( ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4011:1: ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4011:1: ( '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4011:3: '{' ( (lv_values_1_0= ruleElementValue ) ) ( ',' ( (lv_values_3_0= ruleElementValue ) ) )* '}'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleElementValueArrayInitializer6776); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4015:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4016:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4016:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4017:3: lv_values_1_0= ruleElementValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6797);
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

            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4039:2: ( ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==22) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4039:4: ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleElementValueArrayInitializer6808); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4043:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4044:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4044:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4045:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6829);
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
            	    break loop77;
                }
            } while (true);

            match(input,18,FollowSets000.FOLLOW_18_in_ruleElementValueArrayInitializer6841); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4079:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4080:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4081:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue6878);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue6889); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4088:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4093:6: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4094:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4094:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt78=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt78=1;
                }
                break;
            case RULE_INT:
            case 53:
            case 54:
                {
                alt78=2;
                }
                break;
            case 44:
                {
                alt78=3;
                }
                break;
            case RULE_STRING:
                {
                alt78=4;
                }
                break;
            case 43:
                {
                alt78=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4094:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4094:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValue6929); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4103:5: this_signedINT_1= rulesignedINT
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleValue6962);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4115:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleHexadecimalType_in_ruleValue6995);
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
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4126:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleValue7021); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4135:2: kw= 'null'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleValue7045); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4148:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4149:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4150:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHexadecimalTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7086);
            iv_ruleHexadecimalType=ruleHexadecimalType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHexadecimalType7097); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4157:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4162:6: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4163:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4163:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4164:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,44,FollowSets000.FOLLOW_44_in_ruleHexadecimalType7135); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getHexadecimalTypeAccess().getXKeyword_0(), null); 
                  
            }
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleHexadecimalType7150); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4184:1: entryRuleAnnotationType returns [String current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final String entryRuleAnnotationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4185:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4186:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7196);
            iv_ruleAnnotationType=ruleAnnotationType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationType7207); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4193:1: ruleAnnotationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4198:6: ( (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4199:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4199:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt79=1;
                }
                break;
            case 46:
                {
                alt79=2;
                }
                break;
            case 47:
                {
                alt79=3;
                }
                break;
            case 48:
                {
                alt79=4;
                }
                break;
            case RULE_ID:
                {
                alt79=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4199:1: (kw= 'Override' | kw= 'Singleton' | kw= 'LDFlags' | kw= 'CFlags' | this_FQN_4= ruleFQN )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4200:2: kw= 'Override'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleAnnotationType7245); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getOverrideKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4207:2: kw= 'Singleton'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleAnnotationType7264); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getSingletonKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4214:2: kw= 'LDFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleAnnotationType7283); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getLDFlagsKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4221:2: kw= 'CFlags'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleAnnotationType7302); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAnnotationTypeAccess().getCFlagsKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4228:5: this_FQN_4= ruleFQN
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationTypeAccess().getFQNParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleAnnotationType7330);
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4246:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4247:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4248:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_entryRuleAttributeType7376);
            iv_ruleAttributeType=ruleAttributeType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeType7387); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4255:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4260:6: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4261:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4261:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt80=1;
                }
                break;
            case 50:
                {
                alt80=2;
                }
                break;
            case 51:
                {
                alt80=3;
                }
                break;
            case RULE_ID:
                {
                alt80=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4261:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4262:2: kw= 'STRUCT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleAttributeType7425); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4269:2: kw= 'UNION'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleAttributeType7444); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4276:2: kw= 'ENUM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleAttributeType7463); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAttributeTypeAccess().getENUMKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4282:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeType7484); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4297:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4298:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4299:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_entryRuleFQN7530);
            iv_ruleFQN=ruleFQN();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFQN7541); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4306:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4311:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4312:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4312:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4312:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN7581); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4319:1: (kw= '.' this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==36) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4320:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,36,FollowSets000.FOLLOW_36_in_ruleFQN7600); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFQN7615); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4340:1: entryRuleFULL_IMPORT_NAME returns [String current=null] : iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF ;
    public final String entryRuleFULL_IMPORT_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFULL_IMPORT_NAME = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4341:2: (iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4342:2: iv_ruleFULL_IMPORT_NAME= ruleFULL_IMPORT_NAME EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFULL_IMPORT_NAMERule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7663);
            iv_ruleFULL_IMPORT_NAME=ruleFULL_IMPORT_NAME();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFULL_IMPORT_NAME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7674); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4349:1: ruleFULL_IMPORT_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleFULL_IMPORT_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4354:6: ( (this_FQN_0= ruleFQN kw= '.*' ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4355:1: (this_FQN_0= ruleFQN kw= '.*' )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4355:1: (this_FQN_0= ruleFQN kw= '.*' )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4356:5: this_FQN_0= ruleFQN kw= '.*'
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getFULL_IMPORT_NAMEAccess().getFQNParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7721);
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
            match(input,52,FollowSets000.FOLLOW_52_in_ruleFULL_IMPORT_NAME7739); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4380:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4381:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4382:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT7780);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT7791); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4389:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4394:6: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4395:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4395:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4395:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4395:2: (kw= '+' | kw= '-' )?
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==53) ) {
                alt82=1;
            }
            else if ( (LA82_0==54) ) {
                alt82=2;
            }
            switch (alt82) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4396:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FollowSets000.FOLLOW_53_in_rulesignedINT7830); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4403:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FollowSets000.FOLLOW_54_in_rulesignedINT7849); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT7866); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4423:1: ruleContingency returns [Enumerator current=null] : ( ( 'optional' ) | ( 'mandatory' ) ) ;
    public final Enumerator ruleContingency() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4427:6: ( ( ( 'optional' ) | ( 'mandatory' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4428:1: ( ( 'optional' ) | ( 'mandatory' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4428:1: ( ( 'optional' ) | ( 'mandatory' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==55) ) {
                alt83=1;
            }
            else if ( (LA83_0==56) ) {
                alt83=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4428:1: ( ( 'optional' ) | ( 'mandatory' ) )", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4428:2: ( 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4428:2: ( 'optional' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4428:4: 'optional'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleContingency7923); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getContingencyAccess().getOptionalEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4434:6: ( 'mandatory' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4434:6: ( 'mandatory' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4434:8: 'mandatory'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleContingency7938); if (failed) return current;
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
    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4444:1: ruleRole returns [Enumerator current=null] : ( ( 'provides' ) | ( 'requires' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4448:6: ( ( ( 'provides' ) | ( 'requires' ) ) )
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4449:1: ( ( 'provides' ) | ( 'requires' ) )
            {
            // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4449:1: ( ( 'provides' ) | ( 'requires' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==57) ) {
                alt84=1;
            }
            else if ( (LA84_0==58) ) {
                alt84=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4449:1: ( ( 'provides' ) | ( 'requires' ) )", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4449:2: ( 'provides' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4449:2: ( 'provides' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4449:4: 'provides'
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleRole7981); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getRoleAccess().getProvidesEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4455:6: ( 'requires' )
                    {
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4455:6: ( 'requires' )
                    // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:4455:8: 'requires'
                    {
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleRole7996); if (failed) return current;
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

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
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
        pushFollow(FollowSets000.FOLLOW_ruleCompositeBody_in_synpred251573);
        ruleCompositeBody();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: ( ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:2: ruleSubComponentDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubComponentDefinition_in_synpred312466);
        ruleSubComponentDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: ( ruleInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: ruleInterfaceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_synpred322496);
        ruleInterfaceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: ( ruleSubComponentCompositeBody )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: ruleSubComponentCompositeBody
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentCompositeBodyParserRuleCall_5_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_synpred352705);
        ruleSubComponentCompositeBody();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( ( ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody ) ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody ) )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1619:1: ( ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody ) )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )
        {
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )
        int alt87=2;
        switch ( input.LA(1) ) {
        case 42:
            {
            int LA87_1 = input.LA(2);

            if ( (synpred35()) ) {
                alt87=1;
            }
            else if ( (true) ) {
                alt87=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )", 87, 1, input);

                throw nvae;
            }
            }
            break;
        case 20:
            {
            alt87=1;
            }
            break;
        case 16:
            {
            alt87=2;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1620:1: ( ruleSubComponentCompositeBody | ruleSubComponentPrimitiveBody )", 87, 0, input);

            throw nvae;
        }

        switch (alt87) {
            case 1 :
                // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:3: ruleSubComponentCompositeBody
                {
                pushFollow(FollowSets000.FOLLOW_ruleSubComponentCompositeBody_in_synpred362705);
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
                pushFollow(FollowSets000.FOLLOW_ruleSubComponentPrimitiveBody_in_synpred362724);
                ruleSubComponentPrimitiveBody();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: ( ruleCompositeReferenceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: ruleCompositeReferenceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompositeReferenceDefinition_in_synpred493508);
        ruleCompositeReferenceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:2: ( rulePrimitiveReferenceDefinition )
        // ../org.ow2.mindEd.adl.textual.model/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:2: rulePrimitiveReferenceDefinition
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrimitiveReferenceDefinition_in_synpred503538);
        rulePrimitiveReferenceDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
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
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
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
    public final boolean synpred31() {
        backtracking++;
        int start = input.mark();
        try {
            synpred31_fragment(); // can never throw exception
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
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
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
        "\1\4\1\64\1\4\2\uffff\1\64";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\4\25\uffff\1\2\17\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\25\uffff\1\2\17\uffff\1\3"
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
        public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x000004000019A000L});
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
        public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveComponentDefinition606 = new BitSet(new long[]{0x060005C045020002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveComponentDefinition627 = new BitSet(new long[]{0x060005C044020002L});
        public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_rulePrimitiveComponentDefinition649 = new BitSet(new long[]{0x060005C040020002L});
        public static final BitSet FOLLOW_17_in_rulePrimitiveComponentDefinition662 = new BitSet(new long[]{0x060005C040040000L});
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
        public static final BitSet FOLLOW_ruleFQN_in_ruleComponentTypeDefinition1033 = new BitSet(new long[]{0x0600040004020002L});
        public static final BitSet FOLLOW_ruleTypeReferencesList_in_ruleComponentTypeDefinition1054 = new BitSet(new long[]{0x0600040000020002L});
        public static final BitSet FOLLOW_17_in_ruleComponentTypeDefinition1067 = new BitSet(new long[]{0x0600040000040000L});
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
        public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeComponentDefinition1436 = new BitSet(new long[]{0x060004040D220002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_ruleCompositeComponentDefinition1457 = new BitSet(new long[]{0x060004040D020002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeComponentDefinition1479 = new BitSet(new long[]{0x060004040C020002L});
        public static final BitSet FOLLOW_ruleCompositeReferencesList_in_ruleCompositeComponentDefinition1501 = new BitSet(new long[]{0x0600040408020002L});
        public static final BitSet FOLLOW_17_in_ruleCompositeComponentDefinition1514 = new BitSet(new long[]{0x0600040408040000L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1535 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCompositeComponentDefinition1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_ruleCompositeComponentDefinition1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifiersList_in_entryRuleTemplateSpecifiersList1611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifiersList1621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTemplateSpecifiersList1656 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1678 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleTemplateSpecifiersList1689 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateSpecifiersList1710 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleTemplateSpecifiersList1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList1759 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFormalArgumentsList1804 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1826 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleFormalArgumentsList1837 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList1858 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleFormalArgumentsList1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferencesList_in_entryRulePrimitiveReferencesList1907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferencesList1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rulePrimitiveReferencesList1952 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList1973 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveReferencesList1984 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_rulePrimitiveReferencesList2005 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleCompositeReferencesList_in_entryRuleCompositeReferencesList2043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferencesList2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCompositeReferencesList2088 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2109 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferencesList2120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleCompositeReferencesList2141 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleTypeReferencesList_in_entryRuleTypeReferencesList2179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReferencesList2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypeReferencesList2224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2245 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleTypeReferencesList2256 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTypeReferencesList2277 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument2315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument2325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_entryRuleCompositeDefinitionElement2406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinitionElement2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinitionElement2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleCompositeDefinitionElement2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinitionElement2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2617 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSubComponentDefinition2628 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleComponentReference_in_ruleSubComponentDefinition2649 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSubComponentDefinition2660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2677 = new BitSet(new long[]{0x0000040000110002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentDefinition2705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentDefinition2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2766 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentCompositeBody2822 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSubComponentCompositeBody2841 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSubComponentCompositeBody2864 = new BitSet(new long[]{0x0600040408040000L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleSubComponentCompositeBody2886 = new BitSet(new long[]{0x0600040408044000L});
        public static final BitSet FOLLOW_14_in_ruleSubComponentCompositeBody2897 = new BitSet(new long[]{0x0600040408040000L});
        public static final BitSet FOLLOW_18_in_ruleSubComponentCompositeBody2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody2947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentPrimitiveBody3003 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSubComponentPrimitiveBody3022 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSubComponentPrimitiveBody3045 = new BitSet(new long[]{0x060005C040040000L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_ruleSubComponentPrimitiveBody3067 = new BitSet(new long[]{0x060005C040044000L});
        public static final BitSet FOLLOW_14_in_ruleSubComponentPrimitiveBody3078 = new BitSet(new long[]{0x060005C040040000L});
        public static final BitSet FOLLOW_18_in_ruleSubComponentPrimitiveBody3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_entryRuleCompositeBody3128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeBody3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeDefinitionElement_in_ruleCompositeBody3184 = new BitSet(new long[]{0x0600040408004002L});
        public static final BitSet FOLLOW_14_in_ruleCompositeBody3195 = new BitSet(new long[]{0x0600040408000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_entryRulePrimitiveBody3234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveBody3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDefinitionElement_in_rulePrimitiveBody3290 = new BitSet(new long[]{0x060005C040004002L});
        public static final BitSet FOLLOW_14_in_rulePrimitiveBody3301 = new BitSet(new long[]{0x060005C040000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_entryRuleTypeBody3340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeBody3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinitionElement_in_ruleTypeBody3396 = new BitSet(new long[]{0x0600040000004002L});
        public static final BitSet FOLLOW_14_in_ruleTypeBody3407 = new BitSet(new long[]{0x0600040000000002L});
        public static final BitSet FOLLOW_ruleComponentReference_in_entryRuleComponentReference3448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentReference3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleComponentReference3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_ruleComponentReference3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleComponentReference3568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_entryRuleCompositeReferenceDefinition3603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeReferenceDefinition3613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleCompositeReferenceDefinition3659 = new BitSet(new long[]{0x0000000001200002L});
        public static final BitSet FOLLOW_21_in_ruleCompositeReferenceDefinition3670 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3691 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3702 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleCompositeReferenceDefinition3723 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleCompositeReferenceDefinition3735 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCompositeReferenceDefinition3748 = new BitSet(new long[]{0x0060180000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3769 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeReferenceDefinition3780 = new BitSet(new long[]{0x0060180000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeReferenceDefinition3801 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleCompositeReferenceDefinition3813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_entryRulePrimitiveReferenceDefinition3851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveReferenceDefinition3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_rulePrimitiveReferenceDefinition3907 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveReferenceDefinition3918 = new BitSet(new long[]{0x0060180000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3939 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveReferenceDefinition3950 = new BitSet(new long[]{0x0060180000000130L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveReferenceDefinition3971 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_rulePrimitiveReferenceDefinition3983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition4021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateDefinition4074 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTemplateDefinition4089 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_ruleTemplateDefinition4112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition4148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition4158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition4204 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAttributeDefinition4215 = new BitSet(new long[]{0x000E000000000010L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition4236 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition4254 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeDefinition4270 = new BitSet(new long[]{0x0060180000000130L});
        public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition4291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition4329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition4339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition4382 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleArgumentDefinition4397 = new BitSet(new long[]{0x0060180000000130L});
        public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition4446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition4482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition4492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition4538 = new BitSet(new long[]{0x0600000000000000L});
        public static final BitSet FOLLOW_ruleRole_in_ruleInterfaceDefinition4560 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleInterfaceDefinition4581 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition4592 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDefinition4609 = new BitSet(new long[]{0x0180000280000002L});
        public static final BitSet FOLLOW_31_in_ruleInterfaceDefinition4634 = new BitSet(new long[]{0x0000000100000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInterfaceDefinition4664 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInterfaceDefinition4680 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInterfaceDefinition4705 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_ruleContingency_in_ruleInterfaceDefinition4741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition4788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4834 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBindingDefinition4846 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_35_in_ruleBindingDefinition4857 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4880 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleBindingDefinition4896 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4913 = new BitSet(new long[]{0x0000002080000000L});
        public static final BitSet FOLLOW_31_in_ruleBindingDefinition4929 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition4946 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBindingDefinition4961 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBindingDefinition4973 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_35_in_ruleBindingDefinition4984 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5007 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleBindingDefinition5023 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition5040 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleBindingDefinition5056 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition5073 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBindingDefinition5088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5183 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_38_in_ruleDataDefinition5196 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDataDefinition5263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5356 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleImplementationDefinition5367 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5453 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier5463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier5505 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTemplateSpecifier5520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeReferenceDefinition_in_ruleTemplateSpecifier5541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5577 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileC5587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PATH_in_ruleFileC5629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleFileC5656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName5693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileName5704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5744 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleFileName5763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFileName5778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC5825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC5835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CODEC_in_ruleInlineCodeC5876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList5916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList5926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList5972 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList5993 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6030 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation6075 = new BitSet(new long[]{0x0001E00000000010L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnotation6096 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation6107 = new BitSet(new long[]{0x0000040000020130L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6128 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation6139 = new BitSet(new long[]{0x0000040000020130L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6160 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_25_in_ruleAnnotation6172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement6290 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationElement6305 = new BitSet(new long[]{0x0000040000020120L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement6326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue6363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementValue6373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue6423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue6453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue6483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue6518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue6528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue6573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat6609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat6620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat6660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer6731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer6741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleElementValueArrayInitializer6776 = new BitSet(new long[]{0x0000040000020120L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6797 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer6808 = new BitSet(new long[]{0x0000040000020120L});
        public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer6829 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer6841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue6878 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue6889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValue6929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleValue6962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue6995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleValue7021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleValue7045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType7086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleHexadecimalType7135 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType7150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType7196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType7207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAnnotationType7245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAnnotationType7264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAnnotationType7283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAnnotationType7302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleAnnotationType7330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType7376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType7387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAttributeType7425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAttributeType7444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleAttributeType7463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType7484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN7530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFQN7541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7581 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleFQN7600 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFQN7615 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleFULL_IMPORT_NAME_in_entryRuleFULL_IMPORT_NAME7663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFULL_IMPORT_NAME7674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFQN_in_ruleFULL_IMPORT_NAME7721 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleFULL_IMPORT_NAME7739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT7780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT7791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulesignedINT7830 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_54_in_rulesignedINT7849 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT7866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleContingency7923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleContingency7938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleRole7981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRole7996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentTypeDefinition_in_synpred3391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveComponentDefinition_in_synpred4421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_synpred9683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveBody_in_synpred11722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_synpred12820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred13850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataDefinition_in_synpred14880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_synpred171088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeBody_in_synpred191127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeBody_in_synpred251573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred312466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_synpred322496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_synpred352705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_synpred362705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_synpred362724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeReferenceDefinition_in_synpred493508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveReferenceDefinition_in_synpred503538 = new BitSet(new long[]{0x0000000000000002L});
    }


}