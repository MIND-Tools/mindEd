package org.ow2.fractal.mind.idl.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalItfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_INCLUDELIB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'struct'", "'union'", "'const'", "'volatile'", "'void'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'", "';'", "'typedef'", "'{'", "'}'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'...'", "'#include'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_INCLUDELIB=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalFractalItfParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g"; }


     
     	private FractalItfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FractalItfGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleItfFile
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:60:1: entryRuleItfFile : ruleItfFile EOF ;
    public final void entryRuleItfFile() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:61:1: ( ruleItfFile EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:62:1: ruleItfFile EOF
            {
             before(grammarAccess.getItfFileRule()); 
            pushFollow(FOLLOW_ruleItfFile_in_entryRuleItfFile61);
            ruleItfFile();
            _fsp--;

             after(grammarAccess.getItfFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItfFile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleItfFile


    // $ANTLR start ruleItfFile
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:69:1: ruleItfFile : ( ( rule__ItfFile__Group__0 ) ) ;
    public final void ruleItfFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:73:2: ( ( ( rule__ItfFile__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:74:1: ( ( rule__ItfFile__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:74:1: ( ( rule__ItfFile__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:75:1: ( rule__ItfFile__Group__0 )
            {
             before(grammarAccess.getItfFileAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:76:1: ( rule__ItfFile__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:76:2: rule__ItfFile__Group__0
            {
            pushFollow(FOLLOW_rule__ItfFile__Group__0_in_ruleItfFile95);
            rule__ItfFile__Group__0();
            _fsp--;


            }

             after(grammarAccess.getItfFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleItfFile


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:88:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:89:1: ( ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:90:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition122);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypeDefinition


    // $ANTLR start ruleTypeDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:97:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:101:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:102:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:102:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:103:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:104:1: ( rule__TypeDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:104:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition156);
            rule__TypeDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeDefinition


    // $ANTLR start entryRuleTypedefSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:116:1: entryRuleTypedefSpecification : ruleTypedefSpecification EOF ;
    public final void entryRuleTypedefSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:117:1: ( ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:118:1: ruleTypedefSpecification EOF
            {
             before(grammarAccess.getTypedefSpecificationRule()); 
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification183);
            ruleTypedefSpecification();
            _fsp--;

             after(grammarAccess.getTypedefSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypedefSpecification


    // $ANTLR start ruleTypedefSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:125:1: ruleTypedefSpecification : ( ( rule__TypedefSpecification__Group__0 ) ) ;
    public final void ruleTypedefSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:129:2: ( ( ( rule__TypedefSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:130:1: ( ( rule__TypedefSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:130:1: ( ( rule__TypedefSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:131:1: ( rule__TypedefSpecification__Group__0 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:132:1: ( rule__TypedefSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:132:2: rule__TypedefSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification217);
            rule__TypedefSpecification__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypedefSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypedefSpecification


    // $ANTLR start entryRuleQualifiedTypeSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:144:1: entryRuleQualifiedTypeSpecification : ruleQualifiedTypeSpecification EOF ;
    public final void entryRuleQualifiedTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:145:1: ( ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:146:1: ruleQualifiedTypeSpecification EOF
            {
             before(grammarAccess.getQualifiedTypeSpecificationRule()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification244);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getQualifiedTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification251); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQualifiedTypeSpecification


    // $ANTLR start ruleQualifiedTypeSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:153:1: ruleQualifiedTypeSpecification : ( ( rule__QualifiedTypeSpecification__Group__0 ) ) ;
    public final void ruleQualifiedTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:157:2: ( ( ( rule__QualifiedTypeSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:158:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:158:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:159:1: ( rule__QualifiedTypeSpecification__Group__0 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:160:1: ( rule__QualifiedTypeSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:160:2: rule__QualifiedTypeSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification278);
            rule__QualifiedTypeSpecification__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualifiedTypeSpecification


    // $ANTLR start entryRuleTypeSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:172:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:173:1: ( ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:174:1: ruleTypeSpecification EOF
            {
             before(grammarAccess.getTypeSpecificationRule()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification305);
            ruleTypeSpecification();
            _fsp--;

             after(grammarAccess.getTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification312); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypeSpecification


    // $ANTLR start ruleTypeSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:181:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:185:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:186:1: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:186:1: ( ( rule__TypeSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:187:1: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:188:1: ( rule__TypeSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:188:2: rule__TypeSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification339);
            rule__TypeSpecification__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeSpecification


    // $ANTLR start entryRuleTypedefName
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:200:1: entryRuleTypedefName : ruleTypedefName EOF ;
    public final void entryRuleTypedefName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:201:1: ( ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:202:1: ruleTypedefName EOF
            {
             before(grammarAccess.getTypedefNameRule()); 
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName366);
            ruleTypedefName();
            _fsp--;

             after(grammarAccess.getTypedefNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName373); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypedefName


    // $ANTLR start ruleTypedefName
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:209:1: ruleTypedefName : ( ruleFullyQualifiedName ) ;
    public final void ruleTypedefName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:213:2: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:214:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:214:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:215:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName400);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypedefName


    // $ANTLR start entryRuleStructOrUnionSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:228:1: entryRuleStructOrUnionSpecification : ruleStructOrUnionSpecification EOF ;
    public final void entryRuleStructOrUnionSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:229:1: ( ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:230:1: ruleStructOrUnionSpecification EOF
            {
             before(grammarAccess.getStructOrUnionSpecificationRule()); 
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification426);
            ruleStructOrUnionSpecification();
            _fsp--;

             after(grammarAccess.getStructOrUnionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification433); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStructOrUnionSpecification


    // $ANTLR start ruleStructOrUnionSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:237:1: ruleStructOrUnionSpecification : ( ( rule__StructOrUnionSpecification__Alternatives ) ) ;
    public final void ruleStructOrUnionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:241:2: ( ( ( rule__StructOrUnionSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:242:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:242:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:243:1: ( rule__StructOrUnionSpecification__Alternatives )
            {
             before(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:244:1: ( rule__StructOrUnionSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:244:2: rule__StructOrUnionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification460);
            rule__StructOrUnionSpecification__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructOrUnionSpecification


    // $ANTLR start entryRuleStructOrUnionDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:256:1: entryRuleStructOrUnionDefinition : ruleStructOrUnionDefinition EOF ;
    public final void entryRuleStructOrUnionDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:257:1: ( ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:258:1: ruleStructOrUnionDefinition EOF
            {
             before(grammarAccess.getStructOrUnionDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition487);
            ruleStructOrUnionDefinition();
            _fsp--;

             after(grammarAccess.getStructOrUnionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition494); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStructOrUnionDefinition


    // $ANTLR start ruleStructOrUnionDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:265:1: ruleStructOrUnionDefinition : ( ( rule__StructOrUnionDefinition__Group__0 ) ) ;
    public final void ruleStructOrUnionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:269:2: ( ( ( rule__StructOrUnionDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:270:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:270:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:271:1: ( rule__StructOrUnionDefinition__Group__0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:272:1: ( rule__StructOrUnionDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:272:2: rule__StructOrUnionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition521);
            rule__StructOrUnionDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructOrUnionDefinition


    // $ANTLR start entryRuleStructorUnionReference
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:284:1: entryRuleStructorUnionReference : ruleStructorUnionReference EOF ;
    public final void entryRuleStructorUnionReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:285:1: ( ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:286:1: ruleStructorUnionReference EOF
            {
             before(grammarAccess.getStructorUnionReferenceRule()); 
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference548);
            ruleStructorUnionReference();
            _fsp--;

             after(grammarAccess.getStructorUnionReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference555); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStructorUnionReference


    // $ANTLR start ruleStructorUnionReference
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:293:1: ruleStructorUnionReference : ( ( rule__StructorUnionReference__Group__0 ) ) ;
    public final void ruleStructorUnionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:297:2: ( ( ( rule__StructorUnionReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:298:1: ( ( rule__StructorUnionReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:298:1: ( ( rule__StructorUnionReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:299:1: ( rule__StructorUnionReference__Group__0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:300:1: ( rule__StructorUnionReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:300:2: rule__StructorUnionReference__Group__0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference582);
            rule__StructorUnionReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStructorUnionReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructorUnionReference


    // $ANTLR start entryRuleStructOrUnion
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:312:1: entryRuleStructOrUnion : ruleStructOrUnion EOF ;
    public final void entryRuleStructOrUnion() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:313:1: ( ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:314:1: ruleStructOrUnion EOF
            {
             before(grammarAccess.getStructOrUnionRule()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion609);
            ruleStructOrUnion();
            _fsp--;

             after(grammarAccess.getStructOrUnionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion616); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStructOrUnion


    // $ANTLR start ruleStructOrUnion
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:321:1: ruleStructOrUnion : ( ( rule__StructOrUnion__Alternatives ) ) ;
    public final void ruleStructOrUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:325:2: ( ( ( rule__StructOrUnion__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:326:1: ( ( rule__StructOrUnion__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:326:1: ( ( rule__StructOrUnion__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:327:1: ( rule__StructOrUnion__Alternatives )
            {
             before(grammarAccess.getStructOrUnionAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:328:1: ( rule__StructOrUnion__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:328:2: rule__StructOrUnion__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion643);
            rule__StructOrUnion__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructOrUnion


    // $ANTLR start entryRuleStructMember
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:340:1: entryRuleStructMember : ruleStructMember EOF ;
    public final void entryRuleStructMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:341:1: ( ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:342:1: ruleStructMember EOF
            {
             before(grammarAccess.getStructMemberRule()); 
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember670);
            ruleStructMember();
            _fsp--;

             after(grammarAccess.getStructMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember677); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStructMember


    // $ANTLR start ruleStructMember
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:349:1: ruleStructMember : ( ( rule__StructMember__Group__0 ) ) ;
    public final void ruleStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:353:2: ( ( ( rule__StructMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:354:1: ( ( rule__StructMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:354:1: ( ( rule__StructMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:355:1: ( rule__StructMember__Group__0 )
            {
             before(grammarAccess.getStructMemberAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:356:1: ( rule__StructMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:356:2: rule__StructMember__Group__0
            {
            pushFollow(FOLLOW_rule__StructMember__Group__0_in_ruleStructMember704);
            rule__StructMember__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructMember


    // $ANTLR start entryRuleEnumSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:368:1: entryRuleEnumSpecification : ruleEnumSpecification EOF ;
    public final void entryRuleEnumSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:369:1: ( ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:370:1: ruleEnumSpecification EOF
            {
             before(grammarAccess.getEnumSpecificationRule()); 
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification731);
            ruleEnumSpecification();
            _fsp--;

             after(grammarAccess.getEnumSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification738); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumSpecification


    // $ANTLR start ruleEnumSpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:377:1: ruleEnumSpecification : ( ( rule__EnumSpecification__Alternatives ) ) ;
    public final void ruleEnumSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:381:2: ( ( ( rule__EnumSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:382:1: ( ( rule__EnumSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:382:1: ( ( rule__EnumSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:383:1: ( rule__EnumSpecification__Alternatives )
            {
             before(grammarAccess.getEnumSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:384:1: ( rule__EnumSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:384:2: rule__EnumSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification765);
            rule__EnumSpecification__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEnumSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumSpecification


    // $ANTLR start entryRuleEnumDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:396:1: entryRuleEnumDefinition : ruleEnumDefinition EOF ;
    public final void entryRuleEnumDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:397:1: ( ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:398:1: ruleEnumDefinition EOF
            {
             before(grammarAccess.getEnumDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition792);
            ruleEnumDefinition();
            _fsp--;

             after(grammarAccess.getEnumDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition799); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumDefinition


    // $ANTLR start ruleEnumDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:405:1: ruleEnumDefinition : ( ( rule__EnumDefinition__Group__0 ) ) ;
    public final void ruleEnumDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:409:2: ( ( ( rule__EnumDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:410:1: ( ( rule__EnumDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:410:1: ( ( rule__EnumDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:411:1: ( rule__EnumDefinition__Group__0 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:412:1: ( rule__EnumDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:412:2: rule__EnumDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition826);
            rule__EnumDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumDefinition


    // $ANTLR start entryRuleEnumReference
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:424:1: entryRuleEnumReference : ruleEnumReference EOF ;
    public final void entryRuleEnumReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:425:1: ( ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:426:1: ruleEnumReference EOF
            {
             before(grammarAccess.getEnumReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference853);
            ruleEnumReference();
            _fsp--;

             after(grammarAccess.getEnumReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference860); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumReference


    // $ANTLR start ruleEnumReference
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:433:1: ruleEnumReference : ( ( rule__EnumReference__Group__0 ) ) ;
    public final void ruleEnumReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:437:2: ( ( ( rule__EnumReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:438:1: ( ( rule__EnumReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:438:1: ( ( rule__EnumReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:439:1: ( rule__EnumReference__Group__0 )
            {
             before(grammarAccess.getEnumReferenceAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:440:1: ( rule__EnumReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:440:2: rule__EnumReference__Group__0
            {
            pushFollow(FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference887);
            rule__EnumReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumReference


    // $ANTLR start entryRuleEnumMemberList
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:452:1: entryRuleEnumMemberList : ruleEnumMemberList EOF ;
    public final void entryRuleEnumMemberList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:453:1: ( ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:454:1: ruleEnumMemberList EOF
            {
             before(grammarAccess.getEnumMemberListRule()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList914);
            ruleEnumMemberList();
            _fsp--;

             after(grammarAccess.getEnumMemberListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList921); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumMemberList


    // $ANTLR start ruleEnumMemberList
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:461:1: ruleEnumMemberList : ( ( rule__EnumMemberList__Group__0 ) ) ;
    public final void ruleEnumMemberList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:465:2: ( ( ( rule__EnumMemberList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:466:1: ( ( rule__EnumMemberList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:466:1: ( ( rule__EnumMemberList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:467:1: ( rule__EnumMemberList__Group__0 )
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:468:1: ( rule__EnumMemberList__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:468:2: rule__EnumMemberList__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList948);
            rule__EnumMemberList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumMemberList


    // $ANTLR start entryRuleEnumMember
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:480:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:481:1: ( ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:482:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember975);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember982); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumMember


    // $ANTLR start ruleEnumMember
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:489:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:493:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:494:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:494:1: ( ( rule__EnumMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:495:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:496:1: ( rule__EnumMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:496:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1009);
            rule__EnumMember__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumMember


    // $ANTLR start entryRuleDeclarators
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:508:1: entryRuleDeclarators : ruleDeclarators EOF ;
    public final void entryRuleDeclarators() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:509:1: ( ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:510:1: ruleDeclarators EOF
            {
             before(grammarAccess.getDeclaratorsRule()); 
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators1036);
            ruleDeclarators();
            _fsp--;

             after(grammarAccess.getDeclaratorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators1043); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDeclarators


    // $ANTLR start ruleDeclarators
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:517:1: ruleDeclarators : ( ( rule__Declarators__Group__0 ) ) ;
    public final void ruleDeclarators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:521:2: ( ( ( rule__Declarators__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:522:1: ( ( rule__Declarators__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:522:1: ( ( rule__Declarators__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:523:1: ( rule__Declarators__Group__0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:524:1: ( rule__Declarators__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:524:2: rule__Declarators__Group__0
            {
            pushFollow(FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1070);
            rule__Declarators__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclarators


    // $ANTLR start entryRuleDeclarator
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:536:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:537:1: ( ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:538:1: ruleDeclarator EOF
            {
             before(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1097);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator1104); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDeclarator


    // $ANTLR start ruleDeclarator
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:545:1: ruleDeclarator : ( ( rule__Declarator__Group__0 ) ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:549:2: ( ( ( rule__Declarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:550:1: ( ( rule__Declarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:550:1: ( ( rule__Declarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:551:1: ( rule__Declarator__Group__0 )
            {
             before(grammarAccess.getDeclaratorAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:552:1: ( rule__Declarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:552:2: rule__Declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1131);
            rule__Declarator__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclarator


    // $ANTLR start entryRuleDirectDeclarator
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:564:1: entryRuleDirectDeclarator : ruleDirectDeclarator EOF ;
    public final void entryRuleDirectDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:565:1: ( ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:566:1: ruleDirectDeclarator EOF
            {
             before(grammarAccess.getDirectDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1158);
            ruleDirectDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator1165); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDirectDeclarator


    // $ANTLR start ruleDirectDeclarator
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:573:1: ruleDirectDeclarator : ( ( rule__DirectDeclarator__Group__0 ) ) ;
    public final void ruleDirectDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:577:2: ( ( ( rule__DirectDeclarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:578:1: ( ( rule__DirectDeclarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:578:1: ( ( rule__DirectDeclarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:579:1: ( rule__DirectDeclarator__Group__0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:580:1: ( rule__DirectDeclarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:580:2: rule__DirectDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1192);
            rule__DirectDeclarator__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDirectDeclaratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDirectDeclarator


    // $ANTLR start entryRuleArraySpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:592:1: entryRuleArraySpecification : ruleArraySpecification EOF ;
    public final void entryRuleArraySpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:593:1: ( ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:594:1: ruleArraySpecification EOF
            {
             before(grammarAccess.getArraySpecificationRule()); 
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1219);
            ruleArraySpecification();
            _fsp--;

             after(grammarAccess.getArraySpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification1226); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArraySpecification


    // $ANTLR start ruleArraySpecification
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:601:1: ruleArraySpecification : ( ( rule__ArraySpecification__Group__0 ) ) ;
    public final void ruleArraySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:605:2: ( ( ( rule__ArraySpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:606:1: ( ( rule__ArraySpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:606:1: ( ( rule__ArraySpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:607:1: ( rule__ArraySpecification__Group__0 )
            {
             before(grammarAccess.getArraySpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:608:1: ( rule__ArraySpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:608:2: rule__ArraySpecification__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1253);
            rule__ArraySpecification__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArraySpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArraySpecification


    // $ANTLR start entryRuleFullyQualifiedName
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:620:1: entryRuleFullyQualifiedName : ruleFullyQualifiedName EOF ;
    public final void entryRuleFullyQualifiedName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:621:1: ( ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:622:1: ruleFullyQualifiedName EOF
            {
             before(grammarAccess.getFullyQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1280);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getFullyQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName1287); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFullyQualifiedName


    // $ANTLR start ruleFullyQualifiedName
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:629:1: ruleFullyQualifiedName : ( ( rule__FullyQualifiedName__Group__0 ) ) ;
    public final void ruleFullyQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:633:2: ( ( ( rule__FullyQualifiedName__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:634:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:634:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:635:1: ( rule__FullyQualifiedName__Group__0 )
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:636:1: ( rule__FullyQualifiedName__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:636:2: rule__FullyQualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1314);
            rule__FullyQualifiedName__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFullyQualifiedName


    // $ANTLR start entryRuleConstantDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:648:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:649:1: ( ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:650:1: ruleConstantDefinition EOF
            {
             before(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1341);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getConstantDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition1348); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleConstantDefinition


    // $ANTLR start ruleConstantDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:657:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:661:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:662:1: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:662:1: ( ( rule__ConstantDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:663:1: ( rule__ConstantDefinition__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:664:1: ( rule__ConstantDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:664:2: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1375);
            rule__ConstantDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstantDefinition


    // $ANTLR start entryRuleInterfaceDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:676:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:677:1: ( ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:678:1: ruleInterfaceDefinition EOF
            {
             before(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1402);
            ruleInterfaceDefinition();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition1409); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInterfaceDefinition


    // $ANTLR start ruleInterfaceDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:685:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:689:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:690:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:690:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:691:1: ( rule__InterfaceDefinition__Group__0 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:692:1: ( rule__InterfaceDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:692:2: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1436);
            rule__InterfaceDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInterfaceDefinition


    // $ANTLR start entryRuleMethodDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:704:1: entryRuleMethodDefinition : ruleMethodDefinition EOF ;
    public final void entryRuleMethodDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:705:1: ( ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:706:1: ruleMethodDefinition EOF
            {
             before(grammarAccess.getMethodDefinitionRule()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1463);
            ruleMethodDefinition();
            _fsp--;

             after(grammarAccess.getMethodDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition1470); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMethodDefinition


    // $ANTLR start ruleMethodDefinition
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:713:1: ruleMethodDefinition : ( ( rule__MethodDefinition__Group__0 ) ) ;
    public final void ruleMethodDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:717:2: ( ( ( rule__MethodDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:718:1: ( ( rule__MethodDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:718:1: ( ( rule__MethodDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:719:1: ( rule__MethodDefinition__Group__0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:720:1: ( rule__MethodDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:720:2: rule__MethodDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1497);
            rule__MethodDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMethodDefinition


    // $ANTLR start entryRuleParameterList
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:732:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:733:1: ( ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:734:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1524);
            ruleParameterList();
            _fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1531); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParameterList


    // $ANTLR start ruleParameterList
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:741:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:745:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:746:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:746:1: ( ( rule__ParameterList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:747:1: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:748:1: ( rule__ParameterList__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:748:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1558);
            rule__ParameterList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParameterList


    // $ANTLR start entryRuleParameter
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:760:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:761:1: ( ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:762:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1585);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1592); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:769:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:773:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:774:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:774:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:775:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:776:1: ( rule__Parameter__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:776:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1619);
            rule__Parameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleIncludeDirective
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:788:1: entryRuleIncludeDirective : ruleIncludeDirective EOF ;
    public final void entryRuleIncludeDirective() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:789:1: ( ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:790:1: ruleIncludeDirective EOF
            {
             before(grammarAccess.getIncludeDirectiveRule()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1646);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getIncludeDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective1653); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIncludeDirective


    // $ANTLR start ruleIncludeDirective
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:797:1: ruleIncludeDirective : ( ( rule__IncludeDirective__Group__0 ) ) ;
    public final void ruleIncludeDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:801:2: ( ( ( rule__IncludeDirective__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:802:1: ( ( rule__IncludeDirective__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:802:1: ( ( rule__IncludeDirective__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:803:1: ( rule__IncludeDirective__Group__0 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:804:1: ( rule__IncludeDirective__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:804:2: rule__IncludeDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1680);
            rule__IncludeDirective__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIncludeDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIncludeDirective


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:817:1: ruleTypeQualifier : ( ( rule__TypeQualifier__Alternatives ) ) ;
    public final void ruleTypeQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:821:1: ( ( ( rule__TypeQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:822:1: ( ( rule__TypeQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:822:1: ( ( rule__TypeQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:823:1: ( rule__TypeQualifier__Alternatives )
            {
             before(grammarAccess.getTypeQualifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:824:1: ( rule__TypeQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:824:2: rule__TypeQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1717);
            rule__TypeQualifier__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeQualifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeQualifier


    // $ANTLR start ruleTypeSpecifier
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:836:1: ruleTypeSpecifier : ( ( rule__TypeSpecifier__Alternatives ) ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:840:1: ( ( ( rule__TypeSpecifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:841:1: ( ( rule__TypeSpecifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:841:1: ( ( rule__TypeSpecifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:842:1: ( rule__TypeSpecifier__Alternatives )
            {
             before(grammarAccess.getTypeSpecifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:843:1: ( rule__TypeSpecifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:843:2: rule__TypeSpecifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1753);
            rule__TypeSpecifier__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeSpecifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeSpecifier


    // $ANTLR start ruleParameterQualifier
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:855:1: ruleParameterQualifier : ( ( rule__ParameterQualifier__Alternatives ) ) ;
    public final void ruleParameterQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:859:1: ( ( ( rule__ParameterQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:860:1: ( ( rule__ParameterQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:860:1: ( ( rule__ParameterQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:861:1: ( rule__ParameterQualifier__Alternatives )
            {
             before(grammarAccess.getParameterQualifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:862:1: ( rule__ParameterQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:862:2: rule__ParameterQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1789);
            rule__ParameterQualifier__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getParameterQualifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParameterQualifier


    // $ANTLR start rule__ItfFile__Alternatives_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:873:1: rule__ItfFile__Alternatives_1 : ( ( ( rule__ItfFile__ConstantAssignment_1_0 ) ) | ( ( rule__ItfFile__TypeAssignment_1_1 ) ) );
    public final void rule__ItfFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:877:1: ( ( ( rule__ItfFile__ConstantAssignment_1_0 ) ) | ( ( rule__ItfFile__TypeAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==52) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==39||LA1_0==43) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("873:1: rule__ItfFile__Alternatives_1 : ( ( ( rule__ItfFile__ConstantAssignment_1_0 ) ) | ( ( rule__ItfFile__TypeAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:878:1: ( ( rule__ItfFile__ConstantAssignment_1_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:878:1: ( ( rule__ItfFile__ConstantAssignment_1_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:879:1: ( rule__ItfFile__ConstantAssignment_1_0 )
                    {
                     before(grammarAccess.getItfFileAccess().getConstantAssignment_1_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:880:1: ( rule__ItfFile__ConstantAssignment_1_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:880:2: rule__ItfFile__ConstantAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ItfFile__ConstantAssignment_1_0_in_rule__ItfFile__Alternatives_11824);
                    rule__ItfFile__ConstantAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getItfFileAccess().getConstantAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:884:6: ( ( rule__ItfFile__TypeAssignment_1_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:884:6: ( ( rule__ItfFile__TypeAssignment_1_1 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:885:1: ( rule__ItfFile__TypeAssignment_1_1 )
                    {
                     before(grammarAccess.getItfFileAccess().getTypeAssignment_1_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:886:1: ( rule__ItfFile__TypeAssignment_1_1 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:886:2: rule__ItfFile__TypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ItfFile__TypeAssignment_1_1_in_rule__ItfFile__Alternatives_11842);
                    rule__ItfFile__TypeAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getItfFileAccess().getTypeAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__Alternatives_1


    // $ANTLR start rule__TypeDefinition__Alternatives_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:895:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );
    public final void rule__TypeDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:899:1: ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case 12:
            case 13:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("895:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:900:1: ( ruleTypedefSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:900:1: ( ruleTypedefSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:901:1: ruleTypedefSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_01875);
                    ruleTypedefSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:906:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:906:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:907:1: ruleStructOrUnionSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_01892);
                    ruleStructOrUnionSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:912:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:912:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:913:1: ruleEnumSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_01909);
                    ruleEnumSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDefinition__Alternatives_0


    // $ANTLR start rule__TypeSpecification__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:923:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:927:1: ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 12:
            case 13:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("923:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:928:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:928:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:929:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:930:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:930:2: rule__TypeSpecification__TypeDefNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives1941);
                    rule__TypeSpecification__TypeDefNameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:934:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:934:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:935:1: ruleStructOrUnionSpecification
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives1959);
                    ruleStructOrUnionSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:940:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:940:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:941:1: ruleEnumSpecification
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives1976);
                    ruleEnumSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:946:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:946:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:947:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:947:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:948:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:949:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:949:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives1995);
                    rule__TypeSpecification__TypeSpecifierAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 

                    }

                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:952:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:953:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:954:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=16 && LA3_0<=35)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:954:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    	    {
                    	    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2007);
                    	    rule__TypeSpecification__TypeSpecifierAssignment_3();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeSpecification__Alternatives


    // $ANTLR start rule__StructOrUnionSpecification__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:964:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );
    public final void rule__StructOrUnionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:968:1: ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==38||(LA5_3>=46 && LA5_3<=47)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==40) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("964:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==40) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("964:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==13) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==38||(LA5_3>=46 && LA5_3<=47)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==40) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("964:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==40) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("964:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("964:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:969:1: ( ruleStructOrUnionDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:969:1: ( ruleStructOrUnionDefinition )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:970:1: ruleStructOrUnionDefinition
                    {
                     before(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2043);
                    ruleStructOrUnionDefinition();
                    _fsp--;

                     after(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:975:6: ( ruleStructorUnionReference )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:975:6: ( ruleStructorUnionReference )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:976:1: ruleStructorUnionReference
                    {
                     before(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2060);
                    ruleStructorUnionReference();
                    _fsp--;

                     after(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionSpecification__Alternatives


    // $ANTLR start rule__StructOrUnion__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:986:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );
    public final void rule__StructOrUnion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:990:1: ( ( 'struct' ) | ( 'union' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("986:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:991:1: ( 'struct' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:991:1: ( 'struct' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:992:1: 'struct'
                    {
                     before(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__StructOrUnion__Alternatives2093); 
                     after(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:999:6: ( 'union' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:999:6: ( 'union' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1000:1: 'union'
                    {
                     before(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__StructOrUnion__Alternatives2113); 
                     after(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnion__Alternatives


    // $ANTLR start rule__EnumSpecification__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1012:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );
    public final void rule__EnumSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1016:1: ( ( ruleEnumDefinition ) | ( ruleEnumReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==40) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==38||(LA7_2>=46 && LA7_2<=47)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1012:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==40) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1012:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1012:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1017:1: ( ruleEnumDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1017:1: ( ruleEnumDefinition )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1018:1: ruleEnumDefinition
                    {
                     before(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2147);
                    ruleEnumDefinition();
                    _fsp--;

                     after(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1023:6: ( ruleEnumReference )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1023:6: ( ruleEnumReference )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1024:1: ruleEnumReference
                    {
                     before(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2164);
                    ruleEnumReference();
                    _fsp--;

                     after(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumSpecification__Alternatives


    // $ANTLR start rule__DirectDeclarator__Alternatives_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1034:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );
    public final void rule__DirectDeclarator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1038:1: ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==47) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1034:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1039:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1039:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1040:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    {
                     before(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1041:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1041:2: rule__DirectDeclarator__IdAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02196);
                    rule__DirectDeclarator__IdAssignment_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1045:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1045:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1046:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    {
                     before(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1047:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1047:2: rule__DirectDeclarator__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02214);
                    rule__DirectDeclarator__Group_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__Alternatives_0


    // $ANTLR start rule__ArraySpecification__Alternatives_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1056:1: rule__ArraySpecification__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__ArraySpecification__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1060:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1056:1: rule__ArraySpecification__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1061:1: ( RULE_INT )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1061:1: ( RULE_INT )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1062:1: RULE_INT
                    {
                     before(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySpecification__Alternatives_12247); 
                     after(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1067:6: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1067:6: ( RULE_ID )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1068:1: RULE_ID
                    {
                     before(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArraySpecification__Alternatives_12264); 
                     after(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArraySpecification__Alternatives_1


    // $ANTLR start rule__MethodDefinition__Alternatives_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1078:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );
    public final void rule__MethodDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1082:1: ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 12:
                case 13:
                case 14:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 43:
                    {
                    alt10=2;
                    }
                    break;
                case 16:
                    {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==48) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==RULE_ID||(LA10_3>=16 && LA10_3<=35)||(LA10_3>=46 && LA10_3<=47)) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1078:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 10, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    alt10=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1078:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1078:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1083:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1083:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1084:1: ( rule__MethodDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1085:1: ( rule__MethodDefinition__Group_2_0__0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1085:2: rule__MethodDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22296);
                    rule__MethodDefinition__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1089:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1089:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1090:1: ( rule__MethodDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1091:1: ( rule__MethodDefinition__Group_2_1__0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1091:2: rule__MethodDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22314);
                    rule__MethodDefinition__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMethodDefinitionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Alternatives_2


    // $ANTLR start rule__IncludeDirective__Alternatives_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1100:1: rule__IncludeDirective__Alternatives_1 : ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) );
    public final void rule__IncludeDirective__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1104:1: ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INCLUDELIB) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1100:1: rule__IncludeDirective__Alternatives_1 : ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1105:1: ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1105:1: ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1106:1: ( rule__IncludeDirective__ImportedURIAssignment_1_0 )
                    {
                     before(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1107:1: ( rule__IncludeDirective__ImportedURIAssignment_1_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1107:2: rule__IncludeDirective__ImportedURIAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__IncludeDirective__ImportedURIAssignment_1_0_in_rule__IncludeDirective__Alternatives_12347);
                    rule__IncludeDirective__ImportedURIAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1111:6: ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1111:6: ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1112:1: ( rule__IncludeDirective__IncludeIDAssignment_1_1 )
                    {
                     before(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1113:1: ( rule__IncludeDirective__IncludeIDAssignment_1_1 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1113:2: rule__IncludeDirective__IncludeIDAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__IncludeDirective__IncludeIDAssignment_1_1_in_rule__IncludeDirective__Alternatives_12365);
                    rule__IncludeDirective__IncludeIDAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IncludeDirective__Alternatives_1


    // $ANTLR start rule__TypeQualifier__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1122:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );
    public final void rule__TypeQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1126:1: ( ( ( 'const' ) ) | ( ( 'volatile' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1122:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1127:1: ( ( 'const' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1127:1: ( ( 'const' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1128:1: ( 'const' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1129:1: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1129:3: 'const'
                    {
                    match(input,14,FOLLOW_14_in_rule__TypeQualifier__Alternatives2399); 

                    }

                     after(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1134:6: ( ( 'volatile' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1134:6: ( ( 'volatile' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1135:1: ( 'volatile' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1136:1: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1136:3: 'volatile'
                    {
                    match(input,15,FOLLOW_15_in_rule__TypeQualifier__Alternatives2420); 

                    }

                     after(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeQualifier__Alternatives


    // $ANTLR start rule__TypeSpecifier__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1146:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );
    public final void rule__TypeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1150:1: ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) )
            int alt13=20;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 17:
                {
                alt13=2;
                }
                break;
            case 18:
                {
                alt13=3;
                }
                break;
            case 19:
                {
                alt13=4;
                }
                break;
            case 20:
                {
                alt13=5;
                }
                break;
            case 21:
                {
                alt13=6;
                }
                break;
            case 22:
                {
                alt13=7;
                }
                break;
            case 23:
                {
                alt13=8;
                }
                break;
            case 24:
                {
                alt13=9;
                }
                break;
            case 25:
                {
                alt13=10;
                }
                break;
            case 26:
                {
                alt13=11;
                }
                break;
            case 27:
                {
                alt13=12;
                }
                break;
            case 28:
                {
                alt13=13;
                }
                break;
            case 29:
                {
                alt13=14;
                }
                break;
            case 30:
                {
                alt13=15;
                }
                break;
            case 31:
                {
                alt13=16;
                }
                break;
            case 32:
                {
                alt13=17;
                }
                break;
            case 33:
                {
                alt13=18;
                }
                break;
            case 34:
                {
                alt13=19;
                }
                break;
            case 35:
                {
                alt13=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1146:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1151:1: ( ( 'void' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1151:1: ( ( 'void' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1152:1: ( 'void' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1153:1: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1153:3: 'void'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeSpecifier__Alternatives2456); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1158:6: ( ( 'char' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1158:6: ( ( 'char' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1159:1: ( 'char' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1160:1: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1160:3: 'char'
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeSpecifier__Alternatives2477); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1165:6: ( ( 'short' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1165:6: ( ( 'short' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1166:1: ( 'short' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1167:1: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1167:3: 'short'
                    {
                    match(input,18,FOLLOW_18_in_rule__TypeSpecifier__Alternatives2498); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1172:6: ( ( 'int' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1172:6: ( ( 'int' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1173:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1174:1: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1174:3: 'int'
                    {
                    match(input,19,FOLLOW_19_in_rule__TypeSpecifier__Alternatives2519); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1179:6: ( ( 'long' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1179:6: ( ( 'long' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1180:1: ( 'long' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1181:1: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1181:3: 'long'
                    {
                    match(input,20,FOLLOW_20_in_rule__TypeSpecifier__Alternatives2540); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1186:6: ( ( 'float' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1186:6: ( ( 'float' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1187:1: ( 'float' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1188:1: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1188:3: 'float'
                    {
                    match(input,21,FOLLOW_21_in_rule__TypeSpecifier__Alternatives2561); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1193:6: ( ( 'double' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1193:6: ( ( 'double' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1194:1: ( 'double' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1195:1: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1195:3: 'double'
                    {
                    match(input,22,FOLLOW_22_in_rule__TypeSpecifier__Alternatives2582); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1200:6: ( ( 'signed' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1200:6: ( ( 'signed' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1201:1: ( 'signed' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1202:1: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1202:3: 'signed'
                    {
                    match(input,23,FOLLOW_23_in_rule__TypeSpecifier__Alternatives2603); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1207:6: ( ( 'unsigned' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1207:6: ( ( 'unsigned' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1208:1: ( 'unsigned' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1209:1: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1209:3: 'unsigned'
                    {
                    match(input,24,FOLLOW_24_in_rule__TypeSpecifier__Alternatives2624); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1214:6: ( ( 'string' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1214:6: ( ( 'string' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1215:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1216:1: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1216:3: 'string'
                    {
                    match(input,25,FOLLOW_25_in_rule__TypeSpecifier__Alternatives2645); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1221:6: ( ( 'int8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1221:6: ( ( 'int8_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1222:1: ( 'int8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1223:1: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1223:3: 'int8_t'
                    {
                    match(input,26,FOLLOW_26_in_rule__TypeSpecifier__Alternatives2666); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1228:6: ( ( 'uint8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1228:6: ( ( 'uint8_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1229:1: ( 'uint8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1230:1: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1230:3: 'uint8_t'
                    {
                    match(input,27,FOLLOW_27_in_rule__TypeSpecifier__Alternatives2687); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1235:6: ( ( 'int16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1235:6: ( ( 'int16_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1236:1: ( 'int16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1237:1: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1237:3: 'int16_t'
                    {
                    match(input,28,FOLLOW_28_in_rule__TypeSpecifier__Alternatives2708); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1242:6: ( ( 'uint16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1242:6: ( ( 'uint16_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1243:1: ( 'uint16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1244:1: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1244:3: 'uint16_t'
                    {
                    match(input,29,FOLLOW_29_in_rule__TypeSpecifier__Alternatives2729); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1249:6: ( ( 'int32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1249:6: ( ( 'int32_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1250:1: ( 'int32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1251:1: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1251:3: 'int32_t'
                    {
                    match(input,30,FOLLOW_30_in_rule__TypeSpecifier__Alternatives2750); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1256:6: ( ( 'uint32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1256:6: ( ( 'uint32_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1257:1: ( 'uint32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1258:1: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1258:3: 'uint32_t'
                    {
                    match(input,31,FOLLOW_31_in_rule__TypeSpecifier__Alternatives2771); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1263:6: ( ( 'int64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1263:6: ( ( 'int64_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1264:1: ( 'int64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1265:1: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1265:3: 'int64_t'
                    {
                    match(input,32,FOLLOW_32_in_rule__TypeSpecifier__Alternatives2792); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1270:6: ( ( 'uint64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1270:6: ( ( 'uint64_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1271:1: ( 'uint64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1272:1: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1272:3: 'uint64_t'
                    {
                    match(input,33,FOLLOW_33_in_rule__TypeSpecifier__Alternatives2813); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1277:6: ( ( 'intptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1277:6: ( ( 'intptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1278:1: ( 'intptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1279:1: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1279:3: 'intptr_t'
                    {
                    match(input,34,FOLLOW_34_in_rule__TypeSpecifier__Alternatives2834); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1284:6: ( ( 'uintptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1284:6: ( ( 'uintptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1285:1: ( 'uintptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1286:1: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1286:3: 'uintptr_t'
                    {
                    match(input,35,FOLLOW_35_in_rule__TypeSpecifier__Alternatives2855); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeSpecifier__Alternatives


    // $ANTLR start rule__ParameterQualifier__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1296:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__ParameterQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1300:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            else if ( (LA14_0==37) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1296:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1301:1: ( ( 'in' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1301:1: ( ( 'in' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1302:1: ( 'in' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1303:1: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1303:3: 'in'
                    {
                    match(input,36,FOLLOW_36_in_rule__ParameterQualifier__Alternatives2891); 

                    }

                     after(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1308:6: ( ( 'out' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1308:6: ( ( 'out' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1309:1: ( 'out' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1310:1: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1310:3: 'out'
                    {
                    match(input,37,FOLLOW_37_in_rule__ParameterQualifier__Alternatives2912); 

                    }

                     after(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterQualifier__Alternatives


    // $ANTLR start rule__ItfFile__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1322:1: rule__ItfFile__Group__0 : ( ( rule__ItfFile__IncludesAssignment_0 )* ) rule__ItfFile__Group__1 ;
    public final void rule__ItfFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1326:1: ( ( ( rule__ItfFile__IncludesAssignment_0 )* ) rule__ItfFile__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1327:1: ( ( rule__ItfFile__IncludesAssignment_0 )* ) rule__ItfFile__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1327:1: ( ( rule__ItfFile__IncludesAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1328:1: ( rule__ItfFile__IncludesAssignment_0 )*
            {
             before(grammarAccess.getItfFileAccess().getIncludesAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1329:1: ( rule__ItfFile__IncludesAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==56) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1329:2: rule__ItfFile__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItfFile__IncludesAssignment_0_in_rule__ItfFile__Group__02949);
            	    rule__ItfFile__IncludesAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getItfFileAccess().getIncludesAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ItfFile__Group__1_in_rule__ItfFile__Group__02959);
            rule__ItfFile__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__Group__0


    // $ANTLR start rule__ItfFile__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1340:1: rule__ItfFile__Group__1 : ( ( rule__ItfFile__Alternatives_1 )* ) rule__ItfFile__Group__2 ;
    public final void rule__ItfFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1344:1: ( ( ( rule__ItfFile__Alternatives_1 )* ) rule__ItfFile__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1345:1: ( ( rule__ItfFile__Alternatives_1 )* ) rule__ItfFile__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1345:1: ( ( rule__ItfFile__Alternatives_1 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1346:1: ( rule__ItfFile__Alternatives_1 )*
            {
             before(grammarAccess.getItfFileAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1347:1: ( rule__ItfFile__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=12 && LA16_0<=13)||LA16_0==39||LA16_0==43||LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1347:2: rule__ItfFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ItfFile__Alternatives_1_in_rule__ItfFile__Group__12987);
            	    rule__ItfFile__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getItfFileAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__ItfFile__Group__2_in_rule__ItfFile__Group__12997);
            rule__ItfFile__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__Group__1


    // $ANTLR start rule__ItfFile__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1358:1: rule__ItfFile__Group__2 : ( ( rule__ItfFile__InterfaceAssignment_2 ) ) rule__ItfFile__Group__3 ;
    public final void rule__ItfFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1362:1: ( ( ( rule__ItfFile__InterfaceAssignment_2 ) ) rule__ItfFile__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1363:1: ( ( rule__ItfFile__InterfaceAssignment_2 ) ) rule__ItfFile__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1363:1: ( ( rule__ItfFile__InterfaceAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1364:1: ( rule__ItfFile__InterfaceAssignment_2 )
            {
             before(grammarAccess.getItfFileAccess().getInterfaceAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1365:1: ( rule__ItfFile__InterfaceAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1365:2: rule__ItfFile__InterfaceAssignment_2
            {
            pushFollow(FOLLOW_rule__ItfFile__InterfaceAssignment_2_in_rule__ItfFile__Group__23025);
            rule__ItfFile__InterfaceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getItfFileAccess().getInterfaceAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ItfFile__Group__3_in_rule__ItfFile__Group__23034);
            rule__ItfFile__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__Group__2


    // $ANTLR start rule__ItfFile__Group__3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1376:1: rule__ItfFile__Group__3 : ( ( ';' )? ) ;
    public final void rule__ItfFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1380:1: ( ( ( ';' )? ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1381:1: ( ( ';' )? )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1381:1: ( ( ';' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1382:1: ( ';' )?
            {
             before(grammarAccess.getItfFileAccess().getSemicolonKeyword_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1383:1: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1384:2: ';'
                    {
                    match(input,38,FOLLOW_38_in_rule__ItfFile__Group__33064); 

                    }
                    break;

            }

             after(grammarAccess.getItfFileAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__Group__3


    // $ANTLR start rule__TypeDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1403:1: rule__TypeDefinition__Group__0 : ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1407:1: ( ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1408:1: ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1408:1: ( ( rule__TypeDefinition__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1409:1: ( rule__TypeDefinition__Alternatives_0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1410:1: ( rule__TypeDefinition__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1410:2: rule__TypeDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03109);
            rule__TypeDefinition__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03118);
            rule__TypeDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDefinition__Group__0


    // $ANTLR start rule__TypeDefinition__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1421:1: rule__TypeDefinition__Group__1 : ( ';' ) ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1425:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1426:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1426:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1427:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__TypeDefinition__Group__13147); 
             after(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDefinition__Group__1


    // $ANTLR start rule__TypedefSpecification__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1444:1: rule__TypedefSpecification__Group__0 : ( 'typedef' ) rule__TypedefSpecification__Group__1 ;
    public final void rule__TypedefSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1448:1: ( ( 'typedef' ) rule__TypedefSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1449:1: ( 'typedef' ) rule__TypedefSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1449:1: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1450:1: 'typedef'
            {
             before(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__TypedefSpecification__Group__03187); 
             after(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03197);
            rule__TypedefSpecification__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedefSpecification__Group__0


    // $ANTLR start rule__TypedefSpecification__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1464:1: rule__TypedefSpecification__Group__1 : ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 ;
    public final void rule__TypedefSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1468:1: ( ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1469:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1469:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1470:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1471:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1471:2: rule__TypedefSpecification__QualifedTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13225);
            rule__TypedefSpecification__QualifedTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13234);
            rule__TypedefSpecification__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedefSpecification__Group__1


    // $ANTLR start rule__TypedefSpecification__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1482:1: rule__TypedefSpecification__Group__2 : ( ( rule__TypedefSpecification__DecAssignment_2 ) ) ;
    public final void rule__TypedefSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1486:1: ( ( ( rule__TypedefSpecification__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1487:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1487:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1488:1: ( rule__TypedefSpecification__DecAssignment_2 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1489:1: ( rule__TypedefSpecification__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1489:2: rule__TypedefSpecification__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23262);
            rule__TypedefSpecification__DecAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedefSpecification__Group__2


    // $ANTLR start rule__QualifiedTypeSpecification__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1505:1: rule__QualifiedTypeSpecification__Group__0 : ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 ;
    public final void rule__QualifiedTypeSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1509:1: ( ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1510:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1510:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1511:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1512:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=14 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1512:2: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03302);
            	    rule__QualifiedTypeSpecification__TypeQualifierAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03312);
            rule__QualifiedTypeSpecification__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedTypeSpecification__Group__0


    // $ANTLR start rule__QualifiedTypeSpecification__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1523:1: rule__QualifiedTypeSpecification__Group__1 : ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) ;
    public final void rule__QualifiedTypeSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1527:1: ( ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1528:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1528:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1529:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1530:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1530:2: rule__QualifiedTypeSpecification__TypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13340);
            rule__QualifiedTypeSpecification__TypeSpecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedTypeSpecification__Group__1


    // $ANTLR start rule__StructOrUnionDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1544:1: rule__StructOrUnionDefinition__Group__0 : ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 ;
    public final void rule__StructOrUnionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1548:1: ( ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1549:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1549:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1550:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1551:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1551:2: rule__StructOrUnionDefinition__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03378);
            rule__StructOrUnionDefinition__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03387);
            rule__StructOrUnionDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__Group__0


    // $ANTLR start rule__StructOrUnionDefinition__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1562:1: rule__StructOrUnionDefinition__Group__1 : ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 ;
    public final void rule__StructOrUnionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1566:1: ( ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1567:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1567:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1568:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1569:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1569:2: rule__StructOrUnionDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13415);
                    rule__StructOrUnionDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13425);
            rule__StructOrUnionDefinition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__Group__1


    // $ANTLR start rule__StructOrUnionDefinition__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1580:1: rule__StructOrUnionDefinition__Group__2 : ( '{' ) rule__StructOrUnionDefinition__Group__3 ;
    public final void rule__StructOrUnionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1584:1: ( ( '{' ) rule__StructOrUnionDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1585:1: ( '{' ) rule__StructOrUnionDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1585:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1586:1: '{'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__StructOrUnionDefinition__Group__23454); 
             after(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23464);
            rule__StructOrUnionDefinition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__Group__2


    // $ANTLR start rule__StructOrUnionDefinition__Group__3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1600:1: rule__StructOrUnionDefinition__Group__3 : ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 ;
    public final void rule__StructOrUnionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1604:1: ( ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1605:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1605:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1606:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1607:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=12 && LA20_0<=35)||LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1607:2: rule__StructOrUnionDefinition__StructMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33492);
            	    rule__StructOrUnionDefinition__StructMemberAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33502);
            rule__StructOrUnionDefinition__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__Group__3


    // $ANTLR start rule__StructOrUnionDefinition__Group__4
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1618:1: rule__StructOrUnionDefinition__Group__4 : ( '}' ) ;
    public final void rule__StructOrUnionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1622:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1623:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1623:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1624:1: '}'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__StructOrUnionDefinition__Group__43531); 
             after(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__Group__4


    // $ANTLR start rule__StructorUnionReference__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1647:1: rule__StructorUnionReference__Group__0 : ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 ;
    public final void rule__StructorUnionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1651:1: ( ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1652:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1652:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1653:1: ( rule__StructorUnionReference__StructAssignment_0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1654:1: ( rule__StructorUnionReference__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1654:2: rule__StructorUnionReference__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03576);
            rule__StructorUnionReference__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03585);
            rule__StructorUnionReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructorUnionReference__Group__0


    // $ANTLR start rule__StructorUnionReference__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1665:1: rule__StructorUnionReference__Group__1 : ( ( rule__StructorUnionReference__IdAssignment_1 ) ) ;
    public final void rule__StructorUnionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1669:1: ( ( ( rule__StructorUnionReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1670:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1670:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1671:1: ( rule__StructorUnionReference__IdAssignment_1 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1672:1: ( rule__StructorUnionReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1672:2: rule__StructorUnionReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13613);
            rule__StructorUnionReference__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructorUnionReference__Group__1


    // $ANTLR start rule__StructMember__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1686:1: rule__StructMember__Group__0 : ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 ;
    public final void rule__StructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1690:1: ( ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1691:1: ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1691:1: ( ( rule__StructMember__QualTypeAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1692:1: ( rule__StructMember__QualTypeAssignment_0 )
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1693:1: ( rule__StructMember__QualTypeAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1693:2: rule__StructMember__QualTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03651);
            rule__StructMember__QualTypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03660);
            rule__StructMember__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group__0


    // $ANTLR start rule__StructMember__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1704:1: rule__StructMember__Group__1 : ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 ;
    public final void rule__StructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1708:1: ( ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1709:1: ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1709:1: ( ( rule__StructMember__DecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1710:1: ( rule__StructMember__DecAssignment_1 )
            {
             before(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1711:1: ( rule__StructMember__DecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1711:2: rule__StructMember__DecAssignment_1
            {
            pushFollow(FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__13688);
            rule__StructMember__DecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__13697);
            rule__StructMember__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group__1


    // $ANTLR start rule__StructMember__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1722:1: rule__StructMember__Group__2 : ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 ;
    public final void rule__StructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1726:1: ( ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1727:1: ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1727:1: ( ( rule__StructMember__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1728:1: ( rule__StructMember__Group_2__0 )?
            {
             before(grammarAccess.getStructMemberAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1729:1: ( rule__StructMember__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1729:2: rule__StructMember__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__23725);
                    rule__StructMember__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructMemberAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__23735);
            rule__StructMember__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group__2


    // $ANTLR start rule__StructMember__Group__3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1740:1: rule__StructMember__Group__3 : ( ';' ) ;
    public final void rule__StructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1744:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1745:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1745:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1746:1: ';'
            {
             before(grammarAccess.getStructMemberAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__StructMember__Group__33764); 
             after(grammarAccess.getStructMemberAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group__3


    // $ANTLR start rule__StructMember__Group_2__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1767:1: rule__StructMember__Group_2__0 : ( ':' ) rule__StructMember__Group_2__1 ;
    public final void rule__StructMember__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1771:1: ( ( ':' ) rule__StructMember__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1772:1: ( ':' ) rule__StructMember__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1772:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1773:1: ':'
            {
             before(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__StructMember__Group_2__03808); 
             after(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__03818);
            rule__StructMember__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group_2__0


    // $ANTLR start rule__StructMember__Group_2__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1787:1: rule__StructMember__Group_2__1 : ( RULE_INT ) ;
    public final void rule__StructMember__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1791:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1792:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1792:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1793:1: RULE_INT
            {
             before(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StructMember__Group_2__13846); 
             after(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group_2__1


    // $ANTLR start rule__EnumDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1808:1: rule__EnumDefinition__Group__0 : ( 'enum' ) rule__EnumDefinition__Group__1 ;
    public final void rule__EnumDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1812:1: ( ( 'enum' ) rule__EnumDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1813:1: ( 'enum' ) rule__EnumDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1813:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1814:1: 'enum'
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__EnumDefinition__Group__03884); 
             after(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__03894);
            rule__EnumDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__Group__0


    // $ANTLR start rule__EnumDefinition__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1828:1: rule__EnumDefinition__Group__1 : ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 ;
    public final void rule__EnumDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1832:1: ( ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1833:1: ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1833:1: ( ( rule__EnumDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1834:1: ( rule__EnumDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1835:1: ( rule__EnumDefinition__IdAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1835:2: rule__EnumDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__13922);
                    rule__EnumDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__13932);
            rule__EnumDefinition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__Group__1


    // $ANTLR start rule__EnumDefinition__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1846:1: rule__EnumDefinition__Group__2 : ( '{' ) rule__EnumDefinition__Group__3 ;
    public final void rule__EnumDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1850:1: ( ( '{' ) rule__EnumDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1851:1: ( '{' ) rule__EnumDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1851:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1852:1: '{'
            {
             before(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__EnumDefinition__Group__23961); 
             after(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__23971);
            rule__EnumDefinition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__Group__2


    // $ANTLR start rule__EnumDefinition__Group__3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1866:1: rule__EnumDefinition__Group__3 : ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 ;
    public final void rule__EnumDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1870:1: ( ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1871:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1871:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1872:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1873:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1873:2: rule__EnumDefinition__EnumMemberListAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__33999);
            rule__EnumDefinition__EnumMemberListAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34008);
            rule__EnumDefinition__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__Group__3


    // $ANTLR start rule__EnumDefinition__Group__4
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1884:1: rule__EnumDefinition__Group__4 : ( '}' ) ;
    public final void rule__EnumDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1888:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1889:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1889:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1890:1: '}'
            {
             before(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__EnumDefinition__Group__44037); 
             after(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__Group__4


    // $ANTLR start rule__EnumReference__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1913:1: rule__EnumReference__Group__0 : ( 'enum' ) rule__EnumReference__Group__1 ;
    public final void rule__EnumReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1917:1: ( ( 'enum' ) rule__EnumReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1918:1: ( 'enum' ) rule__EnumReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1918:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1919:1: 'enum'
            {
             before(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__EnumReference__Group__04083); 
             after(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04093);
            rule__EnumReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumReference__Group__0


    // $ANTLR start rule__EnumReference__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1933:1: rule__EnumReference__Group__1 : ( ( rule__EnumReference__IdAssignment_1 ) ) ;
    public final void rule__EnumReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1937:1: ( ( ( rule__EnumReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1938:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1938:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1939:1: ( rule__EnumReference__IdAssignment_1 )
            {
             before(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1940:1: ( rule__EnumReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1940:2: rule__EnumReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14121);
            rule__EnumReference__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumReference__Group__1


    // $ANTLR start rule__EnumMemberList__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1954:1: rule__EnumMemberList__Group__0 : ( ruleEnumMember ) rule__EnumMemberList__Group__1 ;
    public final void rule__EnumMemberList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1958:1: ( ( ruleEnumMember ) rule__EnumMemberList__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1959:1: ( ruleEnumMember ) rule__EnumMemberList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1959:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1960:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04159);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04167);
            rule__EnumMemberList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMemberList__Group__0


    // $ANTLR start rule__EnumMemberList__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1972:1: rule__EnumMemberList__Group__1 : ( ( rule__EnumMemberList__Group_1__0 )* ) ;
    public final void rule__EnumMemberList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1976:1: ( ( ( rule__EnumMemberList__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1977:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1977:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1978:1: ( rule__EnumMemberList__Group_1__0 )*
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1979:1: ( rule__EnumMemberList__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1979:2: rule__EnumMemberList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14195);
            	    rule__EnumMemberList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEnumMemberListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMemberList__Group__1


    // $ANTLR start rule__EnumMemberList__Group_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1993:1: rule__EnumMemberList__Group_1__0 : ( ',' ) rule__EnumMemberList__Group_1__1 ;
    public final void rule__EnumMemberList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1997:1: ( ( ',' ) rule__EnumMemberList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1998:1: ( ',' ) rule__EnumMemberList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1998:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1999:1: ','
            {
             before(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumMemberList__Group_1__04235); 
             after(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04245);
            rule__EnumMemberList__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMemberList__Group_1__0


    // $ANTLR start rule__EnumMemberList__Group_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2013:1: rule__EnumMemberList__Group_1__1 : ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) ;
    public final void rule__EnumMemberList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2017:1: ( ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2018:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2018:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2019:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2020:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2020:2: rule__EnumMemberList__EnumMemberAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14273);
            rule__EnumMemberList__EnumMemberAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMemberList__Group_1__1


    // $ANTLR start rule__EnumMember__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2034:1: rule__EnumMember__Group__0 : ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2038:1: ( ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2039:1: ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2039:1: ( ( rule__EnumMember__IdAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2040:1: ( rule__EnumMember__IdAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2041:1: ( rule__EnumMember__IdAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2041:2: rule__EnumMember__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04311);
            rule__EnumMember__IdAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04320);
            rule__EnumMember__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group__0


    // $ANTLR start rule__EnumMember__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2052:1: rule__EnumMember__Group__1 : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2056:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2057:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2057:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2058:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2059:1: ( rule__EnumMember__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2059:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14348);
                    rule__EnumMember__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumMemberAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group__1


    // $ANTLR start rule__EnumMember__Group_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2073:1: rule__EnumMember__Group_1__0 : ( '=' ) rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2077:1: ( ( '=' ) rule__EnumMember__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2078:1: ( '=' ) rule__EnumMember__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2078:1: ( '=' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2079:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumMember__Group_1__04388); 
             after(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04398);
            rule__EnumMember__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group_1__0


    // $ANTLR start rule__EnumMember__Group_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2093:1: rule__EnumMember__Group_1__1 : ( RULE_INT ) ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2097:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2098:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2098:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2099:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14426); 
             after(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group_1__1


    // $ANTLR start rule__Declarators__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2114:1: rule__Declarators__Group__0 : ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 ;
    public final void rule__Declarators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2118:1: ( ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2119:1: ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2119:1: ( ( rule__Declarators__DecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2120:1: ( rule__Declarators__DecAssignment_0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2121:1: ( rule__Declarators__DecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2121:2: rule__Declarators__DecAssignment_0
            {
            pushFollow(FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04463);
            rule__Declarators__DecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04472);
            rule__Declarators__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarators__Group__0


    // $ANTLR start rule__Declarators__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2132:1: rule__Declarators__Group__1 : ( ( rule__Declarators__Group_1__0 )* ) ;
    public final void rule__Declarators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2136:1: ( ( ( rule__Declarators__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2137:1: ( ( rule__Declarators__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2137:1: ( ( rule__Declarators__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2138:1: ( rule__Declarators__Group_1__0 )*
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2139:1: ( rule__Declarators__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2139:2: rule__Declarators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14500);
            	    rule__Declarators__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDeclaratorsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarators__Group__1


    // $ANTLR start rule__Declarators__Group_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2153:1: rule__Declarators__Group_1__0 : ( ',' ) rule__Declarators__Group_1__1 ;
    public final void rule__Declarators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2157:1: ( ( ',' ) rule__Declarators__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2158:1: ( ',' ) rule__Declarators__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2158:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2159:1: ','
            {
             before(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Declarators__Group_1__04540); 
             after(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04550);
            rule__Declarators__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarators__Group_1__0


    // $ANTLR start rule__Declarators__Group_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2173:1: rule__Declarators__Group_1__1 : ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) ;
    public final void rule__Declarators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2177:1: ( ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2178:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2178:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2179:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2180:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2180:2: rule__Declarators__DeclaratorListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14578);
            rule__Declarators__DeclaratorListAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarators__Group_1__1


    // $ANTLR start rule__Declarator__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2194:1: rule__Declarator__Group__0 : ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 ;
    public final void rule__Declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2198:1: ( ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2199:1: ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2199:1: ( ( rule__Declarator__Group_0__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2200:1: ( rule__Declarator__Group_0__0 )*
            {
             before(grammarAccess.getDeclaratorAccess().getGroup_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2201:1: ( rule__Declarator__Group_0__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2201:2: rule__Declarator__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04616);
            	    rule__Declarator__Group_0__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDeclaratorAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04626);
            rule__Declarator__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__Group__0


    // $ANTLR start rule__Declarator__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2212:1: rule__Declarator__Group__1 : ( ( rule__Declarator__DcAssignment_1 ) ) ;
    public final void rule__Declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2216:1: ( ( ( rule__Declarator__DcAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2217:1: ( ( rule__Declarator__DcAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2217:1: ( ( rule__Declarator__DcAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2218:1: ( rule__Declarator__DcAssignment_1 )
            {
             before(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2219:1: ( rule__Declarator__DcAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2219:2: rule__Declarator__DcAssignment_1
            {
            pushFollow(FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14654);
            rule__Declarator__DcAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__Group__1


    // $ANTLR start rule__Declarator__Group_0__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2233:1: rule__Declarator__Group_0__0 : ( '*' ) rule__Declarator__Group_0__1 ;
    public final void rule__Declarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2237:1: ( ( '*' ) rule__Declarator__Group_0__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2238:1: ( '*' ) rule__Declarator__Group_0__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2238:1: ( '*' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2239:1: '*'
            {
             before(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Declarator__Group_0__04693); 
             after(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__04703);
            rule__Declarator__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__Group_0__0


    // $ANTLR start rule__Declarator__Group_0__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2253:1: rule__Declarator__Group_0__1 : ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) ;
    public final void rule__Declarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2257:1: ( ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2258:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2258:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2259:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierAssignment_0_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2260:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=14 && LA27_0<=15)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2260:2: rule__Declarator__TypeQualifierAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__14731);
            	    rule__Declarator__TypeQualifierAssignment_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDeclaratorAccess().getTypeQualifierAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__Group_0__1


    // $ANTLR start rule__DirectDeclarator__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2274:1: rule__DirectDeclarator__Group__0 : ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 ;
    public final void rule__DirectDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2278:1: ( ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2279:1: ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2279:1: ( ( rule__DirectDeclarator__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2280:1: ( rule__DirectDeclarator__Alternatives_0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2281:1: ( rule__DirectDeclarator__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2281:2: rule__DirectDeclarator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__04770);
            rule__DirectDeclarator__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__04779);
            rule__DirectDeclarator__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__Group__0


    // $ANTLR start rule__DirectDeclarator__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2292:1: rule__DirectDeclarator__Group__1 : ( ( ruleArraySpecification )* ) ;
    public final void rule__DirectDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2296:1: ( ( ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2297:1: ( ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2297:1: ( ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2298:1: ( ruleArraySpecification )*
            {
             before(grammarAccess.getDirectDeclaratorAccess().getArraySpecificationParserRuleCall_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2299:1: ( ruleArraySpecification )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2299:3: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__14808);
            	    ruleArraySpecification();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDirectDeclaratorAccess().getArraySpecificationParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__Group__1


    // $ANTLR start rule__DirectDeclarator__Group_0_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2313:1: rule__DirectDeclarator__Group_0_1__0 : ( '(' ) rule__DirectDeclarator__Group_0_1__1 ;
    public final void rule__DirectDeclarator__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2317:1: ( ( '(' ) rule__DirectDeclarator__Group_0_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2318:1: ( '(' ) rule__DirectDeclarator__Group_0_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2318:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2319:1: '('
            {
             before(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,47,FOLLOW_47_in_rule__DirectDeclarator__Group_0_1__04848); 
             after(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__04858);
            rule__DirectDeclarator__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__Group_0_1__0


    // $ANTLR start rule__DirectDeclarator__Group_0_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2333:1: rule__DirectDeclarator__Group_0_1__1 : ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 ;
    public final void rule__DirectDeclarator__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2337:1: ( ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2338:1: ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2338:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2339:1: ruleDeclarator
            {
             before(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__14886);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__14894);
            rule__DirectDeclarator__Group_0_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__Group_0_1__1


    // $ANTLR start rule__DirectDeclarator__Group_0_1__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2351:1: rule__DirectDeclarator__Group_0_1__2 : ( ')' ) ;
    public final void rule__DirectDeclarator__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2355:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2356:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2356:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2357:1: ')'
            {
             before(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,48,FOLLOW_48_in_rule__DirectDeclarator__Group_0_1__24923); 
             after(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__Group_0_1__2


    // $ANTLR start rule__ArraySpecification__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2376:1: rule__ArraySpecification__Group__0 : ( '[' ) rule__ArraySpecification__Group__1 ;
    public final void rule__ArraySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2380:1: ( ( '[' ) rule__ArraySpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2381:1: ( '[' ) rule__ArraySpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2381:1: ( '[' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2382:1: '['
            {
             before(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__ArraySpecification__Group__04965); 
             after(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__04975);
            rule__ArraySpecification__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArraySpecification__Group__0


    // $ANTLR start rule__ArraySpecification__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2396:1: rule__ArraySpecification__Group__1 : ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2 ;
    public final void rule__ArraySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2400:1: ( ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2401:1: ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2401:1: ( ( rule__ArraySpecification__Alternatives_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2402:1: ( rule__ArraySpecification__Alternatives_1 )
            {
             before(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2403:1: ( rule__ArraySpecification__Alternatives_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2403:2: rule__ArraySpecification__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Alternatives_1_in_rule__ArraySpecification__Group__15003);
            rule__ArraySpecification__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15012);
            rule__ArraySpecification__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArraySpecification__Group__1


    // $ANTLR start rule__ArraySpecification__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2414:1: rule__ArraySpecification__Group__2 : ( ']' ) ;
    public final void rule__ArraySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2418:1: ( ( ']' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2419:1: ( ']' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2419:1: ( ']' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2420:1: ']'
            {
             before(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__ArraySpecification__Group__25041); 
             after(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArraySpecification__Group__2


    // $ANTLR start rule__FullyQualifiedName__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2439:1: rule__FullyQualifiedName__Group__0 : ( RULE_ID ) rule__FullyQualifiedName__Group__1 ;
    public final void rule__FullyQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2443:1: ( ( RULE_ID ) rule__FullyQualifiedName__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2444:1: ( RULE_ID ) rule__FullyQualifiedName__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2444:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2445:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05082); 
             after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05090);
            rule__FullyQualifiedName__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FullyQualifiedName__Group__0


    // $ANTLR start rule__FullyQualifiedName__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2457:1: rule__FullyQualifiedName__Group__1 : ( ( rule__FullyQualifiedName__Group_1__0 )* ) ;
    public final void rule__FullyQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2461:1: ( ( ( rule__FullyQualifiedName__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2462:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2462:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2463:1: ( rule__FullyQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2464:1: ( rule__FullyQualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==51) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2464:2: rule__FullyQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15118);
            	    rule__FullyQualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FullyQualifiedName__Group__1


    // $ANTLR start rule__FullyQualifiedName__Group_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2478:1: rule__FullyQualifiedName__Group_1__0 : ( '.' ) rule__FullyQualifiedName__Group_1__1 ;
    public final void rule__FullyQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2482:1: ( ( '.' ) rule__FullyQualifiedName__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2483:1: ( '.' ) rule__FullyQualifiedName__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2483:1: ( '.' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2484:1: '.'
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__FullyQualifiedName__Group_1__05158); 
             after(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05168);
            rule__FullyQualifiedName__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FullyQualifiedName__Group_1__0


    // $ANTLR start rule__FullyQualifiedName__Group_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2498:1: rule__FullyQualifiedName__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FullyQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2502:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2503:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2503:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2504:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15196); 
             after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FullyQualifiedName__Group_1__1


    // $ANTLR start rule__ConstantDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2519:1: rule__ConstantDefinition__Group__0 : ( '#define' ) rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2523:1: ( ( '#define' ) rule__ConstantDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2524:1: ( '#define' ) rule__ConstantDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2524:1: ( '#define' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2525:1: '#define'
            {
             before(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__ConstantDefinition__Group__05234); 
             after(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05244);
            rule__ConstantDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinition__Group__0


    // $ANTLR start rule__ConstantDefinition__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2539:1: rule__ConstantDefinition__Group__1 : ( ( rule__ConstantDefinition__IdAssignment_1 ) ) rule__ConstantDefinition__Group__2 ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2543:1: ( ( ( rule__ConstantDefinition__IdAssignment_1 ) ) rule__ConstantDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2544:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) ) rule__ConstantDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2544:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2545:1: ( rule__ConstantDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2546:1: ( rule__ConstantDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2546:2: rule__ConstantDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15272);
            rule__ConstantDefinition__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__2_in_rule__ConstantDefinition__Group__15281);
            rule__ConstantDefinition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinition__Group__1


    // $ANTLR start rule__ConstantDefinition__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2557:1: rule__ConstantDefinition__Group__2 : ( RULE_INT ) ;
    public final void rule__ConstantDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2561:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2562:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2562:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2563:1: RULE_INT
            {
             before(grammarAccess.getConstantDefinitionAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConstantDefinition__Group__25309); 
             after(grammarAccess.getConstantDefinitionAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinition__Group__2


    // $ANTLR start rule__InterfaceDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2580:1: rule__InterfaceDefinition__Group__0 : ( 'interface' ) rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2584:1: ( ( 'interface' ) rule__InterfaceDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2585:1: ( 'interface' ) rule__InterfaceDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2585:1: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2586:1: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__InterfaceDefinition__Group__05349); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05359);
            rule__InterfaceDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__0


    // $ANTLR start rule__InterfaceDefinition__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2600:1: rule__InterfaceDefinition__Group__1 : ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2604:1: ( ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2605:1: ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2605:1: ( ( 'unmanaged' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2606:1: ( 'unmanaged' )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2607:1: ( 'unmanaged' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2608:2: 'unmanaged'
                    {
                    match(input,54,FOLLOW_54_in_rule__InterfaceDefinition__Group__15389); 

                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15401);
            rule__InterfaceDefinition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__1


    // $ANTLR start rule__InterfaceDefinition__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2620:1: rule__InterfaceDefinition__Group__2 : ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2624:1: ( ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2625:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2625:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2626:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2627:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2627:2: rule__InterfaceDefinition__FqnAssignment_2
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25429);
            rule__InterfaceDefinition__FqnAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25438);
            rule__InterfaceDefinition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__2


    // $ANTLR start rule__InterfaceDefinition__Group__3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2638:1: rule__InterfaceDefinition__Group__3 : ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2642:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2643:1: ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2643:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2644:1: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2645:1: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2645:2: rule__InterfaceDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35466);
                    rule__InterfaceDefinition__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35476);
            rule__InterfaceDefinition__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__3


    // $ANTLR start rule__InterfaceDefinition__Group__4
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2656:1: rule__InterfaceDefinition__Group__4 : ( '{' ) rule__InterfaceDefinition__Group__5 ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2660:1: ( ( '{' ) rule__InterfaceDefinition__Group__5 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2661:1: ( '{' ) rule__InterfaceDefinition__Group__5
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2661:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2662:1: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_40_in_rule__InterfaceDefinition__Group__45505); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45515);
            rule__InterfaceDefinition__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__4


    // $ANTLR start rule__InterfaceDefinition__Group__5
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2676:1: rule__InterfaceDefinition__Group__5 : ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 ;
    public final void rule__InterfaceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2680:1: ( ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2681:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2681:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2682:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2683:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=12 && LA32_0<=35)||LA32_0==43) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2683:2: rule__InterfaceDefinition__MethodDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55543);
            	    rule__InterfaceDefinition__MethodDefAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55553);
            rule__InterfaceDefinition__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__5


    // $ANTLR start rule__InterfaceDefinition__Group__6
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2694:1: rule__InterfaceDefinition__Group__6 : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2698:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2699:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2699:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2700:1: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__InterfaceDefinition__Group__65582); 
             after(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__6


    // $ANTLR start rule__InterfaceDefinition__Group_3__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2727:1: rule__InterfaceDefinition__Group_3__0 : ( ':' ) rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2731:1: ( ( ':' ) rule__InterfaceDefinition__Group_3__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2732:1: ( ':' ) rule__InterfaceDefinition__Group_3__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2732:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2733:1: ':'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__InterfaceDefinition__Group_3__05632); 
             after(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05642);
            rule__InterfaceDefinition__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group_3__0


    // $ANTLR start rule__InterfaceDefinition__Group_3__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2747:1: rule__InterfaceDefinition__Group_3__1 : ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2751:1: ( ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2752:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2752:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2753:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_3_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2754:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2754:2: rule__InterfaceDefinition__Fqn2Assignment_3_1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15670);
            rule__InterfaceDefinition__Fqn2Assignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group_3__1


    // $ANTLR start rule__MethodDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2768:1: rule__MethodDefinition__Group__0 : ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 ;
    public final void rule__MethodDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2772:1: ( ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2773:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2773:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2774:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2775:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2775:2: rule__MethodDefinition__QualifiedTypeSpecAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05708);
            rule__MethodDefinition__QualifiedTypeSpecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05717);
            rule__MethodDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group__0


    // $ANTLR start rule__MethodDefinition__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2786:1: rule__MethodDefinition__Group__1 : ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 ;
    public final void rule__MethodDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2790:1: ( ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2791:1: ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2791:1: ( ( rule__MethodDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2792:1: ( rule__MethodDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2793:1: ( rule__MethodDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2793:2: rule__MethodDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__15745);
            rule__MethodDefinition__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__15754);
            rule__MethodDefinition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group__1


    // $ANTLR start rule__MethodDefinition__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2804:1: rule__MethodDefinition__Group__2 : ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 ;
    public final void rule__MethodDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2808:1: ( ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2809:1: ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2809:1: ( ( rule__MethodDefinition__Alternatives_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2810:1: ( rule__MethodDefinition__Alternatives_2 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2811:1: ( rule__MethodDefinition__Alternatives_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2811:2: rule__MethodDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__25782);
            rule__MethodDefinition__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__25791);
            rule__MethodDefinition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group__2


    // $ANTLR start rule__MethodDefinition__Group__3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2822:1: rule__MethodDefinition__Group__3 : ( ';' ) ;
    public final void rule__MethodDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2826:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2827:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2827:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2828:1: ';'
            {
             before(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__MethodDefinition__Group__35820); 
             after(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group__3


    // $ANTLR start rule__MethodDefinition__Group_2_0__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2849:1: rule__MethodDefinition__Group_2_0__0 : ( '(' ) rule__MethodDefinition__Group_2_0__1 ;
    public final void rule__MethodDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2853:1: ( ( '(' ) rule__MethodDefinition__Group_2_0__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2854:1: ( '(' ) rule__MethodDefinition__Group_2_0__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2854:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2855:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,47,FOLLOW_47_in_rule__MethodDefinition__Group_2_0__05864); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__05874);
            rule__MethodDefinition__Group_2_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_2_0__0


    // $ANTLR start rule__MethodDefinition__Group_2_0__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2869:1: rule__MethodDefinition__Group_2_0__1 : ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 ;
    public final void rule__MethodDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2873:1: ( ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2874:1: ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2874:1: ( ( 'void' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2875:1: ( 'void' )?
            {
             before(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2876:1: ( 'void' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2877:2: 'void'
                    {
                    match(input,16,FOLLOW_16_in_rule__MethodDefinition__Group_2_0__15904); 

                    }
                    break;

            }

             after(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__15916);
            rule__MethodDefinition__Group_2_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_2_0__1


    // $ANTLR start rule__MethodDefinition__Group_2_0__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2889:1: rule__MethodDefinition__Group_2_0__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2893:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2894:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2894:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2895:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,48,FOLLOW_48_in_rule__MethodDefinition__Group_2_0__25945); 
             after(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_2_0__2


    // $ANTLR start rule__MethodDefinition__Group_2_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2914:1: rule__MethodDefinition__Group_2_1__0 : ( '(' ) rule__MethodDefinition__Group_2_1__1 ;
    public final void rule__MethodDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2918:1: ( ( '(' ) rule__MethodDefinition__Group_2_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2919:1: ( '(' ) rule__MethodDefinition__Group_2_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2919:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2920:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,47,FOLLOW_47_in_rule__MethodDefinition__Group_2_1__05987); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__05997);
            rule__MethodDefinition__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_2_1__0


    // $ANTLR start rule__MethodDefinition__Group_2_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2934:1: rule__MethodDefinition__Group_2_1__1 : ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 ;
    public final void rule__MethodDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2938:1: ( ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2939:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2939:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2940:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2941:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2941:2: rule__MethodDefinition__ParameterListAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__16025);
            rule__MethodDefinition__ParameterListAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__16034);
            rule__MethodDefinition__Group_2_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_2_1__1


    // $ANTLR start rule__MethodDefinition__Group_2_1__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2952:1: rule__MethodDefinition__Group_2_1__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2956:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2957:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2957:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2958:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,48,FOLLOW_48_in_rule__MethodDefinition__Group_2_1__26063); 
             after(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_2_1__2


    // $ANTLR start rule__ParameterList__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2977:1: rule__ParameterList__Group__0 : ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2981:1: ( ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2982:1: ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2982:1: ( ( rule__ParameterList__ParamAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2983:1: ( rule__ParameterList__ParamAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParamAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2984:1: ( rule__ParameterList__ParamAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2984:2: rule__ParameterList__ParamAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06104);
            rule__ParameterList__ParamAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParamAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06113);
            rule__ParameterList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group__0


    // $ANTLR start rule__ParameterList__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2995:1: rule__ParameterList__Group__1 : ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2999:1: ( ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3000:1: ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3000:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3001:1: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3002:1: ( rule__ParameterList__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==44) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID||(LA34_1>=12 && LA34_1<=37)||LA34_1==43) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3002:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16141);
            	    rule__ParameterList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16151);
            rule__ParameterList__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group__1


    // $ANTLR start rule__ParameterList__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3013:1: rule__ParameterList__Group__2 : ( ( rule__ParameterList__Group_2__0 )? ) ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3017:1: ( ( ( rule__ParameterList__Group_2__0 )? ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3018:1: ( ( rule__ParameterList__Group_2__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3018:1: ( ( rule__ParameterList__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3019:1: ( rule__ParameterList__Group_2__0 )?
            {
             before(grammarAccess.getParameterListAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3020:1: ( rule__ParameterList__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3020:2: rule__ParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26179);
                    rule__ParameterList__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group__2


    // $ANTLR start rule__ParameterList__Group_1__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3036:1: rule__ParameterList__Group_1__0 : ( ',' ) rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3040:1: ( ( ',' ) rule__ParameterList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3041:1: ( ',' ) rule__ParameterList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3041:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3042:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ParameterList__Group_1__06221); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06231);
            rule__ParameterList__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group_1__0


    // $ANTLR start rule__ParameterList__Group_1__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3056:1: rule__ParameterList__Group_1__1 : ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3060:1: ( ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3061:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3061:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3062:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3063:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3063:2: rule__ParameterList__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16259);
            rule__ParameterList__ParamsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group_1__1


    // $ANTLR start rule__ParameterList__Group_2__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3077:1: rule__ParameterList__Group_2__0 : ( ',' ) rule__ParameterList__Group_2__1 ;
    public final void rule__ParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3081:1: ( ( ',' ) rule__ParameterList__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3082:1: ( ',' ) rule__ParameterList__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3082:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3083:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__ParameterList__Group_2__06298); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06308);
            rule__ParameterList__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group_2__0


    // $ANTLR start rule__ParameterList__Group_2__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3097:1: rule__ParameterList__Group_2__1 : ( '...' ) ;
    public final void rule__ParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3101:1: ( ( '...' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3102:1: ( '...' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3102:1: ( '...' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3103:1: '...'
            {
             before(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 
            match(input,55,FOLLOW_55_in_rule__ParameterList__Group_2__16337); 
             after(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__Group_2__1


    // $ANTLR start rule__Parameter__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3120:1: rule__Parameter__Group__0 : ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3124:1: ( ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3125:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3125:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3126:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3127:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=36 && LA36_0<=37)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3127:2: rule__Parameter__ParameterQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06376);
            	    rule__Parameter__ParameterQualifierAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06386);
            rule__Parameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3138:1: rule__Parameter__Group__1 : ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3142:1: ( ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3143:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3143:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3144:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3145:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3145:2: rule__Parameter__QualifiedTypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16414);
            rule__Parameter__QualifiedTypeSpecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16423);
            rule__Parameter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__Parameter__Group__2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3156:1: rule__Parameter__Group__2 : ( ( rule__Parameter__DecAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3160:1: ( ( ( rule__Parameter__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3161:1: ( ( rule__Parameter__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3161:1: ( ( rule__Parameter__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3162:1: ( rule__Parameter__DecAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3163:1: ( rule__Parameter__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3163:2: rule__Parameter__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26451);
            rule__Parameter__DecAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getDecAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__2


    // $ANTLR start rule__IncludeDirective__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3179:1: rule__IncludeDirective__Group__0 : ( '#include' ) rule__IncludeDirective__Group__1 ;
    public final void rule__IncludeDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3183:1: ( ( '#include' ) rule__IncludeDirective__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3184:1: ( '#include' ) rule__IncludeDirective__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3184:1: ( '#include' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3185:1: '#include'
            {
             before(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__IncludeDirective__Group__06492); 
             after(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06502);
            rule__IncludeDirective__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IncludeDirective__Group__0


    // $ANTLR start rule__IncludeDirective__Group__1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3199:1: rule__IncludeDirective__Group__1 : ( ( rule__IncludeDirective__Alternatives_1 ) ) ;
    public final void rule__IncludeDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3203:1: ( ( ( rule__IncludeDirective__Alternatives_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3204:1: ( ( rule__IncludeDirective__Alternatives_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3204:1: ( ( rule__IncludeDirective__Alternatives_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3205:1: ( rule__IncludeDirective__Alternatives_1 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3206:1: ( rule__IncludeDirective__Alternatives_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3206:2: rule__IncludeDirective__Alternatives_1
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Alternatives_1_in_rule__IncludeDirective__Group__16530);
            rule__IncludeDirective__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IncludeDirective__Group__1


    // $ANTLR start rule__ItfFile__IncludesAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3220:1: rule__ItfFile__IncludesAssignment_0 : ( ruleIncludeDirective ) ;
    public final void rule__ItfFile__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3224:1: ( ( ruleIncludeDirective ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3225:1: ( ruleIncludeDirective )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3225:1: ( ruleIncludeDirective )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3226:1: ruleIncludeDirective
            {
             before(grammarAccess.getItfFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_rule__ItfFile__IncludesAssignment_06568);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getItfFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__IncludesAssignment_0


    // $ANTLR start rule__ItfFile__ConstantAssignment_1_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3235:1: rule__ItfFile__ConstantAssignment_1_0 : ( ruleConstantDefinition ) ;
    public final void rule__ItfFile__ConstantAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3239:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3240:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3240:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3241:1: ruleConstantDefinition
            {
             before(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__ItfFile__ConstantAssignment_1_06599);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__ConstantAssignment_1_0


    // $ANTLR start rule__ItfFile__TypeAssignment_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3250:1: rule__ItfFile__TypeAssignment_1_1 : ( ruleTypeDefinition ) ;
    public final void rule__ItfFile__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3254:1: ( ( ruleTypeDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3255:1: ( ruleTypeDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3255:1: ( ruleTypeDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3256:1: ruleTypeDefinition
            {
             before(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__ItfFile__TypeAssignment_1_16630);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__TypeAssignment_1_1


    // $ANTLR start rule__ItfFile__InterfaceAssignment_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3265:1: rule__ItfFile__InterfaceAssignment_2 : ( ruleInterfaceDefinition ) ;
    public final void rule__ItfFile__InterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3269:1: ( ( ruleInterfaceDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3270:1: ( ruleInterfaceDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3270:1: ( ruleInterfaceDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3271:1: ruleInterfaceDefinition
            {
             before(grammarAccess.getItfFileAccess().getInterfaceInterfaceDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_rule__ItfFile__InterfaceAssignment_26661);
            ruleInterfaceDefinition();
            _fsp--;

             after(grammarAccess.getItfFileAccess().getInterfaceInterfaceDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ItfFile__InterfaceAssignment_2


    // $ANTLR start rule__TypedefSpecification__QualifedTypeAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3280:1: rule__TypedefSpecification__QualifedTypeAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__TypedefSpecification__QualifedTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3284:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3285:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3285:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3286:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_16692);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedefSpecification__QualifedTypeAssignment_1


    // $ANTLR start rule__TypedefSpecification__DecAssignment_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3295:1: rule__TypedefSpecification__DecAssignment_2 : ( ruleDeclarators ) ;
    public final void rule__TypedefSpecification__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3299:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3300:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3300:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3301:1: ruleDeclarators
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_26723);
            ruleDeclarators();
            _fsp--;

             after(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedefSpecification__DecAssignment_2


    // $ANTLR start rule__QualifiedTypeSpecification__TypeQualifierAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3310:1: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 : ( ruleTypeQualifier ) ;
    public final void rule__QualifiedTypeSpecification__TypeQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3314:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3315:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3315:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3316:1: ruleTypeQualifier
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_06754);
            ruleTypeQualifier();
            _fsp--;

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedTypeSpecification__TypeQualifierAssignment_0


    // $ANTLR start rule__QualifiedTypeSpecification__TypeSpecAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3325:1: rule__QualifiedTypeSpecification__TypeSpecAssignment_1 : ( ruleTypeSpecification ) ;
    public final void rule__QualifiedTypeSpecification__TypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3329:1: ( ( ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3330:1: ( ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3330:1: ( ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3331:1: ruleTypeSpecification
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_16785);
            ruleTypeSpecification();
            _fsp--;

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedTypeSpecification__TypeSpecAssignment_1


    // $ANTLR start rule__TypeSpecification__TypeDefNameAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3340:1: rule__TypeSpecification__TypeDefNameAssignment_0 : ( ruleTypedefName ) ;
    public final void rule__TypeSpecification__TypeDefNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3344:1: ( ( ruleTypedefName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3345:1: ( ruleTypedefName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3345:1: ( ruleTypedefName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3346:1: ruleTypedefName
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_06816);
            ruleTypedefName();
            _fsp--;

             after(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeSpecification__TypeDefNameAssignment_0


    // $ANTLR start rule__TypeSpecification__TypeSpecifierAssignment_3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3355:1: rule__TypeSpecification__TypeSpecifierAssignment_3 : ( ruleTypeSpecifier ) ;
    public final void rule__TypeSpecification__TypeSpecifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3359:1: ( ( ruleTypeSpecifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3360:1: ( ruleTypeSpecifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3360:1: ( ruleTypeSpecifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3361:1: ruleTypeSpecifier
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_36847);
            ruleTypeSpecifier();
            _fsp--;

             after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeSpecification__TypeSpecifierAssignment_3


    // $ANTLR start rule__StructOrUnionDefinition__StructAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3370:1: rule__StructOrUnionDefinition__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructOrUnionDefinition__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3374:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3375:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3375:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3376:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_06878);
            ruleStructOrUnion();
            _fsp--;

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__StructAssignment_0


    // $ANTLR start rule__StructOrUnionDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3385:1: rule__StructOrUnionDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructOrUnionDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3389:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3390:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3390:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3391:1: RULE_ID
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructOrUnionDefinition__IdAssignment_16909); 
             after(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__IdAssignment_1


    // $ANTLR start rule__StructOrUnionDefinition__StructMemberAssignment_3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3400:1: rule__StructOrUnionDefinition__StructMemberAssignment_3 : ( ruleStructMember ) ;
    public final void rule__StructOrUnionDefinition__StructMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3404:1: ( ( ruleStructMember ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3405:1: ( ruleStructMember )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3405:1: ( ruleStructMember )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3406:1: ruleStructMember
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_36940);
            ruleStructMember();
            _fsp--;

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructOrUnionDefinition__StructMemberAssignment_3


    // $ANTLR start rule__StructorUnionReference__StructAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3415:1: rule__StructorUnionReference__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructorUnionReference__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3419:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3420:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3420:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3421:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_06971);
            ruleStructOrUnion();
            _fsp--;

             after(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructorUnionReference__StructAssignment_0


    // $ANTLR start rule__StructorUnionReference__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3430:1: rule__StructorUnionReference__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructorUnionReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3434:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3435:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3435:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3436:1: RULE_ID
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructorUnionReference__IdAssignment_17002); 
             after(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructorUnionReference__IdAssignment_1


    // $ANTLR start rule__StructMember__QualTypeAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3445:1: rule__StructMember__QualTypeAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__StructMember__QualTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3449:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3450:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3450:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3451:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_07033);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__QualTypeAssignment_0


    // $ANTLR start rule__StructMember__DecAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3460:1: rule__StructMember__DecAssignment_1 : ( ruleDeclarators ) ;
    public final void rule__StructMember__DecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3464:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3465:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3465:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3466:1: ruleDeclarators
            {
             before(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_17064);
            ruleDeclarators();
            _fsp--;

             after(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__DecAssignment_1


    // $ANTLR start rule__EnumDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3475:1: rule__EnumDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3479:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3480:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3480:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3481:1: RULE_ID
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDefinition__IdAssignment_17095); 
             after(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__IdAssignment_1


    // $ANTLR start rule__EnumDefinition__EnumMemberListAssignment_3
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3490:1: rule__EnumDefinition__EnumMemberListAssignment_3 : ( ruleEnumMemberList ) ;
    public final void rule__EnumDefinition__EnumMemberListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3494:1: ( ( ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3495:1: ( ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3495:1: ( ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3496:1: ruleEnumMemberList
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37126);
            ruleEnumMemberList();
            _fsp--;

             after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDefinition__EnumMemberListAssignment_3


    // $ANTLR start rule__EnumReference__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3505:1: rule__EnumReference__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3509:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3510:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3510:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3511:1: RULE_ID
            {
             before(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumReference__IdAssignment_17157); 
             after(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumReference__IdAssignment_1


    // $ANTLR start rule__EnumMemberList__EnumMemberAssignment_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3520:1: rule__EnumMemberList__EnumMemberAssignment_1_1 : ( ruleEnumMember ) ;
    public final void rule__EnumMemberList__EnumMemberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3524:1: ( ( ruleEnumMember ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3525:1: ( ruleEnumMember )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3525:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3526:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17188);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMemberList__EnumMemberAssignment_1_1


    // $ANTLR start rule__EnumMember__IdAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3535:1: rule__EnumMember__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3539:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3540:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3540:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3541:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__IdAssignment_07219); 
             after(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__IdAssignment_0


    // $ANTLR start rule__Declarators__DecAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3550:1: rule__Declarators__DecAssignment_0 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3554:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3555:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3555:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3556:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07250);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarators__DecAssignment_0


    // $ANTLR start rule__Declarators__DeclaratorListAssignment_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3565:1: rule__Declarators__DeclaratorListAssignment_1_1 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DeclaratorListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3569:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3570:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3570:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3571:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17281);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarators__DeclaratorListAssignment_1_1


    // $ANTLR start rule__Declarator__TypeQualifierAssignment_0_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3580:1: rule__Declarator__TypeQualifierAssignment_0_1 : ( ruleTypeQualifier ) ;
    public final void rule__Declarator__TypeQualifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3584:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3585:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3585:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3586:1: ruleTypeQualifier
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17312);
            ruleTypeQualifier();
            _fsp--;

             after(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__TypeQualifierAssignment_0_1


    // $ANTLR start rule__Declarator__DcAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3595:1: rule__Declarator__DcAssignment_1 : ( ruleDirectDeclarator ) ;
    public final void rule__Declarator__DcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3599:1: ( ( ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3600:1: ( ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3600:1: ( ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3601:1: ruleDirectDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17343);
            ruleDirectDeclarator();
            _fsp--;

             after(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__DcAssignment_1


    // $ANTLR start rule__DirectDeclarator__IdAssignment_0_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3610:1: rule__DirectDeclarator__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__DirectDeclarator__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3614:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3615:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3615:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3616:1: RULE_ID
            {
             before(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectDeclarator__IdAssignment_0_07374); 
             after(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__IdAssignment_0_0


    // $ANTLR start rule__ConstantDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3625:1: rule__ConstantDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3629:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3630:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3630:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3631:1: RULE_ID
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinition__IdAssignment_17405); 
             after(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinition__IdAssignment_1


    // $ANTLR start rule__InterfaceDefinition__FqnAssignment_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3640:1: rule__InterfaceDefinition__FqnAssignment_2 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__FqnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3644:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3645:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3645:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3646:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27436);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__FqnAssignment_2


    // $ANTLR start rule__InterfaceDefinition__Fqn2Assignment_3_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3655:1: rule__InterfaceDefinition__Fqn2Assignment_3_1 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__Fqn2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3659:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3660:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3660:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3661:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17467);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Fqn2Assignment_3_1


    // $ANTLR start rule__InterfaceDefinition__MethodDefAssignment_5
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3670:1: rule__InterfaceDefinition__MethodDefAssignment_5 : ( ruleMethodDefinition ) ;
    public final void rule__InterfaceDefinition__MethodDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3674:1: ( ( ruleMethodDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3675:1: ( ruleMethodDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3675:1: ( ruleMethodDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3676:1: ruleMethodDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57498);
            ruleMethodDefinition();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__MethodDefAssignment_5


    // $ANTLR start rule__MethodDefinition__QualifiedTypeSpecAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3685:1: rule__MethodDefinition__QualifiedTypeSpecAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__MethodDefinition__QualifiedTypeSpecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3689:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3690:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3690:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3691:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07529);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__QualifiedTypeSpecAssignment_0


    // $ANTLR start rule__MethodDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3700:1: rule__MethodDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3704:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3705:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3705:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3706:1: RULE_ID
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodDefinition__IdAssignment_17560); 
             after(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__IdAssignment_1


    // $ANTLR start rule__MethodDefinition__ParameterListAssignment_2_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3715:1: rule__MethodDefinition__ParameterListAssignment_2_1_1 : ( ruleParameterList ) ;
    public final void rule__MethodDefinition__ParameterListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3719:1: ( ( ruleParameterList ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3720:1: ( ruleParameterList )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3720:1: ( ruleParameterList )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3721:1: ruleParameterList
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17591);
            ruleParameterList();
            _fsp--;

             after(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__ParameterListAssignment_2_1_1


    // $ANTLR start rule__ParameterList__ParamAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3730:1: rule__ParameterList__ParamAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3734:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3735:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3735:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3736:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_07622);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__ParamAssignment_0


    // $ANTLR start rule__ParameterList__ParamsAssignment_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3745:1: rule__ParameterList__ParamsAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3749:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3750:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3750:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3751:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_17653);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParameterList__ParamsAssignment_1_1


    // $ANTLR start rule__Parameter__ParameterQualifierAssignment_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3760:1: rule__Parameter__ParameterQualifierAssignment_0 : ( ruleParameterQualifier ) ;
    public final void rule__Parameter__ParameterQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3764:1: ( ( ruleParameterQualifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3765:1: ( ruleParameterQualifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3765:1: ( ruleParameterQualifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3766:1: ruleParameterQualifier
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_07684);
            ruleParameterQualifier();
            _fsp--;

             after(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__ParameterQualifierAssignment_0


    // $ANTLR start rule__Parameter__QualifiedTypeSpecAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3775:1: rule__Parameter__QualifiedTypeSpecAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__Parameter__QualifiedTypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3779:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3780:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3780:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3781:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_17715);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__QualifiedTypeSpecAssignment_1


    // $ANTLR start rule__Parameter__DecAssignment_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3790:1: rule__Parameter__DecAssignment_2 : ( ruleDeclarator ) ;
    public final void rule__Parameter__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3794:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3795:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3795:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3796:1: ruleDeclarator
            {
             before(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_27746);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__DecAssignment_2


    // $ANTLR start rule__IncludeDirective__ImportedURIAssignment_1_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3805:1: rule__IncludeDirective__ImportedURIAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__IncludeDirective__ImportedURIAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3809:1: ( ( RULE_STRING ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3810:1: ( RULE_STRING )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3810:1: ( RULE_STRING )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3811:1: RULE_STRING
            {
             before(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IncludeDirective__ImportedURIAssignment_1_07777); 
             after(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IncludeDirective__ImportedURIAssignment_1_0


    // $ANTLR start rule__IncludeDirective__IncludeIDAssignment_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3820:1: rule__IncludeDirective__IncludeIDAssignment_1_1 : ( RULE_INCLUDELIB ) ;
    public final void rule__IncludeDirective__IncludeIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3824:1: ( ( RULE_INCLUDELIB ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3825:1: ( RULE_INCLUDELIB )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3825:1: ( RULE_INCLUDELIB )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3826:1: RULE_INCLUDELIB
            {
             before(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0()); 
            match(input,RULE_INCLUDELIB,FOLLOW_RULE_INCLUDELIB_in_rule__IncludeDirective__IncludeIDAssignment_1_17808); 
             after(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IncludeDirective__IncludeIDAssignment_1_1


 

    public static final BitSet FOLLOW_ruleItfFile_in_entryRuleItfFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItfFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__0_in_ruleItfFile95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group__0_in_ruleStructMember704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__ConstantAssignment_1_0_in_rule__ItfFile__Alternatives_11824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__TypeAssignment_1_1_in_rule__ItfFile__Alternatives_11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_01875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_01892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_01909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives1995 = new BitSet(new long[]{0x0000000FFFFF0002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2007 = new BitSet(new long[]{0x0000000FFFFF0002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructOrUnion__Alternatives2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StructOrUnion__Alternatives2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySpecification__Alternatives_12247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArraySpecification__Alternatives_12264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__ImportedURIAssignment_1_0_in_rule__IncludeDirective__Alternatives_12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__IncludeIDAssignment_1_1_in_rule__IncludeDirective__Alternatives_12365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeQualifier__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeQualifier__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeSpecifier__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeSpecifier__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeSpecifier__Alternatives2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeSpecifier__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeSpecifier__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeSpecifier__Alternatives2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeSpecifier__Alternatives2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeSpecifier__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeSpecifier__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeSpecifier__Alternatives2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeSpecifier__Alternatives2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeSpecifier__Alternatives2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeSpecifier__Alternatives2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeSpecifier__Alternatives2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeSpecifier__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeSpecifier__Alternatives2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeSpecifier__Alternatives2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeSpecifier__Alternatives2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeSpecifier__Alternatives2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeSpecifier__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParameterQualifier__Alternatives2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterQualifier__Alternatives2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__IncludesAssignment_0_in_rule__ItfFile__Group__02949 = new BitSet(new long[]{0x0130088000003000L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__1_in_rule__ItfFile__Group__02959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__Alternatives_1_in_rule__ItfFile__Group__12987 = new BitSet(new long[]{0x0030088000003000L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__2_in_rule__ItfFile__Group__12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__InterfaceAssignment_2_in_rule__ItfFile__Group__23025 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__3_in_rule__ItfFile__Group__23034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ItfFile__Group__33064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03109 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TypeDefinition__Group__13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypedefSpecification__Group__03187 = new BitSet(new long[]{0x0000080FFFFFF020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13225 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03302 = new BitSet(new long[]{0x0000080FFFFFF020L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03378 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13415 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StructOrUnionDefinition__Group__23454 = new BitSet(new long[]{0x00000A0FFFFFF020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33492 = new BitSet(new long[]{0x00000A0FFFFFF020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StructOrUnionDefinition__Group__43531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03651 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__13688 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__13697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__23725 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__23735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StructMember__Group__33764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructMember__Group_2__03808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__03818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StructMember__Group_2__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EnumDefinition__Group__03884 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__03894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__13922 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__13932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumDefinition__Group__23961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__23971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__33999 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumDefinition__Group__44037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EnumReference__Group__04083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04159 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14195 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumMemberList__Group_1__04235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04311 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumMember__Group_1__04388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04463 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14500 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_rule__Declarators__Group_1__04540 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04616 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Declarator__Group_0__04693 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__04703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__14731 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__04770 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__04779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__14808 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DirectDeclarator__Group_0_1__04848 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__04858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__14886 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__14894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DirectDeclarator__Group_0_1__24923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ArraySpecification__Group__04965 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__04975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Alternatives_1_in_rule__ArraySpecification__Group__15003 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ArraySpecification__Group__25041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05082 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15118 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_rule__FullyQualifiedName__Group_1__05158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ConstantDefinition__Group__05234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__2_in_rule__ConstantDefinition__Group__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConstantDefinition__Group__25309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__InterfaceDefinition__Group__05349 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__InterfaceDefinition__Group__15389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25429 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35466 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__InterfaceDefinition__Group__45505 = new BitSet(new long[]{0x00000A0FFFFFF020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55543 = new BitSet(new long[]{0x00000A0FFFFFF020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__InterfaceDefinition__Group__65582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InterfaceDefinition__Group_3__05632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__15745 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__15754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__25782 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__25791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MethodDefinition__Group__35820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MethodDefinition__Group_2_0__05864 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__05874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MethodDefinition__Group_2_0__15904 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__15916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodDefinition__Group_2_0__25945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MethodDefinition__Group_2_1__05987 = new BitSet(new long[]{0x0000083FFFFFF020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__05997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__16025 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__16034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodDefinition__Group_2_1__26063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06104 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16141 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ParameterList__Group_1__06221 = new BitSet(new long[]{0x0000083FFFFFF020L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ParameterList__Group_2__06298 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ParameterList__Group_2__16337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06376 = new BitSet(new long[]{0x0000083FFFFFF020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16414 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__IncludeDirective__Group__06492 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Alternatives_1_in_rule__IncludeDirective__Group__16530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_rule__ItfFile__IncludesAssignment_06568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__ItfFile__ConstantAssignment_1_06599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__ItfFile__TypeAssignment_1_16630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rule__ItfFile__InterfaceAssignment_26661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_16692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_26723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_06754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_16785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_06816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_36847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_06878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructOrUnionDefinition__IdAssignment_16909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_36940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_06971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructorUnionReference__IdAssignment_17002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_07033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_17064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDefinition__IdAssignment_17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumReference__IdAssignment_17157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__IdAssignment_07219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectDeclarator__IdAssignment_0_07374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinition__IdAssignment_17405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodDefinition__IdAssignment_17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_07622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_17653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_07684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_17715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_27746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IncludeDirective__ImportedURIAssignment_1_07777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDELIB_in_rule__IncludeDirective__IncludeIDAssignment_1_17808 = new BitSet(new long[]{0x0000000000000002L});

}