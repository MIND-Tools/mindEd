package org.ow2.mindEd.itf.editor.textual.parser.antlr.internal; 

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
import org.ow2.mindEd.itf.editor.textual.services.FractalItfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalItfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDELIB", "RULE_BOOLEAN", "RULE_ADDITIVEOPERATION", "RULE_INT", "RULE_SHIFTOPERATION", "RULE_MULOPERATION", "RULE_UNARYOPERATION", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'@'", "'null'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'e'", "'E'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
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

        public InternalFractalItfParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[220+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
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
        	return classLoader.getResourceAsStream("org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ItfFile";	
       	}
       	
       	@Override
       	protected FractalItfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleItfFile
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:84:1: entryRuleItfFile returns [EObject current=null] : iv_ruleItfFile= ruleItfFile EOF ;
    public final EObject entryRuleItfFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItfFile = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:85:2: (iv_ruleItfFile= ruleItfFile EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:86:2: iv_ruleItfFile= ruleItfFile EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getItfFileRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleItfFile_in_entryRuleItfFile81);
            iv_ruleItfFile=ruleItfFile();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleItfFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItfFile91); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:93:1: ruleItfFile returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? ) ;
    public final EObject ruleItfFile() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_interface_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:98:6: ( ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:99:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:99:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:99:2: ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) ( ';' )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:99:2: ( (lv_includes_0_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:100:1: (lv_includes_0_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:100:1: (lv_includes_0_0= ruleIncludeDirective )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:101:3: lv_includes_0_0= ruleIncludeDirective
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_ruleItfFile137);
            	    lv_includes_0_0=ruleIncludeDirective();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:123:3: ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }
                else if ( (LA2_0==19||(LA2_0>=22 && LA2_0<=23)||LA2_0==25) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:123:4: ( (lv_constant_1_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:123:4: ( (lv_constant_1_0= ruleConstantDefinition ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:124:1: (lv_constant_1_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:124:1: (lv_constant_1_0= ruleConstantDefinition )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:125:3: lv_constant_1_0= ruleConstantDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleItfFile160);
            	    lv_constant_1_0=ruleConstantDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:148:6: ( (lv_type_2_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:148:6: ( (lv_type_2_0= ruleTypeDefinition ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:149:1: (lv_type_2_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:149:1: (lv_type_2_0= ruleTypeDefinition )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:150:3: lv_type_2_0= ruleTypeDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleItfFile187);
            	    lv_type_2_0=ruleTypeDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:172:4: ( (lv_interface_3_0= ruleInterfaceDefinition ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:173:1: (lv_interface_3_0= ruleInterfaceDefinition )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:173:1: (lv_interface_3_0= ruleInterfaceDefinition )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:174:3: lv_interface_3_0= ruleInterfaceDefinition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getItfFileAccess().getInterfaceInterfaceDefinitionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleItfFile210);
            lv_interface_3_0=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:196:2: ( ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:196:4: ';'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleItfFile221); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getItfFileAccess().getSemicolonKeyword_3(), null); 
                          
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
    // $ANTLR end ruleItfFile


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:208:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:209:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:210:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition259);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition269); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:217:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:222:6: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:223:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:223:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:223:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) ';'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:223:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 22:
            case 23:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("223:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:224:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition320);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:237:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition350);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:250:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition380);
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleTypeDefinition390); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:273:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:274:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:275:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification426);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefSpecification436); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:282:1: ruleTypedefSpecification returns [EObject current=null] : ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:287:6: ( ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:288:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:288:1: ( 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:288:3: 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedefSpecification471); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:292:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:293:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:293:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:294:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification492);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:316:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:317:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:317:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:318:3: lv_dec_2_0= ruleDeclarators
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleTypedefSpecification513);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:348:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:349:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:350:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification549);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification559); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:357:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:362:6: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:363:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:363:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:363:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:363:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=49 && LA5_0<=50)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:364:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:364:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:365:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification605);
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
            	    break loop5;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:387:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:388:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:388:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:389:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification627);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:419:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:420:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:421:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification663);
            iv_ruleTypeSpecification=ruleTypeSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSpecification673); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:428:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:433:6: ( ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:434:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:434:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 22:
            case 23:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 37:
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
                {
                alt7=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("434:1: ( ( (lv_typeDefName_0_0= ruleTypedefName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+ )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:434:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:434:2: ( (lv_typeDefName_0_0= ruleTypedefName ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:435:1: (lv_typeDefName_0_0= ruleTypedefName )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:435:1: (lv_typeDefName_0_0= ruleTypedefName )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:436:3: lv_typeDefName_0_0= ruleTypedefName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefName_in_ruleTypeSpecification719);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:460:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification750);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:473:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification780);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:485:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:485:6: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==37||(LA6_0>=51 && LA6_0<=69)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:486:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:486:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:487:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification806);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (backtracking>0) {failed=true; return current;}
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:517:1: entryRuleTypedefName returns [String current=null] : iv_ruleTypedefName= ruleTypedefName EOF ;
    public final String entryRuleTypedefName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypedefName = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:518:2: (iv_ruleTypedefName= ruleTypedefName EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:519:2: iv_ruleTypedefName= ruleTypedefName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefName_in_entryRuleTypedefName844);
            iv_ruleTypedefName=ruleTypedefName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedefName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefName855); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:526:1: ruleTypedefName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FullyQualifiedName_0= ruleFullyQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypedefName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullyQualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:531:6: (this_FullyQualifiedName_0= ruleFullyQualifiedName )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:533:5: this_FullyQualifiedName_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName901);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:551:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:552:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:553:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification945);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionSpecification955); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:560:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:565:6: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==18||LA8_3==26||(LA8_3>=28 && LA8_3<=31)) ) {
                        alt8=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==20) ) {
                    alt8=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==23) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==18||LA8_3==26||(LA8_3>=28 && LA8_3<=31)) ) {
                        alt8=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_2==20) ) {
                    alt8=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("566:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:567:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1005);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:580:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1035);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:599:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:600:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:601:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1070);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1080); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:608:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:613:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:614:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:614:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:614:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_structMember_3_0= ruleStructMember ) )* '}'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:614:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:615:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:615:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:616:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1126);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:638:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:639:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:639:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:640:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1143); if (failed) return current;
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleStructOrUnionDefinition1159); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:666:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=22 && LA10_0<=23)||LA10_0==25||LA10_0==37||LA10_0==40||(LA10_0>=49 && LA10_0<=69)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:667:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:667:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:668:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1180);
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
            	    break loop10;
                }
            } while (true);

            match(input,21,FollowSets000.FOLLOW_21_in_ruleStructOrUnionDefinition1191); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:702:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:703:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:704:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructorUnionReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1227);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructorUnionReference1237); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:711:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:716:6: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:717:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:717:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:717:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_id_1_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:717:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:718:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:718:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:719:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1283);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:741:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:742:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:742:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:743:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructorUnionReference1300); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:773:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:774:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:775:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructOrUnionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1342);
            iv_ruleStructOrUnion=ruleStructOrUnion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnion1353); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:782:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:787:6: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:788:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:788:1: (kw= 'struct' | kw= 'union' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("788:1: (kw= 'struct' | kw= 'union' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:789:2: kw= 'struct'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleStructOrUnion1391); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getStructOrUnionAccess().getStructKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:796:2: kw= 'union'
                    {
                    kw=(Token)input.LT(1);
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleStructOrUnion1410); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:809:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:810:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:811:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStructMemberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_entryRuleStructMember1450);
            iv_ruleStructMember=ruleStructMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructMember1460); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:818:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_qualType_1_0 = null;

        EObject lv_dec_2_0 = null;

        EObject lv_constExpr_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:823:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:824:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:824:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:824:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? ';'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:824:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:825:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:825:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:826:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleStructMember1506);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:848:2: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:849:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:849:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:850:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1527);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:872:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:873:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:873:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:874:3: lv_dec_2_0= ruleDeclarators
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleStructMember1548);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:896:2: ( ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:896:4: ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleStructMember1559); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStructMemberAccess().getColonKeyword_3_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:900:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:901:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:901:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:902:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleStructMember1580);
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleStructMember1592); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:936:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:937:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:938:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1628);
            iv_ruleEnumSpecification=ruleEnumSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumSpecification1638); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:945:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:950:6: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:951:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:951:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==EOF||LA13_2==RULE_ID||LA13_2==18||LA13_2==26||(LA13_2>=28 && LA13_2<=31)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==20) ) {
                        alt13=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("951:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==20) ) {
                    alt13=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("951:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("951:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:952:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1688);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:965:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_ruleEnumSpecification1718);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:984:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:985:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:986:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1753);
            iv_ruleEnumDefinition=ruleEnumDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumDefinition1763); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:993:1: ruleEnumDefinition returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_enumMemberList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:998:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:999:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:999:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:999:3: 'enum' ( (lv_id_1_0= RULE_ID ) )? '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) '}'
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumDefinition1798); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1003:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1004:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1004:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1005:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumDefinition1815); if (failed) return current;
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleEnumDefinition1831); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1031:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1032:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1032:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1033:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1852);
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

            match(input,21,FollowSets000.FOLLOW_21_in_ruleEnumDefinition1862); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1067:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1068:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1069:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_entryRuleEnumReference1898);
            iv_ruleEnumReference=ruleEnumReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumReference1908); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1076:1: ruleEnumReference returns [EObject current=null] : ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1081:6: ( ( 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1082:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1082:1: ( 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1082:3: 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumReference1943); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1086:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1087:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1087:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1088:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumReference1960); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1118:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1119:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1120:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumMemberListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2001);
            iv_ruleEnumMemberList=ruleEnumMemberList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMemberList2011); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1127:1: ruleEnumMemberList returns [EObject current=null] : (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject this_EnumMember_0 = null;

        EObject lv_enumMember_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1132:6: ( (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1133:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1133:1: (this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1134:2: this_EnumMember_0= ruleEnumMember ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2061);
            this_EnumMember_0=ruleEnumMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_EnumMember_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1145:1: ( ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1145:3: ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleEnumMemberList2071); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1149:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1150:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1150:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1151:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2092);
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
            	    break loop15;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1181:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1182:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1183:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumMemberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_entryRuleEnumMember2130);
            iv_ruleEnumMember=ruleEnumMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMember2140); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1190:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_constExpr_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1195:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1196:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1196:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1196:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_id_1_0= RULE_ID ) ) ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1196:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1197:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1197:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1198:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleEnumMember2186);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1220:2: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1221:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1221:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1222:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumMember2203); if (failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1244:2: ( '=' ( (lv_constExpr_3_0= ruleConstantExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1244:4: '=' ( (lv_constExpr_3_0= ruleConstantExpression ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumMember2219); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1248:1: ( (lv_constExpr_3_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1249:1: (lv_constExpr_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1249:1: (lv_constExpr_3_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1250:3: lv_constExpr_3_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleEnumMember2240);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1280:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1281:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1282:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaratorsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_entryRuleDeclarators2278);
            iv_ruleDeclarators=ruleDeclarators();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarators2288); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1289:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1294:6: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1295:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1295:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1295:2: ( (lv_dec_0_0= ruleDeclarator ) ) ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1295:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1296:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1296:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1297:3: lv_dec_0_0= ruleDeclarator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2334);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1319:2: ( ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1319:4: ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleDeclarators2345); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1323:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1324:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1324:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1325:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2366);
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
    // $ANTLR end ruleDeclarators


    // $ANTLR start entryRuleDeclarator
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1355:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1356:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1357:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_entryRuleDeclarator2404);
            iv_ruleDeclarator=ruleDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarator2414); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1364:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1369:6: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1370:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1370:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1370:2: ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1370:2: ( (lv_pointer_0_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1371:1: (lv_pointer_0_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1371:1: (lv_pointer_0_0= rulePointerSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1372:3: lv_pointer_0_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleDeclarator2460);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1394:2: ( (lv_dc_1_0= ruleDirectDeclarator ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1395:1: (lv_dc_1_0= ruleDirectDeclarator )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1395:1: (lv_dc_1_0= ruleDirectDeclarator )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1396:3: lv_dc_1_0= ruleDirectDeclarator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2481);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1426:1: entryRuleAbstractDeclarator returns [EObject current=null] : iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF ;
    public final EObject entryRuleAbstractDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclarator = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1427:2: (iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1428:2: iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAbstractDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2517);
            iv_ruleAbstractDeclarator=ruleAbstractDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAbstractDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractDeclarator2527); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1435:1: ruleAbstractDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? ) ;
    public final EObject ruleAbstractDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1440:6: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1441:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1441:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1441:2: ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1441:2: ( (lv_pointer_0_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1442:1: (lv_pointer_0_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1442:1: (lv_pointer_0_0= rulePointerSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1443:3: lv_pointer_0_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAbstractDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleAbstractDeclarator2573);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1465:2: ( (lv_dc_1_0= ruleAbstractDirectDeclarator ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29||LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1466:1: (lv_dc_1_0= ruleAbstractDirectDeclarator )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1466:1: (lv_dc_1_0= ruleAbstractDirectDeclarator )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1467:3: lv_dc_1_0= ruleAbstractDirectDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAbstractDeclaratorAccess().getDcAbstractDirectDeclaratorParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractDirectDeclarator_in_ruleAbstractDeclarator2594);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1497:1: entryRulePointerSpecification returns [EObject current=null] : iv_rulePointerSpecification= rulePointerSpecification EOF ;
    public final EObject entryRulePointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointerSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1498:2: (iv_rulePointerSpecification= rulePointerSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1499:2: iv_rulePointerSpecification= rulePointerSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPointerSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2631);
            iv_rulePointerSpecification=rulePointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePointerSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePointerSpecification2641); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1506:1: rulePointerSpecification returns [EObject current=null] : ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* ) ;
    public final EObject rulePointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiedPointer_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1511:6: ( ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1512:1: ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1512:1: ( () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1512:2: () ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1512:2: ()
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1513:2: 
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1526:2: ( (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1527:1: (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1527:1: (lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1528:3: lv_qualifiedPointer_1_0= ruleQualified_PointerSpecification
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerQualified_PointerSpecificationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualified_PointerSpecification_in_rulePointerSpecification2699);
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
    // $ANTLR end rulePointerSpecification


    // $ANTLR start entryRuleQualified_PointerSpecification
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1558:1: entryRuleQualified_PointerSpecification returns [EObject current=null] : iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF ;
    public final EObject entryRuleQualified_PointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualified_PointerSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1559:2: (iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1560:2: iv_ruleQualified_PointerSpecification= ruleQualified_PointerSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualified_PointerSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification2736);
            iv_ruleQualified_PointerSpecification=ruleQualified_PointerSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualified_PointerSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualified_PointerSpecification2746); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1567:1: ruleQualified_PointerSpecification returns [EObject current=null] : ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* ) ;
    public final EObject ruleQualified_PointerSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1572:6: ( ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1573:1: ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1573:1: ( () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1573:2: () '*' ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1573:2: ()
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1574:2: 
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleQualified_PointerSpecification2793); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getQualified_PointerSpecificationAccess().getAsteriskKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1591:1: ( (lv_typeQualifier_2_0= ruleTypeQualifier ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=49 && LA20_0<=50)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1592:1: (lv_typeQualifier_2_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1592:1: (lv_typeQualifier_2_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1593:3: lv_typeQualifier_2_0= ruleTypeQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualified_PointerSpecification2814);
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
    // $ANTLR end ruleQualified_PointerSpecification


    // $ANTLR start entryRuleDirectDeclarator
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1623:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1624:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1625:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDirectDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2851);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectDeclarator2861); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1632:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_dec_2_0 = null;

        EObject lv_array_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1637:6: ( ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:1: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1638:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:3: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1639:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1639:1: (lv_id_0_0= RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1640:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDirectDeclarator2904); if (failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1663:6: ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1663:6: ( '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1663:8: '(' ( (lv_dec_2_0= ruleDeclarator ) ) ')'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleDirectDeclarator2926); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1667:1: ( (lv_dec_2_0= ruleDeclarator ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1668:1: (lv_dec_2_0= ruleDeclarator )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1668:1: (lv_dec_2_0= ruleDeclarator )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1669:3: lv_dec_2_0= ruleDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDecDeclaratorParserRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2947);
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

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleDirectDeclarator2957); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1695:3: ( (lv_array_4_0= ruleArraySpecification ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1696:1: (lv_array_4_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1696:1: (lv_array_4_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1697:3: lv_array_4_0= ruleArraySpecification
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2980);
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
    // $ANTLR end ruleDirectDeclarator


    // $ANTLR start entryRuleAbstractDirectDeclarator
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1727:1: entryRuleAbstractDirectDeclarator returns [EObject current=null] : iv_ruleAbstractDirectDeclarator= ruleAbstractDirectDeclarator EOF ;
    public final EObject entryRuleAbstractDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1728:2: (iv_ruleAbstractDirectDeclarator= ruleAbstractDirectDeclarator EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1729:2: iv_ruleAbstractDirectDeclarator= ruleAbstractDirectDeclarator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAbstractDirectDeclaratorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractDirectDeclarator_in_entryRuleAbstractDirectDeclarator3017);
            iv_ruleAbstractDirectDeclarator=ruleAbstractDirectDeclarator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAbstractDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractDirectDeclarator3027); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1736:1: ruleAbstractDirectDeclarator returns [EObject current=null] : ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ ) ;
    public final EObject ruleAbstractDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_dec_1_0 = null;

        EObject lv_arrays_3_0 = null;

        EObject lv_array_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1741:6: ( ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1742:1: ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1742:1: ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1742:1: ( ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* ) | ( (lv_array_4_0= ruleArraySpecification ) )+ )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1742:2: ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1742:2: ( '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )* )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1742:4: '(' ( (lv_dec_1_0= ruleAbstractDeclarator ) ) ')' ( (lv_arrays_3_0= ruleArraySpecification ) )*
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAbstractDirectDeclarator3063); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractDirectDeclaratorAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1746:1: ( (lv_dec_1_0= ruleAbstractDeclarator ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1747:1: (lv_dec_1_0= ruleAbstractDeclarator )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1747:1: (lv_dec_1_0= ruleAbstractDeclarator )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1748:3: lv_dec_1_0= ruleAbstractDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAbstractDirectDeclaratorAccess().getDecAbstractDeclaratorParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractDeclarator_in_ruleAbstractDirectDeclarator3084);
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

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleAbstractDirectDeclarator3094); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractDirectDeclaratorAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1774:1: ( (lv_arrays_3_0= ruleArraySpecification ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==31) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1775:1: (lv_arrays_3_0= ruleArraySpecification )
                    	    {
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1775:1: (lv_arrays_3_0= ruleArraySpecification )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1776:3: lv_arrays_3_0= ruleArraySpecification
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAbstractDirectDeclaratorAccess().getArraysArraySpecificationParserRuleCall_0_3_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3115);
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
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1799:6: ( (lv_array_4_0= ruleArraySpecification ) )+
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1799:6: ( (lv_array_4_0= ruleArraySpecification ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==31) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1800:1: (lv_array_4_0= ruleArraySpecification )
                    	    {
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1800:1: (lv_array_4_0= ruleArraySpecification )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1801:3: lv_array_4_0= ruleArraySpecification
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAbstractDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3144);
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
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1831:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1832:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1833:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArraySpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3181);
            iv_ruleArraySpecification=ruleArraySpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArraySpecification3191); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1840:1: ruleArraySpecification returns [EObject current=null] : ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_constExpr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1845:6: ( ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1846:1: ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1846:1: ( '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1846:3: '[' ( (lv_constExpr_1_0= ruleConstantExpression ) )? ']'
            {
            match(input,31,FollowSets000.FOLLOW_31_in_ruleArraySpecification3226); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1850:1: ( (lv_constExpr_1_0= ruleConstantExpression ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||(LA26_0>=RULE_ADDITIVEOPERATION && LA26_0<=RULE_INT)||LA26_0==RULE_UNARYOPERATION||LA26_0==29||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1851:1: (lv_constExpr_1_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1851:1: (lv_constExpr_1_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1852:3: lv_constExpr_1_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArraySpecificationAccess().getConstExprConstantExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleArraySpecification3247);
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

            match(input,32,FollowSets000.FOLLOW_32_in_ruleArraySpecification3258); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1886:1: entryRuleFullyQualifiedName returns [String current=null] : iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF ;
    public final String entryRuleFullyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullyQualifiedName = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1887:2: (iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1888:2: iv_ruleFullyQualifiedName= ruleFullyQualifiedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullyQualifiedNameRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName3295);
            iv_ruleFullyQualifiedName=ruleFullyQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullyQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFullyQualifiedName3306); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1895:1: ruleFullyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFullyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1900:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1901:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1901:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1901:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFullyQualifiedName3346); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1908:1: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1909:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,33,FollowSets000.FOLLOW_33_in_ruleFullyQualifiedName3365); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFullyQualifiedName3380); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1929:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1930:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1931:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3427);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinition3437); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1938:1: ruleConstantDefinition returns [EObject current=null] : ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1943:6: ( ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1944:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1944:1: ( '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1944:3: '#define' ( (lv_id_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            match(input,34,FollowSets000.FOLLOW_34_in_ruleConstantDefinition3472); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1948:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1949:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1949:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1950:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinition3489); if (failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1972:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||(LA28_0>=RULE_ADDITIVEOPERATION && LA28_0<=RULE_INT)||LA28_0==RULE_UNARYOPERATION||LA28_0==29||LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1973:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1973:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1974:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3515);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2004:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2005:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2006:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3552);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition3562); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2013:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_fqn_3_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_5_0 = null;

        EObject lv_methodDef_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2018:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2019:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2019:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2019:2: ( (lv_annotations_0_0= ruleAnnotations ) ) 'interface' ( 'unmanaged' )? ( (lv_fqn_3_0= ruleFullyQualifiedName ) ) ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )? '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* '}'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2019:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2020:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2020:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2021:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleInterfaceDefinition3608);
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

            match(input,35,FollowSets000.FOLLOW_35_in_ruleInterfaceDefinition3618); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2047:1: ( 'unmanaged' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2047:3: 'unmanaged'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleInterfaceDefinition3629); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2051:3: ( (lv_fqn_3_0= ruleFullyQualifiedName ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2052:1: (lv_fqn_3_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2052:1: (lv_fqn_3_0= ruleFullyQualifiedName )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2053:3: lv_fqn_3_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3652);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2075:2: ( ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2075:4: ':' ( (lv_fqn2_5_0= ruleFullyQualifiedName ) )
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleInterfaceDefinition3663); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2079:1: ( (lv_fqn2_5_0= ruleFullyQualifiedName ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2080:1: (lv_fqn2_5_0= ruleFullyQualifiedName )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2080:1: (lv_fqn2_5_0= ruleFullyQualifiedName )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2081:3: lv_fqn2_5_0= ruleFullyQualifiedName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3684);
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleInterfaceDefinition3696); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2107:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=22 && LA31_0<=23)||LA31_0==25||LA31_0==37||LA31_0==40||(LA31_0>=49 && LA31_0<=69)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2108:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2108:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2109:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3717);
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
            	    break loop31;
                }
            } while (true);

            match(input,21,FollowSets000.FOLLOW_21_in_ruleInterfaceDefinition3728); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2143:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2144:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2145:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMethodDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3764);
            iv_ruleMethodDefinition=ruleMethodDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodDefinition3774); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2152:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_pointerSpecification_2_0 = null;

        EObject lv_ParameterList_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2157:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2158:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2158:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2158:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_id_3_0= RULE_ID ) ) ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) ) ';'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2158:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2159:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2159:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2160:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleMethodDefinition3820);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2182:2: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2183:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2183:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2184:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3841);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2206:2: ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2207:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2207:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2208:3: lv_pointerSpecification_2_0= rulePointerSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationPointerSpecificationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3862);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2230:2: ( (lv_id_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2231:1: (lv_id_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2231:1: (lv_id_3_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2232:3: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodDefinition3879); if (failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 22:
                case 23:
                case 25:
                case 40:
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
                    alt33=2;
                    }
                    break;
                case 37:
                    {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==RULE_ID||LA33_3==26||(LA33_3>=28 && LA33_3<=29)||LA33_3==31||LA33_3==37||(LA33_3>=51 && LA33_3<=69)) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==30) ) {
                        int LA33_5 = input.LA(4);

                        if ( (synpred37()) ) {
                            alt33=1;
                        }
                        else if ( (true) ) {
                            alt33=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2254:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 33, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2254:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 33, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 30:
                    {
                    alt33=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2254:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2254:2: ( ( '(' ( 'void' )? ')' ) | ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:3: ( '(' ( 'void' )? ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:3: ( '(' ( 'void' )? ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:5: '(' ( 'void' )? ')'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleMethodDefinition3896); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2258:1: ( 'void' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==37) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2258:3: 'void'
                            {
                            match(input,37,FollowSets000.FOLLOW_37_in_ruleMethodDefinition3907); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleMethodDefinition3919); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2267:6: ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2267:6: ( '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2267:8: '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) ')'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleMethodDefinition3937); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2271:1: ( (lv_ParameterList_8_0= ruleParameterList ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2272:1: (lv_ParameterList_8_0= ruleParameterList )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2272:1: (lv_ParameterList_8_0= ruleParameterList )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2273:3: lv_ParameterList_8_0= ruleParameterList
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_4_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_ruleMethodDefinition3958);
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

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleMethodDefinition3968); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            match(input,18,FollowSets000.FOLLOW_18_in_ruleMethodDefinition3980); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2311:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2312:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2313:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterListRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_entryRuleParameterList4016);
            iv_ruleParameterList=ruleParameterList();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterList4026); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2320:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2325:6: ( ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2326:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2326:1: ( ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2326:2: ( (lv_param_0_0= ruleParameter ) ) ( ',' ( (lv_params_2_0= ruleParameter ) ) )* ( ',' '...' )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2326:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2327:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2327:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2328:3: lv_param_0_0= ruleParameter
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList4072);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2350:2: ( ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID||(LA34_1>=22 && LA34_1<=23)||LA34_1==25||LA34_1==37||LA34_1==40||(LA34_1>=49 && LA34_1<=71)) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2350:4: ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleParameterList4083); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2354:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2355:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2355:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2356:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList4104);
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
            	    break loop34;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2378:4: ( ',' '...' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2378:6: ',' '...'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleParameterList4117); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParameterListAccess().getCommaKeyword_2_0(), null); 
                          
                    }
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleParameterList4127); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2394:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2395:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2396:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4165);
            iv_ruleParameter=ruleParameter();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4175); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2403:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;

        EObject lv_absDec_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2408:6: ( ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2409:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2409:1: ( ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2409:2: ( (lv_annotations_0_0= ruleAnnotations ) ) ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2409:2: ( (lv_annotations_0_0= ruleAnnotations ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2410:1: (lv_annotations_0_0= ruleAnnotations )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2410:1: (lv_annotations_0_0= ruleAnnotations )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2411:3: lv_annotations_0_0= ruleAnnotations
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationsParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_ruleParameter4221);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2433:2: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=70 && LA36_0<=71)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2434:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2434:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2435:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterQualifier_in_ruleParameter4242);
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
            	    break loop36;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2457:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2458:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2458:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2459:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4264);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )
            int alt37=2;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA37_1 = input.LA(2);

                if ( (synpred41()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2481:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt37=1;
                }
                break;
            case 29:
                {
                int LA37_3 = input.LA(2);

                if ( (synpred41()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2481:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 26:
            case 30:
            case 31:
                {
                alt37=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2481:2: ( ( (lv_dec_3_0= ruleDeclarator ) ) | ( (lv_absDec_4_0= ruleAbstractDeclarator ) ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:3: ( (lv_dec_3_0= ruleDeclarator ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:3: ( (lv_dec_3_0= ruleDeclarator ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2482:1: (lv_dec_3_0= ruleDeclarator )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2482:1: (lv_dec_3_0= ruleDeclarator )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2483:3: lv_dec_3_0= ruleDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleParameter4286);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2506:6: ( (lv_absDec_4_0= ruleAbstractDeclarator ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2506:6: ( (lv_absDec_4_0= ruleAbstractDeclarator ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2507:1: (lv_absDec_4_0= ruleAbstractDeclarator )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2507:1: (lv_absDec_4_0= ruleAbstractDeclarator )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2508:3: lv_absDec_4_0= ruleAbstractDeclarator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getAbsDecAbstractDeclaratorParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractDeclarator_in_ruleParameter4313);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2538:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2539:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2540:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeDirectiveRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4350);
            iv_ruleIncludeDirective=ruleIncludeDirective();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludeDirective4360); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2547:1: ruleIncludeDirective returns [EObject current=null] : ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2552:6: ( ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2553:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2553:1: ( '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2553:3: '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            {
            match(input,39,FollowSets000.FOLLOW_39_in_ruleIncludeDirective4395); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2557:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_INCLUDELIB) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2557:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDELIB ) ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2557:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2557:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2558:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2558:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2559:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective4413); if (failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2582:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2582:6: ( (lv_includeID_2_0= RULE_INCLUDELIB ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2583:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2583:1: (lv_includeID_2_0= RULE_INCLUDELIB )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2584:3: lv_includeID_2_0= RULE_INCLUDELIB
                    {
                    lv_includeID_2_0=(Token)input.LT(1);
                    match(input,RULE_INCLUDELIB,FollowSets000.FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective4441); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2614:1: entryRuleAnnotations returns [EObject current=null] : iv_ruleAnnotations= ruleAnnotations EOF ;
    public final EObject entryRuleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotations = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2615:2: (iv_ruleAnnotations= ruleAnnotations EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2616:2: iv_ruleAnnotations= ruleAnnotations EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotations_in_entryRuleAnnotations4483);
            iv_ruleAnnotations=ruleAnnotations();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotations; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotations4493); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2623:1: ruleAnnotations returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2628:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:2: () ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:2: ()
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2630:2: 
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2643:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2644:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2644:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2645:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotations4551);
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
            	    break loop39;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2675:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2676:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2677:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4588);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4598); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2684:1: ruleAnnotation returns [EObject current=null] : ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fqn_1_0 = null;

        EObject lv_annotationParamaters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2689:6: ( ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2690:1: ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2690:1: ( '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2690:3: '@' ( (lv_fqn_1_0= ruleFullyQualifiedName ) ) ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )?
            {
            match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation4633); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2694:1: ( (lv_fqn_1_0= ruleFullyQualifiedName ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2695:1: (lv_fqn_1_0= ruleFullyQualifiedName )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2695:1: (lv_fqn_1_0= ruleFullyQualifiedName )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2696:3: lv_fqn_1_0= ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getFqnFullyQualifiedNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFullyQualifiedName_in_ruleAnnotation4654);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2718:2: ( (lv_annotationParamaters_2_0= ruleAnnotationParameters ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2719:1: (lv_annotationParamaters_2_0= ruleAnnotationParameters )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2719:1: (lv_annotationParamaters_2_0= ruleAnnotationParameters )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2720:3: lv_annotationParamaters_2_0= ruleAnnotationParameters
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParamatersAnnotationParametersParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationParameters_in_ruleAnnotation4675);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2750:1: entryRuleAnnotationParameters returns [EObject current=null] : iv_ruleAnnotationParameters= ruleAnnotationParameters EOF ;
    public final EObject entryRuleAnnotationParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationParameters = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2751:2: (iv_ruleAnnotationParameters= ruleAnnotationParameters EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2752:2: iv_ruleAnnotationParameters= ruleAnnotationParameters EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationParametersRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters4712);
            iv_ruleAnnotationParameters=ruleAnnotationParameters();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationParameters; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationParameters4722); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2759:1: ruleAnnotationParameters returns [EObject current=null] : ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' ) ;
    public final EObject ruleAnnotationParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_valuePair_2_0 = null;

        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2764:6: ( ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2765:1: ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2765:1: ( () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2765:2: () '(' ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )? ')'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2765:2: ()
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2766:2: 
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

            match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationParameters4769); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationParametersAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2783:1: ( ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) ) | ( (lv_value_3_0= ruleAnnotationValue ) ) )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==27) ) {
                    alt41=1;
                }
                else if ( (LA41_1==30) ) {
                    alt41=2;
                }
            }
            else if ( (LA41_0==RULE_STRING||(LA41_0>=RULE_BOOLEAN && LA41_0<=RULE_INT)||LA41_0==20||(LA41_0>=40 && LA41_0<=41)) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2783:2: ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2783:2: ( (lv_valuePair_2_0= ruleAnnotationValuePairs ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2784:1: (lv_valuePair_2_0= ruleAnnotationValuePairs )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2784:1: (lv_valuePair_2_0= ruleAnnotationValuePairs )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2785:3: lv_valuePair_2_0= ruleAnnotationValuePairs
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationParametersAccess().getValuePairAnnotationValuePairsParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePairs_in_ruleAnnotationParameters4791);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2808:6: ( (lv_value_3_0= ruleAnnotationValue ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2808:6: ( (lv_value_3_0= ruleAnnotationValue ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2809:1: (lv_value_3_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2809:1: (lv_value_3_0= ruleAnnotationValue )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2810:3: lv_value_3_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAnnotationParametersAccess().getValueAnnotationValueParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationParameters4818);
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

            match(input,30,FollowSets000.FOLLOW_30_in_ruleAnnotationParameters4830); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2844:1: entryRuleAnnotationValuePairs returns [EObject current=null] : iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF ;
    public final EObject entryRuleAnnotationValuePairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePairs = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2845:2: (iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2846:2: iv_ruleAnnotationValuePairs= ruleAnnotationValuePairs EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValuePairsRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs4866);
            iv_ruleAnnotationValuePairs=ruleAnnotationValuePairs();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValuePairs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePairs4876); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2853:1: ruleAnnotationValuePairs returns [EObject current=null] : ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* ) ;
    public final EObject ruleAnnotationValuePairs() throws RecognitionException {
        EObject current = null;

        EObject lv_first_0_0 = null;

        EObject lv_listValue_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2858:6: ( ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2859:1: ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2859:1: ( ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2859:2: ( (lv_first_0_0= ruleAnnotationValuePair ) ) ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2859:2: ( (lv_first_0_0= ruleAnnotationValuePair ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2860:1: (lv_first_0_0= ruleAnnotationValuePair )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2860:1: (lv_first_0_0= ruleAnnotationValuePair )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2861:3: lv_first_0_0= ruleAnnotationValuePair
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairsAccess().getFirstAnnotationValuePairParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4922);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2883:2: ( ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2883:4: ',' ( (lv_listValue_2_0= ruleAnnotationValuePair ) )
            	    {
            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleAnnotationValuePairs4933); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAnnotationValuePairsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2887:1: ( (lv_listValue_2_0= ruleAnnotationValuePair ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2888:1: (lv_listValue_2_0= ruleAnnotationValuePair )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2888:1: (lv_listValue_2_0= ruleAnnotationValuePair )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2889:3: lv_listValue_2_0= ruleAnnotationValuePair
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairsAccess().getListValueAnnotationValuePairParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4954);
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
            	    break loop42;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2919:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2920:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2921:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValuePairRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4992);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePair5002); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2928:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2933:6: ( ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2934:1: ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2934:1: ( ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2934:2: ( (lv_id_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2934:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2935:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2935:1: (lv_id_0_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2936:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValuePair5044); if (failed) return current;
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruleAnnotationValuePair5059); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2962:1: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2963:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2963:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2964:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair5080);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2994:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2995:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2996:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue5116);
            iv_ruleAnnotationValue=ruleAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValue5126); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3003:1: ruleAnnotationValue returns [EObject current=null] : ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_4 = null;

        EObject this_ArrayAnnotationValue_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3008:6: ( ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3009:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3009:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )
            int alt43=7;
            switch ( input.LA(1) ) {
            case RULE_ADDITIVEOPERATION:
            case RULE_INT:
                {
                alt43=1;
                }
                break;
            case 41:
                {
                alt43=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt43=3;
                }
                break;
            case RULE_ID:
                {
                alt43=4;
                }
                break;
            case 40:
                {
                alt43=5;
                }
                break;
            case 20:
                {
                alt43=6;
                }
                break;
            case RULE_STRING:
                {
                alt43=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3009:1: ( rulesignedINT | 'null' | RULE_BOOLEAN | RULE_ID | this_Annotation_4= ruleAnnotation | this_ArrayAnnotationValue_5= ruleArrayAnnotationValue | RULE_STRING )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3009:2: rulesignedINT
                    {
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleAnnotationValue5160);
                    rulesignedINT();
                    _fsp--;
                    if (failed) return current;

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3010:7: 'null'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotationValue5168); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAnnotationValueAccess().getNullKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3015:6: RULE_BOOLEAN
                    {
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5183); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getBooleanTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3020:6: RULE_ID
                    {
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValue5197); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnnotationValueAccess().getIDTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3026:2: this_Annotation_4= ruleAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getAnnotationParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationValue5227);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3039:2: this_ArrayAnnotationValue_5= ruleArrayAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationValueAccess().getArrayAnnotationValueParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5257);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3051:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnnotationValue5271); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3063:1: entryRuleArrayAnnotationValue returns [EObject current=null] : iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF ;
    public final EObject entryRuleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3064:2: (iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3065:2: iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrayAnnotationValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5306);
            iv_ruleArrayAnnotationValue=ruleArrayAnnotationValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrayAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayAnnotationValue5316); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3072:1: ruleArrayAnnotationValue returns [EObject current=null] : ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' ) ;
    public final EObject ruleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject lv_firstValue_1_0 = null;

        EObject lv_values_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3077:6: ( ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3078:1: ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3078:1: ( '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3078:3: '{' ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )? '}'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleArrayAnnotationValue5351); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3082:1: ( ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||(LA45_0>=RULE_BOOLEAN && LA45_0<=RULE_INT)||LA45_0==20||(LA45_0>=40 && LA45_0<=41)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3082:2: ( (lv_firstValue_1_0= ruleAnnotationValue ) ) ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3082:2: ( (lv_firstValue_1_0= ruleAnnotationValue ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3083:1: (lv_firstValue_1_0= ruleAnnotationValue )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3083:1: (lv_firstValue_1_0= ruleAnnotationValue )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3084:3: lv_firstValue_1_0= ruleAnnotationValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getFirstValueAnnotationValueParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5373);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3106:2: ( ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==26) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3106:4: ',' ( (lv_values_3_0= ruleAnnotationValue ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleArrayAnnotationValue5384); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getArrayAnnotationValueAccess().getCommaKeyword_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3110:1: ( (lv_values_3_0= ruleAnnotationValue ) )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:1: (lv_values_3_0= ruleAnnotationValue )
                    	    {
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:1: (lv_values_3_0= ruleAnnotationValue )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3112:3: lv_values_3_0= ruleAnnotationValue
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5405);
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,21,FollowSets000.FOLLOW_21_in_ruleArrayAnnotationValue5419); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3146:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3147:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3148:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignedINTRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT5456);
            iv_rulesignedINT=rulesignedINT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT5467); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3155:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AdditiveOperation_0=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3160:6: ( ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3161:1: ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3161:1: ( (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3161:2: (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )? this_INT_1= RULE_INT
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3161:2: (this_AdditiveOperation_0= RULE_ADDITIVEOPERATION )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ADDITIVEOPERATION) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3161:7: this_AdditiveOperation_0= RULE_ADDITIVEOPERATION
                    {
                    this_AdditiveOperation_0=(Token)input.LT(1);
                    match(input,RULE_ADDITIVEOPERATION,FollowSets000.FOLLOW_RULE_ADDITIVEOPERATION_in_rulesignedINT5508); if (failed) return current;
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
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT5530); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3183:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3184:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3185:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5575);
            iv_ruleConstantExpression=ruleConstantExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantExpression5585); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3192:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3197:6: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3199:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5634);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3218:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3219:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3220:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5668);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression5678); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3227:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3232:6: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3233:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3233:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3233:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3233:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3234:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3234:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3235:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5724);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3257:2: ( '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==42) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3257:4: '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleLogicalOrExpression5735); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3261:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3262:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3262:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3263:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5756);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3293:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3294:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3295:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5794);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression5804); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3302:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3307:6: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3309:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3309:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3310:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5850);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3332:2: ( '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3332:4: '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleLogicalAndExpression5861); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3336:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3337:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3337:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3338:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5882);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3368:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3369:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3370:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression5920);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression5930); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3377:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3382:6: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3383:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3383:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3383:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3383:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3384:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3384:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3385:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleOrExpression5976);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3407:2: ( '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3407:4: '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleOrExpression5987); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3411:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3412:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3412:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3413:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleOrExpression6008);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3443:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3444:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3445:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getXorExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_entryRuleXorExpression6046);
            iv_ruleXorExpression=ruleXorExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXorExpression6056); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3452:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3457:6: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3458:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3458:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3458:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3458:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3459:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3459:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3460:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleXorExpression6102);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3482:2: ( '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3482:4: '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleXorExpression6113); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3486:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3487:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3487:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3488:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleXorExpression6134);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3518:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3519:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3520:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression6172);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression6182); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3527:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3532:6: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3533:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3533:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3533:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3533:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3534:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3534:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3535:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleAndExpression6228);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3557:2: ( '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3557:4: '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleAndExpression6239); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3561:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3562:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3562:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3563:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleAndExpression6260);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3593:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3594:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3595:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShiftExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6298);
            iv_ruleShiftExpression=ruleShiftExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShiftExpression6308); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3602:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3607:6: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3608:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3608:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3608:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3608:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3609:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3609:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3610:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6354);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3632:2: ( ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_SHIFTOPERATION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3632:3: ( (lv_op_1_0= RULE_SHIFTOPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3632:3: ( (lv_op_1_0= RULE_SHIFTOPERATION ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3633:1: (lv_op_1_0= RULE_SHIFTOPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3633:1: (lv_op_1_0= RULE_SHIFTOPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3634:3: lv_op_1_0= RULE_SHIFTOPERATION
                    {
                    lv_op_1_0=(Token)input.LT(1);
                    match(input,RULE_SHIFTOPERATION,FollowSets000.FOLLOW_RULE_SHIFTOPERATION_in_ruleShiftExpression6372); if (failed) return current;
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3656:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3657:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3657:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3658:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleShiftExpression6398);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3688:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3689:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3690:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditiveExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6436);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression6446); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3697:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3702:6: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3703:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3703:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3703:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3703:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3704:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3704:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3705:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6492);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3727:2: ( ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ADDITIVEOPERATION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3727:3: ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3727:3: ( (lv_op_1_0= RULE_ADDITIVEOPERATION ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3728:1: (lv_op_1_0= RULE_ADDITIVEOPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3728:1: (lv_op_1_0= RULE_ADDITIVEOPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3729:3: lv_op_1_0= RULE_ADDITIVEOPERATION
                    {
                    lv_op_1_0=(Token)input.LT(1);
                    match(input,RULE_ADDITIVEOPERATION,FollowSets000.FOLLOW_RULE_ADDITIVEOPERATION_in_ruleAdditiveExpression6510); if (failed) return current;
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3751:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3752:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3752:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3753:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6536);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3783:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3784:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3785:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_entryRuleMulExpression6574);
            iv_ruleMulExpression=ruleMulExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMulExpression6584); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3792:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3797:6: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3798:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3798:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3798:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3798:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3799:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3799:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3800:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleMulExpression6630);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3822:2: ( ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_MULOPERATION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3822:3: ( (lv_op_1_0= RULE_MULOPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3822:3: ( (lv_op_1_0= RULE_MULOPERATION ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3823:1: (lv_op_1_0= RULE_MULOPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3823:1: (lv_op_1_0= RULE_MULOPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3824:3: lv_op_1_0= RULE_MULOPERATION
                    {
                    lv_op_1_0=(Token)input.LT(1);
                    match(input,RULE_MULOPERATION,FollowSets000.FOLLOW_RULE_MULOPERATION_in_ruleMulExpression6648); if (failed) return current;
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3846:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3847:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3847:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3848:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleMulExpression6674);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3878:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3879:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3880:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCastExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_entryRuleCastExpression6712);
            iv_ruleCastExpression=ruleCastExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCastExpression6722); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3887:1: ruleCastExpression returns [EObject current=null] : ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3892:6: ( ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 23:
                case 25:
                case 37:
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
                    {
                    alt55=1;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ADDITIVEOPERATION:
                    case RULE_SHIFTOPERATION:
                    case RULE_MULOPERATION:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt55=2;
                        }
                        break;
                    case 30:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_SHIFTOPERATION:
                        case RULE_MULOPERATION:
                        case 18:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 25:
                        case 26:
                        case 30:
                        case 32:
                        case 34:
                        case 35:
                        case 40:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            {
                            alt55=2;
                            }
                            break;
                        case RULE_ADDITIVEOPERATION:
                            {
                            int LA55_6 = input.LA(5);

                            if ( ((LA55_6>=RULE_ID && LA55_6<=RULE_STRING)||LA55_6==RULE_ADDITIVEOPERATION||LA55_6==RULE_UNARYOPERATION||LA55_6==29||LA55_6==33) ) {
                                alt55=2;
                            }
                            else if ( (LA55_6==RULE_INT) ) {
                                int LA55_7 = input.LA(6);

                                if ( (synpred65()) ) {
                                    alt55=1;
                                }
                                else if ( (true) ) {
                                    alt55=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 55, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 55, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_UNARYOPERATION:
                        case 29:
                        case 33:
                            {
                            alt55=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 55, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 33:
                        {
                        alt55=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 55, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STRING:
                case RULE_ADDITIVEOPERATION:
                case RULE_INT:
                case RULE_UNARYOPERATION:
                case 29:
                case 33:
                    {
                    alt55=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 55, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_STRING)||(LA55_0>=RULE_ADDITIVEOPERATION && LA55_0<=RULE_INT)||LA55_0==RULE_UNARYOPERATION||LA55_0==33) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3893:1: ( ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:2: ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:2: ( '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:4: '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleCastExpression6758); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3897:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3898:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3898:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3899:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6779);
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

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleCastExpression6789); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3925:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3926:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3926:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3927:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleCastExpression6810);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3950:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3950:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3951:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3951:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3952:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleCastExpression6838);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3982:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3983:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3984:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6874);
            iv_ruleUnaryExpression=ruleUnaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression6884); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3991:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unaryExpr_0_0=null;
        EObject lv_primaryExpr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3996:6: ( ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3997:1: ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3997:1: ( ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3997:2: ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3997:2: ( (lv_unaryExpr_0_0= RULE_UNARYOPERATION ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_UNARYOPERATION) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3998:1: (lv_unaryExpr_0_0= RULE_UNARYOPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3998:1: (lv_unaryExpr_0_0= RULE_UNARYOPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3999:3: lv_unaryExpr_0_0= RULE_UNARYOPERATION
                    {
                    lv_unaryExpr_0_0=(Token)input.LT(1);
                    match(input,RULE_UNARYOPERATION,FollowSets000.FOLLOW_RULE_UNARYOPERATION_in_ruleUnaryExpression6926); if (failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4021:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4022:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4022:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4023:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6953);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4053:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4054:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4055:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6989);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression6999); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4062:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4067:6: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4068:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4068:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||(LA57_0>=RULE_ADDITIVEOPERATION && LA57_0<=RULE_INT)||LA57_0==33) ) {
                alt57=1;
            }
            else if ( (LA57_0==29) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4068:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( '(' this_ConstantExpression_2= ruleConstantExpression ')' ) )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4068:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4068:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4069:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4069:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4070:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression7045);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4093:6: ( '(' this_ConstantExpression_2= ruleConstantExpression ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4093:6: ( '(' this_ConstantExpression_2= ruleConstantExpression ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4093:8: '(' this_ConstantExpression_2= ruleConstantExpression ')'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rulePrimaryExpression7062); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_rulePrimaryExpression7087);
                    this_ConstantExpression_2=ruleConstantExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaryExpression7096); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4121:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4122:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4123:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral7133);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral7143); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4130:1: ruleLiteral returns [EObject current=null] : ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4135:6: ( ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4136:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4136:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA58_1 = input.LA(2);

                if ( (synpred68()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4136:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt58=2;
                }
                break;
            case RULE_ADDITIVEOPERATION:
            case RULE_INT:
            case 33:
                {
                alt58=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4136:1: ( RULE_ID | RULE_STRING | ruleFloatingPointLiteral | ( ( RULE_ID ) ) )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4136:2: RULE_ID
                    {
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral7177); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4141:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral7191); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4146:6: ruleFloatingPointLiteral
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7205);
                    ruleFloatingPointLiteral();
                    _fsp--;
                    if (failed) return current;

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4147:6: ( ( RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4147:6: ( ( RULE_ID ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4148:1: ( RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4148:1: ( RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4149:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral7225); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4172:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4173:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4174:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatingPointLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7262);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatingPointLiteral7273); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4181:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4186:6: ( ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:3: (this_signedINT_0= rulesignedINT )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=RULE_ADDITIVEOPERATION && LA59_0<=RULE_INT)) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4188:5: this_signedINT_0= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_0(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7322);
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
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    kw=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleFloatingPointLiteral7342); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4204:1: (this_signedINT_2= rulesignedINT )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ADDITIVEOPERATION) ) {
                            int LA60_2 = input.LA(2);

                            if ( (LA60_2==RULE_INT) ) {
                                int LA60_4 = input.LA(3);

                                if ( (synpred72()) ) {
                                    alt60=1;
                                }


                            }


                        }
                        else if ( (LA60_0==RULE_INT) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4205:5: this_signedINT_2= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7365);
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
                    	    break loop60;
                        }
                    } while (true);

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4215:3: (this_Exponent_3= ruleExponent )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=47 && LA61_0<=48)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4216:5: this_Exponent_3= ruleExponent
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_0_3(), currentNode); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7395);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4226:3: (this_FDsymbol_4= RULE_FDSYMBOL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_FDSYMBOL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4226:8: this_FDsymbol_4= RULE_FDSYMBOL
                            {
                            this_FDsymbol_4=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7418); if (failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4234:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4234:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4235:2: kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleFloatingPointLiteral7446); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4240:1: (this_signedINT_6= rulesignedINT )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ADDITIVEOPERATION) ) {
                            int LA63_2 = input.LA(2);

                            if ( (LA63_2==RULE_INT) ) {
                                int LA63_4 = input.LA(3);

                                if ( (synpred76()) ) {
                                    alt63=1;
                                }


                            }


                        }
                        else if ( (LA63_0==RULE_INT) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4241:5: this_signedINT_6= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7469);
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
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4251:3: (this_Exponent_7= ruleExponent )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=47 && LA64_0<=48)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4252:5: this_Exponent_7= ruleExponent
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_1_2(), currentNode); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7499);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4262:3: (this_FDsymbol_8= RULE_FDSYMBOL )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_FDSYMBOL) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4262:8: this_FDsymbol_8= RULE_FDSYMBOL
                            {
                            this_FDsymbol_8=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7522); if (failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:7: (this_signedINT_9= rulesignedINT )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( ((LA66_0>=RULE_ADDITIVEOPERATION && LA66_0<=RULE_INT)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4271:5: this_signedINT_9= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7560);
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
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);

                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7589);
                    this_Exponent_10=ruleExponent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4292:1: (this_FDsymbol_11= RULE_FDSYMBOL )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_FDSYMBOL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4292:6: this_FDsymbol_11= RULE_FDSYMBOL
                            {
                            this_FDsymbol_11=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7610); if (failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4300:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4300:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4300:7: (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4300:7: (this_signedINT_12= rulesignedINT )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_ADDITIVEOPERATION) ) {
                            int LA68_2 = input.LA(2);

                            if ( (synpred83()) ) {
                                alt68=1;
                            }


                        }
                        else if ( (LA68_0==RULE_INT) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4301:5: this_signedINT_12= rulesignedINT
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	              currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0(), currentNode); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7648);
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
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4311:3: (this_Exponent_13= ruleExponent )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=47 && LA69_0<=48)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4312:5: this_Exponent_13= ruleExponent
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_3_1(), currentNode); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7678);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4322:3: (this_FDsymbol_14= RULE_FDSYMBOL )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_FDSYMBOL) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4322:8: this_FDsymbol_14= RULE_FDSYMBOL
                            {
                            this_FDsymbol_14=(Token)input.LT(1);
                            match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7701); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4337:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4338:2: (iv_ruleExponent= ruleExponent EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4339:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExponentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_entryRuleExponent7750);
            iv_ruleExponent=ruleExponent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExponent7761); if (failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4346:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_AdditiveOperation_2=null;
        Token this_INT_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4351:6: ( ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4352:1: ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4352:1: ( (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+ )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4352:2: (kw= 'e' | kw= 'E' ) (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )? (this_INT_3= RULE_INT )+
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4352:2: (kw= 'e' | kw= 'E' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==47) ) {
                alt72=1;
            }
            else if ( (LA72_0==48) ) {
                alt72=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4352:2: (kw= 'e' | kw= 'E' )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4353:2: kw= 'e'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleExponent7800); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getExponentAccess().getEKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4360:2: kw= 'E'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleExponent7819); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getExponentAccess().getEKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4365:2: (this_AdditiveOperation_2= RULE_ADDITIVEOPERATION )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ADDITIVEOPERATION) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4365:7: this_AdditiveOperation_2= RULE_ADDITIVEOPERATION
                    {
                    this_AdditiveOperation_2=(Token)input.LT(1);
                    match(input,RULE_ADDITIVEOPERATION,FollowSets000.FOLLOW_RULE_ADDITIVEOPERATION_in_ruleExponent7836); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_AdditiveOperation_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getExponentAccess().getAdditiveOperationTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4372:3: (this_INT_3= RULE_INT )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_INT) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4372:8: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)input.LT(1);
            	    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExponent7859); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getExponentAccess().getINTTerminalRuleCall_2(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4387:1: ruleTypeQualifier returns [Enumerator current=null] : ( ( 'const' ) | ( 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4391:6: ( ( ( 'const' ) | ( 'volatile' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4392:1: ( ( 'const' ) | ( 'volatile' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4392:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==49) ) {
                alt75=1;
            }
            else if ( (LA75_0==50) ) {
                alt75=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4392:1: ( ( 'const' ) | ( 'volatile' ) )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4392:2: ( 'const' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4392:2: ( 'const' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4392:4: 'const'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleTypeQualifier7918); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4398:6: ( 'volatile' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4398:6: ( 'volatile' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4398:8: 'volatile'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleTypeQualifier7933); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4408:1: ruleTypeSpecifier returns [Enumerator current=null] : ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4412:6: ( ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4413:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4413:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )
            int alt76=20;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt76=1;
                }
                break;
            case 51:
                {
                alt76=2;
                }
                break;
            case 52:
                {
                alt76=3;
                }
                break;
            case 53:
                {
                alt76=4;
                }
                break;
            case 54:
                {
                alt76=5;
                }
                break;
            case 55:
                {
                alt76=6;
                }
                break;
            case 56:
                {
                alt76=7;
                }
                break;
            case 57:
                {
                alt76=8;
                }
                break;
            case 58:
                {
                alt76=9;
                }
                break;
            case 59:
                {
                alt76=10;
                }
                break;
            case 60:
                {
                alt76=11;
                }
                break;
            case 61:
                {
                alt76=12;
                }
                break;
            case 62:
                {
                alt76=13;
                }
                break;
            case 63:
                {
                alt76=14;
                }
                break;
            case 64:
                {
                alt76=15;
                }
                break;
            case 65:
                {
                alt76=16;
                }
                break;
            case 66:
                {
                alt76=17;
                }
                break;
            case 67:
                {
                alt76=18;
                }
                break;
            case 68:
                {
                alt76=19;
                }
                break;
            case 69:
                {
                alt76=20;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4413:1: ( ( 'void' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'signed' ) | ( 'unsigned' ) | ( 'string' ) | ( 'int8_t' ) | ( 'uint8_t' ) | ( 'int16_t' ) | ( 'uint16_t' ) | ( 'int32_t' ) | ( 'uint32_t' ) | ( 'int64_t' ) | ( 'uint64_t' ) | ( 'intptr_t' ) | ( 'uintptr_t' ) )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4413:2: ( 'void' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4413:2: ( 'void' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4413:4: 'void'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleTypeSpecifier7976); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4419:6: ( 'char' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4419:6: ( 'char' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4419:8: 'char'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeSpecifier7991); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4425:6: ( 'short' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4425:6: ( 'short' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4425:8: 'short'
                    {
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeSpecifier8006); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4431:6: ( 'int' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4431:6: ( 'int' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4431:8: 'int'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeSpecifier8021); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4437:6: ( 'long' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4437:6: ( 'long' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4437:8: 'long'
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleTypeSpecifier8036); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4443:6: ( 'float' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4443:6: ( 'float' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4443:8: 'float'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleTypeSpecifier8051); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4449:6: ( 'double' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4449:6: ( 'double' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4449:8: 'double'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleTypeSpecifier8066); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4455:6: ( 'signed' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4455:6: ( 'signed' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4455:8: 'signed'
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleTypeSpecifier8081); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4461:6: ( 'unsigned' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4461:6: ( 'unsigned' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4461:8: 'unsigned'
                    {
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeSpecifier8096); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4467:6: ( 'string' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4467:6: ( 'string' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4467:8: 'string'
                    {
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleTypeSpecifier8111); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4473:6: ( 'int8_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4473:6: ( 'int8_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4473:8: 'int8_t'
                    {
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeSpecifier8126); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10(), null); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4479:6: ( 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4479:6: ( 'uint8_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4479:8: 'uint8_t'
                    {
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeSpecifier8141); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4485:6: ( 'int16_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4485:6: ( 'int16_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4485:8: 'int16_t'
                    {
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeSpecifier8156); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12(), null); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4491:6: ( 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4491:6: ( 'uint16_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4491:8: 'uint16_t'
                    {
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeSpecifier8171); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4497:6: ( 'int32_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4497:6: ( 'int32_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4497:8: 'int32_t'
                    {
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeSpecifier8186); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14(), null); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4503:6: ( 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4503:6: ( 'uint32_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4503:8: 'uint32_t'
                    {
                    match(input,65,FollowSets000.FOLLOW_65_in_ruleTypeSpecifier8201); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15(), null); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4509:6: ( 'int64_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4509:6: ( 'int64_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4509:8: 'int64_t'
                    {
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleTypeSpecifier8216); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16(), null); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4515:6: ( 'uint64_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4515:6: ( 'uint64_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4515:8: 'uint64_t'
                    {
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleTypeSpecifier8231); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4521:6: ( 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4521:6: ( 'intptr_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4521:8: 'intptr_t'
                    {
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleTypeSpecifier8246); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18(), null); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4527:6: ( 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4527:6: ( 'uintptr_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4527:8: 'uintptr_t'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleTypeSpecifier8261); if (failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4537:1: ruleParameterQualifier returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4541:6: ( ( ( 'in' ) | ( 'out' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4542:1: ( ( 'in' ) | ( 'out' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4542:1: ( ( 'in' ) | ( 'out' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==70) ) {
                alt77=1;
            }
            else if ( (LA77_0==71) ) {
                alt77=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4542:1: ( ( 'in' ) | ( 'out' ) )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4542:2: ( 'in' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4542:2: ( 'in' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4542:4: 'in'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleParameterQualifier8304); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4548:6: ( 'out' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4548:6: ( 'out' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4548:8: 'out'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleParameterQualifier8319); if (failed) return current;
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

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:3: ( ( '(' ( 'void' )? ')' ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:3: ( '(' ( 'void' )? ')' )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:3: ( '(' ( 'void' )? ')' )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2254:5: '(' ( 'void' )? ')'
        {
        match(input,29,FollowSets000.FOLLOW_29_in_synpred373896); if (failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2258:1: ( 'void' )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==37) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2258:3: 'void'
                {
                match(input,37,FollowSets000.FOLLOW_37_in_synpred373907); if (failed) return ;

                }
                break;

        }

        match(input,30,FollowSets000.FOLLOW_30_in_synpred373919); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:3: ( ( ( ruleDeclarator ) ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:3: ( ( ruleDeclarator ) )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:3: ( ( ruleDeclarator ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2482:1: ( ruleDeclarator )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2482:1: ( ruleDeclarator )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2483:3: ruleDeclarator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_synpred414286);
        ruleDeclarator();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:2: ( ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:2: ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:2: ( '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3893:4: '(' ( ( ruleQualifiedTypeSpecification ) ) ')' ( ( ruleCastExpression ) )
        {
        match(input,29,FollowSets000.FOLLOW_29_in_synpred656758); if (failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3897:1: ( ( ruleQualifiedTypeSpecification ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3898:1: ( ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3898:1: ( ruleQualifiedTypeSpecification )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3899:3: ruleQualifiedTypeSpecification
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_synpred656779);
        ruleQualifiedTypeSpecification();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,30,FollowSets000.FOLLOW_30_in_synpred656789); if (failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3925:1: ( ( ruleCastExpression ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3926:1: ( ruleCastExpression )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3926:1: ( ruleCastExpression )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3927:3: ruleCastExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_synpred656810);
        ruleCastExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4136:2: ( RULE_ID )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4136:2: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred687177); if (failed) return ;

        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred72
    public final void synpred72_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4205:5: ( rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4205:5: rulesignedINT
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred727365);
        rulesignedINT();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred72

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:2: ( ( ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:2: ( ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:2: ( ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:3: ( rulesignedINT )+ '.' ( rulesignedINT )* ( ruleExponent )? ( RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4187:3: ( rulesignedINT )+
        int cnt81=0;
        loop81:
        do {
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_ADDITIVEOPERATION && LA81_0<=RULE_INT)) ) {
                alt81=1;
            }


            switch (alt81) {
        	case 1 :
        	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4188:5: rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred757322);
        	    rulesignedINT();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt81 >= 1 ) break loop81;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(81, input);
                    throw eee;
            }
            cnt81++;
        } while (true);

        match(input,33,FollowSets000.FOLLOW_33_in_synpred757342); if (failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4204:1: ( rulesignedINT )*
        loop82:
        do {
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ADDITIVEOPERATION && LA82_0<=RULE_INT)) ) {
                alt82=1;
            }


            switch (alt82) {
        	case 1 :
        	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4205:5: rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred757365);
        	    rulesignedINT();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop82;
            }
        } while (true);

        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4215:3: ( ruleExponent )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( ((LA83_0>=47 && LA83_0<=48)) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4216:5: ruleExponent
                {
                pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred757395);
                ruleExponent();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4226:3: ( RULE_FDSYMBOL )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_FDSYMBOL) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4226:8: RULE_FDSYMBOL
                {
                match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred757418); if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4241:5: ( rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4241:5: rulesignedINT
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred767469);
        rulesignedINT();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:6: ( ( ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:6: ( ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:6: ( ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:7: ( rulesignedINT )+ ruleExponent ( RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4270:7: ( rulesignedINT )+
        int cnt88=0;
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_ADDITIVEOPERATION && LA88_0<=RULE_INT)) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4271:5: rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred827560);
        	    rulesignedINT();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt88 >= 1 ) break loop88;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(88, input);
                    throw eee;
            }
            cnt88++;
        } while (true);

        pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred827589);
        ruleExponent();
        _fsp--;
        if (failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4292:1: ( RULE_FDSYMBOL )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_FDSYMBOL) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4292:6: RULE_FDSYMBOL
                {
                match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred827610); if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4301:5: ( rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:4301:5: rulesignedINT
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0(), currentNode); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred837648);
        rulesignedINT();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred83

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
    public final boolean synpred83() {
        backtracking++;
        int start = input.mark();
        try {
            synpred83_fragment(); // can never throw exception
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
    public final boolean synpred65() {
        backtracking++;
        int start = input.mark();
        try {
            synpred65_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred72() {
        backtracking++;
        int start = input.mark();
        try {
            synpred72_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred68() {
        backtracking++;
        int start = input.mark();
        try {
            synpred68_fragment(); // can never throw exception
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
    public final boolean synpred76() {
        backtracking++;
        int start = input.mark();
        try {
            synpred76_fragment(); // can never throw exception
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


    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA71_eotS =
        "\15\uffff";
    static final String DFA71_eofS =
        "\2\uffff\1\10\12\uffff";
    static final String DFA71_minS =
        "\1\10\1\11\1\10\1\uffff\2\10\1\0\2\uffff\1\11\1\0\2\uffff";
    static final String DFA71_maxS =
        "\1\41\1\11\1\60\1\uffff\2\11\1\0\2\uffff\1\11\1\0\2\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\1\4\2\uffff\2\3";
    static final String DFA71_specialS =
        "\6\uffff\1\1\3\uffff\1\0\2\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\1\2\27\uffff\1\3",
            "\1\2",
            "\1\6\1\2\2\10\1\uffff\1\10\4\uffff\2\10\1\uffff\3\10\1\uffff"+
            "\2\10\3\uffff\1\10\1\uffff\1\10\1\7\2\10\4\uffff\1\10\1\uffff"+
            "\5\10\1\4\1\5",
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4187:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDsymbol_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDsymbol_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDsymbol_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDsymbol_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82()) ) {s = 12;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75()) ) {s = 7;}

                        else if ( (synpred82()) ) {s = 11;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleItfFile_in_entryRuleItfFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItfFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleItfFile137 = new BitSet(new long[]{0x0000018C02C80000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleItfFile160 = new BitSet(new long[]{0x0000010C02C80000L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleItfFile187 = new BitSet(new long[]{0x0000010C02C80000L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleItfFile210 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleItfFile221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition259 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition320 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition350 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition380 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypeDefinition390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTypedefSpecification471 = new BitSet(new long[]{0xFFFE002002C00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification492 = new BitSet(new long[]{0x0000000030000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification605 = new BitSet(new long[]{0xFFFE002002C00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefName_in_ruleTypeSpecification719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification806 = new BitSet(new long[]{0xFFF8002000000002L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1126 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1143 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStructOrUnionDefinition1159 = new BitSet(new long[]{0xFFFE012002E00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1180 = new BitSet(new long[]{0xFFFE012002E00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_21_in_ruleStructOrUnionDefinition1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1283 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleStructOrUnion1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleStructOrUnion1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleStructMember1506 = new BitSet(new long[]{0xFFFE002002C00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1527 = new BitSet(new long[]{0x0000000030000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1548 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleStructMember1559 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1580 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStructMember1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnumDefinition1798 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1815 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEnumDefinition1831 = new BitSet(new long[]{0x0000010000000010L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1852 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEnumDefinition1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference1898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnumReference1943 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2001 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2061 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleEnumMemberList2071 = new BitSet(new long[]{0x0000010000000010L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2092 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleEnumMember2186 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2203 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumMember2219 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2334 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleDeclarators2345 = new BitSet(new long[]{0x0000000030000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2366 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleDeclarator2460 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleAbstractDeclarator2573 = new BitSet(new long[]{0x00000000A0000002L});
        public static final BitSet FOLLOW_ruleAbstractDirectDeclarator_in_ruleAbstractDeclarator2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePointerSpecification2641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_rulePointerSpecification2699 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification2736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualified_PointerSpecification2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleQualified_PointerSpecification2793 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualified_PointerSpecification2814 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator2904 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_29_in_ruleDirectDeclarator2926 = new BitSet(new long[]{0x0000000030000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2947 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDirectDeclarator2957 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2980 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleAbstractDirectDeclarator_in_entryRuleAbstractDirectDeclarator3017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDirectDeclarator3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAbstractDirectDeclarator3063 = new BitSet(new long[]{0x00000000F0000000L});
        public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleAbstractDirectDeclarator3084 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAbstractDirectDeclarator3094 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3115 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleAbstractDirectDeclarator3144 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification3181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification3191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleArraySpecification3226 = new BitSet(new long[]{0x0000000320001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification3247 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleArraySpecification3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName3295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3346 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleFullyQualifiedName3365 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFullyQualifiedName3380 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleConstantDefinition3472 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3489 = new BitSet(new long[]{0x0000000220001332L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleInterfaceDefinition3608 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInterfaceDefinition3618 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_36_in_ruleInterfaceDefinition3629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3652 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_24_in_ruleInterfaceDefinition3663 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleInterfaceDefinition3684 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInterfaceDefinition3696 = new BitSet(new long[]{0xFFFE012002E00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3717 = new BitSet(new long[]{0xFFFE012002E00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_21_in_ruleInterfaceDefinition3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleMethodDefinition3820 = new BitSet(new long[]{0xFFFE002002C00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3841 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3862 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3879 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMethodDefinition3896 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_37_in_ruleMethodDefinition3907 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMethodDefinition3919 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_29_in_ruleMethodDefinition3937 = new BitSet(new long[]{0xFFFE012002C00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3958 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMethodDefinition3968 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMethodDefinition3980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList4016 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterList4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4072 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleParameterList4083 = new BitSet(new long[]{0xFFFE012002C00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList4104 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleParameterList4117 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleParameterList4127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_ruleParameter4221 = new BitSet(new long[]{0xFFFE002002C00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter4242 = new BitSet(new long[]{0xFFFE002002C00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4264 = new BitSet(new long[]{0x0000000030000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleParameter4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective4360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleIncludeDirective4395 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INCLUDELIB_in_ruleIncludeDirective4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations4483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotations4551 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation4633 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleAnnotation4654 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleAnnotationParameters_in_ruleAnnotation4675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters4712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationParameters4722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationParameters4769 = new BitSet(new long[]{0x00000300401003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_ruleAnnotationParameters4791 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationParameters4818 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAnnotationParameters4830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs4866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePairs4876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4922 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleAnnotationValuePairs4933 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotationValuePairs4954 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair5044 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAnnotationValuePair5059 = new BitSet(new long[]{0x00000300001003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair5080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue5116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue5126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue5160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAnnotationValue5168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue5183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValue5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationValue5227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotationValue5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue5306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayAnnotationValue5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleArrayAnnotationValue5351 = new BitSet(new long[]{0x00000300003003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5373 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_26_in_ruleArrayAnnotationValue5384 = new BitSet(new long[]{0x00000300001003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5405 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_21_in_ruleArrayAnnotationValue5419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT5456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT5467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ADDITIVEOPERATION_in_rulesignedINT5508 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT5530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression5585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5724 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleLogicalOrExpression5735 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5850 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleLogicalAndExpression5861 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression5976 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleOrExpression5987 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression6008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression6046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression6056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression6102 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleXorExpression6113 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression6134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression6172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression6182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression6228 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleAndExpression6239 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression6260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression6308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6354 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_SHIFTOPERATION_in_ruleShiftExpression6372 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression6398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6492 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_ADDITIVEOPERATION_in_ruleAdditiveExpression6510 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression6574 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression6584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression6630 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_RULE_MULOPERATION_in_ruleMulExpression6648 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression6674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression6712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression6722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCastExpression6758 = new BitSet(new long[]{0xFFFE002002C00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6779 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCastExpression6789 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UNARYOPERATION_in_ruleUnaryExpression6926 = new BitSet(new long[]{0x0000000220000330L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression7045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rulePrimaryExpression7062 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression7087 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaryExpression7096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral7191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral7262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral7273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7322 = new BitSet(new long[]{0x0000000200000300L});
        public static final BitSet FOLLOW_33_in_ruleFloatingPointLiteral7342 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7365 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7395 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFloatingPointLiteral7446 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7469 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7499 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7560 = new BitSet(new long[]{0x0001800000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7589 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7648 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7678 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExponent_in_entryRuleExponent7750 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExponent7761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleExponent7800 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_48_in_ruleExponent7819 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_RULE_ADDITIVEOPERATION_in_ruleExponent7836 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExponent7859 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_49_in_ruleTypeQualifier7918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTypeQualifier7933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleTypeSpecifier7976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTypeSpecifier7991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypeSpecifier8006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeSpecifier8021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypeSpecifier8036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTypeSpecifier8051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypeSpecifier8066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTypeSpecifier8081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTypeSpecifier8096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTypeSpecifier8111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeSpecifier8126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeSpecifier8141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeSpecifier8156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeSpecifier8171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTypeSpecifier8186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTypeSpecifier8201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTypeSpecifier8216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTypeSpecifier8231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTypeSpecifier8246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTypeSpecifier8261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleParameterQualifier8304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleParameterQualifier8319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_synpred373896 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_37_in_synpred373907 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_synpred373919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_synpred414286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_synpred656758 = new BitSet(new long[]{0xFFFE002002C00010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred656779 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_synpred656789 = new BitSet(new long[]{0x0000000220001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_synpred656810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred687177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred727365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred757322 = new BitSet(new long[]{0x0000000200000300L});
        public static final BitSet FOLLOW_33_in_synpred757342 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred757365 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred757395 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred757418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred767469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred827560 = new BitSet(new long[]{0x0001800000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred827589 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred827610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred837648 = new BitSet(new long[]{0x0000000000000002L});
    }


}