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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'\".*\"'", "'<.*>'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:82:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_type_1_0= ruleTypeDefinition ) ) | ( (lv_constant_2_0= ruleConstantDefinition ) ) )* ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_constant_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:87:6: ( ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_type_1_0= ruleTypeDefinition ) ) | ( (lv_constant_2_0= ruleConstantDefinition ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_type_1_0= ruleTypeDefinition ) ) | ( (lv_constant_2_0= ruleConstantDefinition ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_type_1_0= ruleTypeDefinition ) ) | ( (lv_constant_2_0= ruleConstantDefinition ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:2: ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_type_1_0= ruleTypeDefinition ) ) | ( (lv_constant_2_0= ruleConstantDefinition ) ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:88:2: ( (lv_includes_0_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:89:1: (lv_includes_0_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:89:1: (lv_includes_0_0= ruleIncludeDirective )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:90:3: lv_includes_0_0= ruleIncludeDirective
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncludeDirective_in_ruleIdtFile131);
            	    lv_includes_0_0=ruleIncludeDirective();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"includes",
            	    	        		lv_includes_0_0, 
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:112:3: ( ( (lv_type_1_0= ruleTypeDefinition ) ) | ( (lv_constant_2_0= ruleConstantDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||(LA2_0>=15 && LA2_0<=16)||LA2_0==18) ) {
                    alt2=1;
                }
                else if ( (LA2_0==27) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:112:4: ( (lv_type_1_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:112:4: ( (lv_type_1_0= ruleTypeDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:113:1: (lv_type_1_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:113:1: (lv_type_1_0= ruleTypeDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:114:3: lv_type_1_0= ruleTypeDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleIdtFile154);
            	    lv_type_1_0=ruleTypeDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"type",
            	    	        		lv_type_1_0, 
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
            	case 2 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:137:6: ( (lv_constant_2_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:137:6: ( (lv_constant_2_0= ruleConstantDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:138:1: (lv_constant_2_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:138:1: (lv_constant_2_0= ruleConstantDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:139:3: lv_constant_2_0= ruleConstantDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleIdtFile181);
            	    lv_constant_2_0=ruleConstantDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIdtFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"constant",
            	    	        		lv_constant_2_0, 
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

            	default :
            	    break loop2;
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
    // $ANTLR end ruleIdtFile


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:171:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:172:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:173:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition221);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition231); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:180:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:185:6: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:186:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:186:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:186:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:186:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
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
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("186:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:187:5: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition279);
                    this_TypedefSpecification_0=ruleTypedefSpecification();
                    _fsp--;

                     
                            current = this_TypedefSpecification_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:197:5: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition306);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;

                     
                            current = this_StructOrUnionSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:207:5: this_EnumSpecification_2= ruleEnumSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition333);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;

                     
                            current = this_EnumSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleTypeDefinition343); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:227:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:228:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:229:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypedefSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification379);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();
            _fsp--;

             current =iv_ruleTypedefSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification389); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:236:1: ruleTypedefSpecification returns [EObject current=null] : ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:241:6: ( ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:242:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:242:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:242:3: 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            match(input,12,FOLLOW_12_in_ruleTypedefSpecification424); 

                    createLeafNode(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:246:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:247:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:247:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:248:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification445);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:270:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:271:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:271:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:272:3: lv_dec_2_0= ruleDeclarators
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarators_in_ruleTypedefSpecification466);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:302:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:303:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:304:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification502);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();
            _fsp--;

             current =iv_ruleQualifiedTypeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification512); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:311:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:316:6: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:317:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:317:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:317:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:317:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=35 && LA4_0<=36)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:318:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:318:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:319:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification558);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:341:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:342:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:342:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:343:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification580);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:373:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:374:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:375:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification616);
            iv_ruleTypeSpecification=ruleTypeSpecification();
            _fsp--;

             current =iv_ruleTypeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification626); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:382:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:387:6: ( ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:388:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:388:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 15:
            case 16:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 30:
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
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("388:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:388:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:388:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:389:1: (lv_typeDefName_0_0= ruleTypedefName )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:389:1: (lv_typeDefName_0_0= ruleTypedefName )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:390:3: lv_typeDefName_0_0= ruleTypedefName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypedefName_in_ruleTypeSpecification672);
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:414:5: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification700);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;

                     
                            current = this_StructOrUnionSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:424:5: this_EnumSpecification_2= ruleEnumSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification727);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;

                     
                            current = this_EnumSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:433:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:433:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==30||(LA5_0>=37 && LA5_0<=55)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:434:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:434:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:435:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification753);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:465:1: entryRuleTypedefName returns [String current=null] : iv_ruleTypedefName= ruleTypedefName EOF ;
    public final String entryRuleTypedefName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypedefName = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:466:2: (iv_ruleTypedefName= ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:467:2: iv_ruleTypedefName= ruleTypedefName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypedefNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName791);
            iv_ruleTypedefName=ruleTypedefName();
            _fsp--;

             current =iv_ruleTypedefName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName802); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:474:1: ruleTypedefName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FullyQualifiedName_0= ruleFullyQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypedefName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullyQualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:479:6: (this_FullyQualifiedName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:481:5: this_FullyQualifiedName_0= ruleFullyQualifiedName
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName848);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:499:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:500:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:501:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification892);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();
            _fsp--;

             current =iv_ruleStructOrUnionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification902); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:508:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:513:6: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==13) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==11||(LA7_3>=21 && LA7_3<=22)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==13) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==16) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==13) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==11||(LA7_3>=21 && LA7_3<=22)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==13) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("514:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:515:5: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification949);
                    this_StructOrUnionDefinition_0=ruleStructOrUnionDefinition();
                    _fsp--;

                     
                            current = this_StructOrUnionDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:525:5: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification976);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:541:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:542:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:543:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1011);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();
            _fsp--;

             current =iv_ruleStructOrUnionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1021); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:550:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_id_1_0 = null;

        EObject lv_structMember_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:555:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:556:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:556:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:556:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:556:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:557:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:557:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:558:3: lv_struct_0_0= ruleStructOrUnion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1067);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:580:2: ( (lv_id_1_0= ruleIdentifier ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:581:1: (lv_id_1_0= ruleIdentifier )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:581:1: (lv_id_1_0= ruleIdentifier )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:582:3: lv_id_1_0= ruleIdentifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getIdIdentifierParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleStructOrUnionDefinition1088);
                    lv_id_1_0=ruleIdentifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructOrUnionDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_1_0, 
                    	        		"Identifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleStructOrUnionDefinition1099); 

                    createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:608:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=15 && LA9_0<=16)||LA9_0==18||LA9_0==30||(LA9_0>=35 && LA9_0<=55)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:609:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:609:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:610:3: lv_structMember_3_0= ruleStructMember
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1120);
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

            match(input,14,FOLLOW_14_in_ruleStructOrUnionDefinition1131); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:644:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:645:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:646:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructorUnionReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1167);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();
            _fsp--;

             current =iv_ruleStructorUnionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference1177); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:653:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_id_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:658:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:659:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:659:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:659:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= ruleIdentifier ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:659:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:660:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:660:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:661:3: lv_struct_0_0= ruleStructOrUnion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1223);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:683:2: ( (lv_id_1_0= ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:684:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:684:1: (lv_id_1_0= ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:685:3: lv_id_1_0= ruleIdentifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getIdIdentifierParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleStructorUnionReference1244);
            lv_id_1_0=ruleIdentifier();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructorUnionReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"Identifier", 
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
    // $ANTLR end ruleStructorUnionReference


    // $ANTLR start entryRuleStructOrUnion
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:715:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:716:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:717:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1281);
            iv_ruleStructOrUnion=ruleStructOrUnion();
            _fsp--;

             current =iv_ruleStructOrUnion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion1292); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:724:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:729:6: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:730:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:730:1: (kw= 'struct' | kw= 'union' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("730:1: (kw= 'struct' | kw= 'union' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:731:2: kw= 'struct'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleStructOrUnion1330); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getStructOrUnionAccess().getStructKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:738:2: kw= 'union'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleStructOrUnion1349); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:751:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:752:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:753:2: iv_ruleStructMember= ruleStructMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember1389);
            iv_ruleStructMember=ruleStructMember();
            _fsp--;

             current =iv_ruleStructMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember1399); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:760:1: ruleStructMember returns [EObject current=null] : ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        EObject lv_qualType_0_0 = null;

        EObject lv_dec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:765:6: ( ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:766:1: ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:766:1: ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:766:2: ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:766:2: ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:767:1: (lv_qualType_0_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:767:1: (lv_qualType_0_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:768:3: lv_qualType_0_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1445);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:790:2: ( (lv_dec_1_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:791:1: (lv_dec_1_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:791:1: (lv_dec_1_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:792:3: lv_dec_1_0= ruleDeclarators
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarators_in_ruleStructMember1466);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:814:2: ( ':' RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:814:4: ':' RULE_INT
                    {
                    match(input,17,FOLLOW_17_in_ruleStructMember1477); 

                            createLeafNode(grammarAccess.getStructMemberAccess().getColonKeyword_2_0(), null); 
                        
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStructMember1486); 
                     
                        createLeafNode(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1(), null); 
                        

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleStructMember1497); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:834:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:835:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:836:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1533);
            iv_ruleEnumSpecification=ruleEnumSpecification();
            _fsp--;

             current =iv_ruleEnumSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification1543); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:843:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:848:6: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:849:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:849:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==11||(LA12_2>=21 && LA12_2<=22)) ) {
                        alt12=2;
                    }
                    else if ( (LA12_2==13) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("849:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1==13) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("849:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("849:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:850:5: this_EnumDefinition_0= ruleEnumDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1590);
                    this_EnumDefinition_0=ruleEnumDefinition();
                    _fsp--;

                     
                            current = this_EnumDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:860:5: this_EnumReference_1= ruleEnumReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumReference_in_ruleEnumSpecification1617);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:876:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:877:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:878:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1652);
            iv_ruleEnumDefinition=ruleEnumDefinition();
            _fsp--;

             current =iv_ruleEnumDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition1662); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:885:1: ruleEnumDefinition returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_id_1_0 = null;

        EObject lv_enumMemberList_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:890:6: ( ( 'enum' ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:891:1: ( 'enum' ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:891:1: ( 'enum' ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:891:3: 'enum' ( (lv_id_1_0= ruleIdentifier ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}'
            {
            match(input,18,FOLLOW_18_in_ruleEnumDefinition1697); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:895:1: ( (lv_id_1_0= ruleIdentifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:896:1: (lv_id_1_0= ruleIdentifier )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:896:1: (lv_id_1_0= ruleIdentifier )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:897:3: lv_id_1_0= ruleIdentifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getIdIdentifierParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleEnumDefinition1718);
                    lv_id_1_0=ruleIdentifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_1_0, 
                    	        		"Identifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleEnumDefinition1729); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:923:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:924:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:924:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:925:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1750);
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

            match(input,14,FOLLOW_14_in_ruleEnumDefinition1760); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:959:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:960:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:961:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference1796);
            iv_ruleEnumReference=ruleEnumReference();
            _fsp--;

             current =iv_ruleEnumReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference1806); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:968:1: ruleEnumReference returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject lv_id_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:973:6: ( ( 'enum' ( (lv_id_1_0= ruleIdentifier ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:974:1: ( 'enum' ( (lv_id_1_0= ruleIdentifier ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:974:1: ( 'enum' ( (lv_id_1_0= ruleIdentifier ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:974:3: 'enum' ( (lv_id_1_0= ruleIdentifier ) )
            {
            match(input,18,FOLLOW_18_in_ruleEnumReference1841); 

                    createLeafNode(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:978:1: ( (lv_id_1_0= ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:979:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:979:1: (lv_id_1_0= ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:980:3: lv_id_1_0= ruleIdentifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumReferenceAccess().getIdIdentifierParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleEnumReference1862);
            lv_id_1_0=ruleIdentifier();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"Identifier", 
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
    // $ANTLR end ruleEnumReference


    // $ANTLR start entryRuleEnumMemberList
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1010:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1011:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1012:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumMemberListRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1898);
            iv_ruleEnumMemberList=ruleEnumMemberList();
            _fsp--;

             current =iv_ruleEnumMemberList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList1908); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1019:1: ruleEnumMemberList returns [EObject current=null] : (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject this_EnumMember_0 = null;

        EObject lv_enumMember_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1024:6: ( (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1025:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1025:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1026:5: this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList1955);
            this_EnumMember_0=ruleEnumMember();
            _fsp--;

             
                    current = this_EnumMember_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1034:1: ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1034:3: ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleEnumMemberList1965); 

            	            createLeafNode(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1038:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1039:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1039:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1040:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList1986);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1070:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1071:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1072:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember2024);
            iv_ruleEnumMember=ruleEnumMember();
            _fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember2034); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1079:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_id_0_0= ruleIdentifier ) ) ( '=' RULE_INT )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject lv_id_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1084:6: ( ( ( (lv_id_0_0= ruleIdentifier ) ) ( '=' RULE_INT )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1085:1: ( ( (lv_id_0_0= ruleIdentifier ) ) ( '=' RULE_INT )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1085:1: ( ( (lv_id_0_0= ruleIdentifier ) ) ( '=' RULE_INT )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1085:2: ( (lv_id_0_0= ruleIdentifier ) ) ( '=' RULE_INT )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1085:2: ( (lv_id_0_0= ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1086:1: (lv_id_0_0= ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1086:1: (lv_id_0_0= ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1087:3: lv_id_0_0= ruleIdentifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getIdIdentifierParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleEnumMember2080);
            lv_id_0_0=ruleIdentifier();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumMemberRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"Identifier", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1109:2: ( '=' RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1109:4: '=' RULE_INT
                    {
                    match(input,20,FOLLOW_20_in_ruleEnumMember2091); 

                            createLeafNode(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0(), null); 
                        
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumMember2100); 
                     
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1125:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1126:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1127:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaratorsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators2137);
            iv_ruleDeclarators=ruleDeclarators();
            _fsp--;

             current =iv_ruleDeclarators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators2147); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1134:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1139:6: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1140:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1140:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1140:2: ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1140:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1141:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1141:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1142:3: lv_dec_0_0= ruleDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2193);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1164:2: ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1164:4: ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleDeclarators2204); 

            	            createLeafNode(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1168:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1169:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1169:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1170:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2225);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1200:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1201:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1202:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator2263);
            iv_ruleDeclarator=ruleDeclarator();
            _fsp--;

             current =iv_ruleDeclarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator2273); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1209:1: ruleDeclarator returns [EObject current=null] : ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_1_0 = null;

        EObject lv_dc_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1214:6: ( ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1215:1: ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1215:1: ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1215:2: ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1215:2: ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1215:4: '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )*
            	    {
            	    match(input,21,FOLLOW_21_in_ruleDeclarator2309); 

            	            createLeafNode(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1219:1: ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( ((LA17_0>=35 && LA17_0<=36)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1220:1: (lv_typeQualifier_1_0= ruleTypeQualifier )
            	    	    {
            	    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1220:1: (lv_typeQualifier_1_0= ruleTypeQualifier )
            	    	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1221:3: lv_typeQualifier_1_0= ruleTypeQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleDeclarator2330);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1243:5: ( (lv_dc_2_0= ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1244:1: (lv_dc_2_0= ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1244:1: (lv_dc_2_0= ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1245:3: lv_dc_2_0= ruleDirectDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2354);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1275:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1276:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1277:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectDeclaratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2390);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();
            _fsp--;

             current =iv_ruleDirectDeclarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator2400); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1284:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_id_0_0 = null;

        EObject this_Declarator_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1289:6: ( ( ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1290:1: ( ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1290:1: ( ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1290:2: ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )*
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1290:2: ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==22) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1290:2: ( ( (lv_id_0_0= ruleIdentifier ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1290:3: ( (lv_id_0_0= ruleIdentifier ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1290:3: ( (lv_id_0_0= ruleIdentifier ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1291:1: (lv_id_0_0= ruleIdentifier )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1291:1: (lv_id_0_0= ruleIdentifier )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1292:3: lv_id_0_0= ruleIdentifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getIdIdentifierParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleDirectDeclarator2447);
                    lv_id_0_0=ruleIdentifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDirectDeclaratorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_0_0, 
                    	        		"Identifier", 
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
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1315:6: ( '(' this_Declarator_2= ruleDeclarator ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1315:6: ( '(' this_Declarator_2= ruleDeclarator ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1315:8: '(' this_Declarator_2= ruleDeclarator ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleDirectDeclarator2464); 

                            createLeafNode(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2486);
                    this_Declarator_2=ruleDeclarator();
                    _fsp--;

                     
                            current = this_Declarator_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleDirectDeclarator2495); 

                            createLeafNode(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1332:3: ( ruleArraySpecification )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1332:4: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2507);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1340:1: entryRuleArraySpecification returns [String current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final String entryRuleArraySpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1341:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1342:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArraySpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2538);
            iv_ruleArraySpecification=ruleArraySpecification();
            _fsp--;

             current =iv_ruleArraySpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification2549); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1349:1: ruleArraySpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_INT_1= RULE_INT kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArraySpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1354:6: ( (kw= '[' this_INT_1= RULE_INT kw= ']' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1355:1: (kw= '[' this_INT_1= RULE_INT kw= ']' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1355:1: (kw= '[' this_INT_1= RULE_INT kw= ']' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1356:2: kw= '[' this_INT_1= RULE_INT kw= ']'
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleArraySpecification2587); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0(), null); 
                
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArraySpecification2602); 

            		current.merge(this_INT_1);
                
             
                createLeafNode(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1(), null); 
                
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleArraySpecification2620); 

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


    // $ANTLR start entryRuleIdentifier
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1382:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1383:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1384:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIdentifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier2660);
            iv_ruleIdentifier=ruleIdentifier();
            _fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier2670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIdentifier


    // $ANTLR start ruleIdentifier
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1391:1: ruleIdentifier returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1396:6: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1397:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1397:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1398:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1398:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1399:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier2711); 

            			createLeafNode(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIdentifierRule().getType().getClassifier());
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
    // $ANTLR end ruleIdentifier


    // $ANTLR start entryRuleFullyQualifiedName
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1429:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1430:2: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1431:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName2752);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;

             current =iv_ruleFullyQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName2763); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1438:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1443:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1444:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1444:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1444:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName2803); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1451:1: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1452:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,26,FOLLOW_26_in_ruleFullyQualifiedName2822); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName2837); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1472:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1473:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1474:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition2884);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition2894); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1481:1: ruleConstantDefinition returns [EObject current=null] : ( '#define' ( (lv_id_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_id_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1486:6: ( ( '#define' ( (lv_id_1_0= ruleIdentifier ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1487:1: ( '#define' ( (lv_id_1_0= ruleIdentifier ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1487:1: ( '#define' ( (lv_id_1_0= ruleIdentifier ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1487:3: '#define' ( (lv_id_1_0= ruleIdentifier ) )
            {
            match(input,27,FOLLOW_27_in_ruleConstantDefinition2929); 

                    createLeafNode(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1491:1: ( (lv_id_1_0= ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1492:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1492:1: (lv_id_1_0= ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1493:3: lv_id_1_0= ruleIdentifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantDefinitionAccess().getIdIdentifierParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleConstantDefinition2950);
            lv_id_1_0=ruleIdentifier();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"Identifier", 
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
    // $ANTLR end ruleConstantDefinition


    // $ANTLR start entryRuleInterfaceDefinition
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1523:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1524:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1525:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition2986);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition2996); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1532:1: ruleInterfaceDefinition returns [EObject current=null] : ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fqn_2_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_4_0 = null;

        EObject lv_methodDef_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1537:6: ( ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1538:1: ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1538:1: ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1538:3: 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}'
            {
            match(input,28,FOLLOW_28_in_ruleInterfaceDefinition3031); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1542:1: ( 'unmanaged' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1542:3: 'unmanaged'
                    {
                    match(input,29,FOLLOW_29_in_ruleInterfaceDefinition3042); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1546:3: ( (lv_fqn_2_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1547:1: (lv_fqn_2_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1547:1: (lv_fqn_2_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1548:3: lv_fqn_2_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3065);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1570:2: ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1570:4: ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleInterfaceDefinition3076); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1574:1: ( (lv_fqn2_4_0= ruleFullyQualifiedName ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1575:1: (lv_fqn2_4_0= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1575:1: (lv_fqn2_4_0= ruleFullyQualifiedName )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1576:3: lv_fqn2_4_0= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3097);
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

            match(input,13,FOLLOW_13_in_ruleInterfaceDefinition3109); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1602:1: ( (lv_methodDef_6_0= ruleMethodDefinition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=15 && LA24_0<=16)||LA24_0==18||LA24_0==30||(LA24_0>=35 && LA24_0<=55)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1603:1: (lv_methodDef_6_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1603:1: (lv_methodDef_6_0= ruleMethodDefinition )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1604:3: lv_methodDef_6_0= ruleMethodDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3130);
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
            	    break loop24;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleInterfaceDefinition3141); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1638:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1639:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1640:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3177);
            iv_ruleMethodDefinition=ruleMethodDefinition();
            _fsp--;

             current =iv_ruleMethodDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition3187); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1647:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= ruleIdentifier ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiedTypeSpec_0_0 = null;

        EObject lv_id_1_0 = null;

        EObject lv_ParameterList_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1652:6: ( ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= ruleIdentifier ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1653:1: ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= ruleIdentifier ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1653:1: ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= ruleIdentifier ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1653:2: ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= ruleIdentifier ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';'
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1653:2: ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1654:1: (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1654:1: (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1655:3: lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3233);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1677:2: ( (lv_id_1_0= ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1678:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1678:1: (lv_id_1_0= ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1679:3: lv_id_1_0= ruleIdentifier
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getIdIdentifierParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleMethodDefinition3254);
            lv_id_1_0=ruleIdentifier();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMethodDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_1_0, 
            	        		"Identifier", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1701:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 15:
                case 16:
                case 18:
                case 35:
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
                    {
                    alt26=2;
                    }
                    break;
                case 30:
                    {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3==RULE_ID||(LA26_3>=21 && LA26_3<=22)||LA26_3==30||(LA26_3>=37 && LA26_3<=55)) ) {
                        alt26=2;
                    }
                    else if ( (LA26_3==23) ) {
                        alt26=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1701:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 26, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 23:
                    {
                    alt26=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1701:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 26, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1701:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1701:3: ( '(' ( 'void' )? ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1701:3: ( '(' ( 'void' )? ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1701:5: '(' ( 'void' )? ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleMethodDefinition3266); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1705:1: ( 'void' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==30) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1705:3: 'void'
                            {
                            match(input,30,FOLLOW_30_in_ruleMethodDefinition3277); 

                                    createLeafNode(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,23,FOLLOW_23_in_ruleMethodDefinition3289); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1714:6: ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1714:6: ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1714:8: '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleMethodDefinition3307); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1718:1: ( (lv_ParameterList_6_0= ruleParameterList ) )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1719:1: (lv_ParameterList_6_0= ruleParameterList )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1719:1: (lv_ParameterList_6_0= ruleParameterList )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1720:3: lv_ParameterList_6_0= ruleParameterList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleMethodDefinition3328);
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

                    match(input,23,FOLLOW_23_in_ruleMethodDefinition3338); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleMethodDefinition3350); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1758:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1759:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1760:2: iv_ruleParameterList= ruleParameterList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterListRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3386);
            iv_ruleParameterList=ruleParameterList();
            _fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3396); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1767:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1772:6: ( ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:2: ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )?
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1773:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1774:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1774:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1775:3: lv_param_0_0= ruleParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3442);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1797:2: ( ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID||(LA27_1>=15 && LA27_1<=16)||LA27_1==18||LA27_1==30||(LA27_1>=35 && LA27_1<=57)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1797:4: ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleParameterList3453); 

            	            createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1801:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1802:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1802:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1803:3: lv_params_2_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3474);
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
            	    break loop27;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1825:4: ( ',' '...' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1825:6: ',' '...'
                    {
                    match(input,19,FOLLOW_19_in_ruleParameterList3487); 

                            createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_2_0(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleParameterList3497); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1841:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1842:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1843:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3535);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3545); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1850:1: ruleParameter returns [EObject current=null] : ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_ParameterQualifier_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1855:6: ( ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1856:1: ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1856:1: ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1856:2: ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1856:2: ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=56 && LA29_0<=57)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1857:1: (lv_ParameterQualifier_0_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1857:1: (lv_ParameterQualifier_0_0= ruleParameterQualifier )
            	    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1858:3: lv_ParameterQualifier_0_0= ruleParameterQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterQualifier_in_ruleParameter3591);
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
            	    break loop29;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1880:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1881:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1881:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1882:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3613);
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

            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1904:2: ( (lv_dec_2_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1905:1: (lv_dec_2_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1905:1: (lv_dec_2_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1906:3: lv_dec_2_0= ruleDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarator_in_ruleParameter3634);
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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1936:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1937:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1938:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludeDirectiveRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3670);
            iv_ruleIncludeDirective=ruleIncludeDirective();
            _fsp--;

             current =iv_ruleIncludeDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective3680); 

            }

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1945:1: ruleIncludeDirective returns [EObject current=null] : ( '#include' ( (lv_path_1_0= ruleIncludePath ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_path_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1950:6: ( ( '#include' ( (lv_path_1_0= ruleIncludePath ) ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1951:1: ( '#include' ( (lv_path_1_0= ruleIncludePath ) ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1951:1: ( '#include' ( (lv_path_1_0= ruleIncludePath ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1951:3: '#include' ( (lv_path_1_0= ruleIncludePath ) )
            {
            match(input,32,FOLLOW_32_in_ruleIncludeDirective3715); 

                    createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1955:1: ( (lv_path_1_0= ruleIncludePath ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1956:1: (lv_path_1_0= ruleIncludePath )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1956:1: (lv_path_1_0= ruleIncludePath )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1957:3: lv_path_1_0= ruleIncludePath
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIncludeDirectiveAccess().getPathIncludePathParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIncludePath_in_ruleIncludeDirective3736);
            lv_path_1_0=ruleIncludePath();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIncludeDirectiveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_1_0, 
            	        		"IncludePath", 
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
    // $ANTLR end ruleIncludeDirective


    // $ANTLR start entryRuleIncludePath
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1987:1: entryRuleIncludePath returns [String current=null] : iv_ruleIncludePath= ruleIncludePath EOF ;
    public final String entryRuleIncludePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIncludePath = null;


        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1988:2: (iv_ruleIncludePath= ruleIncludePath EOF )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1989:2: iv_ruleIncludePath= ruleIncludePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludePathRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncludePath_in_entryRuleIncludePath3773);
            iv_ruleIncludePath=ruleIncludePath();
            _fsp--;

             current =iv_ruleIncludePath.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludePath3784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIncludePath


    // $ANTLR start ruleIncludePath
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:1996:1: ruleIncludePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\".*\"' | kw= '<.*>' ) ;
    public final AntlrDatatypeRuleToken ruleIncludePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2001:6: ( (kw= '\".*\"' | kw= '<.*>' ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2002:1: (kw= '\".*\"' | kw= '<.*>' )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2002:1: (kw= '\".*\"' | kw= '<.*>' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2002:1: (kw= '\".*\"' | kw= '<.*>' )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2003:2: kw= '\".*\"'
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleIncludePath3822); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getIncludePathAccess().getQuotationMarkFullStopAsteriskQuotationMarkKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2010:2: kw= '<.*>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleIncludePath3841); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getIncludePathAccess().getLessThanSignFullStopAsteriskGreaterThanSignKeyword_1(), null); 
                        

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
    // $ANTLR end ruleIncludePath


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2023:1: ruleTypeQualifier returns [Enumerator current=null] : ( ( 'const' ) | ( 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2027:6: ( ( ( 'const' ) | ( 'volatile' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2028:1: ( ( 'const' ) | ( 'volatile' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2028:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2028:1: ( ( 'const' ) | ( 'volatile' ) )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2028:2: ( 'const' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2028:2: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2028:4: 'const'
                    {
                    match(input,35,FOLLOW_35_in_ruleTypeQualifier3893); 

                            current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2034:6: ( 'volatile' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2034:6: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2034:8: 'volatile'
                    {
                    match(input,36,FOLLOW_36_in_ruleTypeQualifier3908); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2044:1: ruleTypeSpecifier returns [Enumerator current=null] : ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2048:6: ( ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2049:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2049:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt32=20;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case 38:
                {
                alt32=3;
                }
                break;
            case 39:
                {
                alt32=4;
                }
                break;
            case 40:
                {
                alt32=5;
                }
                break;
            case 41:
                {
                alt32=6;
                }
                break;
            case 42:
                {
                alt32=7;
                }
                break;
            case 43:
                {
                alt32=8;
                }
                break;
            case 44:
                {
                alt32=9;
                }
                break;
            case 45:
                {
                alt32=10;
                }
                break;
            case 46:
                {
                alt32=11;
                }
                break;
            case 47:
                {
                alt32=12;
                }
                break;
            case 48:
                {
                alt32=13;
                }
                break;
            case 49:
                {
                alt32=14;
                }
                break;
            case 50:
                {
                alt32=15;
                }
                break;
            case 51:
                {
                alt32=16;
                }
                break;
            case 52:
                {
                alt32=17;
                }
                break;
            case 53:
                {
                alt32=18;
                }
                break;
            case 54:
                {
                alt32=19;
                }
                break;
            case 55:
                {
                alt32=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2049:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2049:2: ( 'void' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2049:2: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2049:4: 'void'
                    {
                    match(input,30,FOLLOW_30_in_ruleTypeSpecifier3951); 

                            current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2055:6: ( 'char' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2055:6: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2055:8: 'char'
                    {
                    match(input,37,FOLLOW_37_in_ruleTypeSpecifier3966); 

                            current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2061:6: ( 'short' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2061:6: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2061:8: 'short'
                    {
                    match(input,38,FOLLOW_38_in_ruleTypeSpecifier3981); 

                            current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2067:6: ( 'int' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2067:6: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2067:8: 'int'
                    {
                    match(input,39,FOLLOW_39_in_ruleTypeSpecifier3996); 

                            current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2073:6: ( 'long' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2073:6: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2073:8: 'long'
                    {
                    match(input,40,FOLLOW_40_in_ruleTypeSpecifier4011); 

                            current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2079:6: ( 'float' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2079:6: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2079:8: 'float'
                    {
                    match(input,41,FOLLOW_41_in_ruleTypeSpecifier4026); 

                            current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2085:6: ( 'double' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2085:6: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2085:8: 'double'
                    {
                    match(input,42,FOLLOW_42_in_ruleTypeSpecifier4041); 

                            current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2091:6: ( 'signed' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2091:6: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2091:8: 'signed'
                    {
                    match(input,43,FOLLOW_43_in_ruleTypeSpecifier4056); 

                            current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2097:6: ( 'unsigned' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2097:6: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2097:8: 'unsigned'
                    {
                    match(input,44,FOLLOW_44_in_ruleTypeSpecifier4071); 

                            current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2103:6: ( 'string' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2103:6: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2103:8: 'string'
                    {
                    match(input,45,FOLLOW_45_in_ruleTypeSpecifier4086); 

                            current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2109:6: ( 'int8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2109:6: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2109:8: 'int8_t'
                    {
                    match(input,46,FOLLOW_46_in_ruleTypeSpecifier4101); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2115:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2115:6: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2115:8: 'uint8_t'
                    {
                    match(input,47,FOLLOW_47_in_ruleTypeSpecifier4116); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2121:6: ( 'int16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2121:6: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2121:8: 'int16_t'
                    {
                    match(input,48,FOLLOW_48_in_ruleTypeSpecifier4131); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2127:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2127:6: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2127:8: 'uint16_t'
                    {
                    match(input,49,FOLLOW_49_in_ruleTypeSpecifier4146); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2133:6: ( 'int32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2133:6: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2133:8: 'int32_t'
                    {
                    match(input,50,FOLLOW_50_in_ruleTypeSpecifier4161); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2139:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2139:6: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2139:8: 'uint32_t'
                    {
                    match(input,51,FOLLOW_51_in_ruleTypeSpecifier4176); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2145:6: ( 'int64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2145:6: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2145:8: 'int64_t'
                    {
                    match(input,52,FOLLOW_52_in_ruleTypeSpecifier4191); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2151:6: ( 'uint64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2151:6: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2151:8: 'uint64_t'
                    {
                    match(input,53,FOLLOW_53_in_ruleTypeSpecifier4206); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2157:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2157:6: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2157:8: 'intptr_t'
                    {
                    match(input,54,FOLLOW_54_in_ruleTypeSpecifier4221); 

                            current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2163:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2163:6: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2163:8: 'uintptr_t'
                    {
                    match(input,55,FOLLOW_55_in_ruleTypeSpecifier4236); 

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
    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2173:1: ruleParameterQualifier returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2177:6: ( ( ( 'in' ) | ( 'out' ) ) )
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2178:1: ( ( 'in' ) | ( 'out' ) )
            {
            // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2178:1: ( ( 'in' ) | ( 'out' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            else if ( (LA33_0==57) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2178:1: ( ( 'in' ) | ( 'out' ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2178:2: ( 'in' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2178:2: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2178:4: 'in'
                    {
                    match(input,56,FOLLOW_56_in_ruleParameterQualifier4279); 

                            current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2184:6: ( 'out' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2184:6: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.idt/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalIdt.g:2184:8: 'out'
                    {
                    match(input,57,FOLLOW_57_in_ruleParameterQualifier4294); 

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
    public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile131 = new BitSet(new long[]{0x0000000108059002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile154 = new BitSet(new long[]{0x0000000008059002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile181 = new BitSet(new long[]{0x0000000008059002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition279 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition306 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition333 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTypeDefinition343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTypedefSpecification424 = new BitSet(new long[]{0x00FFFFF840058020L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification445 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification558 = new BitSet(new long[]{0x00FFFFF840058020L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_ruleTypeSpecification672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification753 = new BitSet(new long[]{0x00FFFFE040000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1067 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleStructOrUnionDefinition1088 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructOrUnionDefinition1099 = new BitSet(new long[]{0x00FFFFF84005C020L});
    public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1120 = new BitSet(new long[]{0x00FFFFF84005C020L});
    public static final BitSet FOLLOW_14_in_ruleStructOrUnionDefinition1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleStructorUnionReference1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructOrUnion1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructOrUnion1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1445 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1466 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_17_in_ruleStructMember1477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStructMember1486 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStructMember1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumDefinition1697 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleEnumDefinition1718 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumDefinition1729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1750 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumDefinition1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumReference1841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleEnumReference1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList1955 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleEnumMemberList1965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList1986 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleEnumMember2080 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEnumMember2091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumMember2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2193 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleDeclarators2204 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2225 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDeclarator2309 = new BitSet(new long[]{0x0000001800600020L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleDeclarator2330 = new BitSet(new long[]{0x0000001800600020L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleDirectDeclarator2447 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22_in_ruleDirectDeclarator2464 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2486 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDirectDeclarator2495 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2507 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleArraySpecification2587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArraySpecification2602 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArraySpecification2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName2752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName2803 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFullyQualifiedName2822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName2837 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition2884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConstantDefinition2929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleConstantDefinition2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInterfaceDefinition3031 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_29_in_ruleInterfaceDefinition3042 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3065 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceDefinition3076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3097 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInterfaceDefinition3109 = new BitSet(new long[]{0x00FFFFF84005C020L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3130 = new BitSet(new long[]{0x00FFFFF84005C020L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceDefinition3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleMethodDefinition3254 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMethodDefinition3266 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_30_in_ruleMethodDefinition3277 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMethodDefinition3289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22_in_ruleMethodDefinition3307 = new BitSet(new long[]{0x03FFFFF840058020L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3328 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMethodDefinition3338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMethodDefinition3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3442 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParameterList3453 = new BitSet(new long[]{0x03FFFFF840058020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3474 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParameterList3487 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleParameterList3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter3591 = new BitSet(new long[]{0x03FFFFF840058020L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3613 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIncludeDirective3715 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleIncludePath_in_ruleIncludeDirective3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludePath_in_entryRuleIncludePath3773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludePath3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIncludePath3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIncludePath3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTypeQualifier3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeQualifier3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeSpecifier3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeSpecifier3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeSpecifier3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeSpecifier3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeSpecifier4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeSpecifier4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeSpecifier4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeSpecifier4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeSpecifier4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeSpecifier4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeSpecifier4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeSpecifier4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeSpecifier4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeSpecifier4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeSpecifier4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeSpecifier4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeSpecifier4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeSpecifier4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeSpecifier4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeSpecifier4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleParameterQualifier4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleParameterQualifier4294 = new BitSet(new long[]{0x0000000000000002L});

}