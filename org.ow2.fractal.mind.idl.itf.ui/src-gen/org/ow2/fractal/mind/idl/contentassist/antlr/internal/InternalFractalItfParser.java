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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'struct'", "'union'", "'\".*\"'", "'<.*>'", "'const'", "'volatile'", "'void'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'", "';'", "'typedef'", "'{'", "'}'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'...'", "'#include'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start entryRuleIdentifier
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:620:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:621:1: ( ruleIdentifier EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:622:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier1280);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1287); 

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
    // $ANTLR end entryRuleIdentifier


    // $ANTLR start ruleIdentifier
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:629:1: ruleIdentifier : ( ( rule__Identifier__IdAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:633:2: ( ( ( rule__Identifier__IdAssignment ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:634:1: ( ( rule__Identifier__IdAssignment ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:634:1: ( ( rule__Identifier__IdAssignment ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:635:1: ( rule__Identifier__IdAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:636:1: ( rule__Identifier__IdAssignment )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:636:2: rule__Identifier__IdAssignment
            {
            pushFollow(FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1314);
            rule__Identifier__IdAssignment();
            _fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIdAssignment()); 

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
    // $ANTLR end ruleIdentifier


    // $ANTLR start entryRuleFullyQualifiedName
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:648:1: entryRuleFullyQualifiedName : ruleFullyQualifiedName EOF ;
    public final void entryRuleFullyQualifiedName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:649:1: ( ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:650:1: ruleFullyQualifiedName EOF
            {
             before(grammarAccess.getFullyQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1341);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getFullyQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName1348); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:657:1: ruleFullyQualifiedName : ( ( rule__FullyQualifiedName__Group__0 ) ) ;
    public final void ruleFullyQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:661:2: ( ( ( rule__FullyQualifiedName__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:662:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:662:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:663:1: ( rule__FullyQualifiedName__Group__0 )
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:664:1: ( rule__FullyQualifiedName__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:664:2: rule__FullyQualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1375);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:676:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:677:1: ( ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:678:1: ruleConstantDefinition EOF
            {
             before(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1402);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getConstantDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition1409); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:685:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:689:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:690:1: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:690:1: ( ( rule__ConstantDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:691:1: ( rule__ConstantDefinition__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:692:1: ( rule__ConstantDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:692:2: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1436);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:704:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:705:1: ( ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:706:1: ruleInterfaceDefinition EOF
            {
             before(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1463);
            ruleInterfaceDefinition();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition1470); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:713:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:717:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:718:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:718:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:719:1: ( rule__InterfaceDefinition__Group__0 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:720:1: ( rule__InterfaceDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:720:2: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1497);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:732:1: entryRuleMethodDefinition : ruleMethodDefinition EOF ;
    public final void entryRuleMethodDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:733:1: ( ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:734:1: ruleMethodDefinition EOF
            {
             before(grammarAccess.getMethodDefinitionRule()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1524);
            ruleMethodDefinition();
            _fsp--;

             after(grammarAccess.getMethodDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition1531); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:741:1: ruleMethodDefinition : ( ( rule__MethodDefinition__Group__0 ) ) ;
    public final void ruleMethodDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:745:2: ( ( ( rule__MethodDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:746:1: ( ( rule__MethodDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:746:1: ( ( rule__MethodDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:747:1: ( rule__MethodDefinition__Group__0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:748:1: ( rule__MethodDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:748:2: rule__MethodDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1558);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:760:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:761:1: ( ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:762:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1585);
            ruleParameterList();
            _fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1592); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:769:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:773:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:774:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:774:1: ( ( rule__ParameterList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:775:1: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:776:1: ( rule__ParameterList__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:776:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1619);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:788:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:789:1: ( ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:790:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1646);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1653); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:797:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:801:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:802:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:802:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:803:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:804:1: ( rule__Parameter__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:804:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1680);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:816:1: entryRuleIncludeDirective : ruleIncludeDirective EOF ;
    public final void entryRuleIncludeDirective() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:817:1: ( ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:818:1: ruleIncludeDirective EOF
            {
             before(grammarAccess.getIncludeDirectiveRule()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1707);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getIncludeDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective1714); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:825:1: ruleIncludeDirective : ( ( rule__IncludeDirective__Group__0 ) ) ;
    public final void ruleIncludeDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:829:2: ( ( ( rule__IncludeDirective__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:830:1: ( ( rule__IncludeDirective__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:830:1: ( ( rule__IncludeDirective__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:831:1: ( rule__IncludeDirective__Group__0 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:832:1: ( rule__IncludeDirective__Group__0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:832:2: rule__IncludeDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1741);
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


    // $ANTLR start entryRuleIncludePath
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:844:1: entryRuleIncludePath : ruleIncludePath EOF ;
    public final void entryRuleIncludePath() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:845:1: ( ruleIncludePath EOF )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:846:1: ruleIncludePath EOF
            {
             before(grammarAccess.getIncludePathRule()); 
            pushFollow(FOLLOW_ruleIncludePath_in_entryRuleIncludePath1768);
            ruleIncludePath();
            _fsp--;

             after(grammarAccess.getIncludePathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludePath1775); 

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
    // $ANTLR end entryRuleIncludePath


    // $ANTLR start ruleIncludePath
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:853:1: ruleIncludePath : ( ( rule__IncludePath__Alternatives ) ) ;
    public final void ruleIncludePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:857:2: ( ( ( rule__IncludePath__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:858:1: ( ( rule__IncludePath__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:858:1: ( ( rule__IncludePath__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:859:1: ( rule__IncludePath__Alternatives )
            {
             before(grammarAccess.getIncludePathAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:860:1: ( rule__IncludePath__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:860:2: rule__IncludePath__Alternatives
            {
            pushFollow(FOLLOW_rule__IncludePath__Alternatives_in_ruleIncludePath1802);
            rule__IncludePath__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getIncludePathAccess().getAlternatives()); 

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
    // $ANTLR end ruleIncludePath


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:873:1: ruleTypeQualifier : ( ( rule__TypeQualifier__Alternatives ) ) ;
    public final void ruleTypeQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:877:1: ( ( ( rule__TypeQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:878:1: ( ( rule__TypeQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:878:1: ( ( rule__TypeQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:879:1: ( rule__TypeQualifier__Alternatives )
            {
             before(grammarAccess.getTypeQualifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:880:1: ( rule__TypeQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:880:2: rule__TypeQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1839);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:892:1: ruleTypeSpecifier : ( ( rule__TypeSpecifier__Alternatives ) ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:896:1: ( ( ( rule__TypeSpecifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:897:1: ( ( rule__TypeSpecifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:897:1: ( ( rule__TypeSpecifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:898:1: ( rule__TypeSpecifier__Alternatives )
            {
             before(grammarAccess.getTypeSpecifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:899:1: ( rule__TypeSpecifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:899:2: rule__TypeSpecifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1875);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:911:1: ruleParameterQualifier : ( ( rule__ParameterQualifier__Alternatives ) ) ;
    public final void ruleParameterQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:915:1: ( ( ( rule__ParameterQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:916:1: ( ( rule__ParameterQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:916:1: ( ( rule__ParameterQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:917:1: ( rule__ParameterQualifier__Alternatives )
            {
             before(grammarAccess.getParameterQualifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:918:1: ( rule__ParameterQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:918:2: rule__ParameterQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1911);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:929:1: rule__ItfFile__Alternatives_1 : ( ( ( rule__ItfFile__TypeAssignment_1_0 ) ) | ( ( rule__ItfFile__ConstantAssignment_1_1 ) ) );
    public final void rule__ItfFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:933:1: ( ( ( rule__ItfFile__TypeAssignment_1_0 ) ) | ( ( rule__ItfFile__ConstantAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==40||LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==53) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("929:1: rule__ItfFile__Alternatives_1 : ( ( ( rule__ItfFile__TypeAssignment_1_0 ) ) | ( ( rule__ItfFile__ConstantAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:934:1: ( ( rule__ItfFile__TypeAssignment_1_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:934:1: ( ( rule__ItfFile__TypeAssignment_1_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:935:1: ( rule__ItfFile__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getItfFileAccess().getTypeAssignment_1_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:936:1: ( rule__ItfFile__TypeAssignment_1_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:936:2: rule__ItfFile__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ItfFile__TypeAssignment_1_0_in_rule__ItfFile__Alternatives_11946);
                    rule__ItfFile__TypeAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getItfFileAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:940:6: ( ( rule__ItfFile__ConstantAssignment_1_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:940:6: ( ( rule__ItfFile__ConstantAssignment_1_1 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:941:1: ( rule__ItfFile__ConstantAssignment_1_1 )
                    {
                     before(grammarAccess.getItfFileAccess().getConstantAssignment_1_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:942:1: ( rule__ItfFile__ConstantAssignment_1_1 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:942:2: rule__ItfFile__ConstantAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ItfFile__ConstantAssignment_1_1_in_rule__ItfFile__Alternatives_11964);
                    rule__ItfFile__ConstantAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getItfFileAccess().getConstantAssignment_1_1()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:951:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );
    public final void rule__TypeDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:955:1: ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 11:
            case 12:
                {
                alt2=2;
                }
                break;
            case 44:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("951:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:956:1: ( ruleTypedefSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:956:1: ( ruleTypedefSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:957:1: ruleTypedefSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_01997);
                    ruleTypedefSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:962:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:962:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:963:1: ruleStructOrUnionSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02014);
                    ruleStructOrUnionSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:968:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:968:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:969:1: ruleEnumSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02031);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:979:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:983:1: ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 11:
            case 12:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
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
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("979:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:984:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:984:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:985:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:986:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:986:2: rule__TypeSpecification__TypeDefNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2063);
                    rule__TypeSpecification__TypeDefNameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:990:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:990:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:991:1: ruleStructOrUnionSpecification
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2081);
                    ruleStructOrUnionSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:996:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:996:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:997:1: ruleEnumSpecification
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2098);
                    ruleEnumSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1002:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1002:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1003:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1003:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1004:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1005:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1005:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2117);
                    rule__TypeSpecification__TypeSpecifierAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 

                    }

                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1008:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1009:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1010:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=17 && LA3_0<=36)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1010:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    	    {
                    	    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2129);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1020:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );
    public final void rule__StructOrUnionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1024:1: ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==39||(LA5_3>=47 && LA5_3<=48)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==41) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1020:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==41) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1020:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==12) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==39||(LA5_3>=47 && LA5_3<=48)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==41) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1020:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==41) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1020:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1020:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1025:1: ( ruleStructOrUnionDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1025:1: ( ruleStructOrUnionDefinition )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1026:1: ruleStructOrUnionDefinition
                    {
                     before(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2165);
                    ruleStructOrUnionDefinition();
                    _fsp--;

                     after(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1031:6: ( ruleStructorUnionReference )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1031:6: ( ruleStructorUnionReference )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1032:1: ruleStructorUnionReference
                    {
                     before(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2182);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1042:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );
    public final void rule__StructOrUnion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1046:1: ( ( 'struct' ) | ( 'union' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1042:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1047:1: ( 'struct' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1047:1: ( 'struct' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1048:1: 'struct'
                    {
                     before(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__StructOrUnion__Alternatives2215); 
                     after(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1055:6: ( 'union' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1055:6: ( 'union' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1056:1: 'union'
                    {
                     before(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__StructOrUnion__Alternatives2235); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1068:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );
    public final void rule__EnumSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1072:1: ( ( ruleEnumDefinition ) | ( ruleEnumReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==39||(LA7_2>=47 && LA7_2<=48)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==41) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==41) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1068:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1073:1: ( ruleEnumDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1073:1: ( ruleEnumDefinition )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1074:1: ruleEnumDefinition
                    {
                     before(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2269);
                    ruleEnumDefinition();
                    _fsp--;

                     after(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1079:6: ( ruleEnumReference )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1079:6: ( ruleEnumReference )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1080:1: ruleEnumReference
                    {
                     before(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2286);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1090:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );
    public final void rule__DirectDeclarator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1094:1: ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==48) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1090:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1095:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1095:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1096:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    {
                     before(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1097:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1097:2: rule__DirectDeclarator__IdAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02318);
                    rule__DirectDeclarator__IdAssignment_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1101:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1101:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1102:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    {
                     before(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1103:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1103:2: rule__DirectDeclarator__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02336);
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


    // $ANTLR start rule__MethodDefinition__Alternatives_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1112:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );
    public final void rule__MethodDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1116:1: ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 11:
                case 12:
                case 15:
                case 16:
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
                case 38:
                case 44:
                    {
                    alt9=2;
                    }
                    break;
                case 17:
                    {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==49) ) {
                        alt9=1;
                    }
                    else if ( (LA9_3==RULE_ID||(LA9_3>=17 && LA9_3<=36)||(LA9_3>=47 && LA9_3<=48)) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1112:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 9, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 49:
                    {
                    alt9=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1112:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1112:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1117:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1117:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1118:1: ( rule__MethodDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1119:1: ( rule__MethodDefinition__Group_2_0__0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1119:2: rule__MethodDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22369);
                    rule__MethodDefinition__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1123:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1123:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1124:1: ( rule__MethodDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1125:1: ( rule__MethodDefinition__Group_2_1__0 )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1125:2: rule__MethodDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22387);
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


    // $ANTLR start rule__IncludePath__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1134:1: rule__IncludePath__Alternatives : ( ( '\".*\"' ) | ( '<.*>' ) );
    public final void rule__IncludePath__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1138:1: ( ( '\".*\"' ) | ( '<.*>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1134:1: rule__IncludePath__Alternatives : ( ( '\".*\"' ) | ( '<.*>' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1139:1: ( '\".*\"' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1139:1: ( '\".*\"' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1140:1: '\".*\"'
                    {
                     before(grammarAccess.getIncludePathAccess().getQuotationMarkFullStopAsteriskQuotationMarkKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__IncludePath__Alternatives2421); 
                     after(grammarAccess.getIncludePathAccess().getQuotationMarkFullStopAsteriskQuotationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1147:6: ( '<.*>' )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1147:6: ( '<.*>' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1148:1: '<.*>'
                    {
                     before(grammarAccess.getIncludePathAccess().getLessThanSignFullStopAsteriskGreaterThanSignKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__IncludePath__Alternatives2441); 
                     after(grammarAccess.getIncludePathAccess().getLessThanSignFullStopAsteriskGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__IncludePath__Alternatives


    // $ANTLR start rule__TypeQualifier__Alternatives
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1160:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );
    public final void rule__TypeQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1164:1: ( ( ( 'const' ) ) | ( ( 'volatile' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1160:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1165:1: ( ( 'const' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1165:1: ( ( 'const' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1166:1: ( 'const' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1167:1: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1167:3: 'const'
                    {
                    match(input,15,FOLLOW_15_in_rule__TypeQualifier__Alternatives2476); 

                    }

                     after(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1172:6: ( ( 'volatile' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1172:6: ( ( 'volatile' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1173:1: ( 'volatile' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1174:1: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1174:3: 'volatile'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeQualifier__Alternatives2497); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1184:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );
    public final void rule__TypeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1188:1: ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) )
            int alt12=20;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            case 20:
                {
                alt12=4;
                }
                break;
            case 21:
                {
                alt12=5;
                }
                break;
            case 22:
                {
                alt12=6;
                }
                break;
            case 23:
                {
                alt12=7;
                }
                break;
            case 24:
                {
                alt12=8;
                }
                break;
            case 25:
                {
                alt12=9;
                }
                break;
            case 26:
                {
                alt12=10;
                }
                break;
            case 27:
                {
                alt12=11;
                }
                break;
            case 28:
                {
                alt12=12;
                }
                break;
            case 29:
                {
                alt12=13;
                }
                break;
            case 30:
                {
                alt12=14;
                }
                break;
            case 31:
                {
                alt12=15;
                }
                break;
            case 32:
                {
                alt12=16;
                }
                break;
            case 33:
                {
                alt12=17;
                }
                break;
            case 34:
                {
                alt12=18;
                }
                break;
            case 35:
                {
                alt12=19;
                }
                break;
            case 36:
                {
                alt12=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1184:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1189:1: ( ( 'void' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1189:1: ( ( 'void' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1190:1: ( 'void' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1191:1: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1191:3: 'void'
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeSpecifier__Alternatives2533); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1196:6: ( ( 'char' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1196:6: ( ( 'char' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1197:1: ( 'char' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1198:1: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1198:3: 'char'
                    {
                    match(input,18,FOLLOW_18_in_rule__TypeSpecifier__Alternatives2554); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1203:6: ( ( 'short' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1203:6: ( ( 'short' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1204:1: ( 'short' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1205:1: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1205:3: 'short'
                    {
                    match(input,19,FOLLOW_19_in_rule__TypeSpecifier__Alternatives2575); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1210:6: ( ( 'int' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1210:6: ( ( 'int' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1211:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1212:1: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1212:3: 'int'
                    {
                    match(input,20,FOLLOW_20_in_rule__TypeSpecifier__Alternatives2596); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1217:6: ( ( 'long' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1217:6: ( ( 'long' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1218:1: ( 'long' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1219:1: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1219:3: 'long'
                    {
                    match(input,21,FOLLOW_21_in_rule__TypeSpecifier__Alternatives2617); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1224:6: ( ( 'float' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1224:6: ( ( 'float' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1225:1: ( 'float' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1226:1: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1226:3: 'float'
                    {
                    match(input,22,FOLLOW_22_in_rule__TypeSpecifier__Alternatives2638); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1231:6: ( ( 'double' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1231:6: ( ( 'double' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1232:1: ( 'double' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1233:1: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1233:3: 'double'
                    {
                    match(input,23,FOLLOW_23_in_rule__TypeSpecifier__Alternatives2659); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1238:6: ( ( 'signed' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1238:6: ( ( 'signed' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1239:1: ( 'signed' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1240:1: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1240:3: 'signed'
                    {
                    match(input,24,FOLLOW_24_in_rule__TypeSpecifier__Alternatives2680); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1245:6: ( ( 'unsigned' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1245:6: ( ( 'unsigned' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1246:1: ( 'unsigned' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1247:1: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1247:3: 'unsigned'
                    {
                    match(input,25,FOLLOW_25_in_rule__TypeSpecifier__Alternatives2701); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1252:6: ( ( 'string' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1252:6: ( ( 'string' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1253:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1254:1: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1254:3: 'string'
                    {
                    match(input,26,FOLLOW_26_in_rule__TypeSpecifier__Alternatives2722); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1259:6: ( ( 'int8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1259:6: ( ( 'int8_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1260:1: ( 'int8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1261:1: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1261:3: 'int8_t'
                    {
                    match(input,27,FOLLOW_27_in_rule__TypeSpecifier__Alternatives2743); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1266:6: ( ( 'uint8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1266:6: ( ( 'uint8_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1267:1: ( 'uint8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1268:1: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1268:3: 'uint8_t'
                    {
                    match(input,28,FOLLOW_28_in_rule__TypeSpecifier__Alternatives2764); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1273:6: ( ( 'int16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1273:6: ( ( 'int16_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1274:1: ( 'int16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1275:1: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1275:3: 'int16_t'
                    {
                    match(input,29,FOLLOW_29_in_rule__TypeSpecifier__Alternatives2785); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1280:6: ( ( 'uint16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1280:6: ( ( 'uint16_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1281:1: ( 'uint16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1282:1: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1282:3: 'uint16_t'
                    {
                    match(input,30,FOLLOW_30_in_rule__TypeSpecifier__Alternatives2806); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1287:6: ( ( 'int32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1287:6: ( ( 'int32_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1288:1: ( 'int32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1289:1: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1289:3: 'int32_t'
                    {
                    match(input,31,FOLLOW_31_in_rule__TypeSpecifier__Alternatives2827); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1294:6: ( ( 'uint32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1294:6: ( ( 'uint32_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1295:1: ( 'uint32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1296:1: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1296:3: 'uint32_t'
                    {
                    match(input,32,FOLLOW_32_in_rule__TypeSpecifier__Alternatives2848); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1301:6: ( ( 'int64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1301:6: ( ( 'int64_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1302:1: ( 'int64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1303:1: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1303:3: 'int64_t'
                    {
                    match(input,33,FOLLOW_33_in_rule__TypeSpecifier__Alternatives2869); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1308:6: ( ( 'uint64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1308:6: ( ( 'uint64_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1309:1: ( 'uint64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1310:1: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1310:3: 'uint64_t'
                    {
                    match(input,34,FOLLOW_34_in_rule__TypeSpecifier__Alternatives2890); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1315:6: ( ( 'intptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1315:6: ( ( 'intptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1316:1: ( 'intptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1317:1: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1317:3: 'intptr_t'
                    {
                    match(input,35,FOLLOW_35_in_rule__TypeSpecifier__Alternatives2911); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1322:6: ( ( 'uintptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1322:6: ( ( 'uintptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1323:1: ( 'uintptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1324:1: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1324:3: 'uintptr_t'
                    {
                    match(input,36,FOLLOW_36_in_rule__TypeSpecifier__Alternatives2932); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1334:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__ParameterQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1338:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1334:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1339:1: ( ( 'in' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1339:1: ( ( 'in' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1340:1: ( 'in' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1341:1: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1341:3: 'in'
                    {
                    match(input,37,FOLLOW_37_in_rule__ParameterQualifier__Alternatives2968); 

                    }

                     after(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1346:6: ( ( 'out' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1346:6: ( ( 'out' ) )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1347:1: ( 'out' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1348:1: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1348:3: 'out'
                    {
                    match(input,38,FOLLOW_38_in_rule__ParameterQualifier__Alternatives2989); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1360:1: rule__ItfFile__Group__0 : ( ( rule__ItfFile__IncludesAssignment_0 )* ) rule__ItfFile__Group__1 ;
    public final void rule__ItfFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1364:1: ( ( ( rule__ItfFile__IncludesAssignment_0 )* ) rule__ItfFile__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1365:1: ( ( rule__ItfFile__IncludesAssignment_0 )* ) rule__ItfFile__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1365:1: ( ( rule__ItfFile__IncludesAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1366:1: ( rule__ItfFile__IncludesAssignment_0 )*
            {
             before(grammarAccess.getItfFileAccess().getIncludesAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1367:1: ( rule__ItfFile__IncludesAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==57) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1367:2: rule__ItfFile__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ItfFile__IncludesAssignment_0_in_rule__ItfFile__Group__03026);
            	    rule__ItfFile__IncludesAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getItfFileAccess().getIncludesAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ItfFile__Group__1_in_rule__ItfFile__Group__03036);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1378:1: rule__ItfFile__Group__1 : ( ( rule__ItfFile__Alternatives_1 )* ) rule__ItfFile__Group__2 ;
    public final void rule__ItfFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1382:1: ( ( ( rule__ItfFile__Alternatives_1 )* ) rule__ItfFile__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1383:1: ( ( rule__ItfFile__Alternatives_1 )* ) rule__ItfFile__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1383:1: ( ( rule__ItfFile__Alternatives_1 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1384:1: ( rule__ItfFile__Alternatives_1 )*
            {
             before(grammarAccess.getItfFileAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1385:1: ( rule__ItfFile__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=12)||LA15_0==40||LA15_0==44||LA15_0==53) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1385:2: rule__ItfFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ItfFile__Alternatives_1_in_rule__ItfFile__Group__13064);
            	    rule__ItfFile__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getItfFileAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__ItfFile__Group__2_in_rule__ItfFile__Group__13074);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1396:1: rule__ItfFile__Group__2 : ( ( rule__ItfFile__InterfaceAssignment_2 ) ) rule__ItfFile__Group__3 ;
    public final void rule__ItfFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1400:1: ( ( ( rule__ItfFile__InterfaceAssignment_2 ) ) rule__ItfFile__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1401:1: ( ( rule__ItfFile__InterfaceAssignment_2 ) ) rule__ItfFile__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1401:1: ( ( rule__ItfFile__InterfaceAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1402:1: ( rule__ItfFile__InterfaceAssignment_2 )
            {
             before(grammarAccess.getItfFileAccess().getInterfaceAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1403:1: ( rule__ItfFile__InterfaceAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1403:2: rule__ItfFile__InterfaceAssignment_2
            {
            pushFollow(FOLLOW_rule__ItfFile__InterfaceAssignment_2_in_rule__ItfFile__Group__23102);
            rule__ItfFile__InterfaceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getItfFileAccess().getInterfaceAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ItfFile__Group__3_in_rule__ItfFile__Group__23111);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1414:1: rule__ItfFile__Group__3 : ( ( ';' )? ) ;
    public final void rule__ItfFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1418:1: ( ( ( ';' )? ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1419:1: ( ( ';' )? )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1419:1: ( ( ';' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1420:1: ( ';' )?
            {
             before(grammarAccess.getItfFileAccess().getSemicolonKeyword_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1421:1: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1422:2: ';'
                    {
                    match(input,39,FOLLOW_39_in_rule__ItfFile__Group__33141); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1441:1: rule__TypeDefinition__Group__0 : ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1445:1: ( ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1446:1: ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1446:1: ( ( rule__TypeDefinition__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1447:1: ( rule__TypeDefinition__Alternatives_0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1448:1: ( rule__TypeDefinition__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1448:2: rule__TypeDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03186);
            rule__TypeDefinition__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03195);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1459:1: rule__TypeDefinition__Group__1 : ( ';' ) ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1463:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1464:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1464:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1465:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__TypeDefinition__Group__13224); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1482:1: rule__TypedefSpecification__Group__0 : ( 'typedef' ) rule__TypedefSpecification__Group__1 ;
    public final void rule__TypedefSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1486:1: ( ( 'typedef' ) rule__TypedefSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1487:1: ( 'typedef' ) rule__TypedefSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1487:1: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1488:1: 'typedef'
            {
             before(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__TypedefSpecification__Group__03264); 
             after(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03274);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1502:1: rule__TypedefSpecification__Group__1 : ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 ;
    public final void rule__TypedefSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1506:1: ( ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1507:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1507:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1508:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1509:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1509:2: rule__TypedefSpecification__QualifedTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13302);
            rule__TypedefSpecification__QualifedTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13311);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1520:1: rule__TypedefSpecification__Group__2 : ( ( rule__TypedefSpecification__DecAssignment_2 ) ) ;
    public final void rule__TypedefSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1524:1: ( ( ( rule__TypedefSpecification__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1525:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1525:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1526:1: ( rule__TypedefSpecification__DecAssignment_2 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1527:1: ( rule__TypedefSpecification__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1527:2: rule__TypedefSpecification__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23339);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1543:1: rule__QualifiedTypeSpecification__Group__0 : ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 ;
    public final void rule__QualifiedTypeSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1547:1: ( ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1548:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1548:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1549:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1550:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=15 && LA17_0<=16)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1550:2: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03379);
            	    rule__QualifiedTypeSpecification__TypeQualifierAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03389);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1561:1: rule__QualifiedTypeSpecification__Group__1 : ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) ;
    public final void rule__QualifiedTypeSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1565:1: ( ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1566:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1566:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1567:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1568:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1568:2: rule__QualifiedTypeSpecification__TypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13417);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1582:1: rule__StructOrUnionDefinition__Group__0 : ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 ;
    public final void rule__StructOrUnionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1586:1: ( ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1587:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1587:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1588:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1589:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1589:2: rule__StructOrUnionDefinition__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03455);
            rule__StructOrUnionDefinition__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03464);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1600:1: rule__StructOrUnionDefinition__Group__1 : ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 ;
    public final void rule__StructOrUnionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1604:1: ( ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1605:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1605:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1606:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1607:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1607:2: rule__StructOrUnionDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13492);
                    rule__StructOrUnionDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13502);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1618:1: rule__StructOrUnionDefinition__Group__2 : ( '{' ) rule__StructOrUnionDefinition__Group__3 ;
    public final void rule__StructOrUnionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1622:1: ( ( '{' ) rule__StructOrUnionDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1623:1: ( '{' ) rule__StructOrUnionDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1623:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1624:1: '{'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__StructOrUnionDefinition__Group__23531); 
             after(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23541);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1638:1: rule__StructOrUnionDefinition__Group__3 : ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 ;
    public final void rule__StructOrUnionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1642:1: ( ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1643:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1643:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1644:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1645:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=11 && LA19_0<=12)||(LA19_0>=15 && LA19_0<=36)||LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1645:2: rule__StructOrUnionDefinition__StructMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33569);
            	    rule__StructOrUnionDefinition__StructMemberAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33579);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1656:1: rule__StructOrUnionDefinition__Group__4 : ( '}' ) ;
    public final void rule__StructOrUnionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1660:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1661:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1661:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1662:1: '}'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__StructOrUnionDefinition__Group__43608); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1685:1: rule__StructorUnionReference__Group__0 : ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 ;
    public final void rule__StructorUnionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1689:1: ( ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1690:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1690:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1691:1: ( rule__StructorUnionReference__StructAssignment_0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1692:1: ( rule__StructorUnionReference__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1692:2: rule__StructorUnionReference__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03653);
            rule__StructorUnionReference__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03662);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1703:1: rule__StructorUnionReference__Group__1 : ( ( rule__StructorUnionReference__IdAssignment_1 ) ) ;
    public final void rule__StructorUnionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1707:1: ( ( ( rule__StructorUnionReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1708:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1708:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1709:1: ( rule__StructorUnionReference__IdAssignment_1 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1710:1: ( rule__StructorUnionReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1710:2: rule__StructorUnionReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13690);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1724:1: rule__StructMember__Group__0 : ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 ;
    public final void rule__StructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1728:1: ( ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1729:1: ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1729:1: ( ( rule__StructMember__QualTypeAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1730:1: ( rule__StructMember__QualTypeAssignment_0 )
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1731:1: ( rule__StructMember__QualTypeAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1731:2: rule__StructMember__QualTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03728);
            rule__StructMember__QualTypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03737);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1742:1: rule__StructMember__Group__1 : ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 ;
    public final void rule__StructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1746:1: ( ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1747:1: ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1747:1: ( ( rule__StructMember__DecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1748:1: ( rule__StructMember__DecAssignment_1 )
            {
             before(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1749:1: ( rule__StructMember__DecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1749:2: rule__StructMember__DecAssignment_1
            {
            pushFollow(FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__13765);
            rule__StructMember__DecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__13774);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1760:1: rule__StructMember__Group__2 : ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 ;
    public final void rule__StructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1764:1: ( ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1765:1: ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1765:1: ( ( rule__StructMember__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1766:1: ( rule__StructMember__Group_2__0 )?
            {
             before(grammarAccess.getStructMemberAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1767:1: ( rule__StructMember__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1767:2: rule__StructMember__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__23802);
                    rule__StructMember__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructMemberAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__23812);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1778:1: rule__StructMember__Group__3 : ( ';' ) ;
    public final void rule__StructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1782:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1783:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1783:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1784:1: ';'
            {
             before(grammarAccess.getStructMemberAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__StructMember__Group__33841); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1805:1: rule__StructMember__Group_2__0 : ( ':' ) rule__StructMember__Group_2__1 ;
    public final void rule__StructMember__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1809:1: ( ( ':' ) rule__StructMember__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1810:1: ( ':' ) rule__StructMember__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1810:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1811:1: ':'
            {
             before(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__StructMember__Group_2__03885); 
             after(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__03895);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1825:1: rule__StructMember__Group_2__1 : ( RULE_INT ) ;
    public final void rule__StructMember__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1829:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1830:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1830:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1831:1: RULE_INT
            {
             before(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StructMember__Group_2__13923); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1846:1: rule__EnumDefinition__Group__0 : ( 'enum' ) rule__EnumDefinition__Group__1 ;
    public final void rule__EnumDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1850:1: ( ( 'enum' ) rule__EnumDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1851:1: ( 'enum' ) rule__EnumDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1851:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1852:1: 'enum'
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumDefinition__Group__03961); 
             after(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__03971);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1866:1: rule__EnumDefinition__Group__1 : ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 ;
    public final void rule__EnumDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1870:1: ( ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1871:1: ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1871:1: ( ( rule__EnumDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1872:1: ( rule__EnumDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1873:1: ( rule__EnumDefinition__IdAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1873:2: rule__EnumDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__13999);
                    rule__EnumDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__14009);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1884:1: rule__EnumDefinition__Group__2 : ( '{' ) rule__EnumDefinition__Group__3 ;
    public final void rule__EnumDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1888:1: ( ( '{' ) rule__EnumDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1889:1: ( '{' ) rule__EnumDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1889:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1890:1: '{'
            {
             before(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__EnumDefinition__Group__24038); 
             after(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__24048);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1904:1: rule__EnumDefinition__Group__3 : ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 ;
    public final void rule__EnumDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1908:1: ( ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1909:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1909:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1910:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1911:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1911:2: rule__EnumDefinition__EnumMemberListAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__34076);
            rule__EnumDefinition__EnumMemberListAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34085);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1922:1: rule__EnumDefinition__Group__4 : ( '}' ) ;
    public final void rule__EnumDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1926:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1927:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1927:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1928:1: '}'
            {
             before(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__EnumDefinition__Group__44114); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1951:1: rule__EnumReference__Group__0 : ( 'enum' ) rule__EnumReference__Group__1 ;
    public final void rule__EnumReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1955:1: ( ( 'enum' ) rule__EnumReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1956:1: ( 'enum' ) rule__EnumReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1956:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1957:1: 'enum'
            {
             before(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumReference__Group__04160); 
             after(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04170);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1971:1: rule__EnumReference__Group__1 : ( ( rule__EnumReference__IdAssignment_1 ) ) ;
    public final void rule__EnumReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1975:1: ( ( ( rule__EnumReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1976:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1976:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1977:1: ( rule__EnumReference__IdAssignment_1 )
            {
             before(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1978:1: ( rule__EnumReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1978:2: rule__EnumReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14198);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1992:1: rule__EnumMemberList__Group__0 : ( ruleEnumMember ) rule__EnumMemberList__Group__1 ;
    public final void rule__EnumMemberList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1996:1: ( ( ruleEnumMember ) rule__EnumMemberList__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1997:1: ( ruleEnumMember ) rule__EnumMemberList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1997:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:1998:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04236);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04244);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2010:1: rule__EnumMemberList__Group__1 : ( ( rule__EnumMemberList__Group_1__0 )* ) ;
    public final void rule__EnumMemberList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2014:1: ( ( ( rule__EnumMemberList__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2015:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2015:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2016:1: ( rule__EnumMemberList__Group_1__0 )*
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2017:1: ( rule__EnumMemberList__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2017:2: rule__EnumMemberList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14272);
            	    rule__EnumMemberList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2031:1: rule__EnumMemberList__Group_1__0 : ( ',' ) rule__EnumMemberList__Group_1__1 ;
    public final void rule__EnumMemberList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2035:1: ( ( ',' ) rule__EnumMemberList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2036:1: ( ',' ) rule__EnumMemberList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2036:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2037:1: ','
            {
             before(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumMemberList__Group_1__04312); 
             after(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04322);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2051:1: rule__EnumMemberList__Group_1__1 : ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) ;
    public final void rule__EnumMemberList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2055:1: ( ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2056:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2056:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2057:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2058:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2058:2: rule__EnumMemberList__EnumMemberAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14350);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2072:1: rule__EnumMember__Group__0 : ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2076:1: ( ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2077:1: ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2077:1: ( ( rule__EnumMember__IdAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2078:1: ( rule__EnumMember__IdAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2079:1: ( rule__EnumMember__IdAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2079:2: rule__EnumMember__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04388);
            rule__EnumMember__IdAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04397);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2090:1: rule__EnumMember__Group__1 : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2094:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2095:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2095:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2096:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2097:1: ( rule__EnumMember__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2097:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14425);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2111:1: rule__EnumMember__Group_1__0 : ( '=' ) rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2115:1: ( ( '=' ) rule__EnumMember__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2116:1: ( '=' ) rule__EnumMember__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2116:1: ( '=' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2117:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__EnumMember__Group_1__04465); 
             after(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04475);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2131:1: rule__EnumMember__Group_1__1 : ( RULE_INT ) ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2135:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2136:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2136:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2137:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14503); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2152:1: rule__Declarators__Group__0 : ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 ;
    public final void rule__Declarators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2156:1: ( ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2157:1: ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2157:1: ( ( rule__Declarators__DecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2158:1: ( rule__Declarators__DecAssignment_0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2159:1: ( rule__Declarators__DecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2159:2: rule__Declarators__DecAssignment_0
            {
            pushFollow(FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04540);
            rule__Declarators__DecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04549);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2170:1: rule__Declarators__Group__1 : ( ( rule__Declarators__Group_1__0 )* ) ;
    public final void rule__Declarators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2174:1: ( ( ( rule__Declarators__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2175:1: ( ( rule__Declarators__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2175:1: ( ( rule__Declarators__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2176:1: ( rule__Declarators__Group_1__0 )*
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2177:1: ( rule__Declarators__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2177:2: rule__Declarators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14577);
            	    rule__Declarators__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2191:1: rule__Declarators__Group_1__0 : ( ',' ) rule__Declarators__Group_1__1 ;
    public final void rule__Declarators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2195:1: ( ( ',' ) rule__Declarators__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2196:1: ( ',' ) rule__Declarators__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2196:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2197:1: ','
            {
             before(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Declarators__Group_1__04617); 
             after(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04627);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2211:1: rule__Declarators__Group_1__1 : ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) ;
    public final void rule__Declarators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2215:1: ( ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2216:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2216:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2217:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2218:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2218:2: rule__Declarators__DeclaratorListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14655);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2232:1: rule__Declarator__Group__0 : ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 ;
    public final void rule__Declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2236:1: ( ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2237:1: ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2237:1: ( ( rule__Declarator__Group_0__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2238:1: ( rule__Declarator__Group_0__0 )*
            {
             before(grammarAccess.getDeclaratorAccess().getGroup_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2239:1: ( rule__Declarator__Group_0__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2239:2: rule__Declarator__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04693);
            	    rule__Declarator__Group_0__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDeclaratorAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04703);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2250:1: rule__Declarator__Group__1 : ( ( rule__Declarator__DcAssignment_1 ) ) ;
    public final void rule__Declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2254:1: ( ( ( rule__Declarator__DcAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2255:1: ( ( rule__Declarator__DcAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2255:1: ( ( rule__Declarator__DcAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2256:1: ( rule__Declarator__DcAssignment_1 )
            {
             before(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2257:1: ( rule__Declarator__DcAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2257:2: rule__Declarator__DcAssignment_1
            {
            pushFollow(FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14731);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2271:1: rule__Declarator__Group_0__0 : ( '*' ) rule__Declarator__Group_0__1 ;
    public final void rule__Declarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2275:1: ( ( '*' ) rule__Declarator__Group_0__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2276:1: ( '*' ) rule__Declarator__Group_0__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2276:1: ( '*' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2277:1: '*'
            {
             before(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Declarator__Group_0__04770); 
             after(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__04780);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2291:1: rule__Declarator__Group_0__1 : ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) ;
    public final void rule__Declarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2295:1: ( ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2296:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2296:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2297:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierAssignment_0_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2298:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=15 && LA26_0<=16)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2298:2: rule__Declarator__TypeQualifierAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__14808);
            	    rule__Declarator__TypeQualifierAssignment_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2312:1: rule__DirectDeclarator__Group__0 : ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 ;
    public final void rule__DirectDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2316:1: ( ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2317:1: ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2317:1: ( ( rule__DirectDeclarator__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2318:1: ( rule__DirectDeclarator__Alternatives_0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2319:1: ( rule__DirectDeclarator__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2319:2: rule__DirectDeclarator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__04847);
            rule__DirectDeclarator__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__04856);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2330:1: rule__DirectDeclarator__Group__1 : ( ( ruleArraySpecification )* ) ;
    public final void rule__DirectDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2334:1: ( ( ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2335:1: ( ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2335:1: ( ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2336:1: ( ruleArraySpecification )*
            {
             before(grammarAccess.getDirectDeclaratorAccess().getArraySpecificationParserRuleCall_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2337:1: ( ruleArraySpecification )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==50) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2337:3: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__14885);
            	    ruleArraySpecification();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2351:1: rule__DirectDeclarator__Group_0_1__0 : ( '(' ) rule__DirectDeclarator__Group_0_1__1 ;
    public final void rule__DirectDeclarator__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2355:1: ( ( '(' ) rule__DirectDeclarator__Group_0_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2356:1: ( '(' ) rule__DirectDeclarator__Group_0_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2356:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2357:1: '('
            {
             before(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,48,FOLLOW_48_in_rule__DirectDeclarator__Group_0_1__04925); 
             after(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__04935);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2371:1: rule__DirectDeclarator__Group_0_1__1 : ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 ;
    public final void rule__DirectDeclarator__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2375:1: ( ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2376:1: ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2376:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2377:1: ruleDeclarator
            {
             before(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__14963);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__14971);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2389:1: rule__DirectDeclarator__Group_0_1__2 : ( ')' ) ;
    public final void rule__DirectDeclarator__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2393:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2394:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2394:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2395:1: ')'
            {
             before(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,49,FOLLOW_49_in_rule__DirectDeclarator__Group_0_1__25000); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2414:1: rule__ArraySpecification__Group__0 : ( '[' ) rule__ArraySpecification__Group__1 ;
    public final void rule__ArraySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2418:1: ( ( '[' ) rule__ArraySpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2419:1: ( '[' ) rule__ArraySpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2419:1: ( '[' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2420:1: '['
            {
             before(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__ArraySpecification__Group__05042); 
             after(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__05052);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2434:1: rule__ArraySpecification__Group__1 : ( RULE_INT ) rule__ArraySpecification__Group__2 ;
    public final void rule__ArraySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2438:1: ( ( RULE_INT ) rule__ArraySpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2439:1: ( RULE_INT ) rule__ArraySpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2439:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2440:1: RULE_INT
            {
             before(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySpecification__Group__15080); 
             after(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15088);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2452:1: rule__ArraySpecification__Group__2 : ( ']' ) ;
    public final void rule__ArraySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2456:1: ( ( ']' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2457:1: ( ']' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2457:1: ( ']' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2458:1: ']'
            {
             before(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__ArraySpecification__Group__25117); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2477:1: rule__FullyQualifiedName__Group__0 : ( RULE_ID ) rule__FullyQualifiedName__Group__1 ;
    public final void rule__FullyQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2481:1: ( ( RULE_ID ) rule__FullyQualifiedName__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2482:1: ( RULE_ID ) rule__FullyQualifiedName__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2482:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2483:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05158); 
             after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05166);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2495:1: rule__FullyQualifiedName__Group__1 : ( ( rule__FullyQualifiedName__Group_1__0 )* ) ;
    public final void rule__FullyQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2499:1: ( ( ( rule__FullyQualifiedName__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2500:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2500:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2501:1: ( rule__FullyQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2502:1: ( rule__FullyQualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==52) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2502:2: rule__FullyQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15194);
            	    rule__FullyQualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2516:1: rule__FullyQualifiedName__Group_1__0 : ( '.' ) rule__FullyQualifiedName__Group_1__1 ;
    public final void rule__FullyQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2520:1: ( ( '.' ) rule__FullyQualifiedName__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2521:1: ( '.' ) rule__FullyQualifiedName__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2521:1: ( '.' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2522:1: '.'
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__FullyQualifiedName__Group_1__05234); 
             after(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05244);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2536:1: rule__FullyQualifiedName__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FullyQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2540:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2541:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2541:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2542:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15272); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2557:1: rule__ConstantDefinition__Group__0 : ( '#define' ) rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2561:1: ( ( '#define' ) rule__ConstantDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2562:1: ( '#define' ) rule__ConstantDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2562:1: ( '#define' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2563:1: '#define'
            {
             before(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ConstantDefinition__Group__05310); 
             after(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05320);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2577:1: rule__ConstantDefinition__Group__1 : ( ( rule__ConstantDefinition__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2581:1: ( ( ( rule__ConstantDefinition__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2582:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2582:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2583:1: ( rule__ConstantDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2584:1: ( rule__ConstantDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2584:2: rule__ConstantDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15348);
            rule__ConstantDefinition__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 

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
    // $ANTLR end rule__ConstantDefinition__Group__1


    // $ANTLR start rule__InterfaceDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2598:1: rule__InterfaceDefinition__Group__0 : ( 'interface' ) rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2602:1: ( ( 'interface' ) rule__InterfaceDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2603:1: ( 'interface' ) rule__InterfaceDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2603:1: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2604:1: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__InterfaceDefinition__Group__05387); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05397);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2618:1: rule__InterfaceDefinition__Group__1 : ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2622:1: ( ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2623:1: ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2623:1: ( ( 'unmanaged' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2624:1: ( 'unmanaged' )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2625:1: ( 'unmanaged' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2626:2: 'unmanaged'
                    {
                    match(input,55,FOLLOW_55_in_rule__InterfaceDefinition__Group__15427); 

                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15439);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2638:1: rule__InterfaceDefinition__Group__2 : ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2642:1: ( ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2643:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2643:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2644:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2645:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2645:2: rule__InterfaceDefinition__FqnAssignment_2
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25467);
            rule__InterfaceDefinition__FqnAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25476);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2656:1: rule__InterfaceDefinition__Group__3 : ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2660:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2661:1: ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2661:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2662:1: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2663:1: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2663:2: rule__InterfaceDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35504);
                    rule__InterfaceDefinition__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35514);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2674:1: rule__InterfaceDefinition__Group__4 : ( '{' ) rule__InterfaceDefinition__Group__5 ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2678:1: ( ( '{' ) rule__InterfaceDefinition__Group__5 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2679:1: ( '{' ) rule__InterfaceDefinition__Group__5
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2679:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2680:1: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__InterfaceDefinition__Group__45543); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45553);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2694:1: rule__InterfaceDefinition__Group__5 : ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 ;
    public final void rule__InterfaceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2698:1: ( ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2699:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2699:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2700:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2701:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=11 && LA31_0<=12)||(LA31_0>=15 && LA31_0<=36)||LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2701:2: rule__InterfaceDefinition__MethodDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55581);
            	    rule__InterfaceDefinition__MethodDefAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55591);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2712:1: rule__InterfaceDefinition__Group__6 : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2716:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2717:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2717:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2718:1: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__InterfaceDefinition__Group__65620); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2745:1: rule__InterfaceDefinition__Group_3__0 : ( ':' ) rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2749:1: ( ( ':' ) rule__InterfaceDefinition__Group_3__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2750:1: ( ':' ) rule__InterfaceDefinition__Group_3__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2750:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2751:1: ':'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__InterfaceDefinition__Group_3__05670); 
             after(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05680);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2765:1: rule__InterfaceDefinition__Group_3__1 : ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2769:1: ( ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2770:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2770:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2771:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_3_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2772:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2772:2: rule__InterfaceDefinition__Fqn2Assignment_3_1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15708);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2786:1: rule__MethodDefinition__Group__0 : ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 ;
    public final void rule__MethodDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2790:1: ( ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2791:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2791:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2792:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2793:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2793:2: rule__MethodDefinition__QualifiedTypeSpecAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05746);
            rule__MethodDefinition__QualifiedTypeSpecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05755);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2804:1: rule__MethodDefinition__Group__1 : ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 ;
    public final void rule__MethodDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2808:1: ( ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2809:1: ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2809:1: ( ( rule__MethodDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2810:1: ( rule__MethodDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2811:1: ( rule__MethodDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2811:2: rule__MethodDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__15783);
            rule__MethodDefinition__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__15792);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2822:1: rule__MethodDefinition__Group__2 : ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 ;
    public final void rule__MethodDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2826:1: ( ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2827:1: ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2827:1: ( ( rule__MethodDefinition__Alternatives_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2828:1: ( rule__MethodDefinition__Alternatives_2 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2829:1: ( rule__MethodDefinition__Alternatives_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2829:2: rule__MethodDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__25820);
            rule__MethodDefinition__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__25829);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2840:1: rule__MethodDefinition__Group__3 : ( ';' ) ;
    public final void rule__MethodDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2844:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2845:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2845:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2846:1: ';'
            {
             before(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__MethodDefinition__Group__35858); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2867:1: rule__MethodDefinition__Group_2_0__0 : ( '(' ) rule__MethodDefinition__Group_2_0__1 ;
    public final void rule__MethodDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2871:1: ( ( '(' ) rule__MethodDefinition__Group_2_0__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2872:1: ( '(' ) rule__MethodDefinition__Group_2_0__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2872:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2873:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,48,FOLLOW_48_in_rule__MethodDefinition__Group_2_0__05902); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__05912);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2887:1: rule__MethodDefinition__Group_2_0__1 : ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 ;
    public final void rule__MethodDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2891:1: ( ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2892:1: ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2892:1: ( ( 'void' )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2893:1: ( 'void' )?
            {
             before(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2894:1: ( 'void' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2895:2: 'void'
                    {
                    match(input,17,FOLLOW_17_in_rule__MethodDefinition__Group_2_0__15942); 

                    }
                    break;

            }

             after(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__15954);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2907:1: rule__MethodDefinition__Group_2_0__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2911:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2912:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2912:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2913:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,49,FOLLOW_49_in_rule__MethodDefinition__Group_2_0__25983); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2932:1: rule__MethodDefinition__Group_2_1__0 : ( '(' ) rule__MethodDefinition__Group_2_1__1 ;
    public final void rule__MethodDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2936:1: ( ( '(' ) rule__MethodDefinition__Group_2_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2937:1: ( '(' ) rule__MethodDefinition__Group_2_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2937:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2938:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,48,FOLLOW_48_in_rule__MethodDefinition__Group_2_1__06025); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__06035);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2952:1: rule__MethodDefinition__Group_2_1__1 : ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 ;
    public final void rule__MethodDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2956:1: ( ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2957:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2957:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2958:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2959:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2959:2: rule__MethodDefinition__ParameterListAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__16063);
            rule__MethodDefinition__ParameterListAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__16072);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2970:1: rule__MethodDefinition__Group_2_1__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2974:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2975:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2975:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2976:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,49,FOLLOW_49_in_rule__MethodDefinition__Group_2_1__26101); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2995:1: rule__ParameterList__Group__0 : ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:2999:1: ( ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3000:1: ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3000:1: ( ( rule__ParameterList__ParamAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3001:1: ( rule__ParameterList__ParamAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParamAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3002:1: ( rule__ParameterList__ParamAssignment_0 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3002:2: rule__ParameterList__ParamAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06142);
            rule__ParameterList__ParamAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParamAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06151);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3013:1: rule__ParameterList__Group__1 : ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3017:1: ( ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3018:1: ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3018:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3019:1: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3020:1: ( rule__ParameterList__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==45) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID||(LA33_1>=11 && LA33_1<=12)||(LA33_1>=15 && LA33_1<=38)||LA33_1==44) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3020:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16179);
            	    rule__ParameterList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16189);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3031:1: rule__ParameterList__Group__2 : ( ( rule__ParameterList__Group_2__0 )? ) ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3035:1: ( ( ( rule__ParameterList__Group_2__0 )? ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3036:1: ( ( rule__ParameterList__Group_2__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3036:1: ( ( rule__ParameterList__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3037:1: ( rule__ParameterList__Group_2__0 )?
            {
             before(grammarAccess.getParameterListAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3038:1: ( rule__ParameterList__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3038:2: rule__ParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26217);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3054:1: rule__ParameterList__Group_1__0 : ( ',' ) rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3058:1: ( ( ',' ) rule__ParameterList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3059:1: ( ',' ) rule__ParameterList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3059:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3060:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__ParameterList__Group_1__06259); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06269);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3074:1: rule__ParameterList__Group_1__1 : ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3078:1: ( ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3079:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3079:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3080:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3081:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3081:2: rule__ParameterList__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16297);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3095:1: rule__ParameterList__Group_2__0 : ( ',' ) rule__ParameterList__Group_2__1 ;
    public final void rule__ParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3099:1: ( ( ',' ) rule__ParameterList__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3100:1: ( ',' ) rule__ParameterList__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3100:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3101:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__ParameterList__Group_2__06336); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06346);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3115:1: rule__ParameterList__Group_2__1 : ( '...' ) ;
    public final void rule__ParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3119:1: ( ( '...' ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3120:1: ( '...' )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3120:1: ( '...' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3121:1: '...'
            {
             before(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 
            match(input,56,FOLLOW_56_in_rule__ParameterList__Group_2__16375); 
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3138:1: rule__Parameter__Group__0 : ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3142:1: ( ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3143:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3143:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3144:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3145:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=37 && LA35_0<=38)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3145:2: rule__Parameter__ParameterQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06414);
            	    rule__Parameter__ParameterQualifierAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06424);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3156:1: rule__Parameter__Group__1 : ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3160:1: ( ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3161:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3161:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3162:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3163:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3163:2: rule__Parameter__QualifiedTypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16452);
            rule__Parameter__QualifiedTypeSpecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16461);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3174:1: rule__Parameter__Group__2 : ( ( rule__Parameter__DecAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3178:1: ( ( ( rule__Parameter__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3179:1: ( ( rule__Parameter__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3179:1: ( ( rule__Parameter__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3180:1: ( rule__Parameter__DecAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3181:1: ( rule__Parameter__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3181:2: rule__Parameter__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26489);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3197:1: rule__IncludeDirective__Group__0 : ( '#include' ) rule__IncludeDirective__Group__1 ;
    public final void rule__IncludeDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3201:1: ( ( '#include' ) rule__IncludeDirective__Group__1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3202:1: ( '#include' ) rule__IncludeDirective__Group__1
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3202:1: ( '#include' )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3203:1: '#include'
            {
             before(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__IncludeDirective__Group__06530); 
             after(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06540);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3217:1: rule__IncludeDirective__Group__1 : ( ( rule__IncludeDirective__PathAssignment_1 ) ) ;
    public final void rule__IncludeDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3221:1: ( ( ( rule__IncludeDirective__PathAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3222:1: ( ( rule__IncludeDirective__PathAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3222:1: ( ( rule__IncludeDirective__PathAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3223:1: ( rule__IncludeDirective__PathAssignment_1 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getPathAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3224:1: ( rule__IncludeDirective__PathAssignment_1 )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3224:2: rule__IncludeDirective__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__IncludeDirective__PathAssignment_1_in_rule__IncludeDirective__Group__16568);
            rule__IncludeDirective__PathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIncludeDirectiveAccess().getPathAssignment_1()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3238:1: rule__ItfFile__IncludesAssignment_0 : ( ruleIncludeDirective ) ;
    public final void rule__ItfFile__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3242:1: ( ( ruleIncludeDirective ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3243:1: ( ruleIncludeDirective )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3243:1: ( ruleIncludeDirective )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3244:1: ruleIncludeDirective
            {
             before(grammarAccess.getItfFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_rule__ItfFile__IncludesAssignment_06606);
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


    // $ANTLR start rule__ItfFile__TypeAssignment_1_0
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3253:1: rule__ItfFile__TypeAssignment_1_0 : ( ruleTypeDefinition ) ;
    public final void rule__ItfFile__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3257:1: ( ( ruleTypeDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3258:1: ( ruleTypeDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3258:1: ( ruleTypeDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3259:1: ruleTypeDefinition
            {
             before(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__ItfFile__TypeAssignment_1_06637);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_0_0()); 

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
    // $ANTLR end rule__ItfFile__TypeAssignment_1_0


    // $ANTLR start rule__ItfFile__ConstantAssignment_1_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3268:1: rule__ItfFile__ConstantAssignment_1_1 : ( ruleConstantDefinition ) ;
    public final void rule__ItfFile__ConstantAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3272:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3273:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3273:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3274:1: ruleConstantDefinition
            {
             before(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__ItfFile__ConstantAssignment_1_16668);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__ItfFile__ConstantAssignment_1_1


    // $ANTLR start rule__ItfFile__InterfaceAssignment_2
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3283:1: rule__ItfFile__InterfaceAssignment_2 : ( ruleInterfaceDefinition ) ;
    public final void rule__ItfFile__InterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3287:1: ( ( ruleInterfaceDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3288:1: ( ruleInterfaceDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3288:1: ( ruleInterfaceDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3289:1: ruleInterfaceDefinition
            {
             before(grammarAccess.getItfFileAccess().getInterfaceInterfaceDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_rule__ItfFile__InterfaceAssignment_26699);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3298:1: rule__TypedefSpecification__QualifedTypeAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__TypedefSpecification__QualifedTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3302:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3303:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3303:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3304:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_16730);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3313:1: rule__TypedefSpecification__DecAssignment_2 : ( ruleDeclarators ) ;
    public final void rule__TypedefSpecification__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3317:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3318:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3318:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3319:1: ruleDeclarators
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_26761);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3328:1: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 : ( ruleTypeQualifier ) ;
    public final void rule__QualifiedTypeSpecification__TypeQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3332:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3333:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3333:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3334:1: ruleTypeQualifier
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_06792);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3343:1: rule__QualifiedTypeSpecification__TypeSpecAssignment_1 : ( ruleTypeSpecification ) ;
    public final void rule__QualifiedTypeSpecification__TypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3347:1: ( ( ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3348:1: ( ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3348:1: ( ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3349:1: ruleTypeSpecification
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_16823);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3358:1: rule__TypeSpecification__TypeDefNameAssignment_0 : ( ruleTypedefName ) ;
    public final void rule__TypeSpecification__TypeDefNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3362:1: ( ( ruleTypedefName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3363:1: ( ruleTypedefName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3363:1: ( ruleTypedefName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3364:1: ruleTypedefName
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_06854);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3373:1: rule__TypeSpecification__TypeSpecifierAssignment_3 : ( ruleTypeSpecifier ) ;
    public final void rule__TypeSpecification__TypeSpecifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3377:1: ( ( ruleTypeSpecifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3378:1: ( ruleTypeSpecifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3378:1: ( ruleTypeSpecifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3379:1: ruleTypeSpecifier
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_36885);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3388:1: rule__StructOrUnionDefinition__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructOrUnionDefinition__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3392:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3393:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3393:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3394:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_06916);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3403:1: rule__StructOrUnionDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__StructOrUnionDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3407:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3408:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3408:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3409:1: ruleIdentifier
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__StructOrUnionDefinition__IdAssignment_16947);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getStructOrUnionDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3418:1: rule__StructOrUnionDefinition__StructMemberAssignment_3 : ( ruleStructMember ) ;
    public final void rule__StructOrUnionDefinition__StructMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3422:1: ( ( ruleStructMember ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3423:1: ( ruleStructMember )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3423:1: ( ruleStructMember )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3424:1: ruleStructMember
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_36978);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3433:1: rule__StructorUnionReference__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructorUnionReference__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3437:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3438:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3438:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3439:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_07009);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3448:1: rule__StructorUnionReference__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__StructorUnionReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3452:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3453:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3453:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3454:1: ruleIdentifier
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__StructorUnionReference__IdAssignment_17040);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getStructorUnionReferenceAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3463:1: rule__StructMember__QualTypeAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__StructMember__QualTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3467:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3468:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3468:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3469:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_07071);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3478:1: rule__StructMember__DecAssignment_1 : ( ruleDeclarators ) ;
    public final void rule__StructMember__DecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3482:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3483:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3483:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3484:1: ruleDeclarators
            {
             before(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_17102);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3493:1: rule__EnumDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3497:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3498:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3498:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3499:1: ruleIdentifier
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__EnumDefinition__IdAssignment_17133);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getEnumDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3508:1: rule__EnumDefinition__EnumMemberListAssignment_3 : ( ruleEnumMemberList ) ;
    public final void rule__EnumDefinition__EnumMemberListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3512:1: ( ( ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3513:1: ( ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3513:1: ( ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3514:1: ruleEnumMemberList
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37164);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3523:1: rule__EnumReference__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3527:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3528:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3528:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3529:1: ruleIdentifier
            {
             before(grammarAccess.getEnumReferenceAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__EnumReference__IdAssignment_17195);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getEnumReferenceAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3538:1: rule__EnumMemberList__EnumMemberAssignment_1_1 : ( ruleEnumMember ) ;
    public final void rule__EnumMemberList__EnumMemberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3542:1: ( ( ruleEnumMember ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3543:1: ( ruleEnumMember )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3543:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3544:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17226);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3553:1: rule__EnumMember__IdAssignment_0 : ( ruleIdentifier ) ;
    public final void rule__EnumMember__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3557:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3558:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3558:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3559:1: ruleIdentifier
            {
             before(grammarAccess.getEnumMemberAccess().getIdIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__EnumMember__IdAssignment_07257);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getEnumMemberAccess().getIdIdentifierParserRuleCall_0_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3568:1: rule__Declarators__DecAssignment_0 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3572:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3573:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3573:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3574:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07288);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3583:1: rule__Declarators__DeclaratorListAssignment_1_1 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DeclaratorListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3587:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3588:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3588:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3589:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17319);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3598:1: rule__Declarator__TypeQualifierAssignment_0_1 : ( ruleTypeQualifier ) ;
    public final void rule__Declarator__TypeQualifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3602:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3603:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3603:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3604:1: ruleTypeQualifier
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17350);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3613:1: rule__Declarator__DcAssignment_1 : ( ruleDirectDeclarator ) ;
    public final void rule__Declarator__DcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3617:1: ( ( ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3618:1: ( ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3618:1: ( ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3619:1: ruleDirectDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17381);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3628:1: rule__DirectDeclarator__IdAssignment_0_0 : ( ruleIdentifier ) ;
    public final void rule__DirectDeclarator__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3632:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3633:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3633:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3634:1: ruleIdentifier
            {
             before(grammarAccess.getDirectDeclaratorAccess().getIdIdentifierParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__DirectDeclarator__IdAssignment_0_07412);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorAccess().getIdIdentifierParserRuleCall_0_0_0()); 

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


    // $ANTLR start rule__Identifier__IdAssignment
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3643:1: rule__Identifier__IdAssignment : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3647:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3648:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3648:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3649:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment7443); 
             after(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0()); 

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
    // $ANTLR end rule__Identifier__IdAssignment


    // $ANTLR start rule__ConstantDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3658:1: rule__ConstantDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__ConstantDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3662:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3663:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3663:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3664:1: ruleIdentifier
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__ConstantDefinition__IdAssignment_17474);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getConstantDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3673:1: rule__InterfaceDefinition__FqnAssignment_2 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__FqnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3677:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3678:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3678:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3679:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27505);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3688:1: rule__InterfaceDefinition__Fqn2Assignment_3_1 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__Fqn2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3692:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3693:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3693:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3694:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17536);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3703:1: rule__InterfaceDefinition__MethodDefAssignment_5 : ( ruleMethodDefinition ) ;
    public final void rule__InterfaceDefinition__MethodDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3707:1: ( ( ruleMethodDefinition ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3708:1: ( ruleMethodDefinition )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3708:1: ( ruleMethodDefinition )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3709:1: ruleMethodDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57567);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3718:1: rule__MethodDefinition__QualifiedTypeSpecAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__MethodDefinition__QualifiedTypeSpecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3722:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3723:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3723:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3724:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07598);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3733:1: rule__MethodDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__MethodDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3737:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3738:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3738:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3739:1: ruleIdentifier
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__MethodDefinition__IdAssignment_17629);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getMethodDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3748:1: rule__MethodDefinition__ParameterListAssignment_2_1_1 : ( ruleParameterList ) ;
    public final void rule__MethodDefinition__ParameterListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3752:1: ( ( ruleParameterList ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3753:1: ( ruleParameterList )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3753:1: ( ruleParameterList )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3754:1: ruleParameterList
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17660);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3763:1: rule__ParameterList__ParamAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3767:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3768:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3768:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3769:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_07691);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3778:1: rule__ParameterList__ParamsAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3782:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3783:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3783:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3784:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_17722);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3793:1: rule__Parameter__ParameterQualifierAssignment_0 : ( ruleParameterQualifier ) ;
    public final void rule__Parameter__ParameterQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3797:1: ( ( ruleParameterQualifier ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3798:1: ( ruleParameterQualifier )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3798:1: ( ruleParameterQualifier )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3799:1: ruleParameterQualifier
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_07753);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3808:1: rule__Parameter__QualifiedTypeSpecAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__Parameter__QualifiedTypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3812:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3813:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3813:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3814:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_17784);
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
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3823:1: rule__Parameter__DecAssignment_2 : ( ruleDeclarator ) ;
    public final void rule__Parameter__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3827:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3828:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3828:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3829:1: ruleDeclarator
            {
             before(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_27815);
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


    // $ANTLR start rule__IncludeDirective__PathAssignment_1
    // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3838:1: rule__IncludeDirective__PathAssignment_1 : ( ruleIncludePath ) ;
    public final void rule__IncludeDirective__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3842:1: ( ( ruleIncludePath ) )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3843:1: ( ruleIncludePath )
            {
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3843:1: ( ruleIncludePath )
            // ../org.ow2.fractal.mind.idl.itf.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalItf.g:3844:1: ruleIncludePath
            {
             before(grammarAccess.getIncludeDirectiveAccess().getPathIncludePathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIncludePath_in_rule__IncludeDirective__PathAssignment_17846);
            ruleIncludePath();
            _fsp--;

             after(grammarAccess.getIncludeDirectiveAccess().getPathIncludePathParserRuleCall_1_0()); 

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
    // $ANTLR end rule__IncludeDirective__PathAssignment_1


 

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
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludePath_in_entryRuleIncludePath1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludePath1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludePath__Alternatives_in_ruleIncludePath1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__TypeAssignment_1_0_in_rule__ItfFile__Alternatives_11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__ConstantAssignment_1_1_in_rule__ItfFile__Alternatives_11964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_01997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2117 = new BitSet(new long[]{0x0000001FFFFE0002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2129 = new BitSet(new long[]{0x0000001FFFFE0002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StructOrUnion__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructOrUnion__Alternatives2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__IncludePath__Alternatives2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IncludePath__Alternatives2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeQualifier__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeQualifier__Alternatives2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeSpecifier__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeSpecifier__Alternatives2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeSpecifier__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeSpecifier__Alternatives2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeSpecifier__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeSpecifier__Alternatives2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeSpecifier__Alternatives2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeSpecifier__Alternatives2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeSpecifier__Alternatives2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeSpecifier__Alternatives2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeSpecifier__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeSpecifier__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeSpecifier__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeSpecifier__Alternatives2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeSpecifier__Alternatives2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeSpecifier__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeSpecifier__Alternatives2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeSpecifier__Alternatives2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeSpecifier__Alternatives2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeSpecifier__Alternatives2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterQualifier__Alternatives2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ParameterQualifier__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__IncludesAssignment_0_in_rule__ItfFile__Group__03026 = new BitSet(new long[]{0x0260110000001800L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__1_in_rule__ItfFile__Group__03036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__Alternatives_1_in_rule__ItfFile__Group__13064 = new BitSet(new long[]{0x0060110000001800L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__2_in_rule__ItfFile__Group__13074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__InterfaceAssignment_2_in_rule__ItfFile__Group__23102 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__ItfFile__Group__3_in_rule__ItfFile__Group__23111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ItfFile__Group__33141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03186 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeDefinition__Group__13224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypedefSpecification__Group__03264 = new BitSet(new long[]{0x0000101FFFFF9820L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13302 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03379 = new BitSet(new long[]{0x0000101FFFFF9820L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03455 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13492 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StructOrUnionDefinition__Group__23531 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33569 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructOrUnionDefinition__Group__43608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03728 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__13765 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__13774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__23802 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__23812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StructMember__Group__33841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StructMember__Group_2__03885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__03895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StructMember__Group_2__13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumDefinition__Group__03961 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__03971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__13999 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__14009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumDefinition__Group__24038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__24048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__34076 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumDefinition__Group__44114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumReference__Group__04160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04236 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14272 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumMemberList__Group_1__04312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04388 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EnumMember__Group_1__04465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04540 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14577 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_rule__Declarators__Group_1__04617 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04693 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Declarator__Group_0__04770 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__04780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__14808 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__04847 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__04856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__14885 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DirectDeclarator__Group_0_1__04925 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__04935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__14963 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__14971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DirectDeclarator__Group_0_1__25000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ArraySpecification__Group__05042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__05052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySpecification__Group__15080 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ArraySpecification__Group__25117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05158 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15194 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FullyQualifiedName__Group_1__05234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ConstantDefinition__Group__05310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__InterfaceDefinition__Group__05387 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__InterfaceDefinition__Group__15427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25467 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35504 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__InterfaceDefinition__Group__45543 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55581 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InterfaceDefinition__Group__65620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__InterfaceDefinition__Group_3__05670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__15783 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__15792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__25820 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__25829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MethodDefinition__Group__35858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodDefinition__Group_2_0__05902 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__05912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MethodDefinition__Group_2_0__15942 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__15954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodDefinition__Group_2_0__25983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodDefinition__Group_2_1__06025 = new BitSet(new long[]{0x0000107FFFFF9820L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__06035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__16063 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__16072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodDefinition__Group_2_1__26101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06142 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16179 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ParameterList__Group_1__06259 = new BitSet(new long[]{0x0000107FFFFF9820L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ParameterList__Group_2__06336 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ParameterList__Group_2__16375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06414 = new BitSet(new long[]{0x0000107FFFFF9820L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16452 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__IncludeDirective__Group__06530 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__PathAssignment_1_in_rule__IncludeDirective__Group__16568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_rule__ItfFile__IncludesAssignment_06606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__ItfFile__TypeAssignment_1_06637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__ItfFile__ConstantAssignment_1_16668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_rule__ItfFile__InterfaceAssignment_26699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_16730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_26761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_06792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_16823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_06854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_36885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_06916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__StructOrUnionDefinition__IdAssignment_16947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_36978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_07009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__StructorUnionReference__IdAssignment_17040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_07071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__EnumDefinition__IdAssignment_17133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__EnumReference__IdAssignment_17195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__EnumMember__IdAssignment_07257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__DirectDeclarator__IdAssignment_0_07412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__ConstantDefinition__IdAssignment_17474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__MethodDefinition__IdAssignment_17629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_07691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_17722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_07753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_17784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_27815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludePath_in_rule__IncludeDirective__PathAssignment_17846 = new BitSet(new long[]{0x0000000000000002L});

}