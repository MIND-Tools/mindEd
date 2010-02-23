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
import org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalItfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_INCLUDELIB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
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

        public InternalFractalItfParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g"; }



     	private FractalItfGrammarAccess grammarAccess;
     	
        public InternalFractalItfParser(TokenStream input, IAstFactory factory, FractalItfGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ItfFile";	
       	} 



    // $ANTLR start entryRuleItfFile
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:73:1: entryRuleItfFile returns [EObject current=null] : iv_ruleItfFile= ruleItfFile EOF ;
    public final EObject entryRuleItfFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItfFile = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:74:2: (iv_ruleItfFile= ruleItfFile EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:75:2: iv_ruleItfFile= ruleItfFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItfFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleItfFile_in_entryRuleItfFile75);
            iv_ruleItfFile=ruleItfFile();
            _fsp--;

             current =iv_ruleItfFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItfFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleItfFile


    // $ANTLR start ruleItfFile
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:82:1: ruleItfFile returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? ) ;
    public final EObject ruleItfFile() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_interface_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:87:6: ( ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:88:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:88:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:88:2: ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )?
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:88:2: ( (lv_includes_0_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:89:1: (lv_includes_0_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:89:1: (lv_includes_0_0= ruleIncludeDirective )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:90:3: lv_includes_0_0= ruleIncludeDirective
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncludeDirective_in_ruleItfFile131);
            	    lv_includes_0_0=ruleIncludeDirective();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getItfFileRule().getType().getClassifier());
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:112:3: ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }
                else if ( (LA2_0==13||(LA2_0>=16 && LA2_0<=17)||LA2_0==19) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:112:4: ( (lv_constant_1_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:112:4: ( (lv_constant_1_0= ruleConstantDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:113:1: (lv_constant_1_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:113:1: (lv_constant_1_0= ruleConstantDefinition )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:114:3: lv_constant_1_0= ruleConstantDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleItfFile154);
            	    lv_constant_1_0=ruleConstantDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getItfFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"constant",
            	    	        		lv_constant_1_0, 
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
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:137:6: ( (lv_type_2_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:137:6: ( (lv_type_2_0= ruleTypeDefinition ) )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:138:1: (lv_type_2_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:138:1: (lv_type_2_0= ruleTypeDefinition )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:139:3: lv_type_2_0= ruleTypeDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleItfFile181);
            	    lv_type_2_0=ruleTypeDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getItfFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"type",
            	    	        		lv_type_2_0, 
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:161:4: ( (lv_interface_3_0= ruleInterfaceDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:162:1: (lv_interface_3_0= ruleInterfaceDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:162:1: (lv_interface_3_0= ruleInterfaceDefinition )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:163:3: lv_interface_3_0= ruleInterfaceDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getInterfaceInterfaceDefinitionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_ruleItfFile204);
            lv_interface_3_0=ruleInterfaceDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getItfFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"interface",
            	        		lv_interface_3_0, 
            	        		"InterfaceDefinition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:185:2: ( ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:185:4: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleItfFile215); 

                            createLeafNode(grammarAccess.getItfFileAccess().getSemicolonKeyword_3(), null); 
                        

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
    // $ANTLR end ruleItfFile


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:197:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:198:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:199:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition253);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition263); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:206:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:211:6: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:212:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:212:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:212:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';'
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:212:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 16:
            case 17:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("212:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:213:5: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition311);
                    this_TypedefSpecification_0=ruleTypedefSpecification();
                    _fsp--;

                     
                            current = this_TypedefSpecification_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:223:5: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition338);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;

                     
                            current = this_StructOrUnionSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:233:5: this_EnumSpecification_2= ruleEnumSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition365);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;

                     
                            current = this_EnumSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleTypeDefinition375); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:253:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:254:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:255:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypedefSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification411);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();
            _fsp--;

             current =iv_ruleTypedefSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification421); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:262:1: ruleTypedefSpecification returns [EObject current=null] : ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:267:6: ( ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:268:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:268:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:268:3: 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            match(input,13,FOLLOW_13_in_ruleTypedefSpecification456); 

                    createLeafNode(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:272:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:273:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:273:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:274:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification477);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:296:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:297:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:297:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:298:3: lv_dec_2_0= ruleDeclarators
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarators_in_ruleTypedefSpecification498);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:328:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:329:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:330:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification534);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();
            _fsp--;

             current =iv_ruleQualifiedTypeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification544); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:337:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:342:6: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:343:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:343:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:343:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:343:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=34 && LA5_0<=35)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:344:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:344:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:345:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification590);
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
            	    break loop5;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:367:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:368:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:368:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:369:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification612);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:399:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:400:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:401:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification648);
            iv_ruleTypeSpecification=ruleTypeSpecification();
            _fsp--;

             current =iv_ruleTypeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification658); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:408:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:413:6: ( ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:414:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:414:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 16:
            case 17:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 31:
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
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("414:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:414:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:414:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:415:1: (lv_typeDefName_0_0= ruleTypedefName )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:415:1: (lv_typeDefName_0_0= ruleTypedefName )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:416:3: lv_typeDefName_0_0= ruleTypedefName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypedefName_in_ruleTypeSpecification704);
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
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:440:5: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification732);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();
                    _fsp--;

                     
                            current = this_StructOrUnionSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:450:5: this_EnumSpecification_2= ruleEnumSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification759);
                    this_EnumSpecification_2=ruleEnumSpecification();
                    _fsp--;

                     
                            current = this_EnumSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:459:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:459:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==31||(LA6_0>=36 && LA6_0<=54)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:460:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:460:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:461:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification785);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:491:1: entryRuleTypedefName returns [String current=null] : iv_ruleTypedefName= ruleTypedefName EOF ;
    public final String entryRuleTypedefName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypedefName = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:492:2: (iv_ruleTypedefName= ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:493:2: iv_ruleTypedefName= ruleTypedefName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypedefNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName823);
            iv_ruleTypedefName=ruleTypedefName();
            _fsp--;

             current =iv_ruleTypedefName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName834); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:500:1: ruleTypedefName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FullyQualifiedName_0= ruleFullyQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypedefName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullyQualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:505:6: (this_FullyQualifiedName_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:507:5: this_FullyQualifiedName_0= ruleFullyQualifiedName
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName880);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:525:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:526:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:527:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification924);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();
            _fsp--;

             current =iv_ruleStructOrUnionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification934); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:534:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:539:6: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==12||(LA8_3>=22 && LA8_3<=23)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==14) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==14) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==17) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==12||(LA8_3>=22 && LA8_3<=23)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==14) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_2==14) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("540:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:541:5: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification981);
                    this_StructOrUnionDefinition_0=ruleStructOrUnionDefinition();
                    _fsp--;

                     
                            current = this_StructOrUnionDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:551:5: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1008);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:567:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:568:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:569:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1043);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();
            _fsp--;

             current =iv_ruleStructOrUnionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1053); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:576:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:581:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:582:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:582:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:582:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}'
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:582:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:583:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:583:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:584:3: lv_struct_0_0= ruleStructOrUnion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1099);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:606:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:607:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:607:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:608:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1116); 

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

            match(input,14,FOLLOW_14_in_ruleStructOrUnionDefinition1132); 

                    createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:634:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=16 && LA10_0<=17)||LA10_0==19||LA10_0==31||(LA10_0>=34 && LA10_0<=54)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:635:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:635:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:636:3: lv_structMember_3_0= ruleStructMember
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1153);
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
            	    break loop10;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleStructOrUnionDefinition1164); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:670:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:671:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:672:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructorUnionReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1200);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();
            _fsp--;

             current =iv_ruleStructorUnionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference1210); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:679:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:684:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:685:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:685:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:685:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:685:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:686:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:686:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:687:3: lv_struct_0_0= ruleStructOrUnion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1256);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:709:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:710:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:710:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:711:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructorUnionReference1273); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:741:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:742:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:743:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructOrUnionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1315);
            iv_ruleStructOrUnion=ruleStructOrUnion();
            _fsp--;

             current =iv_ruleStructOrUnion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion1326); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:750:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:755:6: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:756:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:756:1: (kw= 'struct' | kw= 'union' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("756:1: (kw= 'struct' | kw= 'union' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:757:2: kw= 'struct'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleStructOrUnion1364); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getStructOrUnionAccess().getStructKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:764:2: kw= 'union'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleStructOrUnion1383); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:777:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:778:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:779:2: iv_ruleStructMember= ruleStructMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember1423);
            iv_ruleStructMember=ruleStructMember();
            _fsp--;

             current =iv_ruleStructMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember1433); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:786:1: ruleStructMember returns [EObject current=null] : ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        EObject lv_qualType_0_0 = null;

        EObject lv_dec_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:791:6: ( ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:792:1: ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:792:1: ( ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:792:2: ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_1_0= ruleDeclarators ) ) ( ':' RULE_INT )? ';'
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:792:2: ( (lv_qualType_0_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:793:1: (lv_qualType_0_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:793:1: (lv_qualType_0_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:794:3: lv_qualType_0_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1479);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:816:2: ( (lv_dec_1_0= ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:817:1: (lv_dec_1_0= ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:817:1: (lv_dec_1_0= ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:818:3: lv_dec_1_0= ruleDeclarators
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarators_in_ruleStructMember1500);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:840:2: ( ':' RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:840:4: ':' RULE_INT
                    {
                    match(input,18,FOLLOW_18_in_ruleStructMember1511); 

                            createLeafNode(grammarAccess.getStructMemberAccess().getColonKeyword_2_0(), null); 
                        
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStructMember1520); 
                     
                        createLeafNode(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleStructMember1531); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:860:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:861:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:862:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1567);
            iv_ruleEnumSpecification=ruleEnumSpecification();
            _fsp--;

             current =iv_ruleEnumSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification1577); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:869:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:874:6: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:875:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:875:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==EOF||LA13_2==RULE_ID||LA13_2==12||(LA13_2>=22 && LA13_2<=23)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==14) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("875:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==14) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("875:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("875:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:876:5: this_EnumDefinition_0= ruleEnumDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1624);
                    this_EnumDefinition_0=ruleEnumDefinition();
                    _fsp--;

                     
                            current = this_EnumDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:886:5: this_EnumReference_1= ruleEnumReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumReference_in_ruleEnumSpecification1651);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:902:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:903:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:904:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1686);
            iv_ruleEnumDefinition=ruleEnumDefinition();
            _fsp--;

             current =iv_ruleEnumDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition1696); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:911:1: ruleEnumDefinition returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_enumMemberList_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:916:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:917:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:917:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:917:3: 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}'
            {
            match(input,19,FOLLOW_19_in_ruleEnumDefinition1731); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:921:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:922:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:922:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:923:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDefinition1748); 

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

            match(input,14,FOLLOW_14_in_ruleEnumDefinition1764); 

                    createLeafNode(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:949:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:950:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:950:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:951:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1785);
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

            match(input,15,FOLLOW_15_in_ruleEnumDefinition1795); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:985:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:986:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:987:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference1831);
            iv_ruleEnumReference=ruleEnumReference();
            _fsp--;

             current =iv_ruleEnumReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference1841); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:994:1: ruleEnumReference returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:999:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1000:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1000:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1000:3: 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleEnumReference1876); 

                    createLeafNode(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1004:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1005:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1005:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1006:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumReference1893); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1036:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1037:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1038:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumMemberListRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1934);
            iv_ruleEnumMemberList=ruleEnumMemberList();
            _fsp--;

             current =iv_ruleEnumMemberList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList1944); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1045:1: ruleEnumMemberList returns [EObject current=null] : (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject this_EnumMember_0 = null;

        EObject lv_enumMember_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1050:6: ( (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1051:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1051:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1052:5: this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList1991);
            this_EnumMember_0=ruleEnumMember();
            _fsp--;

             
                    current = this_EnumMember_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1060:1: ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1060:3: ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleEnumMemberList2001); 

            	            createLeafNode(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1064:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1065:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1065:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1066:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumMemberList2022);
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
            	    break loop15;
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1096:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1097:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1098:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumMemberRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember2060);
            iv_ruleEnumMember=ruleEnumMember();
            _fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember2070); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1105:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1110:6: ( ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1111:1: ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1111:1: ( ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )? )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1111:2: ( (lv_id_0_0= RULE_ID ) ) ( '=' RULE_INT )?
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1111:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1112:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1112:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1113:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember2112); 

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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1135:2: ( '=' RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1135:4: '=' RULE_INT
                    {
                    match(input,21,FOLLOW_21_in_ruleEnumMember2128); 

                            createLeafNode(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0(), null); 
                        
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumMember2137); 
                     
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1151:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1152:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1153:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaratorsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators2174);
            iv_ruleDeclarators=ruleDeclarators();
            _fsp--;

             current =iv_ruleDeclarators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators2184); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1160:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1165:6: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1166:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1166:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1166:2: ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1166:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1167:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1167:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1168:3: lv_dec_0_0= ruleDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2230);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1190:2: ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1190:4: ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleDeclarators2241); 

            	            createLeafNode(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1194:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1195:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1195:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1196:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclarator_in_ruleDeclarators2262);
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
            	    break loop17;
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1226:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1227:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1228:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator2300);
            iv_ruleDeclarator=ruleDeclarator();
            _fsp--;

             current =iv_ruleDeclarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator2310); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1235:1: ruleDeclarator returns [EObject current=null] : ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_1_0 = null;

        EObject lv_dc_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1240:6: ( ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1241:1: ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1241:1: ( ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1241:2: ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )* ( (lv_dc_2_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1241:2: ( '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )* )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1241:4: '*' ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )*
            	    {
            	    match(input,22,FOLLOW_22_in_ruleDeclarator2346); 

            	            createLeafNode(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1245:1: ( (lv_typeQualifier_1_0= ruleTypeQualifier ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0>=34 && LA18_0<=35)) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1246:1: (lv_typeQualifier_1_0= ruleTypeQualifier )
            	    	    {
            	    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1246:1: (lv_typeQualifier_1_0= ruleTypeQualifier )
            	    	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1247:3: lv_typeQualifier_1_0= ruleTypeQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleTypeQualifier_in_ruleDeclarator2367);
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
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1269:5: ( (lv_dc_2_0= ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1270:1: (lv_dc_2_0= ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1270:1: (lv_dc_2_0= ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1271:3: lv_dc_2_0= ruleDirectDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2391);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1301:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1302:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1303:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectDeclaratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2427);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();
            _fsp--;

             current =iv_ruleDirectDeclarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator2437); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1310:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject this_Declarator_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1315:6: ( ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1316:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1316:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1316:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) ) ( ruleArraySpecification )*
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1316:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1316:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' this_Declarator_2= ruleDeclarator ')' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1316:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1316:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1317:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1317:1: (lv_id_0_0= RULE_ID )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1318:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectDeclarator2480); 

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
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1341:6: ( '(' this_Declarator_2= ruleDeclarator ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1341:6: ( '(' this_Declarator_2= ruleDeclarator ')' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1341:8: '(' this_Declarator_2= ruleDeclarator ')'
                    {
                    match(input,23,FOLLOW_23_in_ruleDirectDeclarator2502); 

                            createLeafNode(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2524);
                    this_Declarator_2=ruleDeclarator();
                    _fsp--;

                     
                            current = this_Declarator_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,24,FOLLOW_24_in_ruleDirectDeclarator2533); 

                            createLeafNode(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1358:3: ( ruleArraySpecification )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1358:4: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2545);
            	    ruleArraySpecification();
            	    _fsp--;


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
    // $ANTLR end ruleDirectDeclarator


    // $ANTLR start entryRuleArraySpecification
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1366:1: entryRuleArraySpecification returns [String current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final String entryRuleArraySpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1367:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1368:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArraySpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2576);
            iv_ruleArraySpecification=ruleArraySpecification();
            _fsp--;

             current =iv_ruleArraySpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification2587); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1375:1: ruleArraySpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArraySpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1380:6: ( (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1381:1: (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1381:1: (kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1382:2: kw= '[' (this_INT_1= RULE_INT | this_ID_2= RULE_ID ) kw= ']'
            {
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleArraySpecification2625); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1387:1: (this_INT_1= RULE_INT | this_ID_2= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1387:1: (this_INT_1= RULE_INT | this_ID_2= RULE_ID )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1387:6: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArraySpecification2641); 

                    		current.merge(this_INT_1);
                        
                     
                        createLeafNode(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1395:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArraySpecification2667); 

                    		current.merge(this_ID_2);
                        
                     
                        createLeafNode(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleArraySpecification2686); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1416:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1417:2: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1418:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName2727);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;

             current =iv_ruleFullyQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName2738); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1425:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1430:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1431:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1431:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1431:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName2778); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1438:1: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1439:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,27,FOLLOW_27_in_ruleFullyQualifiedName2797); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullyQualifiedName2812); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1459:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1460:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1461:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition2859);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition2869); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1468:1: ruleConstantDefinition returns [EObject current=null] : ( '#define' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1473:6: ( ( '#define' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1474:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1474:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1474:3: '#define' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_ruleConstantDefinition2904); 

                    createLeafNode(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1478:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1479:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1479:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1480:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition2921); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1510:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1511:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1512:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition2962);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;

             current =iv_ruleInterfaceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition2972); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1519:1: ruleInterfaceDefinition returns [EObject current=null] : ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fqn_2_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_4_0 = null;

        EObject lv_methodDef_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1524:6: ( ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1525:1: ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1525:1: ( 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1525:3: 'interface' ( 'unmanaged' )? ( (lv_fqn_2_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_6_0= ruleMethodDefinition ) )* '}'
            {
            match(input,29,FOLLOW_29_in_ruleInterfaceDefinition3007); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1529:1: ( 'unmanaged' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1529:3: 'unmanaged'
                    {
                    match(input,30,FOLLOW_30_in_ruleInterfaceDefinition3018); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1533:3: ( (lv_fqn_2_0= ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1534:1: (lv_fqn_2_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1534:1: (lv_fqn_2_0= ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1535:3: lv_fqn_2_0= ruleFullyQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3041);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1557:2: ( ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1557:4: ':' ( (lv_fqn2_4_0= ruleFullyQualifiedName ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleInterfaceDefinition3052); 

                            createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1561:1: ( (lv_fqn2_4_0= ruleFullyQualifiedName ) )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1562:1: (lv_fqn2_4_0= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1562:1: (lv_fqn2_4_0= ruleFullyQualifiedName )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1563:3: lv_fqn2_4_0= ruleFullyQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3073);
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

            match(input,14,FOLLOW_14_in_ruleInterfaceDefinition3085); 

                    createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1589:1: ( (lv_methodDef_6_0= ruleMethodDefinition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=16 && LA26_0<=17)||LA26_0==19||LA26_0==31||(LA26_0>=34 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1590:1: (lv_methodDef_6_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1590:1: (lv_methodDef_6_0= ruleMethodDefinition )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1591:3: lv_methodDef_6_0= ruleMethodDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3106);
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
            	    break loop26;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleInterfaceDefinition3117); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1625:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1626:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1627:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMethodDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3153);
            iv_ruleMethodDefinition=ruleMethodDefinition();
            _fsp--;

             current =iv_ruleMethodDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition3163); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1634:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_qualifiedTypeSpec_0_0 = null;

        EObject lv_ParameterList_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1639:6: ( ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1640:1: ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1640:1: ( ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';' )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1640:2: ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) ) ( (lv_id_1_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) ) ';'
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1640:2: ( (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1641:1: (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1641:1: (lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1642:3: lv_qualifiedTypeSpec_0_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3209);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1664:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1665:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1665:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1666:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodDefinition3226); 

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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1688:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA28_2 = input.LA(3);

                    if ( (LA28_2==24) ) {
                        alt28=1;
                    }
                    else if ( (LA28_2==RULE_ID||(LA28_2>=22 && LA28_2<=23)||LA28_2==31||(LA28_2>=36 && LA28_2<=54)) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1688:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 28, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_ID:
                case 16:
                case 17:
                case 19:
                case 34:
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
                    {
                    alt28=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1688:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1688:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1688:3: ( '(' ( 'void' )? ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1688:3: ( '(' ( 'void' )? ')' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1688:5: '(' ( 'void' )? ')'
                    {
                    match(input,23,FOLLOW_23_in_ruleMethodDefinition3243); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1692:1: ( 'void' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==31) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1692:3: 'void'
                            {
                            match(input,31,FOLLOW_31_in_ruleMethodDefinition3254); 

                                    createLeafNode(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,24,FOLLOW_24_in_ruleMethodDefinition3266); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1701:6: ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1701:6: ( '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1701:8: '(' ( (lv_ParameterList_6_0= ruleParameterList ) ) ')'
                    {
                    match(input,23,FOLLOW_23_in_ruleMethodDefinition3284); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0(), null); 
                        
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1705:1: ( (lv_ParameterList_6_0= ruleParameterList ) )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1706:1: (lv_ParameterList_6_0= ruleParameterList )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1706:1: (lv_ParameterList_6_0= ruleParameterList )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1707:3: lv_ParameterList_6_0= ruleParameterList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleMethodDefinition3305);
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

                    match(input,24,FOLLOW_24_in_ruleMethodDefinition3315); 

                            createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleMethodDefinition3327); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1745:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1746:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1747:2: iv_ruleParameterList= ruleParameterList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterListRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3363);
            iv_ruleParameterList=ruleParameterList();
            _fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3373); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1754:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1759:6: ( ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1760:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1760:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1760:2: ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )?
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1760:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1761:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1761:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1762:3: lv_param_0_0= ruleParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3419);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1784:2: ( ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||(LA29_1>=16 && LA29_1<=17)||LA29_1==19||LA29_1==31||(LA29_1>=34 && LA29_1<=56)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1784:4: ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    match(input,20,FOLLOW_20_in_ruleParameterList3430); 

            	            createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1788:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1789:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1789:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1790:3: lv_params_2_0= ruleParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3451);
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
            	    break loop29;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1812:4: ( ',' '...' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1812:6: ',' '...'
                    {
                    match(input,20,FOLLOW_20_in_ruleParameterList3464); 

                            createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_2_0(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleParameterList3474); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1828:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1829:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1830:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3512);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3522); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1837:1: ruleParameter returns [EObject current=null] : ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_ParameterQualifier_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_dec_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1842:6: ( ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1843:1: ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1843:1: ( ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1843:2: ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarator ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1843:2: ( (lv_ParameterQualifier_0_0= ruleParameterQualifier ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=55 && LA31_0<=56)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1844:1: (lv_ParameterQualifier_0_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1844:1: (lv_ParameterQualifier_0_0= ruleParameterQualifier )
            	    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1845:3: lv_ParameterQualifier_0_0= ruleParameterQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterQualifier_in_ruleParameter3568);
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
            	    break loop31;
                }
            } while (true);

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1867:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1868:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1868:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1869:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3590);
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

            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1891:2: ( (lv_dec_2_0= ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1892:1: (lv_dec_2_0= ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1892:1: (lv_dec_2_0= ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1893:3: lv_dec_2_0= ruleDeclarator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclarator_in_ruleParameter3611);
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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1923:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1924:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1925:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIncludeDirectiveRule(), currentNode); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3647);
            iv_ruleIncludeDirective=ruleIncludeDirective();
            _fsp--;

             current =iv_ruleIncludeDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective3657); 

            }

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1932:1: ruleIncludeDirective returns [EObject current=null] : ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1937:6: ( ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1938:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1938:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1938:3: '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            {
            match(input,33,FOLLOW_33_in_ruleIncludeDirective3692); 

                    createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0(), null); 
                
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1942:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_INCLUDELIB) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1942:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1942:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1942:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1943:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1943:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1944:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeDirective3710); 

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
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1967:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1967:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1968:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1968:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1969:3: lv_includeID_2_0= RULE_INCLUDELIB
                    {
                    lv_includeID_2_0=(Token)input.LT(1);
                    match(input,RULE_INCLUDELIB,FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective3738); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:1999:1: ruleTypeQualifier returns [Enumerator current=null] : ( ( 'const' ) | ( 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2003:6: ( ( ( 'const' ) | ( 'volatile' ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2004:1: ( ( 'const' ) | ( 'volatile' ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2004:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            else if ( (LA33_0==35) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2004:1: ( ( 'const' ) | ( 'volatile' ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2004:2: ( 'const' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2004:2: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2004:4: 'const'
                    {
                    match(input,34,FOLLOW_34_in_ruleTypeQualifier3792); 

                            current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2010:6: ( 'volatile' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2010:6: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2010:8: 'volatile'
                    {
                    match(input,35,FOLLOW_35_in_ruleTypeQualifier3807); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2020:1: ruleTypeSpecifier returns [Enumerator current=null] : ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2024:6: ( ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2025:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2025:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt34=20;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt34=1;
                }
                break;
            case 36:
                {
                alt34=2;
                }
                break;
            case 37:
                {
                alt34=3;
                }
                break;
            case 38:
                {
                alt34=4;
                }
                break;
            case 39:
                {
                alt34=5;
                }
                break;
            case 40:
                {
                alt34=6;
                }
                break;
            case 41:
                {
                alt34=7;
                }
                break;
            case 42:
                {
                alt34=8;
                }
                break;
            case 43:
                {
                alt34=9;
                }
                break;
            case 44:
                {
                alt34=10;
                }
                break;
            case 45:
                {
                alt34=11;
                }
                break;
            case 46:
                {
                alt34=12;
                }
                break;
            case 47:
                {
                alt34=13;
                }
                break;
            case 48:
                {
                alt34=14;
                }
                break;
            case 49:
                {
                alt34=15;
                }
                break;
            case 50:
                {
                alt34=16;
                }
                break;
            case 51:
                {
                alt34=17;
                }
                break;
            case 52:
                {
                alt34=18;
                }
                break;
            case 53:
                {
                alt34=19;
                }
                break;
            case 54:
                {
                alt34=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2025:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2025:2: ( 'void' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2025:2: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2025:4: 'void'
                    {
                    match(input,31,FOLLOW_31_in_ruleTypeSpecifier3850); 

                            current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2031:6: ( 'char' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2031:6: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2031:8: 'char'
                    {
                    match(input,36,FOLLOW_36_in_ruleTypeSpecifier3865); 

                            current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2037:6: ( 'short' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2037:6: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2037:8: 'short'
                    {
                    match(input,37,FOLLOW_37_in_ruleTypeSpecifier3880); 

                            current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2043:6: ( 'int' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2043:6: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2043:8: 'int'
                    {
                    match(input,38,FOLLOW_38_in_ruleTypeSpecifier3895); 

                            current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2049:6: ( 'long' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2049:6: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2049:8: 'long'
                    {
                    match(input,39,FOLLOW_39_in_ruleTypeSpecifier3910); 

                            current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2055:6: ( 'float' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2055:6: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2055:8: 'float'
                    {
                    match(input,40,FOLLOW_40_in_ruleTypeSpecifier3925); 

                            current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2061:6: ( 'double' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2061:6: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2061:8: 'double'
                    {
                    match(input,41,FOLLOW_41_in_ruleTypeSpecifier3940); 

                            current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2067:6: ( 'signed' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2067:6: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2067:8: 'signed'
                    {
                    match(input,42,FOLLOW_42_in_ruleTypeSpecifier3955); 

                            current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2073:6: ( 'unsigned' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2073:6: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2073:8: 'unsigned'
                    {
                    match(input,43,FOLLOW_43_in_ruleTypeSpecifier3970); 

                            current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2079:6: ( 'string' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2079:6: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2079:8: 'string'
                    {
                    match(input,44,FOLLOW_44_in_ruleTypeSpecifier3985); 

                            current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2085:6: ( 'int8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2085:6: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2085:8: 'int8_t'
                    {
                    match(input,45,FOLLOW_45_in_ruleTypeSpecifier4000); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2091:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2091:6: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2091:8: 'uint8_t'
                    {
                    match(input,46,FOLLOW_46_in_ruleTypeSpecifier4015); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2097:6: ( 'int16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2097:6: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2097:8: 'int16_t'
                    {
                    match(input,47,FOLLOW_47_in_ruleTypeSpecifier4030); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2103:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2103:6: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2103:8: 'uint16_t'
                    {
                    match(input,48,FOLLOW_48_in_ruleTypeSpecifier4045); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2109:6: ( 'int32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2109:6: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2109:8: 'int32_t'
                    {
                    match(input,49,FOLLOW_49_in_ruleTypeSpecifier4060); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2115:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2115:6: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2115:8: 'uint32_t'
                    {
                    match(input,50,FOLLOW_50_in_ruleTypeSpecifier4075); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2121:6: ( 'int64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2121:6: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2121:8: 'int64_t'
                    {
                    match(input,51,FOLLOW_51_in_ruleTypeSpecifier4090); 

                            current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2127:6: ( 'uint64_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2127:6: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2127:8: 'uint64_t'
                    {
                    match(input,52,FOLLOW_52_in_ruleTypeSpecifier4105); 

                            current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2133:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2133:6: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2133:8: 'intptr_t'
                    {
                    match(input,53,FOLLOW_53_in_ruleTypeSpecifier4120); 

                            current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2139:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2139:6: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2139:8: 'uintptr_t'
                    {
                    match(input,54,FOLLOW_54_in_ruleTypeSpecifier4135); 

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
    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2149:1: ruleParameterQualifier returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2153:6: ( ( ( 'in' ) | ( 'out' ) ) )
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2154:1: ( ( 'in' ) | ( 'out' ) )
            {
            // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2154:1: ( ( 'in' ) | ( 'out' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==55) ) {
                alt35=1;
            }
            else if ( (LA35_0==56) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2154:1: ( ( 'in' ) | ( 'out' ) )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2154:2: ( 'in' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2154:2: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2154:4: 'in'
                    {
                    match(input,55,FOLLOW_55_in_ruleParameterQualifier4178); 

                            current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2160:6: ( 'out' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2160:6: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.itf/src-gen/org/ow2/fractal/mind/idl/parser/antlr/internal/InternalFractalItf.g:2160:8: 'out'
                    {
                    match(input,56,FOLLOW_56_in_ruleParameterQualifier4193); 

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


 

    public static final BitSet FOLLOW_ruleItfFile_in_entryRuleItfFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItfFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleItfFile131 = new BitSet(new long[]{0x00000002300B2000L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleItfFile154 = new BitSet(new long[]{0x00000000300B2000L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleItfFile181 = new BitSet(new long[]{0x00000000300B2000L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleItfFile204 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleItfFile215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition338 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition365 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDefinition375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypedefSpecification456 = new BitSet(new long[]{0x007FFFFC800B0010L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification477 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification590 = new BitSet(new long[]{0x007FFFFC800B0010L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_ruleTypeSpecification704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification785 = new BitSet(new long[]{0x007FFFF080000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1099 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1116 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStructOrUnionDefinition1132 = new BitSet(new long[]{0x007FFFFC800B8010L});
    public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1153 = new BitSet(new long[]{0x007FFFFC800B8010L});
    public static final BitSet FOLLOW_15_in_ruleStructOrUnionDefinition1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructOrUnion1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStructOrUnion1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1479 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1500 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleStructMember1511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStructMember1520 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructMember1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnumDefinition1731 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1748 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumDefinition1764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1785 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumDefinition1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference1831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnumReference1876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList1991 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEnumMemberList2001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2022 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2112 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleEnumMember2128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumMember2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2230 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleDeclarators2241 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2262 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDeclarator2346 = new BitSet(new long[]{0x0000000C00C00010L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleDeclarator2367 = new BitSet(new long[]{0x0000000C00C00010L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator2480 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23_in_ruleDirectDeclarator2502 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2524 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDirectDeclarator2533 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2545 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleArraySpecification2625 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArraySpecification2641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArraySpecification2667 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleArraySpecification2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName2778 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleFullyQualifiedName2797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName2812 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConstantDefinition2904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInterfaceDefinition3007 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_ruleInterfaceDefinition3018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3041 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleInterfaceDefinition3052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3073 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceDefinition3085 = new BitSet(new long[]{0x007FFFFC800B8010L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3106 = new BitSet(new long[]{0x007FFFFC800B8010L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceDefinition3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3226 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMethodDefinition3243 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleMethodDefinition3254 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMethodDefinition3266 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23_in_ruleMethodDefinition3284 = new BitSet(new long[]{0x01FFFFFC800B0010L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3305 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMethodDefinition3315 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMethodDefinition3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3419 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParameterList3430 = new BitSet(new long[]{0x01FFFFFC800B0010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3451 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParameterList3464 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleParameterList3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter3568 = new BitSet(new long[]{0x01FFFFFC800B0010L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3590 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIncludeDirective3692 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTypeQualifier3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTypeQualifier3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeSpecifier3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeSpecifier3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeSpecifier3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeSpecifier3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeSpecifier3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeSpecifier3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeSpecifier3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeSpecifier3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeSpecifier3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeSpecifier3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeSpecifier4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeSpecifier4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeSpecifier4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeSpecifier4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeSpecifier4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeSpecifier4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeSpecifier4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeSpecifier4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeSpecifier4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeSpecifier4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleParameterQualifier4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleParameterQualifier4193 = new BitSet(new long[]{0x0000000000000002L});

}