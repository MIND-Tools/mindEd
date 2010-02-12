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
import org.ow2.fractal.mind.idl.services.FractalIdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFractalIdtParser extends AbstractInternalContentAssistParser {
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

        public InternalFractalIdtParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g"; }


     
     	private FractalIdtGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FractalIdtGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleIdtFile
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:60:1: entryRuleIdtFile : ruleIdtFile EOF ;
    public final void entryRuleIdtFile() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:61:1: ( ruleIdtFile EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:62:1: ruleIdtFile EOF
            {
             before(grammarAccess.getIdtFileRule()); 
            pushFollow(FOLLOW_ruleIdtFile_in_entryRuleIdtFile61);
            ruleIdtFile();
            _fsp--;

             after(grammarAccess.getIdtFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdtFile68); 

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
    // $ANTLR end entryRuleIdtFile


    // $ANTLR start ruleIdtFile
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:69:1: ruleIdtFile : ( ( rule__IdtFile__Group__0 ) ) ;
    public final void ruleIdtFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:73:2: ( ( ( rule__IdtFile__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:74:1: ( ( rule__IdtFile__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:74:1: ( ( rule__IdtFile__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:75:1: ( rule__IdtFile__Group__0 )
            {
             before(grammarAccess.getIdtFileAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:76:1: ( rule__IdtFile__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:76:2: rule__IdtFile__Group__0
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile95);
            rule__IdtFile__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIdtFileAccess().getGroup()); 

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
    // $ANTLR end ruleIdtFile


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:90:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:91:1: ( ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:92:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition124);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition131); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:99:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:103:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:104:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:104:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:105:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:106:1: ( rule__TypeDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:106:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition158);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:118:1: entryRuleTypedefSpecification : ruleTypedefSpecification EOF ;
    public final void entryRuleTypedefSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:119:1: ( ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:120:1: ruleTypedefSpecification EOF
            {
             before(grammarAccess.getTypedefSpecificationRule()); 
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification185);
            ruleTypedefSpecification();
            _fsp--;

             after(grammarAccess.getTypedefSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification192); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:127:1: ruleTypedefSpecification : ( ( rule__TypedefSpecification__Group__0 ) ) ;
    public final void ruleTypedefSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:131:2: ( ( ( rule__TypedefSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:132:1: ( ( rule__TypedefSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:132:1: ( ( rule__TypedefSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:133:1: ( rule__TypedefSpecification__Group__0 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:134:1: ( rule__TypedefSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:134:2: rule__TypedefSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification219);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:146:1: entryRuleQualifiedTypeSpecification : ruleQualifiedTypeSpecification EOF ;
    public final void entryRuleQualifiedTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:147:1: ( ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:148:1: ruleQualifiedTypeSpecification EOF
            {
             before(grammarAccess.getQualifiedTypeSpecificationRule()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification246);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getQualifiedTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification253); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:155:1: ruleQualifiedTypeSpecification : ( ( rule__QualifiedTypeSpecification__Group__0 ) ) ;
    public final void ruleQualifiedTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:159:2: ( ( ( rule__QualifiedTypeSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:160:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:160:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:161:1: ( rule__QualifiedTypeSpecification__Group__0 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:162:1: ( rule__QualifiedTypeSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:162:2: rule__QualifiedTypeSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification280);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:174:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:175:1: ( ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:176:1: ruleTypeSpecification EOF
            {
             before(grammarAccess.getTypeSpecificationRule()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification307);
            ruleTypeSpecification();
            _fsp--;

             after(grammarAccess.getTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification314); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:183:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:187:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:188:1: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:188:1: ( ( rule__TypeSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:189:1: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:190:1: ( rule__TypeSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:190:2: rule__TypeSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification341);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:202:1: entryRuleTypedefName : ruleTypedefName EOF ;
    public final void entryRuleTypedefName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:203:1: ( ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:204:1: ruleTypedefName EOF
            {
             before(grammarAccess.getTypedefNameRule()); 
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName368);
            ruleTypedefName();
            _fsp--;

             after(grammarAccess.getTypedefNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName375); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:211:1: ruleTypedefName : ( ruleFullyQualifiedName ) ;
    public final void ruleTypedefName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:215:2: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:216:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:216:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:217:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName402);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:230:1: entryRuleStructOrUnionSpecification : ruleStructOrUnionSpecification EOF ;
    public final void entryRuleStructOrUnionSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:231:1: ( ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:232:1: ruleStructOrUnionSpecification EOF
            {
             before(grammarAccess.getStructOrUnionSpecificationRule()); 
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification428);
            ruleStructOrUnionSpecification();
            _fsp--;

             after(grammarAccess.getStructOrUnionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification435); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:239:1: ruleStructOrUnionSpecification : ( ( rule__StructOrUnionSpecification__Alternatives ) ) ;
    public final void ruleStructOrUnionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:243:2: ( ( ( rule__StructOrUnionSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:244:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:244:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:245:1: ( rule__StructOrUnionSpecification__Alternatives )
            {
             before(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:246:1: ( rule__StructOrUnionSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:246:2: rule__StructOrUnionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification462);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:258:1: entryRuleStructOrUnionDefinition : ruleStructOrUnionDefinition EOF ;
    public final void entryRuleStructOrUnionDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:259:1: ( ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:260:1: ruleStructOrUnionDefinition EOF
            {
             before(grammarAccess.getStructOrUnionDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition489);
            ruleStructOrUnionDefinition();
            _fsp--;

             after(grammarAccess.getStructOrUnionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition496); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:267:1: ruleStructOrUnionDefinition : ( ( rule__StructOrUnionDefinition__Group__0 ) ) ;
    public final void ruleStructOrUnionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:271:2: ( ( ( rule__StructOrUnionDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:272:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:272:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:273:1: ( rule__StructOrUnionDefinition__Group__0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:274:1: ( rule__StructOrUnionDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:274:2: rule__StructOrUnionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition523);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:286:1: entryRuleStructorUnionReference : ruleStructorUnionReference EOF ;
    public final void entryRuleStructorUnionReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:287:1: ( ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:288:1: ruleStructorUnionReference EOF
            {
             before(grammarAccess.getStructorUnionReferenceRule()); 
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference550);
            ruleStructorUnionReference();
            _fsp--;

             after(grammarAccess.getStructorUnionReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference557); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:295:1: ruleStructorUnionReference : ( ( rule__StructorUnionReference__Group__0 ) ) ;
    public final void ruleStructorUnionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:299:2: ( ( ( rule__StructorUnionReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:300:1: ( ( rule__StructorUnionReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:300:1: ( ( rule__StructorUnionReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:301:1: ( rule__StructorUnionReference__Group__0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:302:1: ( rule__StructorUnionReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:302:2: rule__StructorUnionReference__Group__0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference584);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:314:1: entryRuleStructOrUnion : ruleStructOrUnion EOF ;
    public final void entryRuleStructOrUnion() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:315:1: ( ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:316:1: ruleStructOrUnion EOF
            {
             before(grammarAccess.getStructOrUnionRule()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion611);
            ruleStructOrUnion();
            _fsp--;

             after(grammarAccess.getStructOrUnionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion618); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:323:1: ruleStructOrUnion : ( ( rule__StructOrUnion__Alternatives ) ) ;
    public final void ruleStructOrUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:327:2: ( ( ( rule__StructOrUnion__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:328:1: ( ( rule__StructOrUnion__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:328:1: ( ( rule__StructOrUnion__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:329:1: ( rule__StructOrUnion__Alternatives )
            {
             before(grammarAccess.getStructOrUnionAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:330:1: ( rule__StructOrUnion__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:330:2: rule__StructOrUnion__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion645);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:342:1: entryRuleStructMember : ruleStructMember EOF ;
    public final void entryRuleStructMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:343:1: ( ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:344:1: ruleStructMember EOF
            {
             before(grammarAccess.getStructMemberRule()); 
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember672);
            ruleStructMember();
            _fsp--;

             after(grammarAccess.getStructMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember679); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:351:1: ruleStructMember : ( ( rule__StructMember__Group__0 ) ) ;
    public final void ruleStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:355:2: ( ( ( rule__StructMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:356:1: ( ( rule__StructMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:356:1: ( ( rule__StructMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:357:1: ( rule__StructMember__Group__0 )
            {
             before(grammarAccess.getStructMemberAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:358:1: ( rule__StructMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:358:2: rule__StructMember__Group__0
            {
            pushFollow(FOLLOW_rule__StructMember__Group__0_in_ruleStructMember706);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:370:1: entryRuleEnumSpecification : ruleEnumSpecification EOF ;
    public final void entryRuleEnumSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:371:1: ( ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:372:1: ruleEnumSpecification EOF
            {
             before(grammarAccess.getEnumSpecificationRule()); 
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification733);
            ruleEnumSpecification();
            _fsp--;

             after(grammarAccess.getEnumSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification740); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:379:1: ruleEnumSpecification : ( ( rule__EnumSpecification__Alternatives ) ) ;
    public final void ruleEnumSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:383:2: ( ( ( rule__EnumSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:384:1: ( ( rule__EnumSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:384:1: ( ( rule__EnumSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:385:1: ( rule__EnumSpecification__Alternatives )
            {
             before(grammarAccess.getEnumSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:386:1: ( rule__EnumSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:386:2: rule__EnumSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification767);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:398:1: entryRuleEnumDefinition : ruleEnumDefinition EOF ;
    public final void entryRuleEnumDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:399:1: ( ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:400:1: ruleEnumDefinition EOF
            {
             before(grammarAccess.getEnumDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition794);
            ruleEnumDefinition();
            _fsp--;

             after(grammarAccess.getEnumDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition801); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:407:1: ruleEnumDefinition : ( ( rule__EnumDefinition__Group__0 ) ) ;
    public final void ruleEnumDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:411:2: ( ( ( rule__EnumDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:412:1: ( ( rule__EnumDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:412:1: ( ( rule__EnumDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:413:1: ( rule__EnumDefinition__Group__0 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:414:1: ( rule__EnumDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:414:2: rule__EnumDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition828);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:426:1: entryRuleEnumReference : ruleEnumReference EOF ;
    public final void entryRuleEnumReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:427:1: ( ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:428:1: ruleEnumReference EOF
            {
             before(grammarAccess.getEnumReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference855);
            ruleEnumReference();
            _fsp--;

             after(grammarAccess.getEnumReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference862); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:435:1: ruleEnumReference : ( ( rule__EnumReference__Group__0 ) ) ;
    public final void ruleEnumReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:439:2: ( ( ( rule__EnumReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:440:1: ( ( rule__EnumReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:440:1: ( ( rule__EnumReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:441:1: ( rule__EnumReference__Group__0 )
            {
             before(grammarAccess.getEnumReferenceAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:442:1: ( rule__EnumReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:442:2: rule__EnumReference__Group__0
            {
            pushFollow(FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference889);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:454:1: entryRuleEnumMemberList : ruleEnumMemberList EOF ;
    public final void entryRuleEnumMemberList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:455:1: ( ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:456:1: ruleEnumMemberList EOF
            {
             before(grammarAccess.getEnumMemberListRule()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList916);
            ruleEnumMemberList();
            _fsp--;

             after(grammarAccess.getEnumMemberListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList923); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:463:1: ruleEnumMemberList : ( ( rule__EnumMemberList__Group__0 ) ) ;
    public final void ruleEnumMemberList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:467:2: ( ( ( rule__EnumMemberList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:468:1: ( ( rule__EnumMemberList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:468:1: ( ( rule__EnumMemberList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:469:1: ( rule__EnumMemberList__Group__0 )
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:470:1: ( rule__EnumMemberList__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:470:2: rule__EnumMemberList__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList950);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:482:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:483:1: ( ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:484:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember977);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember984); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:491:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:495:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:496:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:496:1: ( ( rule__EnumMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:497:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:498:1: ( rule__EnumMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:498:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1011);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:510:1: entryRuleDeclarators : ruleDeclarators EOF ;
    public final void entryRuleDeclarators() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:511:1: ( ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:512:1: ruleDeclarators EOF
            {
             before(grammarAccess.getDeclaratorsRule()); 
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators1038);
            ruleDeclarators();
            _fsp--;

             after(grammarAccess.getDeclaratorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators1045); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:519:1: ruleDeclarators : ( ( rule__Declarators__Group__0 ) ) ;
    public final void ruleDeclarators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:523:2: ( ( ( rule__Declarators__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:524:1: ( ( rule__Declarators__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:524:1: ( ( rule__Declarators__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:525:1: ( rule__Declarators__Group__0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:526:1: ( rule__Declarators__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:526:2: rule__Declarators__Group__0
            {
            pushFollow(FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1072);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:538:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:539:1: ( ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:540:1: ruleDeclarator EOF
            {
             before(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1099);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator1106); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:547:1: ruleDeclarator : ( ( rule__Declarator__Group__0 ) ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:551:2: ( ( ( rule__Declarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:552:1: ( ( rule__Declarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:552:1: ( ( rule__Declarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:553:1: ( rule__Declarator__Group__0 )
            {
             before(grammarAccess.getDeclaratorAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:554:1: ( rule__Declarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:554:2: rule__Declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1133);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:566:1: entryRuleDirectDeclarator : ruleDirectDeclarator EOF ;
    public final void entryRuleDirectDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:567:1: ( ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:568:1: ruleDirectDeclarator EOF
            {
             before(grammarAccess.getDirectDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1160);
            ruleDirectDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator1167); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:575:1: ruleDirectDeclarator : ( ( rule__DirectDeclarator__Group__0 ) ) ;
    public final void ruleDirectDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:579:2: ( ( ( rule__DirectDeclarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:580:1: ( ( rule__DirectDeclarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:580:1: ( ( rule__DirectDeclarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:581:1: ( rule__DirectDeclarator__Group__0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:582:1: ( rule__DirectDeclarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:582:2: rule__DirectDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1194);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:594:1: entryRuleArraySpecification : ruleArraySpecification EOF ;
    public final void entryRuleArraySpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:595:1: ( ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:596:1: ruleArraySpecification EOF
            {
             before(grammarAccess.getArraySpecificationRule()); 
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1221);
            ruleArraySpecification();
            _fsp--;

             after(grammarAccess.getArraySpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification1228); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:603:1: ruleArraySpecification : ( ( rule__ArraySpecification__Group__0 ) ) ;
    public final void ruleArraySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:607:2: ( ( ( rule__ArraySpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:608:1: ( ( rule__ArraySpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:608:1: ( ( rule__ArraySpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:609:1: ( rule__ArraySpecification__Group__0 )
            {
             before(grammarAccess.getArraySpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:610:1: ( rule__ArraySpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:610:2: rule__ArraySpecification__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1255);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:622:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:623:1: ( ruleIdentifier EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:624:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier1282);
            ruleIdentifier();
            _fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1289); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:631:1: ruleIdentifier : ( ( rule__Identifier__IdAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:635:2: ( ( ( rule__Identifier__IdAssignment ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:636:1: ( ( rule__Identifier__IdAssignment ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:636:1: ( ( rule__Identifier__IdAssignment ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:637:1: ( rule__Identifier__IdAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:638:1: ( rule__Identifier__IdAssignment )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:638:2: rule__Identifier__IdAssignment
            {
            pushFollow(FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1316);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:650:1: entryRuleFullyQualifiedName : ruleFullyQualifiedName EOF ;
    public final void entryRuleFullyQualifiedName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:651:1: ( ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:652:1: ruleFullyQualifiedName EOF
            {
             before(grammarAccess.getFullyQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1343);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getFullyQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName1350); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:659:1: ruleFullyQualifiedName : ( ( rule__FullyQualifiedName__Group__0 ) ) ;
    public final void ruleFullyQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:663:2: ( ( ( rule__FullyQualifiedName__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:664:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:664:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:665:1: ( rule__FullyQualifiedName__Group__0 )
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:666:1: ( rule__FullyQualifiedName__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:666:2: rule__FullyQualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1377);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:678:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:679:1: ( ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:680:1: ruleConstantDefinition EOF
            {
             before(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1404);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getConstantDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition1411); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:687:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:691:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:692:1: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:692:1: ( ( rule__ConstantDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:693:1: ( rule__ConstantDefinition__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:694:1: ( rule__ConstantDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:694:2: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1438);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:706:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:707:1: ( ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:708:1: ruleInterfaceDefinition EOF
            {
             before(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1465);
            ruleInterfaceDefinition();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition1472); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:715:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:719:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:720:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:720:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:721:1: ( rule__InterfaceDefinition__Group__0 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:722:1: ( rule__InterfaceDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:722:2: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1499);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:734:1: entryRuleMethodDefinition : ruleMethodDefinition EOF ;
    public final void entryRuleMethodDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:735:1: ( ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:736:1: ruleMethodDefinition EOF
            {
             before(grammarAccess.getMethodDefinitionRule()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1526);
            ruleMethodDefinition();
            _fsp--;

             after(grammarAccess.getMethodDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition1533); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:743:1: ruleMethodDefinition : ( ( rule__MethodDefinition__Group__0 ) ) ;
    public final void ruleMethodDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:747:2: ( ( ( rule__MethodDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:748:1: ( ( rule__MethodDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:748:1: ( ( rule__MethodDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:749:1: ( rule__MethodDefinition__Group__0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:750:1: ( rule__MethodDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:750:2: rule__MethodDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1560);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:762:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:763:1: ( ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:764:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1587);
            ruleParameterList();
            _fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1594); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:771:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:775:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:776:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:776:1: ( ( rule__ParameterList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:777:1: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:778:1: ( rule__ParameterList__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:778:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1621);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:790:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:791:1: ( ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:792:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1648);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1655); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:799:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:803:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:804:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:804:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:805:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:806:1: ( rule__Parameter__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:806:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1682);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:818:1: entryRuleIncludeDirective : ruleIncludeDirective EOF ;
    public final void entryRuleIncludeDirective() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:819:1: ( ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:820:1: ruleIncludeDirective EOF
            {
             before(grammarAccess.getIncludeDirectiveRule()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1709);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getIncludeDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective1716); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:827:1: ruleIncludeDirective : ( ( rule__IncludeDirective__Group__0 ) ) ;
    public final void ruleIncludeDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:831:2: ( ( ( rule__IncludeDirective__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:832:1: ( ( rule__IncludeDirective__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:832:1: ( ( rule__IncludeDirective__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:833:1: ( rule__IncludeDirective__Group__0 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:834:1: ( rule__IncludeDirective__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:834:2: rule__IncludeDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1743);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:846:1: entryRuleIncludePath : ruleIncludePath EOF ;
    public final void entryRuleIncludePath() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:847:1: ( ruleIncludePath EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:848:1: ruleIncludePath EOF
            {
             before(grammarAccess.getIncludePathRule()); 
            pushFollow(FOLLOW_ruleIncludePath_in_entryRuleIncludePath1770);
            ruleIncludePath();
            _fsp--;

             after(grammarAccess.getIncludePathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludePath1777); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:855:1: ruleIncludePath : ( ( rule__IncludePath__Alternatives ) ) ;
    public final void ruleIncludePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:859:2: ( ( ( rule__IncludePath__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:860:1: ( ( rule__IncludePath__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:860:1: ( ( rule__IncludePath__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:861:1: ( rule__IncludePath__Alternatives )
            {
             before(grammarAccess.getIncludePathAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:862:1: ( rule__IncludePath__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:862:2: rule__IncludePath__Alternatives
            {
            pushFollow(FOLLOW_rule__IncludePath__Alternatives_in_ruleIncludePath1804);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:875:1: ruleTypeQualifier : ( ( rule__TypeQualifier__Alternatives ) ) ;
    public final void ruleTypeQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:879:1: ( ( ( rule__TypeQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:880:1: ( ( rule__TypeQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:880:1: ( ( rule__TypeQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:881:1: ( rule__TypeQualifier__Alternatives )
            {
             before(grammarAccess.getTypeQualifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:882:1: ( rule__TypeQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:882:2: rule__TypeQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1841);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:894:1: ruleTypeSpecifier : ( ( rule__TypeSpecifier__Alternatives ) ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:898:1: ( ( ( rule__TypeSpecifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:899:1: ( ( rule__TypeSpecifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:899:1: ( ( rule__TypeSpecifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:900:1: ( rule__TypeSpecifier__Alternatives )
            {
             before(grammarAccess.getTypeSpecifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:901:1: ( rule__TypeSpecifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:901:2: rule__TypeSpecifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1877);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:913:1: ruleParameterQualifier : ( ( rule__ParameterQualifier__Alternatives ) ) ;
    public final void ruleParameterQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:917:1: ( ( ( rule__ParameterQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:918:1: ( ( rule__ParameterQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:918:1: ( ( rule__ParameterQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:919:1: ( rule__ParameterQualifier__Alternatives )
            {
             before(grammarAccess.getParameterQualifierAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:920:1: ( rule__ParameterQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:920:2: rule__ParameterQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1913);
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


    // $ANTLR start rule__IdtFile__Alternatives_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:931:1: rule__IdtFile__Alternatives_1 : ( ( ( rule__IdtFile__TypeAssignment_1_0 ) ) | ( ( rule__IdtFile__ConstantAssignment_1_1 ) ) );
    public final void rule__IdtFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:935:1: ( ( ( rule__IdtFile__TypeAssignment_1_0 ) ) | ( ( rule__IdtFile__ConstantAssignment_1_1 ) ) )
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
                    new NoViableAltException("931:1: rule__IdtFile__Alternatives_1 : ( ( ( rule__IdtFile__TypeAssignment_1_0 ) ) | ( ( rule__IdtFile__ConstantAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:936:1: ( ( rule__IdtFile__TypeAssignment_1_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:936:1: ( ( rule__IdtFile__TypeAssignment_1_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:937:1: ( rule__IdtFile__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getIdtFileAccess().getTypeAssignment_1_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:938:1: ( rule__IdtFile__TypeAssignment_1_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:938:2: rule__IdtFile__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__IdtFile__TypeAssignment_1_0_in_rule__IdtFile__Alternatives_11948);
                    rule__IdtFile__TypeAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getIdtFileAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:942:6: ( ( rule__IdtFile__ConstantAssignment_1_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:942:6: ( ( rule__IdtFile__ConstantAssignment_1_1 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:943:1: ( rule__IdtFile__ConstantAssignment_1_1 )
                    {
                     before(grammarAccess.getIdtFileAccess().getConstantAssignment_1_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:944:1: ( rule__IdtFile__ConstantAssignment_1_1 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:944:2: rule__IdtFile__ConstantAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__IdtFile__ConstantAssignment_1_1_in_rule__IdtFile__Alternatives_11966);
                    rule__IdtFile__ConstantAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getIdtFileAccess().getConstantAssignment_1_1()); 

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
    // $ANTLR end rule__IdtFile__Alternatives_1


    // $ANTLR start rule__TypeDefinition__Alternatives_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:954:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );
    public final void rule__TypeDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:958:1: ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) )
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
                    new NoViableAltException("954:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:959:1: ( ruleTypedefSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:959:1: ( ruleTypedefSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:960:1: ruleTypedefSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_02000);
                    ruleTypedefSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:965:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:965:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:966:1: ruleStructOrUnionSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02017);
                    ruleStructOrUnionSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:971:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:971:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:972:1: ruleEnumSpecification
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02034);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:982:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:986:1: ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) )
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
                    new NoViableAltException("982:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:987:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:987:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:988:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:989:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:989:2: rule__TypeSpecification__TypeDefNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2066);
                    rule__TypeSpecification__TypeDefNameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:993:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:993:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:994:1: ruleStructOrUnionSpecification
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2084);
                    ruleStructOrUnionSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:999:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:999:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1000:1: ruleEnumSpecification
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2101);
                    ruleEnumSpecification();
                    _fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1005:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1005:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1006:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1006:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1007:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1008:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1008:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2120);
                    rule__TypeSpecification__TypeSpecifierAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 

                    }

                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1011:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1012:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1013:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=17 && LA3_0<=36)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1013:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    	    {
                    	    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2132);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );
    public final void rule__StructOrUnionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1027:1: ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) )
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
                            new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==41) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 1, input);

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
                            new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==41) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1028:1: ( ruleStructOrUnionDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1028:1: ( ruleStructOrUnionDefinition )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1029:1: ruleStructOrUnionDefinition
                    {
                     before(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2168);
                    ruleStructOrUnionDefinition();
                    _fsp--;

                     after(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1034:6: ( ruleStructorUnionReference )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1034:6: ( ruleStructorUnionReference )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1035:1: ruleStructorUnionReference
                    {
                     before(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2185);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1045:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );
    public final void rule__StructOrUnion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1049:1: ( ( 'struct' ) | ( 'union' ) )
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
                    new NoViableAltException("1045:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1050:1: ( 'struct' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1050:1: ( 'struct' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1051:1: 'struct'
                    {
                     before(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__StructOrUnion__Alternatives2218); 
                     after(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1058:6: ( 'union' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1058:6: ( 'union' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1059:1: 'union'
                    {
                     before(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__StructOrUnion__Alternatives2238); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1071:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );
    public final void rule__EnumSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1075:1: ( ( ruleEnumDefinition ) | ( ruleEnumReference ) )
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
                            new NoViableAltException("1071:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==41) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1071:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1071:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1076:1: ( ruleEnumDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1076:1: ( ruleEnumDefinition )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1077:1: ruleEnumDefinition
                    {
                     before(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2272);
                    ruleEnumDefinition();
                    _fsp--;

                     after(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1082:6: ( ruleEnumReference )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1082:6: ( ruleEnumReference )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1083:1: ruleEnumReference
                    {
                     before(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2289);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1093:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );
    public final void rule__DirectDeclarator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1097:1: ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) )
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
                    new NoViableAltException("1093:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1098:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1098:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1099:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    {
                     before(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1100:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1100:2: rule__DirectDeclarator__IdAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02321);
                    rule__DirectDeclarator__IdAssignment_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1104:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1104:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1105:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    {
                     before(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1106:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1106:2: rule__DirectDeclarator__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02339);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1115:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );
    public final void rule__MethodDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1119:1: ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_ID||(LA9_2>=17 && LA9_2<=36)||(LA9_2>=47 && LA9_2<=48)) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==49) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1115:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 9, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 49:
                    {
                    alt9=1;
                    }
                    break;
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1115:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1120:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1120:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1121:1: ( rule__MethodDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1122:1: ( rule__MethodDefinition__Group_2_0__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1122:2: rule__MethodDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22372);
                    rule__MethodDefinition__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1126:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1126:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1127:1: ( rule__MethodDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1128:1: ( rule__MethodDefinition__Group_2_1__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1128:2: rule__MethodDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22390);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1137:1: rule__IncludePath__Alternatives : ( ( '\".*\"' ) | ( '<.*>' ) );
    public final void rule__IncludePath__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1141:1: ( ( '\".*\"' ) | ( '<.*>' ) )
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
                    new NoViableAltException("1137:1: rule__IncludePath__Alternatives : ( ( '\".*\"' ) | ( '<.*>' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1142:1: ( '\".*\"' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1142:1: ( '\".*\"' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1143:1: '\".*\"'
                    {
                     before(grammarAccess.getIncludePathAccess().getQuotationMarkFullStopAsteriskQuotationMarkKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__IncludePath__Alternatives2424); 
                     after(grammarAccess.getIncludePathAccess().getQuotationMarkFullStopAsteriskQuotationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1150:6: ( '<.*>' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1150:6: ( '<.*>' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1151:1: '<.*>'
                    {
                     before(grammarAccess.getIncludePathAccess().getLessThanSignFullStopAsteriskGreaterThanSignKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__IncludePath__Alternatives2444); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1163:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );
    public final void rule__TypeQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1167:1: ( ( ( 'const' ) ) | ( ( 'volatile' ) ) )
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
                    new NoViableAltException("1163:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1168:1: ( ( 'const' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1168:1: ( ( 'const' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1169:1: ( 'const' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1170:1: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1170:3: 'const'
                    {
                    match(input,15,FOLLOW_15_in_rule__TypeQualifier__Alternatives2479); 

                    }

                     after(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1175:6: ( ( 'volatile' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1175:6: ( ( 'volatile' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1176:1: ( 'volatile' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1177:1: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1177:3: 'volatile'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeQualifier__Alternatives2500); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1187:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );
    public final void rule__TypeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1191:1: ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) )
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
                    new NoViableAltException("1187:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1192:1: ( ( 'void' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1192:1: ( ( 'void' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1193:1: ( 'void' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1194:1: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1194:3: 'void'
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeSpecifier__Alternatives2536); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1199:6: ( ( 'char' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1199:6: ( ( 'char' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1200:1: ( 'char' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1201:1: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1201:3: 'char'
                    {
                    match(input,18,FOLLOW_18_in_rule__TypeSpecifier__Alternatives2557); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1206:6: ( ( 'short' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1206:6: ( ( 'short' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1207:1: ( 'short' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1208:1: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1208:3: 'short'
                    {
                    match(input,19,FOLLOW_19_in_rule__TypeSpecifier__Alternatives2578); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1213:6: ( ( 'int' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1213:6: ( ( 'int' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1214:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1215:1: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1215:3: 'int'
                    {
                    match(input,20,FOLLOW_20_in_rule__TypeSpecifier__Alternatives2599); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1220:6: ( ( 'long' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1220:6: ( ( 'long' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1221:1: ( 'long' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1222:1: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1222:3: 'long'
                    {
                    match(input,21,FOLLOW_21_in_rule__TypeSpecifier__Alternatives2620); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1227:6: ( ( 'float' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1227:6: ( ( 'float' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1228:1: ( 'float' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1229:1: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1229:3: 'float'
                    {
                    match(input,22,FOLLOW_22_in_rule__TypeSpecifier__Alternatives2641); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1234:6: ( ( 'double' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1234:6: ( ( 'double' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1235:1: ( 'double' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1236:1: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1236:3: 'double'
                    {
                    match(input,23,FOLLOW_23_in_rule__TypeSpecifier__Alternatives2662); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1241:6: ( ( 'signed' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1241:6: ( ( 'signed' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1242:1: ( 'signed' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1243:1: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1243:3: 'signed'
                    {
                    match(input,24,FOLLOW_24_in_rule__TypeSpecifier__Alternatives2683); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1248:6: ( ( 'unsigned' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1248:6: ( ( 'unsigned' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1249:1: ( 'unsigned' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1250:1: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1250:3: 'unsigned'
                    {
                    match(input,25,FOLLOW_25_in_rule__TypeSpecifier__Alternatives2704); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1255:6: ( ( 'string' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1255:6: ( ( 'string' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1256:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1257:1: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1257:3: 'string'
                    {
                    match(input,26,FOLLOW_26_in_rule__TypeSpecifier__Alternatives2725); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1262:6: ( ( 'int8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1262:6: ( ( 'int8_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1263:1: ( 'int8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1264:1: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1264:3: 'int8_t'
                    {
                    match(input,27,FOLLOW_27_in_rule__TypeSpecifier__Alternatives2746); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1269:6: ( ( 'uint8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1269:6: ( ( 'uint8_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1270:1: ( 'uint8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1271:1: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1271:3: 'uint8_t'
                    {
                    match(input,28,FOLLOW_28_in_rule__TypeSpecifier__Alternatives2767); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1276:6: ( ( 'int16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1276:6: ( ( 'int16_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1277:1: ( 'int16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1278:1: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1278:3: 'int16_t'
                    {
                    match(input,29,FOLLOW_29_in_rule__TypeSpecifier__Alternatives2788); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1283:6: ( ( 'uint16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1283:6: ( ( 'uint16_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1284:1: ( 'uint16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1285:1: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1285:3: 'uint16_t'
                    {
                    match(input,30,FOLLOW_30_in_rule__TypeSpecifier__Alternatives2809); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1290:6: ( ( 'int32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1290:6: ( ( 'int32_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1291:1: ( 'int32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1292:1: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1292:3: 'int32_t'
                    {
                    match(input,31,FOLLOW_31_in_rule__TypeSpecifier__Alternatives2830); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1297:6: ( ( 'uint32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1297:6: ( ( 'uint32_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1298:1: ( 'uint32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1299:1: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1299:3: 'uint32_t'
                    {
                    match(input,32,FOLLOW_32_in_rule__TypeSpecifier__Alternatives2851); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1304:6: ( ( 'int64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1304:6: ( ( 'int64_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1305:1: ( 'int64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1306:1: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1306:3: 'int64_t'
                    {
                    match(input,33,FOLLOW_33_in_rule__TypeSpecifier__Alternatives2872); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1311:6: ( ( 'uint64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1311:6: ( ( 'uint64_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1312:1: ( 'uint64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1313:1: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1313:3: 'uint64_t'
                    {
                    match(input,34,FOLLOW_34_in_rule__TypeSpecifier__Alternatives2893); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1318:6: ( ( 'intptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1318:6: ( ( 'intptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1319:1: ( 'intptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1320:1: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1320:3: 'intptr_t'
                    {
                    match(input,35,FOLLOW_35_in_rule__TypeSpecifier__Alternatives2914); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1325:6: ( ( 'uintptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1325:6: ( ( 'uintptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1326:1: ( 'uintptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1327:1: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1327:3: 'uintptr_t'
                    {
                    match(input,36,FOLLOW_36_in_rule__TypeSpecifier__Alternatives2935); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1337:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__ParameterQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1341:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
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
                    new NoViableAltException("1337:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1342:1: ( ( 'in' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1342:1: ( ( 'in' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1343:1: ( 'in' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1344:1: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1344:3: 'in'
                    {
                    match(input,37,FOLLOW_37_in_rule__ParameterQualifier__Alternatives2971); 

                    }

                     after(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1349:6: ( ( 'out' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1349:6: ( ( 'out' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1350:1: ( 'out' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1351:1: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1351:3: 'out'
                    {
                    match(input,38,FOLLOW_38_in_rule__ParameterQualifier__Alternatives2992); 

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


    // $ANTLR start rule__IdtFile__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1363:1: rule__IdtFile__Group__0 : ( ( rule__IdtFile__IncludesAssignment_0 )* ) rule__IdtFile__Group__1 ;
    public final void rule__IdtFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:1: ( ( ( rule__IdtFile__IncludesAssignment_0 )* ) rule__IdtFile__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1368:1: ( ( rule__IdtFile__IncludesAssignment_0 )* ) rule__IdtFile__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1368:1: ( ( rule__IdtFile__IncludesAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:1: ( rule__IdtFile__IncludesAssignment_0 )*
            {
             before(grammarAccess.getIdtFileAccess().getIncludesAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1370:1: ( rule__IdtFile__IncludesAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==57) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1370:2: rule__IdtFile__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__IncludesAssignment_0_in_rule__IdtFile__Group__03029);
            	    rule__IdtFile__IncludesAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIdtFileAccess().getIncludesAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__03039);
            rule__IdtFile__Group__1();
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
    // $ANTLR end rule__IdtFile__Group__0


    // $ANTLR start rule__IdtFile__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1381:1: rule__IdtFile__Group__1 : ( ( rule__IdtFile__Alternatives_1 )* ) ;
    public final void rule__IdtFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1385:1: ( ( ( rule__IdtFile__Alternatives_1 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1386:1: ( ( rule__IdtFile__Alternatives_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1386:1: ( ( rule__IdtFile__Alternatives_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1387:1: ( rule__IdtFile__Alternatives_1 )*
            {
             before(grammarAccess.getIdtFileAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1388:1: ( rule__IdtFile__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=12)||LA15_0==40||LA15_0==44||LA15_0==53) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1388:2: rule__IdtFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__Alternatives_1_in_rule__IdtFile__Group__13067);
            	    rule__IdtFile__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIdtFileAccess().getAlternatives_1()); 

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
    // $ANTLR end rule__IdtFile__Group__1


    // $ANTLR start rule__TypeDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1403:1: rule__TypeDefinition__Group__0 : ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1407:1: ( ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1408:1: ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1408:1: ( ( rule__TypeDefinition__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1409:1: ( rule__TypeDefinition__Alternatives_0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1410:1: ( rule__TypeDefinition__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1410:2: rule__TypeDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03107);
            rule__TypeDefinition__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03116);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1421:1: rule__TypeDefinition__Group__1 : ( ';' ) ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1425:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1426:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1426:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1427:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__TypeDefinition__Group__13145); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1444:1: rule__TypedefSpecification__Group__0 : ( 'typedef' ) rule__TypedefSpecification__Group__1 ;
    public final void rule__TypedefSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1448:1: ( ( 'typedef' ) rule__TypedefSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1449:1: ( 'typedef' ) rule__TypedefSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1449:1: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1450:1: 'typedef'
            {
             before(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__TypedefSpecification__Group__03185); 
             after(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03195);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1464:1: rule__TypedefSpecification__Group__1 : ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 ;
    public final void rule__TypedefSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1468:1: ( ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1469:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1469:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1470:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1471:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1471:2: rule__TypedefSpecification__QualifedTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13223);
            rule__TypedefSpecification__QualifedTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13232);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1482:1: rule__TypedefSpecification__Group__2 : ( ( rule__TypedefSpecification__DecAssignment_2 ) ) ;
    public final void rule__TypedefSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1486:1: ( ( ( rule__TypedefSpecification__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1487:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1487:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1488:1: ( rule__TypedefSpecification__DecAssignment_2 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1489:1: ( rule__TypedefSpecification__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1489:2: rule__TypedefSpecification__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23260);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1505:1: rule__QualifiedTypeSpecification__Group__0 : ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 ;
    public final void rule__QualifiedTypeSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1509:1: ( ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1510:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1510:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1511:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1512:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=15 && LA16_0<=16)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1512:2: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03300);
            	    rule__QualifiedTypeSpecification__TypeQualifierAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03310);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1523:1: rule__QualifiedTypeSpecification__Group__1 : ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) ;
    public final void rule__QualifiedTypeSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1527:1: ( ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1528:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1528:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1529:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1530:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1530:2: rule__QualifiedTypeSpecification__TypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13338);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1544:1: rule__StructOrUnionDefinition__Group__0 : ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 ;
    public final void rule__StructOrUnionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1548:1: ( ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1549:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1549:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1550:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1551:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1551:2: rule__StructOrUnionDefinition__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03376);
            rule__StructOrUnionDefinition__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03385);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1562:1: rule__StructOrUnionDefinition__Group__1 : ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 ;
    public final void rule__StructOrUnionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1566:1: ( ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1567:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1567:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1568:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1569:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1569:2: rule__StructOrUnionDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13413);
                    rule__StructOrUnionDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13423);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1580:1: rule__StructOrUnionDefinition__Group__2 : ( '{' ) rule__StructOrUnionDefinition__Group__3 ;
    public final void rule__StructOrUnionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1584:1: ( ( '{' ) rule__StructOrUnionDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1585:1: ( '{' ) rule__StructOrUnionDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1585:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1586:1: '{'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__StructOrUnionDefinition__Group__23452); 
             after(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23462);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1600:1: rule__StructOrUnionDefinition__Group__3 : ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 ;
    public final void rule__StructOrUnionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1604:1: ( ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1605:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1605:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1606:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1607:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=12)||(LA18_0>=15 && LA18_0<=36)||LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1607:2: rule__StructOrUnionDefinition__StructMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33490);
            	    rule__StructOrUnionDefinition__StructMemberAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33500);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1618:1: rule__StructOrUnionDefinition__Group__4 : ( '}' ) ;
    public final void rule__StructOrUnionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1622:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1623:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1623:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1624:1: '}'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__StructOrUnionDefinition__Group__43529); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1647:1: rule__StructorUnionReference__Group__0 : ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 ;
    public final void rule__StructorUnionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1651:1: ( ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1652:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1652:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1653:1: ( rule__StructorUnionReference__StructAssignment_0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1654:1: ( rule__StructorUnionReference__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1654:2: rule__StructorUnionReference__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03574);
            rule__StructorUnionReference__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03583);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1665:1: rule__StructorUnionReference__Group__1 : ( ( rule__StructorUnionReference__IdAssignment_1 ) ) ;
    public final void rule__StructorUnionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1669:1: ( ( ( rule__StructorUnionReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1670:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1670:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1671:1: ( rule__StructorUnionReference__IdAssignment_1 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1672:1: ( rule__StructorUnionReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1672:2: rule__StructorUnionReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13611);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1686:1: rule__StructMember__Group__0 : ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 ;
    public final void rule__StructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1690:1: ( ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1691:1: ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1691:1: ( ( rule__StructMember__QualTypeAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1692:1: ( rule__StructMember__QualTypeAssignment_0 )
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1693:1: ( rule__StructMember__QualTypeAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1693:2: rule__StructMember__QualTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03649);
            rule__StructMember__QualTypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03658);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1704:1: rule__StructMember__Group__1 : ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 ;
    public final void rule__StructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1708:1: ( ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1709:1: ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1709:1: ( ( rule__StructMember__DecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1710:1: ( rule__StructMember__DecAssignment_1 )
            {
             before(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1711:1: ( rule__StructMember__DecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1711:2: rule__StructMember__DecAssignment_1
            {
            pushFollow(FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__13686);
            rule__StructMember__DecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__13695);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1722:1: rule__StructMember__Group__2 : ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 ;
    public final void rule__StructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1726:1: ( ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1727:1: ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1727:1: ( ( rule__StructMember__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1728:1: ( rule__StructMember__Group_2__0 )?
            {
             before(grammarAccess.getStructMemberAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1729:1: ( rule__StructMember__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1729:2: rule__StructMember__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__23723);
                    rule__StructMember__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructMemberAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__23733);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1740:1: rule__StructMember__Group__3 : ( ';' ) ;
    public final void rule__StructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1744:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1745:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1745:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1746:1: ';'
            {
             before(grammarAccess.getStructMemberAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__StructMember__Group__33762); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1767:1: rule__StructMember__Group_2__0 : ( ':' ) rule__StructMember__Group_2__1 ;
    public final void rule__StructMember__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1771:1: ( ( ':' ) rule__StructMember__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1772:1: ( ':' ) rule__StructMember__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1772:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1773:1: ':'
            {
             before(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__StructMember__Group_2__03806); 
             after(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__03816);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1787:1: rule__StructMember__Group_2__1 : ( RULE_INT ) ;
    public final void rule__StructMember__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1791:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1792:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1792:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1793:1: RULE_INT
            {
             before(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StructMember__Group_2__13844); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1808:1: rule__EnumDefinition__Group__0 : ( 'enum' ) rule__EnumDefinition__Group__1 ;
    public final void rule__EnumDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1812:1: ( ( 'enum' ) rule__EnumDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1813:1: ( 'enum' ) rule__EnumDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1813:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1814:1: 'enum'
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumDefinition__Group__03882); 
             after(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__03892);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1828:1: rule__EnumDefinition__Group__1 : ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 ;
    public final void rule__EnumDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1832:1: ( ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1833:1: ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1833:1: ( ( rule__EnumDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1834:1: ( rule__EnumDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1835:1: ( rule__EnumDefinition__IdAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1835:2: rule__EnumDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__13920);
                    rule__EnumDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__13930);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1846:1: rule__EnumDefinition__Group__2 : ( '{' ) rule__EnumDefinition__Group__3 ;
    public final void rule__EnumDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1850:1: ( ( '{' ) rule__EnumDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1851:1: ( '{' ) rule__EnumDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1851:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1852:1: '{'
            {
             before(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__EnumDefinition__Group__23959); 
             after(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__23969);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1866:1: rule__EnumDefinition__Group__3 : ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 ;
    public final void rule__EnumDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1870:1: ( ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1871:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1871:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1872:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1873:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1873:2: rule__EnumDefinition__EnumMemberListAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__33997);
            rule__EnumDefinition__EnumMemberListAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34006);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1884:1: rule__EnumDefinition__Group__4 : ( '}' ) ;
    public final void rule__EnumDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1888:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1889:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1889:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1890:1: '}'
            {
             before(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__EnumDefinition__Group__44035); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1913:1: rule__EnumReference__Group__0 : ( 'enum' ) rule__EnumReference__Group__1 ;
    public final void rule__EnumReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1917:1: ( ( 'enum' ) rule__EnumReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1918:1: ( 'enum' ) rule__EnumReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1918:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1919:1: 'enum'
            {
             before(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumReference__Group__04081); 
             after(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04091);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1933:1: rule__EnumReference__Group__1 : ( ( rule__EnumReference__IdAssignment_1 ) ) ;
    public final void rule__EnumReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1937:1: ( ( ( rule__EnumReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1938:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1938:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1939:1: ( rule__EnumReference__IdAssignment_1 )
            {
             before(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1940:1: ( rule__EnumReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1940:2: rule__EnumReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14119);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1954:1: rule__EnumMemberList__Group__0 : ( ruleEnumMember ) rule__EnumMemberList__Group__1 ;
    public final void rule__EnumMemberList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1958:1: ( ( ruleEnumMember ) rule__EnumMemberList__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1959:1: ( ruleEnumMember ) rule__EnumMemberList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1959:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1960:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04157);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04165);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1972:1: rule__EnumMemberList__Group__1 : ( ( rule__EnumMemberList__Group_1__0 )* ) ;
    public final void rule__EnumMemberList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1976:1: ( ( ( rule__EnumMemberList__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1977:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1977:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1978:1: ( rule__EnumMemberList__Group_1__0 )*
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1979:1: ( rule__EnumMemberList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1979:2: rule__EnumMemberList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14193);
            	    rule__EnumMemberList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1993:1: rule__EnumMemberList__Group_1__0 : ( ',' ) rule__EnumMemberList__Group_1__1 ;
    public final void rule__EnumMemberList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1997:1: ( ( ',' ) rule__EnumMemberList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1998:1: ( ',' ) rule__EnumMemberList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1998:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1999:1: ','
            {
             before(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumMemberList__Group_1__04233); 
             after(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04243);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2013:1: rule__EnumMemberList__Group_1__1 : ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) ;
    public final void rule__EnumMemberList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2017:1: ( ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2018:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2018:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2019:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2020:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2020:2: rule__EnumMemberList__EnumMemberAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14271);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2034:1: rule__EnumMember__Group__0 : ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2038:1: ( ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2039:1: ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2039:1: ( ( rule__EnumMember__IdAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2040:1: ( rule__EnumMember__IdAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2041:1: ( rule__EnumMember__IdAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2041:2: rule__EnumMember__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04309);
            rule__EnumMember__IdAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04318);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2052:1: rule__EnumMember__Group__1 : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2056:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2057:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2057:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2058:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2059:1: ( rule__EnumMember__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2059:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14346);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2073:1: rule__EnumMember__Group_1__0 : ( '=' ) rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2077:1: ( ( '=' ) rule__EnumMember__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2078:1: ( '=' ) rule__EnumMember__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2078:1: ( '=' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2079:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__EnumMember__Group_1__04386); 
             after(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04396);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2093:1: rule__EnumMember__Group_1__1 : ( RULE_INT ) ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2097:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2098:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2098:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2099:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14424); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2114:1: rule__Declarators__Group__0 : ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 ;
    public final void rule__Declarators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2118:1: ( ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2119:1: ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2119:1: ( ( rule__Declarators__DecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2120:1: ( rule__Declarators__DecAssignment_0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2121:1: ( rule__Declarators__DecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2121:2: rule__Declarators__DecAssignment_0
            {
            pushFollow(FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04461);
            rule__Declarators__DecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04470);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2132:1: rule__Declarators__Group__1 : ( ( rule__Declarators__Group_1__0 )* ) ;
    public final void rule__Declarators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2136:1: ( ( ( rule__Declarators__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2137:1: ( ( rule__Declarators__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2137:1: ( ( rule__Declarators__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2138:1: ( rule__Declarators__Group_1__0 )*
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2139:1: ( rule__Declarators__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2139:2: rule__Declarators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14498);
            	    rule__Declarators__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2153:1: rule__Declarators__Group_1__0 : ( ',' ) rule__Declarators__Group_1__1 ;
    public final void rule__Declarators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2157:1: ( ( ',' ) rule__Declarators__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2158:1: ( ',' ) rule__Declarators__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2158:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2159:1: ','
            {
             before(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Declarators__Group_1__04538); 
             after(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04548);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2173:1: rule__Declarators__Group_1__1 : ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) ;
    public final void rule__Declarators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2177:1: ( ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2178:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2178:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2179:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2180:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2180:2: rule__Declarators__DeclaratorListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14576);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2194:1: rule__Declarator__Group__0 : ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 ;
    public final void rule__Declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2198:1: ( ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2199:1: ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2199:1: ( ( rule__Declarator__Group_0__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2200:1: ( rule__Declarator__Group_0__0 )*
            {
             before(grammarAccess.getDeclaratorAccess().getGroup_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2201:1: ( rule__Declarator__Group_0__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2201:2: rule__Declarator__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04614);
            	    rule__Declarator__Group_0__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDeclaratorAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04624);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2212:1: rule__Declarator__Group__1 : ( ( rule__Declarator__DcAssignment_1 ) ) ;
    public final void rule__Declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2216:1: ( ( ( rule__Declarator__DcAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2217:1: ( ( rule__Declarator__DcAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2217:1: ( ( rule__Declarator__DcAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2218:1: ( rule__Declarator__DcAssignment_1 )
            {
             before(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2219:1: ( rule__Declarator__DcAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2219:2: rule__Declarator__DcAssignment_1
            {
            pushFollow(FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14652);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2233:1: rule__Declarator__Group_0__0 : ( '*' ) rule__Declarator__Group_0__1 ;
    public final void rule__Declarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2237:1: ( ( '*' ) rule__Declarator__Group_0__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2238:1: ( '*' ) rule__Declarator__Group_0__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2238:1: ( '*' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2239:1: '*'
            {
             before(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Declarator__Group_0__04691); 
             after(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__04701);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2253:1: rule__Declarator__Group_0__1 : ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) ;
    public final void rule__Declarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2257:1: ( ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2258:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2258:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2259:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierAssignment_0_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2260:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2260:2: rule__Declarator__TypeQualifierAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__14729);
            	    rule__Declarator__TypeQualifierAssignment_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2274:1: rule__DirectDeclarator__Group__0 : ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 ;
    public final void rule__DirectDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2278:1: ( ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2279:1: ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2279:1: ( ( rule__DirectDeclarator__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2280:1: ( rule__DirectDeclarator__Alternatives_0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2281:1: ( rule__DirectDeclarator__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2281:2: rule__DirectDeclarator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__04768);
            rule__DirectDeclarator__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__04777);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2292:1: rule__DirectDeclarator__Group__1 : ( ( ruleArraySpecification )* ) ;
    public final void rule__DirectDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2296:1: ( ( ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2297:1: ( ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2297:1: ( ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2298:1: ( ruleArraySpecification )*
            {
             before(grammarAccess.getDirectDeclaratorAccess().getArraySpecificationParserRuleCall_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2299:1: ( ruleArraySpecification )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2299:3: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__14806);
            	    ruleArraySpecification();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2313:1: rule__DirectDeclarator__Group_0_1__0 : ( '(' ) rule__DirectDeclarator__Group_0_1__1 ;
    public final void rule__DirectDeclarator__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2317:1: ( ( '(' ) rule__DirectDeclarator__Group_0_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2318:1: ( '(' ) rule__DirectDeclarator__Group_0_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2318:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2319:1: '('
            {
             before(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,48,FOLLOW_48_in_rule__DirectDeclarator__Group_0_1__04846); 
             after(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__04856);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2333:1: rule__DirectDeclarator__Group_0_1__1 : ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 ;
    public final void rule__DirectDeclarator__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2337:1: ( ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2338:1: ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2338:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2339:1: ruleDeclarator
            {
             before(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__14884);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__14892);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2351:1: rule__DirectDeclarator__Group_0_1__2 : ( ')' ) ;
    public final void rule__DirectDeclarator__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2355:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2356:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2356:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2357:1: ')'
            {
             before(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,49,FOLLOW_49_in_rule__DirectDeclarator__Group_0_1__24921); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2376:1: rule__ArraySpecification__Group__0 : ( '[' ) rule__ArraySpecification__Group__1 ;
    public final void rule__ArraySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2380:1: ( ( '[' ) rule__ArraySpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2381:1: ( '[' ) rule__ArraySpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2381:1: ( '[' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2382:1: '['
            {
             before(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__ArraySpecification__Group__04963); 
             after(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__04973);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2396:1: rule__ArraySpecification__Group__1 : ( RULE_INT ) rule__ArraySpecification__Group__2 ;
    public final void rule__ArraySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2400:1: ( ( RULE_INT ) rule__ArraySpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2401:1: ( RULE_INT ) rule__ArraySpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2401:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2402:1: RULE_INT
            {
             before(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySpecification__Group__15001); 
             after(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15009);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2414:1: rule__ArraySpecification__Group__2 : ( ']' ) ;
    public final void rule__ArraySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2418:1: ( ( ']' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2419:1: ( ']' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2419:1: ( ']' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2420:1: ']'
            {
             before(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__ArraySpecification__Group__25038); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2439:1: rule__FullyQualifiedName__Group__0 : ( RULE_ID ) rule__FullyQualifiedName__Group__1 ;
    public final void rule__FullyQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2443:1: ( ( RULE_ID ) rule__FullyQualifiedName__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2444:1: ( RULE_ID ) rule__FullyQualifiedName__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2444:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2445:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05079); 
             after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05087);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2457:1: rule__FullyQualifiedName__Group__1 : ( ( rule__FullyQualifiedName__Group_1__0 )* ) ;
    public final void rule__FullyQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2461:1: ( ( ( rule__FullyQualifiedName__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2462:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2462:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2463:1: ( rule__FullyQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2464:1: ( rule__FullyQualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2464:2: rule__FullyQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15115);
            	    rule__FullyQualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2478:1: rule__FullyQualifiedName__Group_1__0 : ( '.' ) rule__FullyQualifiedName__Group_1__1 ;
    public final void rule__FullyQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2482:1: ( ( '.' ) rule__FullyQualifiedName__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2483:1: ( '.' ) rule__FullyQualifiedName__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2483:1: ( '.' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2484:1: '.'
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__FullyQualifiedName__Group_1__05155); 
             after(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05165);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2498:1: rule__FullyQualifiedName__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FullyQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2502:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2503:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2503:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2504:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15193); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2519:1: rule__ConstantDefinition__Group__0 : ( '#define' ) rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2523:1: ( ( '#define' ) rule__ConstantDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2524:1: ( '#define' ) rule__ConstantDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2524:1: ( '#define' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2525:1: '#define'
            {
             before(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ConstantDefinition__Group__05231); 
             after(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05241);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2539:1: rule__ConstantDefinition__Group__1 : ( ( rule__ConstantDefinition__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2543:1: ( ( ( rule__ConstantDefinition__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2544:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2544:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2545:1: ( rule__ConstantDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2546:1: ( rule__ConstantDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2546:2: rule__ConstantDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15269);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2560:1: rule__InterfaceDefinition__Group__0 : ( 'interface' ) rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2564:1: ( ( 'interface' ) rule__InterfaceDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2565:1: ( 'interface' ) rule__InterfaceDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2565:1: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2566:1: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__InterfaceDefinition__Group__05308); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05318);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2580:1: rule__InterfaceDefinition__Group__1 : ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2584:1: ( ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2585:1: ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2585:1: ( ( 'unmanaged' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2586:1: ( 'unmanaged' )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2587:1: ( 'unmanaged' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==55) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2588:2: 'unmanaged'
                    {
                    match(input,55,FOLLOW_55_in_rule__InterfaceDefinition__Group__15348); 

                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15360);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2600:1: rule__InterfaceDefinition__Group__2 : ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2604:1: ( ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2605:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2605:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2606:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2607:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2607:2: rule__InterfaceDefinition__FqnAssignment_2
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25388);
            rule__InterfaceDefinition__FqnAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25397);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2618:1: rule__InterfaceDefinition__Group__3 : ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2622:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2623:1: ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2623:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2624:1: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2625:1: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2625:2: rule__InterfaceDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35425);
                    rule__InterfaceDefinition__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35435);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2636:1: rule__InterfaceDefinition__Group__4 : ( '{' ) rule__InterfaceDefinition__Group__5 ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2640:1: ( ( '{' ) rule__InterfaceDefinition__Group__5 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2641:1: ( '{' ) rule__InterfaceDefinition__Group__5
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2641:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2642:1: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__InterfaceDefinition__Group__45464); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45474);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2656:1: rule__InterfaceDefinition__Group__5 : ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 ;
    public final void rule__InterfaceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2660:1: ( ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2661:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2661:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2662:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2663:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=11 && LA30_0<=12)||(LA30_0>=15 && LA30_0<=36)||LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2663:2: rule__InterfaceDefinition__MethodDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55502);
            	    rule__InterfaceDefinition__MethodDefAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55512);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2674:1: rule__InterfaceDefinition__Group__6 : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2678:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2679:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2679:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2680:1: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__InterfaceDefinition__Group__65541); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2707:1: rule__InterfaceDefinition__Group_3__0 : ( ':' ) rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2711:1: ( ( ':' ) rule__InterfaceDefinition__Group_3__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2712:1: ( ':' ) rule__InterfaceDefinition__Group_3__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2712:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2713:1: ':'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__InterfaceDefinition__Group_3__05591); 
             after(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05601);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2727:1: rule__InterfaceDefinition__Group_3__1 : ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2731:1: ( ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2732:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2732:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2733:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_3_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2734:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2734:2: rule__InterfaceDefinition__Fqn2Assignment_3_1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15629);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2748:1: rule__MethodDefinition__Group__0 : ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 ;
    public final void rule__MethodDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2752:1: ( ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2753:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2753:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2754:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2755:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2755:2: rule__MethodDefinition__QualifiedTypeSpecAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05667);
            rule__MethodDefinition__QualifiedTypeSpecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05676);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2766:1: rule__MethodDefinition__Group__1 : ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 ;
    public final void rule__MethodDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2770:1: ( ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2771:1: ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2771:1: ( ( rule__MethodDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2772:1: ( rule__MethodDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2773:1: ( rule__MethodDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2773:2: rule__MethodDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__15704);
            rule__MethodDefinition__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__15713);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2784:1: rule__MethodDefinition__Group__2 : ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 ;
    public final void rule__MethodDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2788:1: ( ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2789:1: ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2789:1: ( ( rule__MethodDefinition__Alternatives_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2790:1: ( rule__MethodDefinition__Alternatives_2 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2791:1: ( rule__MethodDefinition__Alternatives_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2791:2: rule__MethodDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__25741);
            rule__MethodDefinition__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__25750);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2802:1: rule__MethodDefinition__Group__3 : ( ';' ) ;
    public final void rule__MethodDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2806:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2807:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2807:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2808:1: ';'
            {
             before(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__MethodDefinition__Group__35779); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2829:1: rule__MethodDefinition__Group_2_0__0 : ( '(' ) rule__MethodDefinition__Group_2_0__1 ;
    public final void rule__MethodDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2833:1: ( ( '(' ) rule__MethodDefinition__Group_2_0__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2834:1: ( '(' ) rule__MethodDefinition__Group_2_0__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2834:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2835:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,48,FOLLOW_48_in_rule__MethodDefinition__Group_2_0__05823); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__05833);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2849:1: rule__MethodDefinition__Group_2_0__1 : ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 ;
    public final void rule__MethodDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2853:1: ( ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2854:1: ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2854:1: ( ( 'void' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2855:1: ( 'void' )?
            {
             before(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2856:1: ( 'void' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2857:2: 'void'
                    {
                    match(input,17,FOLLOW_17_in_rule__MethodDefinition__Group_2_0__15863); 

                    }
                    break;

            }

             after(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__15875);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2869:1: rule__MethodDefinition__Group_2_0__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2873:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2874:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2874:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2875:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,49,FOLLOW_49_in_rule__MethodDefinition__Group_2_0__25904); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2894:1: rule__MethodDefinition__Group_2_1__0 : ( '(' ) rule__MethodDefinition__Group_2_1__1 ;
    public final void rule__MethodDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2898:1: ( ( '(' ) rule__MethodDefinition__Group_2_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2899:1: ( '(' ) rule__MethodDefinition__Group_2_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2899:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2900:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,48,FOLLOW_48_in_rule__MethodDefinition__Group_2_1__05946); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__05956);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2914:1: rule__MethodDefinition__Group_2_1__1 : ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 ;
    public final void rule__MethodDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2918:1: ( ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2919:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2919:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2920:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2921:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2921:2: rule__MethodDefinition__ParameterListAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__15984);
            rule__MethodDefinition__ParameterListAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__15993);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2932:1: rule__MethodDefinition__Group_2_1__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2936:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2937:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2937:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2938:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,49,FOLLOW_49_in_rule__MethodDefinition__Group_2_1__26022); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2957:1: rule__ParameterList__Group__0 : ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2961:1: ( ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2962:1: ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2962:1: ( ( rule__ParameterList__ParamAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2963:1: ( rule__ParameterList__ParamAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParamAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2964:1: ( rule__ParameterList__ParamAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2964:2: rule__ParameterList__ParamAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06063);
            rule__ParameterList__ParamAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParamAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06072);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2975:1: rule__ParameterList__Group__1 : ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2979:1: ( ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2980:1: ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2980:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2981:1: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2982:1: ( rule__ParameterList__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==45) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_ID||(LA32_1>=11 && LA32_1<=12)||(LA32_1>=15 && LA32_1<=38)||LA32_1==44) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2982:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16100);
            	    rule__ParameterList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16110);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2993:1: rule__ParameterList__Group__2 : ( ( rule__ParameterList__Group_2__0 )? ) ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2997:1: ( ( ( rule__ParameterList__Group_2__0 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2998:1: ( ( rule__ParameterList__Group_2__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2998:1: ( ( rule__ParameterList__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2999:1: ( rule__ParameterList__Group_2__0 )?
            {
             before(grammarAccess.getParameterListAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3000:1: ( rule__ParameterList__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3000:2: rule__ParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26138);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3016:1: rule__ParameterList__Group_1__0 : ( ',' ) rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3020:1: ( ( ',' ) rule__ParameterList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3021:1: ( ',' ) rule__ParameterList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3021:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3022:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__ParameterList__Group_1__06180); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06190);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3036:1: rule__ParameterList__Group_1__1 : ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3040:1: ( ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3041:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3041:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3042:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3043:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3043:2: rule__ParameterList__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16218);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3057:1: rule__ParameterList__Group_2__0 : ( ',' ) rule__ParameterList__Group_2__1 ;
    public final void rule__ParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3061:1: ( ( ',' ) rule__ParameterList__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3062:1: ( ',' ) rule__ParameterList__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3062:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3063:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__ParameterList__Group_2__06257); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06267);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3077:1: rule__ParameterList__Group_2__1 : ( '...' ) ;
    public final void rule__ParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3081:1: ( ( '...' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3082:1: ( '...' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3082:1: ( '...' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3083:1: '...'
            {
             before(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 
            match(input,56,FOLLOW_56_in_rule__ParameterList__Group_2__16296); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3100:1: rule__Parameter__Group__0 : ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3104:1: ( ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3105:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3105:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3106:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3107:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=37 && LA34_0<=38)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3107:2: rule__Parameter__ParameterQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06335);
            	    rule__Parameter__ParameterQualifierAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06345);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3118:1: rule__Parameter__Group__1 : ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3122:1: ( ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3123:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3123:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3124:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3125:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3125:2: rule__Parameter__QualifiedTypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16373);
            rule__Parameter__QualifiedTypeSpecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16382);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3136:1: rule__Parameter__Group__2 : ( ( rule__Parameter__DecAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3140:1: ( ( ( rule__Parameter__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3141:1: ( ( rule__Parameter__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3141:1: ( ( rule__Parameter__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3142:1: ( rule__Parameter__DecAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3143:1: ( rule__Parameter__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3143:2: rule__Parameter__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26410);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3159:1: rule__IncludeDirective__Group__0 : ( '#include' ) rule__IncludeDirective__Group__1 ;
    public final void rule__IncludeDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3163:1: ( ( '#include' ) rule__IncludeDirective__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3164:1: ( '#include' ) rule__IncludeDirective__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3164:1: ( '#include' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3165:1: '#include'
            {
             before(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__IncludeDirective__Group__06451); 
             after(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06461);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3179:1: rule__IncludeDirective__Group__1 : ( ( rule__IncludeDirective__PathAssignment_1 ) ) ;
    public final void rule__IncludeDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3183:1: ( ( ( rule__IncludeDirective__PathAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3184:1: ( ( rule__IncludeDirective__PathAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3184:1: ( ( rule__IncludeDirective__PathAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3185:1: ( rule__IncludeDirective__PathAssignment_1 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getPathAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3186:1: ( rule__IncludeDirective__PathAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3186:2: rule__IncludeDirective__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__IncludeDirective__PathAssignment_1_in_rule__IncludeDirective__Group__16489);
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


    // $ANTLR start rule__IdtFile__IncludesAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3200:1: rule__IdtFile__IncludesAssignment_0 : ( ruleIncludeDirective ) ;
    public final void rule__IdtFile__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3204:1: ( ( ruleIncludeDirective ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3205:1: ( ruleIncludeDirective )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3205:1: ( ruleIncludeDirective )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3206:1: ruleIncludeDirective
            {
             before(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_rule__IdtFile__IncludesAssignment_06527);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0()); 

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
    // $ANTLR end rule__IdtFile__IncludesAssignment_0


    // $ANTLR start rule__IdtFile__TypeAssignment_1_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3215:1: rule__IdtFile__TypeAssignment_1_0 : ( ruleTypeDefinition ) ;
    public final void rule__IdtFile__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3219:1: ( ( ruleTypeDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3220:1: ( ruleTypeDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3220:1: ( ruleTypeDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3221:1: ruleTypeDefinition
            {
             before(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__IdtFile__TypeAssignment_1_06558);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_1_0_0()); 

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
    // $ANTLR end rule__IdtFile__TypeAssignment_1_0


    // $ANTLR start rule__IdtFile__ConstantAssignment_1_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3230:1: rule__IdtFile__ConstantAssignment_1_1 : ( ruleConstantDefinition ) ;
    public final void rule__IdtFile__ConstantAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3234:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3235:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3235:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3236:1: ruleConstantDefinition
            {
             before(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__IdtFile__ConstantAssignment_1_16589);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__IdtFile__ConstantAssignment_1_1


    // $ANTLR start rule__TypedefSpecification__QualifedTypeAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3249:1: rule__TypedefSpecification__QualifedTypeAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__TypedefSpecification__QualifedTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3253:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3254:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3254:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3255:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_16624);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3264:1: rule__TypedefSpecification__DecAssignment_2 : ( ruleDeclarators ) ;
    public final void rule__TypedefSpecification__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3268:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3269:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3269:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3270:1: ruleDeclarators
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_26655);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3279:1: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 : ( ruleTypeQualifier ) ;
    public final void rule__QualifiedTypeSpecification__TypeQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3283:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3284:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3284:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3285:1: ruleTypeQualifier
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_06686);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3294:1: rule__QualifiedTypeSpecification__TypeSpecAssignment_1 : ( ruleTypeSpecification ) ;
    public final void rule__QualifiedTypeSpecification__TypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3298:1: ( ( ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3299:1: ( ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3299:1: ( ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3300:1: ruleTypeSpecification
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_16717);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3309:1: rule__TypeSpecification__TypeDefNameAssignment_0 : ( ruleTypedefName ) ;
    public final void rule__TypeSpecification__TypeDefNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3313:1: ( ( ruleTypedefName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3314:1: ( ruleTypedefName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3314:1: ( ruleTypedefName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3315:1: ruleTypedefName
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_06748);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3324:1: rule__TypeSpecification__TypeSpecifierAssignment_3 : ( ruleTypeSpecifier ) ;
    public final void rule__TypeSpecification__TypeSpecifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3328:1: ( ( ruleTypeSpecifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3329:1: ( ruleTypeSpecifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3329:1: ( ruleTypeSpecifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3330:1: ruleTypeSpecifier
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_36779);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3339:1: rule__StructOrUnionDefinition__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructOrUnionDefinition__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3343:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3344:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3344:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3345:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_06810);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3354:1: rule__StructOrUnionDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__StructOrUnionDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3358:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3359:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3359:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3360:1: ruleIdentifier
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__StructOrUnionDefinition__IdAssignment_16841);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3369:1: rule__StructOrUnionDefinition__StructMemberAssignment_3 : ( ruleStructMember ) ;
    public final void rule__StructOrUnionDefinition__StructMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3373:1: ( ( ruleStructMember ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3374:1: ( ruleStructMember )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3374:1: ( ruleStructMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3375:1: ruleStructMember
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_36872);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3384:1: rule__StructorUnionReference__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructorUnionReference__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3388:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3389:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3389:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3390:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_06903);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3399:1: rule__StructorUnionReference__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__StructorUnionReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3403:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3404:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3404:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3405:1: ruleIdentifier
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__StructorUnionReference__IdAssignment_16934);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3414:1: rule__StructMember__QualTypeAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__StructMember__QualTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3418:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3419:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3419:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3420:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_06965);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3429:1: rule__StructMember__DecAssignment_1 : ( ruleDeclarators ) ;
    public final void rule__StructMember__DecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3433:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3434:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3434:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3435:1: ruleDeclarators
            {
             before(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_16996);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3444:1: rule__EnumDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3448:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3449:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3449:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3450:1: ruleIdentifier
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__EnumDefinition__IdAssignment_17027);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3459:1: rule__EnumDefinition__EnumMemberListAssignment_3 : ( ruleEnumMemberList ) ;
    public final void rule__EnumDefinition__EnumMemberListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3463:1: ( ( ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3464:1: ( ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3464:1: ( ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3465:1: ruleEnumMemberList
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37058);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3474:1: rule__EnumReference__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3478:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3479:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3479:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3480:1: ruleIdentifier
            {
             before(grammarAccess.getEnumReferenceAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__EnumReference__IdAssignment_17089);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3489:1: rule__EnumMemberList__EnumMemberAssignment_1_1 : ( ruleEnumMember ) ;
    public final void rule__EnumMemberList__EnumMemberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3493:1: ( ( ruleEnumMember ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3494:1: ( ruleEnumMember )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3494:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3495:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17120);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3504:1: rule__EnumMember__IdAssignment_0 : ( ruleIdentifier ) ;
    public final void rule__EnumMember__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3508:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3509:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3509:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3510:1: ruleIdentifier
            {
             before(grammarAccess.getEnumMemberAccess().getIdIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__EnumMember__IdAssignment_07151);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3519:1: rule__Declarators__DecAssignment_0 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3523:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3524:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3524:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3525:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07182);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3534:1: rule__Declarators__DeclaratorListAssignment_1_1 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DeclaratorListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3538:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3539:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3539:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3540:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17213);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3549:1: rule__Declarator__TypeQualifierAssignment_0_1 : ( ruleTypeQualifier ) ;
    public final void rule__Declarator__TypeQualifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3553:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3554:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3554:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3555:1: ruleTypeQualifier
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17244);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3564:1: rule__Declarator__DcAssignment_1 : ( ruleDirectDeclarator ) ;
    public final void rule__Declarator__DcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3568:1: ( ( ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3569:1: ( ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3569:1: ( ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3570:1: ruleDirectDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17275);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3579:1: rule__DirectDeclarator__IdAssignment_0_0 : ( ruleIdentifier ) ;
    public final void rule__DirectDeclarator__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3583:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3584:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3584:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3585:1: ruleIdentifier
            {
             before(grammarAccess.getDirectDeclaratorAccess().getIdIdentifierParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__DirectDeclarator__IdAssignment_0_07306);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3594:1: rule__Identifier__IdAssignment : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3598:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3599:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3599:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3600:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment7337); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3609:1: rule__ConstantDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__ConstantDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3613:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3614:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3614:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3615:1: ruleIdentifier
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__ConstantDefinition__IdAssignment_17368);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3624:1: rule__InterfaceDefinition__FqnAssignment_2 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__FqnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3628:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3629:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3629:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3630:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27399);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3639:1: rule__InterfaceDefinition__Fqn2Assignment_3_1 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__Fqn2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3643:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3644:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3644:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3645:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17430);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3654:1: rule__InterfaceDefinition__MethodDefAssignment_5 : ( ruleMethodDefinition ) ;
    public final void rule__InterfaceDefinition__MethodDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3658:1: ( ( ruleMethodDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3659:1: ( ruleMethodDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3659:1: ( ruleMethodDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3660:1: ruleMethodDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57461);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3669:1: rule__MethodDefinition__QualifiedTypeSpecAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__MethodDefinition__QualifiedTypeSpecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3673:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3674:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3674:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3675:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07492);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3684:1: rule__MethodDefinition__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__MethodDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3688:1: ( ( ruleIdentifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3689:1: ( ruleIdentifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3689:1: ( ruleIdentifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3690:1: ruleIdentifier
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__MethodDefinition__IdAssignment_17523);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3699:1: rule__MethodDefinition__ParameterListAssignment_2_1_1 : ( ruleParameterList ) ;
    public final void rule__MethodDefinition__ParameterListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3703:1: ( ( ruleParameterList ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3704:1: ( ruleParameterList )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3704:1: ( ruleParameterList )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3705:1: ruleParameterList
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17554);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3714:1: rule__ParameterList__ParamAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3718:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3719:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3719:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3720:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_07585);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3729:1: rule__ParameterList__ParamsAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3733:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3734:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3734:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3735:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_17616);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3744:1: rule__Parameter__ParameterQualifierAssignment_0 : ( ruleParameterQualifier ) ;
    public final void rule__Parameter__ParameterQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3748:1: ( ( ruleParameterQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3749:1: ( ruleParameterQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3749:1: ( ruleParameterQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3750:1: ruleParameterQualifier
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_07647);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3759:1: rule__Parameter__QualifiedTypeSpecAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__Parameter__QualifiedTypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3763:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3764:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3764:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3765:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_17678);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3774:1: rule__Parameter__DecAssignment_2 : ( ruleDeclarator ) ;
    public final void rule__Parameter__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3778:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3779:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3779:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3780:1: ruleDeclarator
            {
             before(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_27709);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3789:1: rule__IncludeDirective__PathAssignment_1 : ( ruleIncludePath ) ;
    public final void rule__IncludeDirective__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3793:1: ( ( ruleIncludePath ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3794:1: ( ruleIncludePath )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3794:1: ( ruleIncludePath )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3795:1: ruleIncludePath
            {
             before(grammarAccess.getIncludeDirectiveAccess().getPathIncludePathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIncludePath_in_rule__IncludeDirective__PathAssignment_17740);
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


 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group__0_in_ruleStructMember706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__IdAssignment_in_ruleIdentifier1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludePath_in_entryRuleIncludePath1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludePath1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludePath__Alternatives_in_ruleIncludePath1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__TypeAssignment_1_0_in_rule__IdtFile__Alternatives_11948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__ConstantAssignment_1_1_in_rule__IdtFile__Alternatives_11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_02000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2120 = new BitSet(new long[]{0x0000001FFFFE0002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2132 = new BitSet(new long[]{0x0000001FFFFE0002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StructOrUnion__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructOrUnion__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__IncludePath__Alternatives2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IncludePath__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeQualifier__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeQualifier__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeSpecifier__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeSpecifier__Alternatives2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeSpecifier__Alternatives2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeSpecifier__Alternatives2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeSpecifier__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeSpecifier__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeSpecifier__Alternatives2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeSpecifier__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeSpecifier__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeSpecifier__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeSpecifier__Alternatives2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeSpecifier__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeSpecifier__Alternatives2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeSpecifier__Alternatives2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeSpecifier__Alternatives2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeSpecifier__Alternatives2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeSpecifier__Alternatives2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeSpecifier__Alternatives2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeSpecifier__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeSpecifier__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterQualifier__Alternatives2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ParameterQualifier__Alternatives2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__IncludesAssignment_0_in_rule__IdtFile__Group__03029 = new BitSet(new long[]{0x0220110000001802L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__03039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Alternatives_1_in_rule__IdtFile__Group__13067 = new BitSet(new long[]{0x0020110000001802L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03107 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeDefinition__Group__13145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypedefSpecification__Group__03185 = new BitSet(new long[]{0x0000101FFFFF9820L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13223 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03300 = new BitSet(new long[]{0x0000101FFFFF9820L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03376 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13413 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StructOrUnionDefinition__Group__23452 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33490 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructOrUnionDefinition__Group__43529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03649 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__13686 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__23723 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StructMember__Group__33762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StructMember__Group_2__03806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__03816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StructMember__Group_2__13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumDefinition__Group__03882 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__03892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__13920 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__13930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumDefinition__Group__23959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__23969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__33997 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumDefinition__Group__44035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumReference__Group__04081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04157 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14193 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumMemberList__Group_1__04233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04309 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EnumMember__Group_1__04386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04461 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14498 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_rule__Declarators__Group_1__04538 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04614 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Declarator__Group_0__04691 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__04701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__14729 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__04768 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__04777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__14806 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DirectDeclarator__Group_0_1__04846 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__04856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__14884 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__14892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DirectDeclarator__Group_0_1__24921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ArraySpecification__Group__04963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__04973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySpecification__Group__15001 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ArraySpecification__Group__25038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05079 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15115 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FullyQualifiedName__Group_1__05155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ConstantDefinition__Group__05231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__InterfaceDefinition__Group__05308 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__InterfaceDefinition__Group__15348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25388 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35425 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__InterfaceDefinition__Group__45464 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55502 = new BitSet(new long[]{0x0000141FFFFF9820L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InterfaceDefinition__Group__65541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__InterfaceDefinition__Group_3__05591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__15704 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__15713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__25741 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__25750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MethodDefinition__Group__35779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodDefinition__Group_2_0__05823 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__05833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MethodDefinition__Group_2_0__15863 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__15875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodDefinition__Group_2_0__25904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodDefinition__Group_2_1__05946 = new BitSet(new long[]{0x0000107FFFFF9820L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__05956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__15984 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__15993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodDefinition__Group_2_1__26022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06063 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16100 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ParameterList__Group_1__06180 = new BitSet(new long[]{0x0000107FFFFF9820L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ParameterList__Group_2__06257 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ParameterList__Group_2__16296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06335 = new BitSet(new long[]{0x0000107FFFFF9820L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16373 = new BitSet(new long[]{0x0001800000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__IncludeDirective__Group__06451 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__PathAssignment_1_in_rule__IncludeDirective__Group__16489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_rule__IdtFile__IncludesAssignment_06527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__IdtFile__TypeAssignment_1_06558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__IdtFile__ConstantAssignment_1_16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_16624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_26655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_06686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_16717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_06748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_36779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_06810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__StructOrUnionDefinition__IdAssignment_16841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_36872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_06903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__StructorUnionReference__IdAssignment_16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_06965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__EnumDefinition__IdAssignment_17027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__EnumReference__IdAssignment_17089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__EnumMember__IdAssignment_07151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__DirectDeclarator__IdAssignment_0_07306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__IdAssignment7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__ConstantDefinition__IdAssignment_17368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__MethodDefinition__IdAssignment_17523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_07585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_17616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_07647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_17678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_27709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludePath_in_rule__IncludeDirective__PathAssignment_17740 = new BitSet(new long[]{0x0000000000000002L});

}